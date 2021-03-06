/**
* Zulip REST API
* Powerful open source group chat 
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

#include "AuthenticationApi.h"
#include "Helpers.h"

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::helpers;
using namespace org::openapitools::server::model;

const std::string AuthenticationApi::base = "/api/v1";

AuthenticationApi::AuthenticationApi(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : router(rtr)
{
}

void AuthenticationApi::init() {
    setupRoutes();
}

void AuthenticationApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Post(*router, base + "/dev_fetch_api_key", Routes::bind(&AuthenticationApi::dev_fetch_api_key_handler, this));
    Routes::Post(*router, base + "/fetch_api_key", Routes::bind(&AuthenticationApi::fetch_api_key_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&AuthenticationApi::authentication_api_default_handler, this));
}

std::pair<Pistache::Http::Code, std::string> AuthenticationApi::handleParsingException(const std::exception& ex) const noexcept
{
    try {
        throw;
    } catch (nlohmann::detail::exception &e) {
        return std::make_pair(Pistache::Http::Code::Bad_Request, e.what());
    } catch (org::openapitools::server::helpers::ValidationException &e) {
        return std::make_pair(Pistache::Http::Code::Bad_Request, e.what());
    } catch (std::exception &e) {
        return std::make_pair(Pistache::Http::Code::Internal_Server_Error, e.what())
    }
}

std::pair<Pistache::Http::Code, std::string> AuthenticationApi::handleOperationException(const std::exception& ex) const noexcept
{
    return std::make_pair(Pistache::Http::Code::Internal_Server_Error, ex.what());
}

void AuthenticationApi::dev_fetch_api_key_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {


    // Getting the query params
    auto usernameQuery = request.query().get("username");
    Pistache::Optional<std::string> username;
    if(!usernameQuery.isEmpty()){
        std::string valueQuery_instance;
        if(fromStringValue(usernameQuery.get(), valueQuery_instance)){
            username = Pistache::Some(valueQuery_instance);
        }
    }
    
    try {
        this->dev_fetch_api_key(username, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AuthenticationApi::fetch_api_key_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {


    // Getting the query params
    auto usernameQuery = request.query().get("username");
    Pistache::Optional<std::string> username;
    if(!usernameQuery.isEmpty()){
        std::string valueQuery_instance;
        if(fromStringValue(usernameQuery.get(), valueQuery_instance)){
            username = Pistache::Some(valueQuery_instance);
        }
    }
    auto passwordQuery = request.query().get("password");
    Pistache::Optional<std::string> password;
    if(!passwordQuery.isEmpty()){
        std::string valueQuery_instance;
        if(fromStringValue(passwordQuery.get(), valueQuery_instance)){
            password = Pistache::Some(valueQuery_instance);
        }
    }
    
    try {
        this->fetch_api_key(username, password, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}

void AuthenticationApi::authentication_api_default_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

} // namespace org::openapitools::server::api

