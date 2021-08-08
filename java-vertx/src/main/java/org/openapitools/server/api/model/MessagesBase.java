package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.EmojiReaction;
import org.openapitools.server.api.model.MessagesBaseTopicLinks;
import org.openapitools.server.api.model.OneOfstringarray;

/**
 * Object containing details of the message. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessagesBase   {
  
  private String avatarUrl;
  private String client;
  private String content;
  private String contentType;
  private OneOfstringarray displayRecipient;
  private Integer id;
  private Boolean isMeMessage;
  private List<EmojiReaction> reactions = new ArrayList<>();
  private Integer recipientId;
  private String senderEmail;
  private String senderFullName;
  private Integer senderId;
  private String senderRealmStr;
  private Integer streamId;
  private String subject;
  private List<MessagesBaseTopicLinks> topicLinks = new ArrayList<>();
  private List<String> submessages = new ArrayList<>();
  private Integer timestamp;
  private String type;

  public MessagesBase () {

  }

  public MessagesBase (String avatarUrl, String client, String content, String contentType, OneOfstringarray displayRecipient, Integer id, Boolean isMeMessage, List<EmojiReaction> reactions, Integer recipientId, String senderEmail, String senderFullName, Integer senderId, String senderRealmStr, Integer streamId, String subject, List<MessagesBaseTopicLinks> topicLinks, List<String> submessages, Integer timestamp, String type) {
    this.avatarUrl = avatarUrl;
    this.client = client;
    this.content = content;
    this.contentType = contentType;
    this.displayRecipient = displayRecipient;
    this.id = id;
    this.isMeMessage = isMeMessage;
    this.reactions = reactions;
    this.recipientId = recipientId;
    this.senderEmail = senderEmail;
    this.senderFullName = senderFullName;
    this.senderId = senderId;
    this.senderRealmStr = senderRealmStr;
    this.streamId = streamId;
    this.subject = subject;
    this.topicLinks = topicLinks;
    this.submessages = submessages;
    this.timestamp = timestamp;
    this.type = type;
  }

    
  @JsonProperty("avatar_url")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

    
  @JsonProperty("client")
  public String getClient() {
    return client;
  }
  public void setClient(String client) {
    this.client = client;
  }

    
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

    
  @JsonProperty("content_type")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

    
  @JsonProperty("display_recipient")
  public OneOfstringarray getDisplayRecipient() {
    return displayRecipient;
  }
  public void setDisplayRecipient(OneOfstringarray displayRecipient) {
    this.displayRecipient = displayRecipient;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("is_me_message")
  public Boolean getIsMeMessage() {
    return isMeMessage;
  }
  public void setIsMeMessage(Boolean isMeMessage) {
    this.isMeMessage = isMeMessage;
  }

    
  @JsonProperty("reactions")
  public List<EmojiReaction> getReactions() {
    return reactions;
  }
  public void setReactions(List<EmojiReaction> reactions) {
    this.reactions = reactions;
  }

    
  @JsonProperty("recipient_id")
  public Integer getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(Integer recipientId) {
    this.recipientId = recipientId;
  }

    
  @JsonProperty("sender_email")
  public String getSenderEmail() {
    return senderEmail;
  }
  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

    
  @JsonProperty("sender_full_name")
  public String getSenderFullName() {
    return senderFullName;
  }
  public void setSenderFullName(String senderFullName) {
    this.senderFullName = senderFullName;
  }

    
  @JsonProperty("sender_id")
  public Integer getSenderId() {
    return senderId;
  }
  public void setSenderId(Integer senderId) {
    this.senderId = senderId;
  }

    
  @JsonProperty("sender_realm_str")
  public String getSenderRealmStr() {
    return senderRealmStr;
  }
  public void setSenderRealmStr(String senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
  }

    
  @JsonProperty("stream_id")
  public Integer getStreamId() {
    return streamId;
  }
  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }

    
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

    
  @JsonProperty("topic_links")
  public List<MessagesBaseTopicLinks> getTopicLinks() {
    return topicLinks;
  }
  public void setTopicLinks(List<MessagesBaseTopicLinks> topicLinks) {
    this.topicLinks = topicLinks;
  }

    
  @JsonProperty("submessages")
  public List<String> getSubmessages() {
    return submessages;
  }
  public void setSubmessages(List<String> submessages) {
    this.submessages = submessages;
  }

    
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

    
  @JsonProperty("type")
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
