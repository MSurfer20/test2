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


#include "GetMessages.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GetMessages::GetMessages()
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
    m_Match_content = "";
    m_Match_contentIsSet = false;
    m_Match_subject = "";
    m_Match_subjectIsSet = false;
    
}

void GetMessages::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GetMessages::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GetMessages::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GetMessages" : pathPrefix;

                                                                                     
    if (flagsIsSet())
    {
        const std::vector<std::string>& value = m_Flags;
        const std::string currentValuePath = _pathPrefix + ".flags";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
                
    return success;
}

bool GetMessages::operator==(const GetMessages& rhs) const
{
    return
    
    
    
    ((!avatarUrlIsSet() && !rhs.avatarUrlIsSet()) || (avatarUrlIsSet() && rhs.avatarUrlIsSet() && getAvatarUrl() == rhs.getAvatarUrl())) &&
    
    
    ((!clientIsSet() && !rhs.clientIsSet()) || (clientIsSet() && rhs.clientIsSet() && getClient() == rhs.getClient())) &&
    
    
    ((!contentIsSet() && !rhs.contentIsSet()) || (contentIsSet() && rhs.contentIsSet() && getContent() == rhs.getContent())) &&
    
    
    ((!contentTypeIsSet() && !rhs.contentTypeIsSet()) || (contentTypeIsSet() && rhs.contentTypeIsSet() && getContentType() == rhs.getContentType())) &&
    
    
    ((!displayRecipientIsSet() && !rhs.displayRecipientIsSet()) || (displayRecipientIsSet() && rhs.displayRecipientIsSet() && getDisplayRecipient() == rhs.getDisplayRecipient())) &&
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    
    ((!isMeMessageIsSet() && !rhs.isMeMessageIsSet()) || (isMeMessageIsSet() && rhs.isMeMessageIsSet() && getIsMeMessage() == rhs.getIsMeMessage())) &&
    
    
    ((!reactionsIsSet() && !rhs.reactionsIsSet()) || (reactionsIsSet() && rhs.reactionsIsSet() && getReactions() == rhs.getReactions())) &&
    
    
    ((!recipientIdIsSet() && !rhs.recipientIdIsSet()) || (recipientIdIsSet() && rhs.recipientIdIsSet() && getRecipientId() == rhs.getRecipientId())) &&
    
    
    ((!senderEmailIsSet() && !rhs.senderEmailIsSet()) || (senderEmailIsSet() && rhs.senderEmailIsSet() && getSenderEmail() == rhs.getSenderEmail())) &&
    
    
    ((!senderFullNameIsSet() && !rhs.senderFullNameIsSet()) || (senderFullNameIsSet() && rhs.senderFullNameIsSet() && getSenderFullName() == rhs.getSenderFullName())) &&
    
    
    ((!senderIdIsSet() && !rhs.senderIdIsSet()) || (senderIdIsSet() && rhs.senderIdIsSet() && getSenderId() == rhs.getSenderId())) &&
    
    
    ((!senderRealmStrIsSet() && !rhs.senderRealmStrIsSet()) || (senderRealmStrIsSet() && rhs.senderRealmStrIsSet() && getSenderRealmStr() == rhs.getSenderRealmStr())) &&
    
    
    ((!streamIdIsSet() && !rhs.streamIdIsSet()) || (streamIdIsSet() && rhs.streamIdIsSet() && getStreamId() == rhs.getStreamId())) &&
    
    
    ((!subjectIsSet() && !rhs.subjectIsSet()) || (subjectIsSet() && rhs.subjectIsSet() && getSubject() == rhs.getSubject())) &&
    
    
    ((!topicLinksIsSet() && !rhs.topicLinksIsSet()) || (topicLinksIsSet() && rhs.topicLinksIsSet() && getTopicLinks() == rhs.getTopicLinks())) &&
    
    
    ((!submessagesIsSet() && !rhs.submessagesIsSet()) || (submessagesIsSet() && rhs.submessagesIsSet() && getSubmessages() == rhs.getSubmessages())) &&
    
    
    ((!timestampIsSet() && !rhs.timestampIsSet()) || (timestampIsSet() && rhs.timestampIsSet() && getTimestamp() == rhs.getTimestamp())) &&
    
    
    ((!typeIsSet() && !rhs.typeIsSet()) || (typeIsSet() && rhs.typeIsSet() && getType() == rhs.getType())) &&
    
    
    ((!flagsIsSet() && !rhs.flagsIsSet()) || (flagsIsSet() && rhs.flagsIsSet() && getFlags() == rhs.getFlags())) &&
    
    
    ((!lastEditTimestampIsSet() && !rhs.lastEditTimestampIsSet()) || (lastEditTimestampIsSet() && rhs.lastEditTimestampIsSet() && getLastEditTimestamp() == rhs.getLastEditTimestamp())) &&
    
    
    ((!matchContentIsSet() && !rhs.matchContentIsSet()) || (matchContentIsSet() && rhs.matchContentIsSet() && getMatchContent() == rhs.getMatchContent())) &&
    
    
    ((!matchSubjectIsSet() && !rhs.matchSubjectIsSet()) || (matchSubjectIsSet() && rhs.matchSubjectIsSet() && getMatchSubject() == rhs.getMatchSubject()))
    
    ;
}

