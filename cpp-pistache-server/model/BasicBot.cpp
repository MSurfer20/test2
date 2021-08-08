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


#include "BasicBot.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

BasicBot::BasicBot()
{
    m_User_idIsSet = false;
    m_Full_nameIsSet = false;
    m_Api_keyIsSet = false;
    m_Default_sending_streamIsSet = false;
    m_Default_events_register_streamIsSet = false;
    m_Default_all_public_streamsIsSet = false;
    m_Avatar_urlIsSet = false;
    m_Owner_idIsSet = false;
    m_ServicesIsSet = false;
    
}

void BasicBot::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool BasicBot::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool BasicBot::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "BasicBot" : pathPrefix;

                                        
    return success;
}

bool BasicBot::operator==(const BasicBot& rhs) const
{
    return
    
    
    
    ((!userIdIsSet() && !rhs.userIdIsSet()) || (userIdIsSet() && rhs.userIdIsSet() && getUserId() == rhs.getUserId())) &&
    
    
    ((!fullNameIsSet() && !rhs.fullNameIsSet()) || (fullNameIsSet() && rhs.fullNameIsSet() && getFullName() == rhs.getFullName())) &&
    
    
    ((!apiKeyIsSet() && !rhs.apiKeyIsSet()) || (apiKeyIsSet() && rhs.apiKeyIsSet() && getApiKey() == rhs.getApiKey())) &&
    
    
    ((!defaultSendingStreamIsSet() && !rhs.defaultSendingStreamIsSet()) || (defaultSendingStreamIsSet() && rhs.defaultSendingStreamIsSet() && getDefaultSendingStream() == rhs.getDefaultSendingStream())) &&
    
    
    ((!defaultEventsRegisterStreamIsSet() && !rhs.defaultEventsRegisterStreamIsSet()) || (defaultEventsRegisterStreamIsSet() && rhs.defaultEventsRegisterStreamIsSet() && getDefaultEventsRegisterStream() == rhs.getDefaultEventsRegisterStream())) &&
    
    
    ((!defaultAllPublicStreamsIsSet() && !rhs.defaultAllPublicStreamsIsSet()) || (defaultAllPublicStreamsIsSet() && rhs.defaultAllPublicStreamsIsSet() && getDefaultAllPublicStreams() == rhs.getDefaultAllPublicStreams())) &&
    
    
    ((!avatarUrlIsSet() && !rhs.avatarUrlIsSet()) || (avatarUrlIsSet() && rhs.avatarUrlIsSet() && getAvatarUrl() == rhs.getAvatarUrl())) &&
    
    
    ((!ownerIdIsSet() && !rhs.ownerIdIsSet()) || (ownerIdIsSet() && rhs.ownerIdIsSet() && getOwnerId() == rhs.getOwnerId())) &&
    
    
    ((!servicesIsSet() && !rhs.servicesIsSet()) || (servicesIsSet() && rhs.servicesIsSet() && getServices() == rhs.getServices()))
    
    ;
}

bool BasicBot::operator!=(const BasicBot& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const BasicBot& o)
{
    j = nlohmann::json();
    if(o.userIdIsSet())
        j["user_id"] = o.m_User_id;
    if(o.fullNameIsSet())
        j["full_name"] = o.m_Full_name;
    if(o.apiKeyIsSet())
        j["api_key"] = o.m_Api_key;
    if(o.defaultSendingStreamIsSet())
        j["default_sending_stream"] = o.m_Default_sending_stream;
    if(o.defaultEventsRegisterStreamIsSet())
        j["default_events_register_stream"] = o.m_Default_events_register_stream;
    if(o.defaultAllPublicStreamsIsSet())
        j["default_all_public_streams"] = o.m_Default_all_public_streams;
    if(o.avatarUrlIsSet())
        j["avatar_url"] = o.m_Avatar_url;
    if(o.ownerIdIsSet())
        j["owner_id"] = o.m_Owner_id;
    if(o.servicesIsSet())
        j["services"] = o.m_Services;
    
}

void from_json(const nlohmann::json& j, BasicBot& o)
{
    if(j.find("user_id") != j.end())
    {
        j.at("user_id").get_to(o.m_User_id);
        o.m_User_idIsSet = true;
    } 
    if(j.find("full_name") != j.end())
    {
        j.at("full_name").get_to(o.m_Full_name);
        o.m_Full_nameIsSet = true;
    } 
    if(j.find("api_key") != j.end())
    {
        j.at("api_key").get_to(o.m_Api_key);
        o.m_Api_keyIsSet = true;
    } 
    if(j.find("default_sending_stream") != j.end())
    {
        j.at("default_sending_stream").get_to(o.m_Default_sending_stream);
        o.m_Default_sending_streamIsSet = true;
    } 
    if(j.find("default_events_register_stream") != j.end())
    {
        j.at("default_events_register_stream").get_to(o.m_Default_events_register_stream);
        o.m_Default_events_register_streamIsSet = true;
    } 
    if(j.find("default_all_public_streams") != j.end())
    {
        j.at("default_all_public_streams").get_to(o.m_Default_all_public_streams);
        o.m_Default_all_public_streamsIsSet = true;
    } 
    if(j.find("avatar_url") != j.end())
    {
        j.at("avatar_url").get_to(o.m_Avatar_url);
        o.m_Avatar_urlIsSet = true;
    } 
    if(j.find("owner_id") != j.end())
    {
        j.at("owner_id").get_to(o.m_Owner_id);
        o.m_Owner_idIsSet = true;
    } 
    if(j.find("services") != j.end())
    {
        j.at("services").get_to(o.m_Services);
        o.m_ServicesIsSet = true;
    } 
    
}

