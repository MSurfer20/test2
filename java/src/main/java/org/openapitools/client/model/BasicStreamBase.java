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

/**
 * Object containing basic details about the stream. 
 */
@ApiModel(description = "Object containing basic details about the stream. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-08T20:39:18.495644Z[Etc/UTC]")
public class BasicStreamBase {
  public static final String SERIALIZED_NAME_STREAM_ID = "stream_id";
  @SerializedName(SERIALIZED_NAME_STREAM_ID)
  private Integer streamId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private Integer dateCreated;

  public static final String SERIALIZED_NAME_INVITE_ONLY = "invite_only";
  @SerializedName(SERIALIZED_NAME_INVITE_ONLY)
  private Boolean inviteOnly;

  public static final String SERIALIZED_NAME_RENDERED_DESCRIPTION = "rendered_description";
  @SerializedName(SERIALIZED_NAME_RENDERED_DESCRIPTION)
  private String renderedDescription;

  public static final String SERIALIZED_NAME_IS_WEB_PUBLIC = "is_web_public";
  @SerializedName(SERIALIZED_NAME_IS_WEB_PUBLIC)
  private Boolean isWebPublic;

  public static final String SERIALIZED_NAME_STREAM_POST_POLICY = "stream_post_policy";
  @SerializedName(SERIALIZED_NAME_STREAM_POST_POLICY)
  private Integer streamPostPolicy;

  public static final String SERIALIZED_NAME_MESSAGE_RETENTION_DAYS = "message_retention_days";
  @SerializedName(SERIALIZED_NAME_MESSAGE_RETENTION_DAYS)
  private Integer messageRetentionDays;

  public static final String SERIALIZED_NAME_HISTORY_PUBLIC_TO_SUBSCRIBERS = "history_public_to_subscribers";
  @SerializedName(SERIALIZED_NAME_HISTORY_PUBLIC_TO_SUBSCRIBERS)
  private Boolean historyPublicToSubscribers;

  public static final String SERIALIZED_NAME_FIRST_MESSAGE_ID = "first_message_id";
  @SerializedName(SERIALIZED_NAME_FIRST_MESSAGE_ID)
  private Integer firstMessageId;

  public static final String SERIALIZED_NAME_IS_ANNOUNCEMENT_ONLY = "is_announcement_only";
  @SerializedName(SERIALIZED_NAME_IS_ANNOUNCEMENT_ONLY)
  private Boolean isAnnouncementOnly;


  public BasicStreamBase streamId(Integer streamId) {
    
    this.streamId = streamId;
    return this;
  }