bool GetMessages::operator!=(const GetMessages& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GetMessages& o)
{
    j = nlohmann::json();
    if(o.avatarUrlIsSet())
        j["avatar_url"] = o.m_Avatar_url;
    if(o.clientIsSet())
        j["client"] = o.m_Client;
    if(o.contentIsSet())
        j["content"] = o.m_Content;
    if(o.contentTypeIsSet())
        j["content_type"] = o.m_Content_type;
    if(o.displayRecipientIsSet())
        j["display_recipient"] = o.m_Display_recipient;
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.isMeMessageIsSet())
        j["is_me_message"] = o.m_Is_me_message;
    if(o.reactionsIsSet())
        j["reactions"] = o.m_Reactions;
    if(o.recipientIdIsSet())
        j["recipient_id"] = o.m_Recipient_id;
    if(o.senderEmailIsSet())
        j["sender_email"] = o.m_Sender_email;
    if(o.senderFullNameIsSet())
        j["sender_full_name"] = o.m_Sender_full_name;
    if(o.senderIdIsSet())
        j["sender_id"] = o.m_Sender_id;
    if(o.senderRealmStrIsSet())
        j["sender_realm_str"] = o.m_Sender_realm_str;
    if(o.streamIdIsSet())
        j["stream_id"] = o.m_Stream_id;
    if(o.subjectIsSet())
        j["subject"] = o.m_Subject;
    if(o.topicLinksIsSet())
        j["topic_links"] = o.m_Topic_links;
    if(o.submessagesIsSet())
        j["submessages"] = o.m_Submessages;
    if(o.timestampIsSet())
        j["timestamp"] = o.m_Timestamp;
    if(o.typeIsSet())
        j["type"] = o.m_Type;
    if(o.flagsIsSet() || !o.m_Flags.empty())
        j["flags"] = o.m_Flags;
    if(o.lastEditTimestampIsSet())
        j["last_edit_timestamp"] = o.m_Last_edit_timestamp;
    if(o.matchContentIsSet())
        j["match_content"] = o.m_Match_content;
    if(o.matchSubjectIsSet())
        j["match_subject"] = o.m_Match_subject;
    
}

