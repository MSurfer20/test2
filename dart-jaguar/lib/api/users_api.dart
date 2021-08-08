import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_mimetype/jaguar_mimetype.dart';
import 'dart:async';

import 'package:openapi/model/json_success_base.dart';
import 'package:openapi/model/one_ofobjectobjectobjectobjectobjectobject.dart';
import 'package:openapi/model/json_success.dart';
import 'package:openapi/model/one_ofobjectobject.dart';
import 'package:openapi/model/json_error.dart';
import 'package:openapi/model/one_ofobjectobjectobject.dart';
import 'package:openapi/model/coded_error.dart';

part 'users_api.jretro.dart';

@GenApiClient()
class UsersApi extends ApiClient with _$UsersApiClient {
    final Route base;
    final Map<String, CodecRepo> converters;
    final Duration timeout;

    UsersApi({this.base, this.converters, this.timeout = const Duration(minutes: 2)});

    /// Create a user
    ///
    /// {!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 
    @PostReq(path: "/users")
    Future<JsonSuccessBase> createUser(
        
            @QueryParam("email") String email, 
        
            @QueryParam("password") String password, 
        
            @QueryParam("full_name") String fullName
        ) {
        return super.createUser(
        
        email, 
        
        password, 
        
        fullName

        ).timeout(timeout);
    }

    /// Create a user group
    ///
    /// Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 
    @PostReq(path: "/user_groups/create")
    Future<JsonSuccess> createUserGroup(
        
            @QueryParam("name") String name, 
        
            @QueryParam("description") String description, 
        
            @QueryParam("members") List<int> members
        ) {
        return super.createUserGroup(
        
        name, 
        
        description, 
        
        members

        ).timeout(timeout);
    }

    /// Deactivate own user
    ///
    /// Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
    @DeleteReq(path: "/users/me")
    Future<JsonSuccess> deactivateOwnUser(
        ) {
        return super.deactivateOwnUser(

        ).timeout(timeout);
    }

    /// Deactivate a user
    ///
    /// [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 
    @DeleteReq(path: "/users/:user_id")
    Future<JsonSuccess> deactivateUser(
            @PathParam("user_id") int userId
        ) {
        return super.deactivateUser(
        userId

        ).timeout(timeout);
    }

    /// Get attachments
    ///
    /// Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 
    @GetReq(path: "/attachments")
    Future<JsonSuccessBase> getAttachments(
        ) {
        return super.getAttachments(

        ).timeout(timeout);
    }

    /// Get own user
    ///
    /// Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; 
    @GetReq(path: "/users/me")
    Future<JsonSuccessBase> getOwnUser(
        ) {
        return super.getOwnUser(

        ).timeout(timeout);
    }

    /// Get a user
    ///
    /// Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
    @GetReq(path: "/users/:user_id")
    Future<JsonSuccessBase> getUser(
            @PathParam("user_id") int userId
        ,
            @QueryParam("client_gravatar") bool clientGravatar, 
        
            @QueryParam("include_custom_profile_fields") bool includeCustomProfileFields
        ) {
        return super.getUser(
        userId
        ,
        clientGravatar, 
        
        includeCustomProfileFields

        ).timeout(timeout);
    }

    /// Get a user by email
    ///
    /// Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
    @GetReq(path: "/users/:email")
    Future<JsonSuccessBase> getUserByEmail(
            @PathParam("email") String email
        ,
            @QueryParam("client_gravatar") bool clientGravatar, 
        
            @QueryParam("include_custom_profile_fields") bool includeCustomProfileFields
        ) {
        return super.getUserByEmail(
        email
        ,
        clientGravatar, 
        
        includeCustomProfileFields

        ).timeout(timeout);
    }

    /// Get user groups
    ///
    /// {!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 
    @GetReq(path: "/user_groups")
    Future<JsonSuccessBase> getUserGroups(
        ) {
        return super.getUserGroups(

        ).timeout(timeout);
    }

    /// Get user presence
    ///
    /// Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
    @GetReq(path: "/users/:user_id_or_email/presence")
    Future<JsonSuccessBase> getUserPresence(
            @PathParam("user_id_or_email") String userIdOrEmail
        ) {
        return super.getUserPresence(
        userIdOrEmail

        ).timeout(timeout);
    }

    /// Get all users
    ///
    /// Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 
    @GetReq(path: "/users")
    Future<JsonSuccessBase> getUsers(
        
            @QueryParam("client_gravatar") bool clientGravatar, 
        
            @QueryParam("include_custom_profile_fields") bool includeCustomProfileFields
        ) {
        return super.getUsers(
        
        clientGravatar, 
        
        includeCustomProfileFields

        ).timeout(timeout);
    }

