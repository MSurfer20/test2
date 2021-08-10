package apimodels;

import apimodels.GetMessagesAllOf;
import apimodels.MessagesBase;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * GetMessages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-10T11:44:22.210302Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetMessages   {
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

  @JsonProperty("flags")
  
  private List<String> flags = null;

  @JsonProperty("last_edit_timestamp")
  
  private Integer lastEditTimestamp;

  @JsonProperty("match_content")
  
  private String matchContent;

  @JsonProperty("match_subject")
  
  private String matchSubject;

  public GetMessages avatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  public Object getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public GetMessages client(Object client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  public Object getClient() {
    return client;
  }

  public void setClient(Object client) {
    this.client = client;
  }

  public GetMessages content(Object content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

  public GetMessages contentType(Object contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  public Object getContentType() {
    return contentType;
  }

  public void setContentType(Object contentType) {
    this.contentType = contentType;
  }

  public GetMessages displayRecipient(Object displayRecipient) {
    this.displayRecipient = displayRecipient;
    return this;
  }

   /**
   * Get displayRecipient
   * @return displayRecipient
  **/
  public Object getDisplayRecipient() {
    return displayRecipient;
  }

  public void setDisplayRecipient(Object displayRecipient) {
    this.displayRecipient = displayRecipient;
  }

  public GetMessages id(Object id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public GetMessages isMeMessage(Object isMeMessage) {
    this.isMeMessage = isMeMessage;
    return this;
  }

   /**
   * Get isMeMessage
   * @return isMeMessage
  **/
  public Object getIsMeMessage() {
    return isMeMessage;
  }

  public void setIsMeMessage(Object isMeMessage) {
    this.isMeMessage = isMeMessage;
  }

  public GetMessages reactions(Object reactions) {
    this.reactions = reactions;
    return this;
  }

   /**
   * Get reactions
   * @return reactions
  **/
  public Object getReactions() {
    return reactions;
  }

  public void setReactions(Object reactions) {
    this.reactions = reactions;
  }

  public GetMessages recipientId(Object recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Get recipientId
   * @return recipientId
  **/
  public Object getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(Object recipientId) {
    this.recipientId = recipientId;
  }

  public GetMessages senderEmail(Object senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

   /**
   * Get senderEmail
   * @return senderEmail
  **/
  public Object getSenderEmail() {
    return senderEmail;
  }

  public void setSenderEmail(Object senderEmail) {
    this.senderEmail = senderEmail;
  }

  public GetMessages senderFullName(Object senderFullName) {
    this.senderFullName = senderFullName;
    return this;
  }

   /**
   * Get senderFullName
   * @return senderFullName
  **/
  public Object getSenderFullName() {
    return senderFullName;
  }

  public void setSenderFullName(Object senderFullName) {
    this.senderFullName = senderFullName;
  }

  public GetMessages senderId(Object senderId) {
    this.senderId = senderId;
    return this;
  }

   /**
   * Get senderId
   * @return senderId
  **/
  public Object getSenderId() {
    return senderId;
  }

  public void setSenderId(Object senderId) {
    this.senderId = senderId;
  }

  public GetMessages senderRealmStr(Object senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
    return this;
  }

   /**
   * Get senderRealmStr
   * @return senderRealmStr
  **/
  public Object getSenderRealmStr() {
    return senderRealmStr;
  }

  public void setSenderRealmStr(Object senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
  }

  public GetMessages streamId(Object streamId) {
    this.streamId = streamId;
    return this;
  }

   /**
   * Get streamId
   * @return streamId
  **/
  public Object getStreamId() {
    return streamId;
  }

  public void setStreamId(Object streamId) {
    this.streamId = streamId;
  }

  public GetMessages subject(Object subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  public Object getSubject() {
    return subject;
  }

  public void setSubject(Object subject) {
    this.subject = subject;
  }

  public GetMessages topicLinks(Object topicLinks) {
    this.topicLinks = topicLinks;
    return this;
  }

   /**
   * Get topicLinks
   * @return topicLinks
  **/
  public Object getTopicLinks() {
    return topicLinks;
  }

  public void setTopicLinks(Object topicLinks) {
    this.topicLinks = topicLinks;
  }

  public GetMessages submessages(Object submessages) {
    this.submessages = submessages;
    return this;
  }

   /**
   * Get submessages
   * @return submessages
  **/
  public Object getSubmessages() {
    return submessages;
  }

  public void setSubmessages(Object submessages) {
    this.submessages = submessages;
  }

  public GetMessages timestamp(Object timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  public Object getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Object timestamp) {
    this.timestamp = timestamp;
  }

  public GetMessages type(Object type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public Object getType() {
    return type;
  }

  public void setType(Object type) {
    this.type = type;
  }

  public GetMessages flags(List<String> flags) {
    this.flags = flags;
    return this;
  }

  public GetMessages addFlagsItem(String flagsItem) {
    if (flags == null) {
      flags = new ArrayList<>();
    }
    flags.add(flagsItem);
    return this;
  }

   /**
   * The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
   * @return flags
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(avatarUrl, getMessages.avatarUrl) &&
        Objects.equals(client, getMessages.client) &&
        Objects.equals(content, getMessages.content) &&
        Objects.equals(contentType, getMessages.contentType) &&
        Objects.equals(displayRecipient, getMessages.displayRecipient) &&
        Objects.equals(id, getMessages.id) &&
        Objects.equals(isMeMessage, getMessages.isMeMessage) &&
        Objects.equals(reactions, getMessages.reactions) &&
        Objects.equals(recipientId, getMessages.recipientId) &&
        Objects.equals(senderEmail, getMessages.senderEmail) &&
        Objects.equals(senderFullName, getMessages.senderFullName) &&
        Objects.equals(senderId, getMessages.senderId) &&
        Objects.equals(senderRealmStr, getMessages.senderRealmStr) &&
        Objects.equals(streamId, getMessages.streamId) &&
        Objects.equals(subject, getMessages.subject) &&
        Objects.equals(topicLinks, getMessages.topicLinks) &&
        Objects.equals(submessages, getMessages.submessages) &&
        Objects.equals(timestamp, getMessages.timestamp) &&
        Objects.equals(type, getMessages.type) &&
        Objects.equals(flags, getMessages.flags) &&
        Objects.equals(lastEditTimestamp, getMessages.lastEditTimestamp) &&
        Objects.equals(matchContent, getMessages.matchContent) &&
        Objects.equals(matchSubject, getMessages.matchSubject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, client, content, contentType, displayRecipient, id, isMeMessage, reactions, recipientId, senderEmail, senderFullName, senderId, senderRealmStr, streamId, subject, topicLinks, submessages, timestamp, type, flags, lastEditTimestamp, matchContent, matchSubject);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

