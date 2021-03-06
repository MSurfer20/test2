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


#include "ApiKeyResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ApiKeyResponse::ApiKeyResponse()
{
    m_Api_key = "";
    m_Email = "";
    
}

void ApiKeyResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ApiKeyResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ApiKeyResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ApiKeyResponse" : pathPrefix;

                    
    return success;
}

bool ApiKeyResponse::operator==(const ApiKeyResponse& rhs) const
{
    return
    
    
    (getResult() == rhs.getResult())
     &&
    
    (getMsg() == rhs.getMsg())
     &&
    
    (getApiKey() == rhs.getApiKey())
     &&
    
    (getEmail() == rhs.getEmail())
    
    
    ;
}

bool ApiKeyResponse::operator!=(const ApiKeyResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ApiKeyResponse& o)
{
    j = nlohmann::json();
    j["result"] = o.m_Result;
    j["msg"] = o.m_Msg;
    j["api_key"] = o.m_Api_key;
    j["email"] = o.m_Email;
    
}

void from_json(const nlohmann::json& j, ApiKeyResponse& o)
{
    j.at("result").get_to(o.m_Result);
    j.at("msg").get_to(o.m_Msg);
    j.at("api_key").get_to(o.m_Api_key);
    j.at("email").get_to(o.m_Email);
    
}

AnyType ApiKeyResponse::getResult() const
{
    return m_Result;
}
void ApiKeyResponse::setResult(AnyType const& value)
{
    m_Result = value;
}
AnyType ApiKeyResponse::getMsg() const
{
    return m_Msg;
}
void ApiKeyResponse::setMsg(AnyType const& value)
{
    m_Msg = value;
}
std::string ApiKeyResponse::getApiKey() const
{
    return m_Api_key;
}
void ApiKeyResponse::setApiKey(std::string const& value)
{
    m_Api_key = value;
}
std::string ApiKeyResponse::getEmail() const
{
    return m_Email;
}
void ApiKeyResponse::setEmail(std::string const& value)
{
    m_Email = value;
}


} // namespace org::openapitools::server::model

