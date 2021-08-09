package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-09T21:34:06.844189Z[Etc/UTC]")
public class BasicStreamAllOf   {
  
  private Object streamId = null;
  private Object name = null;
  private Object description = null;
  private Object dateCreated = null;
  private Object inviteOnly = null;
  private Object renderedDescription = null;
  private Object isWebPublic = null;
  private Object streamPostPolicy = null;
  private Object messageRetentionDays = null;
  private Object historyPublicToSubscribers = null;
  private Object firstMessageId = null;
  private Object isAnnouncementOnly = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stream_id")
  public Object getStreamId() {
    return streamId;
  }
  public void setStreamId(Object streamId) {
    this.streamId = streamId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public Object getName() {
    return name;
  }
  public void setName(Object name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public Object getDescription() {
    return description;
  }
  public void setDescription(Object description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("date_created")
  public Object getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Object dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("invite_only")
  public Object getInviteOnly() {
    return inviteOnly;
  }
  public void setInviteOnly(Object inviteOnly) {
    this.inviteOnly = inviteOnly;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rendered_description")
  public Object getRenderedDescription() {
    return renderedDescription;
  }
  public void setRenderedDescription(Object renderedDescription) {
    this.renderedDescription = renderedDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("is_web_public")
  public Object getIsWebPublic() {
    return isWebPublic;
  }
  public void setIsWebPublic(Object isWebPublic) {
    this.isWebPublic = isWebPublic;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stream_post_policy")
  public Object getStreamPostPolicy() {
    return streamPostPolicy;
  }
  public void setStreamPostPolicy(Object streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message_retention_days")
  public Object getMessageRetentionDays() {
    return messageRetentionDays;
  }
  public void setMessageRetentionDays(Object messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("history_public_to_subscribers")
  public Object getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }
  public void setHistoryPublicToSubscribers(Object historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("first_message_id")
  public Object getFirstMessageId() {
    return firstMessageId;
  }
  public void setFirstMessageId(Object firstMessageId) {
    this.firstMessageId = firstMessageId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("is_announcement_only")
  public Object getIsAnnouncementOnly() {
    return isAnnouncementOnly;
  }
  public void setIsAnnouncementOnly(Object isAnnouncementOnly) {
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
    BasicStreamAllOf basicStreamAllOf = (BasicStreamAllOf) o;
    return Objects.equals(streamId, basicStreamAllOf.streamId) &&
        Objects.equals(name, basicStreamAllOf.name) &&
        Objects.equals(description, basicStreamAllOf.description) &&
        Objects.equals(dateCreated, basicStreamAllOf.dateCreated) &&
        Objects.equals(inviteOnly, basicStreamAllOf.inviteOnly) &&
        Objects.equals(renderedDescription, basicStreamAllOf.renderedDescription) &&
        Objects.equals(isWebPublic, basicStreamAllOf.isWebPublic) &&
        Objects.equals(streamPostPolicy, basicStreamAllOf.streamPostPolicy) &&
        Objects.equals(messageRetentionDays, basicStreamAllOf.messageRetentionDays) &&
        Objects.equals(historyPublicToSubscribers, basicStreamAllOf.historyPublicToSubscribers) &&
        Objects.equals(firstMessageId, basicStreamAllOf.firstMessageId) &&
        Objects.equals(isAnnouncementOnly, basicStreamAllOf.isAnnouncementOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamId, name, description, dateCreated, inviteOnly, renderedDescription, isWebPublic, streamPostPolicy, messageRetentionDays, historyPublicToSubscribers, firstMessageId, isAnnouncementOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicStreamAllOf {\n");
    
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

