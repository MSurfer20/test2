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

#include "MessagesApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

MessagesApiImpl::MessagesApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : MessagesApi(rtr)
{
}

void MessagesApiImpl::add_reaction(const int32_t &messageId, const Pistache::Optional<std::string> &emojiName, const Pistache::Optional<std::string> &emojiCode, const Pistache::Optional<std::string> &reactionType, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::check_messages_match_narrow(const Pistache::Optional<std::vector<int32_t>> &msgIds, const Pistache::Optional<std::vector<Object>> &narrow, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::delete_message(const int32_t &messageId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::get_file_temporary_url(const int32_t &realmIdStr, const std::string &filename, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::get_message_history(const int32_t &messageId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::get_messages(const Pistache::Optional<int32_t> &numBefore, const Pistache::Optional<int32_t> &numAfter, const Pistache::Optional<OneOfstringinteger> &anchor, const Pistache::Optional<std::vector<Object>> &narrow, const Pistache::Optional<bool> &clientGravatar, const Pistache::Optional<bool> &applyMarkdown, const Pistache::Optional<bool> &useFirstUnreadAnchor, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::get_raw_message(const int32_t &messageId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::mark_all_as_read(Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::mark_stream_as_read(const Pistache::Optional<int32_t> &streamId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::mark_topic_as_read(const Pistache::Optional<int32_t> &streamId, const Pistache::Optional<std::string> &topicName, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::remove_reaction(const int32_t &messageId, const Pistache::Optional<std::string> &emojiName, const Pistache::Optional<std::string> &emojiCode, const Pistache::Optional<std::string> &reactionType, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::render_message(const Pistache::Optional<std::string> &content, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::send_message(const Pistache::Optional<std::string> &type, const Pistache::Optional<std::vector<int32_t>> &to, const Pistache::Optional<std::string> &content, const Pistache::Optional<std::string> &topic, const Pistache::Optional<std::string> &queueId, const Pistache::Optional<std::string> &localId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::update_message(const int32_t &messageId, const Pistache::Optional<std::string> &topic, const Pistache::Optional<std::string> &propagateMode, const Pistache::Optional<bool> &sendNotificationToOldThread, const Pistache::Optional<bool> &sendNotificationToNewThread, const Pistache::Optional<std::string> &content, const Pistache::Optional<int32_t> &streamId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::update_message_flags(const Pistache::Optional<std::vector<int32_t>> &messages, const Pistache::Optional<std::string> &op, const Pistache::Optional<std::string> &flag, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void MessagesApiImpl::upload_file(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter &response){
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}
