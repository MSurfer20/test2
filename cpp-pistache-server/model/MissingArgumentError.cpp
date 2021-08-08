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


#include "MissingArgumentError.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

MissingArgumentError::MissingArgumentError()
{
    m_CodeIsSet = false;
    m_Var_name = "";
    m_Var_nameIsSet = false;
    
}

void MissingArgumentError::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool MissingArgumentError::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool MissingArgumentError::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "MissingArgumentError" : pathPrefix;

                    
    return success;
}

bool MissingArgumentError::operator==(const MissingArgumentError& rhs) const
{
    return
    
    
    (getResult() == rhs.getResult())
     &&
    
    (getMsg() == rhs.getMsg())
     &&
    
    
    ((!codeIsSet() && !rhs.codeIsSet()) || (codeIsSet() && rhs.codeIsSet() && getCode() == rhs.getCode())) &&
    
    
    ((!varNameIsSet() && !rhs.varNameIsSet()) || (varNameIsSet() && rhs.varNameIsSet() && getVarName() == rhs.getVarName()))
    
    ;
}

bool MissingArgumentError::operator!=(const MissingArgumentError& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const MissingArgumentError& o)
{
    j = nlohmann::json();
    j["result"] = o.m_Result;
    j["msg"] = o.m_Msg;
    if(o.codeIsSet())
        j["code"] = o.m_Code;
    if(o.varNameIsSet())
        j["var_name"] = o.m_Var_name;
    
}

void from_json(const nlohmann::json& j, MissingArgumentError& o)
{
    j.at("result").get_to(o.m_Result);
    j.at("msg").get_to(o.m_Msg);
    if(j.find("code") != j.end())
    {
        j.at("code").get_to(o.m_Code);
        o.m_CodeIsSet = true;
    } 
    if(j.find("var_name") != j.end())
    {
        j.at("var_name").get_to(o.m_Var_name);
        o.m_Var_nameIsSet = true;
    } 
    
}

AnyType MissingArgumentError::getResult() const
{
    return m_Result;
}
void MissingArgumentError::setResult(AnyType const& value)
{
    m_Result = value;
}
AnyType MissingArgumentError::getMsg() const
{
    return m_Msg;
}
void MissingArgumentError::setMsg(AnyType const& value)
{
    m_Msg = value;
}
AnyType MissingArgumentError::getCode() const
{
    return m_Code;
}
void MissingArgumentError::setCode(AnyType const& value)
{
    m_Code = value;
    m_CodeIsSet = true;
}
bool MissingArgumentError::codeIsSet() const
{
    return m_CodeIsSet;
}
void MissingArgumentError::unsetCode()
{
    m_CodeIsSet = false;
}
std::string MissingArgumentError::getVarName() const
{
    return m_Var_name;
}
void MissingArgumentError::setVarName(std::string const& value)
{
    m_Var_name = value;
    m_Var_nameIsSet = true;
}
bool MissingArgumentError::varNameIsSet() const
{
    return m_Var_nameIsSet;
}
void MissingArgumentError::unsetVar_name()
{
    m_Var_nameIsSet = false;
}


} // namespace org::openapitools::server::model
