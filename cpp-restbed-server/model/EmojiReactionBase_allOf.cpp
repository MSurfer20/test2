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



#include "EmojiReactionBase_allOf.h"

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

EmojiReactionBase_allOf::EmojiReactionBase_allOf()
{
	m_User_id = 0;
}

EmojiReactionBase_allOf::~EmojiReactionBase_allOf()
{
}

std::string EmojiReactionBase_allOf::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void EmojiReactionBase_allOf::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree EmojiReactionBase_allOf::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	pt.put("user_id", m_User_id);
	if (m_User != nullptr) {
		pt.add_child("user", m_User->toPropertyTree());
	}
	return pt;
}

void EmojiReactionBase_allOf::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_User_id = pt.get("user_id", 0);
	if (pt.get_child_optional("user")) {
		m_User = std::make_shared<EmojiReactionBase_allOf_user>();
		m_User->fromPropertyTree(pt.get_child("user"));
	}
}

int32_t EmojiReactionBase_allOf::getUserId() const
{
    return m_User_id;
}
void EmojiReactionBase_allOf::setUserId(int32_t value)
{
	m_User_id = value;
}
std::shared_ptr<EmojiReactionBase_allOf_user> EmojiReactionBase_allOf::getUser() const
{
    return m_User;
}
void EmojiReactionBase_allOf::setUser(std::shared_ptr<EmojiReactionBase_allOf_user> value)
{
	m_User = value;
}

}
}
}
}

