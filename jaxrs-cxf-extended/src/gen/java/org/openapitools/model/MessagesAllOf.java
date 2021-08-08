package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MessagesAllOf  {
  
  @ApiModelProperty(value = "")
  private Object avatarUrl = null;

  @ApiModelProperty(value = "")
  private Object client = null;

  @ApiModelProperty(value = "")
  private Object content = null;

  @ApiModelProperty(value = "")
  private Object contentType = null;

  @ApiModelProperty(value = "")
  private Object displayRecipient = null;

  @ApiModelProperty(value = "")
  private Object id = null;

  @ApiModelProperty(value = "")
  private Object isMeMessage = null;

  @ApiModelProperty(value = "")
  private Object reactions = null;

  @ApiModelProperty(value = "")
  private Object recipientId = null;

  @ApiModelProperty(value = "")
  private Object senderEmail = null;

  @ApiModelProperty(value = "")
  private Object senderFullName = null;

  @ApiModelProperty(value = "")
  private Object senderId = null;

  @ApiModelProperty(value = "")
  private Object senderRealmStr = null;

  @ApiModelProperty(value = "")
  private Object streamId = null;

  @ApiModelProperty(value = "")
  private Object subject = null;

  @ApiModelProperty(value = "")
  private Object topicLinks = null;

  @ApiModelProperty(value = "")
  private Object submessages = null;

  @ApiModelProperty(value = "")
  private Object timestamp = null;

  @ApiModelProperty(value = "")
  private Object type = null;
 /**
  * Get avatarUrl
  * @return avatarUrl
  */
  @JsonProperty("avatar_url")
  public Object getAvatarUrl() {
    return avatarUrl;
  }

  /**
   * Sets the <code>avatarUrl</code> property.
   */
  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * Sets the <code>avatarUrl</code> property.
   */
  public MessagesAllOf avatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

 /**
  * Get client
  * @return client
  */
  @JsonProperty("client")
  public Object getClient() {
    return client;
  }

  /**
   * Sets the <code>client</code> property.
   */
  public void setClient(Object client) {
    this.client = client;
  }

  /**
   * Sets the <code>client</code> property.
   */
  public MessagesAllOf client(Object client) {
    this.client = client;
    return this;
  }

 /**
  * Get content
  * @return content
  */
  @JsonProperty("content")
  public Object getContent() {
    return content;
  }

  /**
   * Sets the <code>content</code> property.
   */
  public void setContent(Object content) {
    this.content = content;
  }

  /**
   * Sets the <code>content</code> property.
   */
  public MessagesAllOf content(Object content) {
    this.content = content;
    return this;
  }

 /**
  * Get contentType
  * @return contentType
  */
  @JsonProperty("content_type")
  public Object getContentType() {
    return contentType;
  }

  /**
   * Sets the <code>contentType</code> property.
   */
  public void setContentType(Object contentType) {
    this.contentType = contentType;
  }

  /**
   * Sets the <code>contentType</code> property.
   */
  public MessagesAllOf contentType(Object contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
  * Get displayRecipient
  * @return displayRecipient
  */
  @JsonProperty("display_recipient")
  public Object getDisplayRecipient() {
    return displayRecipient;
  }

  /**
   * Sets the <code>displayRecipient</code> property.
   */
  public void setDisplayRecipient(Object displayRecipient) {
    this.displayRecipient = displayRecipient;
  }

  /**
   * Sets the <code>displayRecipient</code> property.
   */
  public MessagesAllOf displayRecipient(Object displayRecipient) {
    this.displayRecipient = displayRecipient;
    return this;
  }

 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  public Object getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public void setId(Object id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public MessagesAllOf id(Object id) {
    this.id = id;
    return this;
  }

 /**
  * Get isMeMessage
  * @return isMeMessage
  */
  @JsonProperty("is_me_message")
  public Object getIsMeMessage() {
    return isMeMessage;
  }

  /**
   * Sets the <code>isMeMessage</code> property.
   */
  public void setIsMeMessage(Object isMeMessage) {
    this.isMeMessage = isMeMessage;
  }

  /**
   * Sets the <code>isMeMessage</code> property.
   */
  public MessagesAllOf isMeMessage(Object isMeMessage) {
    this.isMeMessage = isMeMessage;
    return this;
  }

 /**
  * Get reactions
  * @return reactions
  */
  @JsonProperty("reactions")
  public Object getReactions() {
    return reactions;
  }

  /**
   * Sets the <code>reactions</code> property.
   */
  public void setReactions(Object reactions) {
    this.reactions = reactions;
  }

  /**
   * Sets the <code>reactions</code> property.
   */
  public MessagesAllOf reactions(Object reactions) {
    this.reactions = reactions;
    return this;
  }

 /**
  * Get recipientId
  * @return recipientId
  */
  @JsonProperty("recipient_id")
  public Object getRecipientId() {
    return recipientId;
  }

  /**
   * Sets the <code>recipientId</code> property.
   */
  public void setRecipientId(Object recipientId) {
    this.recipientId = recipientId;
  }

  /**
   * Sets the <code>recipientId</code> property.
   */
  public MessagesAllOf recipientId(Object recipientId) {
    this.recipientId = recipientId;
    return this;
  }

 /**
  * Get senderEmail
  * @return senderEmail
  */
  @JsonProperty("sender_email")
  public Object getSenderEmail() {
    return senderEmail;
  }

  /**
   * Sets the <code>senderEmail</code> property.
   */
  public void setSenderEmail(Object senderEmail) {
    this.senderEmail = senderEmail;
  }

  /**
   * Sets the <code>senderEmail</code> property.
   */
  public MessagesAllOf senderEmail(Object senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

 /**
  * Get senderFullName
  * @return senderFullName
  */
  @JsonProperty("sender_full_name")
  public Object getSenderFullName() {
    return senderFullName;
  }

  /**
   * Sets the <code>senderFullName</code> property.
   */
  public void setSenderFullName(Object senderFullName) {
    this.senderFullName = senderFullName;
  }

  /**
   * Sets the <code>senderFullName</code> property.
   */
  public MessagesAllOf senderFullName(Object senderFullName) {
    this.senderFullName = senderFullName;
    return this;
  }

 /**
  * Get senderId
  * @return senderId
  */
  @JsonProperty("sender_id")
  public Object getSenderId() {
    return senderId;
  }

  /**
   * Sets the <code>senderId</code> property.
   */
  public void setSenderId(Object senderId) {
    this.senderId = senderId;
  }

  /**
   * Sets the <code>senderId</code> property.
   */
  public MessagesAllOf senderId(Object senderId) {
    this.senderId = senderId;
    return this;
  }

 /**
  * Get senderRealmStr
  * @return senderRealmStr
  */
  @JsonProperty("sender_realm_str")
  public Object getSenderRealmStr() {
    return senderRealmStr;
  }

  /**
   * Sets the <code>senderRealmStr</code> property.
   */
  public void setSenderRealmStr(Object senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
  }

  /**
   * Sets the <code>senderRealmStr</code> property.
   */
  public MessagesAllOf senderRealmStr(Object senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
    return this;
  }

 /**
  * Get streamId
  * @return streamId
  */
  @JsonProperty("stream_id")
  public Object getStreamId() {
    return streamId;
  }

  /**
   * Sets the <code>streamId</code> property.
   */
  public void setStreamId(Object streamId) {
    this.streamId = streamId;
  }

  /**
   * Sets the <code>streamId</code> property.
   */
  public MessagesAllOf streamId(Object streamId) {
    this.streamId = streamId;
    return this;
  }

 /**
  * Get subject
  * @return subject
  */
  @JsonProperty("subject")
  public Object getSubject() {
    return subject;
  }

  /**
   * Sets the <code>subject</code> property.
   */
  public void setSubject(Object subject) {
    this.subject = subject;
  }

  /**
   * Sets the <code>subject</code> property.
   */
  public MessagesAllOf subject(Object subject) {
    this.subject = subject;
    return this;
  }

 /**
  * Get topicLinks
  * @return topicLinks
  */
  @JsonProperty("topic_links")
  public Object getTopicLinks() {
    return topicLinks;
  }

  /**
   * Sets the <code>topicLinks</code> property.
   */
  public void setTopicLinks(Object topicLinks) {
    this.topicLinks = topicLinks;
  }

  /**
   * Sets the <code>topicLinks</code> property.
   */
  public MessagesAllOf topicLinks(Object topicLinks) {
    this.topicLinks = topicLinks;
    return this;
  }

 /**
  * Get submessages
  * @return submessages
  */
  @JsonProperty("submessages")
  public Object getSubmessages() {
    return submessages;
  }

  /**
   * Sets the <code>submessages</code> property.
   */
  public void setSubmessages(Object submessages) {
    this.submessages = submessages;
  }

  /**
   * Sets the <code>submessages</code> property.
   */
  public MessagesAllOf submessages(Object submessages) {
    this.submessages = submessages;
    return this;
  }

 /**
  * Get timestamp
  * @return timestamp
  */
  @JsonProperty("timestamp")
  public Object getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the <code>timestamp</code> property.
   */
  public void setTimestamp(Object timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Sets the <code>timestamp</code> property.
   */
  public MessagesAllOf timestamp(Object timestamp) {
    this.timestamp = timestamp;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public Object getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public void setType(Object type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public MessagesAllOf type(Object type) {
    this.type = type;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

