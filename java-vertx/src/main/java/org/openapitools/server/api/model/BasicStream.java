package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.BasicStreamAllOf;
import org.openapitools.server.api.model.BasicStreamBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicStream   {
  
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

  public BasicStream () {

  }

  public BasicStream (Object streamId, Object name, Object description, Object dateCreated, Object inviteOnly, Object renderedDescription, Object isWebPublic, Object streamPostPolicy, Object messageRetentionDays, Object historyPublicToSubscribers, Object firstMessageId, Object isAnnouncementOnly) {
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
  public Object getStreamId() {
    return streamId;
  }
  public void setStreamId(Object streamId) {
    this.streamId = streamId;
  }

    
  @JsonProperty("name")
  public Object getName() {
    return name;
  }
  public void setName(Object name) {
    this.name = name;
  }

    
  @JsonProperty("description")
  public Object getDescription() {
    return description;
  }
  public void setDescription(Object description) {
    this.description = description;
  }

    
  @JsonProperty("date_created")
  public Object getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Object dateCreated) {
    this.dateCreated = dateCreated;
  }

    
  @JsonProperty("invite_only")
  public Object getInviteOnly() {
    return inviteOnly;
  }
  public void setInviteOnly(Object inviteOnly) {
    this.inviteOnly = inviteOnly;
  }

    
  @JsonProperty("rendered_description")
  public Object getRenderedDescription() {
    return renderedDescription;
  }
  public void setRenderedDescription(Object renderedDescription) {
    this.renderedDescription = renderedDescription;
  }

    
  @JsonProperty("is_web_public")
  public Object getIsWebPublic() {
    return isWebPublic;
  }
  public void setIsWebPublic(Object isWebPublic) {
    this.isWebPublic = isWebPublic;
  }

    
  @JsonProperty("stream_post_policy")
  public Object getStreamPostPolicy() {
    return streamPostPolicy;
  }
  public void setStreamPostPolicy(Object streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }

    
  @JsonProperty("message_retention_days")
  public Object getMessageRetentionDays() {
    return messageRetentionDays;
  }
  public void setMessageRetentionDays(Object messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }

    
  @JsonProperty("history_public_to_subscribers")
  public Object getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }
  public void setHistoryPublicToSubscribers(Object historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }

    
  @JsonProperty("first_message_id")
  public Object getFirstMessageId() {
    return firstMessageId;
  }
  public void setFirstMessageId(Object firstMessageId) {
    this.firstMessageId = firstMessageId;
  }

    
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
    return Objects.equals(streamId, basicStream.streamId) &&
        Objects.equals(name, basicStream.name) &&
        Objects.equals(description, basicStream.description) &&
        Objects.equals(dateCreated, basicStream.dateCreated) &&
        Objects.equals(inviteOnly, basicStream.inviteOnly) &&
        Objects.equals(renderedDescription, basicStream.renderedDescription) &&
        Objects.equals(isWebPublic, basicStream.isWebPublic) &&
        Objects.equals(streamPostPolicy, basicStream.streamPostPolicy) &&
        Objects.equals(messageRetentionDays, basicStream.messageRetentionDays) &&
        Objects.equals(historyPublicToSubscribers, basicStream.historyPublicToSubscribers) &&
        Objects.equals(firstMessageId, basicStream.firstMessageId) &&
        Objects.equals(isAnnouncementOnly, basicStream.isAnnouncementOnly);
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
