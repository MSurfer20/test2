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
 * StreamsApi.h
 *
 * 
 */

#ifndef StreamsApi_H_
#define StreamsApi_H_


#include <memory>
#include <utility>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/service.hpp>

#include "CodedError.h"
#include "JsonError.h"
#include "JsonSuccess.h"
#include "JsonSuccessBase.h"
#include "NonExistingStreamError.h"
#include "Object.h"
#include "OneOfobjectobject.h"
#include "OneOfstringinteger.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

/// <summary>
/// Archive a stream
/// </summary>
/// <remarks>
/// [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
/// </remarks>
class  StreamsApiStreamsStream_idResource: public restbed::Resource
{
public:
	StreamsApiStreamsStream_idResource();
    virtual ~StreamsApiStreamsStream_idResource();
    void DELETE_method_handler(const std::shared_ptr<restbed::Session> session);
    void PATCH_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_DELETE(
		std::function<std::pair<int, std::string>(
			int32_t const &
		)> handler
	);

	void set_handler_PATCH(
		std::function<std::pair<int, std::string>(
			int32_t const &, std::string const &, std::string const &, bool const &, bool const &, int32_t const &, bool const &, std::shared_ptr<OneOfstringinteger> const &
		)> handler
	);

private:
	std::function<std::pair<int, std::string>(
		int32_t const &
	)> handler_DELETE_;

	std::function<std::pair<int, std::string>(
		int32_t const &, std::string const &, std::string const &, bool const &, bool const &, int32_t const &, bool const &, std::shared_ptr<OneOfstringinteger> const &
	)> handler_PATCH_;

	int32_t streamId{};
};

/// <summary>
/// Create BigBlueButton video call
/// </summary>
/// <remarks>
/// Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
/// </remarks>
class  StreamsApiCallsBigbluebuttonCreateResource: public restbed::Resource
{
public:
	StreamsApiCallsBigbluebuttonCreateResource();
    virtual ~StreamsApiCallsBigbluebuttonCreateResource();
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
/// Get stream ID
/// </summary>
/// <remarks>
/// Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
/// </remarks>
class  StreamsApiGet_stream_idResource: public restbed::Resource
{
public:
	StreamsApiGet_stream_idResource();
    virtual ~StreamsApiGet_stream_idResource();
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


	std::string stream{};
};

/// <summary>
/// Get topics in a stream
/// </summary>
/// <remarks>
/// Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 
/// </remarks>
class  StreamsApiUsersMeStream_idTopicsResource: public restbed::Resource
{
public:
	StreamsApiUsersMeStream_idTopicsResource();
    virtual ~StreamsApiUsersMeStream_idTopicsResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_GET(
		std::function<std::pair<int, std::string>(
			int32_t const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		int32_t const &
	)> handler_GET_;


	int32_t streamId{};
};

/// <summary>
/// Get all streams
/// </summary>
/// <remarks>
/// Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
/// </remarks>
class  StreamsApiStreamsResource: public restbed::Resource
{
public:
	StreamsApiStreamsResource();
    virtual ~StreamsApiStreamsResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_GET(
		std::function<std::pair<int, std::string>(
			bool const &, bool const &, bool const &, bool const &, bool const &, bool const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		bool const &, bool const &, bool const &, bool const &, bool const &, bool const &
	)> handler_GET_;


	bool includePublic{};
	bool includeWebPublic{};
	bool includeSubscribed{};
	bool includeAllActive{};
	bool includeDefault{};
	bool includeOwnerSubscribed{};
};

/// <summary>
/// Get subscription status
/// </summary>
/// <remarks>
/// Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 
/// </remarks>
class  StreamsApiUsersUser_idSubscriptionsStream_idResource: public restbed::Resource
{
public:
	StreamsApiUsersUser_idSubscriptionsStream_idResource();
    virtual ~StreamsApiUsersUser_idSubscriptionsStream_idResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_GET(
		std::function<std::pair<int, std::string>(
			int32_t const &, int32_t const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		int32_t const &, int32_t const &
	)> handler_GET_;


	int32_t userId{};
	int32_t streamId{};
};

/// <summary>
/// Get subscribed streams
/// </summary>
/// <remarks>
/// Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 
/// </remarks>
class  StreamsApiUsersMeSubscriptionsResource: public restbed::Resource
{
public:
	StreamsApiUsersMeSubscriptionsResource();
    virtual ~StreamsApiUsersMeSubscriptionsResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
    void PATCH_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_GET(
		std::function<std::pair<int, std::string>(
			bool const &
		)> handler
	);

