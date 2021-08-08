#ifndef _UsersManager_H_
#define _UsersManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AnyType.h"
#include "CodedError.h"
#include "JsonError.h"
#include "JsonSuccess.h"
#include "JsonSuccessBase.h"
#include "OneOf<object,object,object,object,object,object>.h"
#include "OneOf<object,object,object>.h"
#include "OneOf<object,object>.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Users Users
 * \ingroup Operations
 *  @{
 */
class UsersManager {
public:
	UsersManager();
	virtual ~UsersManager();

/*! \brief Create a user. *Synchronous*
 *
 * {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
 * \param email The email address of the new user.  *Required*
 * \param password The password of the new user.  *Required*
 * \param fullName The full name of the new user.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createUserSync(char * accessToken,
	std::string email, std::string password, std::string fullName, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Create a user. *Asynchronous*
 *
 * {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
 * \param email The email address of the new user.  *Required*
 * \param password The password of the new user.  *Required*
 * \param fullName The full name of the new user.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createUserAsync(char * accessToken,
	std::string email, std::string password, std::string fullName, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Create a user group. *Synchronous*
 *
 * Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
 * \param name The name of the user group.  *Required*
 * \param description The description of the user group.  *Required*
 * \param members An array containing the user IDs of the initial members for the new user group.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createUserGroupSync(char * accessToken,
	std::string name, std::string description, std::list<int> members, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Create a user group. *Asynchronous*
 *
 * Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
 * \param name The name of the user group.  *Required*
 * \param description The description of the user group.  *Required*
 * \param members An array containing the user IDs of the initial members for the new user group.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createUserGroupAsync(char * accessToken,
	std::string name, std::string description, std::list<int> members, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Deactivate own user. *Synchronous*
 *
 * Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deactivateOwnUserSync(char * accessToken,
	
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Deactivate own user. *Asynchronous*
 *
 * Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deactivateOwnUserAsync(char * accessToken,
	
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Deactivate a user. *Synchronous*
 *
 * [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
 * \param userId The target user's ID.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deactivateUserSync(char * accessToken,
	int userId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Deactivate a user. *Asynchronous*
 *
 * [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
 * \param userId The target user's ID.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deactivateUserAsync(char * accessToken,
	int userId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Get attachments. *Synchronous*
 *
 * Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAttachmentsSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get attachments. *Asynchronous*
 *
 * Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAttachmentsAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get own user. *Synchronous*
 *
 * Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getOwnUserSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get own user. *Asynchronous*
 *
 * Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getOwnUserAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get a user. *Synchronous*
 *
 * Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
 * \param userId The target user's ID.  *Required*
 * \param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
 * \param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getUserSync(char * accessToken,
	int userId, bool clientGravatar, bool includeCustomProfileFields, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get a user. *Asynchronous*
 *
 * Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
 * \param userId The target user's ID.  *Required*
 * \param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
 * \param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getUserAsync(char * accessToken,
	int userId, bool clientGravatar, bool includeCustomProfileFields, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get a user by email. *Synchronous*
 *
 * Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
 * \param email The email address of the user whose details you want to fetch.  *Required*
 * \param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
 * \param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getUserByEmailSync(char * accessToken,
	std::string email, bool clientGravatar, bool includeCustomProfileFields, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get a user by email. *Asynchronous*
 *
 * Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
 * \param email The email address of the user whose details you want to fetch.  *Required*
 * \param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
 * \param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getUserByEmailAsync(char * accessToken,
	std::string email, bool clientGravatar, bool includeCustomProfileFields, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get user groups. *Synchronous*
 *
 * {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getUserGroupsSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get user groups. *Asynchronous*
 *
 * {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getUserGroupsAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get user presence. *Synchronous*
 *
 * Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
 * \param userIdOrEmail The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getUserPresenceSync(char * accessToken,
	std::string userIdOrEmail, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get user presence. *Asynchronous*
 *
 * Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
 * \param userIdOrEmail The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getUserPresenceAsync(char * accessToken,
	std::string userIdOrEmail, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get all users. *Synchronous*
 *
 * Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
 * \param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
 * \param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getUsersSync(char * accessToken,
	bool clientGravatar, bool includeCustomProfileFields, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get all users. *Asynchronous*
 *
 * Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
 * \param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
 * \param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getUsersAsync(char * accessToken,
	bool clientGravatar, bool includeCustomProfileFields, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Mute a user. *Synchronous*
 *
 * This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
 * \param mutedUserId The ID of the user to mute/un-mute.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool muteUserSync(char * accessToken,
	int mutedUserId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Mute a user. *Asynchronous*
 *
 * This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
 * \param mutedUserId The ID of the user to mute/un-mute.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool muteUserAsync(char * accessToken,
	int mutedUserId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Reactivate a user. *Synchronous*
 *
 * [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
 * \param userId The target user's ID.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool reactivateUserSync(char * accessToken,
	int userId, 
	void(* handler)(AnyType, Error, void* )
	, void* userData);

/*! \brief Reactivate a user. *Asynchronous*
 *
 * [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
 * \param userId The target user's ID.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool reactivateUserAsync(char * accessToken,
	int userId, 
	void(* handler)(AnyType, Error, void* )
	, void* userData);


/*! \brief Delete a user group. *Synchronous*
 *
 * Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
 * \param userGroupId The ID of the target user group.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool removeUserGroupSync(char * accessToken,
	int userGroupId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Delete a user group. *Asynchronous*
 *
 * Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
 * \param userGroupId The ID of the target user group.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool removeUserGroupAsync(char * accessToken,
	int userGroupId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Set \"typing\" status. *Synchronous*
 *
 * Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
 * \param op Whether the user has started (`start`) or stopped (`stop`) to type.  *Required*
 * \param to For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  *Required*
 * \param type Type of the message being composed. 
 * \param topic Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool setTypingStatusSync(char * accessToken,
	std::string op, std::list<int> to, std::string type, std::string topic, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Set \"typing\" status. *Asynchronous*
 *
 * Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
 * \param op Whether the user has started (`start`) or stopped (`stop`) to type.  *Required*
 * \param to For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  *Required*
 * \param type Type of the message being composed. 
 * \param topic Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool setTypingStatusAsync(char * accessToken,
	std::string op, std::list<int> to, std::string type, std::string topic, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Unmute a user. *Synchronous*
 *
 * This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
 * \param mutedUserId The ID of the user to mute/un-mute.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool unmuteUserSync(char * accessToken,
	int mutedUserId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Unmute a user. *Asynchronous*
 *
 * This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
 * \param mutedUserId The ID of the user to mute/un-mute.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool unmuteUserAsync(char * accessToken,
	int mutedUserId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Update settings. *Synchronous*
 *
 * This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
 * \param fullName A new display name for the user. 
 * \param email Asks the server to initiate a confirmation sequence to change the user's email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. 
 * \param oldPassword The user's old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the `new_password` parameter. 
 * \param newPassword The user's new Zulip password (or LDAP password, if LDAP authentication is in use).  The `old_password` parameter must be included in the request. 
 * \param twentyFourHourTime Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param denseMode This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param starredMessageCounts Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param fluidLayoutWidth Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param highContrastMode This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param colorScheme Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param enableDraftsSynchronization A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). 
 * \param translateEmoticons Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param defaultLanguage What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
 * \param defaultView The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
 * \param leftSideUserlist Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param emojiset The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
 * \param demoteInactiveStreams Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param timezone The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
 * \param enableStreamDesktopNotifications Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableStreamEmailNotifications Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableStreamPushNotifications Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableStreamAudibleNotifications Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param notificationSound Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
 * \param enableDesktopNotifications Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableSounds Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param emailNotificationsBatchingPeriodSeconds The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) 
 * \param enableOfflineEmailNotifications Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableOfflinePushNotifications Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableOnlinePushNotifications Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableDigestEmails Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableMarketingEmails Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableLoginEmails Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param messageContentInEmailNotifications Include the message's content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param pmContentInDesktopNotifications Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param wildcardMentionsNotify Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param desktopIconCountDisplay Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param realmNameInNotifications Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param presenceEnabled Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enterSends Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the `POST /users/me/enter-sends` endpoint, with the same parameter format. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateSettingsSync(char * accessToken,
	std::string fullName, std::string email, std::string oldPassword, std::string newPassword, bool twentyFourHourTime, bool denseMode, bool starredMessageCounts, bool fluidLayoutWidth, bool highContrastMode, int colorScheme, bool enableDraftsSynchronization, bool translateEmoticons, std::string defaultLanguage, std::string defaultView, bool leftSideUserlist, std::string emojiset, int demoteInactiveStreams, std::string timezone, bool enableStreamDesktopNotifications, bool enableStreamEmailNotifications, bool enableStreamPushNotifications, bool enableStreamAudibleNotifications, std::string notificationSound, bool enableDesktopNotifications, bool enableSounds, int emailNotificationsBatchingPeriodSeconds, bool enableOfflineEmailNotifications, bool enableOfflinePushNotifications, bool enableOnlinePushNotifications, bool enableDigestEmails, bool enableMarketingEmails, bool enableLoginEmails, bool messageContentInEmailNotifications, bool pmContentInDesktopNotifications, bool wildcardMentionsNotify, int desktopIconCountDisplay, bool realmNameInNotifications, bool presenceEnabled, bool enterSends, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Update settings. *Asynchronous*
 *
 * This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
 * \param fullName A new display name for the user. 
 * \param email Asks the server to initiate a confirmation sequence to change the user's email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. 
 * \param oldPassword The user's old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the `new_password` parameter. 
 * \param newPassword The user's new Zulip password (or LDAP password, if LDAP authentication is in use).  The `old_password` parameter must be included in the request. 
 * \param twentyFourHourTime Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param denseMode This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param starredMessageCounts Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param fluidLayoutWidth Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param highContrastMode This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param colorScheme Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param enableDraftsSynchronization A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). 
 * \param translateEmoticons Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param defaultLanguage What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
 * \param defaultView The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
 * \param leftSideUserlist Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param emojiset The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
 * \param demoteInactiveStreams Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
 * \param timezone The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
 * \param enableStreamDesktopNotifications Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableStreamEmailNotifications Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableStreamPushNotifications Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableStreamAudibleNotifications Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param notificationSound Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
 * \param enableDesktopNotifications Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableSounds Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param emailNotificationsBatchingPeriodSeconds The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) 
 * \param enableOfflineEmailNotifications Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableOfflinePushNotifications Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableOnlinePushNotifications Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableDigestEmails Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableMarketingEmails Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enableLoginEmails Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param messageContentInEmailNotifications Include the message's content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param pmContentInDesktopNotifications Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param wildcardMentionsNotify Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param desktopIconCountDisplay Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param realmNameInNotifications Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param presenceEnabled Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
 * \param enterSends Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the `POST /users/me/enter-sends` endpoint, with the same parameter format. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateSettingsAsync(char * accessToken,
	std::string fullName, std::string email, std::string oldPassword, std::string newPassword, bool twentyFourHourTime, bool denseMode, bool starredMessageCounts, bool fluidLayoutWidth, bool highContrastMode, int colorScheme, bool enableDraftsSynchronization, bool translateEmoticons, std::string defaultLanguage, std::string defaultView, bool leftSideUserlist, std::string emojiset, int demoteInactiveStreams, std::string timezone, bool enableStreamDesktopNotifications, bool enableStreamEmailNotifications, bool enableStreamPushNotifications, bool enableStreamAudibleNotifications, std::string notificationSound, bool enableDesktopNotifications, bool enableSounds, int emailNotificationsBatchingPeriodSeconds, bool enableOfflineEmailNotifications, bool enableOfflinePushNotifications, bool enableOnlinePushNotifications, bool enableDigestEmails, bool enableMarketingEmails, bool enableLoginEmails, bool messageContentInEmailNotifications, bool pmContentInDesktopNotifications, bool wildcardMentionsNotify, int desktopIconCountDisplay, bool realmNameInNotifications, bool presenceEnabled, bool enterSends, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Update your status. *Synchronous*
 *
 * Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 
 * \param statusText The text content of the status message. Sending the empty string will clear the user's status.  **Note**: The limit on the size of the message is 60 characters. 
 * \param away Whether the user should be marked as \"away\". 
 * \param emojiName The name for the emoji to associate with this status. 
 * \param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
 * \param reactionType One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateStatusSync(char * accessToken,
	std::string statusText, bool away, std::string emojiName, std::string emojiCode, std::string reactionType, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Update your status. *Asynchronous*
 *
 * Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 
 * \param statusText The text content of the status message. Sending the empty string will clear the user's status.  **Note**: The limit on the size of the message is 60 characters. 
 * \param away Whether the user should be marked as \"away\". 
 * \param emojiName The name for the emoji to associate with this status. 
 * \param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
 * \param reactionType One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateStatusAsync(char * accessToken,
	std::string statusText, bool away, std::string emojiName, std::string emojiCode, std::string reactionType, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Update a user. *Synchronous*
 *
 * Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
 * \param userId The target user's ID.  *Required*
 * \param fullName The user's full name. 
 * \param role New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
 * \param profileData A dictionary containing the to be updated custom profile field data for the user. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateUserSync(char * accessToken,
	int userId, std::string fullName, int role, std::list<std::string> profileData, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Update a user. *Asynchronous*
 *
 * Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
 * \param userId The target user's ID.  *Required*
 * \param fullName The user's full name. 
 * \param role New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
 * \param profileData A dictionary containing the to be updated custom profile field data for the user. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateUserAsync(char * accessToken,
	int userId, std::string fullName, int role, std::list<std::string> profileData, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Update a user group. *Synchronous*
 *
 * Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
 * \param userGroupId The ID of the target user group.  *Required*
 * \param name The new name of the group.  *Required*
 * \param description The new description of the group.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateUserGroupSync(char * accessToken,
	int userGroupId, std::string name, std::string description, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Update a user group. *Asynchronous*
 *
 * Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
 * \param userGroupId The ID of the target user group.  *Required*
 * \param name The new name of the group.  *Required*
 * \param description The new description of the group.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateUserGroupAsync(char * accessToken,
	int userGroupId, std::string name, std::string description, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Update user group members. *Synchronous*
 *
 * Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
 * \param userGroupId The ID of the target user group.  *Required*
 * \param r_delete The list of user ids to be removed from the user group. 
 * \param add The list of user ids to be added to the user group. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateUserGroupMembersSync(char * accessToken,
	int userGroupId, std::list<int> r_delete, std::list<int> add, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Update user group members. *Asynchronous*
 *
 * Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
 * \param userGroupId The ID of the target user group.  *Required*
 * \param r_delete The list of user ids to be removed from the user group. 
 * \param add The list of user ids to be added to the user group. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateUserGroupMembersAsync(char * accessToken,
	int userGroupId, std::list<int> r_delete, std::list<int> add, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://example.zulipchat.com/api/v1";
	}
};
/** @}*/

}
}
#endif /* UsersManager_H_ */
