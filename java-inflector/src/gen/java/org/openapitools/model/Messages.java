package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessagesAllOf;
import org.openapitools.model.MessagesBase;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2021-08-08T20:41:39.775381Z[Etc/UTC]")
public class Messages   {
  @JsonProperty("avatar_url")
  private Object avatarUrl = null;

  @JsonProperty("client")
  private Object client = null;

  @JsonProperty("content")
  private Object content = null;

  @JsonProperty("content_type")
  private Object contentType = null;

  @JsonProperty("display_recipient")
  private Object displayRecipient = null;

  @JsonProperty("id")
  private Object id = null;

  @JsonProperty("is_me_message")
  private Object isMeMessage = null;

  @JsonProperty("reactions")
  private Object reactions = null;

  @JsonProperty("recipient_id")
  private Object recipientId = null;

  @JsonProperty("sender_email")
  private Object senderEmail = null;

  @JsonProperty("sender_full_name")
  private Object senderFullName = null;

  @JsonProperty("sender_id")
  private Object senderId = null;

  @JsonProperty("sender_realm_str")
  private Object senderRealmStr = null;

  @JsonProperty("stream_id")
  private Object streamId = null;

  @JsonProperty("subject")
  private Object subject = null;

  @JsonProperty("topic_links")
  private Object topicLinks = null;

  @JsonProperty("submessages")
  private Object submessages = null;

  @JsonProperty("timestamp")
  private Object timestamp = null;

  @JsonProperty("type")
  private Object type = null;

  /**
   **/
  public Messages avatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("avatar_url")
  public Object getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   **/
  public Messages client(Object client) {
    this.client = client;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("client")
  public Object getClient() {
    return client;
  }
  public void setClient(Object client) {
    this.client = client;
  }

  /**
   **/
  public Messages content(Object content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("content")
  public Object getContent() {
    return content;
  }
  public void setContent(Object content) {
    this.content = content;
  }

  /**
   **/
  public Messages contentType(Object contentType) {
    this.contentType = contentType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("content_type")
  public Object getContentType() {
    return contentType;
  }
  public void setContentType(Object contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  public Messages displayRecipient(Object displayRecipient) {
    this.displayRecipient = displayRecipient;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("display_recipient")
  public Object getDisplayRecipient() {
    return displayRecipient;
  }
  public void setDisplayRecipient(Object displayRecipient) {
    this.displayRecipient = displayRecipient;
  }

  /**
   **/
  public Messages id(Object id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Object getId() {
    return id;
  }
  public void setId(Object id) {
    this.id = id;
  }

  /**
   **/
  public Messages isMeMessage(Object isMeMessage) {
    this.isMeMessage = isMeMessage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_me_message")
  public Object getIsMeMessage() {
    return isMeMessage;
  }
  public void setIsMeMessage(Object isMeMessage) {
    this.isMeMessage = isMeMessage;
  }

  /**
   **/
  public Messages reactions(Object reactions) {
    this.reactions = reactions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("reactions")
  public Object getReactions() {
    return reactions;
  }
  public void setReactions(Object reactions) {
    this.reactions = reactions;
  }

  /**
   **/
  public Messages recipientId(Object recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("recipient_id")
  public Object getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(Object recipientId) {
    this.recipientId = recipientId;
  }

  /**
   **/
  public Messages senderEmail(Object senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sender_email")
  public Object getSenderEmail() {
    return senderEmail;
  }
  public void setSenderEmail(Object senderEmail) {
    this.senderEmail = senderEmail;
  }

  /**
   **/
  public Messages senderFullName(Object senderFullName) {
    this.senderFullName = senderFullName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sender_full_name")
  public Object getSenderFullName() {
    return senderFullName;
  }
  public void setSenderFullName(Object senderFullName) {
    this.senderFullName = senderFullName;
  }

  /**
   **/
  public Messages senderId(Object senderId) {
    this.senderId = senderId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sender_id")
  public Object getSenderId() {
    return senderId;
  }
  public void setSenderId(Object senderId) {
    this.senderId = senderId;
  }

  /**
   **/
  public Messages senderRealmStr(Object senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sender_realm_str")
  public Object getSenderRealmStr() {
    return senderRealmStr;
  }
  public void setSenderRealmStr(Object senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
  }

  /**
   **/
  public Messages streamId(Object streamId) {
    this.streamId = streamId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stream_id")
  public Object getStreamId() {
    return streamId;
  }
  public void setStreamId(Object streamId) {
    this.streamId = streamId;
  }

  /**
   **/
  public Messages subject(Object subject) {
    this.subject = subject;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("subject")
  public Object getSubject() {
    return subject;
  }
  public void setSubject(Object subject) {
    this.subject = subject;
  }

  /**
   **/
  public Messages topicLinks(Object topicLinks) {
    this.topicLinks = topicLinks;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("topic_links")
  public Object getTopicLinks() {
    return topicLinks;
  }
  public void setTopicLinks(Object topicLinks) {
    this.topicLinks = topicLinks;
  }

  /**
   **/
  public Messages submessages(Object submessages) {
    this.submessages = submessages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("submessages")
  public Object getSubmessages() {
    return submessages;
  }
  public void setSubmessages(Object submessages) {
    this.submessages = submessages;
  }

  /**
   **/
  public Messages timestamp(Object timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
  public Object getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Object timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  public Messages type(Object type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public Object getType() {
    return type;
  }
  public void setType(Object type) {
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
    Messages messages = (Messages) o;
    return Objects.equals(avatarUrl, messages.avatarUrl) &&
        Objects.equals(client, messages.client) &&
        Objects.equals(content, messages.content) &&
        Objects.equals(contentType, messages.contentType) &&
        Objects.equals(displayRecipient, messages.displayRecipient) &&
        Objects.equals(id, messages.id) &&
        Objects.equals(isMeMessage, messages.isMeMessage) &&
        Objects.equals(reactions, messages.reactions) &&
        Objects.equals(recipientId, messages.recipientId) &&
        Objects.equals(senderEmail, messages.senderEmail) &&
        Objects.equals(senderFullName, messages.senderFullName) &&
        Objects.equals(senderId, messages.senderId) &&
        Objects.equals(senderRealmStr, messages.senderRealmStr) &&
        Objects.equals(streamId, messages.streamId) &&
        Objects.equals(subject, messages.subject) &&
        Objects.equals(topicLinks, messages.topicLinks) &&
        Objects.equals(submessages, messages.submessages) &&
        Objects.equals(timestamp, messages.timestamp) &&
        Objects.equals(type, messages.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, client, content, contentType, displayRecipient, id, isMeMessage, reactions, recipientId, senderEmail, senderFullName, senderId, senderRealmStr, streamId, subject, topicLinks, submessages, timestamp, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Messages {\n");
    
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

