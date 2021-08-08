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



#include "Attachments.h"

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

Attachments::Attachments()
{
	m_Id = 0;
	m_Name = "";
	m_Path_id = "";
	m_Size = 0;
	m_Create_time = 0;
}

Attachments::~Attachments()
{
}

std::string Attachments::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void Attachments::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Attachments::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("name", m_Name);
	pt.put("path_id", m_Path_id);
	pt.put("size", m_Size);
	pt.put("create_time", m_Create_time);
	// generate tree for Messages
	if (!m_Messages.empty()) {
		for (const auto &childEntry : m_Messages) {
			ptree Messages_node;
			Messages_node.put("", childEntry);
			tmp_node.push_back(std::make_pair("", Messages_node));
		}
		pt.add_child("messages", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void Attachments::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", 0);
	m_Name = pt.get("name", "");
	m_Path_id = pt.get("path_id", "");
	m_Size = pt.get("size", 0);
	m_Create_time = pt.get("create_time", 0);
	// push all items of Messages into member vector
	if (pt.get_child_optional("messages")) {
		for (const auto &childTree : pt.get_child("messages")) {
			m_Messages.emplace_back(childTree.second.data());
		}
	}
}

int32_t Attachments::getId() const
{
    return m_Id;
}
void Attachments::setId(int32_t value)
{
	m_Id = value;
}
std::string Attachments::getName() const
{
    return m_Name;
}
void Attachments::setName(std::string value)
{
	m_Name = value;
}
std::string Attachments::getPathId() const
{
    return m_Path_id;
}
void Attachments::setPathId(std::string value)
{
	m_Path_id = value;
}
int32_t Attachments::getSize() const
{
    return m_Size;
}
void Attachments::setSize(int32_t value)
{
	m_Size = value;
}
int32_t Attachments::getCreateTime() const
{
    return m_Create_time;
}
void Attachments::setCreateTime(int32_t value)
{
	m_Create_time = value;
}
std::vector<std::shared_ptr<Attachments_messages>> Attachments::getMessages() const
{
    return m_Messages;
}
void Attachments::setMessages(std::vector<std::shared_ptr<Attachments_messages>> value)
{
	m_Messages = value;
}

}
}
}
}

