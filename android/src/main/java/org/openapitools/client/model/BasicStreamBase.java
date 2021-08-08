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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Object containing basic details about the stream. 
 **/
@ApiModel(description = "Object containing basic details about the stream. ")
public class BasicStreamBase {
  
  @SerializedName("stream_id")
  private Integer streamId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("date_created")
  private Integer dateCreated = null;
  @SerializedName("invite_only")
  private Boolean inviteOnly = null;
  @SerializedName("rendered_description")
  private String renderedDescription = null;
  @SerializedName("is_web_public")
  private Boolean isWebPublic = null;
  @SerializedName("stream_post_policy")
  private Integer streamPostPolicy = null;
  @SerializedName("message_retention_days")
  private Integer messageRetentionDays = null;
  @SerializedName("history_public_to_subscribers")
  private Boolean historyPublicToSubscribers = null;
  @SerializedName("first_message_id")
  private Integer firstMessageId = null;
  @SerializedName("is_announcement_only")
  private Boolean isAnnouncementOnly = null;

  /**
   * The unique ID of the stream. 
   **/
  @ApiModelProperty(value = "The unique ID of the stream. ")
  public Integer getStreamId() {
    return streamId;
  }
  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }

  /**
   * The name of the stream. 
   **/
  @ApiModelProperty(value = "The name of the stream. ")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
   **/
  @ApiModelProperty(value = "The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. ")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
   **/
  @ApiModelProperty(value = "The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). ")
  public Integer getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Integer dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
   **/
  @ApiModelProperty(value = "Specifies whether the stream is private or not. Only people who have been invited can access a private stream. ")
  public Boolean getInviteOnly() {
    return inviteOnly;
  }
  public void setInviteOnly(Boolean inviteOnly) {
    this.inviteOnly = inviteOnly;
  }

  /**
   * The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
   **/
  @ApiModelProperty(value = "The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. ")
  public String getRenderedDescription() {
    return renderedDescription;
  }
  public void setRenderedDescription(String renderedDescription) {
    this.renderedDescription = renderedDescription;
  }

  /**
   * Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
   **/
  @ApiModelProperty(value = "Whether the stream has been configured to allow unauthenticated access to its message history from the web. ")
  public Boolean getIsWebPublic() {
    return isWebPublic;
  }
  public void setIsWebPublic(Boolean isWebPublic) {
    this.isWebPublic = isWebPublic;
  }

  /**
   * Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
   **/
  @ApiModelProperty(value = "Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. ")
  public Integer getStreamPostPolicy() {
    return streamPostPolicy;
  }
  public void setStreamPostPolicy(Integer streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }

  /**
   * Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
   **/
  @ApiModelProperty(value = "Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). ")
  public Integer getMessageRetentionDays() {
    return messageRetentionDays;
  }
  public void setMessageRetentionDays(Integer messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }

  /**
   * Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
   **/
  @ApiModelProperty(value = "Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. ")
  public Boolean getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }
  public void setHistoryPublicToSubscribers(Boolean historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }

  /**
   * The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
   **/
  @ApiModelProperty(value = "The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. ")
  public Integer getFirstMessageId() {
    return firstMessageId;
  }
  public void setFirstMessageId(Integer firstMessageId) {
    this.firstMessageId = firstMessageId;
  }

  /**
   * Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
   **/
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
    return (this.streamId == null ? basicStreamBase.streamId == null : this.streamId.equals(basicStreamBase.streamId)) &&
        (this.name == null ? basicStreamBase.name == null : this.name.equals(basicStreamBase.name)) &&
        (this.description == null ? basicStreamBase.description == null : this.description.equals(basicStreamBase.description)) &&
        (this.dateCreated == null ? basicStreamBase.dateCreated == null : this.dateCreated.equals(basicStreamBase.dateCreated)) &&
        (this.inviteOnly == null ? basicStreamBase.inviteOnly == null : this.inviteOnly.equals(basicStreamBase.inviteOnly)) &&
        (this.renderedDescription == null ? basicStreamBase.renderedDescription == null : this.renderedDescription.equals(basicStreamBase.renderedDescription)) &&
        (this.isWebPublic == null ? basicStreamBase.isWebPublic == null : this.isWebPublic.equals(basicStreamBase.isWebPublic)) &&
        (this.streamPostPolicy == null ? basicStreamBase.streamPostPolicy == null : this.streamPostPolicy.equals(basicStreamBase.streamPostPolicy)) &&
        (this.messageRetentionDays == null ? basicStreamBase.messageRetentionDays == null : this.messageRetentionDays.equals(basicStreamBase.messageRetentionDays)) &&
        (this.historyPublicToSubscribers == null ? basicStreamBase.historyPublicToSubscribers == null : this.historyPublicToSubscribers.equals(basicStreamBase.historyPublicToSubscribers)) &&
        (this.firstMessageId == null ? basicStreamBase.firstMessageId == null : this.firstMessageId.equals(basicStreamBase.firstMessageId)) &&
        (this.isAnnouncementOnly == null ? basicStreamBase.isAnnouncementOnly == null : this.isAnnouncementOnly.equals(basicStreamBase.isAnnouncementOnly));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.streamId == null ? 0: this.streamId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.dateCreated == null ? 0: this.dateCreated.hashCode());
    result = 31 * result + (this.inviteOnly == null ? 0: this.inviteOnly.hashCode());
    result = 31 * result + (this.renderedDescription == null ? 0: this.renderedDescription.hashCode());
    result = 31 * result + (this.isWebPublic == null ? 0: this.isWebPublic.hashCode());
    result = 31 * result + (this.streamPostPolicy == null ? 0: this.streamPostPolicy.hashCode());
    result = 31 * result + (this.messageRetentionDays == null ? 0: this.messageRetentionDays.hashCode());
    result = 31 * result + (this.historyPublicToSubscribers == null ? 0: this.historyPublicToSubscribers.hashCode());
    result = 31 * result + (this.firstMessageId == null ? 0: this.firstMessageId.hashCode());
    result = 31 * result + (this.isAnnouncementOnly == null ? 0: this.isAnnouncementOnly.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicStreamBase {\n");
    
    sb.append("  streamId: ").append(streamId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  dateCreated: ").append(dateCreated).append("\n");
    sb.append("  inviteOnly: ").append(inviteOnly).append("\n");
    sb.append("  renderedDescription: ").append(renderedDescription).append("\n");
    sb.append("  isWebPublic: ").append(isWebPublic).append("\n");
    sb.append("  streamPostPolicy: ").append(streamPostPolicy).append("\n");
    sb.append("  messageRetentionDays: ").append(messageRetentionDays).append("\n");
    sb.append("  historyPublicToSubscribers: ").append(historyPublicToSubscribers).append("\n");
    sb.append("  firstMessageId: ").append(firstMessageId).append("\n");
    sb.append("  isAnnouncementOnly: ").append(isAnnouncementOnly).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}