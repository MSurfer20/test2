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


#include "ApiKeyResponse_allOf.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ApiKeyResponse_allOf::ApiKeyResponse_allOf()
{
    m_ResultIsSet = false;
    m_MsgIsSet = false;
    m_Api_key = "";
    m_Email = "";
    
}

void ApiKeyResponse_allOf::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ApiKeyResponse_allOf::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ApiKeyResponse_allOf::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ApiKeyResponse_allOf" : pathPrefix;

                    
    return success;
}

bool ApiKeyResponse_allOf::operator==(const ApiKeyResponse_allOf& rhs) const
{
    return
    
    
    
    ((!resultIsSet() && !rhs.resultIsSet()) || (resultIsSet() && rhs.resultIsSet() && getResult() == rhs.getResult())) &&
    
    
    ((!msgIsSet() && !rhs.msgIsSet()) || (msgIsSet() && rhs.msgIsSet() && getMsg() == rhs.getMsg())) &&
    
    (getApiKey() == rhs.getApiKey())
     &&
    
    (getEmail() == rhs.getEmail())
    
    
    ;
}

bool ApiKeyResponse_allOf::operator!=(const ApiKeyResponse_allOf& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ApiKeyResponse_allOf& o)
{
    j = nlohmann::json();
    if(o.resultIsSet())
        j["result"] = o.m_Result;
    if(o.msgIsSet())
        j["msg"] = o.m_Msg;
    j["api_key"] = o.m_Api_key;
    j["email"] = o.m_Email;
    
}

void from_json(const nlohmann::json& j, ApiKeyResponse_allOf& o)
{
    if(j.find("result") != j.end())
    {
        j.at("result").get_to(o.m_Result);
        o.m_ResultIsSet = true;
    } 
    if(j.find("msg") != j.end())
    {
        j.at("msg").get_to(o.m_Msg);
        o.m_MsgIsSet = true;
    } 
    j.at("api_key").get_to(o.m_Api_key);
    j.at("email").get_to(o.m_Email);
    
}

AnyType ApiKeyResponse_allOf::getResult() const
{
    return m_Result;
}
void ApiKeyResponse_allOf::setResult(AnyType const& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}
bool ApiKeyResponse_allOf::resultIsSet() const
{
    return m_ResultIsSet;
}
void ApiKeyResponse_allOf::unsetResult()
{
    m_ResultIsSet = false;
}
AnyType ApiKeyResponse_allOf::getMsg() const
{
    return m_Msg;
}
void ApiKeyResponse_allOf::setMsg(AnyType const& value)
{
    m_Msg = value;
    m_MsgIsSet = true;
}
bool ApiKeyResponse_allOf::msgIsSet() const
{
    return m_MsgIsSet;
}
void ApiKeyResponse_allOf::unsetMsg()
{
    m_MsgIsSet = false;
}
std::string ApiKeyResponse_allOf::getApiKey() const
{
    return m_Api_key;
}
void ApiKeyResponse_allOf::setApiKey(std::string const& value)
{
    m_Api_key = value;
}
std::string ApiKeyResponse_allOf::getEmail() const
{
    return m_Email;
}
void ApiKeyResponse_allOf::setEmail(std::string const& value)
{
    m_Email = value;
}


} // namespace org::openapitools::server::model

