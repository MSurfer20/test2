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


#include "User.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

User::User()
{
    m_EmailIsSet = false;
    m_Is_botIsSet = false;
    m_Avatar_urlIsSet = false;
    m_Avatar_versionIsSet = false;
    m_Full_nameIsSet = false;
    m_Is_adminIsSet = false;
    m_Is_ownerIsSet = false;
    m_Is_billing_adminIsSet = false;
    m_RoleIsSet = false;
    m_Bot_typeIsSet = false;
    m_User_idIsSet = false;
    m_Bot_owner_idIsSet = false;
    m_Is_activeIsSet = false;
    m_Is_guestIsSet = false;
    m_TimezoneIsSet = false;
    m_Date_joinedIsSet = false;
    m_Delivery_emailIsSet = false;
    m_Profile_dataIsSet = false;
    
}

void User::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool User::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool User::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "User" : pathPrefix;

                                                                            
    return success;
}

bool User::operator==(const User& rhs) const
{
    return
    
    
    
    ((!emailIsSet() && !rhs.emailIsSet()) || (emailIsSet() && rhs.emailIsSet() && getEmail() == rhs.getEmail())) &&
    
    
    ((!isBotIsSet() && !rhs.isBotIsSet()) || (isBotIsSet() && rhs.isBotIsSet() && getIsBot() == rhs.getIsBot())) &&
    
    
    ((!avatarUrlIsSet() && !rhs.avatarUrlIsSet()) || (avatarUrlIsSet() && rhs.avatarUrlIsSet() && getAvatarUrl() == rhs.getAvatarUrl())) &&
    
    
    ((!avatarVersionIsSet() && !rhs.avatarVersionIsSet()) || (avatarVersionIsSet() && rhs.avatarVersionIsSet() && getAvatarVersion() == rhs.getAvatarVersion())) &&
    
    
    ((!fullNameIsSet() && !rhs.fullNameIsSet()) || (fullNameIsSet() && rhs.fullNameIsSet() && getFullName() == rhs.getFullName())) &&
    
    
    ((!isAdminIsSet() && !rhs.isAdminIsSet()) || (isAdminIsSet() && rhs.isAdminIsSet() && getIsAdmin() == rhs.getIsAdmin())) &&
    
    
    ((!isOwnerIsSet() && !rhs.isOwnerIsSet()) || (isOwnerIsSet() && rhs.isOwnerIsSet() && getIsOwner() == rhs.getIsOwner())) &&
    
    
    ((!isBillingAdminIsSet() && !rhs.isBillingAdminIsSet()) || (isBillingAdminIsSet() && rhs.isBillingAdminIsSet() && getIsBillingAdmin() == rhs.getIsBillingAdmin())) &&
    
    
    ((!roleIsSet() && !rhs.roleIsSet()) || (roleIsSet() && rhs.roleIsSet() && getRole() == rhs.getRole())) &&
    
    
    ((!botTypeIsSet() && !rhs.botTypeIsSet()) || (botTypeIsSet() && rhs.botTypeIsSet() && getBotType() == rhs.getBotType())) &&
    
    
    ((!userIdIsSet() && !rhs.userIdIsSet()) || (userIdIsSet() && rhs.userIdIsSet() && getUserId() == rhs.getUserId())) &&
    
    
    ((!botOwnerIdIsSet() && !rhs.botOwnerIdIsSet()) || (botOwnerIdIsSet() && rhs.botOwnerIdIsSet() && getBotOwnerId() == rhs.getBotOwnerId())) &&
    
    
    ((!isActiveIsSet() && !rhs.isActiveIsSet()) || (isActiveIsSet() && rhs.isActiveIsSet() && getIsActive() == rhs.getIsActive())) &&
    
    
    ((!isGuestIsSet() && !rhs.isGuestIsSet()) || (isGuestIsSet() && rhs.isGuestIsSet() && getIsGuest() == rhs.getIsGuest())) &&
    
    
    ((!timezoneIsSet() && !rhs.timezoneIsSet()) || (timezoneIsSet() && rhs.timezoneIsSet() && getTimezone() == rhs.getTimezone())) &&
    
    
    ((!dateJoinedIsSet() && !rhs.dateJoinedIsSet()) || (dateJoinedIsSet() && rhs.dateJoinedIsSet() && getDateJoined() == rhs.getDateJoined())) &&
    
    
    ((!deliveryEmailIsSet() && !rhs.deliveryEmailIsSet()) || (deliveryEmailIsSet() && rhs.deliveryEmailIsSet() && getDeliveryEmail() == rhs.getDeliveryEmail())) &&
    
    
    ((!profileDataIsSet() && !rhs.profileDataIsSet()) || (profileDataIsSet() && rhs.profileDataIsSet() && getProfileData() == rhs.getProfileData()))
    
    ;
}

