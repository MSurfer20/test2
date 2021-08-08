package org.openapitools.model;

import org.openapitools.model.BasicStreamAllOf;
import org.openapitools.model.BasicStreamBase;
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

public class BasicStream  {
  
  @ApiModelProperty(value = "")
  private Object streamId = null;

  @ApiModelProperty(value = "")
  private Object name = null;

  @ApiModelProperty(value = "")
  private Object description = null;

  @ApiModelProperty(value = "")
  private Object dateCreated = null;

  @ApiModelProperty(value = "")
  private Object inviteOnly = null;

  @ApiModelProperty(value = "")
  private Object renderedDescription = null;

  @ApiModelProperty(value = "")
  private Object isWebPublic = null;

  @ApiModelProperty(value = "")
  private Object streamPostPolicy = null;

  @ApiModelProperty(value = "")
  private Object messageRetentionDays = null;

  @ApiModelProperty(value = "")
  private Object historyPublicToSubscribers = null;

  @ApiModelProperty(value = "")
  private Object firstMessageId = null;

  @ApiModelProperty(value = "")
  private Object isAnnouncementOnly = null;
 /**
   * Get streamId
   * @return streamId
  **/
  @JsonProperty("stream_id")
  public Object getStreamId() {
    return streamId;
  }

  public void setStreamId(Object streamId) {
    this.streamId = streamId;
  }

  public BasicStream streamId(Object streamId) {
    this.streamId = streamId;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }

  public BasicStream name(Object name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public Object getDescription() {
    return description;
  }

  public void setDescription(Object description) {
    this.description = description;
  }

  public BasicStream description(Object description) {
    this.description = description;
    return this;
  }

 /**
   * Get dateCreated
   * @return dateCreated
  **/
  @JsonProperty("date_created")
  public Object getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Object dateCreated) {
    this.dateCreated = dateCreated;
  }

  public BasicStream dateCreated(Object dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

 /**
   * Get inviteOnly
   * @return inviteOnly
  **/
  @JsonProperty("invite_only")
  public Object getInviteOnly() {
    return inviteOnly;
  }

  public void setInviteOnly(Object inviteOnly) {
    this.inviteOnly = inviteOnly;
  }

  public BasicStream inviteOnly(Object inviteOnly) {
    this.inviteOnly = inviteOnly;
    return this;
  }

 /**
   * Get renderedDescription
   * @return renderedDescription
  **/
  @JsonProperty("rendered_description")
  public Object getRenderedDescription() {
    return renderedDescription;
  }

  public void setRenderedDescription(Object renderedDescription) {
    this.renderedDescription = renderedDescription;
  }

  public BasicStream renderedDescription(Object renderedDescription) {
    this.renderedDescription = renderedDescription;
    return this;
  }

 /**
   * Get isWebPublic
   * @return isWebPublic
  **/
  @JsonProperty("is_web_public")
  public Object getIsWebPublic() {
    return isWebPublic;
  }

  public void setIsWebPublic(Object isWebPublic) {
    this.isWebPublic = isWebPublic;
  }

  public BasicStream isWebPublic(Object isWebPublic) {
    this.isWebPublic = isWebPublic;
    return this;
  }

 /**
   * Get streamPostPolicy
   * @return streamPostPolicy
  **/
  @JsonProperty("stream_post_policy")
  public Object getStreamPostPolicy() {
    return streamPostPolicy;
  }

  public void setStreamPostPolicy(Object streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }

  public BasicStream streamPostPolicy(Object streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
    return this;
  }

 /**
   * Get messageRetentionDays
   * @return messageRetentionDays
  **/
  @JsonProperty("message_retention_days")
  public Object getMessageRetentionDays() {
    return messageRetentionDays;
  }

  public void setMessageRetentionDays(Object messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }

  public BasicStream messageRetentionDays(Object messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
    return this;
  }

 /**
   * Get historyPublicToSubscribers
   * @return historyPublicToSubscribers
  **/
  @JsonProperty("history_public_to_subscribers")
  public Object getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }

  public void setHistoryPublicToSubscribers(Object historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }

  public BasicStream historyPublicToSubscribers(Object historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
    return this;
  }

 /**
   * Get firstMessageId
   * @return firstMessageId
  **/
  @JsonProperty("first_message_id")
  public Object getFirstMessageId() {
    return firstMessageId;
  }

  public void setFirstMessageId(Object firstMessageId) {
    this.firstMessageId = firstMessageId;
  }

  public BasicStream firstMessageId(Object firstMessageId) {
    this.firstMessageId = firstMessageId;
    return this;
  }

 /**
   * Get isAnnouncementOnly
   * @return isAnnouncementOnly
  **/
  @JsonProperty("is_announcement_only")
  public Object getIsAnnouncementOnly() {
    return isAnnouncementOnly;
  }

  public void setIsAnnouncementOnly(Object isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
  }

  public BasicStream isAnnouncementOnly(Object isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicStream {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

