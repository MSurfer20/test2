package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * BasicStreamAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T21:19:33.131185Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BasicStreamAllOf   {
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

  public BasicStreamAllOf streamId(Object streamId) {
    this.streamId = streamId;
    return this;
  }

   /**
   * Get streamId
   * @return streamId
  **/
  public Object getStreamId() {
    return streamId;
  }

  public void setStreamId(Object streamId) {
    this.streamId = streamId;
  }

  public BasicStreamAllOf name(Object name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }

  public BasicStreamAllOf description(Object description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public Object getDescription() {
    return description;
  }

  public void setDescription(Object description) {
    this.description = description;
  }

  public BasicStreamAllOf dateCreated(Object dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  public Object getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Object dateCreated) {
    this.dateCreated = dateCreated;
  }

  public BasicStreamAllOf inviteOnly(Object inviteOnly) {
    this.inviteOnly = inviteOnly;
    return this;
  }

   /**
   * Get inviteOnly
   * @return inviteOnly
  **/
  public Object getInviteOnly() {
    return inviteOnly;
  }

  public void setInviteOnly(Object inviteOnly) {
    this.inviteOnly = inviteOnly;
  }

  public BasicStreamAllOf renderedDescription(Object renderedDescription) {
    this.renderedDescription = renderedDescription;
    return this;
  }

   /**
   * Get renderedDescription
   * @return renderedDescription
  **/
  public Object getRenderedDescription() {
    return renderedDescription;
  }

  public void setRenderedDescription(Object renderedDescription) {
    this.renderedDescription = renderedDescription;
  }

  public BasicStreamAllOf isWebPublic(Object isWebPublic) {
    this.isWebPublic = isWebPublic;
    return this;
  }

   /**
   * Get isWebPublic
   * @return isWebPublic
  **/
  public Object getIsWebPublic() {
    return isWebPublic;
  }

  public void setIsWebPublic(Object isWebPublic) {
    this.isWebPublic = isWebPublic;
  }

  public BasicStreamAllOf streamPostPolicy(Object streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
    return this;
  }

   /**
   * Get streamPostPolicy
   * @return streamPostPolicy
  **/
  public Object getStreamPostPolicy() {
    return streamPostPolicy;
  }

  public void setStreamPostPolicy(Object streamPostPolicy) {
    this.streamPostPolicy = streamPostPolicy;
  }

  public BasicStreamAllOf messageRetentionDays(Object messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
    return this;
  }

   /**
   * Get messageRetentionDays
   * @return messageRetentionDays
  **/
  public Object getMessageRetentionDays() {
    return messageRetentionDays;
  }

  public void setMessageRetentionDays(Object messageRetentionDays) {
    this.messageRetentionDays = messageRetentionDays;
  }

  public BasicStreamAllOf historyPublicToSubscribers(Object historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
    return this;
  }

   /**
   * Get historyPublicToSubscribers
   * @return historyPublicToSubscribers
  **/
  public Object getHistoryPublicToSubscribers() {
    return historyPublicToSubscribers;
  }

  public void setHistoryPublicToSubscribers(Object historyPublicToSubscribers) {
    this.historyPublicToSubscribers = historyPublicToSubscribers;
  }

  public BasicStreamAllOf firstMessageId(Object firstMessageId) {
    this.firstMessageId = firstMessageId;
    return this;
  }

   /**
   * Get firstMessageId
   * @return firstMessageId
  **/
  public Object getFirstMessageId() {
    return firstMessageId;
  }

  public void setFirstMessageId(Object firstMessageId) {
    this.firstMessageId = firstMessageId;
  }

  public BasicStreamAllOf isAnnouncementOnly(Object isAnnouncementOnly) {
    this.isAnnouncementOnly = isAnnouncementOnly;
    return this;
  }

   /**
   * Get isAnnouncementOnly
   * @return isAnnouncementOnly
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

