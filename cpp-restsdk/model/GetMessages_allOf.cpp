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



#include "GetMessages_allOf.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




GetMessages_allOf::GetMessages_allOf()
{
    m_Avatar_urlIsSet = false;
    m_ClientIsSet = false;
    m_ContentIsSet = false;
    m_Content_typeIsSet = false;
    m_Display_recipientIsSet = false;
    m_IdIsSet = false;
    m_Is_me_messageIsSet = false;
    m_ReactionsIsSet = false;
    m_Recipient_idIsSet = false;
    m_Sender_emailIsSet = false;
    m_Sender_full_nameIsSet = false;
    m_Sender_idIsSet = false;
    m_Sender_realm_strIsSet = false;
    m_Stream_idIsSet = false;
    m_SubjectIsSet = false;
    m_Topic_linksIsSet = false;
    m_SubmessagesIsSet = false;
    m_TimestampIsSet = false;
    m_TypeIsSet = false;
    m_FlagsIsSet = false;
    m_Last_edit_timestamp = 0;
    m_Last_edit_timestampIsSet = false;
    m_Match_content = utility::conversions::to_string_t("");
    m_Match_contentIsSet = false;
    m_Match_subject = utility::conversions::to_string_t("");
    m_Match_subjectIsSet = false;
}

GetMessages_allOf::~GetMessages_allOf()
{
}

void GetMessages_allOf::validate()
{
    // TODO: implement validation
}

web::json::value GetMessages_allOf::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Avatar_urlIsSet)
    {
        val[utility::conversions::to_string_t("avatar_url")] = ModelBase::toJson(m_Avatar_url);
    }
    if(m_ClientIsSet)
    {
        val[utility::conversions::to_string_t("client")] = ModelBase::toJson(m_Client);
    }
    if(m_ContentIsSet)
    {
        val[utility::conversions::to_string_t("content")] = ModelBase::toJson(m_Content);
    }
    if(m_Content_typeIsSet)
    {
        val[utility::conversions::to_string_t("content_type")] = ModelBase::toJson(m_Content_type);
    }
    if(m_Display_recipientIsSet)
    {
        val[utility::conversions::to_string_t("display_recipient")] = ModelBase::toJson(m_Display_recipient);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t("id")] = ModelBase::toJson(m_Id);
    }
    if(m_Is_me_messageIsSet)
    {
        val[utility::conversions::to_string_t("is_me_message")] = ModelBase::toJson(m_Is_me_message);
    }
    if(m_ReactionsIsSet)
    {
        val[utility::conversions::to_string_t("reactions")] = ModelBase::toJson(m_Reactions);
    }
    if(m_Recipient_idIsSet)
    {
        val[utility::conversions::to_string_t("recipient_id")] = ModelBase::toJson(m_Recipient_id);
    }
    if(m_Sender_emailIsSet)
    {
        val[utility::conversions::to_string_t("sender_email")] = ModelBase::toJson(m_Sender_email);
    }
    if(m_Sender_full_nameIsSet)
    {
        val[utility::conversions::to_string_t("sender_full_name")] = ModelBase::toJson(m_Sender_full_name);
    }
    if(m_Sender_idIsSet)
    {
        val[utility::conversions::to_string_t("sender_id")] = ModelBase::toJson(m_Sender_id);
    }
    if(m_Sender_realm_strIsSet)
    {
        val[utility::conversions::to_string_t("sender_realm_str")] = ModelBase::toJson(m_Sender_realm_str);
    }
    if(m_Stream_idIsSet)
    {
        val[utility::conversions::to_string_t("stream_id")] = ModelBase::toJson(m_Stream_id);
    }
    if(m_SubjectIsSet)
    {
        val[utility::conversions::to_string_t("subject")] = ModelBase::toJson(m_Subject);
    }
    if(m_Topic_linksIsSet)
    {
        val[utility::conversions::to_string_t("topic_links")] = ModelBase::toJson(m_Topic_links);
    }
    if(m_SubmessagesIsSet)
    {
        val[utility::conversions::to_string_t("submessages")] = ModelBase::toJson(m_Submessages);
    }
    if(m_TimestampIsSet)
    {
        val[utility::conversions::to_string_t("timestamp")] = ModelBase::toJson(m_Timestamp);
    }
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t("type")] = ModelBase::toJson(m_Type);
    }
    if(m_FlagsIsSet)
    {
        val[utility::conversions::to_string_t("flags")] = ModelBase::toJson(m_Flags);
    }
    if(m_Last_edit_timestampIsSet)
    {
        val[utility::conversions::to_string_t("last_edit_timestamp")] = ModelBase::toJson(m_Last_edit_timestamp);
    }
    if(m_Match_contentIsSet)
    {
        val[utility::conversions::to_string_t("match_content")] = ModelBase::toJson(m_Match_content);
    }
    if(m_Match_subjectIsSet)
    {
        val[utility::conversions::to_string_t("match_subject")] = ModelBase::toJson(m_Match_subject);
    }

    return val;
}

