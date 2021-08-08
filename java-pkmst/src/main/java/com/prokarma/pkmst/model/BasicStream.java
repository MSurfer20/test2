package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BasicStreamAllOf;
import com.prokarma.pkmst.model.BasicStreamBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BasicStream
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2021-08-08T21:19:29.098714Z[Etc/UTC]")
public class BasicStream   {
  @JsonProperty("stream_id")
  private Object streamId = null;

  @JsonProperty("name")
  private Object name = null;

  @JsonProperty("description")
  private Object description = null;

  @JsonProperty("date_created")
  private Object dateCreated = null;

  @JsonProperty("invite_only")
  private Object inviteOnly = null;

  @JsonProperty("rendered_description")
  private Object renderedDescription = null;

  @JsonProperty("is_web_public")
  private Object isWebPublic = null;

  @JsonProperty("stream_post_policy")
  private Object streamPostPolicy = null;

  @JsonProperty("message_retention_days")
  private Object messageRetentionDays = null;

  @JsonProperty("history_public_to_subscribers")
  private Object historyPublicToSubscribers = null;

  @JsonProperty("first_message_id")
  private Object firstMessageId = null;

  @JsonProperty("is_announcement_only")
  private Object isAnnouncementOnly = null;

  public BasicStream streamId(Object streamId) {
    this.streamId = streamId;
    return this;
  }

   /**
   * Get streamId
   * @return streamId
  **/
  @ApiModelProperty(value = "")
  public Object getStreamId() {
    return streamId;
  }

  public void setStreamId(Object streamId) {
    this.streamId = streamId;
  }

  public BasicStream name(Object name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }

  public BasicStream description(Object description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public Object getDescription() {
    return description;
  }

  public void setDescription(Object description) {
    this.description = description;
  }

  public BasicStream dateCreated(Object dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @ApiModelProperty(value = "")
  public Object getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Object dateCreated) {
    this.dateCreated = dateCreated;
  }

  public BasicStream inviteOnly(Object inviteOnly) {
    this.inviteOnly = inviteOnly;
    return this;
  }

   /**
   * Get inviteOnly
   * @return inviteOnly
  **/
  @ApiModelProperty(value = "")
  public Object getInviteOnly() {
    return inviteOnly;
  }

  public void setInviteOnly(Object inviteOnly) {
    this.inviteOnly = inviteOnly;
  }

  public BasicStream renderedDescription(Object renderedDescription) {
    this.renderedDescription = renderedDescription;
    return this;
  }

   /**
   * Get renderedDescription
   * @return renderedDescription
  **/
  @ApiModelProperty(value = "")
  public Object getRenderedDescription() {
    return renderedDescription;
  }

  public void setRenderedDescription(Object renderedDescription) {
    this.renderedDescription = renderedDescription;
  }

  public BasicStream isWebPublic(Object isWebPublic) {
    this.isWebPublic = isWebPublic;
    return this;
  }

   /**
   * Get isWebPublic
   * @return isWebPublic
  **/
  @ApiModelProperty(value = "")
  public Object getIsWebPublic() {
    return isWebPublic;
  }

  public void setIsWebPublic(Object isWebPublic) {
    this.isWebPublic = isWebPublic;
  }

  public BasicStream streamPostPolicy(Object streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
    return this;
  }

   /**
   * Get streamPostPolicy
   * @return streamPostPolicy
  **/
  @ApiModelProperty(value = "")
  public Object getStreamPostPolicy() {
    return streamPostPolicy;
  }

  public void setStreamPostPolicy(Object streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }

  public BasicStream messageRetentionDays(Object messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
    return this;
  }

   /**
   * Get messageRetentionDays
   * @return messageRetentionDays
  **/
  @ApiModelProperty(value = "")
  public Object getMessageRetentionDays() {
    return messageRetentionDays;
  }

  public void setMessageRetentionDays(Object messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }

  public BasicStream historyPublicToSubscribers(Object historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
    return this;
  }

   /**
   * Get historyPublicToSubscribers
   * @return historyPublicToSubscribers
  **/
  @ApiModelProperty(value = "")
  public Object getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }

  public void setHistoryPublicToSubscribers(Object historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }

  public BasicStream firstMessageId(Object firstMessageId) {
    this.firstMessageId = firstMessageId;
    return this;
  }

   /**
   * Get firstMessageId
   * @return firstMessageId
  **/
  @ApiModelProperty(value = "")
  public Object getFirstMessageId() {
    return firstMessageId;
  }

  public void setFirstMessageId(Object firstMessageId) {
    this.firstMessageId = firstMessageId;
  }

  public BasicStream isAnnouncementOnly(Object isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
    return this;
  }

   /**
   * Get isAnnouncementOnly
   * @return isAnnouncementOnly
  **/
  @ApiModelProperty(value = "")
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

