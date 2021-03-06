/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.2.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * UsersApi.h
 *
 * 
 */

#ifndef UsersApi_H_
#define UsersApi_H_


#include <memory>
#include <utility>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/service.hpp>

#include "AnyType.h"
#include "CodedError.h"
#include "JsonError.h"
#include "JsonSuccess.h"
#include "JsonSuccessBase.h"
#include "Object.h"
#include "OneOfobjectobject.h"
#include "OneOfobjectobjectobject.h"
#include "OneOfobjectobjectobjectobjectobjectobject.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

/// <summary>
/// Create a user
/// </summary>
/// <remarks>
/// {!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 
/// </remarks>
class  UsersApiUsersResource: public restbed::Resource
{
public:
	UsersApiUsersResource();
    virtual ~UsersApiUsersResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_POST(
		std::function<std::pair<int, std::string>(
			std::string const &, std::string const &, std::string const &
		)> handler
	);

	void set_handler_GET(
		std::function<std::pair<int, std::string>(
			bool const &, bool const &
		)> handler
	);

private:
	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &, std::string const &
	)> handler_POST_;

	std::function<std::pair<int, std::string>(
		bool const &, bool const &
	)> handler_GET_;

	std::string email{};
	std::string password{};
	std::string fullName{};
};

/// <summary>
/// Create a user group
/// </summary>
/// <remarks>
/// Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 
/// </remarks>
class  UsersApiUser_groupsCreateResource: public restbed::Resource
{
public:
	UsersApiUser_groupsCreateResource();
    virtual ~UsersApiUser_groupsCreateResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_POST(
		std::function<std::pair<int, std::string>(
			std::string const &, std::string const &, std::vector<int32_t> const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &, std::vector<int32_t> const &
	)> handler_POST_;


	std::string name{};
	std::string description{};
	std::vector<int32_t> members{};
};

/// <summary>
/// Deactivate own user
/// </summary>
/// <remarks>
/// Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
/// </remarks>
class  UsersApiUsersMeResource: public restbed::Resource
{
public:
	UsersApiUsersMeResource();
    virtual ~UsersApiUsersMeResource();
    void DELETE_method_handler(const std::shared_ptr<restbed::Session> session);
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_DELETE(
		std::function<std::pair<int, std::string>(
			
		)> handler
	);

	void set_handler_GET(
		std::function<std::pair<int, std::string>(
			
		)> handler
	);

private:
	std::function<std::pair<int, std::string>(
		
	)> handler_DELETE_;

	std::function<std::pair<int, std::string>(
		
	)> handler_GET_;

};

/// <summary>
/// Deactivate a user
/// </summary>
/// <remarks>
/// [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 
/// </remarks>
class  UsersApiUsersUser_idResource: public restbed::Resource
{
public:
	UsersApiUsersUser_idResource();
    virtual ~UsersApiUsersUser_idResource();
    void DELETE_method_handler(const std::shared_ptr<restbed::Session> session);
    void PATCH_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_DELETE(
		std::function<std::pair<int, std::string>(
			int32_t const &
		)> handler
	);

	void set_handler_PATCH(
		std::function<std::pair<int, std::string>(
			int32_t const &, std::string const &, int32_t const &, std::vector<std::shared_ptr<Object>> const &
		)> handler
	);

private:
	std::function<std::pair<int, std::string>(
		int32_t const &
	)> handler_DELETE_;

	std::function<std::pair<int, std::string>(
		int32_t const &, std::string const &, int32_t const &, std::vector<std::shared_ptr<Object>> const &
	)> handler_PATCH_;

	int32_t userId{};
};

/// <summary>
/// Get attachments
/// </summary>
/// <remarks>
/// Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 
/// </remarks>
class  UsersApiAttachmentsResource: public restbed::Resource
{
public:
	UsersApiAttachmentsResource();
    virtual ~UsersApiAttachmentsResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_GET(
		std::function<std::pair<int, std::string>(
			
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		
	)> handler_GET_;


};

/// <summary>
/// Get a user by email
/// </summary>
/// <remarks>
/// Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
/// </remarks>
class  UsersApiUsersEmailResource: public restbed::Resource
{
public:
	UsersApiUsersEmailResource();
    virtual ~UsersApiUsersEmailResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_GET(
		std::function<std::pair<int, std::string>(
			std::string const &, bool const &, bool const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		std::string const &, bool const &, bool const &
	)> handler_GET_;


	std::string email{};
	bool clientGravatar{};
	bool includeCustomProfileFields{};
};

/// <summary>
/// Get user groups
/// </summary>
/// <remarks>
/// {!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 
/// </remarks>
class  UsersApiUser_groupsResource: public restbed::Resource
{
public:
	UsersApiUser_groupsResource();
    virtual ~UsersApiUser_groupsResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_GET(
		std::function<std::pair<int, std::string>(
			
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		
	)> handler_GET_;


};

/// <summary>
/// Get user presence
/// </summary>
/// <remarks>
/// Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
/// </remarks>
class  UsersApiUsersUser_id_or_emailPresenceResource: public restbed::Resource
{
public:
	UsersApiUsersUser_id_or_emailPresenceResource();
    virtual ~UsersApiUsersUser_id_or_emailPresenceResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_GET(
		std::function<std::pair<int, std::string>(
			std::string const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		std::string const &
	)> handler_GET_;


	std::string userIdOrEmail{};
};

/// <summary>
/// Mute a user
/// </summary>
/// <remarks>
/// This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
/// </remarks>
class  UsersApiUsersMeMuted_usersMuted_user_idResource: public restbed::Resource
{
public:
	UsersApiUsersMeMuted_usersMuted_user_idResource();
    virtual ~UsersApiUsersMeMuted_usersMuted_user_idResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
    void DELETE_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_POST(
		std::function<std::pair<int, std::string>(
			int32_t const &
		)> handler
	);