   /**
   * The unique ID of the stream. 
   * @return streamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the stream. ")

  public Integer getStreamId() {
    return streamId;
  }


  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }


  public BasicStreamBase name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the stream. 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the stream. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BasicStreamBase description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BasicStreamBase dateCreated(Integer dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). ")

  public Integer getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(Integer dateCreated) {
    this.dateCreated = dateCreated;
  }


  public BasicStreamBase inviteOnly(Boolean inviteOnly) {
    
    this.inviteOnly = inviteOnly;
    return this;
  }

   /**
   * Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
   * @return inviteOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the stream is private or not. Only people who have been invited can access a private stream. ")

  public Boolean getInviteOnly() {
    return inviteOnly;
  }


  public void setInviteOnly(Boolean inviteOnly) {
    this.inviteOnly = inviteOnly;
  }


  public BasicStreamBase renderedDescription(String renderedDescription) {
    
    this.renderedDescription = renderedDescription;
    return this;
  }

   /**
   * The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
   * @return renderedDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. ")

  public String getRenderedDescription() {
    return renderedDescription;
  }


  public void setRenderedDescription(String renderedDescription) {
    this.renderedDescription = renderedDescription;
  }


  public BasicStreamBase isWebPublic(Boolean isWebPublic) {
    
    this.isWebPublic = isWebPublic;
    return this;
  }

   /**
   * Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
   * @return isWebPublic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the stream has been configured to allow unauthenticated access to its message history from the web. ")

  public Boolean getIsWebPublic() {
    return isWebPublic;
  }


  public void setIsWebPublic(Boolean isWebPublic) {
    this.isWebPublic = isWebPublic;
  }


  public BasicStreamBase streamPostPolicy(Integer streamPostPolicy) {
    
    this.streamPostPolicy = streamPostPolicy;
    return this;
  }

   /**
   * Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
   * @return streamPostPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. ")

  public Integer getStreamPostPolicy() {
    return streamPostPolicy;
  }


  public void setStreamPostPolicy(Integer streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }


  public BasicStreamBase messageRetentionDays(Integer messageRetentionDays) {
    
    this.messageRetentionDays = messageRetentionDays;
    return this;
  }

   /**
   * Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
   * @return messageRetentionDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). ")

  public Integer getMessageRetentionDays() {
    return messageRetentionDays;
  }


  public void setMessageRetentionDays(Integer messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }


  public BasicStreamBase historyPublicToSubscribers(Boolean historyPublicToSubscribers) {
    
    this.historyPublicToSubscribers = historyPublicToSubscribers;
    return this;
  }

   /**
   * Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. 
   * @return historyPublicToSubscribers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. ")

  public Boolean getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }


  public void setHistoryPublicToSubscribers(Boolean historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }


  public BasicStreamBase firstMessageId(Integer firstMessageId) {
    
    this.firstMessageId = firstMessageId;
    return this;
  }

   /**
   * The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
   * @return firstMessageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. ")

  public Integer getFirstMessageId() {
    return firstMessageId;
  }


  public void setFirstMessageId(Integer firstMessageId) {
    this.firstMessageId = firstMessageId;
  }


  public BasicStreamBase isAnnouncementOnly(Boolean isAnnouncementOnly) {
    
    this.isAnnouncementOnly = isAnnouncementOnly;
    return this;
  }

   /**
   * Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. 
   * @return isAnnouncementOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. ")

  public Boolean getIsAnnouncementOnly() {
    return isAnnouncementOnly;
  }


  public void setIsAnnouncementOnly(Boolean isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicStreamBase basicStreamBase = (BasicStreamBase) o;
    return Objects.equals(this.streamId, basicStreamBase.streamId) &&
        Objects.equals(this.name, basicStreamBase.name) &&
        Objects.equals(this.description, basicStreamBase.description) &&
        Objects.equals(this.dateCreated, basicStreamBase.dateCreated) &&
        Objects.equals(this.inviteOnly, basicStreamBase.inviteOnly) &&
        Objects.equals(this.renderedDescription, basicStreamBase.renderedDescription) &&
        Objects.equals(this.isWebPublic, basicStreamBase.isWebPublic) &&
        Objects.equals(this.streamPostPolicy, basicStreamBase.streamPostPolicy) &&
        Objects.equals(this.messageRetentionDays, basicStreamBase.messageRetentionDays) &&
        Objects.equals(this.historyPublicToSubscribers, basicStreamBase.historyPublicToSubscribers) &&
        Objects.equals(this.firstMessageId, basicStreamBase.firstMessageId) &&
        Objects.equals(this.isAnnouncementOnly, basicStreamBase.isAnnouncementOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamId, name, description, dateCreated, inviteOnly, renderedDescription, isWebPublic, streamPostPolicy, messageRetentionDays, historyPublicToSubscribers, firstMessageId, isAnnouncementOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicStreamBase {\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    inviteOnly: ").append(toIndentedString(inviteOnly)).append("\n");
    sb.append("    renderedDescription: ").append(toIndentedString(renderedDescription)).append("\n");
    sb.append("    isWebPublic: ").append(toIndentedString(isWebPublic)).append("\n");
    sb.append("    streamPostPolicy: ").append(toIndentedString(streamPostPolicy)).append("\n");
    sb.append("    messageRetentionDays: ").append(toIndentedString(messageRetentionDays)).append("\n");
    sb.append("    historyPublicToSubscribers: ").append(toIndentedString(historyPublicToSubscribers)).append("\n");
    sb.append("    firstMessageId: ").append(toIndentedString(firstMessageId)).append("\n");
    sb.append("    isAnnouncementOnly: ").append(toIndentedString(isAnnouncementOnly)).append("\n");
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

