package api

import play.api.libs.json._
import model.CodedError
import model.JsObject
import model.JsonError
import model.JsonSuccess
import model.JsonSuccessBase
import model.OasAnyTypeNotMapped
import model.OneOfobjectobject
import model.OneOfobjectobjectobject
import model.OneOfobjectobjectobjectobjectobjectobject

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:23:09.886767Z[Etc/UTC]")
trait UsersApi {
  /**
    * Create a user
    * {!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 
    * @param email The email address of the new user. 
    * @param password The password of the new user. 
    * @param fullName The full name of the new user. 
    */
  def createUser(email: String, password: String, fullName: String): JsonSuccessBase

  /**
    * Create a user group
    * Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 
    * @param name The name of the user group. 
    * @param description The description of the user group. 
    * @param members An array containing the user IDs of the initial members for the new user group. 
    */
  def createUserGroup(name: String, description: String, members: List[Int]): JsonSuccess

  /**
    * Deactivate own user
    * Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
    */
  def deactivateOwnUser(): JsonSuccess

  /**
    * Deactivate a user
    * [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 
    * @param userId The target user&#39;s ID. 
    */
  def deactivateUser(userId: Int): JsonSuccess

  /**
    * Get attachments
    * Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 
    */
  def getAttachments(): JsonSuccessBase

  /**
    * Get own user
    * Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; 
    */
  def getOwnUser(): JsonSuccessBase

  /**
    * Get a user
    * Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
    * @param userId The target user&#39;s ID. 
    * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
    * @param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
    */
  def getUser(userId: Int, clientGravatar: Option[Boolean], includeCustomProfileFields: Option[Boolean]): JsonSuccessBase

  /**
    * Get a user by email
    * Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
    * @param email The email address of the user whose details you want to fetch. 
    * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
    * @param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
    */
  def getUserByEmail(email: String, clientGravatar: Option[Boolean], includeCustomProfileFields: Option[Boolean]): JsonSuccessBase

  /**
    * Get user groups
    * {!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 
    */
  def getUserGroups(): JsonSuccessBase

  /**
    * Get user presence
    * Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
    * @param userIdOrEmail The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 
    */
  def getUserPresence(userIdOrEmail: String): JsonSuccessBase

  /**
    * Get all users
    * Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 
    * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
    * @param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
    */
  def getUsers(clientGravatar: Option[Boolean], includeCustomProfileFields: Option[Boolean]): JsonSuccessBase

  /**
    * Mute a user
    * This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
    * @param mutedUserId The ID of the user to mute/un-mute. 
    */
  def muteUser(mutedUserId: Int): JsonSuccess

  /**
    * Reactivate a user
    * [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 
    * @param userId The target user&#39;s ID. 
    */
  def reactivateUser(userId: Int): OasAnyTypeNotMapped

  /**
    * Delete a user group
    * Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
    * @param userGroupId The ID of the target user group. 
    */
  def removeUserGroup(userGroupId: Int): JsonSuccess

  /**
    * Set \&quot;typing\&quot; status
    * Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. 
    * @param op Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type. 
    * @param to For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
    * @param `type` Type of the message being composed. 
    * @param topic Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type. 
    */
  def setTypingStatus(op: String, to: List[Int], `type`: Option[String], topic: Option[String]): JsonSuccess

  /**
    * Unmute a user
    * This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 
    * @param mutedUserId The ID of the user to mute/un-mute. 
    */
  def unmuteUser(mutedUserId: Int): JsonSuccess

