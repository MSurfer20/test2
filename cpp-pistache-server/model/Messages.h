/**
* Zulip REST API
* Powerful open source group chat 
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * Messages.h
 *
 * 
 */

#ifndef Messages_H_
#define Messages_H_


#include "Messages_allOf.h"
#include "MessagesBase.h"
#include "AnyType.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  Messages
{
public:
    Messages();
    virtual ~Messages() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const Messages& rhs) const;
    bool operator!=(const Messages& rhs) const;

    /////////////////////////////////////////////
    /// Messages members

    /// <summary>
    /// 
    /// </summary>
    AnyType getAvatarUrl() const;
    void setAvatarUrl(AnyType const& value);
    bool avatarUrlIsSet() const;
    void unsetAvatar_url();
    /// <summary>
    /// 
    /// </summary>
    AnyType getClient() const;
    void setClient(AnyType const& value);
    bool clientIsSet() const;
    void unsetClient();
    /// <summary>
    /// 
    /// </summary>
    AnyType getContent() const;
    void setContent(AnyType const& value);
    bool contentIsSet() const;
    void unsetContent();
    /// <summary>
    /// 
    /// </summary>
    AnyType getContentType() const;
    void setContentType(AnyType const& value);
    bool contentTypeIsSet() const;
    void unsetContent_type();
    /// <summary>
    /// 
    /// </summary>
    AnyType getDisplayRecipient() const;
    void setDisplayRecipient(AnyType const& value);
    bool displayRecipientIsSet() const;
    void unsetDisplay_recipient();
    /// <summary>
    /// 
    /// </summary>
    AnyType getId() const;
    void setId(AnyType const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// 
    /// </summary>
    AnyType getIsMeMessage() const;
    void setIsMeMessage(AnyType const& value);
    bool isMeMessageIsSet() const;
    void unsetIs_me_message();
    /// <summary>
    /// 
    /// </summary>
    AnyType getReactions() const;
    void setReactions(AnyType const& value);
    bool reactionsIsSet() const;
    void unsetReactions();
    /// <summary>
    /// 
    /// </summary>
    AnyType getRecipientId() const;
    void setRecipientId(AnyType const& value);
    bool recipientIdIsSet() const;
    void unsetRecipient_id();
    /// <summary>
    /// 
    /// </summary>
    AnyType getSenderEmail() const;
    void setSenderEmail(AnyType const& value);
    bool senderEmailIsSet() const;
    void unsetSender_email();
    /// <summary>
    /// 
    /// </summary>
    AnyType getSenderFullName() const;
    void setSenderFullName(AnyType const& value);
    bool senderFullNameIsSet() const;
    void unsetSender_full_name();
    /// <summary>
    /// 
    /// </summary>
    AnyType getSenderId() const;
    void setSenderId(AnyType const& value);
    bool senderIdIsSet() const;
    void unsetSender_id();
    /// <summary>
    /// 
    /// </summary>
    AnyType getSenderRealmStr() const;
    void setSenderRealmStr(AnyType const& value);
    bool senderRealmStrIsSet() const;
    void unsetSender_realm_str();
    /// <summary>
    /// 
    /// </summary>
    AnyType getStreamId() const;
    void setStreamId(AnyType const& value);
    bool streamIdIsSet() const;
    void unsetStream_id();
    /// <summary>
    /// 
    /// </summary>
    AnyType getSubject() const;
    void setSubject(AnyType const& value);
    bool subjectIsSet() const;
    void unsetSubject();
    /// <summary>
    /// 
    /// </summary>
    AnyType getTopicLinks() const;
    void setTopicLinks(AnyType const& value);
    bool topicLinksIsSet() const;
    void unsetTopic_links();
    /// <summary>
    /// 
    /// </summary>
    AnyType getSubmessages() const;
    void setSubmessages(AnyType const& value);
    bool submessagesIsSet() const;
    void unsetSubmessages();
    /// <summary>
    /// 
    /// </summary>
    AnyType getTimestamp() const;
    void setTimestamp(AnyType const& value);
    bool timestampIsSet() const;
    void unsetTimestamp();
    /// <summary>
    /// 
    /// </summary>
    AnyType getType() const;
    void setType(AnyType const& value);
    bool typeIsSet() const;
    void unsetType();

    friend void to_json(nlohmann::json& j, const Messages& o);
    friend void from_json(const nlohmann::json& j, Messages& o);
protected:
    AnyType m_Avatar_url;
    bool m_Avatar_urlIsSet;
    AnyType m_Client;
    bool m_ClientIsSet;
    AnyType m_Content;
    bool m_ContentIsSet;
    AnyType m_Content_type;
    bool m_Content_typeIsSet;
    AnyType m_Display_recipient;
    bool m_Display_recipientIsSet;
    AnyType m_Id;
    bool m_IdIsSet;
    AnyType m_Is_me_message;
    bool m_Is_me_messageIsSet;
    AnyType m_Reactions;
    bool m_ReactionsIsSet;
    AnyType m_Recipient_id;
    bool m_Recipient_idIsSet;
    AnyType m_Sender_email;
    bool m_Sender_emailIsSet;
    AnyType m_Sender_full_name;
    bool m_Sender_full_nameIsSet;
    AnyType m_Sender_id;
    bool m_Sender_idIsSet;
    AnyType m_Sender_realm_str;
    bool m_Sender_realm_strIsSet;
    AnyType m_Stream_id;
    bool m_Stream_idIsSet;
    AnyType m_Subject;
    bool m_SubjectIsSet;
    AnyType m_Topic_links;
    bool m_Topic_linksIsSet;
    AnyType m_Submessages;
    bool m_SubmessagesIsSet;
    AnyType m_Timestamp;
    bool m_TimestampIsSet;
    AnyType m_Type;
    bool m_TypeIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* Messages_H_ */