	void set_handler_PATCH(
		std::function<std::pair<int, std::string>(
			std::vector<std::string> const &, std::vector<std::shared_ptr<Object>> const &
		)> handler
	);

private:
	std::function<std::pair<int, std::string>(
		bool const &
	)> handler_GET_;

	std::function<std::pair<int, std::string>(
		std::vector<std::string> const &, std::vector<std::shared_ptr<Object>> const &
	)> handler_PATCH_;

	bool includeSubscribers{};
};

/// <summary>
/// Topic muting
/// </summary>
/// <remarks>
/// This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 
/// </remarks>
class  StreamsApiUsersMeSubscriptionsMuted_topicsResource: public restbed::Resource
{
public:
	StreamsApiUsersMeSubscriptionsMuted_topicsResource();
    virtual ~StreamsApiUsersMeSubscriptionsMuted_topicsResource();
    void PATCH_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_PATCH(
		std::function<std::pair<int, std::string>(
			std::string const &, std::string const &, std::string const &, int32_t const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &, std::string const &, int32_t const &
	)> handler_PATCH_;


	std::string topic{};
	std::string op{};
	std::string stream{};
	int32_t streamId{};
};

/// <summary>
/// Update subscription settings
/// </summary>
/// <remarks>
/// This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 
/// </remarks>
class  StreamsApiUsersMeSubscriptionsPropertiesResource: public restbed::Resource
{
public:
	StreamsApiUsersMeSubscriptionsPropertiesResource();
    virtual ~StreamsApiUsersMeSubscriptionsPropertiesResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_POST(
		std::function<std::pair<int, std::string>(
			std::vector<std::shared_ptr<Object>> const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		std::vector<std::shared_ptr<Object>> const &
	)> handler_POST_;


	std::vector<std::shared_ptr<Object>> subscriptionData{};
};


//
// The restbed service to actually implement the REST server
//
class  StreamsApi: public restbed::Service
{
public:
	StreamsApi();
	~StreamsApi();
	void startService(int const& port);
	void stopService();
	
protected:
	std::shared_ptr<StreamsApiStreamsStream_idResource> m_spStreamsApiStreamsStream_idResource;
	std::shared_ptr<StreamsApiCallsBigbluebuttonCreateResource> m_spStreamsApiCallsBigbluebuttonCreateResource;
	std::shared_ptr<StreamsApiGet_stream_idResource> m_spStreamsApiGet_stream_idResource;
	std::shared_ptr<StreamsApiUsersMeStream_idTopicsResource> m_spStreamsApiUsersMeStream_idTopicsResource;
	std::shared_ptr<StreamsApiStreamsResource> m_spStreamsApiStreamsResource;
	std::shared_ptr<StreamsApiUsersUser_idSubscriptionsStream_idResource> m_spStreamsApiUsersUser_idSubscriptionsStream_idResource;
	std::shared_ptr<StreamsApiUsersMeSubscriptionsResource> m_spStreamsApiUsersMeSubscriptionsResource;
	std::shared_ptr<StreamsApiUsersMeSubscriptionsMuted_topicsResource> m_spStreamsApiUsersMeSubscriptionsMuted_topicsResource;
	std::shared_ptr<StreamsApiUsersMeSubscriptionsPropertiesResource> m_spStreamsApiUsersMeSubscriptionsPropertiesResource;
};


}
}
}
}

#endif /* StreamsApi_H_ */
