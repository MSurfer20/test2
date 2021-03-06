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



#include "Bot_allOf.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




Bot_allOf::Bot_allOf()
{
    m_User_idIsSet = false;
    m_Full_nameIsSet = false;
    m_Api_keyIsSet = false;
    m_Default_sending_streamIsSet = false;
    m_Default_events_register_streamIsSet = false;
    m_Default_all_public_streamsIsSet = false;
    m_Avatar_urlIsSet = false;
    m_Owner_idIsSet = false;
    m_ServicesIsSet = false;
    m_Email = utility::conversions::to_string_t("");
    m_EmailIsSet = false;
    m_Bot_type = 0;
    m_Bot_typeIsSet = false;
    m_Is_active = false;
    m_Is_activeIsSet = false;
}

Bot_allOf::~Bot_allOf()
{
}

void Bot_allOf::validate()
{
    // TODO: implement validation
}

web::json::value Bot_allOf::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_User_idIsSet)
    {
        val[utility::conversions::to_string_t("user_id")] = ModelBase::toJson(m_User_id);
    }
    if(m_Full_nameIsSet)
    {
        val[utility::conversions::to_string_t("full_name")] = ModelBase::toJson(m_Full_name);
    }
    if(m_Api_keyIsSet)
    {
        val[utility::conversions::to_string_t("api_key")] = ModelBase::toJson(m_Api_key);
    }
    if(m_Default_sending_streamIsSet)
    {
        val[utility::conversions::to_string_t("default_sending_stream")] = ModelBase::toJson(m_Default_sending_stream);
    }
    if(m_Default_events_register_streamIsSet)
    {
        val[utility::conversions::to_string_t("default_events_register_stream")] = ModelBase::toJson(m_Default_events_register_stream);
    }
    if(m_Default_all_public_streamsIsSet)
    {
        val[utility::conversions::to_string_t("default_all_public_streams")] = ModelBase::toJson(m_Default_all_public_streams);
    }
    if(m_Avatar_urlIsSet)
    {
        val[utility::conversions::to_string_t("avatar_url")] = ModelBase::toJson(m_Avatar_url);
    }
    if(m_Owner_idIsSet)
    {
        val[utility::conversions::to_string_t("owner_id")] = ModelBase::toJson(m_Owner_id);
    }
    if(m_ServicesIsSet)
    {
        val[utility::conversions::to_string_t("services")] = ModelBase::toJson(m_Services);
    }
    if(m_EmailIsSet)
    {
        val[utility::conversions::to_string_t("email")] = ModelBase::toJson(m_Email);
    }
    if(m_Bot_typeIsSet)
    {
        val[utility::conversions::to_string_t("bot_type")] = ModelBase::toJson(m_Bot_type);
    }
    if(m_Is_activeIsSet)
    {
        val[utility::conversions::to_string_t("is_active")] = ModelBase::toJson(m_Is_active);
    }

    return val;
}

bool Bot_allOf::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("user_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("user_id"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_user_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_user_id);
            setUserId(refVal_user_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("full_name")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("full_name"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_full_name;
            ok &= ModelBase::fromJson(fieldValue, refVal_full_name);
            setFullName(refVal_full_name);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("api_key")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("api_key"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_api_key;
            ok &= ModelBase::fromJson(fieldValue, refVal_api_key);
            setApiKey(refVal_api_key);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("default_sending_stream")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("default_sending_stream"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_default_sending_stream;
            ok &= ModelBase::fromJson(fieldValue, refVal_default_sending_stream);
            setDefaultSendingStream(refVal_default_sending_stream);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("default_events_register_stream")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("default_events_register_stream"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_default_events_register_stream;
            ok &= ModelBase::fromJson(fieldValue, refVal_default_events_register_stream);
            setDefaultEventsRegisterStream(refVal_default_events_register_stream);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("default_all_public_streams")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("default_all_public_streams"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_default_all_public_streams;
            ok &= ModelBase::fromJson(fieldValue, refVal_default_all_public_streams);
            setDefaultAllPublicStreams(refVal_default_all_public_streams);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("avatar_url")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("avatar_url"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_avatar_url;
            ok &= ModelBase::fromJson(fieldValue, refVal_avatar_url);
            setAvatarUrl(refVal_avatar_url);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("owner_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("owner_id"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_owner_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_owner_id);
            setOwnerId(refVal_owner_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("services")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("services"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_services;
            ok &= ModelBase::fromJson(fieldValue, refVal_services);
            setServices(refVal_services);
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
    if(val.has_field(utility::conversions::to_string_t("bot_type")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("bot_type"));
        if(!fieldValue.is_null())
        {
            int32_t refVal_bot_type;
            ok &= ModelBase::fromJson(fieldValue, refVal_bot_type);
            setBotType(refVal_bot_type);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("is_active")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("is_active"));
        if(!fieldValue.is_null())
        {
            bool refVal_is_active;
            ok &= ModelBase::fromJson(fieldValue, refVal_is_active);
            setIsActive(refVal_is_active);
        }
    }
    return ok;
}

void Bot_allOf::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_User_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("user_id"), m_User_id));
    }
    if(m_Full_nameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("full_name"), m_Full_name));
    }
    if(m_Api_keyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("api_key"), m_Api_key));
    }
    if(m_Default_sending_streamIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("default_sending_stream"), m_Default_sending_stream));
    }
    if(m_Default_events_register_streamIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("default_events_register_stream"), m_Default_events_register_stream));
    }
    if(m_Default_all_public_streamsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("default_all_public_streams"), m_Default_all_public_streams));
    }
    if(m_Avatar_urlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("avatar_url"), m_Avatar_url));
    }
    if(m_Owner_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("owner_id"), m_Owner_id));
    }
    if(m_ServicesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("services"), m_Services));
    }
    if(m_EmailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("email"), m_Email));
    }
    if(m_Bot_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("bot_type"), m_Bot_type));
    }
    if(m_Is_activeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("is_active"), m_Is_active));
    }
}

