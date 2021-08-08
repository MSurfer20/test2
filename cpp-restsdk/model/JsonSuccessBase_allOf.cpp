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



#include "JsonSuccessBase_allOf.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




JsonSuccessBase_allOf::JsonSuccessBase_allOf()
{
    m_Result = utility::conversions::to_string_t("");
    m_ResultIsSet = false;
    m_Msg = utility::conversions::to_string_t("");
    m_MsgIsSet = false;
}

JsonSuccessBase_allOf::~JsonSuccessBase_allOf()
{
}

void JsonSuccessBase_allOf::validate()
{
    // TODO: implement validation
}

web::json::value JsonSuccessBase_allOf::toJson() const
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

    return val;
}

bool JsonSuccessBase_allOf::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("result")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("result"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_result;
            ok &= ModelBase::fromJson(fieldValue, refVal_result);
            setResult(refVal_result);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("msg")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("msg"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_msg;
            ok &= ModelBase::fromJson(fieldValue, refVal_msg);
            setMsg(refVal_msg);
        }
    }
    return ok;
}

void JsonSuccessBase_allOf::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
}

bool JsonSuccessBase_allOf::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("result")))
    {
        utility::string_t refVal_result;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("result")), refVal_result );
        setResult(refVal_result);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("msg")))
    {
        utility::string_t refVal_msg;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("msg")), refVal_msg );
        setMsg(refVal_msg);
    }
    return ok;
}

utility::string_t JsonSuccessBase_allOf::getResult() const
{
    return m_Result;
}

void JsonSuccessBase_allOf::setResult(const utility::string_t& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}

bool JsonSuccessBase_allOf::resultIsSet() const
{
    return m_ResultIsSet;
}

void JsonSuccessBase_allOf::unsetResult()
{
    m_ResultIsSet = false;
}
utility::string_t JsonSuccessBase_allOf::getMsg() const
{
    return m_Msg;
}

void JsonSuccessBase_allOf::setMsg(const utility::string_t& value)
{
    m_Msg = value;
    m_MsgIsSet = true;
}

bool JsonSuccessBase_allOf::msgIsSet() const
{
    return m_MsgIsSet;
}

void JsonSuccessBase_allOf::unsetMsg()
{
    m_MsgIsSet = false;
}
}
}
}
}


