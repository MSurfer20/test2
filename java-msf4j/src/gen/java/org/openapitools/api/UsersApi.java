package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UsersApiService;
import org.openapitools.api.factories.UsersApiServiceFactory;

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

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/users")


@io.swagger.annotations.Api(description = "the users API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-10T11:44:15.430476Z[Etc/UTC]")
public class UsersApi  {
   private final UsersApiService delegate = UsersApiServiceFactory.getUsersApi();

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a user", notes = "{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonSuccessBase.class) })
    public Response createUser(@ApiParam(value = "The email address of the new user. ",required=true) @QueryParam("email") String email
,@ApiParam(value = "The password of the new user. ",required=true) @QueryParam("password") String password
,@ApiParam(value = "The full name of the new user. ",required=true) @QueryParam("full_name") String fullName
)
    throws NotFoundException {
        return delegate.createUser(email,password,fullName);
    }
    @DELETE
    @Path("/me")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Deactivate own user", notes = "Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonSuccess.class) })
    public Response deactivateOwnUser()
    throws NotFoundException {
        return delegate.deactivateOwnUser();
    }
    @DELETE
    @Path("/{user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Deactivate a user", notes = "[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request", response = JsonSuccess.class) })
    public Response deactivateUser(@ApiParam(value = "The target user's ID. ",required=true) @PathParam("user_id") Integer userId
)
    throws NotFoundException {
        return delegate.deactivateUser(userId);
    }
    @GET
    @Path("/me")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get own user", notes = "Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = JsonSuccessBase.class) })
    public Response getOwnUser()
    throws NotFoundException {
        return delegate.getOwnUser();
    }
    @GET
    @Path("/me/{stream_id}/topics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get topics in a stream", notes = "Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonSuccessBase.class) })
    public Response getStreamTopics(@ApiParam(value = "The ID of the stream to access. ",required=true) @PathParam("stream_id") Integer streamId
)
    throws NotFoundException {
        return delegate.getStreamTopics(streamId);
    }
    @GET
    @Path("/{user_id}/subscriptions/{stream_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get subscription status", notes = "Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = JsonSuccessBase.class) })
    public Response getSubscriptionStatus(@ApiParam(value = "The target user's ID. ",required=true) @PathParam("user_id") Integer userId
,@ApiParam(value = "The ID of the stream to access. ",required=true) @PathParam("stream_id") Integer streamId
)
    throws NotFoundException {
        return delegate.getSubscriptionStatus(userId,streamId);
    }
    @GET
    @Path("/me/subscriptions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get subscribed streams", notes = "Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getSubscriptions(@ApiParam(value = "Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. ", defaultValue="false") @DefaultValue("false") @QueryParam("include_subscribers") Boolean includeSubscribers
)
    throws NotFoundException {
        return delegate.getSubscriptions(includeSubscribers);
    }
    @GET
    @Path("/{user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a user", notes = "Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getUser(@ApiParam(value = "The target user's ID. ",required=true) @PathParam("user_id") Integer userId
,@ApiParam(value = "Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. ", defaultValue="false") @DefaultValue("false") @QueryParam("client_gravatar") Boolean clientGravatar
,@ApiParam(value = "Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. ", defaultValue="false") @DefaultValue("false") @QueryParam("include_custom_profile_fields") Boolean includeCustomProfileFields
)
    throws NotFoundException {
        return delegate.getUser(userId,clientGravatar,includeCustomProfileFields);
    }
    @GET
    @Path("/{email}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a user by email", notes = "Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getUserByEmail(@ApiParam(value = "The email address of the user whose details you want to fetch. ",required=true) @PathParam("email") String email
,@ApiParam(value = "Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. ", defaultValue="false") @DefaultValue("false") @QueryParam("client_gravatar") Boolean clientGravatar
,@ApiParam(value = "Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. ", defaultValue="false") @DefaultValue("false") @QueryParam("include_custom_profile_fields") Boolean includeCustomProfileFields
)
    throws NotFoundException {
        return delegate.getUserByEmail(email,clientGravatar,includeCustomProfileFields);
    }
    @GET
    @Path("/{user_id_or_email}/presence")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user presence", notes = "Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getUserPresence(@ApiParam(value = "The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. ",required=true) @PathParam("user_id_or_email") String userIdOrEmail
)
    throws NotFoundException {
        return delegate.getUserPresence(userIdOrEmail);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all users", notes = "Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getUsers(@ApiParam(value = "Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. ", defaultValue="false") @DefaultValue("false") @QueryParam("client_gravatar") Boolean clientGravatar
,@ApiParam(value = "Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. ", defaultValue="false") @DefaultValue("false") @QueryParam("include_custom_profile_fields") Boolean includeCustomProfileFields
)
    throws NotFoundException {
        return delegate.getUsers(clientGravatar,includeCustomProfileFields);
    }
    @PATCH
    @Path("/me/subscriptions/muted_topics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Topic muting", notes = "This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` ", response = JsonSuccess.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonSuccess.class) })
    public Response muteTopic(@ApiParam(value = "The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. ",required=true) @QueryParam("topic") String topic
,@ApiParam(value = "Whether to mute (`add`) or unmute (`remove`) the provided topic. ",required=true, allowableValues="add, remove") @QueryParam("op") String op
,@ApiParam(value = "The name of the stream to access. ") @QueryParam("stream") String stream
,@ApiParam(value = "The ID of the stream to access. ") @QueryParam("stream_id") Integer streamId
)
    throws NotFoundException {
        return delegate.muteTopic(topic,op,stream,streamId);
    }
    @POST
    @Path("/me/muted_users/{muted_user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Mute a user", notes = "This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonSuccess.class) })
    public Response muteUser(@ApiParam(value = "The ID of the user to mute/un-mute. ",required=true) @PathParam("muted_user_id") Integer mutedUserId
)
    throws NotFoundException {
        return delegate.muteUser(mutedUserId);
    }
    @POST
    @Path("/{user_id}/reactivate")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Reactivate a user", notes = "[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` ", response = Object.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Object.class) })
    public Response reactivateUser(@ApiParam(value = "The target user's ID. ",required=true) @PathParam("user_id") Integer userId
)
    throws NotFoundException {
        return delegate.reactivateUser(userId);
    }
    @POST
    @Path("/me/subscriptions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Subscribe to a stream", notes = "Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. ", response = OneOfobjectobject.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = OneOfobjectobject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Success.", response = OneOfobjectobject.class) })
    public Response subscribe(@ApiParam(value = "A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. ",required=true) @QueryParam("subscriptions") List<Object> subscriptions
,@ApiParam(value = "A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). ") @QueryParam("principals") List<OneOfstringinteger> principals
,@ApiParam(value = "A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key. ", defaultValue="true") @DefaultValue("true") @QueryParam("authorization_errors_fatal") Boolean authorizationErrorsFatal
,@ApiParam(value = "If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation. ", defaultValue="false") @DefaultValue("false") @QueryParam("announce") Boolean announce
,@ApiParam(value = "As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. ", defaultValue="false") @DefaultValue("false") @QueryParam("invite_only") Boolean inviteOnly
,@ApiParam(value = "Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. ") @QueryParam("history_public_to_subscribers") Boolean historyPublicToSubscribers
,@ApiParam(value = "Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. ", defaultValue="1") @DefaultValue("1") @QueryParam("stream_post_policy") Integer streamPostPolicy
,@ApiParam(value = "Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). ") @QueryParam("message_retention_days") OneOfstringinteger messageRetentionDays
)
    throws NotFoundException {
        return delegate.subscribe(subscriptions,principals,authorizationErrorsFatal,announce,inviteOnly,historyPublicToSubscribers,streamPostPolicy,messageRetentionDays);
    }
    @DELETE
    @Path("/me/muted_users/{muted_user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Unmute a user", notes = "This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonSuccess.class) })
    public Response unmuteUser(@ApiParam(value = "The ID of the user to mute/un-mute. ",required=true) @PathParam("muted_user_id") Integer mutedUserId
)
    throws NotFoundException {
        return delegate.unmuteUser(mutedUserId);
    }
    @DELETE
    @Path("/me/subscriptions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Unsubscribe from a stream", notes = "Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonSuccessBase.class) })
    public Response unsubscribe(@ApiParam(value = "A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. ",required=true) @QueryParam("subscriptions") List<String> subscriptions
,@ApiParam(value = "A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). ") @QueryParam("principals") List<OneOfstringinteger> principals
)
    throws NotFoundException {
        return delegate.unsubscribe(subscriptions,principals);
    }
    @POST
    @Path("/me/status")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update your status", notes = "Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Success.", response = JsonSuccess.class) })
    public Response updateStatus(@ApiParam(value = "The text content of the status message. Sending the empty string will clear the user's status.  **Note**: The limit on the size of the message is 60 characters. ") @QueryParam("status_text") String statusText
,@ApiParam(value = "Whether the user should be marked as \"away\". ") @QueryParam("away") Boolean away
,@ApiParam(value = "The name for the emoji to associate with this status. ") @QueryParam("emoji_name") String emojiName
,@ApiParam(value = "A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. ") @QueryParam("emoji_code") String emojiCode
,@ApiParam(value = "One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. ") @QueryParam("reaction_type") String reactionType
)
    throws NotFoundException {
        return delegate.updateStatus(statusText,away,emojiName,emojiCode,reactionType);
    }
    @POST
    @Path("/me/subscriptions/properties")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update subscription settings", notes = "This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response updateSubscriptionSettings(@ApiParam(value = "A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. ",required=true) @QueryParam("subscription_data") List<Object> subscriptionData
)
    throws NotFoundException {
        return delegate.updateSubscriptionSettings(subscriptionData);
    }
    @PATCH
    @Path("/me/subscriptions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update subscriptions", notes = "Update which streams you are are subscribed to. ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response updateSubscriptions(@ApiParam(value = "A list of stream names to unsubscribe from. ") @QueryParam("delete") List<String> delete
,@ApiParam(value = "A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. ") @QueryParam("add") List<Object> add
)
    throws NotFoundException {
        return delegate.updateSubscriptions(delete,add);
    }
    @PATCH
    @Path("/{user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a user", notes = "Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonSuccess.class) })
    public Response updateUser(@ApiParam(value = "The target user's ID. ",required=true) @PathParam("user_id") Integer userId
,@ApiParam(value = "The user's full name. ") @QueryParam("full_name") String fullName
,@ApiParam(value = "New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). ") @QueryParam("role") Integer role
,@ApiParam(value = "A dictionary containing the to be updated custom profile field data for the user. ") @QueryParam("profile_data") List<Object> profileData
)
    throws NotFoundException {
        return delegate.updateUser(userId,fullName,role,profileData);
    }
}
