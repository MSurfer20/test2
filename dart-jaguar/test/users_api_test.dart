import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for UsersApi
void main() {
  var instance = new UsersApi();

  group('tests for UsersApi', () {
    // Create a user
    //
    // {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
    //
    //Future<JsonSuccessBase> createUser(String email, String password, String fullName) async
    test('test createUser', () async {
      // TODO
    });

    // Create a user group
    //
    // Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
    //
    //Future<JsonSuccess> createUserGroup(String name, String description, List<int> members) async
    test('test createUserGroup', () async {
      // TODO
    });

    // Deactivate own user
    //
    // Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
    //
    //Future<JsonSuccess> deactivateOwnUser() async
    test('test deactivateOwnUser', () async {
      // TODO
    });

    // Deactivate a user
    //
    // [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
    //
    //Future<JsonSuccess> deactivateUser(int userId) async
    test('test deactivateUser', () async {
      // TODO
    });

    // Get attachments
    //
    // Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
    //
    //Future<JsonSuccessBase> getAttachments() async
    test('test getAttachments', () async {
      // TODO
    });

    // Get own user
    //
    // Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
    //
    //Future<JsonSuccessBase> getOwnUser() async
    test('test getOwnUser', () async {
      // TODO
    });

    // Get a user
    //
    // Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
    //
    //Future<JsonSuccessBase> getUser(int userId, { bool clientGravatar, bool includeCustomProfileFields }) async
    test('test getUser', () async {
      // TODO
    });

    // Get a user by email
    //
    // Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
    //
    //Future<JsonSuccessBase> getUserByEmail(String email, { bool clientGravatar, bool includeCustomProfileFields }) async
    test('test getUserByEmail', () async {
      // TODO
    });

    // Get user groups
    //
    // {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
    //
    //Future<JsonSuccessBase> getUserGroups() async
    test('test getUserGroups', () async {
      // TODO
    });

    // Get user presence
    //
    // Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
    //
    //Future<JsonSuccessBase> getUserPresence(String userIdOrEmail) async
    test('test getUserPresence', () async {
      // TODO
    });

    // Get all users
    //
    // Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
    //
    //Future<JsonSuccessBase> getUsers({ bool clientGravatar, bool includeCustomProfileFields }) async
    test('test getUsers', () async {
      // TODO
    });

    // Mute a user
    //
    // This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
    //
    //Future<JsonSuccess> muteUser(int mutedUserId) async
    test('test muteUser', () async {
      // TODO
    });

    // Reactivate a user
    //
    // [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
    //
    //Future<Object> reactivateUser(int userId) async
    test('test reactivateUser', () async {
      // TODO
    });

    // Delete a user group
    //
    // Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
    //
    //Future<JsonSuccess> removeUserGroup(int userGroupId) async
    test('test removeUserGroup', () async {
      // TODO
    });

    // Set \"typing\" status
    //
    // Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
    //
    //Future<JsonSuccess> setTypingStatus(String op, List<int> to, { String type, String topic }) async
    test('test setTypingStatus', () async {
      // TODO
    });

    // Unmute a user
    //
    // This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
    //
    //Future<JsonSuccess> unmuteUser(int mutedUserId) async
    test('test unmuteUser', () async {
      // TODO
    });

    // Update display settings
    //
    // This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display` 
    //
    //Future<JsonSuccessBase> updateDisplaySettings({ bool twentyFourHourTime, bool denseMode, bool starredMessageCounts, bool fluidLayoutWidth, bool highContrastMode, int colorScheme, bool translateEmoticons, String defaultLanguage, String defaultView, bool leftSideUserlist, String emojiset, int demoteInactiveStreams, String timezone }) async
    test('test updateDisplaySettings', () async {
      // TODO
    });

    // Update notification settings
    //
    // This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications` 
    //
    //Future<JsonSuccessBase> updateNotificationSettings({ bool enableStreamDesktopNotifications, bool enableStreamEmailNotifications, bool enableStreamPushNotifications, bool enableStreamAudibleNotifications, String notificationSound, bool enableDesktopNotifications, bool enableSounds, bool enableOfflineEmailNotifications, bool enableOfflinePushNotifications, bool enableOnlinePushNotifications, bool enableDigestEmails, bool enableMarketingEmails, bool enableLoginEmails, bool messageContentInEmailNotifications, bool pmContentInDesktopNotifications, bool wildcardMentionsNotify, int desktopIconCountDisplay, bool realmNameInNotifications, bool presenceEnabled }) async
    test('test updateNotificationSettings', () async {
      // TODO
    });

    // Update a user
    //
    // Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
    //
    //Future<JsonSuccess> updateUser(int userId, { String fullName, int role, List<Object> profileData }) async
    test('test updateUser', () async {
      // TODO
    });

    // Update a user group
    //
    // Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
    //
    //Future<JsonSuccess> updateUserGroup(int userGroupId, String name, String description) async
    test('test updateUserGroup', () async {
      // TODO
    });

    // Update user group members
    //
    // Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
    //
    //Future<JsonSuccess> updateUserGroupMembers(int userGroupId, { List<int> delete, List<int> add }) async
    test('test updateUserGroupMembers', () async {
      // TODO
    });

  });
}
