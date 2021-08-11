package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * BasicBotAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BasicBotAllOf   {
  @JsonProperty("user_id")
  
  private Object userId = null;

  @JsonProperty("full_name")
  
  private Object fullName = null;

  @JsonProperty("api_key")
  
  private Object apiKey = null;

  @JsonProperty("default_sending_stream")
  
  private Object defaultSendingStream = null;

  @JsonProperty("default_events_register_stream")
  
  private Object defaultEventsRegisterStream = null;

  @JsonProperty("default_all_public_streams")
  
  private Object defaultAllPublicStreams = null;

  @JsonProperty("avatar_url")
  
  private Object avatarUrl = null;

  @JsonProperty("owner_id")
  
  private Object ownerId = null;

  @JsonProperty("services")
  
  private Object services = null;

  public BasicBotAllOf userId(Object userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  public Object getUserId() {
    return userId;
  }

  public void setUserId(Object userId) {
    this.userId = userId;
  }

  public BasicBotAllOf fullName(Object fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  public Object getFullName() {
    return fullName;
  }

  public void setFullName(Object fullName) {
    this.fullName = fullName;
  }

  public BasicBotAllOf apiKey(Object apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  public Object getApiKey() {
    return apiKey;
  }

  public void setApiKey(Object apiKey) {
    this.apiKey = apiKey;
  }

  public BasicBotAllOf defaultSendingStream(Object defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
    return this;
  }

   /**
   * Get defaultSendingStream
   * @return defaultSendingStream
  **/
  public Object getDefaultSendingStream() {
    return defaultSendingStream;
  }

  public void setDefaultSendingStream(Object defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
  }

  public BasicBotAllOf defaultEventsRegisterStream(Object defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
    return this;
  }

   /**
   * Get defaultEventsRegisterStream
   * @return defaultEventsRegisterStream
  **/
  public Object getDefaultEventsRegisterStream() {
    return defaultEventsRegisterStream;
  }

  public void setDefaultEventsRegisterStream(Object defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
  }

  public BasicBotAllOf defaultAllPublicStreams(Object defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
    return this;
  }

   /**
   * Get defaultAllPublicStreams
   * @return defaultAllPublicStreams
  **/
  public Object getDefaultAllPublicStreams() {
    return defaultAllPublicStreams;
  }

  public void setDefaultAllPublicStreams(Object defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
  }

  public BasicBotAllOf avatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  public Object getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public BasicBotAllOf ownerId(Object ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  public Object getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Object ownerId) {
    this.ownerId = ownerId;
  }

  public BasicBotAllOf services(Object services) {
    this.services = services;
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  public Object getServices() {
    return services;
  }

  public void setServices(Object services) {
    this.services = services;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicBotAllOf basicBotAllOf = (BasicBotAllOf) o;
    return Objects.equals(userId, basicBotAllOf.userId) &&
        Objects.equals(fullName, basicBotAllOf.fullName) &&
        Objects.equals(apiKey, basicBotAllOf.apiKey) &&
        Objects.equals(defaultSendingStream, basicBotAllOf.defaultSendingStream) &&
        Objects.equals(defaultEventsRegisterStream, basicBotAllOf.defaultEventsRegisterStream) &&
        Objects.equals(defaultAllPublicStreams, basicBotAllOf.defaultAllPublicStreams) &&
        Objects.equals(avatarUrl, basicBotAllOf.avatarUrl) &&
        Objects.equals(ownerId, basicBotAllOf.ownerId) &&
        Objects.equals(services, basicBotAllOf.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, fullName, apiKey, defaultSendingStream, defaultEventsRegisterStream, defaultAllPublicStreams, avatarUrl, ownerId, services);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicBotAllOf {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    defaultSendingStream: ").append(toIndentedString(defaultSendingStream)).append("\n");
    sb.append("    defaultEventsRegisterStream: ").append(toIndentedString(defaultEventsRegisterStream)).append("\n");
    sb.append("    defaultAllPublicStreams: ").append(toIndentedString(defaultAllPublicStreams)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

