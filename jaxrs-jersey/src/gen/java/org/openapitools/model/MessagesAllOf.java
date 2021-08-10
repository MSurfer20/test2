/*
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * MessagesAllOf
 */
@JsonPropertyOrder({
  MessagesAllOf.JSON_PROPERTY_AVATAR_URL,
  MessagesAllOf.JSON_PROPERTY_CLIENT,
  MessagesAllOf.JSON_PROPERTY_CONTENT,
  MessagesAllOf.JSON_PROPERTY_CONTENT_TYPE,
  MessagesAllOf.JSON_PROPERTY_DISPLAY_RECIPIENT,
  MessagesAllOf.JSON_PROPERTY_ID,
  MessagesAllOf.JSON_PROPERTY_IS_ME_MESSAGE,
  MessagesAllOf.JSON_PROPERTY_REACTIONS,
  MessagesAllOf.JSON_PROPERTY_RECIPIENT_ID,
  MessagesAllOf.JSON_PROPERTY_SENDER_EMAIL,
  MessagesAllOf.JSON_PROPERTY_SENDER_FULL_NAME,
  MessagesAllOf.JSON_PROPERTY_SENDER_ID,
  MessagesAllOf.JSON_PROPERTY_SENDER_REALM_STR,
  MessagesAllOf.JSON_PROPERTY_STREAM_ID,
  MessagesAllOf.JSON_PROPERTY_SUBJECT,
  MessagesAllOf.JSON_PROPERTY_TOPIC_LINKS,
  MessagesAllOf.JSON_PROPERTY_SUBMESSAGES,
  MessagesAllOf.JSON_PROPERTY_TIMESTAMP,
  MessagesAllOf.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class MessagesAllOf   {
  public static final String JSON_PROPERTY_AVATAR_URL = "avatar_url";
  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  private Object avatarUrl = null;

  public static final String JSON_PROPERTY_CLIENT = "client";
  @JsonProperty(JSON_PROPERTY_CLIENT)
  private Object client = null;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @JsonProperty(JSON_PROPERTY_CONTENT)
  private Object content = null;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "content_type";
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  private Object contentType = null;

  public static final String JSON_PROPERTY_DISPLAY_RECIPIENT = "display_recipient";
  @JsonProperty(JSON_PROPERTY_DISPLAY_RECIPIENT)
  private Object displayRecipient = null;

  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private Object id = null;

  public static final String JSON_PROPERTY_IS_ME_MESSAGE = "is_me_message";
  @JsonProperty(JSON_PROPERTY_IS_ME_MESSAGE)
  private Object isMeMessage = null;

  public static final String JSON_PROPERTY_REACTIONS = "reactions";
  @JsonProperty(JSON_PROPERTY_REACTIONS)
  private Object reactions = null;

  public static final String JSON_PROPERTY_RECIPIENT_ID = "recipient_id";
  @JsonProperty(JSON_PROPERTY_RECIPIENT_ID)
  private Object recipientId = null;

  public static final String JSON_PROPERTY_SENDER_EMAIL = "sender_email";
  @JsonProperty(JSON_PROPERTY_SENDER_EMAIL)
  private Object senderEmail = null;

  public static final String JSON_PROPERTY_SENDER_FULL_NAME = "sender_full_name";
  @JsonProperty(JSON_PROPERTY_SENDER_FULL_NAME)
  private Object senderFullName = null;

  public static final String JSON_PROPERTY_SENDER_ID = "sender_id";
  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  private Object senderId = null;

  public static final String JSON_PROPERTY_SENDER_REALM_STR = "sender_realm_str";
  @JsonProperty(JSON_PROPERTY_SENDER_REALM_STR)
  private Object senderRealmStr = null;

  public static final String JSON_PROPERTY_STREAM_ID = "stream_id";
  @JsonProperty(JSON_PROPERTY_STREAM_ID)
  private Object streamId = null;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  private Object subject = null;

  public static final String JSON_PROPERTY_TOPIC_LINKS = "topic_links";
  @JsonProperty(JSON_PROPERTY_TOPIC_LINKS)
  private Object topicLinks = null;

  public static final String JSON_PROPERTY_SUBMESSAGES = "submessages";
  @JsonProperty(JSON_PROPERTY_SUBMESSAGES)
  private Object submessages = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  private Object timestamp = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private Object type = null;

  public MessagesAllOf avatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * Get avatarUrl
   * @return avatarUrl
   **/
  @JsonProperty(value = "avatar_url")
  @ApiModelProperty(value = "")
  
  public Object getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public MessagesAllOf client(Object client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   **/
  @JsonProperty(value = "client")
  @ApiModelProperty(value = "")
  
  public Object getClient() {
    return client;
  }

  public void setClient(Object client) {
    this.client = client;
  }

  public MessagesAllOf content(Object content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   **/
  @JsonProperty(value = "content")
  @ApiModelProperty(value = "")
  
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

  public MessagesAllOf contentType(Object contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   **/
  @JsonProperty(value = "content_type")
  @ApiModelProperty(value = "")
  
  public Object getContentType() {
    return contentType;
  }

  public void setContentType(Object contentType) {
    this.contentType = contentType;
  }

  public MessagesAllOf displayRecipient(Object displayRecipient) {
    this.displayRecipient = displayRecipient;
    return this;
  }

  /**
   * Get displayRecipient
   * @return displayRecipient
   **/
  @JsonProperty(value = "display_recipient")
  @ApiModelProperty(value = "")
  
  public Object getDisplayRecipient() {
    return displayRecipient;
  }

  public void setDisplayRecipient(Object displayRecipient) {
    this.displayRecipient = displayRecipient;
  }

  public MessagesAllOf id(Object id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(value = "")
  
  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public MessagesAllOf isMeMessage(Object isMeMessage) {
    this.isMeMessage = isMeMessage;
    return this;
  }

  /**
   * Get isMeMessage
   * @return isMeMessage
   **/
  @JsonProperty(value = "is_me_message")
  @ApiModelProperty(value = "")
  
  public Object getIsMeMessage() {
    return isMeMessage;
  }

  public void setIsMeMessage(Object isMeMessage) {
    this.isMeMessage = isMeMessage;
  }

  public MessagesAllOf reactions(Object reactions) {
    this.reactions = reactions;
    return this;
  }

  /**
   * Get reactions
   * @return reactions
   **/
  @JsonProperty(value = "reactions")
  @ApiModelProperty(value = "")
  
  public Object getReactions() {
    return reactions;
  }

  public void setReactions(Object reactions) {
    this.reactions = reactions;
  }

  public MessagesAllOf recipientId(Object recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Get recipientId
   * @return recipientId
   **/
  @JsonProperty(value = "recipient_id")
  @ApiModelProperty(value = "")
  
  public Object getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(Object recipientId) {
    this.recipientId = recipientId;
  }

  public MessagesAllOf senderEmail(Object senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

  /**
   * Get senderEmail
   * @return senderEmail
   **/
  @JsonProperty(value = "sender_email")
  @ApiModelProperty(value = "")
  
  public Object getSenderEmail() {
    return senderEmail;
  }

  public void setSenderEmail(Object senderEmail) {
    this.senderEmail = senderEmail;
  }

  public MessagesAllOf senderFullName(Object senderFullName) {
    this.senderFullName = senderFullName;
    return this;
  }

  /**
   * Get senderFullName
   * @return senderFullName
   **/
  @JsonProperty(value = "sender_full_name")
  @ApiModelProperty(value = "")
  
  public Object getSenderFullName() {
    return senderFullName;
  }

  public void setSenderFullName(Object senderFullName) {
    this.senderFullName = senderFullName;
  }

  public MessagesAllOf senderId(Object senderId) {
    this.senderId = senderId;
    return this;
  }

  /**
   * Get senderId
   * @return senderId
   **/
  @JsonProperty(value = "sender_id")
  @ApiModelProperty(value = "")
  
  public Object getSenderId() {
    return senderId;
  }

  public void setSenderId(Object senderId) {
    this.senderId = senderId;
  }

  public MessagesAllOf senderRealmStr(Object senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
    return this;
  }

  /**
   * Get senderRealmStr
   * @return senderRealmStr
   **/
  @JsonProperty(value = "sender_realm_str")
  @ApiModelProperty(value = "")
  
  public Object getSenderRealmStr() {
    return senderRealmStr;
  }

  public void setSenderRealmStr(Object senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
  }

  public MessagesAllOf streamId(Object streamId) {
    this.streamId = streamId;
    return this;
  }

  /**
   * Get streamId
   * @return streamId
   **/
  @JsonProperty(value = "stream_id")
  @ApiModelProperty(value = "")
  
  public Object getStreamId() {
    return streamId;
  }

  public void setStreamId(Object streamId) {
    this.streamId = streamId;
  }

  public MessagesAllOf subject(Object subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
   **/
  @JsonProperty(value = "subject")
  @ApiModelProperty(value = "")
  
  public Object getSubject() {
    return subject;
  }

  public void setSubject(Object subject) {
    this.subject = subject;
  }

  public MessagesAllOf topicLinks(Object topicLinks) {
    this.topicLinks = topicLinks;
    return this;
  }

  /**
   * Get topicLinks
   * @return topicLinks
   **/
  @JsonProperty(value = "topic_links")
  @ApiModelProperty(value = "")
  
  public Object getTopicLinks() {
    return topicLinks;
  }

  public void setTopicLinks(Object topicLinks) {
    this.topicLinks = topicLinks;
  }

  public MessagesAllOf submessages(Object submessages) {
    this.submessages = submessages;
    return this;
  }

  /**
   * Get submessages
   * @return submessages
   **/
  @JsonProperty(value = "submessages")
  @ApiModelProperty(value = "")
  
  public Object getSubmessages() {
    return submessages;
  }

  public void setSubmessages(Object submessages) {
    this.submessages = submessages;
  }

  public MessagesAllOf timestamp(Object timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   **/
  @JsonProperty(value = "timestamp")
  @ApiModelProperty(value = "")
  
  public Object getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Object timestamp) {
    this.timestamp = timestamp;
  }

  public MessagesAllOf type(Object type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(value = "")
  
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
    MessagesAllOf messagesAllOf = (MessagesAllOf) o;
    return Objects.equals(this.avatarUrl, messagesAllOf.avatarUrl) &&
        Objects.equals(this.client, messagesAllOf.client) &&
        Objects.equals(this.content, messagesAllOf.content) &&
        Objects.equals(this.contentType, messagesAllOf.contentType) &&
        Objects.equals(this.displayRecipient, messagesAllOf.displayRecipient) &&
        Objects.equals(this.id, messagesAllOf.id) &&
        Objects.equals(this.isMeMessage, messagesAllOf.isMeMessage) &&
        Objects.equals(this.reactions, messagesAllOf.reactions) &&
        Objects.equals(this.recipientId, messagesAllOf.recipientId) &&
        Objects.equals(this.senderEmail, messagesAllOf.senderEmail) &&
        Objects.equals(this.senderFullName, messagesAllOf.senderFullName) &&
        Objects.equals(this.senderId, messagesAllOf.senderId) &&
        Objects.equals(this.senderRealmStr, messagesAllOf.senderRealmStr) &&
        Objects.equals(this.streamId, messagesAllOf.streamId) &&
        Objects.equals(this.subject, messagesAllOf.subject) &&
        Objects.equals(this.topicLinks, messagesAllOf.topicLinks) &&
        Objects.equals(this.submessages, messagesAllOf.submessages) &&
        Objects.equals(this.timestamp, messagesAllOf.timestamp) &&
        Objects.equals(this.type, messagesAllOf.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, client, content, contentType, displayRecipient, id, isMeMessage, reactions, recipientId, senderEmail, senderFullName, senderId, senderRealmStr, streamId, subject, topicLinks, submessages, timestamp, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagesAllOf {\n");
    
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

