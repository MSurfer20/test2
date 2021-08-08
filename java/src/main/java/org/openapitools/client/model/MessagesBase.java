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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.EmojiReaction;
import org.openapitools.client.model.MessagesBaseTopicLinks;
import org.openapitools.client.model.OneOfstringarray;

/**
 * Object containing details of the message. 
 */
@ApiModel(description = "Object containing details of the message. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-08T20:41:30.598125Z[Etc/UTC]")
public class MessagesBase {
  public static final String SERIALIZED_NAME_AVATAR_URL = "avatar_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private String avatarUrl;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private String client;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_DISPLAY_RECIPIENT = "display_recipient";
  @SerializedName(SERIALIZED_NAME_DISPLAY_RECIPIENT)
  private OneOfstringarray displayRecipient;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IS_ME_MESSAGE = "is_me_message";
  @SerializedName(SERIALIZED_NAME_IS_ME_MESSAGE)
  private Boolean isMeMessage;

  public static final String SERIALIZED_NAME_REACTIONS = "reactions";
  @SerializedName(SERIALIZED_NAME_REACTIONS)
  private List<EmojiReaction> reactions = null;

  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private Integer recipientId;

  public static final String SERIALIZED_NAME_SENDER_EMAIL = "sender_email";
  @SerializedName(SERIALIZED_NAME_SENDER_EMAIL)
  private String senderEmail;

  public static final String SERIALIZED_NAME_SENDER_FULL_NAME = "sender_full_name";
  @SerializedName(SERIALIZED_NAME_SENDER_FULL_NAME)
  private String senderFullName;

  public static final String SERIALIZED_NAME_SENDER_ID = "sender_id";
  @SerializedName(SERIALIZED_NAME_SENDER_ID)
  private Integer senderId;

  public static final String SERIALIZED_NAME_SENDER_REALM_STR = "sender_realm_str";
  @SerializedName(SERIALIZED_NAME_SENDER_REALM_STR)
  private String senderRealmStr;

  public static final String SERIALIZED_NAME_STREAM_ID = "stream_id";
  @SerializedName(SERIALIZED_NAME_STREAM_ID)
  private Integer streamId;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TOPIC_LINKS = "topic_links";
  @SerializedName(SERIALIZED_NAME_TOPIC_LINKS)
  private List<MessagesBaseTopicLinks> topicLinks = null;

