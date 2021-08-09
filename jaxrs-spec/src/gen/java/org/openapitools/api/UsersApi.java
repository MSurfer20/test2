package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.NonExistingStreamError;
import org.openapitools.model.OneOfobjectobject;
import org.openapitools.model.OneOfobjectobjectobject;
import org.openapitools.model.OneOfobjectobjectobjectobjectobjectobject;
import org.openapitools.model.OneOfstringinteger;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/users")
@Api(description = "the users API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-09T21:34:15.269802Z[Etc/UTC]")public class UsersApi {

    @POST
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a user", notes = "{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` ", response = JsonSuccessBase.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response createUser(@QueryParam("email") @NotNull   @ApiParam("The email address of the new user. ")  String email,@QueryParam("password") @NotNull   @ApiParam("The password of the new user. ")  String password,@QueryParam("full_name") @NotNull   @ApiParam("The full name of the new user. ")  String fullName) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/me")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deactivate own user", notes = "Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response deactivateOwnUser() {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deactivate a user", notes = "[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request", response = JsonError.class)
    })
    public Response deactivateUser(@PathParam("user_id") @ApiParam("The target user&#39;s ID. ") Integer userId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/me")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get own user", notes = "Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` ", response = JsonSuccessBase.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = JsonSuccessBase.class)
    })
    public Response getOwnUser() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/me/{stream_id}/topics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get topics in a stream", notes = "Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` ", response = JsonSuccessBase.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response getStreamTopics(@PathParam("stream_id") @ApiParam("The ID of the stream to access. ") Integer streamId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{user_id}/subscriptions/{stream_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get subscription status", notes = "Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). ", response = JsonSuccessBase.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = JsonSuccessBase.class)
    })
    public Response getSubscriptionStatus(@PathParam("user_id") @ApiParam("The target user&#39;s ID. ") Integer userId,@PathParam("stream_id") @ApiParam("The ID of the stream to access. ") Integer streamId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/me/subscriptions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get subscribed streams", notes = "Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` ", response = JsonSuccessBase.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getSubscriptions(@QueryParam("include_subscribers")  @DefaultValue("false")  @ApiParam("Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. ")  Boolean includeSubscribers) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a user", notes = "Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* ", response = JsonSuccessBase.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getUser(@PathParam("user_id") @ApiParam("The target user&#39;s ID. ") Integer userId,@QueryParam("client_gravatar")  @DefaultValue("false")  @ApiParam("Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. ")  Boolean clientGravatar,@QueryParam("include_custom_profile_fields")  @DefaultValue("false")  @ApiParam("Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. ")  Boolean includeCustomProfileFields) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{email}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a user by email", notes = "Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* ", response = JsonSuccessBase.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getUserByEmail(@PathParam("email") @ApiParam("The email address of the user whose details you want to fetch. ") String email,@QueryParam("client_gravatar")  @DefaultValue("false")  @ApiParam("Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. ")  Boolean clientGravatar,@QueryParam("include_custom_profile_fields")  @DefaultValue("false")  @ApiParam("Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. ")  Boolean includeCustomProfileFields) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{user_id_or_email}/presence")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user presence", notes = "Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. ", response = JsonSuccessBase.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getUserPresence(@PathParam("user_id_or_email") @ApiParam("The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. ") String userIdOrEmail) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all users", notes = "Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). ", response = JsonSuccessBase.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getUsers(@QueryParam("client_gravatar")  @DefaultValue("false")  @ApiParam("Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. ")  Boolean clientGravatar,@QueryParam("include_custom_profile_fields")  @DefaultValue("false")  @ApiParam("Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. ")  Boolean includeCustomProfileFields) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/me/subscriptions/muted_topics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Topic muting", notes = "This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` ", response = JsonSuccess.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class)
    })
    public Response muteTopic(@QueryParam("topic") @NotNull   @ApiParam("The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. ")  String topic,@QueryParam("op") @NotNull   @ApiParam("Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. ")  String op,@QueryParam("stream")   @ApiParam("The name of the stream to access. ")  String stream,@QueryParam("stream_id")   @ApiParam("The ID of the stream to access. ")  Integer streamId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/me/muted_users/{muted_user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Mute a user", notes = "This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobjectobject.class)
    })
    public Response muteUser(@PathParam("muted_user_id") @ApiParam("The ID of the user to mute/un-mute. ") Integer mutedUserId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{user_id}/reactivate")
    @Produces({ "application/json" })
    @ApiOperation(value = "Reactivate a user", notes = "[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` ", response = Object.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Object.class)
    })
    public Response reactivateUser(@PathParam("user_id") @ApiParam("The target user&#39;s ID. ") Integer userId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/me/subscriptions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Subscribe to a stream", notes = "Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. ", response = OneOfobjectobject.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = OneOfobjectobject.class),
        @ApiResponse(code = 400, message = "Success.", response = OneOfobjectobject.class)
    })
    public Response subscribe(@QueryParam("subscriptions") @NotNull   @ApiParam("A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. ")  List<Object> subscriptions,@QueryParam("principals")   @ApiParam("A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). ")  List<OneOfstringinteger> principals,@QueryParam("authorization_errors_fatal")  @DefaultValue("true")  @ApiParam("A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. ")  Boolean authorizationErrorsFatal,@QueryParam("announce")  @DefaultValue("false")  @ApiParam("If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation. ")  Boolean announce,@QueryParam("invite_only")  @DefaultValue("false")  @ApiParam("As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. ")  Boolean inviteOnly,@QueryParam("history_public_to_subscribers")   @ApiParam("Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. ")  Boolean historyPublicToSubscribers,@QueryParam("stream_post_policy")  @DefaultValue("1")  @ApiParam("Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. ")  Integer streamPostPolicy,@QueryParam("message_retention_days")   @ApiParam("Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). ")  OneOfstringinteger messageRetentionDays) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/me/muted_users/{muted_user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Unmute a user", notes = "This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class)
    })
    public Response unmuteUser(@PathParam("muted_user_id") @ApiParam("The ID of the user to mute/un-mute. ") Integer mutedUserId) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/me/subscriptions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Unsubscribe from a stream", notes = "Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` ", response = JsonSuccessBase.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = NonExistingStreamError.class)
    })
    public Response unsubscribe(@QueryParam("subscriptions") @NotNull   @ApiParam("A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. ")  List<String> subscriptions,@QueryParam("principals")   @ApiParam("A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). ")  List<OneOfstringinteger> principals) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/me/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update your status", notes = "Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Success.", response = OneOfobjectobjectobjectobjectobjectobject.class)
    })
    public Response updateStatus(@QueryParam("status_text")   @ApiParam("The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters. ")  String statusText,@QueryParam("away")   @ApiParam("Whether the user should be marked as \&quot;away\&quot;. ")  Boolean away,@QueryParam("emoji_name")   @ApiParam("The name for the emoji to associate with this status. ")  String emojiName,@QueryParam("emoji_code")   @ApiParam("A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. ")  String emojiCode,@QueryParam("reaction_type")   @ApiParam("One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. ")  String reactionType) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/me/subscriptions/properties")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update subscription settings", notes = "This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` ", response = JsonSuccessBase.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response updateSubscriptionSettings(@QueryParam("subscription_data") @NotNull   @ApiParam("A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. ")  List<Object> subscriptionData) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/me/subscriptions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update subscriptions", notes = "Update which streams you are are subscribed to. ", response = JsonSuccessBase.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response updateSubscriptions(@QueryParam("delete")   @ApiParam("A list of stream names to unsubscribe from. ")  List<String> delete,@QueryParam("add")   @ApiParam("A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. ")  List<Object> add) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a user", notes = "Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class)
    })
    public Response updateUser(@PathParam("user_id") @ApiParam("The target user&#39;s ID. ") Integer userId,@QueryParam("full_name")   @ApiParam("The user&#39;s full name. ")  String fullName,@QueryParam("role")   @ApiParam("New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). ")  Integer role,@QueryParam("profile_data")   @ApiParam("A dictionary containing the to be updated custom profile field data for the user. ")  List<Object> profileData) {
        return Response.ok().entity("magic!").build();
    }
}
