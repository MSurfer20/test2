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



#include "MissingArgumentError.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




MissingArgumentError::MissingArgumentError()
{
    m_ResultIsSet = false;
    m_MsgIsSet = false;
    m_CodeIsSet = false;
    m_Var_name = utility::conversions::to_string_t("");
    m_Var_nameIsSet = false;
}

MissingArgumentError::~MissingArgumentError()
{
}

void MissingArgumentError::validate()
{
    // TODO: implement validation
}

web::json::value MissingArgumentError::toJson() const
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
    if(m_Var_nameIsSet)
    {
        val[utility::conversions::to_string_t("var_name")] = ModelBase::toJson(m_Var_name);
    }

    return val;
}

bool MissingArgumentError::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t("var_name")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("var_name"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_var_name;
            ok &= ModelBase::fromJson(fieldValue, refVal_var_name);
            setVarName(refVal_var_name);
        }
    }
    return ok;
}

void MissingArgumentError::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_Var_nameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("var_name"), m_Var_name));
    }
}

bool MissingArgumentError::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t("var_name")))
    {
        utility::string_t refVal_var_name;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("var_name")), refVal_var_name );
        setVarName(refVal_var_name);
    }
    return ok;
}

std::shared_ptr<AnyType> MissingArgumentError::getResult() const
{
    return m_Result;
}

void MissingArgumentError::setResult(const std::shared_ptr<AnyType>& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}

bool MissingArgumentError::resultIsSet() const
{
    return m_ResultIsSet;
}

void MissingArgumentError::unsetResult()
{
    m_ResultIsSet = false;
}
std::shared_ptr<AnyType> MissingArgumentError::getMsg() const
{
    return m_Msg;
}

void MissingArgumentError::setMsg(const std::shared_ptr<AnyType>& value)
{
    m_Msg = value;
    m_MsgIsSet = true;
}

bool MissingArgumentError::msgIsSet() const
{
    return m_MsgIsSet;
}

void MissingArgumentError::unsetMsg()
{
    m_MsgIsSet = false;
}
std::shared_ptr<AnyType> MissingArgumentError::getCode() const
{
    return m_Code;
}

void MissingArgumentError::setCode(const std::shared_ptr<AnyType>& value)
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
utility::string_t MissingArgumentError::getVarName() const
{
    return m_Var_name;
}

void MissingArgumentError::setVarName(const utility::string_t& value)
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
}
}
}
}


