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



#include "BasicStreamBase.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




BasicStreamBase::BasicStreamBase()
{
    m_Stream_id = 0;
    m_Stream_idIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Description = utility::conversions::to_string_t("");
    m_DescriptionIsSet = false;
    m_Date_created = 0;
    m_Date_createdIsSet = false;
    m_Invite_only = false;
    m_Invite_onlyIsSet = false;
    m_Rendered_description = utility::conversions::to_string_t("");
    m_Rendered_descriptionIsSet = false;
    m_Is_web_public = false;
    m_Is_web_publicIsSet = false;
    m_Stream_post_policy = 0;
    m_Stream_post_policyIsSet = false;
    m_Message_retention_days = 0;
    m_Message_retention_daysIsSet = false;
    m_History_public_to_subscribers = false;
    m_History_public_to_subscribersIsSet = false;
    m_First_message_id = 0;
    m_First_message_idIsSet = false;
    m_Is_announcement_only = false;
    m_Is_announcement_onlyIsSet = false;
}

BasicStreamBase::~BasicStreamBase()
{
}

void BasicStreamBase::validate()
{
    // TODO: implement validation
}

web::json::value BasicStreamBase::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Stream_idIsSet)
    {
        val[utility::conversions::to_string_t("stream_id")] = ModelBase::toJson(m_Stream_id);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    }
    if(m_DescriptionIsSet)
    {
        val[utility::conversions::to_string_t("description")] = ModelBase::toJson(m_Description);
    }
    if(m_Date_createdIsSet)
    {
        val[utility::conversions::to_string_t("date_created")] = ModelBase::toJson(m_Date_created);
    }
    if(m_Invite_onlyIsSet)
    {
        val[utility::conversions::to_string_t("invite_only")] = ModelBase::toJson(m_Invite_only);
    }
    if(m_Rendered_descriptionIsSet)
    {
        val[utility::conversions::to_string_t("rendered_description")] = ModelBase::toJson(m_Rendered_description);
    }
    if(m_Is_web_publicIsSet)
    {
        val[utility::conversions::to_string_t("is_web_public")] = ModelBase::toJson(m_Is_web_public);
    }
    if(m_Stream_post_policyIsSet)
    {
        val[utility::conversions::to_string_t("stream_post_policy")] = ModelBase::toJson(m_Stream_post_policy);
    }
    if(m_Message_retention_daysIsSet)
    {
        val[utility::conversions::to_string_t("message_retention_days")] = ModelBase::toJson(m_Message_retention_days);
    }
    if(m_History_public_to_subscribersIsSet)
    {
        val[utility::conversions::to_string_t("history_public_to_subscribers")] = ModelBase::toJson(m_History_public_to_subscribers);
    }
    if(m_First_message_idIsSet)
    {
        val[utility::conversions::to_string_t("first_message_id")] = ModelBase::toJson(m_First_message_id);
    }
    if(m_Is_announcement_onlyIsSet)
    {
        val[utility::conversions::to_string_t("is_announcement_only")] = ModelBase::toJson(m_Is_announcement_only);
    }

    return val;
}

