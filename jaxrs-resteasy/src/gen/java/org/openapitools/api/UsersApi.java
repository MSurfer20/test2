package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UsersApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.NonExistingStreamError;
import org.openapitools.model.OneOfobjectobject;
import org.openapitools.model.OneOfobjectobjectobject;
import org.openapitools.model.OneOfobjectobjectobjectobjectobjectobject;
import org.openapitools.model.OneOfstringinteger;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/users")


@io.swagger.annotations.Api(description = "the users API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T21:12:13.402057Z[Etc/UTC]")
public class UsersApi  {

    @Inject UsersApiService service;

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a user", notes = "{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public Response createUser( @NotNull  @QueryParam("email") String email, @NotNull  @QueryParam("password") String password, @NotNull  @QueryParam("full_name") String fullName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createUser(email,password,fullName,securityContext);
    }
    @DELETE
    @Path("/me")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Deactivate own user", notes = "Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public Response deactivateOwnUser(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deactivateOwnUser(securityContext);
    }
    @DELETE
    @Path("/{user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Deactivate a user", notes = "[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request", response = JsonError.class) })
    public Response deactivateUser( @PathParam("user_id") Integer userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deactivateUser(userId,securityContext);
    }
    @GET
    @Path("/me")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get own user", notes = "Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = JsonSuccessBase.class) })
    public Response getOwnUser(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOwnUser(securityContext);
    }
    @GET
    @Path("/me/{stream_id}/topics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get topics in a stream", notes = "Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public Response getStreamTopics( @PathParam("stream_id") Integer streamId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getStreamTopics(streamId,securityContext);
    }
    @GET
    @Path("/{user_id}/subscriptions/{stream_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get subscription status", notes = "Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = JsonSuccessBase.class) })
    public Response getSubscriptionStatus( @PathParam("user_id") Integer userId, @PathParam("stream_id") Integer streamId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSubscriptionStatus(userId,streamId,securityContext);
    }
    @GET
    @Path("/me/subscriptions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get subscribed streams", notes = "Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getSubscriptions(  @DefaultValue("false") @QueryParam("include_subscribers") Boolean includeSubscribers,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSubscriptions(includeSubscribers,securityContext);
    }
    @GET
    @Path("/{user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a user", notes = "Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getUser( @PathParam("user_id") Integer userId,  @DefaultValue("false") @QueryParam("client_gravatar") Boolean clientGravatar,  @DefaultValue("false") @QueryParam("include_custom_profile_fields") Boolean includeCustomProfileFields,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUser(userId,clientGravatar,includeCustomProfileFields,securityContext);
    }
    @GET
    @Path("/{email}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a user by email", notes = "Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getUserByEmail( @PathParam("email") String email,  @DefaultValue("false") @QueryParam("client_gravatar") Boolean clientGravatar,  @DefaultValue("false") @QueryParam("include_custom_profile_fields") Boolean includeCustomProfileFields,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserByEmail(email,clientGravatar,includeCustomProfileFields,securityContext);
    }
    @GET
    @Path("/{user_id_or_email}/presence")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user presence", notes = "Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getUserPresence( @PathParam("user_id_or_email") String userIdOrEmail,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserPresence(userIdOrEmail,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all users", notes = "Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getUsers(  @DefaultValue("false") @QueryParam("client_gravatar") Boolean clientGravatar,  @DefaultValue("false") @QueryParam("include_custom_profile_fields") Boolean includeCustomProfileFields,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUsers(clientGravatar,includeCustomProfileFields,securityContext);
    }
    @PATCH
    @Path("/me/subscriptions/muted_topics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Topic muting", notes = "This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` ", response = JsonSuccess.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class) })
    public Response muteTopic( @NotNull  @QueryParam("topic") String topic, @NotNull , allowableValues="add, remove" @QueryParam("op") String op,  @QueryParam("stream") String stream,  @QueryParam("stream_id") Integer streamId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.muteTopic(topic,op,stream,streamId,securityContext);
    }
    @POST
    @Path("/me/muted_users/{muted_user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Mute a user", notes = "This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobjectobject.class) })
    public Response muteUser( @PathParam("muted_user_id") Integer mutedUserId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.muteUser(mutedUserId,securityContext);
    }
    @POST
    @Path("/{user_id}/reactivate")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Reactivate a user", notes = "[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` ", response = Object.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Object.class) })
    public Response reactivateUser( @PathParam("user_id") Integer userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.reactivateUser(userId,securityContext);
    }
    @POST
    @Path("/me/subscriptions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Subscribe to a stream", notes = "Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. ", response = OneOfobjectobject.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = OneOfobjectobject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Success.", response = OneOfobjectobject.class) })
    public Response subscribe( @NotNull  @QueryParam("subscriptions") List<Object> subscriptions,  @QueryParam("principals") List<OneOfstringinteger> principals,  @DefaultValue("true") @QueryParam("authorization_errors_fatal") Boolean authorizationErrorsFatal,  @DefaultValue("false") @QueryParam("announce") Boolean announce,  @DefaultValue("false") @QueryParam("invite_only") Boolean inviteOnly,  @QueryParam("history_public_to_subscribers") Boolean historyPublicToSubscribers,  @DefaultValue("1") @QueryParam("stream_post_policy") Integer streamPostPolicy,  @QueryParam("message_retention_days") OneOfstringinteger messageRetentionDays,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.subscribe(subscriptions,principals,authorizationErrorsFatal,announce,inviteOnly,historyPublicToSubscribers,streamPostPolicy,messageRetentionDays,securityContext);
    }
    @DELETE
    @Path("/me/muted_users/{muted_user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Unmute a user", notes = "This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class) })
    public Response unmuteUser( @PathParam("muted_user_id") Integer mutedUserId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.unmuteUser(mutedUserId,securityContext);
    }
    @DELETE
    @Path("/me/subscriptions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Unsubscribe from a stream", notes = "Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = NonExistingStreamError.class) })
    public Response unsubscribe( @NotNull  @QueryParam("subscriptions") List<String> subscriptions,  @QueryParam("principals") List<OneOfstringinteger> principals,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.unsubscribe(subscriptions,principals,securityContext);
    }
    @POST
    @Path("/me/status")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update your status", notes = "Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Success.", response = OneOfobjectobjectobjectobjectobjectobject.class) })
    public Response updateStatus(  @QueryParam("status_text") String statusText,  @QueryParam("away") Boolean away,  @QueryParam("emoji_name") String emojiName,  @QueryParam("emoji_code") String emojiCode,  @QueryParam("reaction_type") String reactionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateStatus(statusText,away,emojiName,emojiCode,reactionType,securityContext);
    }
    @POST
    @Path("/me/subscriptions/properties")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update subscription settings", notes = "This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response updateSubscriptionSettings( @NotNull  @QueryParam("subscription_data") List<Object> subscriptionData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateSubscriptionSettings(subscriptionData,securityContext);
    }
    @PATCH
    @Path("/me/subscriptions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update subscriptions", notes = "Update which streams you are are subscribed to. ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response updateSubscriptions(  @QueryParam("delete") List<String> delete,  @QueryParam("add") List<Object> add,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateSubscriptions(delete,add,securityContext);
    }
    @PATCH
    @Path("/{user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a user", notes = "Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public Response updateUser( @PathParam("user_id") Integer userId,  @QueryParam("full_name") String fullName,  @QueryParam("role") Integer role,  @QueryParam("profile_data") List<Object> profileData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateUser(userId,fullName,role,profileData,securityContext);
    }
}