    /// Mute a user
    ///
    /// This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
    @PostReq(path: "/users/me/muted_users/:muted_user_id")
    Future<JsonSuccess> muteUser(
            @PathParam("muted_user_id") int mutedUserId
        ) {
        return super.muteUser(
        mutedUserId

        ).timeout(timeout);
    }

    /// Reactivate a user
    ///
    /// [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 
    @PostReq(path: "/users/:user_id/reactivate")
    Future<Object> reactivateUser(
            @PathParam("user_id") int userId
        ) {
        return super.reactivateUser(
        userId

        ).timeout(timeout);
    }

    /// Delete a user group
    ///
    /// Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
    @DeleteReq(path: "/user_groups/:user_group_id")
    Future<JsonSuccess> removeUserGroup(
            @PathParam("user_group_id") int userGroupId
        ) {
        return super.removeUserGroup(
        userGroupId

        ).timeout(timeout);
    }

    /// Set \&quot;typing\&quot; status
    ///
    /// Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. 
    @PostReq(path: "/typing")
    Future<JsonSuccess> setTypingStatus(
        
            @QueryParam("type") String type, 
        
            @QueryParam("op") String op, 
        
            @QueryParam("to") List<int> to, 
        
            @QueryParam("topic") String topic
        ) {
        return super.setTypingStatus(
        
        type, 
        
        op, 
        
        to, 
        
        topic

        ).timeout(timeout);
    }

    /// Unmute a user
    ///
    /// This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 
    @DeleteReq(path: "/users/me/muted_users/:muted_user_id")
    Future<JsonSuccess> unmuteUser(
            @PathParam("muted_user_id") int mutedUserId
        ) {
        return super.unmuteUser(
        mutedUserId

        ).timeout(timeout);
    }

    /// Update settings
    ///
    /// This endpoint is used to edit the current user&#39;s settings.  &#x60;PATCH {{ api_url }}/v1/settings&#x60;  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the &#x60;full_name&#x60;, &#x60;email&#x60;, &#x60;old_password&#x60;, and &#x60;new_password&#x60; parameters. Notification settings were managed by &#x60;PATCH /settings/notifications&#x60;, and all other settings by &#x60;PATCH /settings/display&#x60;. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for &#x60;/settings&#x60; in Zulip 5.0 (feature level 78).  The &#x60;/settings/display&#x60; and &#x60;/settings/notifications&#x60; endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
    @PatchReq(path: "/settings")
    Future<JsonSuccessBase> updateSettings(
        
            @QueryParam("full_name") String fullName, 
        
            @QueryParam("email") String email, 
        
            @QueryParam("old_password") String oldPassword, 
        
            @QueryParam("new_password") String newPassword, 
        
            @QueryParam("twenty_four_hour_time") bool twentyFourHourTime, 
        
            @QueryParam("dense_mode") bool denseMode, 
        
            @QueryParam("starred_message_counts") bool starredMessageCounts, 
        
            @QueryParam("fluid_layout_width") bool fluidLayoutWidth, 
        
            @QueryParam("high_contrast_mode") bool highContrastMode, 
        
            @QueryParam("color_scheme") int colorScheme, 
        
            @QueryParam("enable_drafts_synchronization") bool enableDraftsSynchronization, 
        
            @QueryParam("translate_emoticons") bool translateEmoticons, 
        
            @QueryParam("default_language") String defaultLanguage, 
        
            @QueryParam("default_view") String defaultView, 
        
            @QueryParam("left_side_userlist") bool leftSideUserlist, 
        
            @QueryParam("emojiset") String emojiset, 
        
            @QueryParam("demote_inactive_streams") int demoteInactiveStreams, 
        
            @QueryParam("timezone") String timezone, 
        
            @QueryParam("enable_stream_desktop_notifications") bool enableStreamDesktopNotifications, 
        
            @QueryParam("enable_stream_email_notifications") bool enableStreamEmailNotifications, 
        
            @QueryParam("enable_stream_push_notifications") bool enableStreamPushNotifications, 
        
            @QueryParam("enable_stream_audible_notifications") bool enableStreamAudibleNotifications, 
        
            @QueryParam("notification_sound") String notificationSound, 
        
            @QueryParam("enable_desktop_notifications") bool enableDesktopNotifications, 
        
            @QueryParam("enable_sounds") bool enableSounds, 
        
            @QueryParam("email_notifications_batching_period_seconds") int emailNotificationsBatchingPeriodSeconds, 
        
            @QueryParam("enable_offline_email_notifications") bool enableOfflineEmailNotifications, 
        
            @QueryParam("enable_offline_push_notifications") bool enableOfflinePushNotifications, 
        
            @QueryParam("enable_online_push_notifications") bool enableOnlinePushNotifications, 
        
            @QueryParam("enable_digest_emails") bool enableDigestEmails, 
        
            @QueryParam("enable_marketing_emails") bool enableMarketingEmails, 
        
            @QueryParam("enable_login_emails") bool enableLoginEmails, 
        
            @QueryParam("message_content_in_email_notifications") bool messageContentInEmailNotifications, 
        
            @QueryParam("pm_content_in_desktop_notifications") bool pmContentInDesktopNotifications, 
        
            @QueryParam("wildcard_mentions_notify") bool wildcardMentionsNotify, 
        
            @QueryParam("desktop_icon_count_display") int desktopIconCountDisplay, 
        
            @QueryParam("realm_name_in_notifications") bool realmNameInNotifications, 
        
            @QueryParam("presence_enabled") bool presenceEnabled, 
        
            @QueryParam("enter_sends") bool enterSends
        ) {
        return super.updateSettings(
        
        fullName, 
        
        email, 
        
        oldPassword, 
        
        newPassword, 
        
        twentyFourHourTime, 
        
        denseMode, 
        
        starredMessageCounts, 
        
        fluidLayoutWidth, 
        
        highContrastMode, 
        
        colorScheme, 
        
        enableDraftsSynchronization, 
        
        translateEmoticons, 
        
        defaultLanguage, 
        
        defaultView, 
        
        leftSideUserlist, 
        
        emojiset, 
        
        demoteInactiveStreams, 
        
        timezone, 
        
        enableStreamDesktopNotifications, 
        
        enableStreamEmailNotifications, 
        
        enableStreamPushNotifications, 
        
        enableStreamAudibleNotifications, 
        
        notificationSound, 
        
        enableDesktopNotifications, 
        
        enableSounds, 
        
        emailNotificationsBatchingPeriodSeconds, 
        
        enableOfflineEmailNotifications, 
        
        enableOfflinePushNotifications, 
        
        enableOnlinePushNotifications, 
        
        enableDigestEmails, 
        
        enableMarketingEmails, 
        
        enableLoginEmails, 
        
        messageContentInEmailNotifications, 
        
        pmContentInDesktopNotifications, 
        
        wildcardMentionsNotify, 
        
        desktopIconCountDisplay, 
        
        realmNameInNotifications, 
        
        presenceEnabled, 
        
        enterSends

        ).timeout(timeout);
    }

