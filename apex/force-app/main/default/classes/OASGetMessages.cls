/*
 * Zulip REST API
 * Powerful open source group chat\n
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASGetMessages
 */
public class OASGetMessages implements OASMessagesBase, OASGetMessagesAllOf, OAS.MappedProperties {
    /**
     * Get avatarUrl
     * @return avatarUrl
     */
    public oas_any_type_not_mapped avatarUrl { get; set; }

    /**
     * Get client
     * @return client
     */
    public oas_any_type_not_mapped client { get; set; }

    /**
     * Get content
     * @return content
     */
    public oas_any_type_not_mapped content { get; set; }

    /**
     * Get contentType
     * @return contentType
     */
    public oas_any_type_not_mapped contentType { get; set; }

    /**
     * Get displayRecipient
     * @return displayRecipient
     */
    public oas_any_type_not_mapped displayRecipient { get; set; }

    /**
     * Get id
     * @return id
     */
    public oas_any_type_not_mapped id { get; set; }

    /**
     * Get isMeMessage
     * @return isMeMessage
     */
    public oas_any_type_not_mapped isMeMessage { get; set; }

    /**
     * Get reactions
     * @return reactions
     */
    public oas_any_type_not_mapped reactions { get; set; }

    /**
     * Get recipientId
     * @return recipientId
     */
    public oas_any_type_not_mapped recipientId { get; set; }

    /**
     * Get senderEmail
     * @return senderEmail
     */
    public oas_any_type_not_mapped senderEmail { get; set; }

    /**
     * Get senderFullName
     * @return senderFullName
     */
    public oas_any_type_not_mapped senderFullName { get; set; }

    /**
     * Get senderId
     * @return senderId
     */
    public oas_any_type_not_mapped senderId { get; set; }

    /**
     * Get senderRealmStr
     * @return senderRealmStr
     */
    public oas_any_type_not_mapped senderRealmStr { get; set; }

    /**
     * Get streamId
     * @return streamId
     */
    public oas_any_type_not_mapped streamId { get; set; }

    /**
     * Get subject
     * @return subject
     */
    public oas_any_type_not_mapped subject { get; set; }

    /**
     * Get topicLinks
     * @return topicLinks
     */
    public oas_any_type_not_mapped topicLinks { get; set; }

    /**
     * Get submessages
     * @return submessages
     */
    public oas_any_type_not_mapped submessages { get; set; }

    /**
     * Get timestamp
     * @return timestamp
     */
    public oas_any_type_not_mapped timestamp { get; set; }

    /**
     * Get type
     * @return type
     */
    public oas_any_type_not_mapped type { get; set; }

    /**
     * The user\'s [message flags][message-flags] for the message.\n\n[message-flags]: /api/update-message-flags#available-flags\n
     * @return flags
     */
    public List<String> flags { get; set; }

    /**
     * The UNIX timestamp for when the message was last edited,\nin UTC seconds.\n
     * @return lastEditTimestamp
     */
    public Integer lastEditTimestamp { get; set; }

    /**
     * Only present if keyword search was included among the narrow parameters.\nHTML content of a queried message that matches the narrow, with\n`<span class="highlight">` elements wrapping the matches for the\nsearch keywords.\n
     * @return matchContent
     */
    public String matchContent { get; set; }

