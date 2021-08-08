package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EmojiReaction;
import org.openapitools.model.MessagesBaseTopicLinks;
import org.openapitools.model.OneOfstringarray;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Object containing details of the message. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-08-08T21:20:09.368890Z[Etc/UTC]")
public class MessagesBase   {
  

  private String avatarUrl;

  private String client;

  private String content;

  private String contentType;

  private OneOfstringarray displayRecipient;

  private Integer id;

  private Boolean isMeMessage;

  private List<EmojiReaction> reactions = new ArrayList<EmojiReaction>();

  private Integer recipientId;

  private String senderEmail;

  private String senderFullName;

  private Integer senderId;

  private String senderRealmStr;

  private Integer streamId;

  private String subject;

  private List<MessagesBaseTopicLinks> topicLinks = new ArrayList<MessagesBaseTopicLinks>();

  private List<String> submessages = new ArrayList<String>();

  private Integer timestamp;

  private String type;

  /**
   * The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user. 
   **/
  
  @ApiModelProperty(value = "The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. ")
  @JsonProperty("avatar_url")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message. 
   **/
  
  @ApiModelProperty(value = "A Zulip \"client\" string, describing what Zulip client sent the message. ")
  @JsonProperty("client")
  public String getClient() {
    return client;
  }
  public void setClient(String client) {
    this.client = client;
  }

  /**
   * The content/body of the message. 
   **/
  
  @ApiModelProperty(value = "The content/body of the message. ")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set. 
   **/
  
  @ApiModelProperty(value = "The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. ")
  @JsonProperty("content_type")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   * Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
   **/
  
  @ApiModelProperty(value = "Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. ")
  @JsonProperty("display_recipient")
  public OneOfstringarray getDisplayRecipient() {
    return displayRecipient;
  }
  public void setDisplayRecipient(OneOfstringarray displayRecipient) {
    this.displayRecipient = displayRecipient;
  }

  /**
   * The unique message ID.  Messages should always be displayed sorted by ID. 
   **/
  
  @ApiModelProperty(value = "The unique message ID.  Messages should always be displayed sorted by ID. ")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
   **/
  
  @ApiModelProperty(value = "Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages ")
  @JsonProperty("is_me_message")
  public Boolean getIsMeMessage() {
    return isMeMessage;
  }
  public void setIsMeMessage(Boolean isMeMessage) {
    this.isMeMessage = isMeMessage;
  }

  /**
   * Data on any reactions to the message. 
   **/
  
  @ApiModelProperty(value = "Data on any reactions to the message. ")
  @JsonProperty("reactions")
  public List<EmojiReaction> getReactions() {
    return reactions;
  }
  public void setReactions(List<EmojiReaction> reactions) {
    this.reactions = reactions;
  }

  /**
   * A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
   **/
  
  @ApiModelProperty(value = "A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. ")
  @JsonProperty("recipient_id")
  public Integer getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(Integer recipientId) {
    this.recipientId = recipientId;
  }

  /**
   * The Zulip display email address of the message&#39;s sender. 
   **/
  
  @ApiModelProperty(value = "The Zulip display email address of the message's sender. ")
  @JsonProperty("sender_email")
  public String getSenderEmail() {
    return senderEmail;
  }
  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  /**
   * The full name of the message&#39;s sender. 
   **/
  
  @ApiModelProperty(value = "The full name of the message's sender. ")
  @JsonProperty("sender_full_name")
  public String getSenderFullName() {
    return senderFullName;
  }
  public void setSenderFullName(String senderFullName) {
    this.senderFullName = senderFullName;
  }

  /**
   * The user ID of the message&#39;s sender. 
   **/
  
  @ApiModelProperty(value = "The user ID of the message's sender. ")
  @JsonProperty("sender_id")
  public Integer getSenderId() {
    return senderId;
  }
  public void setSenderId(Integer senderId) {
    this.senderId = senderId;
  }

  /**
   * A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;. 
   **/
  
  @ApiModelProperty(value = "A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. ")
  @JsonProperty("sender_realm_str")
  public String getSenderRealmStr() {
    return senderRealmStr;
  }
  public void setSenderRealmStr(String senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
  }

  /**
   * Only present for stream messages; the ID of the stream. 
   **/
  
  @ApiModelProperty(value = "Only present for stream messages; the ID of the stream. ")
  @JsonProperty("stream_id")
  public Integer getStreamId() {
    return streamId;
  }
  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }

  /**
   * The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change. 
   **/
  
  @ApiModelProperty(value = "The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. ")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Data on any links to be included in the &#x60;topic&#x60; line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message&#39;s topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called &#x60;subject_links&#x60;; clients are recommended to rename &#x60;subject_links&#x60; to &#x60;topic_links&#x60; if present for compatibility with older Zulip servers. 
   **/
  
  @ApiModelProperty(value = "Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. ")
  @JsonProperty("topic_links")
  public List<MessagesBaseTopicLinks> getTopicLinks() {
    return topicLinks;
  }
  public void setTopicLinks(List<MessagesBaseTopicLinks> topicLinks) {
    this.topicLinks = topicLinks;
  }

  /**
   * Data used for certain experimental Zulip integrations. 
   **/
  
  @ApiModelProperty(value = "Data used for certain experimental Zulip integrations. ")
  @JsonProperty("submessages")
  public List<String> getSubmessages() {
    return submessages;
  }
  public void setSubmessages(List<String> submessages) {
    this.submessages = submessages;
  }

  /**
   * The UNIX timestamp for when the message was sent, in UTC seconds. 
   **/
  
  @ApiModelProperty(value = "The UNIX timestamp for when the message was sent, in UTC seconds. ")
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;. 
   **/
  
  @ApiModelProperty(value = "The type of the message: `stream` or `private`. ")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
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
    MessagesBase messagesBase = (MessagesBase) o;
    return Objects.equals(avatarUrl, messagesBase.avatarUrl) &&
        Objects.equals(client, messagesBase.client) &&
        Objects.equals(content, messagesBase.content) &&
        Objects.equals(contentType, messagesBase.contentType) &&
        Objects.equals(displayRecipient, messagesBase.displayRecipient) &&
        Objects.equals(id, messagesBase.id) &&
        Objects.equals(isMeMessage, messagesBase.isMeMessage) &&
        Objects.equals(reactions, messagesBase.reactions) &&
        Objects.equals(recipientId, messagesBase.recipientId) &&
        Objects.equals(senderEmail, messagesBase.senderEmail) &&
        Objects.equals(senderFullName, messagesBase.senderFullName) &&
        Objects.equals(senderId, messagesBase.senderId) &&
        Objects.equals(senderRealmStr, messagesBase.senderRealmStr) &&
        Objects.equals(streamId, messagesBase.streamId) &&
        Objects.equals(subject, messagesBase.subject) &&
        Objects.equals(topicLinks, messagesBase.topicLinks) &&
        Objects.equals(submessages, messagesBase.submessages) &&
        Objects.equals(timestamp, messagesBase.timestamp) &&
        Objects.equals(type, messagesBase.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, client, content, contentType, displayRecipient, id, isMeMessage, reactions, recipientId, senderEmail, senderFullName, senderId, senderRealmStr, streamId, subject, topicLinks, submessages, timestamp, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagesBase {\n");
    
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