bool GetMessages_allOf::fromJson(const web::json::value& val)
{
    bool ok = true;
    
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
    if(val.has_field(utility::conversions::to_string_t("client")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("client"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_client;
            ok &= ModelBase::fromJson(fieldValue, refVal_client);
            setClient(refVal_client);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("content")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("content"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_content;
            ok &= ModelBase::fromJson(fieldValue, refVal_content);
            setContent(refVal_content);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("content_type")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("content_type"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_content_type;
            ok &= ModelBase::fromJson(fieldValue, refVal_content_type);
            setContentType(refVal_content_type);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("display_recipient")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("display_recipient"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_display_recipient;
            ok &= ModelBase::fromJson(fieldValue, refVal_display_recipient);
            setDisplayRecipient(refVal_display_recipient);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("id"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_id);
            setId(refVal_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("is_me_message")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("is_me_message"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_is_me_message;
            ok &= ModelBase::fromJson(fieldValue, refVal_is_me_message);
            setIsMeMessage(refVal_is_me_message);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("reactions")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("reactions"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_reactions;
            ok &= ModelBase::fromJson(fieldValue, refVal_reactions);
            setReactions(refVal_reactions);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("recipient_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("recipient_id"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_recipient_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_recipient_id);
            setRecipientId(refVal_recipient_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("sender_email")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("sender_email"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_sender_email;
            ok &= ModelBase::fromJson(fieldValue, refVal_sender_email);
            setSenderEmail(refVal_sender_email);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("sender_full_name")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("sender_full_name"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_sender_full_name;
            ok &= ModelBase::fromJson(fieldValue, refVal_sender_full_name);
            setSenderFullName(refVal_sender_full_name);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("sender_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("sender_id"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_sender_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_sender_id);
            setSenderId(refVal_sender_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("sender_realm_str")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("sender_realm_str"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_sender_realm_str;
            ok &= ModelBase::fromJson(fieldValue, refVal_sender_realm_str);
            setSenderRealmStr(refVal_sender_realm_str);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("stream_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("stream_id"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_stream_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_stream_id);
            setStreamId(refVal_stream_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("subject")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("subject"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_subject;
            ok &= ModelBase::fromJson(fieldValue, refVal_subject);
            setSubject(refVal_subject);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("topic_links")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("topic_links"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_topic_links;
            ok &= ModelBase::fromJson(fieldValue, refVal_topic_links);
            setTopicLinks(refVal_topic_links);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("submessages")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("submessages"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_submessages;
            ok &= ModelBase::fromJson(fieldValue, refVal_submessages);
            setSubmessages(refVal_submessages);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("timestamp")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("timestamp"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_timestamp;
            ok &= ModelBase::fromJson(fieldValue, refVal_timestamp);
            setTimestamp(refVal_timestamp);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("type")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("type"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AnyType> refVal_type;
            ok &= ModelBase::fromJson(fieldValue, refVal_type);
            setType(refVal_type);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("flags")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("flags"));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_flags;
            ok &= ModelBase::fromJson(fieldValue, refVal_flags);
            setFlags(refVal_flags);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("last_edit_timestamp")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("last_edit_timestamp"));
        if(!fieldValue.is_null())
        {
            int32_t refVal_last_edit_timestamp;
            ok &= ModelBase::fromJson(fieldValue, refVal_last_edit_timestamp);
            setLastEditTimestamp(refVal_last_edit_timestamp);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("match_content")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("match_content"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_match_content;
            ok &= ModelBase::fromJson(fieldValue, refVal_match_content);
            setMatchContent(refVal_match_content);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("match_subject")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("match_subject"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_match_subject;
            ok &= ModelBase::fromJson(fieldValue, refVal_match_subject);
            setMatchSubject(refVal_match_subject);
        }
    }
    return ok;
}

void GetMessages_allOf::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_Avatar_urlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("avatar_url"), m_Avatar_url));
    }
    if(m_ClientIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("client"), m_Client));
    }
    if(m_ContentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("content"), m_Content));
    }
    if(m_Content_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("content_type"), m_Content_type));
    }
    if(m_Display_recipientIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("display_recipient"), m_Display_recipient));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("id"), m_Id));
    }
    if(m_Is_me_messageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("is_me_message"), m_Is_me_message));
    }
    if(m_ReactionsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("reactions"), m_Reactions));
    }
    if(m_Recipient_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("recipient_id"), m_Recipient_id));
    }
    if(m_Sender_emailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("sender_email"), m_Sender_email));
    }
    if(m_Sender_full_nameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("sender_full_name"), m_Sender_full_name));
    }
    if(m_Sender_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("sender_id"), m_Sender_id));
    }
    if(m_Sender_realm_strIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("sender_realm_str"), m_Sender_realm_str));
    }
    if(m_Stream_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("stream_id"), m_Stream_id));
    }
    if(m_SubjectIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("subject"), m_Subject));
    }
    if(m_Topic_linksIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("topic_links"), m_Topic_links));
    }
    if(m_SubmessagesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("submessages"), m_Submessages));
    }
    if(m_TimestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("timestamp"), m_Timestamp));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("type"), m_Type));
    }
    if(m_FlagsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("flags"), m_Flags));
    }
    if(m_Last_edit_timestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("last_edit_timestamp"), m_Last_edit_timestamp));
    }
    if(m_Match_contentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("match_content"), m_Match_content));
    }
    if(m_Match_subjectIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("match_subject"), m_Match_subject));
    }
}

