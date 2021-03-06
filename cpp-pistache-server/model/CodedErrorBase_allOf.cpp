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


#include "CodedErrorBase_allOf.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CodedErrorBase_allOf::CodedErrorBase_allOf()
{
    m_ResultIsSet = false;
    m_MsgIsSet = false;
    m_Code = "";
    m_CodeIsSet = false;
    
}

void CodedErrorBase_allOf::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CodedErrorBase_allOf::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CodedErrorBase_allOf::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CodedErrorBase_allOf" : pathPrefix;

                
    return success;
}

bool CodedErrorBase_allOf::operator==(const CodedErrorBase_allOf& rhs) const
{
    return
    
    
    
    ((!resultIsSet() && !rhs.resultIsSet()) || (resultIsSet() && rhs.resultIsSet() && getResult() == rhs.getResult())) &&
    
    
    ((!msgIsSet() && !rhs.msgIsSet()) || (msgIsSet() && rhs.msgIsSet() && getMsg() == rhs.getMsg())) &&
    
    
    ((!codeIsSet() && !rhs.codeIsSet()) || (codeIsSet() && rhs.codeIsSet() && getCode() == rhs.getCode()))
    
    ;
}

bool CodedErrorBase_allOf::operator!=(const CodedErrorBase_allOf& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CodedErrorBase_allOf& o)
{
    j = nlohmann::json();
    if(o.resultIsSet())
        j["result"] = o.m_Result;
    if(o.msgIsSet())
        j["msg"] = o.m_Msg;
    if(o.codeIsSet())
        j["code"] = o.m_Code;
    
}

void from_json(const nlohmann::json& j, CodedErrorBase_allOf& o)
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
    
}

AnyType CodedErrorBase_allOf::getResult() const
{
    return m_Result;
}
void CodedErrorBase_allOf::setResult(AnyType const& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}
bool CodedErrorBase_allOf::resultIsSet() const
{
    return m_ResultIsSet;
}
void CodedErrorBase_allOf::unsetResult()
{
    m_ResultIsSet = false;
}
AnyType CodedErrorBase_allOf::getMsg() const
{
    return m_Msg;
}
void CodedErrorBase_allOf::setMsg(AnyType const& value)
{
    m_Msg = value;
    m_MsgIsSet = true;
}
bool CodedErrorBase_allOf::msgIsSet() const
{
    return m_MsgIsSet;
}
void CodedErrorBase_allOf::unsetMsg()
{
    m_MsgIsSet = false;
}
std::string CodedErrorBase_allOf::getCode() const
{
    return m_Code;
}
void CodedErrorBase_allOf::setCode(std::string const& value)
{
    m_Code = value;
    m_CodeIsSet = true;
}
bool CodedErrorBase_allOf::codeIsSet() const
{
    return m_CodeIsSet;
}
void CodedErrorBase_allOf::unsetCode()
{
    m_CodeIsSet = false;
}


} // namespace org::openapitools::server::model

