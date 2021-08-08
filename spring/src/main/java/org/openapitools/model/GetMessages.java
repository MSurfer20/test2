package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.GetMessagesAllOf;
import org.openapitools.model.MessagesBase;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetMessages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-08T20:43:06.633496Z[Etc/UTC]")
public class GetMessages   {
  @JsonProperty("avatar_url")
  private JsonNullable<Object> avatarUrl = JsonNullable.undefined();

  @JsonProperty("client")
  private JsonNullable<Object> client = JsonNullable.undefined();

  @JsonProperty("content")
  private JsonNullable<Object> content = JsonNullable.undefined();

  @JsonProperty("content_type")
  private JsonNullable<Object> contentType = JsonNullable.undefined();

  @JsonProperty("display_recipient")
  private JsonNullable<Object> displayRecipient = JsonNullable.undefined();

  @JsonProperty("id")
  private JsonNullable<Object> id = JsonNullable.undefined();

  @JsonProperty("is_me_message")
  private JsonNullable<Object> isMeMessage = JsonNullable.undefined();

  @JsonProperty("reactions")
  private JsonNullable<Object> reactions = JsonNullable.undefined();

  @JsonProperty("recipient_id")
  private JsonNullable<Object> recipientId = JsonNullable.undefined();

  @JsonProperty("sender_email")
  private JsonNullable<Object> senderEmail = JsonNullable.undefined();

  @JsonProperty("sender_full_name")
  private JsonNullable<Object> senderFullName = JsonNullable.undefined();

  @JsonProperty("sender_id")
  private JsonNullable<Object> senderId = JsonNullable.undefined();

  @JsonProperty("sender_realm_str")
  private JsonNullable<Object> senderRealmStr = JsonNullable.undefined();

  @JsonProperty("stream_id")
  private JsonNullable<Object> streamId = JsonNullable.undefined();

  @JsonProperty("subject")
  private JsonNullable<Object> subject = JsonNullable.undefined();

  @JsonProperty("topic_links")
  private JsonNullable<Object> topicLinks = JsonNullable.undefined();

  @JsonProperty("submessages")
  private JsonNullable<Object> submessages = JsonNullable.undefined();

  @JsonProperty("timestamp")
  private JsonNullable<Object> timestamp = JsonNullable.undefined();

  @JsonProperty("type")
  private JsonNullable<Object> type = JsonNullable.undefined();

  @JsonProperty("flags")
  @Valid
  private List<String> flags = null;

  @JsonProperty("last_edit_timestamp")
  private Integer lastEditTimestamp;

  @JsonProperty("match_content")
  private String matchContent;

  @JsonProperty("match_subject")
  private String matchSubject;

  public GetMessages avatarUrl(Object avatarUrl) {
    this.avatarUrl = JsonNullable.of(avatarUrl);
    return this;
  }

