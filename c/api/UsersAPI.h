#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/any_type.h"
#include "../model/coded_error.h"
#include "../model/json_error.h"
#include "../model/json_success.h"
#include "../model/json_success_base.h"
#include "../model/object.h"
#include "../model/one_ofobjectobject.h"
#include "../model/one_ofobjectobjectobject.h"
#include "../model/one_ofobjectobjectobjectobjectobjectobject.h"

// Enum OP for UsersAPI_setTypingStatus
typedef enum  { zulip_rest_api_setTypingStatus_OP_NULL = 0, zulip_rest_api_setTypingStatus_OP_start, zulip_rest_api_setTypingStatus_OP_stop } zulip_rest_api_setTypingStatus_op_e;

// Enum TYPE for UsersAPI_setTypingStatus
typedef enum  { zulip_rest_api_setTypingStatus_TYPE_NULL = 0, zulip_rest_api_setTypingStatus_TYPE__private, zulip_rest_api_setTypingStatus_TYPE_stream } zulip_rest_api_setTypingStatus_type_e;

// Enum COLORSCHEME for UsersAPI_updateSettings
typedef enum  { zulip_rest_api_updateSettings_COLORSCHEME_NULL = 0, zulip_rest_api_updateSettings_COLORSCHEME__1, zulip_rest_api_updateSettings_COLORSCHEME__2, zulip_rest_api_updateSettings_COLORSCHEME__3 } zulip_rest_api_updateSettings_color_scheme_e;

// Enum DEMOTEINACTIVESTREAMS for UsersAPI_updateSettings
typedef enum  { zulip_rest_api_updateSettings_DEMOTEINACTIVESTREAMS_NULL = 0, zulip_rest_api_updateSettings_DEMOTEINACTIVESTREAMS__1, zulip_rest_api_updateSettings_DEMOTEINACTIVESTREAMS__2, zulip_rest_api_updateSettings_DEMOTEINACTIVESTREAMS__3 } zulip_rest_api_updateSettings_demote_inactive_streams_e;

// Enum DESKTOPICONCOUNTDISPLAY for UsersAPI_updateSettings
typedef enum  { zulip_rest_api_updateSettings_DESKTOPICONCOUNTDISPLAY_NULL = 0, zulip_rest_api_updateSettings_DESKTOPICONCOUNTDISPLAY__1, zulip_rest_api_updateSettings_DESKTOPICONCOUNTDISPLAY__2, zulip_rest_api_updateSettings_DESKTOPICONCOUNTDISPLAY__3 } zulip_rest_api_updateSettings_desktop_icon_count_display_e;


// Create a user
//
// {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
//
json_success_base_t*
UsersAPI_createUser(apiClient_t *apiClient, char * email , char * password , char * full_name );


// Create a user group
//
// Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
//
json_success_t*
UsersAPI_createUserGroup(apiClient_t *apiClient, char * name , char * description , list_t * members );


// Deactivate own user
//
// Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
//
json_success_t*
UsersAPI_deactivateOwnUser(apiClient_t *apiClient);


// Deactivate a user
//
// [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
//
json_success_t*
UsersAPI_deactivateUser(apiClient_t *apiClient, int user_id );


// Get attachments
//
// Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
//
json_success_base_t*
UsersAPI_getAttachments(apiClient_t *apiClient);


// Get own user
//
// Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
//
json_success_base_t*
UsersAPI_getOwnUser(apiClient_t *apiClient);


// Get a user
//
// Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
//
json_success_base_t*
UsersAPI_getUser(apiClient_t *apiClient, int user_id , int client_gravatar , int include_custom_profile_fields );


// Get a user by email
//
// Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
//
json_success_base_t*
UsersAPI_getUserByEmail(apiClient_t *apiClient, char * email , int client_gravatar , int include_custom_profile_fields );


// Get user groups
//
// {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
//
json_success_base_t*
UsersAPI_getUserGroups(apiClient_t *apiClient);


// Get user presence
//
// Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
//
json_success_base_t*
UsersAPI_getUserPresence(apiClient_t *apiClient, char * user_id_or_email );


// Get all users
//
// Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
//
json_success_base_t*
UsersAPI_getUsers(apiClient_t *apiClient, int client_gravatar , int include_custom_profile_fields );


// Mute a user
//
// This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
//
json_success_t*
UsersAPI_muteUser(apiClient_t *apiClient, int muted_user_id );


// Reactivate a user
//
// [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
//
any_type_t*
UsersAPI_reactivateUser(apiClient_t *apiClient, int user_id );


// Delete a user group
//
// Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
//
json_success_t*
UsersAPI_removeUserGroup(apiClient_t *apiClient, int user_group_id );


// Set \"typing\" status
//
// Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
//
json_success_t*
UsersAPI_setTypingStatus(apiClient_t *apiClient, zulip_rest_api_setTypingStatus_op_e op , list_t * to , zulip_rest_api_setTypingStatus_type_e type , char * topic );


// Unmute a user
//
// This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
//
json_success_t*
UsersAPI_unmuteUser(apiClient_t *apiClient, int muted_user_id );


// Update settings
//
// This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
//
json_success_base_t*
UsersAPI_updateSettings(apiClient_t *apiClient, char * full_name , char * email , char * old_password , char * new_password , int twenty_four_hour_time , int dense_mode , int starred_message_counts , int fluid_layout_width , int high_contrast_mode , int color_scheme , int enable_drafts_synchronization , int translate_emoticons , char * default_language , char * default_view , int left_side_userlist , char * emojiset , int demote_inactive_streams , char * timezone , int enable_stream_desktop_notifications , int enable_stream_email_notifications , int enable_stream_push_notifications , int enable_stream_audible_notifications , char * notification_sound , int enable_desktop_notifications , int enable_sounds , int email_notifications_batching_period_seconds , int enable_offline_email_notifications , int enable_offline_push_notifications , int enable_online_push_notifications , int enable_digest_emails , int enable_marketing_emails , int enable_login_emails , int message_content_in_email_notifications , int pm_content_in_desktop_notifications , int wildcard_mentions_notify , int desktop_icon_count_display , int realm_name_in_notifications , int presence_enabled , int enter_sends );


// Update your status
//
// Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 
//
json_success_t*
UsersAPI_updateStatus(apiClient_t *apiClient, char * status_text , int away , char * emoji_name , char * emoji_code , char * reaction_type );


// Update a user
//
// Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
//
json_success_t*
UsersAPI_updateUser(apiClient_t *apiClient, int user_id , char * full_name , int role , list_t * profile_data );


// Update a user group
//
// Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
//
json_success_t*
UsersAPI_updateUserGroup(apiClient_t *apiClient, int user_group_id , char * name , char * description );


// Update user group members
//
// Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
//
json_success_t*
UsersAPI_updateUserGroupMembers(apiClient_t *apiClient, int user_group_id , list_t * _delete , list_t * add );


