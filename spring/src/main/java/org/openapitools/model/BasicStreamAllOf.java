package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BasicStreamAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BasicStreamAllOf   {
  @JsonProperty("stream_id")
  private JsonNullable<Object> streamId = JsonNullable.undefined();

  @JsonProperty("name")
  private JsonNullable<Object> name = JsonNullable.undefined();

  @JsonProperty("description")
  private JsonNullable<Object> description = JsonNullable.undefined();

  @JsonProperty("date_created")
  private JsonNullable<Object> dateCreated = JsonNullable.undefined();

  @JsonProperty("invite_only")
  private JsonNullable<Object> inviteOnly = JsonNullable.undefined();

  @JsonProperty("rendered_description")
  private JsonNullable<Object> renderedDescription = JsonNullable.undefined();

  @JsonProperty("is_web_public")
  private JsonNullable<Object> isWebPublic = JsonNullable.undefined();

  @JsonProperty("stream_post_policy")
  private JsonNullable<Object> streamPostPolicy = JsonNullable.undefined();

  @JsonProperty("message_retention_days")
  private JsonNullable<Object> messageRetentionDays = JsonNullable.undefined();

  @JsonProperty("history_public_to_subscribers")
  private JsonNullable<Object> historyPublicToSubscribers = JsonNullable.undefined();

  @JsonProperty("first_message_id")
  private JsonNullable<Object> firstMessageId = JsonNullable.undefined();

  @JsonProperty("is_announcement_only")
  private JsonNullable<Object> isAnnouncementOnly = JsonNullable.undefined();

  public BasicStreamAllOf streamId(Object streamId) {
    this.streamId = JsonNullable.of(streamId);
    return this;
  }

  /**
   * Get streamId
   * @return streamId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getStreamId() {
    return streamId;
  }

  public void setStreamId(JsonNullable<Object> streamId) {
    this.streamId = streamId;
  }

  public BasicStreamAllOf name(Object name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getName() {
    return name;
  }

  public void setName(JsonNullable<Object> name) {
    this.name = name;
  }

  public BasicStreamAllOf description(Object description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<Object> description) {
    this.description = description;
  }

  public BasicStreamAllOf dateCreated(Object dateCreated) {
    this.dateCreated = JsonNullable.of(dateCreated);
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(JsonNullable<Object> dateCreated) {
    this.dateCreated = dateCreated;
  }

  public BasicStreamAllOf inviteOnly(Object inviteOnly) {
    this.inviteOnly = JsonNullable.of(inviteOnly);
    return this;
  }

  /**
   * Get inviteOnly
   * @return inviteOnly
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getInviteOnly() {
    return inviteOnly;
  }

  public void setInviteOnly(JsonNullable<Object> inviteOnly) {
    this.inviteOnly = inviteOnly;
  }

  public BasicStreamAllOf renderedDescription(Object renderedDescription) {
    this.renderedDescription = JsonNullable.of(renderedDescription);
    return this;
  }

  /**
   * Get renderedDescription
   * @return renderedDescription
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getRenderedDescription() {
    return renderedDescription;
  }

  public void setRenderedDescription(JsonNullable<Object> renderedDescription) {
    this.renderedDescription = renderedDescription;
  }

  public BasicStreamAllOf isWebPublic(Object isWebPublic) {
    this.isWebPublic = JsonNullable.of(isWebPublic);
    return this;
  }

  /**
   * Get isWebPublic
   * @return isWebPublic
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getIsWebPublic() {
    return isWebPublic;
  }

  public void setIsWebPublic(JsonNullable<Object> isWebPublic) {
    this.isWebPublic = isWebPublic;
  }

  public BasicStreamAllOf streamPostPolicy(Object streamPostPolicy) {
    this.streamPostPolicy = JsonNullable.of(streamPostPolicy);
    return this;
  }

  /**
   * Get streamPostPolicy
   * @return streamPostPolicy
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getStreamPostPolicy() {
    return streamPostPolicy;
  }

  public void setStreamPostPolicy(JsonNullable<Object> streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }

  public BasicStreamAllOf messageRetentionDays(Object messageRetentionDays) {
    this.messageRetentionDays = JsonNullable.of(messageRetentionDays);
    return this;
  }

  /**
   * Get messageRetentionDays
   * @return messageRetentionDays
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getMessageRetentionDays() {
    return messageRetentionDays;
  }

  public void setMessageRetentionDays(JsonNullable<Object> messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }

  public BasicStreamAllOf historyPublicToSubscribers(Object historyPublicToSubscribers) {
    this.historyPublicToSubscribers = JsonNullable.of(historyPublicToSubscribers);
    return this;
  }

  /**
   * Get historyPublicToSubscribers
   * @return historyPublicToSubscribers
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }

  public void setHistoryPublicToSubscribers(JsonNullable<Object> historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }

  public BasicStreamAllOf firstMessageId(Object firstMessageId) {
    this.firstMessageId = JsonNullable.of(firstMessageId);
    return this;
  }

  /**
   * Get firstMessageId
   * @return firstMessageId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getFirstMessageId() {
    return firstMessageId;
  }

  public void setFirstMessageId(JsonNullable<Object> firstMessageId) {
    this.firstMessageId = firstMessageId;
  }

  public BasicStreamAllOf isAnnouncementOnly(Object isAnnouncementOnly) {
    this.isAnnouncementOnly = JsonNullable.of(isAnnouncementOnly);
    return this;
  }

  /**
   * Get isAnnouncementOnly
   * @return isAnnouncementOnly
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getIsAnnouncementOnly() {
    return isAnnouncementOnly;
  }

  public void setIsAnnouncementOnly(JsonNullable<Object> isAnnouncementOnly) {
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
    return Objects.equals(this.streamId, basicStreamAllOf.streamId) &&
        Objects.equals(this.name, basicStreamAllOf.name) &&
        Objects.equals(this.description, basicStreamAllOf.description) &&
        Objects.equals(this.dateCreated, basicStreamAllOf.dateCreated) &&
        Objects.equals(this.inviteOnly, basicStreamAllOf.inviteOnly) &&
        Objects.equals(this.renderedDescription, basicStreamAllOf.renderedDescription) &&
        Objects.equals(this.isWebPublic, basicStreamAllOf.isWebPublic) &&
        Objects.equals(this.streamPostPolicy, basicStreamAllOf.streamPostPolicy) &&
        Objects.equals(this.messageRetentionDays, basicStreamAllOf.messageRetentionDays) &&
        Objects.equals(this.historyPublicToSubscribers, basicStreamAllOf.historyPublicToSubscribers) &&
        Objects.equals(this.firstMessageId, basicStreamAllOf.firstMessageId) &&
        Objects.equals(this.isAnnouncementOnly, basicStreamAllOf.isAnnouncementOnly);
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

