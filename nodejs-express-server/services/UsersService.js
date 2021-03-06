/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create a user
* {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
*
* email String The email address of the new user. 
* password String The password of the new user. 
* fullUnderscorename String The full name of the new user. 
* returns JsonSuccessBase
* */
const createUser = ({ email, password, fullUnderscorename }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        email,
        password,
        fullUnderscorename,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create a user group
* Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
*
* name String The name of the user group. 
* description String The description of the user group. 
* members List An array containing the user IDs of the initial members for the new user group. 
* returns JsonSuccess
* */
const createUserGroup = ({ name, description, members }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        description,
        members,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Deactivate own user
* Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
*
* returns JsonSuccess
* */
const deactivateOwnUser = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Deactivate a user
* [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
*
* userUnderscoreid Integer The target user's ID. 
* returns JsonSuccess
* */
const deactivateUser = ({ userUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get attachments
* Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
*
* returns JsonSuccessBase
* */
const getAttachments = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get own user
* Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
*
* returns JsonSuccessBase
* */
const getOwnUser = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get a user
* Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
*
* userUnderscoreid Integer The target user's ID. 
* clientUnderscoregravatar Boolean Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional)
* includeUnderscorecustomUnderscoreprofileUnderscorefields Boolean Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional)
* returns JsonSuccessBase
* */
const getUser = ({ userUnderscoreid, clientUnderscoregravatar, includeUnderscorecustomUnderscoreprofileUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
        clientUnderscoregravatar,
        includeUnderscorecustomUnderscoreprofileUnderscorefields,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get a user by email
* Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
*
* email String The email address of the user whose details you want to fetch. 
* clientUnderscoregravatar Boolean Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional)
* includeUnderscorecustomUnderscoreprofileUnderscorefields Boolean Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional)
* returns JsonSuccessBase
* */
const getUserByEmail = ({ email, clientUnderscoregravatar, includeUnderscorecustomUnderscoreprofileUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        email,
        clientUnderscoregravatar,
        includeUnderscorecustomUnderscoreprofileUnderscorefields,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get user groups
* {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
*
* returns JsonSuccessBase
* */
const getUserGroups = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get user presence
* Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
*
* userUnderscoreidUnderscoreorUnderscoreemail String The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 
* returns JsonSuccessBase
* */
const getUserPresence = ({ userUnderscoreidUnderscoreorUnderscoreemail }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreidUnderscoreorUnderscoreemail,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get all users
* Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
*
* clientUnderscoregravatar Boolean Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional)
* includeUnderscorecustomUnderscoreprofileUnderscorefields Boolean Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional)
* returns JsonSuccessBase
* */
const getUsers = ({ clientUnderscoregravatar, includeUnderscorecustomUnderscoreprofileUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        clientUnderscoregravatar,
        includeUnderscorecustomUnderscoreprofileUnderscorefields,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Mute a user
* This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
*
* mutedUnderscoreuserUnderscoreid Integer The ID of the user to mute/un-mute. 
* returns JsonSuccess
* */
const muteUser = ({ mutedUnderscoreuserUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        mutedUnderscoreuserUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Reactivate a user
* [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
*
* userUnderscoreid Integer The target user's ID. 
* returns oas_any_type_not_mapped
* */
const reactivateUser = ({ userUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete a user group
* Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
*
* userUnderscoregroupUnderscoreid Integer The ID of the target user group. 
* returns JsonSuccess
* */
const removeUserGroup = ({ userUnderscoregroupUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoregroupUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Set \"typing\" status
* Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
*
* op String Whether the user has started (`start`) or stopped (`stop`) to type. 
* to List For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
* type String Type of the message being composed.  (optional)
* topic String Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type.  (optional)
* returns JsonSuccess
* */
const setTypingStatus = ({ op, to, type, topic }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        op,
        to,
        type,
        topic,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Unmute a user
* This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
*
* mutedUnderscoreuserUnderscoreid Integer The ID of the user to mute/un-mute. 
* returns JsonSuccess
* */
const unmuteUser = ({ mutedUnderscoreuserUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        mutedUnderscoreuserUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update settings
* This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
*
* fullUnderscorename String A new display name for the user.  (optional)
* email String Asks the server to initiate a confirmation sequence to change the user's email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address.  (optional)
* oldUnderscorepassword String The user's old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the `new_password` parameter.  (optional)
* newUnderscorepassword String The user's new Zulip password (or LDAP password, if LDAP authentication is in use).  The `old_password` parameter must be included in the request.  (optional)
* twentyUnderscorefourUnderscorehourUnderscoretime Boolean Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
* denseUnderscoremode Boolean This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
* starredUnderscoremessageUnderscorecounts Boolean Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
* fluidUnderscorelayoutUnderscorewidth Boolean Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
* highUnderscorecontrastUnderscoremode Boolean This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
* colorUnderscorescheme Integer Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
* enableUnderscoredraftsUnderscoresynchronization Boolean A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87).  (optional)
* translateUnderscoreemoticons Boolean Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
* defaultUnderscorelanguage String What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  (optional)
* defaultUnderscoreview String The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
* leftUnderscoresideUnderscoreuserlist Boolean Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
* emojiset String The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
* demoteUnderscoreinactiveUnderscorestreams Integer Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
* timezone String The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
* enableUnderscorestreamUnderscoredesktopUnderscorenotifications Boolean Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* enableUnderscorestreamUnderscoreemailUnderscorenotifications Boolean Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* enableUnderscorestreamUnderscorepushUnderscorenotifications Boolean Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* enableUnderscorestreamUnderscoreaudibleUnderscorenotifications Boolean Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* notificationUnderscoresound String Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  (optional)
* enableUnderscoredesktopUnderscorenotifications Boolean Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* enableUnderscoresounds Boolean Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* emailUnderscorenotificationsUnderscorebatchingUnderscoreperiodUnderscoreseconds Integer The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82)  (optional)
* enableUnderscoreofflineUnderscoreemailUnderscorenotifications Boolean Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* enableUnderscoreofflineUnderscorepushUnderscorenotifications Boolean Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* enableUnderscoreonlineUnderscorepushUnderscorenotifications Boolean Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* enableUnderscoredigestUnderscoreemails Boolean Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* enableUnderscoremarketingUnderscoreemails Boolean Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* enableUnderscoreloginUnderscoreemails Boolean Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* messageUnderscorecontentUnderscoreinUnderscoreemailUnderscorenotifications Boolean Include the message's content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* pmUnderscorecontentUnderscoreinUnderscoredesktopUnderscorenotifications Boolean Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* wildcardUnderscorementionsUnderscorenotify Boolean Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* desktopUnderscoreiconUnderscorecountUnderscoredisplay Integer Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* realmUnderscorenameUnderscoreinUnderscorenotifications Boolean Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* presenceUnderscoreenabled Boolean Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
* enterUnderscoresends Boolean Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the `POST /users/me/enter-sends` endpoint, with the same parameter format.  (optional)
* returns JsonSuccessBase
* */
const updateSettings = ({ fullUnderscorename, email, oldUnderscorepassword, newUnderscorepassword, twentyUnderscorefourUnderscorehourUnderscoretime, denseUnderscoremode, starredUnderscoremessageUnderscorecounts, fluidUnderscorelayoutUnderscorewidth, highUnderscorecontrastUnderscoremode, colorUnderscorescheme, enableUnderscoredraftsUnderscoresynchronization, translateUnderscoreemoticons, defaultUnderscorelanguage, defaultUnderscoreview, leftUnderscoresideUnderscoreuserlist, emojiset, demoteUnderscoreinactiveUnderscorestreams, timezone, enableUnderscorestreamUnderscoredesktopUnderscorenotifications, enableUnderscorestreamUnderscoreemailUnderscorenotifications, enableUnderscorestreamUnderscorepushUnderscorenotifications, enableUnderscorestreamUnderscoreaudibleUnderscorenotifications, notificationUnderscoresound, enableUnderscoredesktopUnderscorenotifications, enableUnderscoresounds, emailUnderscorenotificationsUnderscorebatchingUnderscoreperiodUnderscoreseconds, enableUnderscoreofflineUnderscoreemailUnderscorenotifications, enableUnderscoreofflineUnderscorepushUnderscorenotifications, enableUnderscoreonlineUnderscorepushUnderscorenotifications, enableUnderscoredigestUnderscoreemails, enableUnderscoremarketingUnderscoreemails, enableUnderscoreloginUnderscoreemails, messageUnderscorecontentUnderscoreinUnderscoreemailUnderscorenotifications, pmUnderscorecontentUnderscoreinUnderscoredesktopUnderscorenotifications, wildcardUnderscorementionsUnderscorenotify, desktopUnderscoreiconUnderscorecountUnderscoredisplay, realmUnderscorenameUnderscoreinUnderscorenotifications, presenceUnderscoreenabled, enterUnderscoresends }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fullUnderscorename,
        email,
        oldUnderscorepassword,
        newUnderscorepassword,
        twentyUnderscorefourUnderscorehourUnderscoretime,
        denseUnderscoremode,
        starredUnderscoremessageUnderscorecounts,
        fluidUnderscorelayoutUnderscorewidth,
        highUnderscorecontrastUnderscoremode,
        colorUnderscorescheme,
        enableUnderscoredraftsUnderscoresynchronization,
        translateUnderscoreemoticons,
        defaultUnderscorelanguage,
        defaultUnderscoreview,
        leftUnderscoresideUnderscoreuserlist,
        emojiset,
        demoteUnderscoreinactiveUnderscorestreams,
        timezone,
        enableUnderscorestreamUnderscoredesktopUnderscorenotifications,
        enableUnderscorestreamUnderscoreemailUnderscorenotifications,
        enableUnderscorestreamUnderscorepushUnderscorenotifications,
        enableUnderscorestreamUnderscoreaudibleUnderscorenotifications,
        notificationUnderscoresound,
        enableUnderscoredesktopUnderscorenotifications,
        enableUnderscoresounds,
        emailUnderscorenotificationsUnderscorebatchingUnderscoreperiodUnderscoreseconds,
        enableUnderscoreofflineUnderscoreemailUnderscorenotifications,
        enableUnderscoreofflineUnderscorepushUnderscorenotifications,
        enableUnderscoreonlineUnderscorepushUnderscorenotifications,
        enableUnderscoredigestUnderscoreemails,
        enableUnderscoremarketingUnderscoreemails,
        enableUnderscoreloginUnderscoreemails,
        messageUnderscorecontentUnderscoreinUnderscoreemailUnderscorenotifications,
        pmUnderscorecontentUnderscoreinUnderscoredesktopUnderscorenotifications,
        wildcardUnderscorementionsUnderscorenotify,
        desktopUnderscoreiconUnderscorecountUnderscoredisplay,
        realmUnderscorenameUnderscoreinUnderscorenotifications,
        presenceUnderscoreenabled,
        enterUnderscoresends,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update your status
* Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 
*
* statusUnderscoretext String The text content of the status message. Sending the empty string will clear the user's status.  **Note**: The limit on the size of the message is 60 characters.  (optional)
* away Boolean Whether the user should be marked as \"away\".  (optional)
* emojiUnderscorename String The name for the emoji to associate with this status.  (optional)
* emojiUnderscorecode String A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji.  (optional)
* reactionUnderscoretype String One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.  (optional)
* returns JsonSuccess
* */
const updateStatus = ({ statusUnderscoretext, away, emojiUnderscorename, emojiUnderscorecode, reactionUnderscoretype }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        statusUnderscoretext,
        away,
        emojiUnderscorename,
        emojiUnderscorecode,
        reactionUnderscoretype,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update a user
* Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
*
* userUnderscoreid Integer The target user's ID. 
* fullUnderscorename String The user's full name.  (optional)
* role Integer New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  (optional)
* profileUnderscoredata List A dictionary containing the to be updated custom profile field data for the user.  (optional)
* returns JsonSuccess
* */
const updateUser = ({ userUnderscoreid, fullUnderscorename, role, profileUnderscoredata }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
        fullUnderscorename,
        role,
        profileUnderscoredata,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update a user group
* Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
*
* userUnderscoregroupUnderscoreid Integer The ID of the target user group. 
* name String The new name of the group. 
* description String The new description of the group. 
* returns JsonSuccess
* */
const updateUserGroup = ({ userUnderscoregroupUnderscoreid, name, description }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoregroupUnderscoreid,
        name,
        description,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update user group members
* Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
*
* userUnderscoregroupUnderscoreid Integer The ID of the target user group. 
* _delete List The list of user ids to be removed from the user group.  (optional)
* add List The list of user ids to be added to the user group.  (optional)
* returns JsonSuccess
* */
const updateUserGroupMembers = ({ userUnderscoregroupUnderscoreid, _delete, add }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoregroupUnderscoreid,
        _delete,
        add,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  createUser,
  createUserGroup,
  deactivateOwnUser,
  deactivateUser,
  getAttachments,
  getOwnUser,
  getUser,
  getUserByEmail,
  getUserGroups,
  getUserPresence,
  getUsers,
  muteUser,
  reactivateUser,
  removeUserGroup,
  setTypingStatus,
  unmuteUser,
  updateSettings,
  updateStatus,
  updateUser,
  updateUserGroup,
  updateUserGroupMembers,
};
