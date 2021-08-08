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



#include "UserGroup.h"

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

UserGroup::UserGroup()
{
	m_Name = "";
	m_Description = "";
	m_Id = 0;
}

UserGroup::~UserGroup()
{
}

std::string UserGroup::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void UserGroup::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree UserGroup::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	pt.put("name", m_Name);
	pt.put("description", m_Description);
	// generate tree for Members
	if (!m_Members.empty()) {
		for (const auto &childEntry : m_Members) {
			ptree Members_node;
			Members_node.put("", childEntry);
			tmp_node.push_back(std::make_pair("", Members_node));
		}
		pt.add_child("members", tmp_node);
		tmp_node.clear();
	}
	pt.put("id", m_Id);
	return pt;
}

void UserGroup::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Name = pt.get("name", "");
	m_Description = pt.get("description", "");
	// push all items of Members into member vector
	if (pt.get_child_optional("members")) {
		for (const auto &childTree : pt.get_child("members")) {
			m_Members.emplace_back(std::stoi(childTree.second.data()));
		}
	}
	m_Id = pt.get("id", 0);
}

std::string UserGroup::getName() const
{
    return m_Name;
}
void UserGroup::setName(std::string value)
{
	m_Name = value;
}
std::string UserGroup::getDescription() const
{
    return m_Description;
}
void UserGroup::setDescription(std::string value)
{
	m_Description = value;
}
std::vector<int32_t> UserGroup::getMembers() const
{
    return m_Members;
}
void UserGroup::setMembers(std::vector<int32_t> value)
{
	m_Members = value;
}
int32_t UserGroup::getId() const
{
    return m_Id;
}
void UserGroup::setId(int32_t value)
{
	m_Id = value;
}

}
}
}
}

