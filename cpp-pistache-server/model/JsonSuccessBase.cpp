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


#include "JsonSuccessBase.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

JsonSuccessBase::JsonSuccessBase()
{
    m_Result = "";
    m_Msg = "";
    
}

void JsonSuccessBase::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool JsonSuccessBase::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool JsonSuccessBase::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "JsonSuccessBase" : pathPrefix;

            
    return success;
}

bool JsonSuccessBase::operator==(const JsonSuccessBase& rhs) const
{
    return
    
    
    (getResult() == rhs.getResult())
     &&
    
    (getMsg() == rhs.getMsg())
    
    
    ;
}

bool JsonSuccessBase::operator!=(const JsonSuccessBase& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const JsonSuccessBase& o)
{
    j = nlohmann::json();
    j["result"] = o.m_Result;
    j["msg"] = o.m_Msg;
    
}

void from_json(const nlohmann::json& j, JsonSuccessBase& o)
{
    j.at("result").get_to(o.m_Result);
    j.at("msg").get_to(o.m_Msg);
    
}

std::string JsonSuccessBase::getResult() const
{
    return m_Result;
}
void JsonSuccessBase::setResult(std::string const& value)
{
    m_Result = value;
}
std::string JsonSuccessBase::getMsg() const
{
    return m_Msg;
}
void JsonSuccessBase::setMsg(std::string const& value)
{
    m_Msg = value;
}


} // namespace org::openapitools::server::model