void from_json(const nlohmann::json& j, GetMessages& o)
{
    if(j.find("avatar_url") != j.end())
    {
        j.at("avatar_url").get_to(o.m_Avatar_url);
        o.m_Avatar_urlIsSet = true;
    } 
    if(j.find("client") != j.end())
    {
        j.at("client").get_to(o.m_Client);
        o.m_ClientIsSet = true;
    } 
    if(j.find("content") != j.end())
    {
        j.at("content").get_to(o.m_Content);
        o.m_ContentIsSet = true;
    } 
    if(j.find("content_type") != j.end())
    {
        j.at("content_type").get_to(o.m_Content_type);
        o.m_Content_typeIsSet = true;
    } 
    if(j.find("display_recipient") != j.end())
    {
        j.at("display_recipient").get_to(o.m_Display_recipient);
        o.m_Display_recipientIsSet = true;
    } 
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    if(j.find("is_me_message") != j.end())
    {
        j.at("is_me_message").get_to(o.m_Is_me_message);
        o.m_Is_me_messageIsSet = true;
    } 
    if(j.find("reactions") != j.end())
    {
        j.at("reactions").get_to(o.m_Reactions);
        o.m_ReactionsIsSet = true;
    } 
    if(j.find("recipient_id") != j.end())
    {
        j.at("recipient_id").get_to(o.m_Recipient_id);
        o.m_Recipient_idIsSet = true;
    } 
    if(j.find("sender_email") != j.end())
    {
        j.at("sender_email").get_to(o.m_Sender_email);
        o.m_Sender_emailIsSet = true;
    } 
    if(j.find("sender_full_name") != j.end())
    {
        j.at("sender_full_name").get_to(o.m_Sender_full_name);
        o.m_Sender_full_nameIsSet = true;
    } 
    if(j.find("sender_id") != j.end())
    {
        j.at("sender_id").get_to(o.m_Sender_id);
        o.m_Sender_idIsSet = true;
    } 
    if(j.find("sender_realm_str") != j.end())
    {
        j.at("sender_realm_str").get_to(o.m_Sender_realm_str);
        o.m_Sender_realm_strIsSet = true;
    } 
    if(j.find("stream_id") != j.end())
    {
        j.at("stream_id").get_to(o.m_Stream_id);
        o.m_Stream_idIsSet = true;
    } 
    if(j.find("subject") != j.end())
    {
        j.at("subject").get_to(o.m_Subject);
        o.m_SubjectIsSet = true;
    } 
    if(j.find("topic_links") != j.end())
    {
        j.at("topic_links").get_to(o.m_Topic_links);
        o.m_Topic_linksIsSet = true;
    } 
    if(j.find("submessages") != j.end())
    {
        j.at("submessages").get_to(o.m_Submessages);
        o.m_SubmessagesIsSet = true;
    } 
    if(j.find("timestamp") != j.end())
    {
        j.at("timestamp").get_to(o.m_Timestamp);
        o.m_TimestampIsSet = true;
    } 
    if(j.find("type") != j.end())
    {
        j.at("type").get_to(o.m_Type);
        o.m_TypeIsSet = true;
    } 
    if(j.find("flags") != j.end())
    {
        j.at("flags").get_to(o.m_Flags);
        o.m_FlagsIsSet = true;
    } 
    if(j.find("last_edit_timestamp") != j.end())
    {
        j.at("last_edit_timestamp").get_to(o.m_Last_edit_timestamp);
        o.m_Last_edit_timestampIsSet = true;
    } 
    if(j.find("match_content") != j.end())
    {
        j.at("match_content").get_to(o.m_Match_content);
        o.m_Match_contentIsSet = true;
    } 
    if(j.find("match_subject") != j.end())
    {
        j.at("match_subject").get_to(o.m_Match_subject);
        o.m_Match_subjectIsSet = true;
    } 
    
}

