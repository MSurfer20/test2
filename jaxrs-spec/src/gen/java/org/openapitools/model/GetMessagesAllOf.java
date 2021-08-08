package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T21:12:25.585041Z[Etc/UTC]")public class GetMessagesAllOf   {
  
  private @Valid Object avatarUrl = null;
  private @Valid Object client = null;
  private @Valid Object content = null;
  private @Valid Object contentType = null;
  private @Valid Object displayRecipient = null;
  private @Valid Object id = null;
  private @Valid Object isMeMessage = null;
  private @Valid Object reactions = null;
  private @Valid Object recipientId = null;
  private @Valid Object senderEmail = null;
  private @Valid Object senderFullName = null;
  private @Valid Object senderId = null;
  private @Valid Object senderRealmStr = null;
  private @Valid Object streamId = null;
  private @Valid Object subject = null;
  private @Valid Object topicLinks = null;
  private @Valid Object submessages = null;
  private @Valid Object timestamp = null;
  private @Valid Object type = null;
  private @Valid List<String> flags = new ArrayList<String>();
  private @Valid Integer lastEditTimestamp;
  private @Valid String matchContent;
  private @Valid String matchSubject;

  /**
   **/
  public GetMessagesAllOf avatarUrl(Object avatarUrl) {
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
  public GetMessagesAllOf client(Object client) {
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
  public GetMessagesAllOf content(Object content) {
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
  public GetMessagesAllOf contentType(Object contentType) {
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
  public GetMessagesAllOf displayRecipient(Object displayRecipient) {
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
  public GetMessagesAllOf id(Object id) {
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
  public GetMessagesAllOf isMeMessage(Object isMeMessage) {
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
  public GetMessagesAllOf reactions(Object reactions) {
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
  public GetMessagesAllOf recipientId(Object recipientId) {
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
  public GetMessagesAllOf senderEmail(Object senderEmail) {
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
  public GetMessagesAllOf senderFullName(Object senderFullName) {
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
  public GetMessagesAllOf senderId(Object senderId) {
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
  public GetMessagesAllOf senderRealmStr(Object senderRealmStr) {
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
  public GetMessagesAllOf streamId(Object streamId) {
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
  public GetMessagesAllOf subject(Object subject) {
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
  public GetMessagesAllOf topicLinks(Object topicLinks) {
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
  public GetMessagesAllOf submessages(Object submessages) {
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
  public GetMessagesAllOf timestamp(Object timestamp) {
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
  public GetMessagesAllOf type(Object type) {
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

/**
   * The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
   **/
  public GetMessagesAllOf flags(List<String> flags) {
    this.flags = flags;
    return this;
  }

  

  
  @ApiModelProperty(value = "The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags ")
  @JsonProperty("flags")
  public List<String> getFlags() {
    return flags;
  }

  public void setFlags(List<String> flags) {
    this.flags = flags;
  }

/**
   * The UNIX timestamp for when the message was last edited, in UTC seconds. 
   **/
  public GetMessagesAllOf lastEditTimestamp(Integer lastEditTimestamp) {
    this.lastEditTimestamp = lastEditTimestamp;
    return this;
  }

  

  
  @ApiModelProperty(value = "The UNIX timestamp for when the message was last edited, in UTC seconds. ")
  @JsonProperty("last_edit_timestamp")
  public Integer getLastEditTimestamp() {
    return lastEditTimestamp;
  }

  public void setLastEditTimestamp(Integer lastEditTimestamp) {
    this.lastEditTimestamp = lastEditTimestamp;
  }

/**
   * Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. 
   **/
  public GetMessagesAllOf matchContent(String matchContent) {
    this.matchContent = matchContent;
    return this;
  }

  

  
  @ApiModelProperty(value = "Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. ")
  @JsonProperty("match_content")
  public String getMatchContent() {
    return matchContent;
  }

  public void setMatchContent(String matchContent) {
    this.matchContent = matchContent;
  }

/**
   * Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. 
   **/
  public GetMessagesAllOf matchSubject(String matchSubject) {
    this.matchSubject = matchSubject;
    return this;
  }

  

  
  @ApiModelProperty(value = "Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. ")
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

