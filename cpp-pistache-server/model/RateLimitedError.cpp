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


#include "RateLimitedError.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RateLimitedError::RateLimitedError()
{
    m_CodeIsSet = false;
    
}

void RateLimitedError::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RateLimitedError::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RateLimitedError::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RateLimitedError" : pathPrefix;

                
    return success;
}

bool RateLimitedError::operator==(const RateLimitedError& rhs) const
{
    return
    
    
    (getResult() == rhs.getResult())
     &&
    
    (getMsg() == rhs.getMsg())
     &&
    
    
    ((!codeIsSet() && !rhs.codeIsSet()) || (codeIsSet() && rhs.codeIsSet() && getCode() == rhs.getCode()))
    
    ;
}

bool RateLimitedError::operator!=(const RateLimitedError& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RateLimitedError& o)
{
    j = nlohmann::json();
    j["result"] = o.m_Result;
    j["msg"] = o.m_Msg;
    if(o.codeIsSet())
        j["code"] = o.m_Code;
    
}

void from_json(const nlohmann::json& j, RateLimitedError& o)
{
    j.at("result").get_to(o.m_Result);
    j.at("msg").get_to(o.m_Msg);
    if(j.find("code") != j.end())
    {
        j.at("code").get_to(o.m_Code);
        o.m_CodeIsSet = true;
    } 
    
}

AnyType RateLimitedError::getResult() const
{
    return m_Result;
}
void RateLimitedError::setResult(AnyType const& value)
{
    m_Result = value;
}
AnyType RateLimitedError::getMsg() const
{
    return m_Msg;
}
void RateLimitedError::setMsg(AnyType const& value)
{
    m_Msg = value;
}
AnyType RateLimitedError::getCode() const
{
    return m_Code;
}
void RateLimitedError::setCode(AnyType const& value)
{
    m_Code = value;
    m_CodeIsSet = true;
}
bool RateLimitedError::codeIsSet() const
{
    return m_CodeIsSet;
}
void RateLimitedError::unsetCode()
{
    m_CodeIsSet = false;
}


} // namespace org::openapitools::server::model

