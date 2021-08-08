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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object containing details of the message. 
 */
@ApiModel(description="Object containing details of the message. ")

public class MessagesBase  {
  
 /**
  * The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
  */
  @ApiModelProperty(value = "The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. ")
  private String avatarUrl;

 /**
  * A Zulip \"client\" string, describing what Zulip client sent the message. 
  */
  @ApiModelProperty(value = "A Zulip \"client\" string, describing what Zulip client sent the message. ")
  private String client;

 /**
  * The content/body of the message. 
  */
  @ApiModelProperty(value = "The content/body of the message. ")
  private String content;

 /**
  * The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
  */
  @ApiModelProperty(value = "The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. ")
  private String contentType;

 /**
  * Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
  */
  @ApiModelProperty(value = "Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. ")
  @Valid
  private OneOfstringarray displayRecipient;

 /**
  * The unique message ID.  Messages should always be displayed sorted by ID. 
  */
  @ApiModelProperty(value = "The unique message ID.  Messages should always be displayed sorted by ID. ")
  private Integer id;

 /**
  * Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
  */
  @ApiModelProperty(value = "Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages ")
  private Boolean isMeMessage;

 /**
  * Data on any reactions to the message. 
  */
  @ApiModelProperty(value = "Data on any reactions to the message. ")
  @Valid
  private List<EmojiReaction> reactions = null;

 /**
  * A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
  */
  @ApiModelProperty(value = "A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. ")
  private Integer recipientId;

 /**
  * The Zulip display email address of the message's sender. 
  */
  @ApiModelProperty(value = "The Zulip display email address of the message's sender. ")
  private String senderEmail;

 /**
  * The full name of the message's sender. 
  */
  @ApiModelProperty(value = "The full name of the message's sender. ")
  private String senderFullName;

 /**
  * The user ID of the message's sender. 
  */
  @ApiModelProperty(value = "The user ID of the message's sender. ")
  private Integer senderId;

 /**
  * A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
  */
  @ApiModelProperty(value = "A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. ")
  private String senderRealmStr;

 /**
  * Only present for stream messages; the ID of the stream. 
  */
  @ApiModelProperty(value = "Only present for stream messages; the ID of the stream. ")
  private Integer streamId;

 /**
  * The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
  */
  @ApiModelProperty(value = "The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. ")
  private String subject;

 /**
  * Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
  */
  @ApiModelProperty(value = "Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. ")
  @Valid
  private List<MessagesBaseTopicLinks> topicLinks = null;

 /**
  * Data used for certain experimental Zulip integrations. 
  */
  @ApiModelProperty(value = "Data used for certain experimental Zulip integrations. ")
  private List<String> submessages = null;

 /**
  * The UNIX timestamp for when the message was sent, in UTC seconds. 
  */
  @ApiModelProperty(value = "The UNIX timestamp for when the message was sent, in UTC seconds. ")
  private Integer timestamp;

 /**
  * The type of the message: `stream` or `private`. 
  */
  @ApiModelProperty(value = "The type of the message: `stream` or `private`. ")
  private String type;
 /**
  * The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user. 
  * @return avatarUrl
  */
  @JsonProperty("avatar_url")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  /**
   * Sets the <code>avatarUrl</code> property.
   */
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * Sets the <code>avatarUrl</code> property.
   */
  public MessagesBase avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

 /**
  * A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message. 
  * @return client
  */
  @JsonProperty("client")
  public String getClient() {
    return client;
  }

  /**
   * Sets the <code>client</code> property.
   */
  public void setClient(String client) {
    this.client = client;
  }

  /**
   * Sets the <code>client</code> property.
   */
  public MessagesBase client(String client) {
    this.client = client;
    return this;
  }

 /**
  * The content/body of the message. 
  * @return content
  */
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  /**
   * Sets the <code>content</code> property.
   */
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * Sets the <code>content</code> property.
   */
  public MessagesBase content(String content) {
    this.content = content;
    return this;
  }

 /**
  * The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set. 
  * @return contentType
  */
  @JsonProperty("content_type")
  public String getContentType() {
    return contentType;
  }

  /**
   * Sets the <code>contentType</code> property.
   */
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   * Sets the <code>contentType</code> property.
   */
  public MessagesBase contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
  * Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
  * @return displayRecipient
  */
  @JsonProperty("display_recipient")
  public OneOfstringarray getDisplayRecipient() {
    return displayRecipient;
  }

  /**
   * Sets the <code>displayRecipient</code> property.
   */
  public void setDisplayRecipient(OneOfstringarray displayRecipient) {
    this.displayRecipient = displayRecipient;
  }

  /**
   * Sets the <code>displayRecipient</code> property.
   */
  public MessagesBase displayRecipient(OneOfstringarray displayRecipient) {
    this.displayRecipient = displayRecipient;
    return this;
  }

 /**
  * The unique message ID.  Messages should always be displayed sorted by ID. 
  * @return id
  */
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public MessagesBase id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
  * @return isMeMessage
  */
  @JsonProperty("is_me_message")
  public Boolean getIsMeMessage() {
    return isMeMessage;
  }

  /**
   * Sets the <code>isMeMessage</code> property.
   */
  public void setIsMeMessage(Boolean isMeMessage) {
    this.isMeMessage = isMeMessage;
  }

  /**
   * Sets the <code>isMeMessage</code> property.
   */
  public MessagesBase isMeMessage(Boolean isMeMessage) {
    this.isMeMessage = isMeMessage;
    return this;
  }

 /**
  * Data on any reactions to the message. 
  * @return reactions
  */
  @JsonProperty("reactions")
  public List<EmojiReaction> getReactions() {
    return reactions;
  }