    /**
     * Only present if keyword search was included among the narrow parameters.\nHTML-escaped topic of a queried message that matches the narrow, with\n`<span class="highlight">` elements wrapping the matches for the\nsearch keywords.\n
     * @return matchSubject
     */
    public String matchSubject { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'avatar_url' => 'avatarUrl',
        'content_type' => 'contentType',
        'display_recipient' => 'displayRecipient',
        'is_me_message' => 'isMeMessage',
        'recipient_id' => 'recipientId',
        'sender_email' => 'senderEmail',
        'sender_full_name' => 'senderFullName',
        'sender_id' => 'senderId',
        'sender_realm_str' => 'senderRealmStr',
        'stream_id' => 'streamId',
        'topic_links' => 'topicLinks',
        'last_edit_timestamp' => 'lastEditTimestamp',
        'match_content' => 'matchContent',
        'match_subject' => 'matchSubject'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'avatar_url' => 'avatarUrl',
        'content_type' => 'contentType',
        'display_recipient' => 'displayRecipient',
        'is_me_message' => 'isMeMessage',
        'recipient_id' => 'recipientId',
        'sender_email' => 'senderEmail',
        'sender_full_name' => 'senderFullName',
        'sender_id' => 'senderId',
        'sender_realm_str' => 'senderRealmStr',
        'stream_id' => 'streamId',
        'topic_links' => 'topicLinks',
        'last_edit_timestamp' => 'lastEditTimestamp',
        'match_content' => 'matchContent',
        'match_subject' => 'matchSubject'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'avatar_url' => 'avatarUrl',
        'content_type' => 'contentType',
        'display_recipient' => 'displayRecipient',
        'is_me_message' => 'isMeMessage',
        'recipient_id' => 'recipientId',
        'sender_email' => 'senderEmail',
        'sender_full_name' => 'senderFullName',
        'sender_id' => 'senderId',
        'sender_realm_str' => 'senderRealmStr',
        'stream_id' => 'streamId',
        'topic_links' => 'topicLinks',
        'last_edit_timestamp' => 'lastEditTimestamp',
        'match_content' => 'matchContent',
        'match_subject' => 'matchSubject'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'avatar_url' => 'avatarUrl',
        'content_type' => 'contentType',
        'display_recipient' => 'displayRecipient',
        'is_me_message' => 'isMeMessage',
        'recipient_id' => 'recipientId',
        'sender_email' => 'senderEmail',
        'sender_full_name' => 'senderFullName',
        'sender_id' => 'senderId',
        'sender_realm_str' => 'senderRealmStr',
        'stream_id' => 'streamId',
        'topic_links' => 'topicLinks',
        'last_edit_timestamp' => 'lastEditTimestamp',
        'match_content' => 'matchContent',
        'match_subject' => 'matchSubject'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'avatar_url' => 'avatarUrl',
        'content_type' => 'contentType',
        'display_recipient' => 'displayRecipient',
        'is_me_message' => 'isMeMessage',
        'recipient_id' => 'recipientId',
        'sender_email' => 'senderEmail',
        'sender_full_name' => 'senderFullName',
        'sender_id' => 'senderId',
        'sender_realm_str' => 'senderRealmStr',
        'stream_id' => 'streamId',
        'topic_links' => 'topicLinks',
        'last_edit_timestamp' => 'lastEditTimestamp',
        'match_content' => 'matchContent',
        'match_subject' => 'matchSubject'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'avatar_url' => 'avatarUrl',
        'content_type' => 'contentType',
        'display_recipient' => 'displayRecipient',
        'is_me_message' => 'isMeMessage',
        'recipient_id' => 'recipientId',
        'sender_email' => 'senderEmail',
        'sender_full_name' => 'senderFullName',
        'sender_id' => 'senderId',
        'sender_realm_str' => 'senderRealmStr',
        'stream_id' => 'streamId',
        'topic_links' => 'topicLinks',
        'last_edit_timestamp' => 'lastEditTimestamp',
        'match_content' => 'matchContent',
        'match_subject' => 'matchSubject'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'avatar_url' => 'avatarUrl',
        'content_type' => 'contentType',
        'display_recipient' => 'displayRecipient',
        'is_me_message' => 'isMeMessage',
        'recipient_id' => 'recipientId',
        'sender_email' => 'senderEmail',
        'sender_full_name' => 'senderFullName',
        'sender_id' => 'senderId',
        'sender_realm_str' => 'senderRealmStr',
        'stream_id' => 'streamId',
        'topic_links' => 'topicLinks',
        'last_edit_timestamp' => 'lastEditTimestamp',
        'match_content' => 'matchContent',
        'match_subject' => 'matchSubject'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'avatar_url' => 'avatarUrl',
        'content_type' => 'contentType',
        'display_recipient' => 'displayRecipient',
        'is_me_message' => 'isMeMessage',
        'recipient_id' => 'recipientId',
        'sender_email' => 'senderEmail',
        'sender_full_name' => 'senderFullName',
        'sender_id' => 'senderId',
        'sender_realm_str' => 'senderRealmStr',
        'stream_id' => 'streamId',
        'topic_links' => 'topicLinks',
        'last_edit_timestamp' => 'lastEditTimestamp',
        'match_content' => 'matchContent',
        'match_subject' => 'matchSubject'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'avatar_url' => 'avatarUrl',
        'content_type' => 'contentType',
        'display_recipient' => 'displayRecipient',
        'is_me_message' => 'isMeMessage',
        'recipient_id' => 'recipientId',
        'sender_email' => 'senderEmail',
        'sender_full_name' => 'senderFullName',
        'sender_id' => 'senderId',
        'sender_realm_str' => 'senderRealmStr',
        'stream_id' => 'streamId',
        'topic_links' => 'topicLinks',
        'last_edit_timestamp' => 'lastEditTimestamp',
        'match_content' => 'matchContent',
        'match_subject' => 'matchSubject'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'avatar_url' => 'avatarUrl',
        'content_type' => 'contentType',
        'display_recipient' => 'displayRecipient',
        'is_me_message' => 'isMeMessage',
        'recipient_id' => 'recipientId',
        'sender_email' => 'senderEmail',
        'sender_full_name' => 'senderFullName',
        'sender_id' => 'senderId',
        'sender_realm_str' => 'senderRealmStr',
        'stream_id' => 'streamId',
        'topic_links' => 'topicLinks',
        'last_edit_timestamp' => 'lastEditTimestamp',
        'match_content' => 'matchContent',
        'match_subject' => 'matchSubject'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'avatar_url' => 'avatarUrl',
        'content_type' => 'contentType',
        'display_recipient' => 'displayRecipient',
        'is_me_message' => 'isMeMessage',
        'recipient_id' => 'recipientId',
        'sender_email' => 'senderEmail',
        'sender_full_name' => 'senderFullName',
        'sender_id' => 'senderId',
        'sender_realm_str' => 'senderRealmStr',
        'stream_id' => 'streamId',
        'topic_links' => 'topicLinks',
        'last_edit_timestamp' => 'lastEditTimestamp',
        'match_content' => 'matchContent',
        'match_subject' => 'matchSubject'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'avatar_url' => 'avatarUrl',
        'content_type' => 'contentType',
        'display_recipient' => 'displayRecipient',
        'is_me_message' => 'isMeMessage',
        'recipient_id' => 'recipientId',
        'sender_email' => 'senderEmail',
        'sender_full_name' => 'senderFullName',
        'sender_id' => 'senderId',
        'sender_realm_str' => 'senderRealmStr',
        'stream_id' => 'streamId',
        'topic_links' => 'topicLinks',
        'last_edit_timestamp' => 'lastEditTimestamp',
        'match_content' => 'matchContent',
        'match_subject' => 'matchSubject'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'avatar_url' => 'avatarUrl',
        'content_type' => 'contentType',
        'display_recipient' => 'displayRecipient',
        'is_me_message' => 'isMeMessage',
        'recipient_id' => 'recipientId',
        'sender_email' => 'senderEmail',
        'sender_full_name' => 'senderFullName',
        'sender_id' => 'senderId',
        'sender_realm_str' => 'senderRealmStr',
        'stream_id' => 'streamId',
        'topic_links' => 'topicLinks',
        'last_edit_timestamp' => 'lastEditTimestamp',
        'match_content' => 'matchContent',
        'match_subject' => 'matchSubject'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'avatar_url' => 'avatarUrl',
        'content_type' => 'contentType',
        'display_recipient' => 'displayRecipient',
        'is_me_message' => 'isMeMessage',
        'recipient_id' => 'recipientId',
        'sender_email' => 'senderEmail',
        'sender_full_name' => 'senderFullName',
        'sender_id' => 'senderId',
        'sender_realm_str' => 'senderRealmStr',
        'stream_id' => 'streamId',
        'topic_links' => 'topicLinks',
        'last_edit_timestamp' => 'lastEditTimestamp',
        'match_content' => 'matchContent',
        'match_subject' => 'matchSubject'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASGetMessages() {
        flags = new List<String>();
    }

    public static OASGetMessages getExample() {
        OASGetMessages getMessages = new OASGetMessages();
          getMessages.avatarUrl = oas_any_type_not_mapped.getExample();
          getMessages.client = oas_any_type_not_mapped.getExample();
          getMessages.content = oas_any_type_not_mapped.getExample();
          getMessages.contentType = oas_any_type_not_mapped.getExample();
          getMessages.displayRecipient = oas_any_type_not_mapped.getExample();
          getMessages.id = oas_any_type_not_mapped.getExample();
          getMessages.isMeMessage = oas_any_type_not_mapped.getExample();
          getMessages.reactions = oas_any_type_not_mapped.getExample();
          getMessages.recipientId = oas_any_type_not_mapped.getExample();
          getMessages.senderEmail = oas_any_type_not_mapped.getExample();
          getMessages.senderFullName = oas_any_type_not_mapped.getExample();
          getMessages.senderId = oas_any_type_not_mapped.getExample();
          getMessages.senderRealmStr = oas_any_type_not_mapped.getExample();
          getMessages.streamId = oas_any_type_not_mapped.getExample();
          getMessages.subject = oas_any_type_not_mapped.getExample();
          getMessages.topicLinks = oas_any_type_not_mapped.getExample();
          getMessages.submessages = oas_any_type_not_mapped.getExample();
          getMessages.timestamp = oas_any_type_not_mapped.getExample();
          getMessages.type = oas_any_type_not_mapped.getExample();
          getMessages.flags = new List<String>{''};
          getMessages.lastEditTimestamp = 0;
          getMessages.matchContent = '';
          getMessages.matchSubject = '';
        return getMessages;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASGetMessages) {           
            OASGetMessages getMessages = (OASGetMessages) obj;
            return this.avatarUrl == getMessages.avatarUrl
                && this.client == getMessages.client
                && this.content == getMessages.content
                && this.contentType == getMessages.contentType
                && this.displayRecipient == getMessages.displayRecipient
                && this.id == getMessages.id
                && this.isMeMessage == getMessages.isMeMessage
                && this.reactions == getMessages.reactions
                && this.recipientId == getMessages.recipientId
                && this.senderEmail == getMessages.senderEmail
                && this.senderFullName == getMessages.senderFullName
                && this.senderId == getMessages.senderId
                && this.senderRealmStr == getMessages.senderRealmStr
                && this.streamId == getMessages.streamId
                && this.subject == getMessages.subject
                && this.topicLinks == getMessages.topicLinks
                && this.submessages == getMessages.submessages
                && this.timestamp == getMessages.timestamp
                && this.type == getMessages.type
                && this.flags == getMessages.flags
                && this.lastEditTimestamp == getMessages.lastEditTimestamp
                && this.matchContent == getMessages.matchContent
                && this.matchSubject == getMessages.matchSubject;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (avatarUrl == null ? 0 : System.hashCode(avatarUrl));
        hashCode = (17 * hashCode) + (client == null ? 0 : System.hashCode(client));
        hashCode = (17 * hashCode) + (content == null ? 0 : System.hashCode(content));
        hashCode = (17 * hashCode) + (contentType == null ? 0 : System.hashCode(contentType));
        hashCode = (17 * hashCode) + (displayRecipient == null ? 0 : System.hashCode(displayRecipient));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (isMeMessage == null ? 0 : System.hashCode(isMeMessage));
        hashCode = (17 * hashCode) + (reactions == null ? 0 : System.hashCode(reactions));
        hashCode = (17 * hashCode) + (recipientId == null ? 0 : System.hashCode(recipientId));
        hashCode = (17 * hashCode) + (senderEmail == null ? 0 : System.hashCode(senderEmail));
        hashCode = (17 * hashCode) + (senderFullName == null ? 0 : System.hashCode(senderFullName));
        hashCode = (17 * hashCode) + (senderId == null ? 0 : System.hashCode(senderId));
        hashCode = (17 * hashCode) + (senderRealmStr == null ? 0 : System.hashCode(senderRealmStr));
        hashCode = (17 * hashCode) + (streamId == null ? 0 : System.hashCode(streamId));
        hashCode = (17 * hashCode) + (subject == null ? 0 : System.hashCode(subject));
        hashCode = (17 * hashCode) + (topicLinks == null ? 0 : System.hashCode(topicLinks));
        hashCode = (17 * hashCode) + (submessages == null ? 0 : System.hashCode(submessages));
        hashCode = (17 * hashCode) + (timestamp == null ? 0 : System.hashCode(timestamp));
        hashCode = (17 * hashCode) + (type == null ? 0 : System.hashCode(type));
        hashCode = (17 * hashCode) + (flags == null ? 0 : System.hashCode(flags));
        hashCode = (17 * hashCode) + (lastEditTimestamp == null ? 0 : System.hashCode(lastEditTimestamp));
        hashCode = (17 * hashCode) + (matchContent == null ? 0 : System.hashCode(matchContent));
        hashCode = (17 * hashCode) + (matchSubject == null ? 0 : System.hashCode(matchSubject));
        return hashCode;
    }
}
