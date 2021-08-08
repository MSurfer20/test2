package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object containing basic details about the stream. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicStreamBase   {
  
  private Integer streamId;
  private String name;
  private String description;
  private Integer dateCreated;
  private Boolean inviteOnly;
  private String renderedDescription;
  private Boolean isWebPublic;
  private Integer streamPostPolicy;
  private Integer messageRetentionDays;
  private Boolean historyPublicToSubscribers;
  private Integer firstMessageId;
  private Boolean isAnnouncementOnly;

  public BasicStreamBase () {

  }

  public BasicStreamBase (Integer streamId, String name, String description, Integer dateCreated, Boolean inviteOnly, String renderedDescription, Boolean isWebPublic, Integer streamPostPolicy, Integer messageRetentionDays, Boolean historyPublicToSubscribers, Integer firstMessageId, Boolean isAnnouncementOnly) {
    this.streamId = streamId;
    this.name = name;
    this.description = description;
    this.dateCreated = dateCreated;
    this.inviteOnly = inviteOnly;
    this.renderedDescription = renderedDescription;
    this.isWebPublic = isWebPublic;
    this.streamPostPolicy = streamPostPolicy;
    this.messageRetentionDays = messageRetentionDays;
    this.historyPublicToSubscribers = historyPublicToSubscribers;
    this.firstMessageId = firstMessageId;
    this.isAnnouncementOnly = isAnnouncementOnly;
  }

    
  @JsonProperty("stream_id")
  public Integer getStreamId() {
    return streamId;
  }
  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("date_created")
  public Integer getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Integer dateCreated) {
    this.dateCreated = dateCreated;
  }

    
  @JsonProperty("invite_only")
  public Boolean getInviteOnly() {
    return inviteOnly;
  }
  public void setInviteOnly(Boolean inviteOnly) {
    this.inviteOnly = inviteOnly;
  }

    
  @JsonProperty("rendered_description")
  public String getRenderedDescription() {
    return renderedDescription;
  }
  public void setRenderedDescription(String renderedDescription) {
    this.renderedDescription = renderedDescription;
  }

    
  @JsonProperty("is_web_public")
  public Boolean getIsWebPublic() {
    return isWebPublic;
  }
  public void setIsWebPublic(Boolean isWebPublic) {
    this.isWebPublic = isWebPublic;
  }

    
  @JsonProperty("stream_post_policy")
  public Integer getStreamPostPolicy() {
    return streamPostPolicy;
  }
  public void setStreamPostPolicy(Integer streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }

    
  @JsonProperty("message_retention_days")
  public Integer getMessageRetentionDays() {
    return messageRetentionDays;
  }
  public void setMessageRetentionDays(Integer messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }

    
  @JsonProperty("history_public_to_subscribers")
  public Boolean getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }
  public void setHistoryPublicToSubscribers(Boolean historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }

    
  @JsonProperty("first_message_id")
  public Integer getFirstMessageId() {
    return firstMessageId;
  }
  public void setFirstMessageId(Integer firstMessageId) {
    this.firstMessageId = firstMessageId;
  }

    
  @JsonProperty("is_announcement_only")
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
    return Objects.equals(streamId, basicStreamBase.streamId) &&
        Objects.equals(name, basicStreamBase.name) &&
        Objects.equals(description, basicStreamBase.description) &&
        Objects.equals(dateCreated, basicStreamBase.dateCreated) &&
        Objects.equals(inviteOnly, basicStreamBase.inviteOnly) &&
        Objects.equals(renderedDescription, basicStreamBase.renderedDescription) &&
        Objects.equals(isWebPublic, basicStreamBase.isWebPublic) &&
        Objects.equals(streamPostPolicy, basicStreamBase.streamPostPolicy) &&
        Objects.equals(messageRetentionDays, basicStreamBase.messageRetentionDays) &&
        Objects.equals(historyPublicToSubscribers, basicStreamBase.historyPublicToSubscribers) &&
        Objects.equals(firstMessageId, basicStreamBase.firstMessageId) &&
        Objects.equals(isAnnouncementOnly, basicStreamBase.isAnnouncementOnly);
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
