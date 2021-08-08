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

/*
 * MessagesBase.h
 *
 * Object containing details of the message. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_MessagesBase_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_MessagesBase_H_


#include "../ModelBase.h"

#include "OneOfstringarray.h"
#include "MessagesBase_topic_links.h"
#include <cpprest/details/basic_types.h>
#include <vector>
#include "EmojiReaction.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// Object containing details of the message. 
/// </summary>
class  MessagesBase
    : public ModelBase
{
public:
    MessagesBase();
    virtual ~MessagesBase();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// MessagesBase members

    /// <summary>
    /// The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user. 
    /// </summary>
    utility::string_t getAvatarUrl() const;
    bool avatarUrlIsSet() const;
    void unsetAvatar_url();

    void setAvatarUrl(const utility::string_t& value);

    /// <summary>
    /// A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message. 
    /// </summary>
    utility::string_t getClient() const;
    bool clientIsSet() const;
    void unsetClient();

    void setClient(const utility::string_t& value);

    /// <summary>
    /// The content/body of the message. 
    /// </summary>
    utility::string_t getContent() const;
    bool contentIsSet() const;
    void unsetContent();

    void setContent(const utility::string_t& value);

    /// <summary>
    /// The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set. 
    /// </summary>
    utility::string_t getContentType() const;
    bool contentTypeIsSet() const;
    void unsetContent_type();

    void setContentType(const utility::string_t& value);

    /// <summary>
    /// Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
    /// </summary>
    std::shared_ptr<OneOfstringarray> getDisplayRecipient() const;
    bool displayRecipientIsSet() const;
    void unsetDisplay_recipient();

    void setDisplayRecipient(const std::shared_ptr<OneOfstringarray>& value);

    /// <summary>
    /// The unique message ID.  Messages should always be displayed sorted by ID. 
    /// </summary>
    int32_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(int32_t value);

    /// <summary>
    /// Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
    /// </summary>
    bool isIsMeMessage() const;
    bool isMeMessageIsSet() const;
    void unsetIs_me_message();

    void setIsMeMessage(bool value);

    /// <summary>
    /// Data on any reactions to the message. 
    /// </summary>
    std::vector<std::shared_ptr<EmojiReaction>>& getReactions();
    bool reactionsIsSet() const;
    void unsetReactions();

    void setReactions(const std::vector<std::shared_ptr<EmojiReaction>>& value);

    /// <summary>
    /// A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
    /// </summary>
    int32_t getRecipientId() const;
    bool recipientIdIsSet() const;
    void unsetRecipient_id();

    void setRecipientId(int32_t value);

    /// <summary>
    /// The Zulip display email address of the message&#39;s sender. 
    /// </summary>
    utility::string_t getSenderEmail() const;
    bool senderEmailIsSet() const;
    void unsetSender_email();

    void setSenderEmail(const utility::string_t& value);

    /// <summary>
    /// The full name of the message&#39;s sender. 
    /// </summary>
    utility::string_t getSenderFullName() const;
    bool senderFullNameIsSet() const;
    void unsetSender_full_name();

    void setSenderFullName(const utility::string_t& value);

    /// <summary>
    /// The user ID of the message&#39;s sender. 
    /// </summary>
    int32_t getSenderId() const;
    bool senderIdIsSet() const;
    void unsetSender_id();

    void setSenderId(int32_t value);

    /// <summary>
    /// A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;. 
    /// </summary>
    utility::string_t getSenderRealmStr() const;
    bool senderRealmStrIsSet() const;
    void unsetSender_realm_str();

    void setSenderRealmStr(const utility::string_t& value);

    /// <summary>
    /// Only present for stream messages; the ID of the stream. 
    /// </summary>
    int32_t getStreamId() const;
    bool streamIdIsSet() const;
    void unsetStream_id();

    void setStreamId(int32_t value);

    /// <summary>
    /// The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change. 
    /// </summary>
    utility::string_t getSubject() const;
    bool subjectIsSet() const;
    void unsetSubject();

    void setSubject(const utility::string_t& value);

    /// <summary>
    /// Data on any links to be included in the &#x60;topic&#x60; line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message&#39;s topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called &#x60;subject_links&#x60;; clients are recommended to rename &#x60;subject_links&#x60; to &#x60;topic_links&#x60; if present for compatibility with older Zulip servers. 
    /// </summary>
    std::vector<std::shared_ptr<MessagesBase_topic_links>>& getTopicLinks();
    bool topicLinksIsSet() const;
    void unsetTopic_links();

    void setTopicLinks(const std::vector<std::shared_ptr<MessagesBase_topic_links>>& value);

    /// <summary>
    /// Data used for certain experimental Zulip integrations. 
    /// </summary>
    std::vector<utility::string_t>& getSubmessages();
    bool submessagesIsSet() const;
    void unsetSubmessages();

    void setSubmessages(const std::vector<utility::string_t>& value);

    /// <summary>
    /// The UNIX timestamp for when the message was sent, in UTC seconds. 
    /// </summary>
    int32_t getTimestamp() const;
    bool timestampIsSet() const;
    void unsetTimestamp();

    void setTimestamp(int32_t value);

    /// <summary>
    /// The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;. 
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);


protected:
    utility::string_t m_Avatar_url;
    bool m_Avatar_urlIsSet;
    utility::string_t m_Client;
    bool m_ClientIsSet;
    utility::string_t m_Content;
    bool m_ContentIsSet;
    utility::string_t m_Content_type;
    bool m_Content_typeIsSet;
    std::shared_ptr<OneOfstringarray> m_Display_recipient;
    bool m_Display_recipientIsSet;
    int32_t m_Id;
    bool m_IdIsSet;
    bool m_Is_me_message;
    bool m_Is_me_messageIsSet;
    std::vector<std::shared_ptr<EmojiReaction>> m_Reactions;
    bool m_ReactionsIsSet;
    int32_t m_Recipient_id;
    bool m_Recipient_idIsSet;
    utility::string_t m_Sender_email;
    bool m_Sender_emailIsSet;
    utility::string_t m_Sender_full_name;
    bool m_Sender_full_nameIsSet;
    int32_t m_Sender_id;
    bool m_Sender_idIsSet;
    utility::string_t m_Sender_realm_str;
    bool m_Sender_realm_strIsSet;
    int32_t m_Stream_id;
    bool m_Stream_idIsSet;
    utility::string_t m_Subject;
    bool m_SubjectIsSet;
    std::vector<std::shared_ptr<MessagesBase_topic_links>> m_Topic_links;
    bool m_Topic_linksIsSet;
    std::vector<utility::string_t> m_Submessages;
    bool m_SubmessagesIsSet;
    int32_t m_Timestamp;
    bool m_TimestampIsSet;
    utility::string_t m_Type;
    bool m_TypeIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_MessagesBase_H_ */
