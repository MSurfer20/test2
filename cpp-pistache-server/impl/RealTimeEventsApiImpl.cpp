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

#include "RealTimeEventsApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

RealTimeEventsApiImpl::RealTimeEventsApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : RealTimeEventsApi(rtr)
{
}

void RealTimeEventsApiImpl::delete_queue(const Pistache::Optional<std::string> &queueId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void RealTimeEventsApiImpl::get_events(const Pistache::Optional<std::string> &queueId, const Pistache::Optional<int32_t> &lastEventId, const Pistache::Optional<bool> &dontBlock, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void RealTimeEventsApiImpl::real_time_post(const Pistache::Optional<std::vector<std::string>> &eventTypes, const Pistache::Optional<std::vector<std::vector<std::string>>> &narrow, const Pistache::Optional<bool> &allPublicStreams, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void RealTimeEventsApiImpl::register_queue(const Pistache::Optional<bool> &applyMarkdown, const Pistache::Optional<bool> &clientGravatar, const Pistache::Optional<bool> &slimPresence, const Pistache::Optional<std::vector<std::string>> &eventTypes, const Pistache::Optional<bool> &allPublicStreams, const Pistache::Optional<bool> &includeSubscribers, const Pistache::Optional<Object> &clientCapabilities, const Pistache::Optional<std::vector<std::string>> &fetchEventTypes, const Pistache::Optional<std::vector<std::vector<std::string>>> &narrow, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void RealTimeEventsApiImpl::rest_error_handling(Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}
