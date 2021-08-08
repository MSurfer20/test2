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

#include "AuthenticationApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

AuthenticationApiImpl::AuthenticationApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : AuthenticationApi(rtr)
{
}

void AuthenticationApiImpl::dev_fetch_api_key(const Pistache::Optional<std::string> &username, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void AuthenticationApiImpl::fetch_api_key(const Pistache::Optional<std::string> &username, const Pistache::Optional<std::string> &password, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}