bool BasicStreamBase::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("stream_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("stream_id"));
        if(!fieldValue.is_null())
        {
            int32_t refVal_stream_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_stream_id);
            setStreamId(refVal_stream_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("name")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("name"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_name;
            ok &= ModelBase::fromJson(fieldValue, refVal_name);
            setName(refVal_name);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("description")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("description"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_description;
            ok &= ModelBase::fromJson(fieldValue, refVal_description);
            setDescription(refVal_description);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("date_created")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("date_created"));
        if(!fieldValue.is_null())
        {
            int32_t refVal_date_created;
            ok &= ModelBase::fromJson(fieldValue, refVal_date_created);
            setDateCreated(refVal_date_created);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("invite_only")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("invite_only"));
        if(!fieldValue.is_null())
        {
            bool refVal_invite_only;
            ok &= ModelBase::fromJson(fieldValue, refVal_invite_only);
            setInviteOnly(refVal_invite_only);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("rendered_description")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("rendered_description"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_rendered_description;
            ok &= ModelBase::fromJson(fieldValue, refVal_rendered_description);
            setRenderedDescription(refVal_rendered_description);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("is_web_public")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("is_web_public"));
        if(!fieldValue.is_null())
        {
            bool refVal_is_web_public;
            ok &= ModelBase::fromJson(fieldValue, refVal_is_web_public);
            setIsWebPublic(refVal_is_web_public);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("stream_post_policy")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("stream_post_policy"));
        if(!fieldValue.is_null())
        {
            int32_t refVal_stream_post_policy;
            ok &= ModelBase::fromJson(fieldValue, refVal_stream_post_policy);
            setStreamPostPolicy(refVal_stream_post_policy);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("message_retention_days")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("message_retention_days"));
        if(!fieldValue.is_null())
        {
            int32_t refVal_message_retention_days;
            ok &= ModelBase::fromJson(fieldValue, refVal_message_retention_days);
            setMessageRetentionDays(refVal_message_retention_days);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("history_public_to_subscribers")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("history_public_to_subscribers"));
        if(!fieldValue.is_null())
        {
            bool refVal_history_public_to_subscribers;
            ok &= ModelBase::fromJson(fieldValue, refVal_history_public_to_subscribers);
            setHistoryPublicToSubscribers(refVal_history_public_to_subscribers);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("first_message_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("first_message_id"));
        if(!fieldValue.is_null())
        {
            int32_t refVal_first_message_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_first_message_id);
            setFirstMessageId(refVal_first_message_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("is_announcement_only")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("is_announcement_only"));
        if(!fieldValue.is_null())
        {
            bool refVal_is_announcement_only;
            ok &= ModelBase::fromJson(fieldValue, refVal_is_announcement_only);
            setIsAnnouncementOnly(refVal_is_announcement_only);
        }
    }
    return ok;
}

void BasicStreamBase::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_Stream_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("stream_id"), m_Stream_id));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("name"), m_Name));
    }
    if(m_DescriptionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("description"), m_Description));
    }
    if(m_Date_createdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("date_created"), m_Date_created));
    }
    if(m_Invite_onlyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("invite_only"), m_Invite_only));
    }
    if(m_Rendered_descriptionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("rendered_description"), m_Rendered_description));
    }
    if(m_Is_web_publicIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("is_web_public"), m_Is_web_public));
    }
    if(m_Stream_post_policyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("stream_post_policy"), m_Stream_post_policy));
    }
    if(m_Message_retention_daysIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("message_retention_days"), m_Message_retention_days));
    }
    if(m_History_public_to_subscribersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("history_public_to_subscribers"), m_History_public_to_subscribers));
    }
    if(m_First_message_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("first_message_id"), m_First_message_id));
    }
    if(m_Is_announcement_onlyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("is_announcement_only"), m_Is_announcement_only));
    }
}

bool BasicStreamBase::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("stream_id")))
    {
        int32_t refVal_stream_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("stream_id")), refVal_stream_id );
        setStreamId(refVal_stream_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("name")))
    {
        utility::string_t refVal_name;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("name")), refVal_name );
        setName(refVal_name);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("description")))
    {
        utility::string_t refVal_description;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("description")), refVal_description );
        setDescription(refVal_description);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("date_created")))
    {
        int32_t refVal_date_created;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("date_created")), refVal_date_created );
        setDateCreated(refVal_date_created);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("invite_only")))
    {
        bool refVal_invite_only;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("invite_only")), refVal_invite_only );
        setInviteOnly(refVal_invite_only);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("rendered_description")))
    {
        utility::string_t refVal_rendered_description;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("rendered_description")), refVal_rendered_description );
        setRenderedDescription(refVal_rendered_description);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("is_web_public")))
    {
        bool refVal_is_web_public;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("is_web_public")), refVal_is_web_public );
        setIsWebPublic(refVal_is_web_public);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("stream_post_policy")))
    {
        int32_t refVal_stream_post_policy;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("stream_post_policy")), refVal_stream_post_policy );
        setStreamPostPolicy(refVal_stream_post_policy);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("message_retention_days")))
    {
        int32_t refVal_message_retention_days;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("message_retention_days")), refVal_message_retention_days );
        setMessageRetentionDays(refVal_message_retention_days);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("history_public_to_subscribers")))
    {
        bool refVal_history_public_to_subscribers;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("history_public_to_subscribers")), refVal_history_public_to_subscribers );
        setHistoryPublicToSubscribers(refVal_history_public_to_subscribers);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("first_message_id")))
    {
        int32_t refVal_first_message_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("first_message_id")), refVal_first_message_id );
        setFirstMessageId(refVal_first_message_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("is_announcement_only")))
    {
        bool refVal_is_announcement_only;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("is_announcement_only")), refVal_is_announcement_only );
        setIsAnnouncementOnly(refVal_is_announcement_only);
    }
    return ok;
}

int32_t BasicStreamBase::getStreamId() const
{
    return m_Stream_id;
}

void BasicStreamBase::setStreamId(int32_t value)
{
    m_Stream_id = value;
    m_Stream_idIsSet = true;
}

bool BasicStreamBase::streamIdIsSet() const
{
    return m_Stream_idIsSet;
}

void BasicStreamBase::unsetStream_id()
{
    m_Stream_idIsSet = false;
}
utility::string_t BasicStreamBase::getName() const
{
    return m_Name;
}

void BasicStreamBase::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool BasicStreamBase::nameIsSet() const
{
    return m_NameIsSet;
}

