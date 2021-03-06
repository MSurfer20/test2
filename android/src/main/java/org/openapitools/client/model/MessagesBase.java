/**
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

import java.util.*;
import org.openapitools.client.model.EmojiReaction;
import org.openapitools.client.model.MessagesBaseTopicLinks;
import org.openapitools.client.model.OneOfstringarray;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Object containing details of the message. 
 **/
@ApiModel(description = "Object containing details of the message. ")
public class MessagesBase {
  
  @SerializedName("avatar_url")
  private String avatarUrl = null;
  @SerializedName("client")
  private String client = null;
  @SerializedName("content")
  private String content = null;
  @SerializedName("content_type")
  private String contentType = null;
  @SerializedName("display_recipient")
  private OneOfstringarray displayRecipient = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("is_me_message")
  private Boolean isMeMessage = null;
  @SerializedName("reactions")
  private List<EmojiReaction> reactions = null;
  @SerializedName("recipient_id")
  private Integer recipientId = null;
  @SerializedName("sender_email")
  private String senderEmail = null;
  @SerializedName("sender_full_name")
  private String senderFullName = null;
  @SerializedName("sender_id")
  private Integer senderId = null;
  @SerializedName("sender_realm_str")
  private String senderRealmStr = null;
  @SerializedName("stream_id")
  private Integer streamId = null;
  @SerializedName("subject")
  private String subject = null;
  @SerializedName("topic_links")
  private List<MessagesBaseTopicLinks> topicLinks = null;
  @SerializedName("submessages")
  private List<String> submessages = null;
  @SerializedName("timestamp")
  private Integer timestamp = null;
  @SerializedName("type")
  private String type = null;

  /**
   * The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
   **/
  @ApiModelProperty(value = "The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. ")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * A Zulip \"client\" string, describing what Zulip client sent the message. 
   **/
  @ApiModelProperty(value = "A Zulip \"client\" string, describing what Zulip client sent the message. ")
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
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
   **/
  @ApiModelProperty(value = "The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. ")
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
  public Integer getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(Integer recipientId) {
    this.recipientId = recipientId;
  }

  /**
   * The Zulip display email address of the message's sender. 
   **/
  @ApiModelProperty(value = "The Zulip display email address of the message's sender. ")
  public String getSenderEmail() {
    return senderEmail;
  }
  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  /**
   * The full name of the message's sender. 
   **/
  @ApiModelProperty(value = "The full name of the message's sender. ")
  public String getSenderFullName() {
    return senderFullName;
  }
  public void setSenderFullName(String senderFullName) {
    this.senderFullName = senderFullName;
  }

  /**
   * The user ID of the message's sender. 
   **/
  @ApiModelProperty(value = "The user ID of the message's sender. ")
  public Integer getSenderId() {
    return senderId;
  }
  public void setSenderId(Integer senderId) {
    this.senderId = senderId;
  }

