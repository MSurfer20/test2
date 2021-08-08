package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfobjectobject;
import org.openapitools.model.OneOfobjectobjectobject;
import org.openapitools.model.OneOfobjectobjectobjectobjectobjectobject;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface UsersApi  {

    /**
     * Create a user
     *
     * {!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 
     *
     */
    @POST
    @Path("/users")
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a user", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public JsonSuccessBase createUser(@QueryParam("email") @NotNull  String email, @QueryParam("password") @NotNull  String password, @QueryParam("full_name") @NotNull  String fullName);

    /**
     * Create a user group
     *
     * Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 
     *
     */
    @POST
    @Path("/user_groups/create")
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a user group", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public JsonSuccess createUserGroup(@QueryParam("name") @NotNull  String name, @QueryParam("description") @NotNull  String description, @QueryParam("members") @NotNull  List<Integer> members);

    /**
     * Deactivate own user
     *
     * Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
     *
     */
    @DELETE
    @Path("/users/me")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deactivate own user", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public JsonSuccess deactivateOwnUser();

    /**
     * Deactivate a user
     *
     * [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 
     *
     */
    @DELETE
    @Path("/users/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deactivate a user", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request", response = JsonError.class) })
    public JsonSuccess deactivateUser(@PathParam("user_id") Integer userId);

    /**
     * Get attachments
     *
     * Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 
     *
     */
    @GET
    @Path("/attachments")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get attachments", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase getAttachments();

    /**
     * Get own user
     *
     * Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; 
     *
     */
    @GET
    @Path("/users/me")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get own user", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = JsonSuccessBase.class) })
    public JsonSuccessBase getOwnUser();

    /**
     * Get a user
     *
     * Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
     *
     */
    @GET
    @Path("/users/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a user", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase getUser(@PathParam("user_id") Integer userId, @QueryParam("client_gravatar")  @DefaultValue("false")Boolean clientGravatar, @QueryParam("include_custom_profile_fields")  @DefaultValue("false")Boolean includeCustomProfileFields);

    /**
     * Get a user by email
     *
     * Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
     *
     */
    @GET
    @Path("/users/{email}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a user by email", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase getUserByEmail(@PathParam("email") String email, @QueryParam("client_gravatar")  @DefaultValue("false")Boolean clientGravatar, @QueryParam("include_custom_profile_fields")  @DefaultValue("false")Boolean includeCustomProfileFields);

    /**
     * Get user groups
     *
     * {!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 
     *
     */
    @GET
    @Path("/user_groups")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user groups", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase getUserGroups();

    /**
     * Get user presence
     *
     * Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
     *
     */
    @GET
    @Path("/users/{user_id_or_email}/presence")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user presence", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase getUserPresence(@PathParam("user_id_or_email") String userIdOrEmail);

    /**
     * Get all users
     *
     * Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 
     *
     */
    @GET
    @Path("/users")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all users", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase getUsers(@QueryParam("client_gravatar")  @DefaultValue("false")Boolean clientGravatar, @QueryParam("include_custom_profile_fields")  @DefaultValue("false")Boolean includeCustomProfileFields);

    /**
     * Mute a user
     *
     * This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
     *
     */
    @POST
    @Path("/users/me/muted_users/{muted_user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Mute a user", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobjectobject.class) })
    public JsonSuccess muteUser(@PathParam("muted_user_id") Integer mutedUserId);

    /**
     * Reactivate a user
     *
     * [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 
     *
     */
    @POST
    @Path("/users/{user_id}/reactivate")
    @Produces({ "application/json" })
    @ApiOperation(value = "Reactivate a user", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Object.class) })
    public Object reactivateUser(@PathParam("user_id") Integer userId);

    /**
     * Delete a user group
     *
     * Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
     *
     */
    @DELETE
    @Path("/user_groups/{user_group_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a user group", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public JsonSuccess removeUserGroup(@PathParam("user_group_id") Integer userGroupId);

    /**
     * Set \&quot;typing\&quot; status
     *
     * Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. 
     *
     */
    @POST
    @Path("/typing")
    @Produces({ "application/json" })
    @ApiOperation(value = "Set \"typing\" status", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public JsonSuccess setTypingStatus(@QueryParam("op") @NotNull  String op, @QueryParam("to") @NotNull  List<Integer> to, @QueryParam("type")  @DefaultValue("private")String type, @QueryParam("topic")  String topic);

    /**
     * Unmute a user
     *
     * This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 
     *
     */
    @DELETE
    @Path("/users/me/muted_users/{muted_user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Unmute a user", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class) })
    public JsonSuccess unmuteUser(@PathParam("muted_user_id") Integer mutedUserId);

    /**
     * Update settings
     *
     * This endpoint is used to edit the current user&#39;s settings.  &#x60;PATCH {{ api_url }}/v1/settings&#x60;  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the &#x60;full_name&#x60;, &#x60;email&#x60;, &#x60;old_password&#x60;, and &#x60;new_password&#x60; parameters. Notification settings were managed by &#x60;PATCH /settings/notifications&#x60;, and all other settings by &#x60;PATCH /settings/display&#x60;. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for &#x60;/settings&#x60; in Zulip 5.0 (feature level 78).  The &#x60;/settings/display&#x60; and &#x60;/settings/notifications&#x60; endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
     *
     */
    @PATCH
    @Path("/settings")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update settings", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = JsonSuccessBase.class) })
    public JsonSuccessBase updateSettings(@QueryParam("full_name")  String fullName, @QueryParam("email")  String email, @QueryParam("old_password")  String oldPassword, @QueryParam("new_password")  String newPassword, @QueryParam("twenty_four_hour_time")  Boolean twentyFourHourTime, @QueryParam("dense_mode")  Boolean denseMode, @QueryParam("starred_message_counts")  Boolean starredMessageCounts, @QueryParam("fluid_layout_width")  Boolean fluidLayoutWidth, @QueryParam("high_contrast_mode")  Boolean highContrastMode, @QueryParam("color_scheme")  Integer colorScheme, @QueryParam("enable_drafts_synchronization")  Boolean enableDraftsSynchronization, @QueryParam("translate_emoticons")  Boolean translateEmoticons, @QueryParam("default_language")  String defaultLanguage, @QueryParam("default_view")  String defaultView, @QueryParam("left_side_userlist")  Boolean leftSideUserlist, @QueryParam("emojiset")  String emojiset, @QueryParam("demote_inactive_streams")  Integer demoteInactiveStreams, @QueryParam("timezone")  String timezone, @QueryParam("enable_stream_desktop_notifications")  Boolean enableStreamDesktopNotifications, @QueryParam("enable_stream_email_notifications")  Boolean enableStreamEmailNotifications, @QueryParam("enable_stream_push_notifications")  Boolean enableStreamPushNotifications, @QueryParam("enable_stream_audible_notifications")  Boolean enableStreamAudibleNotifications, @QueryParam("notification_sound")  String notificationSound, @QueryParam("enable_desktop_notifications")  Boolean enableDesktopNotifications, @QueryParam("enable_sounds")  Boolean enableSounds, @QueryParam("email_notifications_batching_period_seconds")  Integer emailNotificationsBatchingPeriodSeconds, @QueryParam("enable_offline_email_notifications")  Boolean enableOfflineEmailNotifications, @QueryParam("enable_offline_push_notifications")  Boolean enableOfflinePushNotifications, @QueryParam("enable_online_push_notifications")  Boolean enableOnlinePushNotifications, @QueryParam("enable_digest_emails")  Boolean enableDigestEmails, @QueryParam("enable_marketing_emails")  Boolean enableMarketingEmails, @QueryParam("enable_login_emails")  Boolean enableLoginEmails, @QueryParam("message_content_in_email_notifications")  Boolean messageContentInEmailNotifications, @QueryParam("pm_content_in_desktop_notifications")  Boolean pmContentInDesktopNotifications, @QueryParam("wildcard_mentions_notify")  Boolean wildcardMentionsNotify, @QueryParam("desktop_icon_count_display")  Integer desktopIconCountDisplay, @QueryParam("realm_name_in_notifications")  Boolean realmNameInNotifications, @QueryParam("presence_enabled")  Boolean presenceEnabled, @QueryParam("enter_sends")  Boolean enterSends);

    /**
     * Update your status
     *
     * Change your [status](/help/status-and-availability).  &#x60;POST {{ api_url }}/v1/users/me/status&#x60;  A request to this endpoint will only change the parameters passed. For example, passing just &#x60;status_text&#x60; requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user&#39;s status to a specific value should pass all supported parameters. 
     *
     */
    @POST
    @Path("/users/me/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update your status", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Success.", response = OneOfobjectobjectobjectobjectobjectobject.class) })
    public JsonSuccess updateStatus(@QueryParam("status_text")  String statusText, @QueryParam("away")  Boolean away, @QueryParam("emoji_name")  String emojiName, @QueryParam("emoji_code")  String emojiCode, @QueryParam("reaction_type")  String reactionType);

    /**
     * Update a user
     *
     * Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
     *
     */
    @PATCH
    @Path("/users/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a user", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public JsonSuccess updateUser(@PathParam("user_id") Integer userId, @QueryParam("full_name")  String fullName, @QueryParam("role")  Integer role, @QueryParam("profile_data")  List<Object> profileData);

    /**
     * Update a user group
     *
     * Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
     *
     */
    @PATCH
    @Path("/user_groups/{user_group_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a user group", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public JsonSuccess updateUserGroup(@PathParam("user_group_id") Integer userGroupId, @QueryParam("name") @NotNull  String name, @QueryParam("description") @NotNull  String description);

    /**
     * Update user group members
     *
     * Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 
     *
     */
    @POST
    @Path("/user_groups/{user_group_id}/members")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update user group members", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public JsonSuccess updateUserGroupMembers(@PathParam("user_group_id") Integer userGroupId, @QueryParam("delete")  List<Integer> delete, @QueryParam("add")  List<Integer> add);
}