  /**
   * Sets the <code>reactions</code> property.
   */
  public void setReactions(List<EmojiReaction> reactions) {
    this.reactions = reactions;
  }

  /**
   * Sets the <code>reactions</code> property.
   */
  public MessagesBase reactions(List<EmojiReaction> reactions) {
    this.reactions = reactions;
    return this;
  }

  /**
   * Adds a new item to the <code>reactions</code> list.
   */
  public MessagesBase addReactionsItem(EmojiReaction reactionsItem) {
    this.reactions.add(reactionsItem);
    return this;
  }

 /**
  * A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
  * @return recipientId
  */
  @JsonProperty("recipient_id")
  public Integer getRecipientId() {
    return recipientId;
  }

  /**
   * Sets the <code>recipientId</code> property.
   */
  public void setRecipientId(Integer recipientId) {
    this.recipientId = recipientId;
  }

  /**
   * Sets the <code>recipientId</code> property.
   */
  public MessagesBase recipientId(Integer recipientId) {
    this.recipientId = recipientId;
    return this;
  }

 /**
  * The Zulip display email address of the message&#39;s sender. 
  * @return senderEmail
  */
  @JsonProperty("sender_email")
  public String getSenderEmail() {
    return senderEmail;
  }

  /**
   * Sets the <code>senderEmail</code> property.
   */
  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  /**
   * Sets the <code>senderEmail</code> property.
   */
  public MessagesBase senderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

 /**
  * The full name of the message&#39;s sender. 
  * @return senderFullName
  */
  @JsonProperty("sender_full_name")
  public String getSenderFullName() {
    return senderFullName;
  }

  /**
   * Sets the <code>senderFullName</code> property.
   */
  public void setSenderFullName(String senderFullName) {
    this.senderFullName = senderFullName;
  }

  /**
   * Sets the <code>senderFullName</code> property.
   */
  public MessagesBase senderFullName(String senderFullName) {
    this.senderFullName = senderFullName;
    return this;
  }

 /**
  * The user ID of the message&#39;s sender. 
  * @return senderId
  */
  @JsonProperty("sender_id")
  public Integer getSenderId() {
    return senderId;
  }

  /**
   * Sets the <code>senderId</code> property.
   */
  public void setSenderId(Integer senderId) {
    this.senderId = senderId;
  }

  /**
   * Sets the <code>senderId</code> property.
   */
  public MessagesBase senderId(Integer senderId) {
    this.senderId = senderId;
    return this;
  }

 /**
  * A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;. 
  * @return senderRealmStr
  */
  @JsonProperty("sender_realm_str")
  public String getSenderRealmStr() {
    return senderRealmStr;
  }

  /**
   * Sets the <code>senderRealmStr</code> property.
   */
  public void setSenderRealmStr(String senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
  }

  /**
   * Sets the <code>senderRealmStr</code> property.
   */
  public MessagesBase senderRealmStr(String senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
    return this;
  }

 /**
  * Only present for stream messages; the ID of the stream. 
  * @return streamId
  */
  @JsonProperty("stream_id")
  public Integer getStreamId() {
    return streamId;
  }

  /**
   * Sets the <code>streamId</code> property.
   */
  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }

  /**
   * Sets the <code>streamId</code> property.
   */
  public MessagesBase streamId(Integer streamId) {
    this.streamId = streamId;
    return this;
  }

 /**
  * The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change. 
  * @return subject
  */
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }

  /**
   * Sets the <code>subject</code> property.
   */
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Sets the <code>subject</code> property.
   */
  public MessagesBase subject(String subject) {
    this.subject = subject;
    return this;
  }

 /**
  * Data on any links to be included in the &#x60;topic&#x60; line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message&#39;s topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called &#x60;subject_links&#x60;; clients are recommended to rename &#x60;subject_links&#x60; to &#x60;topic_links&#x60; if present for compatibility with older Zulip servers. 
  * @return topicLinks
  */
  @JsonProperty("topic_links")
  public List<MessagesBaseTopicLinks> getTopicLinks() {
    return topicLinks;
  }

  /**
   * Sets the <code>topicLinks</code> property.
   */
  public void setTopicLinks(List<MessagesBaseTopicLinks> topicLinks) {
    this.topicLinks = topicLinks;
  }

  /**
   * Sets the <code>topicLinks</code> property.
   */
  public MessagesBase topicLinks(List<MessagesBaseTopicLinks> topicLinks) {
    this.topicLinks = topicLinks;
    return this;
  }

  /**
   * Adds a new item to the <code>topicLinks</code> list.
   */
  public MessagesBase addTopicLinksItem(MessagesBaseTopicLinks topicLinksItem) {
    this.topicLinks.add(topicLinksItem);
    return this;
  }

 /**
  * Data used for certain experimental Zulip integrations. 
  * @return submessages
  */
  @JsonProperty("submessages")
  public List<String> getSubmessages() {
    return submessages;
  }

  /**
   * Sets the <code>submessages</code> property.
   */
  public void setSubmessages(List<String> submessages) {
    this.submessages = submessages;
  }

  /**
   * Sets the <code>submessages</code> property.
   */
  public MessagesBase submessages(List<String> submessages) {
    this.submessages = submessages;
    return this;
  }

  /**
   * Adds a new item to the <code>submessages</code> list.
   */
  public MessagesBase addSubmessagesItem(String submessagesItem) {
    this.submessages.add(submessagesItem);
    return this;
  }

 /**
  * The UNIX timestamp for when the message was sent, in UTC seconds. 
  * @return timestamp
  */
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the <code>timestamp</code> property.
   */
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Sets the <code>timestamp</code> property.
   */
  public MessagesBase timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

 /**
  * The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;. 
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
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

