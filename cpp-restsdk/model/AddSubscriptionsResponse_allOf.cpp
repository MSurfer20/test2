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



#include "AddSubscriptionsResponse_allOf.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




AddSubscriptionsResponse_allOf::AddSubscriptionsResponse_allOf()
{
    m_ResultIsSet = false;
    m_MsgIsSet = false;
    m_SubscribedIsSet = false;
    m_Already_subscribedIsSet = false;
    m_UnauthorizedIsSet = false;
}

AddSubscriptionsResponse_allOf::~AddSubscriptionsResponse_allOf()
{
}

void AddSubscriptionsResponse_allOf::validate()
{
    // TODO: implement validation
}

web::json::value AddSubscriptionsResponse_allOf::toJson() const
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
    if(m_SubscribedIsSet)
    {
        val[utility::conversions::to_string_t("subscribed")] = ModelBase::toJson(m_Subscribed);
    }
    if(m_Already_subscribedIsSet)
    {
        val[utility::conversions::to_string_t("already_subscribed")] = ModelBase::toJson(m_Already_subscribed);
    }
    if(m_UnauthorizedIsSet)
    {
        val[utility::conversions::to_string_t("unauthorized")] = ModelBase::toJson(m_Unauthorized);
    }

    return val;
}

bool AddSubscriptionsResponse_allOf::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t("subscribed")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("subscribed"));
        if(!fieldValue.is_null())
        {
            std::map<utility::string_t, std::vector<utility::string_t>> refVal_subscribed;
            ok &= ModelBase::fromJson(fieldValue, refVal_subscribed);
            setSubscribed(refVal_subscribed);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("already_subscribed")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("already_subscribed"));
        if(!fieldValue.is_null())
        {
            std::map<utility::string_t, std::vector<utility::string_t>> refVal_already_subscribed;
            ok &= ModelBase::fromJson(fieldValue, refVal_already_subscribed);
            setAlreadySubscribed(refVal_already_subscribed);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("unauthorized")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("unauthorized"));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_unauthorized;
            ok &= ModelBase::fromJson(fieldValue, refVal_unauthorized);
            setUnauthorized(refVal_unauthorized);
        }
    }
    return ok;
}

void AddSubscriptionsResponse_allOf::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_SubscribedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("subscribed"), m_Subscribed));
    }
    if(m_Already_subscribedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("already_subscribed"), m_Already_subscribed));
    }
    if(m_UnauthorizedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("unauthorized"), m_Unauthorized));
    }
}

bool AddSubscriptionsResponse_allOf::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t("subscribed")))
    {
        std::map<utility::string_t, std::vector<utility::string_t>> refVal_subscribed;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("subscribed")), refVal_subscribed );
        setSubscribed(refVal_subscribed);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("already_subscribed")))
    {
        std::map<utility::string_t, std::vector<utility::string_t>> refVal_already_subscribed;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("already_subscribed")), refVal_already_subscribed );
        setAlreadySubscribed(refVal_already_subscribed);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("unauthorized")))
    {
        std::vector<utility::string_t> refVal_unauthorized;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("unauthorized")), refVal_unauthorized );
        setUnauthorized(refVal_unauthorized);
    }
    return ok;
}

std::shared_ptr<AnyType> AddSubscriptionsResponse_allOf::getResult() const
{
    return m_Result;
}

void AddSubscriptionsResponse_allOf::setResult(const std::shared_ptr<AnyType>& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}

bool AddSubscriptionsResponse_allOf::resultIsSet() const
{
    return m_ResultIsSet;
}

void AddSubscriptionsResponse_allOf::unsetResult()
{
    m_ResultIsSet = false;
}
std::shared_ptr<AnyType> AddSubscriptionsResponse_allOf::getMsg() const
{
    return m_Msg;
}

void AddSubscriptionsResponse_allOf::setMsg(const std::shared_ptr<AnyType>& value)
{
    m_Msg = value;
    m_MsgIsSet = true;
}

bool AddSubscriptionsResponse_allOf::msgIsSet() const
{
    return m_MsgIsSet;
}

void AddSubscriptionsResponse_allOf::unsetMsg()
{
    m_MsgIsSet = false;
}
std::map<utility::string_t, std::vector<utility::string_t>>& AddSubscriptionsResponse_allOf::getSubscribed()
{
    return m_Subscribed;
}

void AddSubscriptionsResponse_allOf::setSubscribed(const std::map<utility::string_t, std::vector<utility::string_t>>& value)
{
    m_Subscribed = value;
    m_SubscribedIsSet = true;
}

bool AddSubscriptionsResponse_allOf::subscribedIsSet() const
{
    return m_SubscribedIsSet;
}

void AddSubscriptionsResponse_allOf::unsetSubscribed()
{
    m_SubscribedIsSet = false;
}
std::map<utility::string_t, std::vector<utility::string_t>>& AddSubscriptionsResponse_allOf::getAlreadySubscribed()
{
    return m_Already_subscribed;
}

void AddSubscriptionsResponse_allOf::setAlreadySubscribed(const std::map<utility::string_t, std::vector<utility::string_t>>& value)
{
    m_Already_subscribed = value;
    m_Already_subscribedIsSet = true;
}

bool AddSubscriptionsResponse_allOf::alreadySubscribedIsSet() const
{
    return m_Already_subscribedIsSet;
}

void AddSubscriptionsResponse_allOf::unsetAlready_subscribed()
{
    m_Already_subscribedIsSet = false;
}
std::vector<utility::string_t>& AddSubscriptionsResponse_allOf::getUnauthorized()
{
    return m_Unauthorized;
}

void AddSubscriptionsResponse_allOf::setUnauthorized(const std::vector<utility::string_t>& value)
{
    m_Unauthorized = value;
    m_UnauthorizedIsSet = true;
}

bool AddSubscriptionsResponse_allOf::unauthorizedIsSet() const
{
    return m_UnauthorizedIsSet;
}

void AddSubscriptionsResponse_allOf::unsetUnauthorized()
{
    m_UnauthorizedIsSet = false;
}
}
}
}
}


