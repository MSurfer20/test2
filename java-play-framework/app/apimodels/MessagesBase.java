package apimodels;

import apimodels.EmojiReaction;
import apimodels.MessagesBaseTopicLinks;
import apimodels.OneOfstringarray;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Object containing details of the message. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MessagesBase   {
  @JsonProperty("avatar_url")
  
  private String avatarUrl;

  @JsonProperty("client")
  
  private String client;

  @JsonProperty("content")
  
  private String content;

  @JsonProperty("content_type")
  
  private String contentType;

  @JsonProperty("display_recipient")
  @Valid

  private OneOfstringarray displayRecipient;

  @JsonProperty("id")
  
  private Integer id;

  @JsonProperty("is_me_message")
  
  private Boolean isMeMessage;

  @JsonProperty("reactions")
  @Valid

  private List<EmojiReaction> reactions = null;

  @JsonProperty("recipient_id")
  
  private Integer recipientId;

  @JsonProperty("sender_email")
  
  private String senderEmail;

  @JsonProperty("sender_full_name")
  
  private String senderFullName;

  @JsonProperty("sender_id")
  
  private Integer senderId;

  @JsonProperty("sender_realm_str")
  
  private String senderRealmStr;

  @JsonProperty("stream_id")
  
  private Integer streamId;

  @JsonProperty("subject")
  
  private String subject;

  @JsonProperty("topic_links")
  @Valid

  private List<MessagesBaseTopicLinks> topicLinks = null;

  @JsonProperty("submessages")
  
  private List<String> submessages = null;

  @JsonProperty("timestamp")
  
  private Integer timestamp;

  @JsonProperty("type")
  
  private String type;

  public MessagesBase avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
   * @return avatarUrl
  **/
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public MessagesBase client(String client) {
    this.client = client;
    return this;
  }

   /**
   * A Zulip \"client\" string, describing what Zulip client sent the message. 
   * @return client
  **/
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public MessagesBase content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The content/body of the message. 
   * @return content
  **/
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public MessagesBase contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
   * @return contentType
  **/
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public MessagesBase displayRecipient(OneOfstringarray displayRecipient) {
    this.displayRecipient = displayRecipient;
    return this;
  }

   /**
   * Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
   * @return displayRecipient
  **/
  public OneOfstringarray getDisplayRecipient() {
    return displayRecipient;
  }

  public void setDisplayRecipient(OneOfstringarray displayRecipient) {
    this.displayRecipient = displayRecipient;
  }

  public MessagesBase id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique message ID.  Messages should always be displayed sorted by ID. 
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MessagesBase isMeMessage(Boolean isMeMessage) {
    this.isMeMessage = isMeMessage;
    return this;
  }

   /**
   * Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
   * @return isMeMessage
  **/
  public Boolean getIsMeMessage() {
    return isMeMessage;
  }

  public void setIsMeMessage(Boolean isMeMessage) {
    this.isMeMessage = isMeMessage;
  }

  public MessagesBase reactions(List<EmojiReaction> reactions) {
    this.reactions = reactions;
    return this;
  }

  public MessagesBase addReactionsItem(EmojiReaction reactionsItem) {
    if (reactions == null) {
      reactions = new ArrayList<>();
    }
    reactions.add(reactionsItem);
    return this;
  }

   /**
   * Data on any reactions to the message. 
   * @return reactions
  **/
  public List<EmojiReaction> getReactions() {
    return reactions;
  }

  public void setReactions(List<EmojiReaction> reactions) {
    this.reactions = reactions;
  }

  public MessagesBase recipientId(Integer recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
   * @return recipientId
  **/
  public Integer getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(Integer recipientId) {
    this.recipientId = recipientId;
  }

  public MessagesBase senderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

   /**
   * The Zulip display email address of the message's sender. 
   * @return senderEmail
  **/
  public String getSenderEmail() {
    return senderEmail;
  }

  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  public MessagesBase senderFullName(String senderFullName) {
    this.senderFullName = senderFullName;
    return this;
  }

   /**
   * The full name of the message's sender. 
   * @return senderFullName
  **/
  public String getSenderFullName() {
    return senderFullName;
  }

  public void setSenderFullName(String senderFullName) {
    this.senderFullName = senderFullName;
  }

  public MessagesBase senderId(Integer senderId) {
    this.senderId = senderId;
    return this;
  }

   /**
   * The user ID of the message's sender. 
   * @return senderId
  **/
  public Integer getSenderId() {
    return senderId;
  }

  public void setSenderId(Integer senderId) {
    this.senderId = senderId;
  }

  public MessagesBase senderRealmStr(String senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
    return this;
  }

   /**
   * A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
   * @return senderRealmStr
  **/
  public String getSenderRealmStr() {
    return senderRealmStr;
  }

  public void setSenderRealmStr(String senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
  }

  public MessagesBase streamId(Integer streamId) {
    this.streamId = streamId;
    return this;
  }

   /**
   * Only present for stream messages; the ID of the stream. 
   * @return streamId
  **/
  public Integer getStreamId() {
    return streamId;
  }

  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }

  public MessagesBase subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
   * @return subject
  **/
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public MessagesBase topicLinks(List<MessagesBaseTopicLinks> topicLinks) {
    this.topicLinks = topicLinks;
    return this;
  }

  public MessagesBase addTopicLinksItem(MessagesBaseTopicLinks topicLinksItem) {
    if (topicLinks == null) {
      topicLinks = new ArrayList<>();
    }
    topicLinks.add(topicLinksItem);
    return this;
  }

   /**
   * Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
   * @return topicLinks
  **/
  public List<MessagesBaseTopicLinks> getTopicLinks() {
    return topicLinks;
  }

  public void setTopicLinks(List<MessagesBaseTopicLinks> topicLinks) {
    this.topicLinks = topicLinks;
  }

  public MessagesBase submessages(List<String> submessages) {
    this.submessages = submessages;
    return this;
  }

  public MessagesBase addSubmessagesItem(String submessagesItem) {
    if (submessages == null) {
      submessages = new ArrayList<>();
    }
    submessages.add(submessagesItem);
    return this;
  }

   /**
   * Data used for certain experimental Zulip integrations. 
   * @return submessages
  **/
  public List<String> getSubmessages() {
    return submessages;
  }

  public void setSubmessages(List<String> submessages) {
    this.submessages = submessages;
  }

  public MessagesBase timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The UNIX timestamp for when the message was sent, in UTC seconds. 
   * @return timestamp
  **/
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public MessagesBase type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the message: `stream` or `private`. 
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagesBase messagesBase = (MessagesBase) o;
    return Objects.equals(avatarUrl, messagesBase.avatarUrl) &&
        Objects.equals(client, messagesBase.client) &&
        Objects.equals(content, messagesBase.content) &&
        Objects.equals(contentType, messagesBase.contentType) &&
        Objects.equals(displayRecipient, messagesBase.displayRecipient) &&
        Objects.equals(id, messagesBase.id) &&
        Objects.equals(isMeMessage, messagesBase.isMeMessage) &&
        Objects.equals(reactions, messagesBase.reactions) &&
        Objects.equals(recipientId, messagesBase.recipientId) &&
        Objects.equals(senderEmail, messagesBase.senderEmail) &&
        Objects.equals(senderFullName, messagesBase.senderFullName) &&
        Objects.equals(senderId, messagesBase.senderId) &&
        Objects.equals(senderRealmStr, messagesBase.senderRealmStr) &&
        Objects.equals(streamId, messagesBase.streamId) &&
        Objects.equals(subject, messagesBase.subject) &&
        Objects.equals(topicLinks, messagesBase.topicLinks) &&
        Objects.equals(submessages, messagesBase.submessages) &&
        Objects.equals(timestamp, messagesBase.timestamp) &&
        Objects.equals(type, messagesBase.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, client, content, contentType, displayRecipient, id, isMeMessage, reactions, recipientId, senderEmail, senderFullName, senderId, senderRealmStr, streamId, subject, topicLinks, submessages, timestamp, type);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagesBase {\n");
    
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    displayRecipient: ").append(toIndentedString(displayRecipient)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMeMessage: ").append(toIndentedString(isMeMessage)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    senderFullName: ").append(toIndentedString(senderFullName)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    senderRealmStr: ").append(toIndentedString(senderRealmStr)).append("\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    topicLinks: ").append(toIndentedString(topicLinks)).append("\n");
    sb.append("    submessages: ").append(toIndentedString(submessages)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

