/*
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prokarma.pkmst.model.CodedError;
import com.prokarma.pkmst.model.JsonError;
import com.prokarma.pkmst.model.JsonSuccess;
import com.prokarma.pkmst.model.JsonSuccessBase;
import com.prokarma.pkmst.model.OneOfobjectobject;
import com.prokarma.pkmst.model.OneOfobjectobjectobject;
import com.prokarma.pkmst.model.OneOfobjectobjectobjectobjectobjectobject;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final UsersApi api = new UsersApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Create a user
     *
     * {!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws Exception {
        String email = null;
        String password = null;
        String fullName = null;
    ResponseEntity<JsonSuccessBase> response = api.createUser(email, password, fullName , accept);

        // TODO: test validations
    }
    
    /**
     * Create a user group
     *
     * Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createUserGroupTest() throws Exception {
        String name = null;
        String description = null;
        List<Integer> members = null;
    ResponseEntity<JsonSuccess> response = api.createUserGroup(name, description, members , accept);

        // TODO: test validations
    }
    
    /**
     * Deactivate own user
     *
     * Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deactivateOwnUserTest() throws Exception {
    ResponseEntity<JsonSuccess> response = api.deactivateOwnUser(  accept);

        // TODO: test validations
    }
    
    /**
     * Deactivate a user
     *
     * [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deactivateUserTest() throws Exception {
        Integer userId = null;
    ResponseEntity<JsonSuccess> response = api.deactivateUser(userId , accept);

        // TODO: test validations
    }
    
    /**
     * Get attachments
     *
     * Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAttachmentsTest() throws Exception {
    ResponseEntity<JsonSuccessBase> response = api.getAttachments(  accept);

        // TODO: test validations
    }
    
    /**
     * Get own user
     *
     * Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOwnUserTest() throws Exception {
    ResponseEntity<JsonSuccessBase> response = api.getOwnUser(  accept);

        // TODO: test validations
    }
    
    /**
     * Get a user
     *
     * Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws Exception {
        Integer userId = null;
        Boolean clientGravatar = null;
        Boolean includeCustomProfileFields = null;
    ResponseEntity<JsonSuccessBase> response = api.getUser(userId, clientGravatar, includeCustomProfileFields , accept);

        // TODO: test validations
    }
    
    /**
     * Get a user by email
     *
     * Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserByEmailTest() throws Exception {
        String email = null;
        Boolean clientGravatar = null;
        Boolean includeCustomProfileFields = null;
    ResponseEntity<JsonSuccessBase> response = api.getUserByEmail(email, clientGravatar, includeCustomProfileFields , accept);

        // TODO: test validations
    }
    
    /**
     * Get user groups
     *
     * {!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserGroupsTest() throws Exception {
    ResponseEntity<JsonSuccessBase> response = api.getUserGroups(  accept);

        // TODO: test validations
    }
    
    /**
     * Get user presence
     *
     * Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserPresenceTest() throws Exception {
        String userIdOrEmail = null;
    ResponseEntity<JsonSuccessBase> response = api.getUserPresence(userIdOrEmail , accept);

        // TODO: test validations
    }
    
    /**
     * Get all users
     *
     * Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws Exception {
        Boolean clientGravatar = null;
        Boolean includeCustomProfileFields = null;
    ResponseEntity<JsonSuccessBase> response = api.getUsers(clientGravatar, includeCustomProfileFields , accept);

        // TODO: test validations
    }
    
    /**
     * Mute a user
     *
     * This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void muteUserTest() throws Exception {
        Integer mutedUserId = null;
    ResponseEntity<JsonSuccess> response = api.muteUser(mutedUserId , accept);

        // TODO: test validations
    }
    
    /**
     * Reactivate a user
     *
     * [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void reactivateUserTest() throws Exception {
        Integer userId = null;
    ResponseEntity<Object> response = api.reactivateUser(userId , accept);

        // TODO: test validations
    }
    
    /**
     * Delete a user group
     *
     * Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeUserGroupTest() throws Exception {
        Integer userGroupId = null;
    ResponseEntity<JsonSuccess> response = api.removeUserGroup(userGroupId , accept);

        // TODO: test validations
    }
    
    /**
     * Set \&quot;typing\&quot; status
     *
     * Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setTypingStatusTest() throws Exception {
        String op = null;
        List<Integer> to = null;
        String type = null;
        String topic = null;
    ResponseEntity<JsonSuccess> response = api.setTypingStatus(op, to, type, topic , accept);

        // TODO: test validations
    }
    
    /**
     * Unmute a user
     *
     * This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unmuteUserTest() throws Exception {
        Integer mutedUserId = null;
    ResponseEntity<JsonSuccess> response = api.unmuteUser(mutedUserId , accept);

        // TODO: test validations
    }
    
    /**
     * Update settings
     *
     * This endpoint is used to edit the current user&#39;s settings.  &#x60;PATCH {{ api_url }}/v1/settings&#x60;  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the &#x60;full_name&#x60;, &#x60;email&#x60;, &#x60;old_password&#x60;, and &#x60;new_password&#x60; parameters. Notification settings were managed by &#x60;PATCH /settings/notifications&#x60;, and all other settings by &#x60;PATCH /settings/display&#x60;. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for &#x60;/settings&#x60; in Zulip 5.0 (feature level 78).  The &#x60;/settings/display&#x60; and &#x60;/settings/notifications&#x60; endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateSettingsTest() throws Exception {
        String fullName = null;
        String email = null;
        String oldPassword = null;
        String newPassword = null;
        Boolean twentyFourHourTime = null;
        Boolean denseMode = null;
        Boolean starredMessageCounts = null;
        Boolean fluidLayoutWidth = null;
        Boolean highContrastMode = null;
        Integer colorScheme = null;
        Boolean enableDraftsSynchronization = null;
        Boolean translateEmoticons = null;
        String defaultLanguage = null;
        String defaultView = null;
        Boolean leftSideUserlist = null;
        String emojiset = null;
        Integer demoteInactiveStreams = null;
        String timezone = null;
        Boolean enableStreamDesktopNotifications = null;
        Boolean enableStreamEmailNotifications = null;
        Boolean enableStreamPushNotifications = null;
        Boolean enableStreamAudibleNotifications = null;
        String notificationSound = null;
        Boolean enableDesktopNotifications = null;
        Boolean enableSounds = null;
        Integer emailNotificationsBatchingPeriodSeconds = null;
        Boolean enableOfflineEmailNotifications = null;
        Boolean enableOfflinePushNotifications = null;
        Boolean enableOnlinePushNotifications = null;
        Boolean enableDigestEmails = null;
        Boolean enableMarketingEmails = null;
        Boolean enableLoginEmails = null;
        Boolean messageContentInEmailNotifications = null;
        Boolean pmContentInDesktopNotifications = null;
        Boolean wildcardMentionsNotify = null;
        Integer desktopIconCountDisplay = null;
        Boolean realmNameInNotifications = null;
        Boolean presenceEnabled = null;
        Boolean enterSends = null;
    ResponseEntity<JsonSuccessBase> response = api.updateSettings(fullName, email, oldPassword, newPassword, twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, enableDraftsSynchronization, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone, enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, emailNotificationsBatchingPeriodSeconds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled, enterSends , accept);

        // TODO: test validations
    }
    
    /**
     * Update your status
     *
     * Change your [status](/help/status-and-availability).  &#x60;POST {{ api_url }}/v1/users/me/status&#x60;  A request to this endpoint will only change the parameters passed. For example, passing just &#x60;status_text&#x60; requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user&#39;s status to a specific value should pass all supported parameters. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateStatusTest() throws Exception {
        String statusText = null;
        Boolean away = null;
        String emojiName = null;
        String emojiCode = null;
        String reactionType = null;
    ResponseEntity<JsonSuccess> response = api.updateStatus(statusText, away, emojiName, emojiCode, reactionType , accept);

        // TODO: test validations
    }
    
    /**
     * Update a user
     *
     * Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws Exception {
        Integer userId = null;
        String fullName = null;
        Integer role = null;
        List<Object> profileData = null;
    ResponseEntity<JsonSuccess> response = api.updateUser(userId, fullName, role, profileData , accept);

        // TODO: test validations
    }
    
    /**
     * Update a user group
     *
     * Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateUserGroupTest() throws Exception {
        Integer userGroupId = null;
        String name = null;
        String description = null;
    ResponseEntity<JsonSuccess> response = api.updateUserGroup(userGroupId, name, description , accept);

        // TODO: test validations
    }
    
    /**
     * Update user group members
     *
     * Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateUserGroupMembersTest() throws Exception {
        Integer userGroupId = null;
        List<Integer> delete = null;
        List<Integer> add = null;
    ResponseEntity<JsonSuccess> response = api.updateUserGroupMembers(userGroupId, delete, add , accept);

        // TODO: test validations
    }
    
}