bool GetMessages_allOf::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("avatar_url")))
    {
        std::shared_ptr<AnyType> refVal_avatar_url;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("avatar_url")), refVal_avatar_url );
        setAvatarUrl(refVal_avatar_url);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("client")))
    {
        std::shared_ptr<AnyType> refVal_client;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("client")), refVal_client );
        setClient(refVal_client);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("content")))
    {
        std::shared_ptr<AnyType> refVal_content;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("content")), refVal_content );
        setContent(refVal_content);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("content_type")))
    {
        std::shared_ptr<AnyType> refVal_content_type;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("content_type")), refVal_content_type );
        setContentType(refVal_content_type);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("display_recipient")))
    {
        std::shared_ptr<AnyType> refVal_display_recipient;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("display_recipient")), refVal_display_recipient );
        setDisplayRecipient(refVal_display_recipient);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("id")))
    {
        std::shared_ptr<AnyType> refVal_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("id")), refVal_id );
        setId(refVal_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("is_me_message")))
    {
        std::shared_ptr<AnyType> refVal_is_me_message;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("is_me_message")), refVal_is_me_message );
        setIsMeMessage(refVal_is_me_message);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("reactions")))
    {
        std::shared_ptr<AnyType> refVal_reactions;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("reactions")), refVal_reactions );
        setReactions(refVal_reactions);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("recipient_id")))
    {
        std::shared_ptr<AnyType> refVal_recipient_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("recipient_id")), refVal_recipient_id );
        setRecipientId(refVal_recipient_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("sender_email")))
    {
        std::shared_ptr<AnyType> refVal_sender_email;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("sender_email")), refVal_sender_email );
        setSenderEmail(refVal_sender_email);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("sender_full_name")))
    {
        std::shared_ptr<AnyType> refVal_sender_full_name;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("sender_full_name")), refVal_sender_full_name );
        setSenderFullName(refVal_sender_full_name);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("sender_id")))
    {
        std::shared_ptr<AnyType> refVal_sender_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("sender_id")), refVal_sender_id );
        setSenderId(refVal_sender_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("sender_realm_str")))
    {
        std::shared_ptr<AnyType> refVal_sender_realm_str;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("sender_realm_str")), refVal_sender_realm_str );
        setSenderRealmStr(refVal_sender_realm_str);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("stream_id")))
    {
        std::shared_ptr<AnyType> refVal_stream_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("stream_id")), refVal_stream_id );
        setStreamId(refVal_stream_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("subject")))
    {
        std::shared_ptr<AnyType> refVal_subject;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("subject")), refVal_subject );
        setSubject(refVal_subject);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("topic_links")))
    {
        std::shared_ptr<AnyType> refVal_topic_links;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("topic_links")), refVal_topic_links );
        setTopicLinks(refVal_topic_links);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("submessages")))
    {
        std::shared_ptr<AnyType> refVal_submessages;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("submessages")), refVal_submessages );
        setSubmessages(refVal_submessages);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("timestamp")))
    {
        std::shared_ptr<AnyType> refVal_timestamp;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("timestamp")), refVal_timestamp );
        setTimestamp(refVal_timestamp);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("type")))
    {
        std::shared_ptr<AnyType> refVal_type;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("type")), refVal_type );
        setType(refVal_type);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("flags")))
    {
        std::vector<utility::string_t> refVal_flags;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("flags")), refVal_flags );
        setFlags(refVal_flags);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("last_edit_timestamp")))
    {
        int32_t refVal_last_edit_timestamp;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("last_edit_timestamp")), refVal_last_edit_timestamp );
        setLastEditTimestamp(refVal_last_edit_timestamp);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("match_content")))
    {
        utility::string_t refVal_match_content;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("match_content")), refVal_match_content );
        setMatchContent(refVal_match_content);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("match_subject")))
    {
        utility::string_t refVal_match_subject;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("match_subject")), refVal_match_subject );
        setMatchSubject(refVal_match_subject);
    }
    return ok;
}

