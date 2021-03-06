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



#include "Draft.h"

#include <string>
#include <sstream>
#include <stdexcept>
#include <algorithm>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

Draft::Draft()
{
	m_Id = 0;
	m_Type = "";
	m_TypeEnum = { , stream, private };
	m_Topic = "";
	m_Content = "";
	m_Timestamp = 0.0;
}

Draft::~Draft()
{
}

std::string Draft::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void Draft::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Draft::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("type", m_Type);
	// generate tree for To
	if (!m_To.empty()) {
		for (const auto &childEntry : m_To) {
			ptree To_node;
			To_node.put("", childEntry);
			tmp_node.push_back(std::make_pair("", To_node));
		}
		pt.add_child("to", tmp_node);
		tmp_node.clear();
	}
	pt.put("topic", m_Topic);
	pt.put("content", m_Content);
	pt.put("timestamp", m_Timestamp);
	return pt;
}

void Draft::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", 0);
	setType(pt.get("type", ""));
	// push all items of To into member vector
	if (pt.get_child_optional("to")) {
		for (const auto &childTree : pt.get_child("to")) {
			m_To.emplace_back(std::stoi(childTree.second.data()));
		}
	}
	m_Topic = pt.get("topic", "");
	m_Content = pt.get("content", "");
	m_Timestamp = pt.get("timestamp", 0.0);
}

int32_t Draft::getId() const
{
    return m_Id;
}
void Draft::setId(int32_t value)
{
	m_Id = value;
}
std::string Draft::getType() const
{
    return m_Type;
}
void Draft::setType(std::string value)
{
	if (std::find(m_TypeEnum.begin(), m_TypeEnum.end(), value) != m_TypeEnum.end()) {
		m_Type = value;
	} else {
		throw std::runtime_error("Value " + value + " not allowed");
	}
}
std::vector<int32_t> Draft::getTo() const
{
    return m_To;
}
void Draft::setTo(std::vector<int32_t> value)
{
	m_To = value;
}
std::string Draft::getTopic() const
{
    return m_Topic;
}
void Draft::setTopic(std::string value)
{
	m_Topic = value;
}
std::string Draft::getContent() const
{
    return m_Content;
}
void Draft::setContent(std::string value)
{
	m_Content = value;
}
double Draft::getTimestamp() const
{
    return m_Timestamp;
}
void Draft::setTimestamp(double value)
{
	m_Timestamp = value;
}

}
}
}
}

