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

#include "AuthenticationApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

AuthenticationApi::AuthenticationApi() {
}

AuthenticationApi::~AuthenticationApi() {}

void AuthenticationApi::startService(int const& port) {
	// A typical pattern is to derive a class from AuthenticationApi and allocate the shared pointers for restbed::Resource objects
	// and manipulate them (e.g. binding GET/POST handler functions) before this startService() gets called.
	// In such a case we want to use our m_spXXX variables.
	// However in case these shared pointers are nullptr, then allocate the restbed::Resources now:
	if (!m_spAuthenticationApiDev_fetch_api_keyResource)
		m_spAuthenticationApiDev_fetch_api_keyResource = std::make_shared<AuthenticationApiDev_fetch_api_keyResource>();
	this->publish(m_spAuthenticationApiDev_fetch_api_keyResource);
	if (!m_spAuthenticationApiFetch_api_keyResource)
		m_spAuthenticationApiFetch_api_keyResource = std::make_shared<AuthenticationApiFetch_api_keyResource>();
	this->publish(m_spAuthenticationApiFetch_api_keyResource);

	std::shared_ptr<restbed::Settings> settings = std::make_shared<restbed::Settings>();
	settings->set_port(port);
	settings->set_root("/api/v1");
	
	this->start(settings);
}

void AuthenticationApi::stopService() {
	this->stop();
}

AuthenticationApiDev_fetch_api_keyResource::AuthenticationApiDev_fetch_api_keyResource()
{
	this->set_path("/dev_fetch_api_key/");
	this->set_method_handler("POST",
		std::bind(&AuthenticationApiDev_fetch_api_keyResource::POST_method_handler, this,
			std::placeholders::_1));
}

AuthenticationApiDev_fetch_api_keyResource::~AuthenticationApiDev_fetch_api_keyResource()
{
}

void AuthenticationApiDev_fetch_api_keyResource::set_handler_POST(
	std::function<std::pair<int, std::string>(
		std::string const &
	)> handler) {
	handler_POST_ = std::move(handler);
}


void AuthenticationApiDev_fetch_api_keyResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();


			// Getting the query params
			const std::string username = request->get_query_parameter("username", "");


			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_POST_)
			{
				std::tie(status_code, result) = handler_POST_(
					username
				);
			}

			if (status_code == 200) {
				session->close(200, result.empty() ? "Success." : std::move(result), { {"Connection", "close"} });
				return;
			}

}



AuthenticationApiFetch_api_keyResource::AuthenticationApiFetch_api_keyResource()
{
	this->set_path("/fetch_api_key/");
	this->set_method_handler("POST",
		std::bind(&AuthenticationApiFetch_api_keyResource::POST_method_handler, this,
			std::placeholders::_1));
}

AuthenticationApiFetch_api_keyResource::~AuthenticationApiFetch_api_keyResource()
{
}

void AuthenticationApiFetch_api_keyResource::set_handler_POST(
	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &
	)> handler) {
	handler_POST_ = std::move(handler);
}


void AuthenticationApiFetch_api_keyResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();


			// Getting the query params
			const std::string username = request->get_query_parameter("username", "");
			const std::string password = request->get_query_parameter("password", "");


			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_POST_)
			{
				std::tie(status_code, result) = handler_POST_(
					username, password
				);
			}

			if (status_code == 200) {
				session->close(200, result.empty() ? "Valid credentials the client can use to access the Zulip API." : std::move(result), { {"Connection", "close"} });
				return;
			}

}




}
}
}
}

