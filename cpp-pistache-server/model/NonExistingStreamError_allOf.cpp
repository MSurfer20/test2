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


#include "NonExistingStreamError_allOf.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

NonExistingStreamError_allOf::NonExistingStreamError_allOf()
{
    m_ResultIsSet = false;
    m_MsgIsSet = false;
    m_CodeIsSet = false;
    m_Stream = "";
    m_StreamIsSet = false;
    
}

void NonExistingStreamError_allOf::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool NonExistingStreamError_allOf::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool NonExistingStreamError_allOf::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "NonExistingStreamError_allOf" : pathPrefix;

                    
    return success;
}

bool NonExistingStreamError_allOf::operator==(const NonExistingStreamError_allOf& rhs) const
{
    return
    
    
    
    ((!resultIsSet() && !rhs.resultIsSet()) || (resultIsSet() && rhs.resultIsSet() && getResult() == rhs.getResult())) &&
    
    
    ((!msgIsSet() && !rhs.msgIsSet()) || (msgIsSet() && rhs.msgIsSet() && getMsg() == rhs.getMsg())) &&
    
    
    ((!codeIsSet() && !rhs.codeIsSet()) || (codeIsSet() && rhs.codeIsSet() && getCode() == rhs.getCode())) &&
    
    
    ((!streamIsSet() && !rhs.streamIsSet()) || (streamIsSet() && rhs.streamIsSet() && getStream() == rhs.getStream()))
    
    ;
}

bool NonExistingStreamError_allOf::operator!=(const NonExistingStreamError_allOf& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const NonExistingStreamError_allOf& o)
{
    j = nlohmann::json();
    if(o.resultIsSet())
        j["result"] = o.m_Result;
    if(o.msgIsSet())
        j["msg"] = o.m_Msg;
    if(o.codeIsSet())
        j["code"] = o.m_Code;
    if(o.streamIsSet())
        j["stream"] = o.m_Stream;
    
}

void from_json(const nlohmann::json& j, NonExistingStreamError_allOf& o)
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
    if(j.find("stream") != j.end())
    {
        j.at("stream").get_to(o.m_Stream);
        o.m_StreamIsSet = true;
    } 
    
}

AnyType NonExistingStreamError_allOf::getResult() const
{
    return m_Result;
}
void NonExistingStreamError_allOf::setResult(AnyType const& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}
bool NonExistingStreamError_allOf::resultIsSet() const
{
    return m_ResultIsSet;
}
void NonExistingStreamError_allOf::unsetResult()
{
    m_ResultIsSet = false;
}
AnyType NonExistingStreamError_allOf::getMsg() const
{
    return m_Msg;
}
void NonExistingStreamError_allOf::setMsg(AnyType const& value)
{
    m_Msg = value;
    m_MsgIsSet = true;
}
bool NonExistingStreamError_allOf::msgIsSet() const
{
    return m_MsgIsSet;
}
void NonExistingStreamError_allOf::unsetMsg()
{
    m_MsgIsSet = false;
}
AnyType NonExistingStreamError_allOf::getCode() const
{
    return m_Code;
}
void NonExistingStreamError_allOf::setCode(AnyType const& value)
{
    m_Code = value;
    m_CodeIsSet = true;
}
bool NonExistingStreamError_allOf::codeIsSet() const
{
    return m_CodeIsSet;
}
void NonExistingStreamError_allOf::unsetCode()
{
    m_CodeIsSet = false;
}
std::string NonExistingStreamError_allOf::getStream() const
{
    return m_Stream;
}
void NonExistingStreamError_allOf::setStream(std::string const& value)
{
    m_Stream = value;
    m_StreamIsSet = true;
}
bool NonExistingStreamError_allOf::streamIsSet() const
{
    return m_StreamIsSet;
}
void NonExistingStreamError_allOf::unsetStream()
{
    m_StreamIsSet = false;
}


} // namespace org::openapitools::server::model

