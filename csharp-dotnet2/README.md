# Org.OpenAPITools - the C# library for the Zulip REST API

Powerful open source group chat


This C# SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- SDK version: 1.0.0
- Build package: org.openapitools.codegen.languages.CSharpDotNet2ClientCodegen
    For more information, please visit [https://zulip.com](https://zulip.com)

<a name="frameworks-supported"></a>
## Frameworks supported
- .NET 2.0

<a name="dependencies"></a>
## Dependencies
- Mono compiler
- Newtonsoft.Json.7.0.1
- RestSharp.Net2.1.1.11

Note: NuGet is downloaded by the mono compilation script and packages are installed with it. No dependency DLLs are bundled with this generator

<a name="installation"></a>
## Installation
Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh compile-mono.sh`
- [Windows] TODO

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;
```
<a name="getting-started"></a>
## Getting Started

```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Example
    {
        public void main()
        {
            

            var apiInstance = new AuthenticationApi();
            var username = iago@zulip.com;  // string | The email address for the user that owns the API key. 

            try
            {
                // Fetch an API key (development only)
                ApiKeyResponse result = apiInstance.DevFetchApiKey(username);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AuthenticationApi.DevFetchApiKey: " + e.Message );
            }
        }
    }
}
```

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://example.zulipchat.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**DevFetchApiKey**](docs/AuthenticationApi.md#devfetchapikey) | **POST** /dev_fetch_api_key | Fetch an API key (development only)
*AuthenticationApi* | [**FetchApiKey**](docs/AuthenticationApi.md#fetchapikey) | **POST** /fetch_api_key | Fetch an API key (production)
*DraftsApi* | [**CreateDrafts**](docs/DraftsApi.md#createdrafts) | **POST** /drafts | Create drafts
*DraftsApi* | [**DeleteDraft**](docs/DraftsApi.md#deletedraft) | **DELETE** /drafts/{draft_id} | Delete a draft
*DraftsApi* | [**EditDraft**](docs/DraftsApi.md#editdraft) | **PATCH** /drafts/{draft_id} | Edit a draft
*DraftsApi* | [**GetDrafts**](docs/DraftsApi.md#getdrafts) | **GET** /drafts | Get drafts
*MessagesApi* | [**AddReaction**](docs/MessagesApi.md#addreaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
*MessagesApi* | [**CheckMessagesMatchNarrow**](docs/MessagesApi.md#checkmessagesmatchnarrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
*MessagesApi* | [**DeleteMessage**](docs/MessagesApi.md#deletemessage) | **DELETE** /messages/{message_id} | Delete a message
*MessagesApi* | [**GetFileTemporaryUrl**](docs/MessagesApi.md#getfiletemporaryurl) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
*MessagesApi* | [**GetMessageHistory**](docs/MessagesApi.md#getmessagehistory) | **GET** /messages/{message_id}/history | Get a message's edit history
*MessagesApi* | [**GetMessages**](docs/MessagesApi.md#getmessages) | **GET** /messages | Get messages
*MessagesApi* | [**GetRawMessage**](docs/MessagesApi.md#getrawmessage) | **GET** /messages/{message_id} | Get a message's raw Markdown
*MessagesApi* | [**MarkAllAsRead**](docs/MessagesApi.md#markallasread) | **POST** /mark_all_as_read | Mark all messages as read
*MessagesApi* | [**MarkStreamAsRead**](docs/MessagesApi.md#markstreamasread) | **POST** /mark_stream_as_read | Mark messages in a stream as read
*MessagesApi* | [**MarkTopicAsRead**](docs/MessagesApi.md#marktopicasread) | **POST** /mark_topic_as_read | Mark messages in a topic as read
*MessagesApi* | [**RemoveReaction**](docs/MessagesApi.md#removereaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
*MessagesApi* | [**RenderMessage**](docs/MessagesApi.md#rendermessage) | **POST** /messages/render | Render message
*MessagesApi* | [**SendMessage**](docs/MessagesApi.md#sendmessage) | **POST** /messages | Send a message
*MessagesApi* | [**UpdateMessage**](docs/MessagesApi.md#updatemessage) | **PATCH** /messages/{message_id} | Edit a message
*MessagesApi* | [**UpdateMessageFlags**](docs/MessagesApi.md#updatemessageflags) | **POST** /messages/flags | Update personal message flags
*MessagesApi* | [**UploadFile**](docs/MessagesApi.md#uploadfile) | **POST** /user_uploads | Upload a file
*RealTimeEventsApi* | [**DeleteQueue**](docs/RealTimeEventsApi.md#deletequeue) | **DELETE** /events | Delete an event queue
*RealTimeEventsApi* | [**GetEvents**](docs/RealTimeEventsApi.md#getevents) | **GET** /events | Get events from an event queue
*RealTimeEventsApi* | [**RealTimePost**](docs/RealTimeEventsApi.md#realtimepost) | **POST** /real-time | 
*RealTimeEventsApi* | [**RegisterQueue**](docs/RealTimeEventsApi.md#registerqueue) | **POST** /register | Register an event queue
*RealTimeEventsApi* | [**RestErrorHandling**](docs/RealTimeEventsApi.md#resterrorhandling) | **POST** /rest-error-handling | Error handling
*ServerAndOrganizationsApi* | [**AddCodePlayground**](docs/ServerAndOrganizationsApi.md#addcodeplayground) | **POST** /realm/playgrounds | Add a code playground
*ServerAndOrganizationsApi* | [**AddLinkifier**](docs/ServerAndOrganizationsApi.md#addlinkifier) | **POST** /realm/filters | Add a linkifier
*ServerAndOrganizationsApi* | [**CreateCustomProfileField**](docs/ServerAndOrganizationsApi.md#createcustomprofilefield) | **POST** /realm/profile_fields | Create a custom profile field
*ServerAndOrganizationsApi* | [**GetCustomEmoji**](docs/ServerAndOrganizationsApi.md#getcustomemoji) | **GET** /realm/emoji | Get all custom emoji
*ServerAndOrganizationsApi* | [**GetCustomProfileFields**](docs/ServerAndOrganizationsApi.md#getcustomprofilefields) | **GET** /realm/profile_fields | Get all custom profile fields
*ServerAndOrganizationsApi* | [**GetLinkifiers**](docs/ServerAndOrganizationsApi.md#getlinkifiers) | **GET** /realm/linkifiers | Get linkifiers
*ServerAndOrganizationsApi* | [**GetServerSettings**](docs/ServerAndOrganizationsApi.md#getserversettings) | **GET** /server_settings | Get server settings
*ServerAndOrganizationsApi* | [**RemoveCodePlayground**](docs/ServerAndOrganizationsApi.md#removecodeplayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
*ServerAndOrganizationsApi* | [**RemoveLinkifier**](docs/ServerAndOrganizationsApi.md#removelinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
*ServerAndOrganizationsApi* | [**ReorderCustomProfileFields**](docs/ServerAndOrganizationsApi.md#reordercustomprofilefields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
*ServerAndOrganizationsApi* | [**UpdateLinkifier**](docs/ServerAndOrganizationsApi.md#updatelinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
*ServerAndOrganizationsApi* | [**UploadCustomEmoji**](docs/ServerAndOrganizationsApi.md#uploadcustomemoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji
*StreamsApi* | [**ArchiveStream**](docs/StreamsApi.md#archivestream) | **DELETE** /streams/{stream_id} | Archive a stream
*StreamsApi* | [**CreateBigBlueButtonVideoCall**](docs/StreamsApi.md#createbigbluebuttonvideocall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
*StreamsApi* | [**DeleteTopic**](docs/StreamsApi.md#deletetopic) | **POST** /streams/{stream_id}/delete_topic | Delete a topic
*StreamsApi* | [**GetStreamId**](docs/StreamsApi.md#getstreamid) | **GET** /get_stream_id | Get stream ID
*StreamsApi* | [**GetStreamTopics**](docs/StreamsApi.md#getstreamtopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
*StreamsApi* | [**GetStreams**](docs/StreamsApi.md#getstreams) | **GET** /streams | Get all streams
*StreamsApi* | [**GetSubscribers**](docs/StreamsApi.md#getsubscribers) | **GET** /streams/{stream_id}/members | Get the subscribers of a stream
*StreamsApi* | [**GetSubscriptionStatus**](docs/StreamsApi.md#getsubscriptionstatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
*StreamsApi* | [**GetSubscriptions**](docs/StreamsApi.md#getsubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
*StreamsApi* | [**MuteTopic**](docs/StreamsApi.md#mutetopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
*StreamsApi* | [**Subscribe**](docs/StreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
*StreamsApi* | [**Unsubscribe**](docs/StreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
*StreamsApi* | [**UpdateStream**](docs/StreamsApi.md#updatestream) | **PATCH** /streams/{stream_id} | Update a stream
*StreamsApi* | [**UpdateSubscriptionSettings**](docs/StreamsApi.md#updatesubscriptionsettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
*StreamsApi* | [**UpdateSubscriptions**](docs/StreamsApi.md#updatesubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions
*UsersApi* | [**CreateUser**](docs/UsersApi.md#createuser) | **POST** /users | Create a user
*UsersApi* | [**CreateUserGroup**](docs/UsersApi.md#createusergroup) | **POST** /user_groups/create | Create a user group
*UsersApi* | [**DeactivateOwnUser**](docs/UsersApi.md#deactivateownuser) | **DELETE** /users/me | Deactivate own user
*UsersApi* | [**DeactivateUser**](docs/UsersApi.md#deactivateuser) | **DELETE** /users/{user_id} | Deactivate a user
*UsersApi* | [**GetAttachments**](docs/UsersApi.md#getattachments) | **GET** /attachments | Get attachments
*UsersApi* | [**GetOwnUser**](docs/UsersApi.md#getownuser) | **GET** /users/me | Get own user
*UsersApi* | [**GetUser**](docs/UsersApi.md#getuser) | **GET** /users/{user_id} | Get a user
*UsersApi* | [**GetUserByEmail**](docs/UsersApi.md#getuserbyemail) | **GET** /users/{email} | Get a user by email
*UsersApi* | [**GetUserGroups**](docs/UsersApi.md#getusergroups) | **GET** /user_groups | Get user groups
*UsersApi* | [**GetUserPresence**](docs/UsersApi.md#getuserpresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
*UsersApi* | [**GetUsers**](docs/UsersApi.md#getusers) | **GET** /users | Get all users
*UsersApi* | [**MuteUser**](docs/UsersApi.md#muteuser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
*UsersApi* | [**ReactivateUser**](docs/UsersApi.md#reactivateuser) | **POST** /users/{user_id}/reactivate | Reactivate a user
*UsersApi* | [**RemoveUserGroup**](docs/UsersApi.md#removeusergroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
*UsersApi* | [**SetTypingStatus**](docs/UsersApi.md#settypingstatus) | **POST** /typing | Set \"typing\" status
*UsersApi* | [**UnmuteUser**](docs/UsersApi.md#unmuteuser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
*UsersApi* | [**UpdateSettings**](docs/UsersApi.md#updatesettings) | **PATCH** /settings | Update settings
*UsersApi* | [**UpdateStatus**](docs/UsersApi.md#updatestatus) | **POST** /users/me/status | Update your status
*UsersApi* | [**UpdateUser**](docs/UsersApi.md#updateuser) | **PATCH** /users/{user_id} | Update a user
*UsersApi* | [**UpdateUserGroup**](docs/UsersApi.md#updateusergroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
*UsersApi* | [**UpdateUserGroupMembers**](docs/UsersApi.md#updateusergroupmembers) | **POST** /user_groups/{user_group_id}/members | Update user group members
*WebhooksApi* | [**ZulipOutgoingWebhooks**](docs/WebhooksApi.md#zulipoutgoingwebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Org.OpenAPITools.Model.AddSubscriptionsResponse](docs/AddSubscriptionsResponse.md)
 - [Org.OpenAPITools.Model.AddSubscriptionsResponseAllOf](docs/AddSubscriptionsResponseAllOf.md)
 - [Org.OpenAPITools.Model.ApiKeyResponse](docs/ApiKeyResponse.md)
 - [Org.OpenAPITools.Model.ApiKeyResponseAllOf](docs/ApiKeyResponseAllOf.md)
 - [Org.OpenAPITools.Model.Attachments](docs/Attachments.md)
 - [Org.OpenAPITools.Model.AttachmentsMessages](docs/AttachmentsMessages.md)
 - [Org.OpenAPITools.Model.BadEventQueueIdError](docs/BadEventQueueIdError.md)
 - [Org.OpenAPITools.Model.BadEventQueueIdErrorAllOf](docs/BadEventQueueIdErrorAllOf.md)
 - [Org.OpenAPITools.Model.BasicBot](docs/BasicBot.md)
 - [Org.OpenAPITools.Model.BasicBotAllOf](docs/BasicBotAllOf.md)
 - [Org.OpenAPITools.Model.BasicBotBase](docs/BasicBotBase.md)
 - [Org.OpenAPITools.Model.BasicStream](docs/BasicStream.md)
 - [Org.OpenAPITools.Model.BasicStreamAllOf](docs/BasicStreamAllOf.md)
 - [Org.OpenAPITools.Model.BasicStreamBase](docs/BasicStreamBase.md)
 - [Org.OpenAPITools.Model.Bot](docs/Bot.md)
 - [Org.OpenAPITools.Model.BotAllOf](docs/BotAllOf.md)
 - [Org.OpenAPITools.Model.CodedError](docs/CodedError.md)
 - [Org.OpenAPITools.Model.CodedErrorAllOf](docs/CodedErrorAllOf.md)
 - [Org.OpenAPITools.Model.CodedErrorBase](docs/CodedErrorBase.md)
 - [Org.OpenAPITools.Model.CodedErrorBaseAllOf](docs/CodedErrorBaseAllOf.md)
 - [Org.OpenAPITools.Model.CustomProfileField](docs/CustomProfileField.md)
 - [Org.OpenAPITools.Model.DefaultStreamGroup](docs/DefaultStreamGroup.md)
 - [Org.OpenAPITools.Model.Draft](docs/Draft.md)
 - [Org.OpenAPITools.Model.EmojiBase](docs/EmojiBase.md)
 - [Org.OpenAPITools.Model.EmojiReaction](docs/EmojiReaction.md)
 - [Org.OpenAPITools.Model.EmojiReactionAllOf](docs/EmojiReactionAllOf.md)
 - [Org.OpenAPITools.Model.EmojiReactionBase](docs/EmojiReactionBase.md)
 - [Org.OpenAPITools.Model.EmojiReactionBaseAllOf](docs/EmojiReactionBaseAllOf.md)
 - [Org.OpenAPITools.Model.EmojiReactionBaseAllOfUser](docs/EmojiReactionBaseAllOfUser.md)
 - [Org.OpenAPITools.Model.GetMessages](docs/GetMessages.md)
 - [Org.OpenAPITools.Model.GetMessagesAllOf](docs/GetMessagesAllOf.md)
 - [Org.OpenAPITools.Model.Hotspot](docs/Hotspot.md)
 - [Org.OpenAPITools.Model.InlineResponse200](docs/InlineResponse200.md)
 - [Org.OpenAPITools.Model.InvalidApiKeyError](docs/InvalidApiKeyError.md)
 - [Org.OpenAPITools.Model.InvalidMessageError](docs/InvalidMessageError.md)
 - [Org.OpenAPITools.Model.InvalidMessageErrorAllOf](docs/InvalidMessageErrorAllOf.md)
 - [Org.OpenAPITools.Model.JsonError](docs/JsonError.md)
 - [Org.OpenAPITools.Model.JsonErrorBase](docs/JsonErrorBase.md)
 - [Org.OpenAPITools.Model.JsonErrorBaseAllOf](docs/JsonErrorBaseAllOf.md)
 - [Org.OpenAPITools.Model.JsonResponseBase](docs/JsonResponseBase.md)
 - [Org.OpenAPITools.Model.JsonSuccess](docs/JsonSuccess.md)
 - [Org.OpenAPITools.Model.JsonSuccessAllOf](docs/JsonSuccessAllOf.md)
 - [Org.OpenAPITools.Model.JsonSuccessBase](docs/JsonSuccessBase.md)
 - [Org.OpenAPITools.Model.JsonSuccessBaseAllOf](docs/JsonSuccessBaseAllOf.md)
 - [Org.OpenAPITools.Model.Messages](docs/Messages.md)
 - [Org.OpenAPITools.Model.MessagesAllOf](docs/MessagesAllOf.md)
 - [Org.OpenAPITools.Model.MessagesBase](docs/MessagesBase.md)
 - [Org.OpenAPITools.Model.MessagesBaseTopicLinks](docs/MessagesBaseTopicLinks.md)
 - [Org.OpenAPITools.Model.MissingArgumentError](docs/MissingArgumentError.md)
 - [Org.OpenAPITools.Model.MissingArgumentErrorAllOf](docs/MissingArgumentErrorAllOf.md)
 - [Org.OpenAPITools.Model.NonExistingStreamError](docs/NonExistingStreamError.md)
 - [Org.OpenAPITools.Model.NonExistingStreamErrorAllOf](docs/NonExistingStreamErrorAllOf.md)
 - [Org.OpenAPITools.Model.Presence](docs/Presence.md)
 - [Org.OpenAPITools.Model.RateLimitedError](docs/RateLimitedError.md)
 - [Org.OpenAPITools.Model.RealmDeactivatedError](docs/RealmDeactivatedError.md)
 - [Org.OpenAPITools.Model.RealmDomain](docs/RealmDomain.md)
 - [Org.OpenAPITools.Model.RealmEmoji](docs/RealmEmoji.md)
 - [Org.OpenAPITools.Model.RealmExport](docs/RealmExport.md)
 - [Org.OpenAPITools.Model.RealmPlayground](docs/RealmPlayground.md)
 - [Org.OpenAPITools.Model.Subscriptions](docs/Subscriptions.md)
 - [Org.OpenAPITools.Model.User](docs/User.md)
 - [Org.OpenAPITools.Model.UserAllOf](docs/UserAllOf.md)
 - [Org.OpenAPITools.Model.UserBase](docs/UserBase.md)
 - [Org.OpenAPITools.Model.UserDeactivatedError](docs/UserDeactivatedError.md)
 - [Org.OpenAPITools.Model.UserGroup](docs/UserGroup.md)
 - [Org.OpenAPITools.Model.UserNotAuthorizedError](docs/UserNotAuthorizedError.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

Authentication schemes defined for the API:
<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