bool Bot_allOf::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("user_id")))
    {
        std::shared_ptr<AnyType> refVal_user_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("user_id")), refVal_user_id );
        setUserId(refVal_user_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("full_name")))
    {
        std::shared_ptr<AnyType> refVal_full_name;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("full_name")), refVal_full_name );
        setFullName(refVal_full_name);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("api_key")))
    {
        std::shared_ptr<AnyType> refVal_api_key;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("api_key")), refVal_api_key );
        setApiKey(refVal_api_key);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("default_sending_stream")))
    {
        std::shared_ptr<AnyType> refVal_default_sending_stream;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("default_sending_stream")), refVal_default_sending_stream );
        setDefaultSendingStream(refVal_default_sending_stream);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("default_events_register_stream")))
    {
        std::shared_ptr<AnyType> refVal_default_events_register_stream;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("default_events_register_stream")), refVal_default_events_register_stream );
        setDefaultEventsRegisterStream(refVal_default_events_register_stream);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("default_all_public_streams")))
    {
        std::shared_ptr<AnyType> refVal_default_all_public_streams;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("default_all_public_streams")), refVal_default_all_public_streams );
        setDefaultAllPublicStreams(refVal_default_all_public_streams);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("avatar_url")))
    {
        std::shared_ptr<AnyType> refVal_avatar_url;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("avatar_url")), refVal_avatar_url );
        setAvatarUrl(refVal_avatar_url);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("owner_id")))
    {
        std::shared_ptr<AnyType> refVal_owner_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("owner_id")), refVal_owner_id );
        setOwnerId(refVal_owner_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("services")))
    {
        std::shared_ptr<AnyType> refVal_services;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("services")), refVal_services );
        setServices(refVal_services);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("email")))
    {
        utility::string_t refVal_email;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("email")), refVal_email );
        setEmail(refVal_email);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("bot_type")))
    {
        int32_t refVal_bot_type;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("bot_type")), refVal_bot_type );
        setBotType(refVal_bot_type);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("is_active")))
    {
        bool refVal_is_active;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("is_active")), refVal_is_active );
        setIsActive(refVal_is_active);
    }
    return ok;
}

std::shared_ptr<AnyType> Bot_allOf::getUserId() const
{
    return m_User_id;
}

void Bot_allOf::setUserId(const std::shared_ptr<AnyType>& value)
{
    m_User_id = value;
    m_User_idIsSet = true;
}

bool Bot_allOf::userIdIsSet() const
{
    return m_User_idIsSet;
}

void Bot_allOf::unsetUser_id()
{
    m_User_idIsSet = false;
}
std::shared_ptr<AnyType> Bot_allOf::getFullName() const
{
    return m_Full_name;
}

void Bot_allOf::setFullName(const std::shared_ptr<AnyType>& value)
{
    m_Full_name = value;
    m_Full_nameIsSet = true;
}

bool Bot_allOf::fullNameIsSet() const
{
    return m_Full_nameIsSet;
}

void Bot_allOf::unsetFull_name()
{
    m_Full_nameIsSet = false;
}
std::shared_ptr<AnyType> Bot_allOf::getApiKey() const
{
    return m_Api_key;
}

void Bot_allOf::setApiKey(const std::shared_ptr<AnyType>& value)
{
    m_Api_key = value;
    m_Api_keyIsSet = true;
}

