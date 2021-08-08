using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IUsersApi
    {
        /// <summary>
        /// Create a user {!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 
        /// </summary>
        /// <param name="email">The email address of the new user. </param>
        /// <param name="password">The password of the new user. </param>
        /// <param name="fullName">The full name of the new user. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase CreateUser (string email, string password, string fullName);
        /// <summary>
        /// Create a user group Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 
        /// </summary>
        /// <param name="name">The name of the user group. </param>
        /// <param name="description">The description of the user group. </param>
        /// <param name="members">An array containing the user IDs of the initial members for the new user group. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess CreateUserGroup (string name, string description, List<int?> members);
        /// <summary>
        /// Deactivate own user Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
        /// </summary>
        /// <returns>JsonSuccess</returns>
        JsonSuccess DeactivateOwnUser ();
        /// <summary>
        /// Deactivate a user [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 
        /// </summary>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess DeactivateUser (int? userId);
        /// <summary>
        /// Get attachments Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetAttachments ();
        /// <summary>
        /// Get own user Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetOwnUser ();
        /// <summary>
        /// Get a user Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
        /// </summary>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <param name="clientGravatar">Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. </param>
        /// <param name="includeCustomProfileFields">Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetUser (int? userId, bool? clientGravatar, bool? includeCustomProfileFields);
        /// <summary>
        /// Get a user by email Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
        /// </summary>
        /// <param name="email">The email address of the user whose details you want to fetch. </param>
        /// <param name="clientGravatar">Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. </param>
        /// <param name="includeCustomProfileFields">Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetUserByEmail (string email, bool? clientGravatar, bool? includeCustomProfileFields);
        /// <summary>
        /// Get user groups {!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetUserGroups ();
        /// <summary>
        /// Get user presence Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
        /// </summary>
        /// <param name="userIdOrEmail">The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetUserPresence (string userIdOrEmail);
        /// <summary>
        /// Get all users Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 
        /// </summary>
        /// <param name="clientGravatar">Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. </param>
        /// <param name="includeCustomProfileFields">Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetUsers (bool? clientGravatar, bool? includeCustomProfileFields);
        /// <summary>
        /// Mute a user This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
        /// </summary>
        /// <param name="mutedUserId">The ID of the user to mute/un-mute. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess MuteUser (int? mutedUserId);
        /// <summary>
        /// Reactivate a user [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 
        /// </summary>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <returns>Object</returns>
        Object ReactivateUser (int? userId);
        /// <summary>
        /// Delete a user group Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
        /// </summary>
        /// <param name="userGroupId">The ID of the target user group. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess RemoveUserGroup (int? userGroupId);
        /// <summary>
        /// Set \&quot;typing\&quot; status Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. 
        /// </summary>
        /// <param name="op">Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type. </param>
        /// <param name="to">For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). </param>
        /// <param name="type">Type of the message being composed. </param>
        /// <param name="topic">Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess SetTypingStatus (string op, List<int?> to, string type, string topic);
        /// <summary>
        /// Unmute a user This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 
        /// </summary>
        /// <param name="mutedUserId">The ID of the user to mute/un-mute. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UnmuteUser (int? mutedUserId);
        /// <summary>
        /// Update settings This endpoint is used to edit the current user&#39;s settings.  &#x60;PATCH {{ api_url }}/v1/settings&#x60;  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the &#x60;full_name&#x60;, &#x60;email&#x60;, &#x60;old_password&#x60;, and &#x60;new_password&#x60; parameters. Notification settings were managed by &#x60;PATCH /settings/notifications&#x60;, and all other settings by &#x60;PATCH /settings/display&#x60;. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for &#x60;/settings&#x60; in Zulip 5.0 (feature level 78).  The &#x60;/settings/display&#x60; and &#x60;/settings/notifications&#x60; endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
        /// </summary>
        /// <param name="fullName">A new display name for the user. </param>
        /// <param name="email">Asks the server to initiate a confirmation sequence to change the user&#39;s email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. </param>
        /// <param name="oldPassword">The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the &#x60;new_password&#x60; parameter. </param>
        /// <param name="newPassword">The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).  The &#x60;old_password&#x60; parameter must be included in the request. </param>
        /// <param name="twentyFourHourTime">Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="denseMode">This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="starredMessageCounts">Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="fluidLayoutWidth">Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="highContrastMode">This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="colorScheme">Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="enableDraftsSynchronization">A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). </param>
        /// <param name="translateEmoticons">Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="defaultLanguage">What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). </param>
        /// <param name="defaultView">The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). </param>
        /// <param name="leftSideUserlist">Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="emojiset">The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). </param>
        /// <param name="demoteInactiveStreams">Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="timezone">The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). </param>
        /// <param name="enableStreamDesktopNotifications">Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableStreamEmailNotifications">Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableStreamPushNotifications">Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableStreamAudibleNotifications">Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="notificationSound">Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). </param>
        /// <param name="enableDesktopNotifications">Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableSounds">Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="emailNotificationsBatchingPeriodSeconds">The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) </param>
        /// <param name="enableOfflineEmailNotifications">Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableOfflinePushNotifications">Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableOnlinePushNotifications">Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableDigestEmails">Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableMarketingEmails">Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableLoginEmails">Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="messageContentInEmailNotifications">Include the message&#39;s content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="pmContentInDesktopNotifications">Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="wildcardMentionsNotify">Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="desktopIconCountDisplay">Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="realmNameInNotifications">Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="presenceEnabled">Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enterSends">Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the &#x60;POST /users/me/enter-sends&#x60; endpoint, with the same parameter format. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase UpdateSettings (string fullName, string email, string oldPassword, string newPassword, bool? twentyFourHourTime, bool? denseMode, bool? starredMessageCounts, bool? fluidLayoutWidth, bool? highContrastMode, int? colorScheme, bool? enableDraftsSynchronization, bool? translateEmoticons, string defaultLanguage, string defaultView, bool? leftSideUserlist, string emojiset, int? demoteInactiveStreams, string timezone, bool? enableStreamDesktopNotifications, bool? enableStreamEmailNotifications, bool? enableStreamPushNotifications, bool? enableStreamAudibleNotifications, string notificationSound, bool? enableDesktopNotifications, bool? enableSounds, int? emailNotificationsBatchingPeriodSeconds, bool? enableOfflineEmailNotifications, bool? enableOfflinePushNotifications, bool? enableOnlinePushNotifications, bool? enableDigestEmails, bool? enableMarketingEmails, bool? enableLoginEmails, bool? messageContentInEmailNotifications, bool? pmContentInDesktopNotifications, bool? wildcardMentionsNotify, int? desktopIconCountDisplay, bool? realmNameInNotifications, bool? presenceEnabled, bool? enterSends);
        /// <summary>
        /// Update your status Change your [status](/help/status-and-availability).  &#x60;POST {{ api_url }}/v1/users/me/status&#x60;  A request to this endpoint will only change the parameters passed. For example, passing just &#x60;status_text&#x60; requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user&#39;s status to a specific value should pass all supported parameters. 
        /// </summary>
        /// <param name="statusText">The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters. </param>
        /// <param name="away">Whether the user should be marked as \&quot;away\&quot;. </param>
        /// <param name="emojiName">The name for the emoji to associate with this status. </param>
        /// <param name="emojiCode">A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. </param>
        /// <param name="reactionType">One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UpdateStatus (string statusText, bool? away, string emojiName, string emojiCode, string reactionType);
        /// <summary>
        /// Update a user Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
        /// </summary>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <param name="fullName">The user&#39;s full name. </param>
        /// <param name="role">New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). </param>
        /// <param name="profileData">A dictionary containing the to be updated custom profile field data for the user. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UpdateUser (int? userId, string fullName, int? role, List<Object> profileData);
        /// <summary>
        /// Update a user group Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
        /// </summary>
        /// <param name="userGroupId">The ID of the target user group. </param>
        /// <param name="name">The new name of the group. </param>
        /// <param name="description">The new description of the group. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UpdateUserGroup (int? userGroupId, string name, string description);
        /// <summary>
        /// Update user group members Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 
        /// </summary>
        /// <param name="userGroupId">The ID of the target user group. </param>
        /// <param name="delete">The list of user ids to be removed from the user group. </param>
        /// <param name="add">The list of user ids to be added to the user group. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UpdateUserGroupMembers (int? userGroupId, List<int?> delete, List<int?> add);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class UsersApi : IUsersApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UsersApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public UsersApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UsersApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UsersApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }

        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}

        /// <summary>
        /// Create a user {!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 
        /// </summary>
        /// <param name="email">The email address of the new user. </param>
        /// <param name="password">The password of the new user. </param>
        /// <param name="fullName">The full name of the new user. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase CreateUser (string email, string password, string fullName)
        {
            
            // verify the required parameter 'email' is set
            if (email == null) throw new ApiException(400, "Missing required parameter 'email' when calling CreateUser");
            
            // verify the required parameter 'password' is set
            if (password == null) throw new ApiException(400, "Missing required parameter 'password' when calling CreateUser");
            
            // verify the required parameter 'fullName' is set
            if (fullName == null) throw new ApiException(400, "Missing required parameter 'fullName' when calling CreateUser");
            

            var path = "/users";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (email != null) queryParams.Add("email", ApiClient.ParameterToString(email)); // query parameter
 if (password != null) queryParams.Add("password", ApiClient.ParameterToString(password)); // query parameter
 if (fullName != null) queryParams.Add("full_name", ApiClient.ParameterToString(fullName)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateUser: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateUser: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Create a user group Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 
        /// </summary>
        /// <param name="name">The name of the user group. </param>
        /// <param name="description">The description of the user group. </param>
        /// <param name="members">An array containing the user IDs of the initial members for the new user group. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess CreateUserGroup (string name, string description, List<int?> members)
        {
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling CreateUserGroup");
            
            // verify the required parameter 'description' is set
            if (description == null) throw new ApiException(400, "Missing required parameter 'description' when calling CreateUserGroup");
            
            // verify the required parameter 'members' is set
            if (members == null) throw new ApiException(400, "Missing required parameter 'members' when calling CreateUserGroup");
            

            var path = "/user_groups/create";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (name != null) queryParams.Add("name", ApiClient.ParameterToString(name)); // query parameter
 if (description != null) queryParams.Add("description", ApiClient.ParameterToString(description)); // query parameter
 if (members != null) queryParams.Add("members", ApiClient.ParameterToString(members)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateUserGroup: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateUserGroup: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Deactivate own user Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
        /// </summary>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess DeactivateOwnUser ()
        {
            

            var path = "/users/me";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeactivateOwnUser: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeactivateOwnUser: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Deactivate a user [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 
        /// </summary>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess DeactivateUser (int? userId)
        {
            
            // verify the required parameter 'userId' is set
            if (userId == null) throw new ApiException(400, "Missing required parameter 'userId' when calling DeactivateUser");
            

            var path = "/users/{user_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "user_id" + "}", ApiClient.ParameterToString(userId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeactivateUser: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeactivateUser: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Get attachments Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetAttachments ()
        {
            

            var path = "/attachments";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAttachments: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAttachments: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get own user Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetOwnUser ()
        {
            

            var path = "/users/me";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetOwnUser: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetOwnUser: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get a user Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
        /// </summary>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <param name="clientGravatar">Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. </param>
        /// <param name="includeCustomProfileFields">Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetUser (int? userId, bool? clientGravatar, bool? includeCustomProfileFields)
        {
            
            // verify the required parameter 'userId' is set
            if (userId == null) throw new ApiException(400, "Missing required parameter 'userId' when calling GetUser");
            

            var path = "/users/{user_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "user_id" + "}", ApiClient.ParameterToString(userId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (clientGravatar != null) queryParams.Add("client_gravatar", ApiClient.ParameterToString(clientGravatar)); // query parameter
 if (includeCustomProfileFields != null) queryParams.Add("include_custom_profile_fields", ApiClient.ParameterToString(includeCustomProfileFields)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetUser: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetUser: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get a user by email Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
        /// </summary>
        /// <param name="email">The email address of the user whose details you want to fetch. </param>
        /// <param name="clientGravatar">Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. </param>
        /// <param name="includeCustomProfileFields">Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetUserByEmail (string email, bool? clientGravatar, bool? includeCustomProfileFields)
        {
            
            // verify the required parameter 'email' is set
            if (email == null) throw new ApiException(400, "Missing required parameter 'email' when calling GetUserByEmail");
            

            var path = "/users/{email}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "email" + "}", ApiClient.ParameterToString(email));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (clientGravatar != null) queryParams.Add("client_gravatar", ApiClient.ParameterToString(clientGravatar)); // query parameter
 if (includeCustomProfileFields != null) queryParams.Add("include_custom_profile_fields", ApiClient.ParameterToString(includeCustomProfileFields)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetUserByEmail: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetUserByEmail: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get user groups {!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 
        /// </summary>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetUserGroups ()
        {
            

            var path = "/user_groups";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetUserGroups: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetUserGroups: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get user presence Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
        /// </summary>
        /// <param name="userIdOrEmail">The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetUserPresence (string userIdOrEmail)
        {
            
            // verify the required parameter 'userIdOrEmail' is set
            if (userIdOrEmail == null) throw new ApiException(400, "Missing required parameter 'userIdOrEmail' when calling GetUserPresence");
            

            var path = "/users/{user_id_or_email}/presence";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "user_id_or_email" + "}", ApiClient.ParameterToString(userIdOrEmail));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetUserPresence: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetUserPresence: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Get all users Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 
        /// </summary>
        /// <param name="clientGravatar">Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. </param>
        /// <param name="includeCustomProfileFields">Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase GetUsers (bool? clientGravatar, bool? includeCustomProfileFields)
        {
            

            var path = "/users";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (clientGravatar != null) queryParams.Add("client_gravatar", ApiClient.ParameterToString(clientGravatar)); // query parameter
 if (includeCustomProfileFields != null) queryParams.Add("include_custom_profile_fields", ApiClient.ParameterToString(includeCustomProfileFields)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetUsers: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetUsers: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Mute a user This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
        /// </summary>
        /// <param name="mutedUserId">The ID of the user to mute/un-mute. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess MuteUser (int? mutedUserId)
        {
            
            // verify the required parameter 'mutedUserId' is set
            if (mutedUserId == null) throw new ApiException(400, "Missing required parameter 'mutedUserId' when calling MuteUser");
            

            var path = "/users/me/muted_users/{muted_user_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "muted_user_id" + "}", ApiClient.ParameterToString(mutedUserId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling MuteUser: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling MuteUser: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Reactivate a user [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 
        /// </summary>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <returns>Object</returns>
        public Object ReactivateUser (int? userId)
        {
            
            // verify the required parameter 'userId' is set
            if (userId == null) throw new ApiException(400, "Missing required parameter 'userId' when calling ReactivateUser");
            

            var path = "/users/{user_id}/reactivate";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "user_id" + "}", ApiClient.ParameterToString(userId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ReactivateUser: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ReactivateUser: " + response.ErrorMessage, response.ErrorMessage);

            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }

        /// <summary>
        /// Delete a user group Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
        /// </summary>
        /// <param name="userGroupId">The ID of the target user group. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess RemoveUserGroup (int? userGroupId)
        {
            
            // verify the required parameter 'userGroupId' is set
            if (userGroupId == null) throw new ApiException(400, "Missing required parameter 'userGroupId' when calling RemoveUserGroup");
            

            var path = "/user_groups/{user_group_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "user_group_id" + "}", ApiClient.ParameterToString(userGroupId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling RemoveUserGroup: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling RemoveUserGroup: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Set \&quot;typing\&quot; status Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. 
        /// </summary>
        /// <param name="op">Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type. </param>
        /// <param name="to">For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). </param>
        /// <param name="type">Type of the message being composed. </param>
        /// <param name="topic">Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess SetTypingStatus (string op, List<int?> to, string type, string topic)
        {
            
            // verify the required parameter 'op' is set
            if (op == null) throw new ApiException(400, "Missing required parameter 'op' when calling SetTypingStatus");
            
            // verify the required parameter 'to' is set
            if (to == null) throw new ApiException(400, "Missing required parameter 'to' when calling SetTypingStatus");
            

            var path = "/typing";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (type != null) queryParams.Add("type", ApiClient.ParameterToString(type)); // query parameter
 if (op != null) queryParams.Add("op", ApiClient.ParameterToString(op)); // query parameter
 if (to != null) queryParams.Add("to", ApiClient.ParameterToString(to)); // query parameter
 if (topic != null) queryParams.Add("topic", ApiClient.ParameterToString(topic)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling SetTypingStatus: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling SetTypingStatus: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Unmute a user This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 
        /// </summary>
        /// <param name="mutedUserId">The ID of the user to mute/un-mute. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess UnmuteUser (int? mutedUserId)
        {
            
            // verify the required parameter 'mutedUserId' is set
            if (mutedUserId == null) throw new ApiException(400, "Missing required parameter 'mutedUserId' when calling UnmuteUser");
            

            var path = "/users/me/muted_users/{muted_user_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "muted_user_id" + "}", ApiClient.ParameterToString(mutedUserId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UnmuteUser: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UnmuteUser: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Update settings This endpoint is used to edit the current user&#39;s settings.  &#x60;PATCH {{ api_url }}/v1/settings&#x60;  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the &#x60;full_name&#x60;, &#x60;email&#x60;, &#x60;old_password&#x60;, and &#x60;new_password&#x60; parameters. Notification settings were managed by &#x60;PATCH /settings/notifications&#x60;, and all other settings by &#x60;PATCH /settings/display&#x60;. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for &#x60;/settings&#x60; in Zulip 5.0 (feature level 78).  The &#x60;/settings/display&#x60; and &#x60;/settings/notifications&#x60; endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
        /// </summary>
        /// <param name="fullName">A new display name for the user. </param>
        /// <param name="email">Asks the server to initiate a confirmation sequence to change the user&#39;s email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. </param>
        /// <param name="oldPassword">The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the &#x60;new_password&#x60; parameter. </param>
        /// <param name="newPassword">The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).  The &#x60;old_password&#x60; parameter must be included in the request. </param>
        /// <param name="twentyFourHourTime">Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="denseMode">This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="starredMessageCounts">Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="fluidLayoutWidth">Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="highContrastMode">This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="colorScheme">Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="enableDraftsSynchronization">A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). </param>
        /// <param name="translateEmoticons">Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="defaultLanguage">What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). </param>
        /// <param name="defaultView">The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). </param>
        /// <param name="leftSideUserlist">Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="emojiset">The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). </param>
        /// <param name="demoteInactiveStreams">Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. </param>
        /// <param name="timezone">The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). </param>
        /// <param name="enableStreamDesktopNotifications">Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableStreamEmailNotifications">Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableStreamPushNotifications">Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableStreamAudibleNotifications">Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="notificationSound">Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). </param>
        /// <param name="enableDesktopNotifications">Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableSounds">Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="emailNotificationsBatchingPeriodSeconds">The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) </param>
        /// <param name="enableOfflineEmailNotifications">Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableOfflinePushNotifications">Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableOnlinePushNotifications">Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableDigestEmails">Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableMarketingEmails">Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enableLoginEmails">Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="messageContentInEmailNotifications">Include the message&#39;s content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="pmContentInDesktopNotifications">Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="wildcardMentionsNotify">Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="desktopIconCountDisplay">Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="realmNameInNotifications">Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="presenceEnabled">Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. </param>
        /// <param name="enterSends">Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the &#x60;POST /users/me/enter-sends&#x60; endpoint, with the same parameter format. </param>
        /// <returns>JsonSuccessBase</returns>
        public JsonSuccessBase UpdateSettings (string fullName, string email, string oldPassword, string newPassword, bool? twentyFourHourTime, bool? denseMode, bool? starredMessageCounts, bool? fluidLayoutWidth, bool? highContrastMode, int? colorScheme, bool? enableDraftsSynchronization, bool? translateEmoticons, string defaultLanguage, string defaultView, bool? leftSideUserlist, string emojiset, int? demoteInactiveStreams, string timezone, bool? enableStreamDesktopNotifications, bool? enableStreamEmailNotifications, bool? enableStreamPushNotifications, bool? enableStreamAudibleNotifications, string notificationSound, bool? enableDesktopNotifications, bool? enableSounds, int? emailNotificationsBatchingPeriodSeconds, bool? enableOfflineEmailNotifications, bool? enableOfflinePushNotifications, bool? enableOnlinePushNotifications, bool? enableDigestEmails, bool? enableMarketingEmails, bool? enableLoginEmails, bool? messageContentInEmailNotifications, bool? pmContentInDesktopNotifications, bool? wildcardMentionsNotify, int? desktopIconCountDisplay, bool? realmNameInNotifications, bool? presenceEnabled, bool? enterSends)
        {
            

            var path = "/settings";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (fullName != null) queryParams.Add("full_name", ApiClient.ParameterToString(fullName)); // query parameter
 if (email != null) queryParams.Add("email", ApiClient.ParameterToString(email)); // query parameter
 if (oldPassword != null) queryParams.Add("old_password", ApiClient.ParameterToString(oldPassword)); // query parameter
 if (newPassword != null) queryParams.Add("new_password", ApiClient.ParameterToString(newPassword)); // query parameter
 if (twentyFourHourTime != null) queryParams.Add("twenty_four_hour_time", ApiClient.ParameterToString(twentyFourHourTime)); // query parameter
 if (denseMode != null) queryParams.Add("dense_mode", ApiClient.ParameterToString(denseMode)); // query parameter
 if (starredMessageCounts != null) queryParams.Add("starred_message_counts", ApiClient.ParameterToString(starredMessageCounts)); // query parameter
 if (fluidLayoutWidth != null) queryParams.Add("fluid_layout_width", ApiClient.ParameterToString(fluidLayoutWidth)); // query parameter
 if (highContrastMode != null) queryParams.Add("high_contrast_mode", ApiClient.ParameterToString(highContrastMode)); // query parameter
 if (colorScheme != null) queryParams.Add("color_scheme", ApiClient.ParameterToString(colorScheme)); // query parameter
 if (enableDraftsSynchronization != null) queryParams.Add("enable_drafts_synchronization", ApiClient.ParameterToString(enableDraftsSynchronization)); // query parameter
 if (translateEmoticons != null) queryParams.Add("translate_emoticons", ApiClient.ParameterToString(translateEmoticons)); // query parameter
 if (defaultLanguage != null) queryParams.Add("default_language", ApiClient.ParameterToString(defaultLanguage)); // query parameter
 if (defaultView != null) queryParams.Add("default_view", ApiClient.ParameterToString(defaultView)); // query parameter
 if (leftSideUserlist != null) queryParams.Add("left_side_userlist", ApiClient.ParameterToString(leftSideUserlist)); // query parameter
 if (emojiset != null) queryParams.Add("emojiset", ApiClient.ParameterToString(emojiset)); // query parameter
 if (demoteInactiveStreams != null) queryParams.Add("demote_inactive_streams", ApiClient.ParameterToString(demoteInactiveStreams)); // query parameter
 if (timezone != null) queryParams.Add("timezone", ApiClient.ParameterToString(timezone)); // query parameter
 if (enableStreamDesktopNotifications != null) queryParams.Add("enable_stream_desktop_notifications", ApiClient.ParameterToString(enableStreamDesktopNotifications)); // query parameter
 if (enableStreamEmailNotifications != null) queryParams.Add("enable_stream_email_notifications", ApiClient.ParameterToString(enableStreamEmailNotifications)); // query parameter
 if (enableStreamPushNotifications != null) queryParams.Add("enable_stream_push_notifications", ApiClient.ParameterToString(enableStreamPushNotifications)); // query parameter
 if (enableStreamAudibleNotifications != null) queryParams.Add("enable_stream_audible_notifications", ApiClient.ParameterToString(enableStreamAudibleNotifications)); // query parameter
 if (notificationSound != null) queryParams.Add("notification_sound", ApiClient.ParameterToString(notificationSound)); // query parameter
 if (enableDesktopNotifications != null) queryParams.Add("enable_desktop_notifications", ApiClient.ParameterToString(enableDesktopNotifications)); // query parameter
 if (enableSounds != null) queryParams.Add("enable_sounds", ApiClient.ParameterToString(enableSounds)); // query parameter
 if (emailNotificationsBatchingPeriodSeconds != null) queryParams.Add("email_notifications_batching_period_seconds", ApiClient.ParameterToString(emailNotificationsBatchingPeriodSeconds)); // query parameter
 if (enableOfflineEmailNotifications != null) queryParams.Add("enable_offline_email_notifications", ApiClient.ParameterToString(enableOfflineEmailNotifications)); // query parameter
 if (enableOfflinePushNotifications != null) queryParams.Add("enable_offline_push_notifications", ApiClient.ParameterToString(enableOfflinePushNotifications)); // query parameter
 if (enableOnlinePushNotifications != null) queryParams.Add("enable_online_push_notifications", ApiClient.ParameterToString(enableOnlinePushNotifications)); // query parameter
 if (enableDigestEmails != null) queryParams.Add("enable_digest_emails", ApiClient.ParameterToString(enableDigestEmails)); // query parameter
 if (enableMarketingEmails != null) queryParams.Add("enable_marketing_emails", ApiClient.ParameterToString(enableMarketingEmails)); // query parameter
 if (enableLoginEmails != null) queryParams.Add("enable_login_emails", ApiClient.ParameterToString(enableLoginEmails)); // query parameter
 if (messageContentInEmailNotifications != null) queryParams.Add("message_content_in_email_notifications", ApiClient.ParameterToString(messageContentInEmailNotifications)); // query parameter
 if (pmContentInDesktopNotifications != null) queryParams.Add("pm_content_in_desktop_notifications", ApiClient.ParameterToString(pmContentInDesktopNotifications)); // query parameter
 if (wildcardMentionsNotify != null) queryParams.Add("wildcard_mentions_notify", ApiClient.ParameterToString(wildcardMentionsNotify)); // query parameter
 if (desktopIconCountDisplay != null) queryParams.Add("desktop_icon_count_display", ApiClient.ParameterToString(desktopIconCountDisplay)); // query parameter
 if (realmNameInNotifications != null) queryParams.Add("realm_name_in_notifications", ApiClient.ParameterToString(realmNameInNotifications)); // query parameter
 if (presenceEnabled != null) queryParams.Add("presence_enabled", ApiClient.ParameterToString(presenceEnabled)); // query parameter
 if (enterSends != null) queryParams.Add("enter_sends", ApiClient.ParameterToString(enterSends)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateSettings: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateSettings: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccessBase) ApiClient.Deserialize(response.Content, typeof(JsonSuccessBase), response.Headers);
        }

        /// <summary>
        /// Update your status Change your [status](/help/status-and-availability).  &#x60;POST {{ api_url }}/v1/users/me/status&#x60;  A request to this endpoint will only change the parameters passed. For example, passing just &#x60;status_text&#x60; requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user&#39;s status to a specific value should pass all supported parameters. 
        /// </summary>
        /// <param name="statusText">The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters. </param>
        /// <param name="away">Whether the user should be marked as \&quot;away\&quot;. </param>
        /// <param name="emojiName">The name for the emoji to associate with this status. </param>
        /// <param name="emojiCode">A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. </param>
        /// <param name="reactionType">One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess UpdateStatus (string statusText, bool? away, string emojiName, string emojiCode, string reactionType)
        {
            

            var path = "/users/me/status";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (statusText != null) queryParams.Add("status_text", ApiClient.ParameterToString(statusText)); // query parameter
 if (away != null) queryParams.Add("away", ApiClient.ParameterToString(away)); // query parameter
 if (emojiName != null) queryParams.Add("emoji_name", ApiClient.ParameterToString(emojiName)); // query parameter
 if (emojiCode != null) queryParams.Add("emoji_code", ApiClient.ParameterToString(emojiCode)); // query parameter
 if (reactionType != null) queryParams.Add("reaction_type", ApiClient.ParameterToString(reactionType)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateStatus: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateStatus: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Update a user Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
        /// </summary>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <param name="fullName">The user&#39;s full name. </param>
        /// <param name="role">New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). </param>
        /// <param name="profileData">A dictionary containing the to be updated custom profile field data for the user. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess UpdateUser (int? userId, string fullName, int? role, List<Object> profileData)
        {
            
            // verify the required parameter 'userId' is set
            if (userId == null) throw new ApiException(400, "Missing required parameter 'userId' when calling UpdateUser");
            

            var path = "/users/{user_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "user_id" + "}", ApiClient.ParameterToString(userId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (fullName != null) queryParams.Add("full_name", ApiClient.ParameterToString(fullName)); // query parameter
 if (role != null) queryParams.Add("role", ApiClient.ParameterToString(role)); // query parameter
 if (profileData != null) queryParams.Add("profile_data", ApiClient.ParameterToString(profileData)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateUser: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateUser: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Update a user group Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
        /// </summary>
        /// <param name="userGroupId">The ID of the target user group. </param>
        /// <param name="name">The new name of the group. </param>
        /// <param name="description">The new description of the group. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess UpdateUserGroup (int? userGroupId, string name, string description)
        {
            
            // verify the required parameter 'userGroupId' is set
            if (userGroupId == null) throw new ApiException(400, "Missing required parameter 'userGroupId' when calling UpdateUserGroup");
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling UpdateUserGroup");
            
            // verify the required parameter 'description' is set
            if (description == null) throw new ApiException(400, "Missing required parameter 'description' when calling UpdateUserGroup");
            

            var path = "/user_groups/{user_group_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "user_group_id" + "}", ApiClient.ParameterToString(userGroupId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (name != null) queryParams.Add("name", ApiClient.ParameterToString(name)); // query parameter
 if (description != null) queryParams.Add("description", ApiClient.ParameterToString(description)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateUserGroup: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateUserGroup: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

        /// <summary>
        /// Update user group members Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 
        /// </summary>
        /// <param name="userGroupId">The ID of the target user group. </param>
        /// <param name="delete">The list of user ids to be removed from the user group. </param>
        /// <param name="add">The list of user ids to be added to the user group. </param>
        /// <returns>JsonSuccess</returns>
        public JsonSuccess UpdateUserGroupMembers (int? userGroupId, List<int?> delete, List<int?> add)
        {
            
            // verify the required parameter 'userGroupId' is set
            if (userGroupId == null) throw new ApiException(400, "Missing required parameter 'userGroupId' when calling UpdateUserGroupMembers");
            

            var path = "/user_groups/{user_group_id}/members";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "user_group_id" + "}", ApiClient.ParameterToString(userGroupId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (delete != null) queryParams.Add("delete", ApiClient.ParameterToString(delete)); // query parameter
 if (add != null) queryParams.Add("add", ApiClient.ParameterToString(add)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateUserGroupMembers: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateUserGroupMembers: " + response.ErrorMessage, response.ErrorMessage);

            return (JsonSuccess) ApiClient.Deserialize(response.Content, typeof(JsonSuccess), response.Headers);
        }

    }
}
