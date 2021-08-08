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


#include "MissingArgumentError_allOf.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

MissingArgumentError_allOf::MissingArgumentError_allOf()
{
    m_ResultIsSet = false;
    m_MsgIsSet = false;
    m_CodeIsSet = false;
    m_Var_name = "";
    m_Var_nameIsSet = false;
    
}

void MissingArgumentError_allOf::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool MissingArgumentError_allOf::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool MissingArgumentError_allOf::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "MissingArgumentError_allOf" : pathPrefix;

                    
    return success;
}

bool MissingArgumentError_allOf::operator==(const MissingArgumentError_allOf& rhs) const
{
    return
    
    
    
    ((!resultIsSet() && !rhs.resultIsSet()) || (resultIsSet() && rhs.resultIsSet() && getResult() == rhs.getResult())) &&
    
    
    ((!msgIsSet() && !rhs.msgIsSet()) || (msgIsSet() && rhs.msgIsSet() && getMsg() == rhs.getMsg())) &&
    
    
    ((!codeIsSet() && !rhs.codeIsSet()) || (codeIsSet() && rhs.codeIsSet() && getCode() == rhs.getCode())) &&
    
    
    ((!varNameIsSet() && !rhs.varNameIsSet()) || (varNameIsSet() && rhs.varNameIsSet() && getVarName() == rhs.getVarName()))
    
    ;
}

bool MissingArgumentError_allOf::operator!=(const MissingArgumentError_allOf& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const MissingArgumentError_allOf& o)
{
    j = nlohmann::json();
    if(o.resultIsSet())
        j["result"] = o.m_Result;
    if(o.msgIsSet())
        j["msg"] = o.m_Msg;
    if(o.codeIsSet())
        j["code"] = o.m_Code;
    if(o.varNameIsSet())
        j["var_name"] = o.m_Var_name;
    
}

void from_json(const nlohmann::json& j, MissingArgumentError_allOf& o)
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

AnyType MissingArgumentError_allOf::getResult() const
{
    return m_Result;
}
void MissingArgumentError_allOf::setResult(AnyType const& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}
bool MissingArgumentError_allOf::resultIsSet() const
{
    return m_ResultIsSet;
}
void MissingArgumentError_allOf::unsetResult()
{
    m_ResultIsSet = false;
}
AnyType MissingArgumentError_allOf::getMsg() const
{
    return m_Msg;
}
void MissingArgumentError_allOf::setMsg(AnyType const& value)
{
    m_Msg = value;
    m_MsgIsSet = true;
}
bool MissingArgumentError_allOf::msgIsSet() const
{
    return m_MsgIsSet;
}
void MissingArgumentError_allOf::unsetMsg()
{
    m_MsgIsSet = false;
}
AnyType MissingArgumentError_allOf::getCode() const
{
    return m_Code;
}
void MissingArgumentError_allOf::setCode(AnyType const& value)
{
    m_Code = value;
    m_CodeIsSet = true;
}
bool MissingArgumentError_allOf::codeIsSet() const
{
    return m_CodeIsSet;
}
void MissingArgumentError_allOf::unsetCode()
{
    m_CodeIsSet = false;
}
std::string MissingArgumentError_allOf::getVarName() const
{
    return m_Var_name;
}
void MissingArgumentError_allOf::setVarName(std::string const& value)
{
    m_Var_name = value;
    m_Var_nameIsSet = true;
}
bool MissingArgumentError_allOf::varNameIsSet() const
{
    return m_Var_nameIsSet;
}
void MissingArgumentError_allOf::unsetVar_name()
{
    m_Var_nameIsSet = false;
}


} // namespace org::openapitools::server::model