bool User::operator!=(const User& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const User& o)
{
    j = nlohmann::json();
    if(o.emailIsSet())
        j["email"] = o.m_Email;
    if(o.isBotIsSet())
        j["is_bot"] = o.m_Is_bot;
    if(o.avatarUrlIsSet())
        j["avatar_url"] = o.m_Avatar_url;
    if(o.avatarVersionIsSet())
        j["avatar_version"] = o.m_Avatar_version;
    if(o.fullNameIsSet())
        j["full_name"] = o.m_Full_name;
    if(o.isAdminIsSet())
        j["is_admin"] = o.m_Is_admin;
    if(o.isOwnerIsSet())
        j["is_owner"] = o.m_Is_owner;
    if(o.isBillingAdminIsSet())
        j["is_billing_admin"] = o.m_Is_billing_admin;
    if(o.roleIsSet())
        j["role"] = o.m_Role;
    if(o.botTypeIsSet())
        j["bot_type"] = o.m_Bot_type;
    if(o.userIdIsSet())
        j["user_id"] = o.m_User_id;
    if(o.botOwnerIdIsSet())
        j["bot_owner_id"] = o.m_Bot_owner_id;
    if(o.isActiveIsSet())
        j["is_active"] = o.m_Is_active;
    if(o.isGuestIsSet())
        j["is_guest"] = o.m_Is_guest;
    if(o.timezoneIsSet())
        j["timezone"] = o.m_Timezone;
    if(o.dateJoinedIsSet())
        j["date_joined"] = o.m_Date_joined;
    if(o.deliveryEmailIsSet())
        j["delivery_email"] = o.m_Delivery_email;
    if(o.profileDataIsSet())
        j["profile_data"] = o.m_Profile_data;
    
}

void from_json(const nlohmann::json& j, User& o)
{
    if(j.find("email") != j.end())
    {
        j.at("email").get_to(o.m_Email);
        o.m_EmailIsSet = true;
    } 
    if(j.find("is_bot") != j.end())
    {
        j.at("is_bot").get_to(o.m_Is_bot);
        o.m_Is_botIsSet = true;
    } 
    if(j.find("avatar_url") != j.end())
    {
        j.at("avatar_url").get_to(o.m_Avatar_url);
        o.m_Avatar_urlIsSet = true;
    } 
    if(j.find("avatar_version") != j.end())
    {
        j.at("avatar_version").get_to(o.m_Avatar_version);
        o.m_Avatar_versionIsSet = true;
    } 
    if(j.find("full_name") != j.end())
    {
        j.at("full_name").get_to(o.m_Full_name);
        o.m_Full_nameIsSet = true;
    } 
    if(j.find("is_admin") != j.end())
    {
        j.at("is_admin").get_to(o.m_Is_admin);
        o.m_Is_adminIsSet = true;
    } 
    if(j.find("is_owner") != j.end())
    {
        j.at("is_owner").get_to(o.m_Is_owner);
        o.m_Is_ownerIsSet = true;
    } 
    if(j.find("is_billing_admin") != j.end())
    {
        j.at("is_billing_admin").get_to(o.m_Is_billing_admin);
        o.m_Is_billing_adminIsSet = true;
    } 
    if(j.find("role") != j.end())
    {
        j.at("role").get_to(o.m_Role);
        o.m_RoleIsSet = true;
    } 
    if(j.find("bot_type") != j.end())
    {
        j.at("bot_type").get_to(o.m_Bot_type);
        o.m_Bot_typeIsSet = true;
    } 
    if(j.find("user_id") != j.end())
    {
        j.at("user_id").get_to(o.m_User_id);
        o.m_User_idIsSet = true;
    } 
    if(j.find("bot_owner_id") != j.end())
    {
        j.at("bot_owner_id").get_to(o.m_Bot_owner_id);
        o.m_Bot_owner_idIsSet = true;
    } 
    if(j.find("is_active") != j.end())
    {
        j.at("is_active").get_to(o.m_Is_active);
        o.m_Is_activeIsSet = true;
    } 
    if(j.find("is_guest") != j.end())
    {
        j.at("is_guest").get_to(o.m_Is_guest);
        o.m_Is_guestIsSet = true;
    } 
    if(j.find("timezone") != j.end())
    {
        j.at("timezone").get_to(o.m_Timezone);
        o.m_TimezoneIsSet = true;
    } 
    if(j.find("date_joined") != j.end())
    {
        j.at("date_joined").get_to(o.m_Date_joined);
        o.m_Date_joinedIsSet = true;
    } 
    if(j.find("delivery_email") != j.end())
    {
        j.at("delivery_email").get_to(o.m_Delivery_email);
        o.m_Delivery_emailIsSet = true;
    } 
    if(j.find("profile_data") != j.end())
    {
        j.at("profile_data").get_to(o.m_Profile_data);
        o.m_Profile_dataIsSet = true;
    } 
    
}

