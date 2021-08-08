package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BasicStreamAllOf;
import org.openapitools.model.BasicStreamBase;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T21:20:13.432792Z[Etc/UTC]")public class BasicStream   {
  
  private @Valid Object streamId = null;
  private @Valid Object name = null;
  private @Valid Object description = null;
  private @Valid Object dateCreated = null;
  private @Valid Object inviteOnly = null;
  private @Valid Object renderedDescription = null;
  private @Valid Object isWebPublic = null;
  private @Valid Object streamPostPolicy = null;
  private @Valid Object messageRetentionDays = null;
  private @Valid Object historyPublicToSubscribers = null;
  private @Valid Object firstMessageId = null;
  private @Valid Object isAnnouncementOnly = null;

  /**
   **/
  public BasicStream streamId(Object streamId) {
    this.streamId = streamId;
    return this;
  }

  

  
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
  public BasicStream name(Object name) {
    this.name = name;
    return this;
  }

  

  
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
  public BasicStream description(Object description) {
    this.description = description;
    return this;
  }

  

  
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
  public BasicStream dateCreated(Object dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  

  
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
  public BasicStream inviteOnly(Object inviteOnly) {
    this.inviteOnly = inviteOnly;
    return this;
  }

  

  
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
  public BasicStream renderedDescription(Object renderedDescription) {
    this.renderedDescription = renderedDescription;
    return this;
  }

  

  
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
  public BasicStream isWebPublic(Object isWebPublic) {
    this.isWebPublic = isWebPublic;
    return this;
  }

  

  
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
  public BasicStream streamPostPolicy(Object streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
    return this;
  }

  

  
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
  public BasicStream messageRetentionDays(Object messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
    return this;
  }

  

  
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
  public BasicStream historyPublicToSubscribers(Object historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
    return this;
  }

  

  
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
  public BasicStream firstMessageId(Object firstMessageId) {
    this.firstMessageId = firstMessageId;
    return this;
  }

  

  
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
  public BasicStream isAnnouncementOnly(Object isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
    return this;
  }

  

  
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
    BasicStream basicStream = (BasicStream) o;
    return Objects.equals(this.streamId, basicStream.streamId) &&
        Objects.equals(this.name, basicStream.name) &&
        Objects.equals(this.description, basicStream.description) &&
        Objects.equals(this.dateCreated, basicStream.dateCreated) &&
        Objects.equals(this.inviteOnly, basicStream.inviteOnly) &&
        Objects.equals(this.renderedDescription, basicStream.renderedDescription) &&
        Objects.equals(this.isWebPublic, basicStream.isWebPublic) &&
        Objects.equals(this.streamPostPolicy, basicStream.streamPostPolicy) &&
        Objects.equals(this.messageRetentionDays, basicStream.messageRetentionDays) &&
        Objects.equals(this.historyPublicToSubscribers, basicStream.historyPublicToSubscribers) &&
        Objects.equals(this.firstMessageId, basicStream.firstMessageId) &&
        Objects.equals(this.isAnnouncementOnly, basicStream.isAnnouncementOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamId, name, description, dateCreated, inviteOnly, renderedDescription, isWebPublic, streamPostPolicy, messageRetentionDays, historyPublicToSubscribers, firstMessageId, isAnnouncementOnly);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

