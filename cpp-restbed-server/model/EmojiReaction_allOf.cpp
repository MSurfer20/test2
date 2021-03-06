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



#include "EmojiReaction_allOf.h"

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

EmojiReaction_allOf::EmojiReaction_allOf()
{
}

EmojiReaction_allOf::~EmojiReaction_allOf()
{
}

std::string EmojiReaction_allOf::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void EmojiReaction_allOf::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree EmojiReaction_allOf::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	return pt;
}

void EmojiReaction_allOf::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
}

std::shared_ptr<AnyType> EmojiReaction_allOf::getEmojiCode() const
{
    return m_Emoji_code;
}
void EmojiReaction_allOf::setEmojiCode(std::shared_ptr<AnyType> value)
{
	m_Emoji_code = value;
}
std::shared_ptr<AnyType> EmojiReaction_allOf::getEmojiName() const
{
    return m_Emoji_name;
}
void EmojiReaction_allOf::setEmojiName(std::shared_ptr<AnyType> value)
{
	m_Emoji_name = value;
}
std::shared_ptr<AnyType> EmojiReaction_allOf::getReactionType() const
{
    return m_Reaction_type;
}
void EmojiReaction_allOf::setReactionType(std::shared_ptr<AnyType> value)
{
	m_Reaction_type = value;
}
std::shared_ptr<AnyType> EmojiReaction_allOf::getUserId() const
{
    return m_User_id;
}
void EmojiReaction_allOf::setUserId(std::shared_ptr<AnyType> value)
{
	m_User_id = value;
}
std::shared_ptr<AnyType> EmojiReaction_allOf::getUser() const
{
    return m_User;
}
void EmojiReaction_allOf::setUser(std::shared_ptr<AnyType> value)
{
	m_User = value;
}

}
}
}
}

