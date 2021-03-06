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


#include "JsonErrorBase.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

JsonErrorBase::JsonErrorBase()
{
    m_Result = "";
    m_Msg = "";
    
}

void JsonErrorBase::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool JsonErrorBase::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool JsonErrorBase::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "JsonErrorBase" : pathPrefix;

            
    return success;
}

bool JsonErrorBase::operator==(const JsonErrorBase& rhs) const
{
    return
    
    
    (getResult() == rhs.getResult())
     &&
    
    (getMsg() == rhs.getMsg())
    
    
    ;
}

bool JsonErrorBase::operator!=(const JsonErrorBase& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const JsonErrorBase& o)
{
    j = nlohmann::json();
    j["result"] = o.m_Result;
    j["msg"] = o.m_Msg;
    
}

void from_json(const nlohmann::json& j, JsonErrorBase& o)
{
    j.at("result").get_to(o.m_Result);
    j.at("msg").get_to(o.m_Msg);
    
}

std::string JsonErrorBase::getResult() const
{
    return m_Result;
}
void JsonErrorBase::setResult(std::string const& value)
{
    m_Result = value;
}
std::string JsonErrorBase::getMsg() const
{
    return m_Msg;
}
void JsonErrorBase::setMsg(std::string const& value)
{
    m_Msg = value;
}


} // namespace org::openapitools::server::model

