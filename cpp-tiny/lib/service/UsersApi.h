#ifndef TINY_CPP_CLIENT_UsersApi_H_
#define TINY_CPP_CLIENT_UsersApi_H_


#include "Response.h"
#include "Arduino.h"
#include "AbstractService.h"
#include "Helpers.h"
#include <list>

#include "AnyType.h"
#include "CodedError.h"
#include "JsonError.h"
#include "JsonSuccess.h"
#include "JsonSuccessBase.h"
#include "Object.h"
#include "OneOf<object,object,object>.h"
#include "OneOf<object,object>.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class UsersApi : public AbstractService {
public:
    UsersApi() = default;

    virtual ~UsersApi() = default;

    /**
    * Create a user.
    *
    * {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
    * \param email The email address of the new user.  *Required*
    * \param password The password of the new user.  *Required*
    * \param fullName The full name of the new user.  *Required*
    */
    Response<
                JsonSuccessBase
        >
    createUser(
            
            std::string email
            , 
            
            std::string password
            , 
            
            std::string fullName
            
    );
    /**
    * Create a user group.
    *
    * Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
    * \param name The name of the user group.  *Required*
    * \param description The description of the user group.  *Required*
    * \param members An array containing the user IDs of the initial members for the new user group.  *Required*
    */
    Response<
                JsonSuccess
        >
    createUserGroup(
            
            std::string name
            , 
            
            std::string description
            , 
            std::list<int> members
            
            
    );
    /**
    * Deactivate own user.
    *
    * Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
    */
    Response<
                JsonSuccess
        >
    deactivateOwnUser(
    );
    /**
    * Deactivate a user.
    *
    * [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
    * \param userId The target user's ID.  *Required*
    */
    Response<
                JsonSuccess
        >
    deactivateUser(
            
            int userId
            
    );
    /**
    * Get attachments.
    *
    * Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
    */
    Response<
                JsonSuccessBase
        >
    getAttachments(
    );
    /**
    * Get own user.
    *
    * Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
    */
    Response<
                JsonSuccessBase
        >
    getOwnUser(
    );
    /**
    * Get a user.
    *
    * Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
    * \param userId The target user's ID.  *Required*
    * \param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
    * \param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
    */
    Response<
                JsonSuccessBase
        >
    getUser(
            
            int userId
            , 
            
            bool clientGravatar
            , 
            
            bool includeCustomProfileFields
            
    );
    /**
    * Get a user by email.
    *
    * Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
    * \param email The email address of the user whose details you want to fetch.  *Required*
    * \param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
    * \param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
    */
    Response<
                JsonSuccessBase
        >
    getUserByEmail(
            
            std::string email
            , 
            
            bool clientGravatar
            , 
            
            bool includeCustomProfileFields
            
    );
    /**
    * Get user groups.
    *
    * {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
    */
    Response<
                JsonSuccessBase
        >
    getUserGroups(
    );
    /**
    * Get user presence.
    *
    * Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
    * \param userIdOrEmail The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  *Required*
    */
    Response<
                JsonSuccessBase
        >
    getUserPresence(
            
            std::string userIdOrEmail
            
    );
    /**
    * Get all users.
    *
    * Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
    * \param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
    * \param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
    */
    Response<
                JsonSuccessBase
        >
    getUsers(
            
            bool clientGravatar
            , 
            
            bool includeCustomProfileFields
            
    );
    /**
    * Mute a user.
    *
    * This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
    * \param mutedUserId The ID of the user to mute/un-mute.  *Required*
    */
    Response<
                JsonSuccess
        >
    muteUser(
            
            int mutedUserId
            
    );
    /**
    * Reactivate a user.
    *
    * [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
    * \param userId The target user's ID.  *Required*
    */
    Response<
                AnyType
        >
    reactivateUser(
            
            int userId
            
    );
    /**
    * Delete a user group.
    *
    * Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
    * \param userGroupId The ID of the target user group.  *Required*
    */
    Response<
                JsonSuccess
        >
    removeUserGroup(
            
            int userGroupId
            
    );
    /**
    * Set \"typing\" status.
    *
    * Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
    * \param op Whether the user has started (`start`) or stopped (`stop`) to type.  *Required*
    * \param to For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  *Required*
    * \param type Type of the message being composed. 
    * \param topic Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. 
    */
    Response<
                JsonSuccess
        >
    setTypingStatus(
            
            std::string op
            , 
            std::list<int> to
            
            , 
            
            std::string type
            , 
            
            std::string topic
            
    );
    /**
    * Unmute a user.
    *
    * This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
    * \param mutedUserId The ID of the user to mute/un-mute.  *Required*
    */
    Response<
                JsonSuccess
        >
    unmuteUser(
            
            int mutedUserId
            
    );
    /**
    * Update display settings.
    *
    * This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display` 
    * \param twentyFourHourTime Whether time should be [displayed in 24-hour notation](/help/change-the-time-format). 
    * \param denseMode This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip. 
    * \param starredMessageCounts Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages). 
    * \param fluidLayoutWidth Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens. 
    * \param highContrastMode This setting is reserved for use to control variations in Zulip's design to help visually impaired users. 
    * \param colorScheme Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query. 
    * \param translateEmoticons Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends. 
    * \param defaultLanguage What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
    * \param defaultView The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
    * \param leftSideUserlist Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked. 
    * \param emojiset The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
    * \param demoteInactiveStreams Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never 
    * \param timezone The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
    */
    Response<
                JsonSuccessBase
        >
    updateDisplaySettings(
            
            bool twentyFourHourTime
            , 
            
            bool denseMode
            , 
            
            bool starredMessageCounts
            , 
            
            bool fluidLayoutWidth
            , 
            
            bool highContrastMode
            , 
            
            int colorScheme
            , 
            
            bool translateEmoticons
            , 
            
            std::string defaultLanguage
            , 
            
            std::string defaultView
            , 
            
            bool leftSideUserlist
            , 
            
            std::string emojiset
            , 
            
            int demoteInactiveStreams
            , 
            
            std::string timezone
            
    );
    /**
    * Update notification settings.
    *
    * This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications` 
    * \param enableStreamDesktopNotifications Enable visual desktop notifications for stream messages. 
    * \param enableStreamEmailNotifications Enable email notifications for stream messages. 
    * \param enableStreamPushNotifications Enable mobile notifications for stream messages. 
    * \param enableStreamAudibleNotifications Enable audible desktop notifications for stream messages. 
    * \param notificationSound Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
    * \param enableDesktopNotifications Enable visual desktop notifications for private messages and @-mentions. 
    * \param enableSounds Enable audible desktop notifications for private messages and @-mentions. 
    * \param enableOfflineEmailNotifications Enable email notifications for private messages and @-mentions received when the user is offline. 
    * \param enableOfflinePushNotifications Enable mobile notification for private messages and @-mentions received when the user is offline. 
    * \param enableOnlinePushNotifications Enable mobile notification for private messages and @-mentions received when the user is online. 
    * \param enableDigestEmails Enable digest emails when the user is away. 
    * \param enableMarketingEmails Enable marketing emails. Has no function outside Zulip Cloud. 
    * \param enableLoginEmails Enable email notifications for new logins to account. 
    * \param messageContentInEmailNotifications Include the message's content in email notifications for new messages. 
    * \param pmContentInDesktopNotifications Include content of private messages in desktop notifications. 
    * \param wildcardMentionsNotify Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention. 
    * \param desktopIconCountDisplay Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None 
    * \param realmNameInNotifications Include organization name in subject of message notification emails. 
    * \param presenceEnabled Display the presence status to other users when online. 
    */
    Response<
                JsonSuccessBase
        >
    updateNotificationSettings(
            
            bool enableStreamDesktopNotifications
            , 
            
            bool enableStreamEmailNotifications
            , 
            
            bool enableStreamPushNotifications
            , 
            
            bool enableStreamAudibleNotifications
            , 
            
            std::string notificationSound
            , 
            
            bool enableDesktopNotifications
            , 
            
            bool enableSounds
            , 
            
            bool enableOfflineEmailNotifications
            , 
            
            bool enableOfflinePushNotifications
            , 
            
            bool enableOnlinePushNotifications
            , 
            
            bool enableDigestEmails
            , 
            
            bool enableMarketingEmails
            , 
            
            bool enableLoginEmails
            , 
            
            bool messageContentInEmailNotifications
            , 
            
            bool pmContentInDesktopNotifications
            , 
            
            bool wildcardMentionsNotify
            , 
            
            int desktopIconCountDisplay
            , 
            
            bool realmNameInNotifications
            , 
            
            bool presenceEnabled
            
    );
    /**
    * Update a user.
    *
    * Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
    * \param userId The target user's ID.  *Required*
    * \param fullName The user's full name. 
    * \param role New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
    * \param profileData A dictionary containing the to be updated custom profile field data for the user. 
    */
    Response<
                JsonSuccess
        >
    updateUser(
            
            int userId
            , 
            
            std::string fullName
            , 
            
            int role
            , 
            std::list<Object> profileData
            
            
    );
    /**
    * Update a user group.
    *
    * Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
    * \param userGroupId The ID of the target user group.  *Required*
    * \param name The new name of the group.  *Required*
    * \param description The new description of the group.  *Required*
    */
    Response<
                JsonSuccess
        >
    updateUserGroup(
            
            int userGroupId
            , 
            
            std::string name
            , 
            
            std::string description
            
    );
    /**
    * Update user group members.
    *
    * Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
    * \param userGroupId The ID of the target user group.  *Required*
    * \param r_delete The list of user ids to be removed from the user group. 
    * \param add The list of user ids to be added to the user group. 
    */
    Response<
                JsonSuccess
        >
    updateUserGroupMembers(
            
            int userGroupId
            , 
            std::list<int> r_delete
            
            , 
            std::list<int> add
            
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_UsersApi_H_ */