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



#include "EmojiReactionBase_allOf_user.h"

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

EmojiReactionBase_allOf_user::EmojiReactionBase_allOf_user()
{
	m_Id = 0;
	m_Email = "";
	m_Full_name = "";
	m_Is_mirror_dummy = false;
}

EmojiReactionBase_allOf_user::~EmojiReactionBase_allOf_user()
{
}

std::string EmojiReactionBase_allOf_user::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void EmojiReactionBase_allOf_user::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree EmojiReactionBase_allOf_user::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("email", m_Email);
	pt.put("full_name", m_Full_name);
	pt.put("is_mirror_dummy", m_Is_mirror_dummy);
	return pt;
}

void EmojiReactionBase_allOf_user::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", 0);
	m_Email = pt.get("email", "");
	m_Full_name = pt.get("full_name", "");
	m_Is_mirror_dummy = pt.get("is_mirror_dummy", false);
}

int32_t EmojiReactionBase_allOf_user::getId() const
{
    return m_Id;
}
void EmojiReactionBase_allOf_user::setId(int32_t value)
{
	m_Id = value;
}
std::string EmojiReactionBase_allOf_user::getEmail() const
{
    return m_Email;
}
void EmojiReactionBase_allOf_user::setEmail(std::string value)
{
	m_Email = value;
}
std::string EmojiReactionBase_allOf_user::getFullName() const
{
    return m_Full_name;
}
void EmojiReactionBase_allOf_user::setFullName(std::string value)
{
	m_Full_name = value;
}
bool EmojiReactionBase_allOf_user::isIsMirrorDummy() const
{
    return m_Is_mirror_dummy;
}
void EmojiReactionBase_allOf_user::setIsMirrorDummy(bool value)
{
	m_Is_mirror_dummy = value;
}

}
}
}
}

