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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Object containing basic details about the stream. 
 */
@ApiModel(description = "Object containing basic details about the stream. ")
@JsonPropertyOrder({
  BasicStreamBase.JSON_PROPERTY_STREAM_ID,
  BasicStreamBase.JSON_PROPERTY_NAME,
  BasicStreamBase.JSON_PROPERTY_DESCRIPTION,
  BasicStreamBase.JSON_PROPERTY_DATE_CREATED,
  BasicStreamBase.JSON_PROPERTY_INVITE_ONLY,
  BasicStreamBase.JSON_PROPERTY_RENDERED_DESCRIPTION,
  BasicStreamBase.JSON_PROPERTY_IS_WEB_PUBLIC,
  BasicStreamBase.JSON_PROPERTY_STREAM_POST_POLICY,
  BasicStreamBase.JSON_PROPERTY_MESSAGE_RETENTION_DAYS,
  BasicStreamBase.JSON_PROPERTY_HISTORY_PUBLIC_TO_SUBSCRIBERS,
  BasicStreamBase.JSON_PROPERTY_FIRST_MESSAGE_ID,
  BasicStreamBase.JSON_PROPERTY_IS_ANNOUNCEMENT_ONLY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:20:01.120158Z[Etc/UTC]")
public class BasicStreamBase   {
  public static final String JSON_PROPERTY_STREAM_ID = "stream_id";
  @JsonProperty(JSON_PROPERTY_STREAM_ID)
  private Integer streamId;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  private String description;

  public static final String JSON_PROPERTY_DATE_CREATED = "date_created";
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  private Integer dateCreated;

  public static final String JSON_PROPERTY_INVITE_ONLY = "invite_only";
  @JsonProperty(JSON_PROPERTY_INVITE_ONLY)
  private Boolean inviteOnly;

  public static final String JSON_PROPERTY_RENDERED_DESCRIPTION = "rendered_description";
  @JsonProperty(JSON_PROPERTY_RENDERED_DESCRIPTION)
  private String renderedDescription;

  public static final String JSON_PROPERTY_IS_WEB_PUBLIC = "is_web_public";
  @JsonProperty(JSON_PROPERTY_IS_WEB_PUBLIC)
  private Boolean isWebPublic;

  public static final String JSON_PROPERTY_STREAM_POST_POLICY = "stream_post_policy";
  @JsonProperty(JSON_PROPERTY_STREAM_POST_POLICY)
  private Integer streamPostPolicy;

  public static final String JSON_PROPERTY_MESSAGE_RETENTION_DAYS = "message_retention_days";
  @JsonProperty(JSON_PROPERTY_MESSAGE_RETENTION_DAYS)
  private Integer messageRetentionDays;

  public static final String JSON_PROPERTY_HISTORY_PUBLIC_TO_SUBSCRIBERS = "history_public_to_subscribers";
  @JsonProperty(JSON_PROPERTY_HISTORY_PUBLIC_TO_SUBSCRIBERS)
  private Boolean historyPublicToSubscribers;

  public static final String JSON_PROPERTY_FIRST_MESSAGE_ID = "first_message_id";
  @JsonProperty(JSON_PROPERTY_FIRST_MESSAGE_ID)
  private Integer firstMessageId;

  public static final String JSON_PROPERTY_IS_ANNOUNCEMENT_ONLY = "is_announcement_only";
  @JsonProperty(JSON_PROPERTY_IS_ANNOUNCEMENT_ONLY)
  private Boolean isAnnouncementOnly;

  public BasicStreamBase streamId(Integer streamId) {
    this.streamId = streamId;
    return this;
  }

  /**
   * The unique ID of the stream. 
   * @return streamId
   **/
  @JsonProperty(value = "stream_id")
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
  @JsonProperty(value = "name")
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
  @JsonProperty(value = "description")
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
  @JsonProperty(value = "date_created")
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
  @JsonProperty(value = "invite_only")
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
  @JsonProperty(value = "rendered_description")
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
  @JsonProperty(value = "is_web_public")
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
  @JsonProperty(value = "stream_post_policy")
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
  @JsonProperty(value = "message_retention_days")
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
  @JsonProperty(value = "history_public_to_subscribers")
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
  @JsonProperty(value = "first_message_id")
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
  @JsonProperty(value = "is_announcement_only")
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

