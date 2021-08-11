package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessagesAllOf;
import org.openapitools.model.MessagesBase;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen")
public class Messages   {
  
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

  /**
   **/
  
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

