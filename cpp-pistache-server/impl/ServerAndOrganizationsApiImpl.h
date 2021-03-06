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

/*
* ServerAndOrganizationsApiImpl.h
*
* 
*/

#ifndef SERVER_AND_ORGANIZATIONS_API_IMPL_H_
#define SERVER_AND_ORGANIZATIONS_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>

#include <ServerAndOrganizationsApi.h>

#include <pistache/optional.h>

#include "JsonSuccess.h"
#include "JsonSuccessBase.h"
#include "Object.h"
#include <string>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class ServerAndOrganizationsApiImpl : public org::openapitools::server::api::ServerAndOrganizationsApi {
public:
    explicit ServerAndOrganizationsApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~ServerAndOrganizationsApiImpl() override = default;

    void add_code_playground(const Pistache::Optional<std::string> &name, const Pistache::Optional<std::string> &pygmentsLanguage, const Pistache::Optional<std::string> &urlPrefix, Pistache::Http::ResponseWriter &response);
    void add_linkifier(const Pistache::Optional<std::string> &pattern, const Pistache::Optional<std::string> &urlFormatString, Pistache::Http::ResponseWriter &response);
    void create_custom_profile_field(const Pistache::Optional<int32_t> &fieldType, const Pistache::Optional<std::string> &name, const Pistache::Optional<std::string> &hint, const Pistache::Optional<Object> &fieldData, Pistache::Http::ResponseWriter &response);
    void get_custom_emoji(Pistache::Http::ResponseWriter &response);
    void get_custom_profile_fields(Pistache::Http::ResponseWriter &response);
    void get_linkifiers(Pistache::Http::ResponseWriter &response);
    void get_server_settings(Pistache::Http::ResponseWriter &response);
    void remove_code_playground(const int32_t &playgroundId, Pistache::Http::ResponseWriter &response);
    void remove_linkifier(const int32_t &filterId, Pistache::Http::ResponseWriter &response);
    void reorder_custom_profile_fields(const Pistache::Optional<std::vector<int32_t>> &order, Pistache::Http::ResponseWriter &response);
    void update_linkifier(const int32_t &filterId, const Pistache::Optional<std::string> &pattern, const Pistache::Optional<std::string> &urlFormatString, Pistache::Http::ResponseWriter &response);
    void upload_custom_emoji(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
