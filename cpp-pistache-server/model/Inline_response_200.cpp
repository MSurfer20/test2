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


#include "Inline_response_200.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

Inline_response_200::Inline_response_200()
{
    m_Bot_email = "";
    m_Bot_emailIsSet = false;
    m_Bot_full_name = "";
    m_Bot_full_nameIsSet = false;
    m_Data = "";
    m_DataIsSet = false;
    m_Trigger = "";
    m_TriggerIsSet = false;
    m_Token = "";
    m_TokenIsSet = false;
    m_MessageIsSet = false;
    
}

void Inline_response_200::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool Inline_response_200::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool Inline_response_200::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "Inline_response_200" : pathPrefix;

                            
    return success;
}

bool Inline_response_200::operator==(const Inline_response_200& rhs) const
{
    return
    
    
    
    ((!botEmailIsSet() && !rhs.botEmailIsSet()) || (botEmailIsSet() && rhs.botEmailIsSet() && getBotEmail() == rhs.getBotEmail())) &&
    
    
    ((!botFullNameIsSet() && !rhs.botFullNameIsSet()) || (botFullNameIsSet() && rhs.botFullNameIsSet() && getBotFullName() == rhs.getBotFullName())) &&
    
    
    ((!dataIsSet() && !rhs.dataIsSet()) || (dataIsSet() && rhs.dataIsSet() && getData() == rhs.getData())) &&
    
    
    ((!triggerIsSet() && !rhs.triggerIsSet()) || (triggerIsSet() && rhs.triggerIsSet() && getTrigger() == rhs.getTrigger())) &&
    
    
    ((!tokenIsSet() && !rhs.tokenIsSet()) || (tokenIsSet() && rhs.tokenIsSet() && getToken() == rhs.getToken())) &&
    
    
    ((!messageIsSet() && !rhs.messageIsSet()) || (messageIsSet() && rhs.messageIsSet() && getMessage() == rhs.getMessage()))
    
    ;
}

bool Inline_response_200::operator!=(const Inline_response_200& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const Inline_response_200& o)
{
    j = nlohmann::json();
    if(o.botEmailIsSet())
        j["bot_email"] = o.m_Bot_email;
    if(o.botFullNameIsSet())
        j["bot_full_name"] = o.m_Bot_full_name;
    if(o.dataIsSet())
        j["data"] = o.m_Data;
    if(o.triggerIsSet())
        j["trigger"] = o.m_Trigger;
    if(o.tokenIsSet())
        j["token"] = o.m_Token;
    if(o.messageIsSet())
        j["message"] = o.m_Message;
    
}

void from_json(const nlohmann::json& j, Inline_response_200& o)
{
    if(j.find("bot_email") != j.end())
    {
        j.at("bot_email").get_to(o.m_Bot_email);
        o.m_Bot_emailIsSet = true;
    } 
    if(j.find("bot_full_name") != j.end())
    {
        j.at("bot_full_name").get_to(o.m_Bot_full_name);
        o.m_Bot_full_nameIsSet = true;
    } 
    if(j.find("data") != j.end())
    {
        j.at("data").get_to(o.m_Data);
        o.m_DataIsSet = true;
    } 
    if(j.find("trigger") != j.end())
    {
        j.at("trigger").get_to(o.m_Trigger);
        o.m_TriggerIsSet = true;
    } 
    if(j.find("token") != j.end())
    {
        j.at("token").get_to(o.m_Token);
        o.m_TokenIsSet = true;
    } 
    if(j.find("message") != j.end())
    {
        j.at("message").get_to(o.m_Message);
        o.m_MessageIsSet = true;
    } 
    
}

std::string Inline_response_200::getBotEmail() const
{
    return m_Bot_email;
}
void Inline_response_200::setBotEmail(std::string const& value)
{
    m_Bot_email = value;
    m_Bot_emailIsSet = true;
}
bool Inline_response_200::botEmailIsSet() const
{
    return m_Bot_emailIsSet;
}
void Inline_response_200::unsetBot_email()
{
    m_Bot_emailIsSet = false;
}
std::string Inline_response_200::getBotFullName() const
{
    return m_Bot_full_name;
}
void Inline_response_200::setBotFullName(std::string const& value)
{
    m_Bot_full_name = value;
    m_Bot_full_nameIsSet = true;
}
bool Inline_response_200::botFullNameIsSet() const
{
    return m_Bot_full_nameIsSet;
}
void Inline_response_200::unsetBot_full_name()
{
    m_Bot_full_nameIsSet = false;
}
std::string Inline_response_200::getData() const
{
    return m_Data;
}
void Inline_response_200::setData(std::string const& value)
{
    m_Data = value;
    m_DataIsSet = true;
}
bool Inline_response_200::dataIsSet() const
{
    return m_DataIsSet;
}
void Inline_response_200::unsetData()
{
    m_DataIsSet = false;
}
std::string Inline_response_200::getTrigger() const
{
    return m_Trigger;
}
void Inline_response_200::setTrigger(std::string const& value)
{
    m_Trigger = value;
    m_TriggerIsSet = true;
}
bool Inline_response_200::triggerIsSet() const
{
    return m_TriggerIsSet;
}
void Inline_response_200::unsetTrigger()
{
    m_TriggerIsSet = false;
}
std::string Inline_response_200::getToken() const
{
    return m_Token;
}
void Inline_response_200::setToken(std::string const& value)
{
    m_Token = value;
    m_TokenIsSet = true;
}
bool Inline_response_200::tokenIsSet() const
{
    return m_TokenIsSet;
}
void Inline_response_200::unsetToken()
{
    m_TokenIsSet = false;
}
MessagesBase Inline_response_200::getMessage() const
{
    return m_Message;
}
void Inline_response_200::setMessage(MessagesBase const& value)
{
    m_Message = value;
    m_MessageIsSet = true;
}
bool Inline_response_200::messageIsSet() const
{
    return m_MessageIsSet;
}
void Inline_response_200::unsetMessage()
{
    m_MessageIsSet = false;
}


} // namespace org::openapitools::server::model

