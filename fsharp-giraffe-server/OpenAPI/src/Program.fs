namespace OpenAPI

open System
open System.Net.Http
open System.Security.Claims
open System.Threading
open Microsoft.AspNetCore
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.Http
open Microsoft.AspNetCore.Http.Features
open Microsoft.AspNetCore.Authentication
open Microsoft.AspNetCore.Authentication.Cookies
open Microsoft.Extensions.Configuration
open Microsoft.Extensions.Logging
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open System.Diagnostics
open Giraffe.GiraffeViewEngine
open AspNet.Security.ApiKey.Providers

open AuthenticationApiHandlerParams
open MessagesApiHandlerParams
open RealTimeEventsApiHandlerParams
open ServerAndOrganizationsApiHandlerParams
open StreamsApiHandlerParams
open UsersApiHandlerParams
open WebhooksApiHandlerParams
open Giraffe

module App =

  // ---------------------------------
  // Error handler
  // ---------------------------------

  let errorHandler (ex : Exception) (logger : ILogger) =
    logger.LogError(EventId(), ex, "An unhandled exception has occurred while executing the request.")
    clearResponse >=> setStatusCode 500 >=> text ex.Message

  // ---------------------------------
  // Web app
  // ---------------------------------

  let HttpGet = GET
  let HttpPost = POST
  let HttpPut = PUT
  let HttpDelete = DELETE

  let authFailure : HttpHandler = 
    setStatusCode 401 >=> text "You must be authenticated to access this resource."

  let webApp =
    choose (CustomHandlers.handlers @ [
      HttpPost >=> route "/api/v1/dev_fetch_api_key" >=>  AuthenticationApiHandler.DevFetchApiKey;
      HttpPost >=> route "/api/v1/fetch_api_key" >=>  AuthenticationApiHandler.FetchApiKey;
      HttpPost >=> routeBind<AddReactionPathParams> "/api/v1/messages/{message_id}/reactions"  (fun x ->  MessagesApiHandler.AddReaction x);
      HttpGet >=> route "/api/v1/messages/matches_narrow" >=>  MessagesApiHandler.CheckMessagesMatchNarrow;
      HttpDelete >=> routeBind<DeleteMessagePathParams> "/api/v1/messages/{message_id}"  (fun x ->  MessagesApiHandler.DeleteMessage x);
      HttpGet >=> routeBind<GetFileTemporaryUrlPathParams> "/api/v1/user_uploads/{realm_id_str}/{filename}"  (fun x -> (fun x ->  MessagesApiHandler.GetFileTemporaryUrl x) x);
      HttpGet >=> routeBind<GetMessageHistoryPathParams> "/api/v1/messages/{message_id}/history"  (fun x ->  MessagesApiHandler.GetMessageHistory x);
      HttpGet >=> route "/api/v1/messages" >=>  MessagesApiHandler.GetMessages;
      HttpGet >=> routeBind<GetRawMessagePathParams> "/api/v1/messages/{message_id}"  (fun x ->  MessagesApiHandler.GetRawMessage x);
      HttpPost >=> route "/api/v1/mark_all_as_read" >=>  MessagesApiHandler.MarkAllAsRead;
      HttpPost >=> route "/api/v1/mark_stream_as_read" >=>  MessagesApiHandler.MarkStreamAsRead;
      HttpPost >=> route "/api/v1/mark_topic_as_read" >=>  MessagesApiHandler.MarkTopicAsRead;
      HttpDelete >=> routeBind<RemoveReactionPathParams> "/api/v1/messages/{message_id}/reactions"  (fun x ->  MessagesApiHandler.RemoveReaction x);
      HttpPost >=> route "/api/v1/messages/render" >=>  MessagesApiHandler.RenderMessage;
      HttpPost >=> route "/api/v1/messages" >=>  MessagesApiHandler.SendMessage;
      HttpPatch >=> routeBind<UpdateMessagePathParams> "/api/v1/messages/{message_id}"  (fun x ->  MessagesApiHandler.UpdateMessage x);
      HttpPost >=> route "/api/v1/messages/flags" >=>  MessagesApiHandler.UpdateMessageFlags;
      HttpPost >=> route "/api/v1/user_uploads" >=>  MessagesApiHandler.UploadFile;
      HttpDelete >=> route "/api/v1/events" >=>  RealTimeEventsApiHandler.DeleteQueue;
      HttpGet >=> route "/api/v1/events" >=>  RealTimeEventsApiHandler.GetEvents;
      HttpPost >=> route "/api/v1/real-time" >=>  RealTimeEventsApiHandler.RealTimePost;
      HttpPost >=> route "/api/v1/register" >=>  RealTimeEventsApiHandler.RegisterQueue;
      HttpPost >=> route "/api/v1/rest-error-handling" >=>  RealTimeEventsApiHandler.RestErrorHandling;
      HttpPost >=> route "/api/v1/realm/playgrounds" >=>  ServerAndOrganizationsApiHandler.AddCodePlayground;
      HttpPost >=> route "/api/v1/realm/filters" >=>  ServerAndOrganizationsApiHandler.AddLinkifier;
      HttpPost >=> route "/api/v1/realm/profile_fields" >=>  ServerAndOrganizationsApiHandler.CreateCustomProfileField;
      HttpGet >=> route "/api/v1/realm/emoji" >=>  ServerAndOrganizationsApiHandler.GetCustomEmoji;
      HttpGet >=> route "/api/v1/realm/profile_fields" >=>  ServerAndOrganizationsApiHandler.GetCustomProfileFields;
      HttpGet >=> route "/api/v1/realm/linkifiers" >=>  ServerAndOrganizationsApiHandler.GetLinkifiers;
      HttpGet >=> route "/api/v1/server_settings" >=>  ServerAndOrganizationsApiHandler.GetServerSettings;
      HttpDelete >=> routeBind<RemoveCodePlaygroundPathParams> "/api/v1/realm/playgrounds/{playground_id}"  (fun x ->  ServerAndOrganizationsApiHandler.RemoveCodePlayground x);
      HttpDelete >=> routeBind<RemoveLinkifierPathParams> "/api/v1/realm/filters/{filter_id}"  (fun x ->  ServerAndOrganizationsApiHandler.RemoveLinkifier x);
      HttpPatch >=> route "/api/v1/realm/profile_fields" >=>  ServerAndOrganizationsApiHandler.ReorderCustomProfileFields;
      HttpPatch >=> routeBind<UpdateLinkifierPathParams> "/api/v1/realm/filters/{filter_id}"  (fun x ->  ServerAndOrganizationsApiHandler.UpdateLinkifier x);
      HttpPost >=> routeBind<UploadCustomEmojiPathParams> "/api/v1/realm/emoji/{emoji_name}"  (fun x ->  ServerAndOrganizationsApiHandler.UploadCustomEmoji x);
      HttpDelete >=> routeBind<ArchiveStreamPathParams> "/api/v1/streams/{stream_id}"  (fun x ->  StreamsApiHandler.ArchiveStream x);
      HttpGet >=> route "/api/v1/calls/bigbluebutton/create" >=>  StreamsApiHandler.CreateBigBlueButtonVideoCall;
      HttpGet >=> route "/api/v1/get_stream_id" >=>  StreamsApiHandler.GetStreamId;
      HttpGet >=> routeBind<GetStreamTopicsPathParams> "/api/v1/users/me/{stream_id}/topics"  (fun x ->  StreamsApiHandler.GetStreamTopics x);
      HttpGet >=> route "/api/v1/streams" >=>  StreamsApiHandler.GetStreams;
      HttpGet >=> routeBind<GetSubscriptionStatusPathParams> "/api/v1/users/{user_id}/subscriptions/{stream_id}"  (fun x -> (fun x ->  StreamsApiHandler.GetSubscriptionStatus x) x);
      HttpGet >=> route "/api/v1/users/me/subscriptions" >=>  StreamsApiHandler.GetSubscriptions;
      HttpPatch >=> route "/api/v1/users/me/subscriptions/muted_topics" >=>  StreamsApiHandler.MuteTopic;
      HttpPost >=> route "/api/v1/users/me/subscriptions" >=>  StreamsApiHandler.Subscribe;
      HttpDelete >=> route "/api/v1/users/me/subscriptions" >=>  StreamsApiHandler.Unsubscribe;
      HttpPatch >=> routeBind<UpdateStreamPathParams> "/api/v1/streams/{stream_id}"  (fun x ->  StreamsApiHandler.UpdateStream x);
      HttpPost >=> route "/api/v1/users/me/subscriptions/properties" >=>  StreamsApiHandler.UpdateSubscriptionSettings;
      HttpPatch >=> route "/api/v1/users/me/subscriptions" >=>  StreamsApiHandler.UpdateSubscriptions;
      HttpPost >=> route "/api/v1/users" >=>  UsersApiHandler.CreateUser;
      HttpPost >=> route "/api/v1/user_groups/create" >=>  UsersApiHandler.CreateUserGroup;
      HttpDelete >=> route "/api/v1/users/me" >=>  UsersApiHandler.DeactivateOwnUser;
      HttpDelete >=> routeBind<DeactivateUserPathParams> "/api/v1/users/{user_id}"  (fun x ->  UsersApiHandler.DeactivateUser x);
      HttpGet >=> route "/api/v1/attachments" >=>  UsersApiHandler.GetAttachments;
      HttpGet >=> route "/api/v1/users/me" >=>  UsersApiHandler.GetOwnUser;
      HttpGet >=> routeBind<GetUserPathParams> "/api/v1/users/{user_id}"  (fun x ->  UsersApiHandler.GetUser x);
      HttpGet >=> routeBind<GetUserByEmailPathParams> "/api/v1/users/{email}"  (fun x ->  UsersApiHandler.GetUserByEmail x);
      HttpGet >=> route "/api/v1/user_groups" >=>  UsersApiHandler.GetUserGroups;
      HttpGet >=> routeBind<GetUserPresencePathParams> "/api/v1/users/{user_id_or_email}/presence"  (fun x ->  UsersApiHandler.GetUserPresence x);
      HttpGet >=> route "/api/v1/users" >=>  UsersApiHandler.GetUsers;
      HttpPost >=> routeBind<MuteUserPathParams> "/api/v1/users/me/muted_users/{muted_user_id}"  (fun x ->  UsersApiHandler.MuteUser x);
      HttpPost >=> routeBind<ReactivateUserPathParams> "/api/v1/users/{user_id}/reactivate"  (fun x ->  UsersApiHandler.ReactivateUser x);
      HttpDelete >=> routeBind<RemoveUserGroupPathParams> "/api/v1/user_groups/{user_group_id}"  (fun x ->  UsersApiHandler.RemoveUserGroup x);
      HttpPost >=> route "/api/v1/typing" >=>  UsersApiHandler.SetTypingStatus;
      HttpDelete >=> routeBind<UnmuteUserPathParams> "/api/v1/users/me/muted_users/{muted_user_id}"  (fun x ->  UsersApiHandler.UnmuteUser x);
      HttpPatch >=> route "/api/v1/settings/display" >=>  UsersApiHandler.UpdateDisplaySettings;
      HttpPatch >=> route "/api/v1/settings/notifications" >=>  UsersApiHandler.UpdateNotificationSettings;
      HttpPatch >=> routeBind<UpdateUserPathParams> "/api/v1/users/{user_id}"  (fun x ->  UsersApiHandler.UpdateUser x);
      HttpPatch >=> routeBind<UpdateUserGroupPathParams> "/api/v1/user_groups/{user_group_id}"  (fun x ->  UsersApiHandler.UpdateUserGroup x);
      HttpPost >=> routeBind<UpdateUserGroupMembersPathParams> "/api/v1/user_groups/{user_group_id}/members"  (fun x ->  UsersApiHandler.UpdateUserGroupMembers x);
      HttpPost >=> route "/api/v1/zulip-outgoing-webhook" >=>  WebhooksApiHandler.ZulipOutgoingWebhooks;
      RequestErrors.notFound (text "Not Found") 
    ])
  // ---------------------------------
  // Main
  // ---------------------------------

  let configureApp (app : IApplicationBuilder) =
    app.UseGiraffeErrorHandler(errorHandler)
      .UseStaticFiles()
      .UseAuthentication()
      .UseResponseCaching() |> ignore
    CustomHandlers.configureApp app |> ignore
    app.UseGiraffe webApp |> ignore
    

  let configureServices (services : IServiceCollection) =
    services
          .AddResponseCaching()
          .AddGiraffe()
          |> AuthSchemes.configureServices      
          |> CustomHandlers.configureServices services
          |> ignore
    services.AddDataProtection() |> ignore

  let configureLogging (loggerBuilder : ILoggingBuilder) =
    loggerBuilder.AddFilter(fun lvl -> lvl.Equals LogLevel.Error)
                  .AddConsole()
                  .AddDebug() |> ignore

  [<EntryPoint>]
  let main _ =
    let builder = WebHost.CreateDefaultBuilder()
                    .Configure(Action<IApplicationBuilder> configureApp)
                    .ConfigureServices(configureServices)
                    .ConfigureLogging(configureLogging)
                    |> CustomHandlers.configureWebHost
    builder.Build()
            .Run()
    0