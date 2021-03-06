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



#include "BasicBotBase.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




BasicBotBase::BasicBotBase()
{
    m_User_id = 0;
    m_User_idIsSet = false;
    m_Full_name = utility::conversions::to_string_t("");
    m_Full_nameIsSet = false;
    m_Api_key = utility::conversions::to_string_t("");
    m_Api_keyIsSet = false;
    m_Default_sending_stream = utility::conversions::to_string_t("");
    m_Default_sending_streamIsSet = false;
    m_Default_events_register_stream = utility::conversions::to_string_t("");
    m_Default_events_register_streamIsSet = false;
    m_Default_all_public_streams = false;
    m_Default_all_public_streamsIsSet = false;
    m_Avatar_url = utility::conversions::to_string_t("");
    m_Avatar_urlIsSet = false;
    m_Owner_id = 0;
    m_Owner_idIsSet = false;
    m_ServicesIsSet = false;
}

BasicBotBase::~BasicBotBase()
{
}

void BasicBotBase::validate()
{
    // TODO: implement validation
}

web::json::value BasicBotBase::toJson() const
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

    return val;
}

bool BasicBotBase::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("user_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("user_id"));
        if(!fieldValue.is_null())
        {
            int32_t refVal_user_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_user_id);
            setUserId(refVal_user_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("full_name")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("full_name"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_full_name;
            ok &= ModelBase::fromJson(fieldValue, refVal_full_name);
            setFullName(refVal_full_name);
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
    if(val.has_field(utility::conversions::to_string_t("default_sending_stream")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("default_sending_stream"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_default_sending_stream;
            ok &= ModelBase::fromJson(fieldValue, refVal_default_sending_stream);
            setDefaultSendingStream(refVal_default_sending_stream);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("default_events_register_stream")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("default_events_register_stream"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_default_events_register_stream;
            ok &= ModelBase::fromJson(fieldValue, refVal_default_events_register_stream);
            setDefaultEventsRegisterStream(refVal_default_events_register_stream);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("default_all_public_streams")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("default_all_public_streams"));
        if(!fieldValue.is_null())
        {
            bool refVal_default_all_public_streams;
            ok &= ModelBase::fromJson(fieldValue, refVal_default_all_public_streams);
            setDefaultAllPublicStreams(refVal_default_all_public_streams);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("avatar_url")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("avatar_url"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_avatar_url;
            ok &= ModelBase::fromJson(fieldValue, refVal_avatar_url);
            setAvatarUrl(refVal_avatar_url);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("owner_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("owner_id"));
        if(!fieldValue.is_null())
        {
            int32_t refVal_owner_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_owner_id);
            setOwnerId(refVal_owner_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("services")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("services"));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<OneOfobjectobject>> refVal_services;
            ok &= ModelBase::fromJson(fieldValue, refVal_services);
            setServices(refVal_services);
        }
    }
    return ok;
}

void BasicBotBase::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
}

bool BasicBotBase::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("user_id")))
    {
        int32_t refVal_user_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("user_id")), refVal_user_id );
        setUserId(refVal_user_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("full_name")))
    {
        utility::string_t refVal_full_name;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("full_name")), refVal_full_name );
        setFullName(refVal_full_name);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("api_key")))
    {
        utility::string_t refVal_api_key;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("api_key")), refVal_api_key );
        setApiKey(refVal_api_key);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("default_sending_stream")))
    {
        utility::string_t refVal_default_sending_stream;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("default_sending_stream")), refVal_default_sending_stream );
        setDefaultSendingStream(refVal_default_sending_stream);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("default_events_register_stream")))
    {
        utility::string_t refVal_default_events_register_stream;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("default_events_register_stream")), refVal_default_events_register_stream );
        setDefaultEventsRegisterStream(refVal_default_events_register_stream);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("default_all_public_streams")))
    {
        bool refVal_default_all_public_streams;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("default_all_public_streams")), refVal_default_all_public_streams );
        setDefaultAllPublicStreams(refVal_default_all_public_streams);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("avatar_url")))
    {
        utility::string_t refVal_avatar_url;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("avatar_url")), refVal_avatar_url );
        setAvatarUrl(refVal_avatar_url);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("owner_id")))
    {
        int32_t refVal_owner_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("owner_id")), refVal_owner_id );
        setOwnerId(refVal_owner_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("services")))
    {
        std::vector<std::shared_ptr<OneOfobjectobject>> refVal_services;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("services")), refVal_services );
        setServices(refVal_services);
    }
    return ok;
}

