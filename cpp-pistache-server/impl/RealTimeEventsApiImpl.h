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
* RealTimeEventsApiImpl.h
*
* 
*/

#ifndef REAL_TIME_EVENTS_API_IMPL_H_
#define REAL_TIME_EVENTS_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>

#include <RealTimeEventsApi.h>

#include <pistache/optional.h>

#include "BadEventQueueIdError.h"
#include "JsonSuccess.h"
#include "JsonSuccessBase.h"
#include "Object.h"
#include "OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError.h"
#include "OneOfRateLimitedError.h"
#include "OneOfUserDeactivatedErrorRealmDeactivatedError.h"
#include <string>
#include <vector>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class RealTimeEventsApiImpl : public org::openapitools::server::api::RealTimeEventsApi {
public:
    explicit RealTimeEventsApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~RealTimeEventsApiImpl() override = default;

    void delete_queue(const Pistache::Optional<std::string> &queueId, Pistache::Http::ResponseWriter &response);
    void get_events(const Pistache::Optional<std::string> &queueId, const Pistache::Optional<int32_t> &lastEventId, const Pistache::Optional<bool> &dontBlock, Pistache::Http::ResponseWriter &response);
    void real_time_post(const Pistache::Optional<std::vector<std::string>> &eventTypes, const Pistache::Optional<std::vector<std::vector<std::string>>> &narrow, const Pistache::Optional<bool> &allPublicStreams, Pistache::Http::ResponseWriter &response);
    void register_queue(const Pistache::Optional<bool> &applyMarkdown, const Pistache::Optional<bool> &clientGravatar, const Pistache::Optional<bool> &slimPresence, const Pistache::Optional<std::vector<std::string>> &eventTypes, const Pistache::Optional<bool> &allPublicStreams, const Pistache::Optional<bool> &includeSubscribers, const Pistache::Optional<Object> &clientCapabilities, const Pistache::Optional<std::vector<std::string>> &fetchEventTypes, const Pistache::Optional<std::vector<std::vector<std::string>>> &narrow, Pistache::Http::ResponseWriter &response);
    void rest_error_handling(Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
