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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * GetMessagesAllOf
 */
@JsonPropertyOrder({
  GetMessagesAllOf.JSON_PROPERTY_AVATAR_URL,
  GetMessagesAllOf.JSON_PROPERTY_CLIENT,
  GetMessagesAllOf.JSON_PROPERTY_CONTENT,
  GetMessagesAllOf.JSON_PROPERTY_CONTENT_TYPE,
  GetMessagesAllOf.JSON_PROPERTY_DISPLAY_RECIPIENT,
  GetMessagesAllOf.JSON_PROPERTY_ID,
  GetMessagesAllOf.JSON_PROPERTY_IS_ME_MESSAGE,
  GetMessagesAllOf.JSON_PROPERTY_REACTIONS,
  GetMessagesAllOf.JSON_PROPERTY_RECIPIENT_ID,
  GetMessagesAllOf.JSON_PROPERTY_SENDER_EMAIL,
  GetMessagesAllOf.JSON_PROPERTY_SENDER_FULL_NAME,
  GetMessagesAllOf.JSON_PROPERTY_SENDER_ID,
  GetMessagesAllOf.JSON_PROPERTY_SENDER_REALM_STR,
  GetMessagesAllOf.JSON_PROPERTY_STREAM_ID,
  GetMessagesAllOf.JSON_PROPERTY_SUBJECT,
  GetMessagesAllOf.JSON_PROPERTY_TOPIC_LINKS,
  GetMessagesAllOf.JSON_PROPERTY_SUBMESSAGES,
  GetMessagesAllOf.JSON_PROPERTY_TIMESTAMP,
  GetMessagesAllOf.JSON_PROPERTY_TYPE,
  GetMessagesAllOf.JSON_PROPERTY_FLAGS,
  GetMessagesAllOf.JSON_PROPERTY_LAST_EDIT_TIMESTAMP,
  GetMessagesAllOf.JSON_PROPERTY_MATCH_CONTENT,
  GetMessagesAllOf.JSON_PROPERTY_MATCH_SUBJECT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class GetMessagesAllOf   {
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

  public static final String JSON_PROPERTY_FLAGS = "flags";
  @JsonProperty(JSON_PROPERTY_FLAGS)
  private List<String> flags = null;

  public static final String JSON_PROPERTY_LAST_EDIT_TIMESTAMP = "last_edit_timestamp";
  @JsonProperty(JSON_PROPERTY_LAST_EDIT_TIMESTAMP)
  private Integer lastEditTimestamp;

  public static final String JSON_PROPERTY_MATCH_CONTENT = "match_content";
  @JsonProperty(JSON_PROPERTY_MATCH_CONTENT)
  private String matchContent;

  public static final String JSON_PROPERTY_MATCH_SUBJECT = "match_subject";
  @JsonProperty(JSON_PROPERTY_MATCH_SUBJECT)
  private String matchSubject;

  public GetMessagesAllOf avatarUrl(Object avatarUrl) {
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

  public GetMessagesAllOf client(Object client) {
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

  public GetMessagesAllOf content(Object content) {
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

  public GetMessagesAllOf contentType(Object contentType) {
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

  public GetMessagesAllOf displayRecipient(Object displayRecipient) {
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

  public GetMessagesAllOf id(Object id) {
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

  public GetMessagesAllOf isMeMessage(Object isMeMessage) {
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

  public GetMessagesAllOf reactions(Object reactions) {
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

  public GetMessagesAllOf recipientId(Object recipientId) {
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

  public GetMessagesAllOf senderEmail(Object senderEmail) {
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

  public GetMessagesAllOf senderFullName(Object senderFullName) {
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

  public GetMessagesAllOf senderId(Object senderId) {
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

  public GetMessagesAllOf senderRealmStr(Object senderRealmStr) {
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

  public GetMessagesAllOf streamId(Object streamId) {
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

  public GetMessagesAllOf subject(Object subject) {
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

  public GetMessagesAllOf topicLinks(Object topicLinks) {
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

  public GetMessagesAllOf submessages(Object submessages) {
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

  public GetMessagesAllOf timestamp(Object timestamp) {
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

  public GetMessagesAllOf type(Object type) {
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

  public GetMessagesAllOf flags(List<String> flags) {
    this.flags = flags;
    return this;
  }

  public GetMessagesAllOf addFlagsItem(String flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<String>();
    }
    this.flags.add(flagsItem);
    return this;
  }

  /**
   * The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
   * @return flags
   **/
  @JsonProperty(value = "flags")
  @ApiModelProperty(value = "The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags ")
  
  public List<String> getFlags() {
    return flags;
  }

  public void setFlags(List<String> flags) {
    this.flags = flags;
  }

  public GetMessagesAllOf lastEditTimestamp(Integer lastEditTimestamp) {
    this.lastEditTimestamp = lastEditTimestamp;
    return this;
  }

  /**
   * The UNIX timestamp for when the message was last edited, in UTC seconds. 
   * @return lastEditTimestamp
   **/
  @JsonProperty(value = "last_edit_timestamp")
  @ApiModelProperty(value = "The UNIX timestamp for when the message was last edited, in UTC seconds. ")
  
  public Integer getLastEditTimestamp() {
    return lastEditTimestamp;
  }

  public void setLastEditTimestamp(Integer lastEditTimestamp) {
    this.lastEditTimestamp = lastEditTimestamp;
  }

  public GetMessagesAllOf matchContent(String matchContent) {
    this.matchContent = matchContent;
    return this;
  }

  /**
   * Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. 
   * @return matchContent
   **/
  @JsonProperty(value = "match_content")
  @ApiModelProperty(value = "Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. ")
  
  public String getMatchContent() {
    return matchContent;
  }

  public void setMatchContent(String matchContent) {
    this.matchContent = matchContent;
  }

  public GetMessagesAllOf matchSubject(String matchSubject) {
    this.matchSubject = matchSubject;
    return this;
  }

  /**
   * Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. 
   * @return matchSubject
   **/
  @JsonProperty(value = "match_subject")
  @ApiModelProperty(value = "Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. ")
  
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
    return Objects.equals(this.avatarUrl, getMessagesAllOf.avatarUrl) &&
        Objects.equals(this.client, getMessagesAllOf.client) &&
        Objects.equals(this.content, getMessagesAllOf.content) &&
        Objects.equals(this.contentType, getMessagesAllOf.contentType) &&
        Objects.equals(this.displayRecipient, getMessagesAllOf.displayRecipient) &&
        Objects.equals(this.id, getMessagesAllOf.id) &&
        Objects.equals(this.isMeMessage, getMessagesAllOf.isMeMessage) &&
        Objects.equals(this.reactions, getMessagesAllOf.reactions) &&
        Objects.equals(this.recipientId, getMessagesAllOf.recipientId) &&
        Objects.equals(this.senderEmail, getMessagesAllOf.senderEmail) &&
        Objects.equals(this.senderFullName, getMessagesAllOf.senderFullName) &&
        Objects.equals(this.senderId, getMessagesAllOf.senderId) &&
        Objects.equals(this.senderRealmStr, getMessagesAllOf.senderRealmStr) &&
        Objects.equals(this.streamId, getMessagesAllOf.streamId) &&
        Objects.equals(this.subject, getMessagesAllOf.subject) &&
        Objects.equals(this.topicLinks, getMessagesAllOf.topicLinks) &&
        Objects.equals(this.submessages, getMessagesAllOf.submessages) &&
        Objects.equals(this.timestamp, getMessagesAllOf.timestamp) &&
        Objects.equals(this.type, getMessagesAllOf.type) &&
        Objects.equals(this.flags, getMessagesAllOf.flags) &&
        Objects.equals(this.lastEditTimestamp, getMessagesAllOf.lastEditTimestamp) &&
        Objects.equals(this.matchContent, getMessagesAllOf.matchContent) &&
        Objects.equals(this.matchSubject, getMessagesAllOf.matchSubject);
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