AnyType BasicBot::getUserId() const
{
    return m_User_id;
}
void BasicBot::setUserId(AnyType const& value)
{
    m_User_id = value;
    m_User_idIsSet = true;
}
bool BasicBot::userIdIsSet() const
{
    return m_User_idIsSet;
}
void BasicBot::unsetUser_id()
{
    m_User_idIsSet = false;
}
AnyType BasicBot::getFullName() const
{
    return m_Full_name;
}
void BasicBot::setFullName(AnyType const& value)
{
    m_Full_name = value;
    m_Full_nameIsSet = true;
}
bool BasicBot::fullNameIsSet() const
{
    return m_Full_nameIsSet;
}
void BasicBot::unsetFull_name()
{
    m_Full_nameIsSet = false;
}
AnyType BasicBot::getApiKey() const
{
    return m_Api_key;
}
void BasicBot::setApiKey(AnyType const& value)
{
    m_Api_key = value;
    m_Api_keyIsSet = true;
}
bool BasicBot::apiKeyIsSet() const
{
    return m_Api_keyIsSet;
}
void BasicBot::unsetApi_key()
{
    m_Api_keyIsSet = false;
}
AnyType BasicBot::getDefaultSendingStream() const
{
    return m_Default_sending_stream;
}
void BasicBot::setDefaultSendingStream(AnyType const& value)
{
    m_Default_sending_stream = value;
    m_Default_sending_streamIsSet = true;
}
bool BasicBot::defaultSendingStreamIsSet() const
{
    return m_Default_sending_streamIsSet;
}
void BasicBot::unsetDefault_sending_stream()
{
    m_Default_sending_streamIsSet = false;
}
AnyType BasicBot::getDefaultEventsRegisterStream() const
{
    return m_Default_events_register_stream;
}
void BasicBot::setDefaultEventsRegisterStream(AnyType const& value)
{
    m_Default_events_register_stream = value;
    m_Default_events_register_streamIsSet = true;
}
bool BasicBot::defaultEventsRegisterStreamIsSet() const
{
    return m_Default_events_register_streamIsSet;
}
void BasicBot::unsetDefault_events_register_stream()
{
    m_Default_events_register_streamIsSet = false;
}
AnyType BasicBot::getDefaultAllPublicStreams() const
{
    return m_Default_all_public_streams;
}
void BasicBot::setDefaultAllPublicStreams(AnyType const& value)
{
    m_Default_all_public_streams = value;
    m_Default_all_public_streamsIsSet = true;
}
bool BasicBot::defaultAllPublicStreamsIsSet() const
{
    return m_Default_all_public_streamsIsSet;
}
void BasicBot::unsetDefault_all_public_streams()
{
    m_Default_all_public_streamsIsSet = false;
}
AnyType BasicBot::getAvatarUrl() const
{
    return m_Avatar_url;
}
void BasicBot::setAvatarUrl(AnyType const& value)
{
    m_Avatar_url = value;
    m_Avatar_urlIsSet = true;
}
bool BasicBot::avatarUrlIsSet() const
{
    return m_Avatar_urlIsSet;
}
void BasicBot::unsetAvatar_url()
{
    m_Avatar_urlIsSet = false;
}
AnyType BasicBot::getOwnerId() const
{
    return m_Owner_id;
}
void BasicBot::setOwnerId(AnyType const& value)
{
    m_Owner_id = value;
    m_Owner_idIsSet = true;
}
bool BasicBot::ownerIdIsSet() const
{
    return m_Owner_idIsSet;
}
void BasicBot::unsetOwner_id()
{
    m_Owner_idIsSet = false;
}
AnyType BasicBot::getServices() const
{
    return m_Services;
}
void BasicBot::setServices(AnyType const& value)
{
    m_Services = value;
    m_ServicesIsSet = true;
}
bool BasicBot::servicesIsSet() const
{
    return m_ServicesIsSet;
}
void BasicBot::unsetServices()
{
    m_ServicesIsSet = false;
}


} // namespace org::openapitools::server::model