  /**
   * A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
   **/
  @ApiModelProperty(value = "A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. ")
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
  public Integer getStreamId() {
    return streamId;
  }
  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }

  /**
   * The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
   **/
  @ApiModelProperty(value = "The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. ")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
   **/
  @ApiModelProperty(value = "Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. ")
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
  public Integer getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * The type of the message: `stream` or `private`. 
   **/
  @ApiModelProperty(value = "The type of the message: `stream` or `private`. ")
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
    return (this.avatarUrl == null ? messagesBase.avatarUrl == null : this.avatarUrl.equals(messagesBase.avatarUrl)) &&
        (this.client == null ? messagesBase.client == null : this.client.equals(messagesBase.client)) &&
        (this.content == null ? messagesBase.content == null : this.content.equals(messagesBase.content)) &&
        (this.contentType == null ? messagesBase.contentType == null : this.contentType.equals(messagesBase.contentType)) &&
        (this.displayRecipient == null ? messagesBase.displayRecipient == null : this.displayRecipient.equals(messagesBase.displayRecipient)) &&
        (this.id == null ? messagesBase.id == null : this.id.equals(messagesBase.id)) &&
        (this.isMeMessage == null ? messagesBase.isMeMessage == null : this.isMeMessage.equals(messagesBase.isMeMessage)) &&
        (this.reactions == null ? messagesBase.reactions == null : this.reactions.equals(messagesBase.reactions)) &&
        (this.recipientId == null ? messagesBase.recipientId == null : this.recipientId.equals(messagesBase.recipientId)) &&
        (this.senderEmail == null ? messagesBase.senderEmail == null : this.senderEmail.equals(messagesBase.senderEmail)) &&
        (this.senderFullName == null ? messagesBase.senderFullName == null : this.senderFullName.equals(messagesBase.senderFullName)) &&
        (this.senderId == null ? messagesBase.senderId == null : this.senderId.equals(messagesBase.senderId)) &&
        (this.senderRealmStr == null ? messagesBase.senderRealmStr == null : this.senderRealmStr.equals(messagesBase.senderRealmStr)) &&
        (this.streamId == null ? messagesBase.streamId == null : this.streamId.equals(messagesBase.streamId)) &&
        (this.subject == null ? messagesBase.subject == null : this.subject.equals(messagesBase.subject)) &&
        (this.topicLinks == null ? messagesBase.topicLinks == null : this.topicLinks.equals(messagesBase.topicLinks)) &&
        (this.submessages == null ? messagesBase.submessages == null : this.submessages.equals(messagesBase.submessages)) &&
        (this.timestamp == null ? messagesBase.timestamp == null : this.timestamp.equals(messagesBase.timestamp)) &&
        (this.type == null ? messagesBase.type == null : this.type.equals(messagesBase.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.avatarUrl == null ? 0: this.avatarUrl.hashCode());
    result = 31 * result + (this.client == null ? 0: this.client.hashCode());
    result = 31 * result + (this.content == null ? 0: this.content.hashCode());
    result = 31 * result + (this.contentType == null ? 0: this.contentType.hashCode());
    result = 31 * result + (this.displayRecipient == null ? 0: this.displayRecipient.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.isMeMessage == null ? 0: this.isMeMessage.hashCode());
    result = 31 * result + (this.reactions == null ? 0: this.reactions.hashCode());
    result = 31 * result + (this.recipientId == null ? 0: this.recipientId.hashCode());
    result = 31 * result + (this.senderEmail == null ? 0: this.senderEmail.hashCode());
    result = 31 * result + (this.senderFullName == null ? 0: this.senderFullName.hashCode());
    result = 31 * result + (this.senderId == null ? 0: this.senderId.hashCode());
    result = 31 * result + (this.senderRealmStr == null ? 0: this.senderRealmStr.hashCode());
    result = 31 * result + (this.streamId == null ? 0: this.streamId.hashCode());
    result = 31 * result + (this.subject == null ? 0: this.subject.hashCode());
    result = 31 * result + (this.topicLinks == null ? 0: this.topicLinks.hashCode());
    result = 31 * result + (this.submessages == null ? 0: this.submessages.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagesBase {\n");
    
    sb.append("  avatarUrl: ").append(avatarUrl).append("\n");
    sb.append("  client: ").append(client).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("  displayRecipient: ").append(displayRecipient).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  isMeMessage: ").append(isMeMessage).append("\n");
    sb.append("  reactions: ").append(reactions).append("\n");
    sb.append("  recipientId: ").append(recipientId).append("\n");
    sb.append("  senderEmail: ").append(senderEmail).append("\n");
    sb.append("  senderFullName: ").append(senderFullName).append("\n");
    sb.append("  senderId: ").append(senderId).append("\n");
    sb.append("  senderRealmStr: ").append(senderRealmStr).append("\n");
    sb.append("  streamId: ").append(streamId).append("\n");
    sb.append("  subject: ").append(subject).append("\n");
    sb.append("  topicLinks: ").append(topicLinks).append("\n");
    sb.append("  submessages: ").append(submessages).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
