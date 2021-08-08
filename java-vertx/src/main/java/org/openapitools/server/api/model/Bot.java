package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.BasicBotBase;
import org.openapitools.server.api.model.BotAllOf;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Bot   {
  
  private Object userId = null;
  private Object fullName = null;
  private Object apiKey = null;
  private Object defaultSendingStream = null;
  private Object defaultEventsRegisterStream = null;
  private Object defaultAllPublicStreams = null;
  private Object avatarUrl = null;
  private Object ownerId = null;
  private Object services = null;
  private String email;
  private Integer botType;
  private Boolean isActive;

  public Bot () {

  }

  public Bot (Object userId, Object fullName, Object apiKey, Object defaultSendingStream, Object defaultEventsRegisterStream, Object defaultAllPublicStreams, Object avatarUrl, Object ownerId, Object services, String email, Integer botType, Boolean isActive) {
    this.userId = userId;
    this.fullName = fullName;
    this.apiKey = apiKey;
    this.defaultSendingStream = defaultSendingStream;
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
    this.defaultAllPublicStreams = defaultAllPublicStreams;
    this.avatarUrl = avatarUrl;
    this.ownerId = ownerId;
    this.services = services;
    this.email = email;
    this.botType = botType;
    this.isActive = isActive;
  }

    
  @JsonProperty("user_id")
  public Object getUserId() {
    return userId;
  }
  public void setUserId(Object userId) {
    this.userId = userId;
  }

    
  @JsonProperty("full_name")
  public Object getFullName() {
    return fullName;
  }
  public void setFullName(Object fullName) {
    this.fullName = fullName;
  }

    
  @JsonProperty("api_key")
  public Object getApiKey() {
    return apiKey;
  }
  public void setApiKey(Object apiKey) {
    this.apiKey = apiKey;
  }

    
  @JsonProperty("default_sending_stream")
  public Object getDefaultSendingStream() {
    return defaultSendingStream;
  }
  public void setDefaultSendingStream(Object defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
  }

    
  @JsonProperty("default_events_register_stream")
  public Object getDefaultEventsRegisterStream() {
    return defaultEventsRegisterStream;
  }
  public void setDefaultEventsRegisterStream(Object defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
  }

    
  @JsonProperty("default_all_public_streams")
  public Object getDefaultAllPublicStreams() {
    return defaultAllPublicStreams;
  }
  public void setDefaultAllPublicStreams(Object defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
  }

    
  @JsonProperty("avatar_url")
  public Object getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

    
  @JsonProperty("owner_id")
  public Object getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(Object ownerId) {
    this.ownerId = ownerId;
  }

    
  @JsonProperty("services")
  public Object getServices() {
    return services;
  }
  public void setServices(Object services) {
    this.services = services;
  }

    
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

    
  @JsonProperty("bot_type")
  public Integer getBotType() {
    return botType;
  }
  public void setBotType(Integer botType) {
    this.botType = botType;
  }

    
  @JsonProperty("is_active")
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
    Bot bot = (Bot) o;
    return Objects.equals(userId, bot.userId) &&
        Objects.equals(fullName, bot.fullName) &&
        Objects.equals(apiKey, bot.apiKey) &&
        Objects.equals(defaultSendingStream, bot.defaultSendingStream) &&
        Objects.equals(defaultEventsRegisterStream, bot.defaultEventsRegisterStream) &&
        Objects.equals(defaultAllPublicStreams, bot.defaultAllPublicStreams) &&
        Objects.equals(avatarUrl, bot.avatarUrl) &&
        Objects.equals(ownerId, bot.ownerId) &&
        Objects.equals(services, bot.services) &&
        Objects.equals(email, bot.email) &&
        Objects.equals(botType, bot.botType) &&
        Objects.equals(isActive, bot.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, fullName, apiKey, defaultSendingStream, defaultEventsRegisterStream, defaultAllPublicStreams, avatarUrl, ownerId, services, email, botType, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bot {\n");
    
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
