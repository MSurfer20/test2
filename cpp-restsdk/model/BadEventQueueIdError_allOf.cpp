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



#include "BadEventQueueIdError_allOf.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




BadEventQueueIdError_allOf::BadEventQueueIdError_allOf()
{
    m_ResultIsSet = false;
    m_MsgIsSet = false;
    m_CodeIsSet = false;
    m_Queue_id = utility::conversions::to_string_t("");
    m_Queue_idIsSet = false;
}

BadEventQueueIdError_allOf::~BadEventQueueIdError_allOf()
{
}

void BadEventQueueIdError_allOf::validate()
{
    // TODO: implement validation
}

web::json::value BadEventQueueIdError_allOf::toJson() const
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
    if(m_Queue_idIsSet)
    {
        val[utility::conversions::to_string_t("queue_id")] = ModelBase::toJson(m_Queue_id);
    }

    return val;
}

bool BadEventQueueIdError_allOf::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t("queue_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("queue_id"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_queue_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_queue_id);
            setQueueId(refVal_queue_id);
        }
    }
    return ok;
}

void BadEventQueueIdError_allOf::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_Queue_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("queue_id"), m_Queue_id));
    }
}

bool BadEventQueueIdError_allOf::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t("queue_id")))
    {
        utility::string_t refVal_queue_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("queue_id")), refVal_queue_id );
        setQueueId(refVal_queue_id);
    }
    return ok;
}

std::shared_ptr<AnyType> BadEventQueueIdError_allOf::getResult() const
{
    return m_Result;
}

void BadEventQueueIdError_allOf::setResult(const std::shared_ptr<AnyType>& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}

bool BadEventQueueIdError_allOf::resultIsSet() const
{
    return m_ResultIsSet;
}

void BadEventQueueIdError_allOf::unsetResult()
{
    m_ResultIsSet = false;
}
std::shared_ptr<AnyType> BadEventQueueIdError_allOf::getMsg() const
{
    return m_Msg;
}

void BadEventQueueIdError_allOf::setMsg(const std::shared_ptr<AnyType>& value)
{
    m_Msg = value;
    m_MsgIsSet = true;
}

bool BadEventQueueIdError_allOf::msgIsSet() const
{
    return m_MsgIsSet;
}

void BadEventQueueIdError_allOf::unsetMsg()
{
    m_MsgIsSet = false;
}
std::shared_ptr<AnyType> BadEventQueueIdError_allOf::getCode() const
{
    return m_Code;
}

void BadEventQueueIdError_allOf::setCode(const std::shared_ptr<AnyType>& value)
{
    m_Code = value;
    m_CodeIsSet = true;
}

bool BadEventQueueIdError_allOf::codeIsSet() const
{
    return m_CodeIsSet;
}

void BadEventQueueIdError_allOf::unsetCode()
{
    m_CodeIsSet = false;
}
utility::string_t BadEventQueueIdError_allOf::getQueueId() const
{
    return m_Queue_id;
}

void BadEventQueueIdError_allOf::setQueueId(const utility::string_t& value)
{
    m_Queue_id = value;
    m_Queue_idIsSet = true;
}

bool BadEventQueueIdError_allOf::queueIdIsSet() const
{
    return m_Queue_idIsSet;
}

void BadEventQueueIdError_allOf::unsetQueue_id()
{
    m_Queue_idIsSet = false;
}
}
}
}
}