  /**
   * Get avatarUrl
   * @return avatarUrl
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(JsonNullable<Object> avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public GetMessages client(Object client) {
    this.client = JsonNullable.of(client);
    return this;
  }

  /**
   * Get client
   * @return client
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getClient() {
    return client;
  }

  public void setClient(JsonNullable<Object> client) {
    this.client = client;
  }

  public GetMessages content(Object content) {
    this.content = JsonNullable.of(content);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getContent() {
    return content;
  }

  public void setContent(JsonNullable<Object> content) {
    this.content = content;
  }

  public GetMessages contentType(Object contentType) {
    this.contentType = JsonNullable.of(contentType);
    return this;
  }

  /**
   * Get contentType
   * @return contentType
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getContentType() {
    return contentType;
  }

  public void setContentType(JsonNullable<Object> contentType) {
    this.contentType = contentType;
  }

  public GetMessages displayRecipient(Object displayRecipient) {
    this.displayRecipient = JsonNullable.of(displayRecipient);
    return this;
  }

  /**
   * Get displayRecipient
   * @return displayRecipient
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getDisplayRecipient() {
    return displayRecipient;
  }

  public void setDisplayRecipient(JsonNullable<Object> displayRecipient) {
    this.displayRecipient = displayRecipient;
  }

  public GetMessages id(Object id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getId() {
    return id;
  }

  public void setId(JsonNullable<Object> id) {
    this.id = id;
  }

  public GetMessages isMeMessage(Object isMeMessage) {
    this.isMeMessage = JsonNullable.of(isMeMessage);
    return this;
  }

  /**
   * Get isMeMessage
   * @return isMeMessage
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getIsMeMessage() {
    return isMeMessage;
  }

  public void setIsMeMessage(JsonNullable<Object> isMeMessage) {
    this.isMeMessage = isMeMessage;
  }

  public GetMessages reactions(Object reactions) {
    this.reactions = JsonNullable.of(reactions);
    return this;
  }

  /**
   * Get reactions
   * @return reactions
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getReactions() {
    return reactions;
  }

  public void setReactions(JsonNullable<Object> reactions) {
    this.reactions = reactions;
  }

  public GetMessages recipientId(Object recipientId) {
    this.recipientId = JsonNullable.of(recipientId);
    return this;
  }

  /**
   * Get recipientId
   * @return recipientId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(JsonNullable<Object> recipientId) {
    this.recipientId = recipientId;
  }

  public GetMessages senderEmail(Object senderEmail) {
    this.senderEmail = JsonNullable.of(senderEmail);
    return this;
  }

  /**
   * Get senderEmail
   * @return senderEmail
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getSenderEmail() {
    return senderEmail;
  }

  public void setSenderEmail(JsonNullable<Object> senderEmail) {
    this.senderEmail = senderEmail;
  }

  public GetMessages senderFullName(Object senderFullName) {
    this.senderFullName = JsonNullable.of(senderFullName);
    return this;
  }

  /**
   * Get senderFullName
   * @return senderFullName
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getSenderFullName() {
    return senderFullName;
  }

  public void setSenderFullName(JsonNullable<Object> senderFullName) {
    this.senderFullName = senderFullName;
  }

  public GetMessages senderId(Object senderId) {
    this.senderId = JsonNullable.of(senderId);
    return this;
  }

  /**
   * Get senderId
   * @return senderId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getSenderId() {
    return senderId;
  }

  public void setSenderId(JsonNullable<Object> senderId) {
    this.senderId = senderId;
  }

  public GetMessages senderRealmStr(Object senderRealmStr) {
    this.senderRealmStr = JsonNullable.of(senderRealmStr);
    return this;
  }

  /**
   * Get senderRealmStr
   * @return senderRealmStr
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getSenderRealmStr() {
    return senderRealmStr;
  }

  public void setSenderRealmStr(JsonNullable<Object> senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
  }

  public GetMessages streamId(Object streamId) {
    this.streamId = JsonNullable.of(streamId);
    return this;
  }

  /**
   * Get streamId
   * @return streamId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getStreamId() {
    return streamId;
  }

  public void setStreamId(JsonNullable<Object> streamId) {
    this.streamId = streamId;
  }

  public GetMessages subject(Object subject) {
    this.subject = JsonNullable.of(subject);
    return this;
  }

  /**
   * Get subject
   * @return subject
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getSubject() {
    return subject;
  }

  public void setSubject(JsonNullable<Object> subject) {
    this.subject = subject;
  }

  public GetMessages topicLinks(Object topicLinks) {
    this.topicLinks = JsonNullable.of(topicLinks);
    return this;
  }

  /**
   * Get topicLinks
   * @return topicLinks
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getTopicLinks() {
    return topicLinks;
  }

  public void setTopicLinks(JsonNullable<Object> topicLinks) {
    this.topicLinks = topicLinks;
  }

  public GetMessages submessages(Object submessages) {
    this.submessages = JsonNullable.of(submessages);
    return this;
  }

  /**
   * Get submessages
   * @return submessages
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getSubmessages() {
    return submessages;
  }

  public void setSubmessages(JsonNullable<Object> submessages) {
    this.submessages = submessages;
  }

  public GetMessages timestamp(Object timestamp) {
    this.timestamp = JsonNullable.of(timestamp);
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(JsonNullable<Object> timestamp) {
    this.timestamp = timestamp;
  }

  public GetMessages type(Object type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getType() {
    return type;
  }

  public void setType(JsonNullable<Object> type) {
    this.type = type;
  }

  public GetMessages flags(List<String> flags) {
    this.flags = flags;
    return this;
  }

  public GetMessages addFlagsItem(String flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<>();
    }
    this.flags.add(flagsItem);
    return this;
  }

  /**
   * The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
   * @return flags
  */
  @ApiModelProperty(value = "The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags ")