AnyType User::getEmail() const
{
    return m_Email;
}
void User::setEmail(AnyType const& value)
{
    m_Email = value;
    m_EmailIsSet = true;
}
bool User::emailIsSet() const
{
    return m_EmailIsSet;
}
void User::unsetEmail()
{
    m_EmailIsSet = false;
}
AnyType User::getIsBot() const
{
    return m_Is_bot;
}
void User::setIsBot(AnyType const& value)
{
    m_Is_bot = value;
    m_Is_botIsSet = true;
}
bool User::isBotIsSet() const
{
    return m_Is_botIsSet;
}
void User::unsetIs_bot()
{
    m_Is_botIsSet = false;
}
AnyType User::getAvatarUrl() const
{
    return m_Avatar_url;
}
void User::setAvatarUrl(AnyType const& value)
{
    m_Avatar_url = value;
    m_Avatar_urlIsSet = true;
}
bool User::avatarUrlIsSet() const
{
    return m_Avatar_urlIsSet;
}
void User::unsetAvatar_url()
{
    m_Avatar_urlIsSet = false;
}
AnyType User::getAvatarVersion() const
{
    return m_Avatar_version;
}
void User::setAvatarVersion(AnyType const& value)
{
    m_Avatar_version = value;
    m_Avatar_versionIsSet = true;
}
bool User::avatarVersionIsSet() const
{
    return m_Avatar_versionIsSet;
}
void User::unsetAvatar_version()
{
    m_Avatar_versionIsSet = false;
}
AnyType User::getFullName() const
{
    return m_Full_name;
}
void User::setFullName(AnyType const& value)
{
    m_Full_name = value;
    m_Full_nameIsSet = true;
}
bool User::fullNameIsSet() const
{
    return m_Full_nameIsSet;
}
void User::unsetFull_name()
{
    m_Full_nameIsSet = false;
}
AnyType User::getIsAdmin() const
{
    return m_Is_admin;
}
void User::setIsAdmin(AnyType const& value)
{
    m_Is_admin = value;
    m_Is_adminIsSet = true;
}
bool User::isAdminIsSet() const
{
    return m_Is_adminIsSet;
}
void User::unsetIs_admin()
{
    m_Is_adminIsSet = false;
}
AnyType User::getIsOwner() const
{
    return m_Is_owner;
}
void User::setIsOwner(AnyType const& value)
{
    m_Is_owner = value;
    m_Is_ownerIsSet = true;
}
bool User::isOwnerIsSet() const
{
    return m_Is_ownerIsSet;
}
void User::unsetIs_owner()
{
    m_Is_ownerIsSet = false;
}
AnyType User::getIsBillingAdmin() const
{
    return m_Is_billing_admin;
}
void User::setIsBillingAdmin(AnyType const& value)
{
    m_Is_billing_admin = value;
    m_Is_billing_adminIsSet = true;
}
bool User::isBillingAdminIsSet() const
{
    return m_Is_billing_adminIsSet;
}
void User::unsetIs_billing_admin()
{
    m_Is_billing_adminIsSet = false;
}
AnyType User::getRole() const
{
    return m_Role;
}
void User::setRole(AnyType const& value)
{
    m_Role = value;
    m_RoleIsSet = true;
}
bool User::roleIsSet() const
{
    return m_RoleIsSet;
}
void User::unsetRole()
{
    m_RoleIsSet = false;
}
AnyType User::getBotType() const
{
    return m_Bot_type;
}
void User::setBotType(AnyType const& value)
{
    m_Bot_type = value;
    m_Bot_typeIsSet = true;
}
bool User::botTypeIsSet() const
{
    return m_Bot_typeIsSet;
}
void User::unsetBot_type()
{
    m_Bot_typeIsSet = false;
}
AnyType User::getUserId() const
{
    return m_User_id;
}
void User::setUserId(AnyType const& value)
{
    m_User_id = value;
    m_User_idIsSet = true;
}
bool User::userIdIsSet() const
{
    return m_User_idIsSet;
}
void User::unsetUser_id()
{
    m_User_idIsSet = false;
}
AnyType User::getBotOwnerId() const
{
    return m_Bot_owner_id;
}
void User::setBotOwnerId(AnyType const& value)
{
    m_Bot_owner_id = value;
    m_Bot_owner_idIsSet = true;
}
bool User::botOwnerIdIsSet() const
{
    return m_Bot_owner_idIsSet;
}
void User::unsetBot_owner_id()
{
    m_Bot_owner_idIsSet = false;
}
AnyType User::getIsActive() const
{
    return m_Is_active;
}
void User::setIsActive(AnyType const& value)
{
    m_Is_active = value;
    m_Is_activeIsSet = true;
}
bool User::isActiveIsSet() const
{
    return m_Is_activeIsSet;
}
void User::unsetIs_active()
{
    m_Is_activeIsSet = false;
}
AnyType User::getIsGuest() const
{
    return m_Is_guest;
}
void User::setIsGuest(AnyType const& value)
{
    m_Is_guest = value;
    m_Is_guestIsSet = true;
}
bool User::isGuestIsSet() const
{
    return m_Is_guestIsSet;
}
void User::unsetIs_guest()
{
    m_Is_guestIsSet = false;
}
AnyType User::getTimezone() const
{
    return m_Timezone;
}
void User::setTimezone(AnyType const& value)
{
    m_Timezone = value;
    m_TimezoneIsSet = true;
}
bool User::timezoneIsSet() const
{
    return m_TimezoneIsSet;
}
void User::unsetTimezone()
{
    m_TimezoneIsSet = false;
}
AnyType User::getDateJoined() const
{
    return m_Date_joined;
}
void User::setDateJoined(AnyType const& value)
{
    m_Date_joined = value;
    m_Date_joinedIsSet = true;
}
bool User::dateJoinedIsSet() const
{
    return m_Date_joinedIsSet;
}
void User::unsetDate_joined()
{
    m_Date_joinedIsSet = false;
}
AnyType User::getDeliveryEmail() const
{
    return m_Delivery_email;
}
void User::setDeliveryEmail(AnyType const& value)
{
    m_Delivery_email = value;
    m_Delivery_emailIsSet = true;
}
bool User::deliveryEmailIsSet() const
{
    return m_Delivery_emailIsSet;
}
void User::unsetDelivery_email()
{
    m_Delivery_emailIsSet = false;
}
AnyType User::getProfileData() const
{
    return m_Profile_data;
}
void User::setProfileData(AnyType const& value)
{
    m_Profile_data = value;
    m_Profile_dataIsSet = true;
}
bool User::profileDataIsSet() const
{
    return m_Profile_dataIsSet;
}
void User::unsetProfile_data()
{
    m_Profile_dataIsSet = false;
}


} // namespace org::openapitools::server::model
