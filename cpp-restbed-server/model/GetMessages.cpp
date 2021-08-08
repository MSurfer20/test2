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



#include "GetMessages.h"

#include <string>
#include <sstream>
#include <stdexcept>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

GetMessages::GetMessages()
{
	m_Last_edit_timestamp = 0;
	m_Match_content = "";
	m_Match_subject = "";
}

GetMessages::~GetMessages()
{
}

std::string GetMessages::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GetMessages::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GetMessages::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Flags
	if (!m_Flags.empty()) {
		for (const auto &childEntry : m_Flags) {
			ptree Flags_node;
			Flags_node.put("", childEntry);
			tmp_node.push_back(std::make_pair("", Flags_node));
		}
		pt.add_child("flags", tmp_node);
		tmp_node.clear();
	}
	pt.put("last_edit_timestamp", m_Last_edit_timestamp);
	pt.put("match_content", m_Match_content);
	pt.put("match_subject", m_Match_subject);
	return pt;
}

void GetMessages::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Flags into member vector
	if (pt.get_child_optional("flags")) {
		for (const auto &childTree : pt.get_child("flags")) {
			m_Flags.emplace_back(childTree.second.data());
		}
	}
	m_Last_edit_timestamp = pt.get("last_edit_timestamp", 0);
	m_Match_content = pt.get("match_content", "");
	m_Match_subject = pt.get("match_subject", "");
}

std::shared_ptr<AnyType> GetMessages::getAvatarUrl() const
{
    return m_Avatar_url;
}
void GetMessages::setAvatarUrl(std::shared_ptr<AnyType> value)
{
	m_Avatar_url = value;
}
std::shared_ptr<AnyType> GetMessages::getClient() const
{
    return m_Client;
}
void GetMessages::setClient(std::shared_ptr<AnyType> value)
{
	m_Client = value;
}
std::shared_ptr<AnyType> GetMessages::getContent() const
{
    return m_Content;
}
void GetMessages::setContent(std::shared_ptr<AnyType> value)
{
	m_Content = value;
}
std::shared_ptr<AnyType> GetMessages::getContentType() const
{
    return m_Content_type;
}
void GetMessages::setContentType(std::shared_ptr<AnyType> value)
{
	m_Content_type = value;
}
std::shared_ptr<AnyType> GetMessages::getDisplayRecipient() const
{
    return m_Display_recipient;
}
void GetMessages::setDisplayRecipient(std::shared_ptr<AnyType> value)
{
	m_Display_recipient = value;
}
std::shared_ptr<AnyType> GetMessages::getId() const
{
    return m_Id;
}
void GetMessages::setId(std::shared_ptr<AnyType> value)
{
	m_Id = value;
}
std::shared_ptr<AnyType> GetMessages::getIsMeMessage() const
{
    return m_Is_me_message;
}
void GetMessages::setIsMeMessage(std::shared_ptr<AnyType> value)
{
	m_Is_me_message = value;
}
std::shared_ptr<AnyType> GetMessages::getReactions() const
{
    return m_Reactions;
}
void GetMessages::setReactions(std::shared_ptr<AnyType> value)
{
	m_Reactions = value;
}
std::shared_ptr<AnyType> GetMessages::getRecipientId() const
{
    return m_Recipient_id;
}
void GetMessages::setRecipientId(std::shared_ptr<AnyType> value)
{
	m_Recipient_id = value;
}
std::shared_ptr<AnyType> GetMessages::getSenderEmail() const
{
    return m_Sender_email;
}
void GetMessages::setSenderEmail(std::shared_ptr<AnyType> value)
{
	m_Sender_email = value;
}
std::shared_ptr<AnyType> GetMessages::getSenderFullName() const
{
    return m_Sender_full_name;
}
void GetMessages::setSenderFullName(std::shared_ptr<AnyType> value)
{
	m_Sender_full_name = value;
}
std::shared_ptr<AnyType> GetMessages::getSenderId() const
{
    return m_Sender_id;
}
void GetMessages::setSenderId(std::shared_ptr<AnyType> value)
{
	m_Sender_id = value;
}
std::shared_ptr<AnyType> GetMessages::getSenderRealmStr() const
{
    return m_Sender_realm_str;
}
void GetMessages::setSenderRealmStr(std::shared_ptr<AnyType> value)
{
	m_Sender_realm_str = value;
}
std::shared_ptr<AnyType> GetMessages::getStreamId() const
{
    return m_Stream_id;
}
void GetMessages::setStreamId(std::shared_ptr<AnyType> value)
{
	m_Stream_id = value;
}
std::shared_ptr<AnyType> GetMessages::getSubject() const
{
    return m_Subject;
}
void GetMessages::setSubject(std::shared_ptr<AnyType> value)
{
	m_Subject = value;
}
std::shared_ptr<AnyType> GetMessages::getTopicLinks() const
{
    return m_Topic_links;
}
void GetMessages::setTopicLinks(std::shared_ptr<AnyType> value)
{
	m_Topic_links = value;
}
std::shared_ptr<AnyType> GetMessages::getSubmessages() const
{
    return m_Submessages;
}
void GetMessages::setSubmessages(std::shared_ptr<AnyType> value)
{
	m_Submessages = value;
}
std::shared_ptr<AnyType> GetMessages::getTimestamp() const
{
    return m_Timestamp;
}
void GetMessages::setTimestamp(std::shared_ptr<AnyType> value)
{
	m_Timestamp = value;
}
std::shared_ptr<AnyType> GetMessages::getType() const
{
    return m_Type;
}
void GetMessages::setType(std::shared_ptr<AnyType> value)
{
	m_Type = value;
}
std::vector<std::string> GetMessages::getFlags() const
{
    return m_Flags;
}
void GetMessages::setFlags(std::vector<std::string> value)
{
	m_Flags = value;
}
int32_t GetMessages::getLastEditTimestamp() const
{
    return m_Last_edit_timestamp;
}
void GetMessages::setLastEditTimestamp(int32_t value)
{
	m_Last_edit_timestamp = value;
}
std::string GetMessages::getMatchContent() const
{
    return m_Match_content;
}
void GetMessages::setMatchContent(std::string value)
{
	m_Match_content = value;
}
std::string GetMessages::getMatchSubject() const
{
    return m_Match_subject;
}
void GetMessages::setMatchSubject(std::string value)
{
	m_Match_subject = value;
}

}
}
}
}