	void set_handler_DELETE(
		std::function<std::pair<int, std::string>(
			int32_t const &
		)> handler
	);

private:
	std::function<std::pair<int, std::string>(
		int32_t const &
	)> handler_POST_;

	std::function<std::pair<int, std::string>(
		int32_t const &
	)> handler_DELETE_;

	int32_t mutedUserId{};
};

/// <summary>
/// Reactivate a user
/// </summary>
/// <remarks>
/// [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 
/// </remarks>
class  UsersApiUsersUser_idReactivateResource: public restbed::Resource
{
public:
	UsersApiUsersUser_idReactivateResource();
    virtual ~UsersApiUsersUser_idReactivateResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_POST(
		std::function<std::pair<int, std::string>(
			int32_t const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		int32_t const &
	)> handler_POST_;


	int32_t userId{};
};

/// <summary>
/// Delete a user group
/// </summary>
/// <remarks>
/// Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
/// </remarks>
class  UsersApiUser_groupsUser_group_idResource: public restbed::Resource
{
public:
	UsersApiUser_groupsUser_group_idResource();
    virtual ~UsersApiUser_groupsUser_group_idResource();
    void DELETE_method_handler(const std::shared_ptr<restbed::Session> session);
    void PATCH_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_DELETE(
		std::function<std::pair<int, std::string>(
			int32_t const &
		)> handler
	);

	void set_handler_PATCH(
		std::function<std::pair<int, std::string>(
			int32_t const &, std::string const &, std::string const &
		)> handler
	);

private:
	std::function<std::pair<int, std::string>(
		int32_t const &
	)> handler_DELETE_;

	std::function<std::pair<int, std::string>(
		int32_t const &, std::string const &, std::string const &
	)> handler_PATCH_;

