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


#include <corvusoft/restbed/byte.hpp>
#include <corvusoft/restbed/string.hpp>
#include <corvusoft/restbed/settings.hpp>
#include <corvusoft/restbed/request.hpp>

#include "StreamsApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

StreamsApi::StreamsApi() {
}

StreamsApi::~StreamsApi() {}

void StreamsApi::startService(int const& port) {
	// A typical pattern is to derive a class from StreamsApi and allocate the shared pointers for restbed::Resource objects
	// and manipulate them (e.g. binding GET/POST handler functions) before this startService() gets called.
	// In such a case we want to use our m_spXXX variables.
	// However in case these shared pointers are nullptr, then allocate the restbed::Resources now:
	if (!m_spStreamsApiStreamsStream_idResource)
		m_spStreamsApiStreamsStream_idResource = std::make_shared<StreamsApiStreamsStream_idResource>();
	this->publish(m_spStreamsApiStreamsStream_idResource);
	if (!m_spStreamsApiCallsBigbluebuttonCreateResource)
		m_spStreamsApiCallsBigbluebuttonCreateResource = std::make_shared<StreamsApiCallsBigbluebuttonCreateResource>();
	this->publish(m_spStreamsApiCallsBigbluebuttonCreateResource);
	if (!m_spStreamsApiGet_stream_idResource)
		m_spStreamsApiGet_stream_idResource = std::make_shared<StreamsApiGet_stream_idResource>();
	this->publish(m_spStreamsApiGet_stream_idResource);
	if (!m_spStreamsApiUsersMeStream_idTopicsResource)
		m_spStreamsApiUsersMeStream_idTopicsResource = std::make_shared<StreamsApiUsersMeStream_idTopicsResource>();
	this->publish(m_spStreamsApiUsersMeStream_idTopicsResource);
	if (!m_spStreamsApiStreamsResource)
		m_spStreamsApiStreamsResource = std::make_shared<StreamsApiStreamsResource>();
	this->publish(m_spStreamsApiStreamsResource);
	if (!m_spStreamsApiUsersUser_idSubscriptionsStream_idResource)
		m_spStreamsApiUsersUser_idSubscriptionsStream_idResource = std::make_shared<StreamsApiUsersUser_idSubscriptionsStream_idResource>();
	this->publish(m_spStreamsApiUsersUser_idSubscriptionsStream_idResource);
	if (!m_spStreamsApiUsersMeSubscriptionsResource)
		m_spStreamsApiUsersMeSubscriptionsResource = std::make_shared<StreamsApiUsersMeSubscriptionsResource>();
	this->publish(m_spStreamsApiUsersMeSubscriptionsResource);
	if (!m_spStreamsApiUsersMeSubscriptionsMuted_topicsResource)
		m_spStreamsApiUsersMeSubscriptionsMuted_topicsResource = std::make_shared<StreamsApiUsersMeSubscriptionsMuted_topicsResource>();
	this->publish(m_spStreamsApiUsersMeSubscriptionsMuted_topicsResource);
	if (!m_spStreamsApiUsersMeSubscriptionsPropertiesResource)
		m_spStreamsApiUsersMeSubscriptionsPropertiesResource = std::make_shared<StreamsApiUsersMeSubscriptionsPropertiesResource>();
	this->publish(m_spStreamsApiUsersMeSubscriptionsPropertiesResource);

	std::shared_ptr<restbed::Settings> settings = std::make_shared<restbed::Settings>();
	settings->set_port(port);
	settings->set_root("/api/v1");
	
	this->start(settings);
}

void StreamsApi::stopService() {
	this->stop();
}

