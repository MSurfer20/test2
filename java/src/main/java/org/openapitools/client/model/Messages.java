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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.MessagesAllOf;
import org.openapitools.client.model.MessagesBase;

/**
 * Messages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-08T21:19:12.385396Z[Etc/UTC]")
public class Messages {
  public static final String SERIALIZED_NAME_AVATAR_URL = "avatar_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private Object avatarUrl = null;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private Object client = null;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private Object content = null;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private Object contentType = null;

  public static final String SERIALIZED_NAME_DISPLAY_RECIPIENT = "display_recipient";
  @SerializedName(SERIALIZED_NAME_DISPLAY_RECIPIENT)
  private Object displayRecipient = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Object id = null;

  public static final String SERIALIZED_NAME_IS_ME_MESSAGE = "is_me_message";
  @SerializedName(SERIALIZED_NAME_IS_ME_MESSAGE)
  private Object isMeMessage = null;

  public static final String SERIALIZED_NAME_REACTIONS = "reactions";
  @SerializedName(SERIALIZED_NAME_REACTIONS)
  private Object reactions = null;

  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private Object recipientId = null;

  public static final String SERIALIZED_NAME_SENDER_EMAIL = "sender_email";
  @SerializedName(SERIALIZED_NAME_SENDER_EMAIL)
  private Object senderEmail = null;

  public static final String SERIALIZED_NAME_SENDER_FULL_NAME = "sender_full_name";
  @SerializedName(SERIALIZED_NAME_SENDER_FULL_NAME)
  private Object senderFullName = null;

  public static final String SERIALIZED_NAME_SENDER_ID = "sender_id";
  @SerializedName(SERIALIZED_NAME_SENDER_ID)
  private Object senderId = null;

  public static final String SERIALIZED_NAME_SENDER_REALM_STR = "sender_realm_str";
  @SerializedName(SERIALIZED_NAME_SENDER_REALM_STR)
  private Object senderRealmStr = null;

  public static final String SERIALIZED_NAME_STREAM_ID = "stream_id";
  @SerializedName(SERIALIZED_NAME_STREAM_ID)
  private Object streamId = null;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private Object subject = null;

  public static final String SERIALIZED_NAME_TOPIC_LINKS = "topic_links";
  @SerializedName(SERIALIZED_NAME_TOPIC_LINKS)
  private Object topicLinks = null;

  public static final String SERIALIZED_NAME_SUBMESSAGES = "submessages";
  @SerializedName(SERIALIZED_NAME_SUBMESSAGES)
  private Object submessages = null;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Object timestamp = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Object type = null;


  public Messages avatarUrl(Object avatarUrl) {
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAvatarUrl() {
    return avatarUrl;
  }


  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public Messages client(Object client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getClient() {
    return client;
  }


  public void setClient(Object client) {
    this.client = client;
  }


  public Messages content(Object content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getContent() {
    return content;
  }


  public void setContent(Object content) {
    this.content = content;
  }


  public Messages contentType(Object contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getContentType() {
    return contentType;
  }


  public void setContentType(Object contentType) {
    this.contentType = contentType;
  }


  public Messages displayRecipient(Object displayRecipient) {
    
    this.displayRecipient = displayRecipient;
    return this;
  }

   /**
   * Get displayRecipient
   * @return displayRecipient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDisplayRecipient() {
    return displayRecipient;
  }


  public void setDisplayRecipient(Object displayRecipient) {
    this.displayRecipient = displayRecipient;
  }


  public Messages id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getId() {
    return id;
  }


  public void setId(Object id) {
    this.id = id;
  }


  public Messages isMeMessage(Object isMeMessage) {
    
    this.isMeMessage = isMeMessage;
    return this;
  }

   /**
   * Get isMeMessage
   * @return isMeMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getIsMeMessage() {
    return isMeMessage;
  }


  public void setIsMeMessage(Object isMeMessage) {
    this.isMeMessage = isMeMessage;
  }


  public Messages reactions(Object reactions) {
    
    this.reactions = reactions;
    return this;
  }

   /**
   * Get reactions
   * @return reactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getReactions() {
    return reactions;
  }


  public void setReactions(Object reactions) {
    this.reactions = reactions;
  }


  public Messages recipientId(Object recipientId) {
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Get recipientId
   * @return recipientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getRecipientId() {
    return recipientId;
  }


  public void setRecipientId(Object recipientId) {
    this.recipientId = recipientId;
  }


  public Messages senderEmail(Object senderEmail) {
    
    this.senderEmail = senderEmail;
    return this;
  }

   /**
   * Get senderEmail
   * @return senderEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSenderEmail() {
    return senderEmail;
  }


  public void setSenderEmail(Object senderEmail) {
    this.senderEmail = senderEmail;
  }


  public Messages senderFullName(Object senderFullName) {
    
    this.senderFullName = senderFullName;
    return this;
  }

   /**
   * Get senderFullName
   * @return senderFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSenderFullName() {
    return senderFullName;
  }


  public void setSenderFullName(Object senderFullName) {
    this.senderFullName = senderFullName;
  }


  public Messages senderId(Object senderId) {
    
    this.senderId = senderId;
    return this;
  }

   /**
   * Get senderId
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSenderId() {
    return senderId;
  }


  public void setSenderId(Object senderId) {
    this.senderId = senderId;
  }


  public Messages senderRealmStr(Object senderRealmStr) {
    
    this.senderRealmStr = senderRealmStr;
    return this;
  }

   /**
   * Get senderRealmStr
   * @return senderRealmStr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSenderRealmStr() {
    return senderRealmStr;
  }


  public void setSenderRealmStr(Object senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
  }


  public Messages streamId(Object streamId) {
    
    this.streamId = streamId;
    return this;
  }

   /**
   * Get streamId
   * @return streamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getStreamId() {
    return streamId;
  }


  public void setStreamId(Object streamId) {
    this.streamId = streamId;
  }


  public Messages subject(Object subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSubject() {
    return subject;
  }


  public void setSubject(Object subject) {
    this.subject = subject;
  }


  public Messages topicLinks(Object topicLinks) {
    
    this.topicLinks = topicLinks;
    return this;
  }

   /**
   * Get topicLinks
   * @return topicLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTopicLinks() {
    return topicLinks;
  }


  public void setTopicLinks(Object topicLinks) {
    this.topicLinks = topicLinks;
  }


  public Messages submessages(Object submessages) {
    
    this.submessages = submessages;
    return this;
  }

   /**
   * Get submessages
   * @return submessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSubmessages() {
    return submessages;
  }


  public void setSubmessages(Object submessages) {
    this.submessages = submessages;
  }


  public Messages timestamp(Object timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Object timestamp) {
    this.timestamp = timestamp;
  }


  public Messages type(Object type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
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
    Messages messages = (Messages) o;
    return Objects.equals(this.avatarUrl, messages.avatarUrl) &&
        Objects.equals(this.client, messages.client) &&
        Objects.equals(this.content, messages.content) &&
        Objects.equals(this.contentType, messages.contentType) &&
        Objects.equals(this.displayRecipient, messages.displayRecipient) &&
        Objects.equals(this.id, messages.id) &&
        Objects.equals(this.isMeMessage, messages.isMeMessage) &&
        Objects.equals(this.reactions, messages.reactions) &&
        Objects.equals(this.recipientId, messages.recipientId) &&
        Objects.equals(this.senderEmail, messages.senderEmail) &&
        Objects.equals(this.senderFullName, messages.senderFullName) &&
        Objects.equals(this.senderId, messages.senderId) &&
        Objects.equals(this.senderRealmStr, messages.senderRealmStr) &&
        Objects.equals(this.streamId, messages.streamId) &&
        Objects.equals(this.subject, messages.subject) &&
        Objects.equals(this.topicLinks, messages.topicLinks) &&
        Objects.equals(this.submessages, messages.submessages) &&
        Objects.equals(this.timestamp, messages.timestamp) &&
        Objects.equals(this.type, messages.type);
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