void BasicStreamBase::unsetName()
{
    m_NameIsSet = false;
}
utility::string_t BasicStreamBase::getDescription() const
{
    return m_Description;
}

void BasicStreamBase::setDescription(const utility::string_t& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}

bool BasicStreamBase::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}

void BasicStreamBase::unsetDescription()
{
    m_DescriptionIsSet = false;
}
int32_t BasicStreamBase::getDateCreated() const
{
    return m_Date_created;
}

void BasicStreamBase::setDateCreated(int32_t value)
{
    m_Date_created = value;
    m_Date_createdIsSet = true;
}

bool BasicStreamBase::dateCreatedIsSet() const
{
    return m_Date_createdIsSet;
}

void BasicStreamBase::unsetDate_created()
{
    m_Date_createdIsSet = false;
}
bool BasicStreamBase::isInviteOnly() const
{
    return m_Invite_only;
}

void BasicStreamBase::setInviteOnly(bool value)
{
    m_Invite_only = value;
    m_Invite_onlyIsSet = true;
}

bool BasicStreamBase::inviteOnlyIsSet() const
{
    return m_Invite_onlyIsSet;
}

void BasicStreamBase::unsetInvite_only()
{
    m_Invite_onlyIsSet = false;
}
utility::string_t BasicStreamBase::getRenderedDescription() const
{
    return m_Rendered_description;
}

void BasicStreamBase::setRenderedDescription(const utility::string_t& value)
{
    m_Rendered_description = value;
    m_Rendered_descriptionIsSet = true;
}

bool BasicStreamBase::renderedDescriptionIsSet() const
{
    return m_Rendered_descriptionIsSet;
}

void BasicStreamBase::unsetRendered_description()
{
    m_Rendered_descriptionIsSet = false;
}
bool BasicStreamBase::isIsWebPublic() const
{
    return m_Is_web_public;
}

void BasicStreamBase::setIsWebPublic(bool value)
{
    m_Is_web_public = value;
    m_Is_web_publicIsSet = true;
}

bool BasicStreamBase::isWebPublicIsSet() const
{
    return m_Is_web_publicIsSet;
}

void BasicStreamBase::unsetIs_web_public()
{
    m_Is_web_publicIsSet = false;
}
int32_t BasicStreamBase::getStreamPostPolicy() const
{
    return m_Stream_post_policy;
}

void BasicStreamBase::setStreamPostPolicy(int32_t value)
{
    m_Stream_post_policy = value;
    m_Stream_post_policyIsSet = true;
}

bool BasicStreamBase::streamPostPolicyIsSet() const
{
    return m_Stream_post_policyIsSet;
}

void BasicStreamBase::unsetStream_post_policy()
{
    m_Stream_post_policyIsSet = false;
}
int32_t BasicStreamBase::getMessageRetentionDays() const
{
    return m_Message_retention_days;
}

void BasicStreamBase::setMessageRetentionDays(int32_t value)
{
    m_Message_retention_days = value;
    m_Message_retention_daysIsSet = true;
}

bool BasicStreamBase::messageRetentionDaysIsSet() const
{
    return m_Message_retention_daysIsSet;
}

void BasicStreamBase::unsetMessage_retention_days()
{
    m_Message_retention_daysIsSet = false;
}
bool BasicStreamBase::isHistoryPublicToSubscribers() const
{
    return m_History_public_to_subscribers;
}

void BasicStreamBase::setHistoryPublicToSubscribers(bool value)
{
    m_History_public_to_subscribers = value;
    m_History_public_to_subscribersIsSet = true;
}

bool BasicStreamBase::historyPublicToSubscribersIsSet() const
{
    return m_History_public_to_subscribersIsSet;
}

void BasicStreamBase::unsetHistory_public_to_subscribers()
{
    m_History_public_to_subscribersIsSet = false;
}
int32_t BasicStreamBase::getFirstMessageId() const
{
    return m_First_message_id;
}

void BasicStreamBase::setFirstMessageId(int32_t value)
{
    m_First_message_id = value;
    m_First_message_idIsSet = true;
}

bool BasicStreamBase::firstMessageIdIsSet() const
{
    return m_First_message_idIsSet;
}

void BasicStreamBase::unsetFirst_message_id()
{
    m_First_message_idIsSet = false;
}
bool BasicStreamBase::isIsAnnouncementOnly() const
{
    return m_Is_announcement_only;
}

void BasicStreamBase::setIsAnnouncementOnly(bool value)
{
    m_Is_announcement_only = value;
    m_Is_announcement_onlyIsSet = true;
}

bool BasicStreamBase::isAnnouncementOnlyIsSet() const
{
    return m_Is_announcement_onlyIsSet;
}

void BasicStreamBase::unsetIs_announcement_only()
{
    m_Is_announcement_onlyIsSet = false;
}
}
}
}
}