	int32_t userGroupId{};
};

/// <summary>
/// Set \&quot;typing\&quot; status
/// </summary>
/// <remarks>
/// Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. 
/// </remarks>
class  UsersApiTypingResource: public restbed::Resource
{
public:
	UsersApiTypingResource();
    virtual ~UsersApiTypingResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_POST(
		std::function<std::pair<int, std::string>(
			std::string const &, std::vector<int32_t> const &, std::string const &, std::string const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		std::string const &, std::vector<int32_t> const &, std::string const &, std::string const &
	)> handler_POST_;


	std::string op{};
	std::vector<int32_t> to{};
	std::string type{};
	std::string topic{};
};

/// <summary>
/// Update settings
/// </summary>
/// <remarks>
/// This endpoint is used to edit the current user&#39;s settings.  &#x60;PATCH {{ api_url }}/v1/settings&#x60;  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the &#x60;full_name&#x60;, &#x60;email&#x60;, &#x60;old_password&#x60;, and &#x60;new_password&#x60; parameters. Notification settings were managed by &#x60;PATCH /settings/notifications&#x60;, and all other settings by &#x60;PATCH /settings/display&#x60;. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for &#x60;/settings&#x60; in Zulip 5.0 (feature level 78).  The &#x60;/settings/display&#x60; and &#x60;/settings/notifications&#x60; endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
/// </remarks>
class  UsersApiSettingsResource: public restbed::Resource
{
public:
	UsersApiSettingsResource();
    virtual ~UsersApiSettingsResource();
    void PATCH_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_PATCH(
		std::function<std::pair<int, std::string>(
			std::string const &, std::string const &, std::string const &, std::string const &, bool const &, bool const &, bool const &, bool const &, bool const &, int32_t const &, bool const &, bool const &, std::string const &, std::string const &, bool const &, std::string const &, int32_t const &, std::string const &, bool const &, bool const &, bool const &, bool const &, std::string const &, bool const &, bool const &, int32_t const &, bool const &, bool const &, bool const &, bool const &, bool const &, bool const &, bool const &, bool const &, bool const &, int32_t const &, bool const &, bool const &, bool const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &, std::string const &, std::string const &, bool const &, bool const &, bool const &, bool const &, bool const &, int32_t const &, bool const &, bool const &, std::string const &, std::string const &, bool const &, std::string const &, int32_t const &, std::string const &, bool const &, bool const &, bool const &, bool const &, std::string const &, bool const &, bool const &, int32_t const &, bool const &, bool const &, bool const &, bool const &, bool const &, bool const &, bool const &, bool const &, bool const &, int32_t const &, bool const &, bool const &, bool const &
	)> handler_PATCH_;


	std::string fullName{};
	std::string email{};
	std::string oldPassword{};
	std::string newPassword{};
	bool twentyFourHourTime{};
	bool denseMode{};
	bool starredMessageCounts{};
	bool fluidLayoutWidth{};
	bool highContrastMode{};
	int32_t colorScheme{};
	bool enableDraftsSynchronization{};
	bool translateEmoticons{};
	std::string defaultLanguage{};
	std::string defaultView{};
	bool leftSideUserlist{};
	std::string emojiset{};
	int32_t demoteInactiveStreams{};
	std::string timezone{};
	bool enableStreamDesktopNotifications{};
	bool enableStreamEmailNotifications{};
	bool enableStreamPushNotifications{};
	bool enableStreamAudibleNotifications{};
	std::string notificationSound{};
	bool enableDesktopNotifications{};
	bool enableSounds{};
	int32_t emailNotificationsBatchingPeriodSeconds{};
	bool enableOfflineEmailNotifications{};
	bool enableOfflinePushNotifications{};
	bool enableOnlinePushNotifications{};
	bool enableDigestEmails{};
	bool enableMarketingEmails{};
	bool enableLoginEmails{};
	bool messageContentInEmailNotifications{};
	bool pmContentInDesktopNotifications{};
	bool wildcardMentionsNotify{};
	int32_t desktopIconCountDisplay{};
	bool realmNameInNotifications{};
	bool presenceEnabled{};
	bool enterSends{};
};

/// <summary>
/// Update your status
/// </summary>
/// <remarks>
/// Change your [status](/help/status-and-availability).  &#x60;POST {{ api_url }}/v1/users/me/status&#x60;  A request to this endpoint will only change the parameters passed. For example, passing just &#x60;status_text&#x60; requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user&#39;s status to a specific value should pass all supported parameters. 
/// </remarks>
class  UsersApiUsersMeStatusResource: public restbed::Resource
{
public:
	UsersApiUsersMeStatusResource();
    virtual ~UsersApiUsersMeStatusResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_POST(
		std::function<std::pair<int, std::string>(
			std::string const &, bool const &, std::string const &, std::string const &, std::string const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		std::string const &, bool const &, std::string const &, std::string const &, std::string const &
	)> handler_POST_;


	std::string statusText{};
	bool away{};
	std::string emojiName{};
	std::string emojiCode{};
	std::string reactionType{};
};

/// <summary>
/// Update user group members
/// </summary>
/// <remarks>
/// Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 
/// </remarks>
class  UsersApiUser_groupsUser_group_idMembersResource: public restbed::Resource
{
public:
	UsersApiUser_groupsUser_group_idMembersResource();
    virtual ~UsersApiUser_groupsUser_group_idMembersResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_POST(
		std::function<std::pair<int, std::string>(
			int32_t const &, std::vector<int32_t> const &, std::vector<int32_t> const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		int32_t const &, std::vector<int32_t> const &, std::vector<int32_t> const &
	)> handler_POST_;


	int32_t userGroupId{};
	std::vector<int32_t> r_delete{};
	std::vector<int32_t> add{};
};


//
// The restbed service to actually implement the REST server
//
class  UsersApi: public restbed::Service
{
public:
	UsersApi();
	~UsersApi();
	void startService(int const& port);
	void stopService();
	
protected:
	std::shared_ptr<UsersApiUsersResource> m_spUsersApiUsersResource;
	std::shared_ptr<UsersApiUser_groupsCreateResource> m_spUsersApiUser_groupsCreateResource;
	std::shared_ptr<UsersApiUsersMeResource> m_spUsersApiUsersMeResource;
	std::shared_ptr<UsersApiUsersUser_idResource> m_spUsersApiUsersUser_idResource;
	std::shared_ptr<UsersApiAttachmentsResource> m_spUsersApiAttachmentsResource;
	std::shared_ptr<UsersApiUsersEmailResource> m_spUsersApiUsersEmailResource;
	std::shared_ptr<UsersApiUser_groupsResource> m_spUsersApiUser_groupsResource;
	std::shared_ptr<UsersApiUsersUser_id_or_emailPresenceResource> m_spUsersApiUsersUser_id_or_emailPresenceResource;
	std::shared_ptr<UsersApiUsersMeMuted_usersMuted_user_idResource> m_spUsersApiUsersMeMuted_usersMuted_user_idResource;
	std::shared_ptr<UsersApiUsersUser_idReactivateResource> m_spUsersApiUsersUser_idReactivateResource;
	std::shared_ptr<UsersApiUser_groupsUser_group_idResource> m_spUsersApiUser_groupsUser_group_idResource;
	std::shared_ptr<UsersApiTypingResource> m_spUsersApiTypingResource;
	std::shared_ptr<UsersApiSettingsResource> m_spUsersApiSettingsResource;
	std::shared_ptr<UsersApiUsersMeStatusResource> m_spUsersApiUsersMeStatusResource;
	std::shared_ptr<UsersApiUser_groupsUser_group_idMembersResource> m_spUsersApiUser_groupsUser_group_idMembersResource;
};


}
}
}
}

#endif /* UsersApi_H_ */

