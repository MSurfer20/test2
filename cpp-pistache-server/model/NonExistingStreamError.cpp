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


#include "NonExistingStreamError.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

NonExistingStreamError::NonExistingStreamError()
{
    m_CodeIsSet = false;
    m_Stream = "";
    m_StreamIsSet = false;
    
}

void NonExistingStreamError::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool NonExistingStreamError::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool NonExistingStreamError::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "NonExistingStreamError" : pathPrefix;

                    
    return success;
}

bool NonExistingStreamError::operator==(const NonExistingStreamError& rhs) const
{
    return
    
    
    (getResult() == rhs.getResult())
     &&
    
    (getMsg() == rhs.getMsg())
     &&
    
    
    ((!codeIsSet() && !rhs.codeIsSet()) || (codeIsSet() && rhs.codeIsSet() && getCode() == rhs.getCode())) &&
    
    
    ((!streamIsSet() && !rhs.streamIsSet()) || (streamIsSet() && rhs.streamIsSet() && getStream() == rhs.getStream()))
    
    ;
}

bool NonExistingStreamError::operator!=(const NonExistingStreamError& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const NonExistingStreamError& o)
{
    j = nlohmann::json();
    j["result"] = o.m_Result;
    j["msg"] = o.m_Msg;
    if(o.codeIsSet())
        j["code"] = o.m_Code;
    if(o.streamIsSet())
        j["stream"] = o.m_Stream;
    
}

void from_json(const nlohmann::json& j, NonExistingStreamError& o)
{
    j.at("result").get_to(o.m_Result);
    j.at("msg").get_to(o.m_Msg);
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

AnyType NonExistingStreamError::getResult() const
{
    return m_Result;
}
void NonExistingStreamError::setResult(AnyType const& value)
{
    m_Result = value;
}
AnyType NonExistingStreamError::getMsg() const
{
    return m_Msg;
}
void NonExistingStreamError::setMsg(AnyType const& value)
{
    m_Msg = value;
}
AnyType NonExistingStreamError::getCode() const
{
    return m_Code;
}
void NonExistingStreamError::setCode(AnyType const& value)
{
    m_Code = value;
    m_CodeIsSet = true;
}
bool NonExistingStreamError::codeIsSet() const
{
    return m_CodeIsSet;
}
void NonExistingStreamError::unsetCode()
{
    m_CodeIsSet = false;
}
std::string NonExistingStreamError::getStream() const
{
    return m_Stream;
}
void NonExistingStreamError::setStream(std::string const& value)
{
    m_Stream = value;
    m_StreamIsSet = true;
}
bool NonExistingStreamError::streamIsSet() const
{
    return m_StreamIsSet;
}
void NonExistingStreamError::unsetStream()
{
    m_StreamIsSet = false;
}


} // namespace org::openapitools::server::model