int32_t BasicBotBase::getUserId() const
{
    return m_User_id;
}

void BasicBotBase::setUserId(int32_t value)
{
    m_User_id = value;
    m_User_idIsSet = true;
}

bool BasicBotBase::userIdIsSet() const
{
    return m_User_idIsSet;
}

void BasicBotBase::unsetUser_id()
{
    m_User_idIsSet = false;
}
utility::string_t BasicBotBase::getFullName() const
{
    return m_Full_name;
}

void BasicBotBase::setFullName(const utility::string_t& value)
{
    m_Full_name = value;
    m_Full_nameIsSet = true;
}

bool BasicBotBase::fullNameIsSet() const
{
    return m_Full_nameIsSet;
}

void BasicBotBase::unsetFull_name()
{
    m_Full_nameIsSet = false;
}
utility::string_t BasicBotBase::getApiKey() const
{
    return m_Api_key;
}

void BasicBotBase::setApiKey(const utility::string_t& value)
{
    m_Api_key = value;
    m_Api_keyIsSet = true;
}

bool BasicBotBase::apiKeyIsSet() const
{
    return m_Api_keyIsSet;
}

void BasicBotBase::unsetApi_key()
{
    m_Api_keyIsSet = false;
}
utility::string_t BasicBotBase::getDefaultSendingStream() const
{
    return m_Default_sending_stream;
}

void BasicBotBase::setDefaultSendingStream(const utility::string_t& value)
{
    m_Default_sending_stream = value;
    m_Default_sending_streamIsSet = true;
}

bool BasicBotBase::defaultSendingStreamIsSet() const
{
    return m_Default_sending_streamIsSet;
}

void BasicBotBase::unsetDefault_sending_stream()
{
    m_Default_sending_streamIsSet = false;
}
utility::string_t BasicBotBase::getDefaultEventsRegisterStream() const
{
    return m_Default_events_register_stream;
}

void BasicBotBase::setDefaultEventsRegisterStream(const utility::string_t& value)
{
    m_Default_events_register_stream = value;
    m_Default_events_register_streamIsSet = true;
}

bool BasicBotBase::defaultEventsRegisterStreamIsSet() const
{
    return m_Default_events_register_streamIsSet;
}

void BasicBotBase::unsetDefault_events_register_stream()
{
    m_Default_events_register_streamIsSet = false;
}
bool BasicBotBase::isDefaultAllPublicStreams() const
{
    return m_Default_all_public_streams;
}

void BasicBotBase::setDefaultAllPublicStreams(bool value)
{
    m_Default_all_public_streams = value;
    m_Default_all_public_streamsIsSet = true;
}

bool BasicBotBase::defaultAllPublicStreamsIsSet() const
{
    return m_Default_all_public_streamsIsSet;
}

void BasicBotBase::unsetDefault_all_public_streams()
{
    m_Default_all_public_streamsIsSet = false;
}
utility::string_t BasicBotBase::getAvatarUrl() const
{
    return m_Avatar_url;
}

void BasicBotBase::setAvatarUrl(const utility::string_t& value)
{
    m_Avatar_url = value;
    m_Avatar_urlIsSet = true;
}

bool BasicBotBase::avatarUrlIsSet() const
{
    return m_Avatar_urlIsSet;
}

void BasicBotBase::unsetAvatar_url()
{
    m_Avatar_urlIsSet = false;
}
int32_t BasicBotBase::getOwnerId() const
{
    return m_Owner_id;
}

void BasicBotBase::setOwnerId(int32_t value)
{
    m_Owner_id = value;
    m_Owner_idIsSet = true;
}

bool BasicBotBase::ownerIdIsSet() const
{
    return m_Owner_idIsSet;
}

void BasicBotBase::unsetOwner_id()
{
    m_Owner_idIsSet = false;
}
std::vector<std::shared_ptr<OneOfobjectobject>>& BasicBotBase::getServices()
{
    return m_Services;
}

void BasicBotBase::setServices(const std::vector<std::shared_ptr<OneOfobjectobject>>& value)
{
    m_Services = value;
    m_ServicesIsSet = true;
}

bool BasicBotBase::servicesIsSet() const
{
    return m_ServicesIsSet;
}

void BasicBotBase::unsetServices()
{
    m_ServicesIsSet = false;
}
}
}
}
}