  public static final String SERIALIZED_NAME_SUBMESSAGES = "submessages";
  @SerializedName(SERIALIZED_NAME_SUBMESSAGES)
  private List<String> submessages = null;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public MessagesBase avatarUrl(String avatarUrl) {
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user. 
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. ")

  public String getAvatarUrl() {
    return avatarUrl;
  }


  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public MessagesBase client(String client) {
    
    this.client = client;
    return this;
  }

   /**
   * A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message. 
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Zulip \"client\" string, describing what Zulip client sent the message. ")

  public String getClient() {
    return client;
  }


  public void setClient(String client) {
    this.client = client;
  }


  public MessagesBase content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * The content/body of the message. 
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content/body of the message. ")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public MessagesBase contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set. 
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. ")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public MessagesBase displayRecipient(OneOfstringarray displayRecipient) {
    
    this.displayRecipient = displayRecipient;
    return this;
  }

   /**
   * Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
   * @return displayRecipient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. ")

  public OneOfstringarray getDisplayRecipient() {
    return displayRecipient;
  }


  public void setDisplayRecipient(OneOfstringarray displayRecipient) {
    this.displayRecipient = displayRecipient;
  }


  public MessagesBase id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique message ID.  Messages should always be displayed sorted by ID. 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique message ID.  Messages should always be displayed sorted by ID. ")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public MessagesBase isMeMessage(Boolean isMeMessage) {
    
    this.isMeMessage = isMeMessage;
    return this;
  }

   /**
   * Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
   * @return isMeMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages ")

  public Boolean getIsMeMessage() {
    return isMeMessage;
  }


  public void setIsMeMessage(Boolean isMeMessage) {
    this.isMeMessage = isMeMessage;
  }


  public MessagesBase reactions(List<EmojiReaction> reactions) {
    
    this.reactions = reactions;
    return this;
  }

  public MessagesBase addReactionsItem(EmojiReaction reactionsItem) {
    if (this.reactions == null) {
      this.reactions = new ArrayList<EmojiReaction>();
    }
    this.reactions.add(reactionsItem);
    return this;
  }

   /**
   * Data on any reactions to the message. 
   * @return reactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data on any reactions to the message. ")

  public List<EmojiReaction> getReactions() {
    return reactions;
  }


  public void setReactions(List<EmojiReaction> reactions) {
    this.reactions = reactions;
  }


  public MessagesBase recipientId(Integer recipientId) {
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
   * @return recipientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. ")

  public Integer getRecipientId() {
    return recipientId;
  }


  public void setRecipientId(Integer recipientId) {
    this.recipientId = recipientId;
  }


  public MessagesBase senderEmail(String senderEmail) {
    
    this.senderEmail = senderEmail;
    return this;
  }

   /**
   * The Zulip display email address of the message&#39;s sender. 
   * @return senderEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Zulip display email address of the message's sender. ")

  public String getSenderEmail() {
    return senderEmail;
  }


  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }


  public MessagesBase senderFullName(String senderFullName) {
    
    this.senderFullName = senderFullName;
    return this;
  }

   /**
   * The full name of the message&#39;s sender. 
   * @return senderFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full name of the message's sender. ")

  public String getSenderFullName() {
    return senderFullName;
  }


  public void setSenderFullName(String senderFullName) {
    this.senderFullName = senderFullName;
  }


  public MessagesBase senderId(Integer senderId) {
    
    this.senderId = senderId;
    return this;
  }

   /**
   * The user ID of the message&#39;s sender. 
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user ID of the message's sender. ")

  public Integer getSenderId() {
    return senderId;
  }


  public void setSenderId(Integer senderId) {
    this.senderId = senderId;
  }


  public MessagesBase senderRealmStr(String senderRealmStr) {
    
    this.senderRealmStr = senderRealmStr;
    return this;
  }

   /**
   * A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;. 
   * @return senderRealmStr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. ")

  public String getSenderRealmStr() {
    return senderRealmStr;
  }


  public void setSenderRealmStr(String senderRealmStr) {
    this.senderRealmStr = senderRealmStr;
  }


  public MessagesBase streamId(Integer streamId) {
    
    this.streamId = streamId;
    return this;
  }

   /**
   * Only present for stream messages; the ID of the stream. 
   * @return streamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only present for stream messages; the ID of the stream. ")

  public Integer getStreamId() {
    return streamId;
  }


  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }


  public MessagesBase subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change. 
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. ")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public MessagesBase topicLinks(List<MessagesBaseTopicLinks> topicLinks) {
    
    this.topicLinks = topicLinks;
    return this;
  }

  public MessagesBase addTopicLinksItem(MessagesBaseTopicLinks topicLinksItem) {
    if (this.topicLinks == null) {
      this.topicLinks = new ArrayList<MessagesBaseTopicLinks>();
    }
    this.topicLinks.add(topicLinksItem);
    return this;
  }

   /**
   * Data on any links to be included in the &#x60;topic&#x60; line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message&#39;s topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called &#x60;subject_links&#x60;; clients are recommended to rename &#x60;subject_links&#x60; to &#x60;topic_links&#x60; if present for compatibility with older Zulip servers. 
   * @return topicLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. ")

  public List<MessagesBaseTopicLinks> getTopicLinks() {
    return topicLinks;
  }


  public void setTopicLinks(List<MessagesBaseTopicLinks> topicLinks) {
    this.topicLinks = topicLinks;
  }


  public MessagesBase submessages(List<String> submessages) {
    
    this.submessages = submessages;
    return this;
  }

  public MessagesBase addSubmessagesItem(String submessagesItem) {
    if (this.submessages == null) {
      this.submessages = new ArrayList<String>();
    }
    this.submessages.add(submessagesItem);
    return this;
  }

   /**
   * Data used for certain experimental Zulip integrations. 
   * @return submessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data used for certain experimental Zulip integrations. ")

  public List<String> getSubmessages() {
    return submessages;
  }


  public void setSubmessages(List<String> submessages) {
    this.submessages = submessages;
  }


  public MessagesBase timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The UNIX timestamp for when the message was sent, in UTC seconds. 
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UNIX timestamp for when the message was sent, in UTC seconds. ")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public MessagesBase type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;. 
   * @return type
  **/
  @javax.annotation.Nullable
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
    return Objects.equals(this.avatarUrl, messagesBase.avatarUrl) &&
        Objects.equals(this.client, messagesBase.client) &&
        Objects.equals(this.content, messagesBase.content) &&
        Objects.equals(this.contentType, messagesBase.contentType) &&
        Objects.equals(this.displayRecipient, messagesBase.displayRecipient) &&
        Objects.equals(this.id, messagesBase.id) &&
        Objects.equals(this.isMeMessage, messagesBase.isMeMessage) &&
        Objects.equals(this.reactions, messagesBase.reactions) &&
        Objects.equals(this.recipientId, messagesBase.recipientId) &&
        Objects.equals(this.senderEmail, messagesBase.senderEmail) &&
        Objects.equals(this.senderFullName, messagesBase.senderFullName) &&
        Objects.equals(this.senderId, messagesBase.senderId) &&
        Objects.equals(this.senderRealmStr, messagesBase.senderRealmStr) &&
        Objects.equals(this.streamId, messagesBase.streamId) &&
        Objects.equals(this.subject, messagesBase.subject) &&
        Objects.equals(this.topicLinks, messagesBase.topicLinks) &&
        Objects.equals(this.submessages, messagesBase.submessages) &&
        Objects.equals(this.timestamp, messagesBase.timestamp) &&
        Objects.equals(this.type, messagesBase.type);
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