AnyType GetMessages::getAvatarUrl() const
{
    return m_Avatar_url;
}
void GetMessages::setAvatarUrl(AnyType const& value)
{
    m_Avatar_url = value;
    m_Avatar_urlIsSet = true;
}
bool GetMessages::avatarUrlIsSet() const
{
    return m_Avatar_urlIsSet;
}
void GetMessages::unsetAvatar_url()
{
    m_Avatar_urlIsSet = false;
}
AnyType GetMessages::getClient() const
{
    return m_Client;
}
void GetMessages::setClient(AnyType const& value)
{
    m_Client = value;
    m_ClientIsSet = true;
}
bool GetMessages::clientIsSet() const
{
    return m_ClientIsSet;
}
void GetMessages::unsetClient()
{
    m_ClientIsSet = false;
}
AnyType GetMessages::getContent() const
{
    return m_Content;
}
void GetMessages::setContent(AnyType const& value)
{
    m_Content = value;
    m_ContentIsSet = true;
}
bool GetMessages::contentIsSet() const
{
    return m_ContentIsSet;
}
void GetMessages::unsetContent()
{
    m_ContentIsSet = false;
}
AnyType GetMessages::getContentType() const
{
    return m_Content_type;
}
void GetMessages::setContentType(AnyType const& value)
{
    m_Content_type = value;
    m_Content_typeIsSet = true;
}
bool GetMessages::contentTypeIsSet() const
{
    return m_Content_typeIsSet;
}
void GetMessages::unsetContent_type()
{
    m_Content_typeIsSet = false;
}
AnyType GetMessages::getDisplayRecipient() const
{
    return m_Display_recipient;
}
void GetMessages::setDisplayRecipient(AnyType const& value)
{
    m_Display_recipient = value;
    m_Display_recipientIsSet = true;
}
bool GetMessages::displayRecipientIsSet() const
{
    return m_Display_recipientIsSet;
}
void GetMessages::unsetDisplay_recipient()
{
    m_Display_recipientIsSet = false;
}
AnyType GetMessages::getId() const
{
    return m_Id;
}
void GetMessages::setId(AnyType const& value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool GetMessages::idIsSet() const
{
    return m_IdIsSet;
}
void GetMessages::unsetId()
{
    m_IdIsSet = false;
}
AnyType GetMessages::getIsMeMessage() const
{
    return m_Is_me_message;
}
void GetMessages::setIsMeMessage(AnyType const& value)
{
    m_Is_me_message = value;
    m_Is_me_messageIsSet = true;
}
bool GetMessages::isMeMessageIsSet() const
{
    return m_Is_me_messageIsSet;
}
void GetMessages::unsetIs_me_message()
{
    m_Is_me_messageIsSet = false;
}
AnyType GetMessages::getReactions() const
{
    return m_Reactions;
}
void GetMessages::setReactions(AnyType const& value)
{
    m_Reactions = value;
    m_ReactionsIsSet = true;
}
bool GetMessages::reactionsIsSet() const
{
    return m_ReactionsIsSet;
}
void GetMessages::unsetReactions()
{
    m_ReactionsIsSet = false;
}
AnyType GetMessages::getRecipientId() const
{
    return m_Recipient_id;
}
void GetMessages::setRecipientId(AnyType const& value)
{
    m_Recipient_id = value;
    m_Recipient_idIsSet = true;
}
bool GetMessages::recipientIdIsSet() const
{
    return m_Recipient_idIsSet;
}
void GetMessages::unsetRecipient_id()
{
    m_Recipient_idIsSet = false;
}
AnyType GetMessages::getSenderEmail() const
{
    return m_Sender_email;
}
void GetMessages::setSenderEmail(AnyType const& value)
{
    m_Sender_email = value;
    m_Sender_emailIsSet = true;
}
bool GetMessages::senderEmailIsSet() const
{
    return m_Sender_emailIsSet;
}
void GetMessages::unsetSender_email()
{
    m_Sender_emailIsSet = false;
}
AnyType GetMessages::getSenderFullName() const
{
    return m_Sender_full_name;
}
void GetMessages::setSenderFullName(AnyType const& value)
{
    m_Sender_full_name = value;
    m_Sender_full_nameIsSet = true;
}
bool GetMessages::senderFullNameIsSet() const
{
    return m_Sender_full_nameIsSet;
}
void GetMessages::unsetSender_full_name()
{
    m_Sender_full_nameIsSet = false;
}
AnyType GetMessages::getSenderId() const
{
    return m_Sender_id;
}
void GetMessages::setSenderId(AnyType const& value)
{
    m_Sender_id = value;
    m_Sender_idIsSet = true;
}
bool GetMessages::senderIdIsSet() const
{
    return m_Sender_idIsSet;
}
void GetMessages::unsetSender_id()
{
    m_Sender_idIsSet = false;
}
AnyType GetMessages::getSenderRealmStr() const
{
    return m_Sender_realm_str;
}
void GetMessages::setSenderRealmStr(AnyType const& value)
{
    m_Sender_realm_str = value;
    m_Sender_realm_strIsSet = true;
}
bool GetMessages::senderRealmStrIsSet() const
{
    return m_Sender_realm_strIsSet;
}
void GetMessages::unsetSender_realm_str()
{
    m_Sender_realm_strIsSet = false;
}
AnyType GetMessages::getStreamId() const
{
    return m_Stream_id;
}
void GetMessages::setStreamId(AnyType const& value)
{
    m_Stream_id = value;
    m_Stream_idIsSet = true;
}
bool GetMessages::streamIdIsSet() const
{
    return m_Stream_idIsSet;
}
void GetMessages::unsetStream_id()
{
    m_Stream_idIsSet = false;
}
AnyType GetMessages::getSubject() const
{
    return m_Subject;
}
void GetMessages::setSubject(AnyType const& value)
{
    m_Subject = value;
    m_SubjectIsSet = true;
}
bool GetMessages::subjectIsSet() const
{
    return m_SubjectIsSet;
}
void GetMessages::unsetSubject()
{
    m_SubjectIsSet = false;
}
AnyType GetMessages::getTopicLinks() const
{
    return m_Topic_links;
}
void GetMessages::setTopicLinks(AnyType const& value)
{
    m_Topic_links = value;
    m_Topic_linksIsSet = true;
}
bool GetMessages::topicLinksIsSet() const
{
    return m_Topic_linksIsSet;
}
void GetMessages::unsetTopic_links()
{
    m_Topic_linksIsSet = false;
}
AnyType GetMessages::getSubmessages() const
{
    return m_Submessages;
}
void GetMessages::setSubmessages(AnyType const& value)
{
    m_Submessages = value;
    m_SubmessagesIsSet = true;
}
bool GetMessages::submessagesIsSet() const
{
    return m_SubmessagesIsSet;
}
void GetMessages::unsetSubmessages()
{
    m_SubmessagesIsSet = false;
}
AnyType GetMessages::getTimestamp() const
{
    return m_Timestamp;
}
void GetMessages::setTimestamp(AnyType const& value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}
bool GetMessages::timestampIsSet() const
{
    return m_TimestampIsSet;
}
void GetMessages::unsetTimestamp()
{
    m_TimestampIsSet = false;
}
AnyType GetMessages::getType() const
{
    return m_Type;
}
void GetMessages::setType(AnyType const& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}
bool GetMessages::typeIsSet() const
{
    return m_TypeIsSet;
}
void GetMessages::unsetType()
{
    m_TypeIsSet = false;
}
std::vector<std::string> GetMessages::getFlags() const
{
    return m_Flags;
}
void GetMessages::setFlags(std::vector<std::string> const& value)
{
    m_Flags = value;
    m_FlagsIsSet = true;
}
bool GetMessages::flagsIsSet() const
{
    return m_FlagsIsSet;
}
void GetMessages::unsetFlags()
{
    m_FlagsIsSet = false;
}
int32_t GetMessages::getLastEditTimestamp() const
{
    return m_Last_edit_timestamp;
}
void GetMessages::setLastEditTimestamp(int32_t const value)
{
    m_Last_edit_timestamp = value;
    m_Last_edit_timestampIsSet = true;
}
bool GetMessages::lastEditTimestampIsSet() const
{
    return m_Last_edit_timestampIsSet;
}
void GetMessages::unsetLast_edit_timestamp()
{
    m_Last_edit_timestampIsSet = false;
}
std::string GetMessages::getMatchContent() const
{
    return m_Match_content;
}
void GetMessages::setMatchContent(std::string const& value)
{
    m_Match_content = value;
    m_Match_contentIsSet = true;
}
bool GetMessages::matchContentIsSet() const
{
    return m_Match_contentIsSet;
}
void GetMessages::unsetMatch_content()
{
    m_Match_contentIsSet = false;
}
std::string GetMessages::getMatchSubject() const
{
    return m_Match_subject;
}
void GetMessages::setMatchSubject(std::string const& value)
{
    m_Match_subject = value;
    m_Match_subjectIsSet = true;
}
bool GetMessages::matchSubjectIsSet() const
{
    return m_Match_subjectIsSet;
}
void GetMessages::unsetMatch_subject()
{
    m_Match_subjectIsSet = false;
}


} // namespace org::openapitools::server::model