  public List<String> getFlags() {
    return flags;
  }

  public void setFlags(List<String> flags) {
    this.flags = flags;
  }

  public GetMessages lastEditTimestamp(Integer lastEditTimestamp) {
    this.lastEditTimestamp = lastEditTimestamp;
    return this;
  }

  /**
   * The UNIX timestamp for when the message was last edited, in UTC seconds. 
   * @return lastEditTimestamp
  */
  @ApiModelProperty(value = "The UNIX timestamp for when the message was last edited, in UTC seconds. ")


  public Integer getLastEditTimestamp() {
    return lastEditTimestamp;
  }

  public void setLastEditTimestamp(Integer lastEditTimestamp) {
    this.lastEditTimestamp = lastEditTimestamp;
  }

  public GetMessages matchContent(String matchContent) {
    this.matchContent = matchContent;
    return this;
  }

  /**
   * Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
   * @return matchContent
  */
  @ApiModelProperty(value = "Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. ")


  public String getMatchContent() {
    return matchContent;
  }

  public void setMatchContent(String matchContent) {
    this.matchContent = matchContent;
  }

  public GetMessages matchSubject(String matchSubject) {
    this.matchSubject = matchSubject;
    return this;
  }

  /**
   * Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
   * @return matchSubject
  */
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
    GetMessages getMessages = (GetMessages) o;
    return Objects.equals(this.avatarUrl, getMessages.avatarUrl) &&
        Objects.equals(this.client, getMessages.client) &&
        Objects.equals(this.content, getMessages.content) &&
        Objects.equals(this.contentType, getMessages.contentType) &&
        Objects.equals(this.displayRecipient, getMessages.displayRecipient) &&
        Objects.equals(this.id, getMessages.id) &&
        Objects.equals(this.isMeMessage, getMessages.isMeMessage) &&
        Objects.equals(this.reactions, getMessages.reactions) &&
        Objects.equals(this.recipientId, getMessages.recipientId) &&
        Objects.equals(this.senderEmail, getMessages.senderEmail) &&
        Objects.equals(this.senderFullName, getMessages.senderFullName) &&
        Objects.equals(this.senderId, getMessages.senderId) &&
        Objects.equals(this.senderRealmStr, getMessages.senderRealmStr) &&
        Objects.equals(this.streamId, getMessages.streamId) &&
        Objects.equals(this.subject, getMessages.subject) &&
        Objects.equals(this.topicLinks, getMessages.topicLinks) &&
        Objects.equals(this.submessages, getMessages.submessages) &&
        Objects.equals(this.timestamp, getMessages.timestamp) &&
        Objects.equals(this.type, getMessages.type) &&
        Objects.equals(this.flags, getMessages.flags) &&
        Objects.equals(this.lastEditTimestamp, getMessages.lastEditTimestamp) &&
        Objects.equals(this.matchContent, getMessages.matchContent) &&
        Objects.equals(this.matchSubject, getMessages.matchSubject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, client, content, contentType, displayRecipient, id, isMeMessage, reactions, recipientId, senderEmail, senderFullName, senderId, senderRealmStr, streamId, subject, topicLinks, submessages, timestamp, type, flags, lastEditTimestamp, matchContent, matchSubject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMessages {\n");
    
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

