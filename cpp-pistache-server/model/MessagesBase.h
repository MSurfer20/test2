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
 * MessagesBase.h
 *
 * Object containing details of the message. 
 */

#ifndef MessagesBase_H_
#define MessagesBase_H_


#include "OneOfstringarray.h"
#include "MessagesBase_topic_links.h"
#include <string>
#include <vector>
#include "EmojiReaction.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Object containing details of the message. 
/// </summary>
class  MessagesBase
{
public:
    MessagesBase();
    virtual ~MessagesBase() = default;


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

    bool operator==(const MessagesBase& rhs) const;
    bool operator!=(const MessagesBase& rhs) const;

    /////////////////////////////////////////////
    /// MessagesBase members

    /// <summary>
    /// The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user. 
    /// </summary>
    std::string getAvatarUrl() const;
    void setAvatarUrl(std::string const& value);
    bool avatarUrlIsSet() const;
    void unsetAvatar_url();
    /// <summary>
    /// A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message. 
    /// </summary>
    std::string getClient() const;
    void setClient(std::string const& value);
    bool clientIsSet() const;
    void unsetClient();
    /// <summary>
    /// The content/body of the message. 
    /// </summary>
    std::string getContent() const;
    void setContent(std::string const& value);
    bool contentIsSet() const;
    void unsetContent();
    /// <summary>
    /// The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set. 
    /// </summary>
    std::string getContentType() const;
    void setContentType(std::string const& value);
    bool contentTypeIsSet() const;
    void unsetContent_type();
    /// <summary>
    /// Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
    /// </summary>
    OneOfstringarray getDisplayRecipient() const;
    void setDisplayRecipient(OneOfstringarray const& value);
    bool displayRecipientIsSet() const;
    void unsetDisplay_recipient();
    /// <summary>
    /// The unique message ID.  Messages should always be displayed sorted by ID. 
    /// </summary>
    int32_t getId() const;
    void setId(int32_t const value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
    /// </summary>
    bool isIsMeMessage() const;
    void setIsMeMessage(bool const value);
    bool isMeMessageIsSet() const;
    void unsetIs_me_message();
    /// <summary>
    /// Data on any reactions to the message. 
    /// </summary>
    std::vector<EmojiReaction> getReactions() const;
    void setReactions(std::vector<EmojiReaction> const& value);
    bool reactionsIsSet() const;
    void unsetReactions();
    /// <summary>
    /// A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
    /// </summary>
    int32_t getRecipientId() const;
    void setRecipientId(int32_t const value);
    bool recipientIdIsSet() const;
    void unsetRecipient_id();
    /// <summary>
    /// The Zulip display email address of the message&#39;s sender. 
    /// </summary>
    std::string getSenderEmail() const;
    void setSenderEmail(std::string const& value);
    bool senderEmailIsSet() const;
    void unsetSender_email();
    /// <summary>
    /// The full name of the message&#39;s sender. 
    /// </summary>
    std::string getSenderFullName() const;
    void setSenderFullName(std::string const& value);
    bool senderFullNameIsSet() const;
    void unsetSender_full_name();
    /// <summary>
    /// The user ID of the message&#39;s sender. 
    /// </summary>
    int32_t getSenderId() const;
    void setSenderId(int32_t const value);
    bool senderIdIsSet() const;
    void unsetSender_id();
    /// <summary>
    /// A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;. 
    /// </summary>
    std::string getSenderRealmStr() const;
    void setSenderRealmStr(std::string const& value);
    bool senderRealmStrIsSet() const;
    void unsetSender_realm_str();
    /// <summary>
    /// Only present for stream messages; the ID of the stream. 
    /// </summary>
    int32_t getStreamId() const;
    void setStreamId(int32_t const value);
    bool streamIdIsSet() const;
    void unsetStream_id();
    /// <summary>
    /// The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change. 
    /// </summary>
    std::string getSubject() const;
    void setSubject(std::string const& value);
    bool subjectIsSet() const;
    void unsetSubject();
    /// <summary>
    /// Data on any links to be included in the &#x60;topic&#x60; line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message&#39;s topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called &#x60;subject_links&#x60;; clients are recommended to rename &#x60;subject_links&#x60; to &#x60;topic_links&#x60; if present for compatibility with older Zulip servers. 
    /// </summary>
    std::vector<MessagesBase_topic_links> getTopicLinks() const;
    void setTopicLinks(std::vector<MessagesBase_topic_links> const& value);
    bool topicLinksIsSet() const;
    void unsetTopic_links();
    /// <summary>
    /// Data used for certain experimental Zulip integrations. 
    /// </summary>
    std::vector<std::string> getSubmessages() const;
    void setSubmessages(std::vector<std::string> const& value);
    bool submessagesIsSet() const;
    void unsetSubmessages();
    /// <summary>
    /// The UNIX timestamp for when the message was sent, in UTC seconds. 
    /// </summary>
    int32_t getTimestamp() const;
    void setTimestamp(int32_t const value);
    bool timestampIsSet() const;
    void unsetTimestamp();
    /// <summary>
    /// The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;. 
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    bool typeIsSet() const;
    void unsetType();

    friend void to_json(nlohmann::json& j, const MessagesBase& o);
    friend void from_json(const nlohmann::json& j, MessagesBase& o);
protected:
    std::string m_Avatar_url;
    bool m_Avatar_urlIsSet;
    std::string m_Client;
    bool m_ClientIsSet;
    std::string m_Content;
    bool m_ContentIsSet;
    std::string m_Content_type;
    bool m_Content_typeIsSet;
    OneOfstringarray m_Display_recipient;
    bool m_Display_recipientIsSet;
    int32_t m_Id;
    bool m_IdIsSet;
    bool m_Is_me_message;
    bool m_Is_me_messageIsSet;
    std::vector<EmojiReaction> m_Reactions;
    bool m_ReactionsIsSet;
    int32_t m_Recipient_id;
    bool m_Recipient_idIsSet;
    std::string m_Sender_email;
    bool m_Sender_emailIsSet;
    std::string m_Sender_full_name;
    bool m_Sender_full_nameIsSet;
    int32_t m_Sender_id;
    bool m_Sender_idIsSet;
    std::string m_Sender_realm_str;
    bool m_Sender_realm_strIsSet;
    int32_t m_Stream_id;
    bool m_Stream_idIsSet;
    std::string m_Subject;
    bool m_SubjectIsSet;
    std::vector<MessagesBase_topic_links> m_Topic_links;
    bool m_Topic_linksIsSet;
    std::vector<std::string> m_Submessages;
    bool m_SubmessagesIsSet;
    int32_t m_Timestamp;
    bool m_TimestampIsSet;
    std::string m_Type;
    bool m_TypeIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* MessagesBase_H_ */
