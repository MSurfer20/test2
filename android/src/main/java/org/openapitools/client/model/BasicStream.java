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

import org.openapitools.client.model.BasicStreamAllOf;
import org.openapitools.client.model.BasicStreamBase;
import org.openapitools.client.model.OasAnyTypeNotMapped;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BasicStream {
  
  @SerializedName("stream_id")
  private OasAnyTypeNotMapped streamId = null;
  @SerializedName("name")
  private OasAnyTypeNotMapped name = null;
  @SerializedName("description")
  private OasAnyTypeNotMapped description = null;
  @SerializedName("date_created")
  private OasAnyTypeNotMapped dateCreated = null;
  @SerializedName("invite_only")
  private OasAnyTypeNotMapped inviteOnly = null;
  @SerializedName("rendered_description")
  private OasAnyTypeNotMapped renderedDescription = null;
  @SerializedName("is_web_public")
  private OasAnyTypeNotMapped isWebPublic = null;
  @SerializedName("stream_post_policy")
  private OasAnyTypeNotMapped streamPostPolicy = null;
  @SerializedName("message_retention_days")
  private OasAnyTypeNotMapped messageRetentionDays = null;
  @SerializedName("history_public_to_subscribers")
  private OasAnyTypeNotMapped historyPublicToSubscribers = null;
  @SerializedName("first_message_id")
  private OasAnyTypeNotMapped firstMessageId = null;
  @SerializedName("is_announcement_only")
  private OasAnyTypeNotMapped isAnnouncementOnly = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getStreamId() {
    return streamId;
  }
  public void setStreamId(OasAnyTypeNotMapped streamId) {
    this.streamId = streamId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getName() {
    return name;
  }
  public void setName(OasAnyTypeNotMapped name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getDescription() {
    return description;
  }
  public void setDescription(OasAnyTypeNotMapped description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(OasAnyTypeNotMapped dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getInviteOnly() {
    return inviteOnly;
  }
  public void setInviteOnly(OasAnyTypeNotMapped inviteOnly) {
    this.inviteOnly = inviteOnly;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getRenderedDescription() {
    return renderedDescription;
  }
  public void setRenderedDescription(OasAnyTypeNotMapped renderedDescription) {
    this.renderedDescription = renderedDescription;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getIsWebPublic() {
    return isWebPublic;
  }
  public void setIsWebPublic(OasAnyTypeNotMapped isWebPublic) {
    this.isWebPublic = isWebPublic;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getStreamPostPolicy() {
    return streamPostPolicy;
  }
  public void setStreamPostPolicy(OasAnyTypeNotMapped streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getMessageRetentionDays() {
    return messageRetentionDays;
  }
  public void setMessageRetentionDays(OasAnyTypeNotMapped messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }
  public void setHistoryPublicToSubscribers(OasAnyTypeNotMapped historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getFirstMessageId() {
    return firstMessageId;
  }
  public void setFirstMessageId(OasAnyTypeNotMapped firstMessageId) {
    this.firstMessageId = firstMessageId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getIsAnnouncementOnly() {
    return isAnnouncementOnly;
  }
  public void setIsAnnouncementOnly(OasAnyTypeNotMapped isAnnouncementOnly) {
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
    BasicStream basicStream = (BasicStream) o;
    return (this.streamId == null ? basicStream.streamId == null : this.streamId.equals(basicStream.streamId)) &&
        (this.name == null ? basicStream.name == null : this.name.equals(basicStream.name)) &&
        (this.description == null ? basicStream.description == null : this.description.equals(basicStream.description)) &&
        (this.dateCreated == null ? basicStream.dateCreated == null : this.dateCreated.equals(basicStream.dateCreated)) &&
        (this.inviteOnly == null ? basicStream.inviteOnly == null : this.inviteOnly.equals(basicStream.inviteOnly)) &&
        (this.renderedDescription == null ? basicStream.renderedDescription == null : this.renderedDescription.equals(basicStream.renderedDescription)) &&
        (this.isWebPublic == null ? basicStream.isWebPublic == null : this.isWebPublic.equals(basicStream.isWebPublic)) &&
        (this.streamPostPolicy == null ? basicStream.streamPostPolicy == null : this.streamPostPolicy.equals(basicStream.streamPostPolicy)) &&
        (this.messageRetentionDays == null ? basicStream.messageRetentionDays == null : this.messageRetentionDays.equals(basicStream.messageRetentionDays)) &&
        (this.historyPublicToSubscribers == null ? basicStream.historyPublicToSubscribers == null : this.historyPublicToSubscribers.equals(basicStream.historyPublicToSubscribers)) &&
        (this.firstMessageId == null ? basicStream.firstMessageId == null : this.firstMessageId.equals(basicStream.firstMessageId)) &&
        (this.isAnnouncementOnly == null ? basicStream.isAnnouncementOnly == null : this.isAnnouncementOnly.equals(basicStream.isAnnouncementOnly));
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
    sb.append("class BasicStream {\n");
    
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
