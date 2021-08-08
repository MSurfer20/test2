/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.2.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "UserDeactivatedError.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




UserDeactivatedError::UserDeactivatedError()
{
    m_ResultIsSet = false;
    m_MsgIsSet = false;
    m_CodeIsSet = false;
}

UserDeactivatedError::~UserDeactivatedError()
{
}

void UserDeactivatedError::validate()
{
    // TODO: implement validation
}

web::json::value UserDeactivatedError::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_ResultIsSet)
    {
        val[utility::conversions::to_string_t("result")] = ModelBase::toJson(m_Result);
    }
    if(m_MsgIsSet)
    {
        val[utility::conversions::to_string_t("msg")] = ModelBase::toJson(m_Msg);
    }
    if(m_CodeIsSet)
    {
        val[utility::conversions::to_string_t("code")] = ModelBase::toJson(m_Code);
    }

    return val;
}

bool UserDeactivatedError::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("result")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("result"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_result;
            ok &= ModelBase::fromJson(fieldValue, refVal_result);
            setResult(refVal_result);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("msg")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("msg"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_msg;
            ok &= ModelBase::fromJson(fieldValue, refVal_msg);
            setMsg(refVal_msg);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("code")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("code"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_code;
            ok &= ModelBase::fromJson(fieldValue, refVal_code);
            setCode(refVal_code);
        }
    }
    return ok;
}

void UserDeactivatedError::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_ResultIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("result"), m_Result));
    }
    if(m_MsgIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("msg"), m_Msg));
    }
    if(m_CodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("code"), m_Code));
    }
}

bool UserDeactivatedError::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("result")))
    {
        std::shared_ptr<AnyType> refVal_result;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("result")), refVal_result );
        setResult(refVal_result);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("msg")))
    {
        std::shared_ptr<AnyType> refVal_msg;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("msg")), refVal_msg );
        setMsg(refVal_msg);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("code")))
    {
        std::shared_ptr<AnyType> refVal_code;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("code")), refVal_code );
        setCode(refVal_code);
    }
    return ok;
}

std::shared_ptr<AnyType> UserDeactivatedError::getResult() const
{
    return m_Result;
}

void UserDeactivatedError::setResult(const std::shared_ptr<AnyType>& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}

bool UserDeactivatedError::resultIsSet() const
{
    return m_ResultIsSet;
}

void UserDeactivatedError::unsetResult()
{
    m_ResultIsSet = false;
}
std::shared_ptr<AnyType> UserDeactivatedError::getMsg() const
{
    return m_Msg;
}

void UserDeactivatedError::setMsg(const std::shared_ptr<AnyType>& value)
{
    m_Msg = value;
    m_MsgIsSet = true;
}

bool UserDeactivatedError::msgIsSet() const
{
    return m_MsgIsSet;
}

void UserDeactivatedError::unsetMsg()
{
    m_MsgIsSet = false;
}
std::shared_ptr<AnyType> UserDeactivatedError::getCode() const
{
    return m_Code;
}

void UserDeactivatedError::setCode(const std::shared_ptr<AnyType>& value)
{
    m_Code = value;
    m_CodeIsSet = true;
}

bool UserDeactivatedError::codeIsSet() const
{
    return m_CodeIsSet;
}

void UserDeactivatedError::unsetCode()
{
    m_CodeIsSet = false;
}
}
}
}
}


