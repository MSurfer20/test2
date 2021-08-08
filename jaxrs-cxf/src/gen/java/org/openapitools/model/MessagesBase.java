package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EmojiReaction;
import org.openapitools.model.MessagesBaseTopicLinks;
import org.openapitools.model.OneOfstringarray;
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
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object containing details of the message. 
 **/
@ApiModel(description="Object containing details of the message. ")
public class MessagesBase  {
  
  @ApiModelProperty(value = "The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. ")
 /**
   * The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
  **/
  private String avatarUrl;

  @ApiModelProperty(value = "A Zulip \"client\" string, describing what Zulip client sent the message. ")
 /**
   * A Zulip \"client\" string, describing what Zulip client sent the message. 
  **/
  private String client;

  @ApiModelProperty(value = "The content/body of the message. ")
 /**
   * The content/body of the message. 
  **/
  private String content;

  @ApiModelProperty(value = "The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. ")
 /**
   * The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
  **/
  private String contentType;

  @ApiModelProperty(value = "Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. ")
  @Valid
 /**
   * Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
  **/
  private OneOfstringarray displayRecipient;

  @ApiModelProperty(value = "The unique message ID.  Messages should always be displayed sorted by ID. ")
 /**
   * The unique message ID.  Messages should always be displayed sorted by ID. 
  **/
  private Integer id;

  @ApiModelProperty(value = "Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages ")
 /**
   * Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
  **/
  private Boolean isMeMessage;

  @ApiModelProperty(value = "Data on any reactions to the message. ")
  @Valid
 /**
   * Data on any reactions to the message. 
  **/
  private List<EmojiReaction> reactions = null;

  @ApiModelProperty(value = "A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. ")
 /**
   * A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
  **/
  private Integer recipientId;

  @ApiModelProperty(value = "The Zulip display email address of the message's sender. ")
 /**
   * The Zulip display email address of the message's sender. 
  **/
  private String senderEmail;

  @ApiModelProperty(value = "The full name of the message's sender. ")
 /**
   * The full name of the message's sender. 
  **/
  private String senderFullName;

  @ApiModelProperty(value = "The user ID of the message's sender. ")
 /**
   * The user ID of the message's sender. 
  **/
  private Integer senderId;

  @ApiModelProperty(value = "A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. ")
 /**
   * A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
  **/
  private String senderRealmStr;

  @ApiModelProperty(value = "Only present for stream messages; the ID of the stream. ")
 /**
   * Only present for stream messages; the ID of the stream. 
  **/
  private Integer streamId;

  @ApiModelProperty(value = "The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. ")
 /**
   * The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
  **/
  private String subject;

  @ApiModelProperty(value = "Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. ")
  @Valid
 /**
   * Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
  **/
  private List<MessagesBaseTopicLinks> topicLinks = null;

  @ApiModelProperty(value = "Data used for certain experimental Zulip integrations. ")
 /**
   * Data used for certain experimental Zulip integrations. 
  **/
  private List<String> submessages = null;

  @ApiModelProperty(value = "The UNIX timestamp for when the message was sent, in UTC seconds. ")
 /**
   * The UNIX timestamp for when the message was sent, in UTC seconds. 
  **/
  private Integer timestamp;

  @ApiModelProperty(value = "The type of the message: `stream` or `private`. ")
 /**
   * The type of the message: `stream` or `private`. 
  **/
  private String type;
 /**
   * The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user. 
   * @return avatarUrl
  **/
  @JsonProperty("avatar_url")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public MessagesBase avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

 /**
   * A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message. 
   * @return client
  **/
  @JsonProperty("client")
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public MessagesBase client(String client) {
    this.client = client;
    return this;
  }

 /**
   * The content/body of the message. 
   * @return content
  **/
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public MessagesBase content(String content) {
    this.content = content;
    return this;
  }

 /**
   * The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set. 
   * @return contentType
  **/
  @JsonProperty("content_type")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public MessagesBase contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
   * Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
   * @return displayRecipient
  **/
  @JsonProperty("display_recipient")
  public OneOfstringarray getDisplayRecipient() {
    return displayRecipient;
  }

  public void setDisplayRecipient(OneOfstringarray displayRecipient) {
    this.displayRecipient = displayRecipient;
  }

  public MessagesBase displayRecipient(OneOfstringarray displayRecipient) {
    this.displayRecipient = displayRecipient;
    return this;
  }

 /**
   * The unique message ID.  Messages should always be displayed sorted by ID. 
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MessagesBase id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
   * @return isMeMessage
  **/
  @JsonProperty("is_me_message")
  public Boolean getIsMeMessage() {
    return isMeMessage;
  }