StreamsApiStreamsStream_idResource::StreamsApiStreamsStream_idResource()
{
	this->set_path("/streams/{stream_id: .*}/");
	this->set_method_handler("DELETE",
		std::bind(&StreamsApiStreamsStream_idResource::DELETE_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("PATCH",
		std::bind(&StreamsApiStreamsStream_idResource::PATCH_method_handler, this,
			std::placeholders::_1));
}

StreamsApiStreamsStream_idResource::~StreamsApiStreamsStream_idResource()
{
}

void StreamsApiStreamsStream_idResource::set_handler_DELETE(
	std::function<std::pair<int, std::string>(
		int32_t const &
	)> handler) {
	handler_DELETE_ = std::move(handler);
}

void StreamsApiStreamsStream_idResource::set_handler_PATCH(
	std::function<std::pair<int, std::string>(
		int32_t const &, std::string const &, std::string const &, bool const &, bool const &, int32_t const &, bool const &, std::shared_ptr<OneOfstringinteger> const &
	)> handler) {
	handler_PATCH_ = std::move(handler);
}

void StreamsApiStreamsStream_idResource::DELETE_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			// Getting the path params
			const int32_t streamId = request->get_path_parameter("streamId", 0);



			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_DELETE_)
			{
				std::tie(status_code, result) = handler_DELETE_(
					streamId
				);
			}

			if (status_code == 200) {
				session->close(200, result.empty() ? "Success." : std::move(result), { {"Connection", "close"} });
				return;
			}
			if (status_code == 400) {
				session->close(400, result.empty() ? "Bad request." : std::move(result), { {"Connection", "close"} });
				return;
			}

}

void StreamsApiStreamsStream_idResource::PATCH_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			// Getting the path params
			const int32_t streamId = request->get_path_parameter("streamId", 0);

			// Getting the query params
			const std::string description = request->get_query_parameter("description", "");
			const std::string newName = request->get_query_parameter("newName", "");
			const bool isPrivate = request->get_query_parameter("isPrivate", false);
			const bool isAnnouncementOnly = request->get_query_parameter("isAnnouncementOnly", false);
			const int32_t streamPostPolicy = request->get_query_parameter("streamPostPolicy", 1);
			const bool historyPublicToSubscribers = request->get_query_parameter("historyPublicToSubscribers", false);


			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_PATCH_)
			{
				std::tie(status_code, result) = handler_PATCH_(
					streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays
				);
			}

			if (status_code == 200) {
				std::shared_ptr<JsonSuccess> response = NULL;
				session->close(200, result.empty() ? "Success." : std::move(result), { {"Connection", "close"} });
				return;
			}
			if (status_code == 400) {
				std::shared_ptr<JsonError> response = NULL;
				session->close(400, result.empty() ? "Bad request." : std::move(result), { {"Connection", "close"} });
				return;
			}

}


StreamsApiCallsBigbluebuttonCreateResource::StreamsApiCallsBigbluebuttonCreateResource()
{
	this->set_path("/calls/bigbluebutton/create/");
	this->set_method_handler("GET",
		std::bind(&StreamsApiCallsBigbluebuttonCreateResource::GET_method_handler, this,
			std::placeholders::_1));
}

StreamsApiCallsBigbluebuttonCreateResource::~StreamsApiCallsBigbluebuttonCreateResource()
{
}

void StreamsApiCallsBigbluebuttonCreateResource::set_handler_GET(
	std::function<std::pair<int, std::string>(
		
	)> handler) {
	handler_GET_ = std::move(handler);
}


void StreamsApiCallsBigbluebuttonCreateResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();




			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_GET_)
			{
				std::tie(status_code, result) = handler_GET_(
					
				);
			}

			if (status_code == 200) {
				session->close(200, result.empty() ? "Success." : std::move(result), { {"Connection", "close"} });
				return;
			}

}



StreamsApiGet_stream_idResource::StreamsApiGet_stream_idResource()
{
	this->set_path("/get_stream_id/");
	this->set_method_handler("GET",
		std::bind(&StreamsApiGet_stream_idResource::GET_method_handler, this,
			std::placeholders::_1));
}

StreamsApiGet_stream_idResource::~StreamsApiGet_stream_idResource()
{
}

void StreamsApiGet_stream_idResource::set_handler_GET(
	std::function<std::pair<int, std::string>(
		std::string const &
	)> handler) {
	handler_GET_ = std::move(handler);
}


void StreamsApiGet_stream_idResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();


			// Getting the query params
			const std::string stream = request->get_query_parameter("stream", "");


			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_GET_)
			{
				std::tie(status_code, result) = handler_GET_(
					stream
				);
			}

			if (status_code == 200) {
				session->close(200, result.empty() ? "Success." : std::move(result), { {"Connection", "close"} });
				return;
			}
			if (status_code == 400) {
				session->close(400, result.empty() ? "Bad request." : std::move(result), { {"Connection", "close"} });
				return;
			}

}



