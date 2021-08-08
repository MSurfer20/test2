package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMessagesAllOf   {
  
  private Object avatarUrl = null;
  private Object client = null;
  private Object content = null;
  private Object contentType = null;
  private Object displayRecipient = null;
  private Object id = null;
  private Object isMeMessage = null;
  private Object reactions = null;
  private Object recipientId = null;
  private Object senderEmail = null;
  private Object senderFullName = null;
  private Object senderId = null;
  private Object senderRealmStr = null;
  private Object streamId = null;
  private Object subject = null;
  private Object topicLinks = null;
  private Object submessages = null;
  private Object timestamp = null;
  private Object type = null;
  private List<String> flags = new ArrayList<>();
  private Integer lastEditTimestamp;
  private String matchContent;
  private String matchSubject;

  public GetMessagesAllOf () {

  }

  public GetMessagesAllOf (Object avatarUrl, Object client, Object content, Object contentType, Object displayRecipient, Object id, Object isMeMessage, Object reactions, Object recipientId, Object senderEmail, Object senderFullName, Object senderId, Object senderRealmStr, Object streamId, Object subject, Object topicLinks, Object submessages, Object timestamp, Object type, List<String> flags, Integer lastEditTimestamp, String matchContent, String matchSubject) {
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
    this.flags = flags;
    this.lastEditTimestamp = lastEditTimestamp;
    this.matchContent = matchContent;
    this.matchSubject = matchSubject;
  }

    
  @JsonProperty("avatar_url")
  public Object getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

    
  @JsonProperty("client")
  public Object getClient() {
    return client;
  }
  public void setClient(Object client) {
    this.client = client;
  }

    
  @JsonProperty("content")
  public Object getContent() {
    return content;
  }
  public void setContent(Object content) {
    this.content = content;
  }

    
  @JsonProperty("content_type")
  public Object getContentType() {
    return contentType;
  }
  public void setContentType(Object contentType) {
    this.contentType = contentType;
  }

    
  @JsonProperty("display_recipient")
  public Object getDisplayRecipient() {
    return displayRecipient;
  }
  public void setDisplayRecipient(Object displayRecipient) {
    this.displayRecipient = displayRecipient;
  }

    
  @JsonProperty("id")
  public Object getId() {
    return id;
  }
  public void setId(Object id) {
    this.id = id;
  }

    
  @JsonProperty("is_me_message")
  public Object getIsMeMessage() {
    return isMeMessage;
  }
  public void setIsMeMessage(Object isMeMessage) {
    this.isMeMessage = isMeMessage;
  }

    
  @JsonProperty("reactions")
  public Object getReactions() {
    return reactions;
  }
  public void setReactions(Object reactions) {
    this.reactions = reactions;
  }

    
  @JsonProperty("recipient_id")
  public Object getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(Object recipientId) {
    this.recipientId = recipientId;
  }

    
  @JsonProperty("sender_email")
  public Object getSenderEmail() {
    return senderEmail;
  }
  public void setSenderEmail(Object senderEmail) {
    this.senderEmail = senderEmail;
  }

    
  @JsonProperty("sender_full_name")
  public Object getSenderFullName() {
    return senderFullName;
  }
  public void setSenderFullName(Object senderFullName) {
    this.senderFullName = senderFullName;
  }

    
  @JsonProperty("sender_id")
  public Object getSenderId() {
    return senderId;
  }
  public void setSenderId(Object senderId) {
    this.senderId = senderId;
  }

    
  @JsonProperty("sender_realm_str")
  public Object getSenderRealmStr() {
    return senderRealmStr;
  }
  public void setSenderRealmStr(Object senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
  }

    
  @JsonProperty("stream_id")
  public Object getStreamId() {
    return streamId;
  }
  public void setStreamId(Object streamId) {
    this.streamId = streamId;
  }

    
  @JsonProperty("subject")
  public Object getSubject() {
    return subject;
  }
  public void setSubject(Object subject) {
    this.subject = subject;
  }

    
  @JsonProperty("topic_links")
  public Object getTopicLinks() {
    return topicLinks;
  }
  public void setTopicLinks(Object topicLinks) {
    this.topicLinks = topicLinks;
  }

    
  @JsonProperty("submessages")
  public Object getSubmessages() {
    return submessages;
  }
  public void setSubmessages(Object submessages) {
    this.submessages = submessages;
  }

    
  @JsonProperty("timestamp")
  public Object getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Object timestamp) {
    this.timestamp = timestamp;
  }

    
  @JsonProperty("type")
  public Object getType() {
    return type;
  }
  public void setType(Object type) {
    this.type = type;
  }

    
  @JsonProperty("flags")
  public List<String> getFlags() {
    return flags;
  }
  public void setFlags(List<String> flags) {
    this.flags = flags;
  }

    
  @JsonProperty("last_edit_timestamp")
  public Integer getLastEditTimestamp() {
    return lastEditTimestamp;
  }
  public void setLastEditTimestamp(Integer lastEditTimestamp) {
    this.lastEditTimestamp = lastEditTimestamp;
  }

    
  @JsonProperty("match_content")
  public String getMatchContent() {
    return matchContent;
  }
  public void setMatchContent(String matchContent) {
    this.matchContent = matchContent;
  }

    
  @JsonProperty("match_subject")
  public String getMatchSubject() {
    return matchSubject;
  }
  public void setMatchSubject(String matchSubject) {
    this.matchSubject = matchSubject;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMessagesAllOf getMessagesAllOf = (GetMessagesAllOf) o;
    return Objects.equals(avatarUrl, getMessagesAllOf.avatarUrl) &&
        Objects.equals(client, getMessagesAllOf.client) &&
        Objects.equals(content, getMessagesAllOf.content) &&
        Objects.equals(contentType, getMessagesAllOf.contentType) &&
        Objects.equals(displayRecipient, getMessagesAllOf.displayRecipient) &&
        Objects.equals(id, getMessagesAllOf.id) &&
        Objects.equals(isMeMessage, getMessagesAllOf.isMeMessage) &&
        Objects.equals(reactions, getMessagesAllOf.reactions) &&
        Objects.equals(recipientId, getMessagesAllOf.recipientId) &&
        Objects.equals(senderEmail, getMessagesAllOf.senderEmail) &&
        Objects.equals(senderFullName, getMessagesAllOf.senderFullName) &&
        Objects.equals(senderId, getMessagesAllOf.senderId) &&
        Objects.equals(senderRealmStr, getMessagesAllOf.senderRealmStr) &&
        Objects.equals(streamId, getMessagesAllOf.streamId) &&
        Objects.equals(subject, getMessagesAllOf.subject) &&
        Objects.equals(topicLinks, getMessagesAllOf.topicLinks) &&
        Objects.equals(submessages, getMessagesAllOf.submessages) &&
        Objects.equals(timestamp, getMessagesAllOf.timestamp) &&
        Objects.equals(type, getMessagesAllOf.type) &&
        Objects.equals(flags, getMessagesAllOf.flags) &&
        Objects.equals(lastEditTimestamp, getMessagesAllOf.lastEditTimestamp) &&
        Objects.equals(matchContent, getMessagesAllOf.matchContent) &&
        Objects.equals(matchSubject, getMessagesAllOf.matchSubject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, client, content, contentType, displayRecipient, id, isMeMessage, reactions, recipientId, senderEmail, senderFullName, senderId, senderRealmStr, streamId, subject, topicLinks, submessages, timestamp, type, flags, lastEditTimestamp, matchContent, matchSubject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMessagesAllOf {\n");
    
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
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    lastEditTimestamp: ").append(toIndentedString(lastEditTimestamp)).append("\n");
    sb.append("    matchContent: ").append(toIndentedString(matchContent)).append("\n");
    sb.append("    matchSubject: ").append(toIndentedString(matchSubject)).append("\n");
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