std::shared_ptr<AnyType> GetMessages_allOf::getAvatarUrl() const
{
    return m_Avatar_url;
}

void GetMessages_allOf::setAvatarUrl(const std::shared_ptr<AnyType>& value)
{
    m_Avatar_url = value;
    m_Avatar_urlIsSet = true;
}

bool GetMessages_allOf::avatarUrlIsSet() const
{
    return m_Avatar_urlIsSet;
}

void GetMessages_allOf::unsetAvatar_url()
{
    m_Avatar_urlIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getClient() const
{
    return m_Client;
}

void GetMessages_allOf::setClient(const std::shared_ptr<AnyType>& value)
{
    m_Client = value;
    m_ClientIsSet = true;
}

bool GetMessages_allOf::clientIsSet() const
{
    return m_ClientIsSet;
}

void GetMessages_allOf::unsetClient()
{
    m_ClientIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getContent() const
{
    return m_Content;
}

void GetMessages_allOf::setContent(const std::shared_ptr<AnyType>& value)
{
    m_Content = value;
    m_ContentIsSet = true;
}

bool GetMessages_allOf::contentIsSet() const
{
    return m_ContentIsSet;
}

void GetMessages_allOf::unsetContent()
{
    m_ContentIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getContentType() const
{
    return m_Content_type;
}

void GetMessages_allOf::setContentType(const std::shared_ptr<AnyType>& value)
{
    m_Content_type = value;
    m_Content_typeIsSet = true;
}

bool GetMessages_allOf::contentTypeIsSet() const
{
    return m_Content_typeIsSet;
}

void GetMessages_allOf::unsetContent_type()
{
    m_Content_typeIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getDisplayRecipient() const
{
    return m_Display_recipient;
}

void GetMessages_allOf::setDisplayRecipient(const std::shared_ptr<AnyType>& value)
{
    m_Display_recipient = value;
    m_Display_recipientIsSet = true;
}

bool GetMessages_allOf::displayRecipientIsSet() const
{
    return m_Display_recipientIsSet;
}

void GetMessages_allOf::unsetDisplay_recipient()
{
    m_Display_recipientIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getId() const
{
    return m_Id;
}

void GetMessages_allOf::setId(const std::shared_ptr<AnyType>& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool GetMessages_allOf::idIsSet() const
{
    return m_IdIsSet;
}

void GetMessages_allOf::unsetId()
{
    m_IdIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getIsMeMessage() const
{
    return m_Is_me_message;
}

void GetMessages_allOf::setIsMeMessage(const std::shared_ptr<AnyType>& value)
{
    m_Is_me_message = value;
    m_Is_me_messageIsSet = true;
}

bool GetMessages_allOf::isMeMessageIsSet() const
{
    return m_Is_me_messageIsSet;
}

void GetMessages_allOf::unsetIs_me_message()
{
    m_Is_me_messageIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getReactions() const
{
    return m_Reactions;
}

void GetMessages_allOf::setReactions(const std::shared_ptr<AnyType>& value)
{
    m_Reactions = value;
    m_ReactionsIsSet = true;
}

bool GetMessages_allOf::reactionsIsSet() const
{
    return m_ReactionsIsSet;
}

void GetMessages_allOf::unsetReactions()
{
    m_ReactionsIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getRecipientId() const
{
    return m_Recipient_id;
}

void GetMessages_allOf::setRecipientId(const std::shared_ptr<AnyType>& value)
{
    m_Recipient_id = value;
    m_Recipient_idIsSet = true;
}

bool GetMessages_allOf::recipientIdIsSet() const
{
    return m_Recipient_idIsSet;
}

void GetMessages_allOf::unsetRecipient_id()
{
    m_Recipient_idIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getSenderEmail() const
{
    return m_Sender_email;
}

void GetMessages_allOf::setSenderEmail(const std::shared_ptr<AnyType>& value)
{
    m_Sender_email = value;
    m_Sender_emailIsSet = true;
}

bool GetMessages_allOf::senderEmailIsSet() const
{
    return m_Sender_emailIsSet;
}

void GetMessages_allOf::unsetSender_email()
{
    m_Sender_emailIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getSenderFullName() const
{
    return m_Sender_full_name;
}

void GetMessages_allOf::setSenderFullName(const std::shared_ptr<AnyType>& value)
{
    m_Sender_full_name = value;
    m_Sender_full_nameIsSet = true;
}

bool GetMessages_allOf::senderFullNameIsSet() const
{
    return m_Sender_full_nameIsSet;
}

void GetMessages_allOf::unsetSender_full_name()
{
    m_Sender_full_nameIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getSenderId() const
{
    return m_Sender_id;
}

void GetMessages_allOf::setSenderId(const std::shared_ptr<AnyType>& value)
{
    m_Sender_id = value;
    m_Sender_idIsSet = true;
}

bool GetMessages_allOf::senderIdIsSet() const
{
    return m_Sender_idIsSet;
}

void GetMessages_allOf::unsetSender_id()
{
    m_Sender_idIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getSenderRealmStr() const
{
    return m_Sender_realm_str;
}

void GetMessages_allOf::setSenderRealmStr(const std::shared_ptr<AnyType>& value)
{
    m_Sender_realm_str = value;
    m_Sender_realm_strIsSet = true;
}

bool GetMessages_allOf::senderRealmStrIsSet() const
{
    return m_Sender_realm_strIsSet;
}

void GetMessages_allOf::unsetSender_realm_str()
{
    m_Sender_realm_strIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getStreamId() const
{
    return m_Stream_id;
}

void GetMessages_allOf::setStreamId(const std::shared_ptr<AnyType>& value)
{
    m_Stream_id = value;
    m_Stream_idIsSet = true;
}

bool GetMessages_allOf::streamIdIsSet() const
{
    return m_Stream_idIsSet;
}

void GetMessages_allOf::unsetStream_id()
{
    m_Stream_idIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getSubject() const
{
    return m_Subject;
}

void GetMessages_allOf::setSubject(const std::shared_ptr<AnyType>& value)
{
    m_Subject = value;
    m_SubjectIsSet = true;
}

bool GetMessages_allOf::subjectIsSet() const
{
    return m_SubjectIsSet;
}

void GetMessages_allOf::unsetSubject()
{
    m_SubjectIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getTopicLinks() const
{
    return m_Topic_links;
}

void GetMessages_allOf::setTopicLinks(const std::shared_ptr<AnyType>& value)
{
    m_Topic_links = value;
    m_Topic_linksIsSet = true;
}

bool GetMessages_allOf::topicLinksIsSet() const
{
    return m_Topic_linksIsSet;
}

void GetMessages_allOf::unsetTopic_links()
{
    m_Topic_linksIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getSubmessages() const
{
    return m_Submessages;
}

void GetMessages_allOf::setSubmessages(const std::shared_ptr<AnyType>& value)
{
    m_Submessages = value;
    m_SubmessagesIsSet = true;
}

bool GetMessages_allOf::submessagesIsSet() const
{
    return m_SubmessagesIsSet;
}

void GetMessages_allOf::unsetSubmessages()
{
    m_SubmessagesIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getTimestamp() const
{
    return m_Timestamp;
}

void GetMessages_allOf::setTimestamp(const std::shared_ptr<AnyType>& value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}

bool GetMessages_allOf::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void GetMessages_allOf::unsetTimestamp()
{
    m_TimestampIsSet = false;
}
std::shared_ptr<AnyType> GetMessages_allOf::getType() const
{
    return m_Type;
}

void GetMessages_allOf::setType(const std::shared_ptr<AnyType>& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool GetMessages_allOf::typeIsSet() const
{
    return m_TypeIsSet;
}

void GetMessages_allOf::unsetType()
{
    m_TypeIsSet = false;
}
std::vector<utility::string_t>& GetMessages_allOf::getFlags()
{
    return m_Flags;
}

void GetMessages_allOf::setFlags(const std::vector<utility::string_t>& value)
{
    m_Flags = value;
    m_FlagsIsSet = true;
}

bool GetMessages_allOf::flagsIsSet() const
{
    return m_FlagsIsSet;
}

void GetMessages_allOf::unsetFlags()
{
    m_FlagsIsSet = false;
}
int32_t GetMessages_allOf::getLastEditTimestamp() const
{
    return m_Last_edit_timestamp;
}

void GetMessages_allOf::setLastEditTimestamp(int32_t value)
{
    m_Last_edit_timestamp = value;
    m_Last_edit_timestampIsSet = true;
}

bool GetMessages_allOf::lastEditTimestampIsSet() const
{
    return m_Last_edit_timestampIsSet;
}

void GetMessages_allOf::unsetLast_edit_timestamp()
{
    m_Last_edit_timestampIsSet = false;
}
utility::string_t GetMessages_allOf::getMatchContent() const
{
    return m_Match_content;
}

void GetMessages_allOf::setMatchContent(const utility::string_t& value)
{
    m_Match_content = value;
    m_Match_contentIsSet = true;
}

bool GetMessages_allOf::matchContentIsSet() const
{
    return m_Match_contentIsSet;
}

void GetMessages_allOf::unsetMatch_content()
{
    m_Match_contentIsSet = false;
}
utility::string_t GetMessages_allOf::getMatchSubject() const
{
    return m_Match_subject;
}

void GetMessages_allOf::setMatchSubject(const utility::string_t& value)
{
    m_Match_subject = value;
    m_Match_subjectIsSet = true;
}

bool GetMessages_allOf::matchSubjectIsSet() const
{
    return m_Match_subjectIsSet;
}

void GetMessages_allOf::unsetMatch_subject()
{
    m_Match_subjectIsSet = false;
}
}
}
}
}