    /// Update your status
    ///
    /// Change your [status](/help/status-and-availability).  &#x60;POST {{ api_url }}/v1/users/me/status&#x60;  A request to this endpoint will only change the parameters passed. For example, passing just &#x60;status_text&#x60; requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user&#39;s status to a specific value should pass all supported parameters. 
    @PostReq(path: "/users/me/status")
    Future<JsonSuccess> updateStatus(
        
            @QueryParam("status_text") String statusText, 
        
            @QueryParam("away") bool away, 
        
            @QueryParam("emoji_name") String emojiName, 
        
            @QueryParam("emoji_code") String emojiCode, 
        
            @QueryParam("reaction_type") String reactionType
        ) {
        return super.updateStatus(
        
        statusText, 
        
        away, 
        
        emojiName, 
        
        emojiCode, 
        
        reactionType

        ).timeout(timeout);
    }

    /// Update a user
    ///
    /// Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
    @PatchReq(path: "/users/:user_id")
    Future<JsonSuccess> updateUser(
            @PathParam("user_id") int userId
        ,
            @QueryParam("full_name") String fullName, 
        
            @QueryParam("role") int role, 
        
            @QueryParam("profile_data") List<Object> profileData
        ) {
        return super.updateUser(
        userId
        ,
        fullName, 
        
        role, 
        
        profileData

        ).timeout(timeout);
    }

    /// Update a user group
    ///
    /// Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
    @PatchReq(path: "/user_groups/:user_group_id")
    Future<JsonSuccess> updateUserGroup(
            @PathParam("user_group_id") int userGroupId
        ,
            @QueryParam("name") String name, 
        
            @QueryParam("description") String description
        ) {
        return super.updateUserGroup(
        userGroupId
        ,
        name, 
        
        description

        ).timeout(timeout);
    }

    /// Update user group members
    ///
    /// Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 
    @PostReq(path: "/user_groups/:user_group_id/members")
    Future<JsonSuccess> updateUserGroupMembers(
            @PathParam("user_group_id") int userGroupId
        ,
            @QueryParam("delete") List<int> delete, 
        
            @QueryParam("add") List<int> add
        ) {
        return super.updateUserGroupMembers(
        userGroupId
        ,
        delete, 
        
        add

        ).timeout(timeout);
    }


}
