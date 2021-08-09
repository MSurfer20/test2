package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Object containing details of a bot. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-09T21:33:34.002001Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BotAllOf   {
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

  @JsonProperty("email")
  
  private String email;

  @JsonProperty("bot_type")
  
  private Integer botType;

  @JsonProperty("is_active")
  
  private Boolean isActive;

  public BotAllOf userId(Object userId) {
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

  public BotAllOf fullName(Object fullName) {
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

  public BotAllOf apiKey(Object apiKey) {
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

  public BotAllOf defaultSendingStream(Object defaultSendingStream) {
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

  public BotAllOf defaultEventsRegisterStream(Object defaultEventsRegisterStream) {
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

  public BotAllOf defaultAllPublicStreams(Object defaultAllPublicStreams) {
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

  public BotAllOf avatarUrl(Object avatarUrl) {
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

  public BotAllOf ownerId(Object ownerId) {
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

  public BotAllOf services(Object services) {
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

  public BotAllOf email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email of the bot. 
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BotAllOf botType(Integer botType) {
    this.botType = botType;
    return this;
  }

   /**
   * An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
   * @return botType
  **/
  public Integer getBotType() {
    return botType;
  }

  public void setBotType(Integer botType) {
    this.botType = botType;
  }

  public BotAllOf isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * A boolean describing whether the user account has been deactivated. 
   * @return isActive
  **/
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotAllOf botAllOf = (BotAllOf) o;
    return Objects.equals(userId, botAllOf.userId) &&
        Objects.equals(fullName, botAllOf.fullName) &&
        Objects.equals(apiKey, botAllOf.apiKey) &&
        Objects.equals(defaultSendingStream, botAllOf.defaultSendingStream) &&
        Objects.equals(defaultEventsRegisterStream, botAllOf.defaultEventsRegisterStream) &&
        Objects.equals(defaultAllPublicStreams, botAllOf.defaultAllPublicStreams) &&
        Objects.equals(avatarUrl, botAllOf.avatarUrl) &&
        Objects.equals(ownerId, botAllOf.ownerId) &&
        Objects.equals(services, botAllOf.services) &&
        Objects.equals(email, botAllOf.email) &&
        Objects.equals(botType, botAllOf.botType) &&
        Objects.equals(isActive, botAllOf.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, fullName, apiKey, defaultSendingStream, defaultEventsRegisterStream, defaultAllPublicStreams, avatarUrl, ownerId, services, email, botType, isActive);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotAllOf {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    defaultSendingStream: ").append(toIndentedString(defaultSendingStream)).append("\n");
    sb.append("    defaultEventsRegisterStream: ").append(toIndentedString(defaultEventsRegisterStream)).append("\n");
    sb.append("    defaultAllPublicStreams: ").append(toIndentedString(defaultAllPublicStreams)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    botType: ").append(toIndentedString(botType)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