StreamsApiUsersMeStream_idTopicsResource::StreamsApiUsersMeStream_idTopicsResource()
{
	this->set_path("/users/me/{stream_id: .*}/topics/");
	this->set_method_handler("GET",
		std::bind(&StreamsApiUsersMeStream_idTopicsResource::GET_method_handler, this,
			std::placeholders::_1));
}

StreamsApiUsersMeStream_idTopicsResource::~StreamsApiUsersMeStream_idTopicsResource()
{
}

void StreamsApiUsersMeStream_idTopicsResource::set_handler_GET(
	std::function<std::pair<int, std::string>(
		int32_t const &
	)> handler) {
	handler_GET_ = std::move(handler);
}


void StreamsApiUsersMeStream_idTopicsResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			// Getting the path params
			const int32_t streamId = request->get_path_parameter("streamId", 0);



			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_GET_)
			{
				std::tie(status_code, result) = handler_GET_(
					streamId
				);
			}

			if (status_code == 200) {
				session->close(200, result.empty() ? "Success." : std::move(result), { {"Connection", "close"} });
				return;
			}
			if (status_code == 400) {
				session->close(400, result.empty() ? "Bad request." : std::move(result), { {"Connection", "close"} });
				return;
			}

}



StreamsApiStreamsResource::StreamsApiStreamsResource()
{
	this->set_path("/streams/");
	this->set_method_handler("GET",
		std::bind(&StreamsApiStreamsResource::GET_method_handler, this,
			std::placeholders::_1));
}

StreamsApiStreamsResource::~StreamsApiStreamsResource()
{
}

void StreamsApiStreamsResource::set_handler_GET(
	std::function<std::pair<int, std::string>(
		bool const &, bool const &, bool const &, bool const &, bool const &, bool const &
	)> handler) {
	handler_GET_ = std::move(handler);
}


void StreamsApiStreamsResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();


			// Getting the query params
			const bool includePublic = request->get_query_parameter("includePublic", true);
			const bool includeWebPublic = request->get_query_parameter("includeWebPublic", false);
			const bool includeSubscribed = request->get_query_parameter("includeSubscribed", true);
			const bool includeAllActive = request->get_query_parameter("includeAllActive", false);
			const bool includeDefault = request->get_query_parameter("includeDefault", false);
			const bool includeOwnerSubscribed = request->get_query_parameter("includeOwnerSubscribed", false);


			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_GET_)
			{
				std::tie(status_code, result) = handler_GET_(
					includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed
				);
			}

			if (status_code == 200) {
				session->close(200, result.empty() ? "Success." : std::move(result), { {"Connection", "close"} });
				return;
			}
			if (status_code == 400) {
				session->close(400, result.empty() ? "Bad request." : std::move(result), { {"Connection", "close"} });
				return;
			}

}



StreamsApiUsersUser_idSubscriptionsStream_idResource::StreamsApiUsersUser_idSubscriptionsStream_idResource()
{
	this->set_path("/users/{user_id: .*}/subscriptions/{stream_id: .*}/");
	this->set_method_handler("GET",
		std::bind(&StreamsApiUsersUser_idSubscriptionsStream_idResource::GET_method_handler, this,
			std::placeholders::_1));
}

StreamsApiUsersUser_idSubscriptionsStream_idResource::~StreamsApiUsersUser_idSubscriptionsStream_idResource()
{
}

void StreamsApiUsersUser_idSubscriptionsStream_idResource::set_handler_GET(
	std::function<std::pair<int, std::string>(
		int32_t const &, int32_t const &
	)> handler) {
	handler_GET_ = std::move(handler);
}


void StreamsApiUsersUser_idSubscriptionsStream_idResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			// Getting the path params
			const int32_t userId = request->get_path_parameter("userId", 0);
			const int32_t streamId = request->get_path_parameter("streamId", 0);



			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_GET_)
			{
				std::tie(status_code, result) = handler_GET_(
					userId, streamId
				);
			}

			if (status_code == 200) {
				session->close(200, result.empty() ? "Success" : std::move(result), { {"Connection", "close"} });
				return;
			}

}



