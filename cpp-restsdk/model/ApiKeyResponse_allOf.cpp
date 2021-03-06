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



#include "ApiKeyResponse_allOf.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




ApiKeyResponse_allOf::ApiKeyResponse_allOf()
{
    m_ResultIsSet = false;
    m_MsgIsSet = false;
    m_Api_key = utility::conversions::to_string_t("");
    m_Api_keyIsSet = false;
    m_Email = utility::conversions::to_string_t("");
    m_EmailIsSet = false;
}

ApiKeyResponse_allOf::~ApiKeyResponse_allOf()
{
}

void ApiKeyResponse_allOf::validate()
{
    // TODO: implement validation
}

web::json::value ApiKeyResponse_allOf::toJson() const
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
    if(m_Api_keyIsSet)
    {
        val[utility::conversions::to_string_t("api_key")] = ModelBase::toJson(m_Api_key);
    }
    if(m_EmailIsSet)
    {
        val[utility::conversions::to_string_t("email")] = ModelBase::toJson(m_Email);
    }

    return val;
}

bool ApiKeyResponse_allOf::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t("api_key")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("api_key"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_api_key;
            ok &= ModelBase::fromJson(fieldValue, refVal_api_key);
            setApiKey(refVal_api_key);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("email")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("email"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_email;
            ok &= ModelBase::fromJson(fieldValue, refVal_email);
            setEmail(refVal_email);
        }
    }
    return ok;
}

void ApiKeyResponse_allOf::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_Api_keyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("api_key"), m_Api_key));
    }
    if(m_EmailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("email"), m_Email));
    }
}

bool ApiKeyResponse_allOf::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t("api_key")))
    {
        utility::string_t refVal_api_key;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("api_key")), refVal_api_key );
        setApiKey(refVal_api_key);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("email")))
    {
        utility::string_t refVal_email;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("email")), refVal_email );
        setEmail(refVal_email);
    }
    return ok;
}

std::shared_ptr<AnyType> ApiKeyResponse_allOf::getResult() const
{
    return m_Result;
}

void ApiKeyResponse_allOf::setResult(const std::shared_ptr<AnyType>& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}

bool ApiKeyResponse_allOf::resultIsSet() const
{
    return m_ResultIsSet;
}

void ApiKeyResponse_allOf::unsetResult()
{
    m_ResultIsSet = false;
}
std::shared_ptr<AnyType> ApiKeyResponse_allOf::getMsg() const
{
    return m_Msg;
}

void ApiKeyResponse_allOf::setMsg(const std::shared_ptr<AnyType>& value)
{
    m_Msg = value;
    m_MsgIsSet = true;
}

bool ApiKeyResponse_allOf::msgIsSet() const
{
    return m_MsgIsSet;
}

void ApiKeyResponse_allOf::unsetMsg()
{
    m_MsgIsSet = false;
}
utility::string_t ApiKeyResponse_allOf::getApiKey() const
{
    return m_Api_key;
}

void ApiKeyResponse_allOf::setApiKey(const utility::string_t& value)
{
    m_Api_key = value;
    m_Api_keyIsSet = true;
}

bool ApiKeyResponse_allOf::apiKeyIsSet() const
{
    return m_Api_keyIsSet;
}

void ApiKeyResponse_allOf::unsetApi_key()
{
    m_Api_keyIsSet = false;
}
utility::string_t ApiKeyResponse_allOf::getEmail() const
{
    return m_Email;
}

void ApiKeyResponse_allOf::setEmail(const utility::string_t& value)
{
    m_Email = value;
    m_EmailIsSet = true;
}

bool ApiKeyResponse_allOf::emailIsSet() const
{
    return m_EmailIsSet;
}

void ApiKeyResponse_allOf::unsetEmail()
{
    m_EmailIsSet = false;
}
}
}
}
}