  public void setIsMeMessage(Boolean isMeMessage) {
    this.isMeMessage = isMeMessage;
  }

  public MessagesBase isMeMessage(Boolean isMeMessage) {
    this.isMeMessage = isMeMessage;
    return this;
  }

 /**
   * Data on any reactions to the message. 
   * @return reactions
  **/
  @JsonProperty("reactions")
  public List<EmojiReaction> getReactions() {
    return reactions;
  }

  public void setReactions(List<EmojiReaction> reactions) {
    this.reactions = reactions;
  }

  public MessagesBase reactions(List<EmojiReaction> reactions) {
    this.reactions = reactions;
    return this;
  }

  public MessagesBase addReactionsItem(EmojiReaction reactionsItem) {
    this.reactions.add(reactionsItem);
    return this;
  }

 /**
   * A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
   * @return recipientId
  **/
  @JsonProperty("recipient_id")
  public Integer getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(Integer recipientId) {
    this.recipientId = recipientId;
  }

  public MessagesBase recipientId(Integer recipientId) {
    this.recipientId = recipientId;
    return this;
  }

 /**
   * The Zulip display email address of the message&#39;s sender. 
   * @return senderEmail
  **/
  @JsonProperty("sender_email")
  public String getSenderEmail() {
    return senderEmail;
  }

  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  public MessagesBase senderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

 /**
   * The full name of the message&#39;s sender. 
   * @return senderFullName
  **/
  @JsonProperty("sender_full_name")
  public String getSenderFullName() {
    return senderFullName;
  }

  public void setSenderFullName(String senderFullName) {
    this.senderFullName = senderFullName;
  }

  public MessagesBase senderFullName(String senderFullName) {
    this.senderFullName = senderFullName;
    return this;
  }

 /**
   * The user ID of the message&#39;s sender. 
   * @return senderId
  **/
  @JsonProperty("sender_id")
  public Integer getSenderId() {
    return senderId;
  }

  public void setSenderId(Integer senderId) {
    this.senderId = senderId;
  }

  public MessagesBase senderId(Integer senderId) {
    this.senderId = senderId;
    return this;
  }

 /**
   * A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;. 
   * @return senderRealmStr
  **/
  @JsonProperty("sender_realm_str")
  public String getSenderRealmStr() {
    return senderRealmStr;
  }

  public void setSenderRealmStr(String senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
  }

  public MessagesBase senderRealmStr(String senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
    return this;
  }

 /**
   * Only present for stream messages; the ID of the stream. 
   * @return streamId
  **/
  @JsonProperty("stream_id")
  public Integer getStreamId() {
    return streamId;
  }

  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }

  public MessagesBase streamId(Integer streamId) {
    this.streamId = streamId;
    return this;
  }

 /**
   * The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change. 
   * @return subject
  **/
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public MessagesBase subject(String subject) {
    this.subject = subject;
    return this;
  }

 /**
   * Data on any links to be included in the &#x60;topic&#x60; line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message&#39;s topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called &#x60;subject_links&#x60;; clients are recommended to rename &#x60;subject_links&#x60; to &#x60;topic_links&#x60; if present for compatibility with older Zulip servers. 
   * @return topicLinks
  **/
  @JsonProperty("topic_links")
  public List<MessagesBaseTopicLinks> getTopicLinks() {
    return topicLinks;
  }

  public void setTopicLinks(List<MessagesBaseTopicLinks> topicLinks) {
    this.topicLinks = topicLinks;
  }

  public MessagesBase topicLinks(List<MessagesBaseTopicLinks> topicLinks) {
    this.topicLinks = topicLinks;
    return this;
  }

  public MessagesBase addTopicLinksItem(MessagesBaseTopicLinks topicLinksItem) {
    this.topicLinks.add(topicLinksItem);
    return this;
  }

 /**
   * Data used for certain experimental Zulip integrations. 
   * @return submessages
  **/
  @JsonProperty("submessages")
  public List<String> getSubmessages() {
    return submessages;
  }

  public void setSubmessages(List<String> submessages) {
    this.submessages = submessages;
  }

  public MessagesBase submessages(List<String> submessages) {
    this.submessages = submessages;
    return this;
  }

  public MessagesBase addSubmessagesItem(String submessagesItem) {
    this.submessages.add(submessagesItem);
    return this;
  }

 /**
   * The UNIX timestamp for when the message was sent, in UTC seconds. 
   * @return timestamp
  **/
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public MessagesBase timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

 /**
   * The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;. 
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MessagesBase type(String type) {
    this.type = type;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