StreamsApiUsersMeSubscriptionsResource::StreamsApiUsersMeSubscriptionsResource()
{
	this->set_path("/users/me/subscriptions/");
	this->set_method_handler("GET",
		std::bind(&StreamsApiUsersMeSubscriptionsResource::GET_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("PATCH",
		std::bind(&StreamsApiUsersMeSubscriptionsResource::PATCH_method_handler, this,
			std::placeholders::_1));
}

StreamsApiUsersMeSubscriptionsResource::~StreamsApiUsersMeSubscriptionsResource()
{
}

void StreamsApiUsersMeSubscriptionsResource::set_handler_GET(
	std::function<std::pair<int, std::string>(
		bool const &
	)> handler) {
	handler_GET_ = std::move(handler);
}

void StreamsApiUsersMeSubscriptionsResource::set_handler_PATCH(
	std::function<std::pair<int, std::string>(
		std::vector<std::string> const &, std::vector<std::shared_ptr<Object>> const &
	)> handler) {
	handler_PATCH_ = std::move(handler);
}

void StreamsApiUsersMeSubscriptionsResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();


			// Getting the query params
			const bool includeSubscribers = request->get_query_parameter("includeSubscribers", false);


			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_GET_)
			{
				std::tie(status_code, result) = handler_GET_(
					includeSubscribers
				);
			}

			if (status_code == 200) {
				session->close(200, result.empty() ? "Success." : std::move(result), { {"Connection", "close"} });
				return;
			}

}

void StreamsApiUsersMeSubscriptionsResource::PATCH_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();


			// Getting the query params


			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_PATCH_)
			{
				std::tie(status_code, result) = handler_PATCH_(
					r_delete, add
				);
			}

			if (status_code == 200) {
				std::shared_ptr<JsonSuccessBase> response = NULL;
				session->close(200, result.empty() ? "Success." : std::move(result), { {"Connection", "close"} });
				return;
			}

}


StreamsApiUsersMeSubscriptionsMuted_topicsResource::StreamsApiUsersMeSubscriptionsMuted_topicsResource()
{
	this->set_path("/users/me/subscriptions/muted_topics/");
	this->set_method_handler("PATCH",
		std::bind(&StreamsApiUsersMeSubscriptionsMuted_topicsResource::PATCH_method_handler, this,
			std::placeholders::_1));
}

StreamsApiUsersMeSubscriptionsMuted_topicsResource::~StreamsApiUsersMeSubscriptionsMuted_topicsResource()
{
}

void StreamsApiUsersMeSubscriptionsMuted_topicsResource::set_handler_PATCH(
	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &, std::string const &, int32_t const &
	)> handler) {
	handler_PATCH_ = std::move(handler);
}


void StreamsApiUsersMeSubscriptionsMuted_topicsResource::PATCH_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();


			// Getting the query params
			const std::string stream = request->get_query_parameter("stream", "");
			const int32_t streamId = request->get_query_parameter("streamId", 0);
			const std::string topic = request->get_query_parameter("topic", "");
			const std::string op = request->get_query_parameter("op", "");


			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_PATCH_)
			{
				std::tie(status_code, result) = handler_PATCH_(
					topic, op, stream, streamId
				);
			}

			if (status_code == 200) {
				session->close(200, result.empty() ? "Success." : std::move(result), { {"Connection", "close"} });
				return;
			}
			if (status_code == 400) {
				session->close(400, result.empty() ? "Bad request." : std::move(result), { {"Connection", "close"} });
				return;
			}

}



StreamsApiUsersMeSubscriptionsPropertiesResource::StreamsApiUsersMeSubscriptionsPropertiesResource()
{
	this->set_path("/users/me/subscriptions/properties/");
	this->set_method_handler("POST",
		std::bind(&StreamsApiUsersMeSubscriptionsPropertiesResource::POST_method_handler, this,
			std::placeholders::_1));
}

StreamsApiUsersMeSubscriptionsPropertiesResource::~StreamsApiUsersMeSubscriptionsPropertiesResource()
{
}

void StreamsApiUsersMeSubscriptionsPropertiesResource::set_handler_POST(
	std::function<std::pair<int, std::string>(
		std::vector<std::shared_ptr<Object>> const &
	)> handler) {
	handler_POST_ = std::move(handler);
}


void StreamsApiUsersMeSubscriptionsPropertiesResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();


			// Getting the query params


			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_POST_)
			{
				std::tie(status_code, result) = handler_POST_(
					subscriptionData
				);
			}

			if (status_code == 200) {
				session->close(200, result.empty() ? "Success." : std::move(result), { {"Connection", "close"} });
				return;
			}

}




}
}
}
}