bool Bot_allOf::apiKeyIsSet() const
{
    return m_Api_keyIsSet;
}

void Bot_allOf::unsetApi_key()
{
    m_Api_keyIsSet = false;
}
std::shared_ptr<AnyType> Bot_allOf::getDefaultSendingStream() const
{
    return m_Default_sending_stream;
}

void Bot_allOf::setDefaultSendingStream(const std::shared_ptr<AnyType>& value)
{
    m_Default_sending_stream = value;
    m_Default_sending_streamIsSet = true;
}

bool Bot_allOf::defaultSendingStreamIsSet() const
{
    return m_Default_sending_streamIsSet;
}

void Bot_allOf::unsetDefault_sending_stream()
{
    m_Default_sending_streamIsSet = false;
}
std::shared_ptr<AnyType> Bot_allOf::getDefaultEventsRegisterStream() const
{
    return m_Default_events_register_stream;
}

void Bot_allOf::setDefaultEventsRegisterStream(const std::shared_ptr<AnyType>& value)
{
    m_Default_events_register_stream = value;
    m_Default_events_register_streamIsSet = true;
}

bool Bot_allOf::defaultEventsRegisterStreamIsSet() const
{
    return m_Default_events_register_streamIsSet;
}

void Bot_allOf::unsetDefault_events_register_stream()
{
    m_Default_events_register_streamIsSet = false;
}
std::shared_ptr<AnyType> Bot_allOf::getDefaultAllPublicStreams() const
{
    return m_Default_all_public_streams;
}

void Bot_allOf::setDefaultAllPublicStreams(const std::shared_ptr<AnyType>& value)
{
    m_Default_all_public_streams = value;
    m_Default_all_public_streamsIsSet = true;
}

bool Bot_allOf::defaultAllPublicStreamsIsSet() const
{
    return m_Default_all_public_streamsIsSet;
}

void Bot_allOf::unsetDefault_all_public_streams()
{
    m_Default_all_public_streamsIsSet = false;
}
std::shared_ptr<AnyType> Bot_allOf::getAvatarUrl() const
{
    return m_Avatar_url;
}

void Bot_allOf::setAvatarUrl(const std::shared_ptr<AnyType>& value)
{
    m_Avatar_url = value;
    m_Avatar_urlIsSet = true;
}

bool Bot_allOf::avatarUrlIsSet() const
{
    return m_Avatar_urlIsSet;
}

void Bot_allOf::unsetAvatar_url()
{
    m_Avatar_urlIsSet = false;
}
std::shared_ptr<AnyType> Bot_allOf::getOwnerId() const
{
    return m_Owner_id;
}

void Bot_allOf::setOwnerId(const std::shared_ptr<AnyType>& value)
{
    m_Owner_id = value;
    m_Owner_idIsSet = true;
}

bool Bot_allOf::ownerIdIsSet() const
{
    return m_Owner_idIsSet;
}

void Bot_allOf::unsetOwner_id()
{
    m_Owner_idIsSet = false;
}
std::shared_ptr<AnyType> Bot_allOf::getServices() const
{
    return m_Services;
}

void Bot_allOf::setServices(const std::shared_ptr<AnyType>& value)
{
    m_Services = value;
    m_ServicesIsSet = true;
}

bool Bot_allOf::servicesIsSet() const
{
    return m_ServicesIsSet;
}

void Bot_allOf::unsetServices()
{
    m_ServicesIsSet = false;
}
utility::string_t Bot_allOf::getEmail() const
{
    return m_Email;
}

void Bot_allOf::setEmail(const utility::string_t& value)
{
    m_Email = value;
    m_EmailIsSet = true;
}

bool Bot_allOf::emailIsSet() const
{
    return m_EmailIsSet;
}

void Bot_allOf::unsetEmail()
{
    m_EmailIsSet = false;
}
int32_t Bot_allOf::getBotType() const
{
    return m_Bot_type;
}

void Bot_allOf::setBotType(int32_t value)
{
    m_Bot_type = value;
    m_Bot_typeIsSet = true;
}

bool Bot_allOf::botTypeIsSet() const
{
    return m_Bot_typeIsSet;
}

void Bot_allOf::unsetBot_type()
{
    m_Bot_typeIsSet = false;
}
bool Bot_allOf::isIsActive() const
{
    return m_Is_active;
}

void Bot_allOf::setIsActive(bool value)
{
    m_Is_active = value;
    m_Is_activeIsSet = true;
}

bool Bot_allOf::isActiveIsSet() const
{
    return m_Is_activeIsSet;
}

void Bot_allOf::unsetIs_active()
{
    m_Is_activeIsSet = false;
}
}
}
}
}


