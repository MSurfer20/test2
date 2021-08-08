package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BasicStreamAllOf;
import org.openapitools.model.BasicStreamBase;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BasicStream
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-08T20:43:06.633496Z[Etc/UTC]")
public class BasicStream   {
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

  public BasicStream streamId(Object streamId) {
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

  public BasicStream name(Object name) {
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

  public BasicStream description(Object description) {
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

  public BasicStream dateCreated(Object dateCreated) {
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

  public BasicStream inviteOnly(Object inviteOnly) {
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

  public BasicStream renderedDescription(Object renderedDescription) {
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

  public BasicStream isWebPublic(Object isWebPublic) {
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

  public BasicStream streamPostPolicy(Object streamPostPolicy) {
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

  public BasicStream messageRetentionDays(Object messageRetentionDays) {
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

  public BasicStream historyPublicToSubscribers(Object historyPublicToSubscribers) {
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

  public BasicStream firstMessageId(Object firstMessageId) {
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

  public BasicStream isAnnouncementOnly(Object isAnnouncementOnly) {
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

