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

#include "StreamsApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

StreamsApiImpl::StreamsApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : StreamsApi(rtr)
{
}

void StreamsApiImpl::archive_stream(const int32_t &streamId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void StreamsApiImpl::create_big_blue_button_video_call(Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void StreamsApiImpl::delete_topic(const int32_t &streamId, const Pistache::Optional<std::string> &topicName, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void StreamsApiImpl::get_stream_id(const Pistache::Optional<std::string> &stream, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void StreamsApiImpl::get_stream_topics(const int32_t &streamId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void StreamsApiImpl::get_streams(const Pistache::Optional<bool> &includePublic, const Pistache::Optional<bool> &includeWebPublic, const Pistache::Optional<bool> &includeSubscribed, const Pistache::Optional<bool> &includeAllActive, const Pistache::Optional<bool> &includeDefault, const Pistache::Optional<bool> &includeOwnerSubscribed, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void StreamsApiImpl::get_subscribers(const int32_t &streamId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void StreamsApiImpl::get_subscription_status(const int32_t &userId, const int32_t &streamId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void StreamsApiImpl::get_subscriptions(const Pistache::Optional<bool> &includeSubscribers, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void StreamsApiImpl::mute_topic(const Pistache::Optional<std::string> &topic, const Pistache::Optional<std::string> &op, const Pistache::Optional<std::string> &stream, const Pistache::Optional<int32_t> &streamId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void StreamsApiImpl::subscribe(const Pistache::Optional<std::vector<Object>> &subscriptions, const Pistache::Optional<std::vector<OneOfstringinteger>> &principals, const Pistache::Optional<bool> &authorizationErrorsFatal, const Pistache::Optional<bool> &announce, const Pistache::Optional<bool> &inviteOnly, const Pistache::Optional<bool> &historyPublicToSubscribers, const Pistache::Optional<int32_t> &streamPostPolicy, const Pistache::Optional<OneOfstringinteger> &messageRetentionDays, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void StreamsApiImpl::unsubscribe(const Pistache::Optional<std::vector<std::string>> &subscriptions, const Pistache::Optional<std::vector<OneOfstringinteger>> &principals, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void StreamsApiImpl::update_stream(const int32_t &streamId, const Pistache::Optional<std::string> &description, const Pistache::Optional<std::string> &newName, const Pistache::Optional<bool> &isPrivate, const Pistache::Optional<bool> &isAnnouncementOnly, const Pistache::Optional<int32_t> &streamPostPolicy, const Pistache::Optional<bool> &historyPublicToSubscribers, const Pistache::Optional<OneOfstringinteger> &messageRetentionDays, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void StreamsApiImpl::update_subscription_settings(const Pistache::Optional<std::vector<Object>> &subscriptionData, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void StreamsApiImpl::update_subscriptions(const Pistache::Optional<std::vector<std::string>> &r_delete, const Pistache::Optional<std::vector<Object>> &add, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}

