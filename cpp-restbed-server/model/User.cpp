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



#include "User.h"

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

User::User()
{
}

User::~User()
{
}

std::string User::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void User::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree User::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	return pt;
}

void User::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
}

std::shared_ptr<AnyType> User::getEmail() const
{
    return m_Email;
}
void User::setEmail(std::shared_ptr<AnyType> value)
{
	m_Email = value;
}
std::shared_ptr<AnyType> User::getIsBot() const
{
    return m_Is_bot;
}
void User::setIsBot(std::shared_ptr<AnyType> value)
{
	m_Is_bot = value;
}
std::shared_ptr<AnyType> User::getAvatarUrl() const
{
    return m_Avatar_url;
}
void User::setAvatarUrl(std::shared_ptr<AnyType> value)
{
	m_Avatar_url = value;
}
std::shared_ptr<AnyType> User::getAvatarVersion() const
{
    return m_Avatar_version;
}
void User::setAvatarVersion(std::shared_ptr<AnyType> value)
{
	m_Avatar_version = value;
}
std::shared_ptr<AnyType> User::getFullName() const
{
    return m_Full_name;
}
void User::setFullName(std::shared_ptr<AnyType> value)
{
	m_Full_name = value;
}
std::shared_ptr<AnyType> User::getIsAdmin() const
{
    return m_Is_admin;
}
void User::setIsAdmin(std::shared_ptr<AnyType> value)
{
	m_Is_admin = value;
}
std::shared_ptr<AnyType> User::getIsOwner() const
{
    return m_Is_owner;
}
void User::setIsOwner(std::shared_ptr<AnyType> value)
{
	m_Is_owner = value;
}
std::shared_ptr<AnyType> User::getIsBillingAdmin() const
{
    return m_Is_billing_admin;
}
void User::setIsBillingAdmin(std::shared_ptr<AnyType> value)
{
	m_Is_billing_admin = value;
}
std::shared_ptr<AnyType> User::getRole() const
{
    return m_Role;
}
void User::setRole(std::shared_ptr<AnyType> value)
{
	m_Role = value;
}
std::shared_ptr<AnyType> User::getBotType() const
{
    return m_Bot_type;
}
void User::setBotType(std::shared_ptr<AnyType> value)
{
	m_Bot_type = value;
}
std::shared_ptr<AnyType> User::getUserId() const
{
    return m_User_id;
}
void User::setUserId(std::shared_ptr<AnyType> value)
{
	m_User_id = value;
}
std::shared_ptr<AnyType> User::getBotOwnerId() const
{
    return m_Bot_owner_id;
}
void User::setBotOwnerId(std::shared_ptr<AnyType> value)
{
	m_Bot_owner_id = value;
}
std::shared_ptr<AnyType> User::getIsActive() const
{
    return m_Is_active;
}
void User::setIsActive(std::shared_ptr<AnyType> value)
{
	m_Is_active = value;
}
std::shared_ptr<AnyType> User::getIsGuest() const
{
    return m_Is_guest;
}
void User::setIsGuest(std::shared_ptr<AnyType> value)
{
	m_Is_guest = value;
}
std::shared_ptr<AnyType> User::getTimezone() const
{
    return m_Timezone;
}
void User::setTimezone(std::shared_ptr<AnyType> value)
{
	m_Timezone = value;
}
std::shared_ptr<AnyType> User::getDateJoined() const
{
    return m_Date_joined;
}
void User::setDateJoined(std::shared_ptr<AnyType> value)
{
	m_Date_joined = value;
}
std::shared_ptr<AnyType> User::getDeliveryEmail() const
{
    return m_Delivery_email;
}
void User::setDeliveryEmail(std::shared_ptr<AnyType> value)
{
	m_Delivery_email = value;
}
std::shared_ptr<AnyType> User::getProfileData() const
{
    return m_Profile_data;
}
void User::setProfileData(std::shared_ptr<AnyType> value)
{
	m_Profile_data = value;
}

}
}
}
}