  /**
    * Update settings
    * This endpoint is used to edit the current user&#39;s settings.  &#x60;PATCH {{ api_url }}/v1/settings&#x60;  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the &#x60;full_name&#x60;, &#x60;email&#x60;, &#x60;old_password&#x60;, and &#x60;new_password&#x60; parameters. Notification settings were managed by &#x60;PATCH /settings/notifications&#x60;, and all other settings by &#x60;PATCH /settings/display&#x60;. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for &#x60;/settings&#x60; in Zulip 5.0 (feature level 78).  The &#x60;/settings/display&#x60; and &#x60;/settings/notifications&#x60; endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
    * @param fullName A new display name for the user. 
    * @param email Asks the server to initiate a confirmation sequence to change the user&#39;s email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. 
    * @param oldPassword The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the &#x60;new_password&#x60; parameter. 
    * @param newPassword The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).  The &#x60;old_password&#x60; parameter must be included in the request. 
    * @param twentyFourHourTime Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
    * @param denseMode This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
    * @param starredMessageCounts Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
    * @param fluidLayoutWidth Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
    * @param highContrastMode This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
    * @param colorScheme Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
    * @param enableDraftsSynchronization A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). 
    * @param translateEmoticons Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
    * @param defaultLanguage What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
    * @param defaultView The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
    * @param leftSideUserlist Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
    * @param emojiset The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
    * @param demoteInactiveStreams Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. 
    * @param timezone The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
    * @param enableStreamDesktopNotifications Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param enableStreamEmailNotifications Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param enableStreamPushNotifications Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param enableStreamAudibleNotifications Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param notificationSound Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
    * @param enableDesktopNotifications Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param enableSounds Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param emailNotificationsBatchingPeriodSeconds The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) 
    * @param enableOfflineEmailNotifications Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param enableOfflinePushNotifications Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param enableOnlinePushNotifications Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param enableDigestEmails Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param enableMarketingEmails Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param enableLoginEmails Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param messageContentInEmailNotifications Include the message&#39;s content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param pmContentInDesktopNotifications Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param wildcardMentionsNotify Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param desktopIconCountDisplay Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param realmNameInNotifications Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param presenceEnabled Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. 
    * @param enterSends Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the &#x60;POST /users/me/enter-sends&#x60; endpoint, with the same parameter format. 
    */
  def updateSettings(fullName: Option[String], email: Option[String], oldPassword: Option[String], newPassword: Option[String], twentyFourHourTime: Option[Boolean], denseMode: Option[Boolean], starredMessageCounts: Option[Boolean], fluidLayoutWidth: Option[Boolean], highContrastMode: Option[Boolean], colorScheme: Option[Int], enableDraftsSynchronization: Option[Boolean], translateEmoticons: Option[Boolean], defaultLanguage: Option[String], defaultView: Option[String], leftSideUserlist: Option[Boolean], emojiset: Option[String], demoteInactiveStreams: Option[Int], timezone: Option[String], enableStreamDesktopNotifications: Option[Boolean], enableStreamEmailNotifications: Option[Boolean], enableStreamPushNotifications: Option[Boolean], enableStreamAudibleNotifications: Option[Boolean], notificationSound: Option[String], enableDesktopNotifications: Option[Boolean], enableSounds: Option[Boolean], emailNotificationsBatchingPeriodSeconds: Option[Int], enableOfflineEmailNotifications: Option[Boolean], enableOfflinePushNotifications: Option[Boolean], enableOnlinePushNotifications: Option[Boolean], enableDigestEmails: Option[Boolean], enableMarketingEmails: Option[Boolean], enableLoginEmails: Option[Boolean], messageContentInEmailNotifications: Option[Boolean], pmContentInDesktopNotifications: Option[Boolean], wildcardMentionsNotify: Option[Boolean], desktopIconCountDisplay: Option[Int], realmNameInNotifications: Option[Boolean], presenceEnabled: Option[Boolean], enterSends: Option[Boolean]): JsonSuccessBase

  /**
    * Update your status
    * Change your [status](/help/status-and-availability).  &#x60;POST {{ api_url }}/v1/users/me/status&#x60;  A request to this endpoint will only change the parameters passed. For example, passing just &#x60;status_text&#x60; requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user&#39;s status to a specific value should pass all supported parameters. 
    * @param statusText The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters. 
    * @param away Whether the user should be marked as \&quot;away\&quot;. 
    * @param emojiName The name for the emoji to associate with this status. 
    * @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. 
    * @param reactionType One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. 
    */
  def updateStatus(statusText: Option[String], away: Option[Boolean], emojiName: Option[String], emojiCode: Option[String], reactionType: Option[String]): JsonSuccess

  /**
    * Update a user
    * Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
    * @param userId The target user&#39;s ID. 
    * @param fullName The user&#39;s full name. 
    * @param role New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
    * @param profileData A dictionary containing the to be updated custom profile field data for the user. 
    */
  def updateUser(userId: Int, fullName: Option[String], role: Option[Int], profileData: Option[List[JsObject]]): JsonSuccess

  /**
    * Update a user group
    * Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
    * @param userGroupId The ID of the target user group. 
    * @param name The new name of the group. 
    * @param description The new description of the group. 
    */
  def updateUserGroup(userGroupId: Int, name: String, description: String): JsonSuccess

  /**
    * Update user group members
    * Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 
    * @param userGroupId The ID of the target user group. 
    * @param delete The list of user ids to be removed from the user group. 
    * @param add The list of user ids to be added to the user group. 
    */
  def updateUserGroupMembers(userGroupId: Int, delete: Option[List[Int]], add: Option[List[Int]]): JsonSuccess
}
