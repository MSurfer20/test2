package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfobjectobject;
import org.openapitools.model.OneOfobjectobjectobject;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 */
public class UsersApiServiceImpl implements UsersApi {
    /**
     * Create a user
     *
     * {!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 
     *
     */
    @Override
    public JsonSuccessBase createUser(String email, String password, String fullName) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create a user group
     *
     * Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 
     *
     */
    @Override
    public JsonSuccess createUserGroup(String name, String description, List<Integer> members) {
        // TODO: Implement...
        return null;
    }

    /**
     * Deactivate own user
     *
     * Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
     *
     */
    @Override
    public JsonSuccess deactivateOwnUser() {
        // TODO: Implement...
        return null;
    }

    /**
     * Deactivate a user
     *
     * [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 
     *
     */
    @Override
    public JsonSuccess deactivateUser(Integer userId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get attachments
     *
     * Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 
     *
     */
    @Override
    public JsonSuccessBase getAttachments() {
        // TODO: Implement...
        return null;
    }

    /**
     * Get own user
     *
     * Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; 
     *
     */
    @Override
    public JsonSuccessBase getOwnUser() {
        // TODO: Implement...
        return null;
    }

    /**
     * Get a user
     *
     * Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
     *
     */
    @Override
    public JsonSuccessBase getUser(Integer userId, Boolean clientGravatar, Boolean includeCustomProfileFields) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get a user by email
     *
     * Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
     *
     */
    @Override
    public JsonSuccessBase getUserByEmail(String email, Boolean clientGravatar, Boolean includeCustomProfileFields) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get user groups
     *
     * {!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 
     *
     */
    @Override
    public JsonSuccessBase getUserGroups() {
        // TODO: Implement...
        return null;
    }

    /**
     * Get user presence
     *
     * Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
     *
     */
    @Override
    public JsonSuccessBase getUserPresence(String userIdOrEmail) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get all users
     *
     * Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 
     *
     */
    @Override
    public JsonSuccessBase getUsers(Boolean clientGravatar, Boolean includeCustomProfileFields) {
        // TODO: Implement...
        return null;
    }

    /**
     * Mute a user
     *
     * This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
     *
     */
    @Override
    public JsonSuccess muteUser(Integer mutedUserId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Reactivate a user
     *
     * [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 
     *
     */
    @Override
    public Object reactivateUser(Integer userId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Delete a user group
     *
     * Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
     *
     */
    @Override
    public JsonSuccess removeUserGroup(Integer userGroupId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Set \&quot;typing\&quot; status
     *
     * Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. 
     *
     */
    @Override
    public JsonSuccess setTypingStatus(String op, List<Integer> to, String type, String topic) {
        // TODO: Implement...
        return null;
    }

    /**
     * Unmute a user
     *
     * This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 
     *
     */
    @Override
    public JsonSuccess unmuteUser(Integer mutedUserId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update display settings
     *
     * This endpoint is used to edit the current user&#39;s user interface settings.  &#x60;PATCH {{ api_url }}/v1/settings/display&#x60; 
     *
     */
    @Override
    public JsonSuccessBase updateDisplaySettings(Boolean twentyFourHourTime, Boolean denseMode, Boolean starredMessageCounts, Boolean fluidLayoutWidth, Boolean highContrastMode, Integer colorScheme, Boolean translateEmoticons, String defaultLanguage, String defaultView, Boolean leftSideUserlist, String emojiset, Integer demoteInactiveStreams, String timezone) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update notification settings
     *
     * This endpoint is used to edit the user&#39;s global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  &#x60;PATCH {{ api_url }}/v1/settings/notifications&#x60; 
     *
     */
    @Override
    public JsonSuccessBase updateNotificationSettings(Boolean enableStreamDesktopNotifications, Boolean enableStreamEmailNotifications, Boolean enableStreamPushNotifications, Boolean enableStreamAudibleNotifications, String notificationSound, Boolean enableDesktopNotifications, Boolean enableSounds, Boolean enableOfflineEmailNotifications, Boolean enableOfflinePushNotifications, Boolean enableOnlinePushNotifications, Boolean enableDigestEmails, Boolean enableMarketingEmails, Boolean enableLoginEmails, Boolean messageContentInEmailNotifications, Boolean pmContentInDesktopNotifications, Boolean wildcardMentionsNotify, Integer desktopIconCountDisplay, Boolean realmNameInNotifications, Boolean presenceEnabled) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update a user
     *
     * Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
     *
     */
    @Override
    public JsonSuccess updateUser(Integer userId, String fullName, Integer role, List<Object> profileData) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update a user group
     *
     * Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
     *
     */
    @Override
    public JsonSuccess updateUserGroup(Integer userGroupId, String name, String description) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update user group members
     *
     * Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 
     *
     */
    @Override
    public JsonSuccess updateUserGroupMembers(Integer userGroupId, List<Integer> delete, List<Integer> add) {
        // TODO: Implement...
        return null;
    }

}
