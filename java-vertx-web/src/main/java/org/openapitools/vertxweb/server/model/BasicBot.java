package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.BasicBotAllOf;
import org.openapitools.vertxweb.server.model.BasicBotBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicBot   {
  
  private Object userId = null;
  private Object fullName = null;
  private Object apiKey = null;
  private Object defaultSendingStream = null;
  private Object defaultEventsRegisterStream = null;
  private Object defaultAllPublicStreams = null;
  private Object avatarUrl = null;
  private Object ownerId = null;
  private Object services = null;

  public BasicBot () {

  }

  public BasicBot (Object userId, Object fullName, Object apiKey, Object defaultSendingStream, Object defaultEventsRegisterStream, Object defaultAllPublicStreams, Object avatarUrl, Object ownerId, Object services) {
    this.userId = userId;
    this.fullName = fullName;
    this.apiKey = apiKey;
    this.defaultSendingStream = defaultSendingStream;
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
    this.defaultAllPublicStreams = defaultAllPublicStreams;
    this.avatarUrl = avatarUrl;
    this.ownerId = ownerId;
    this.services = services;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicBot basicBot = (BasicBot) o;
    return Objects.equals(userId, basicBot.userId) &&
        Objects.equals(fullName, basicBot.fullName) &&
        Objects.equals(apiKey, basicBot.apiKey) &&
        Objects.equals(defaultSendingStream, basicBot.defaultSendingStream) &&
        Objects.equals(defaultEventsRegisterStream, basicBot.defaultEventsRegisterStream) &&
        Objects.equals(defaultAllPublicStreams, basicBot.defaultAllPublicStreams) &&
        Objects.equals(avatarUrl, basicBot.avatarUrl) &&
        Objects.equals(ownerId, basicBot.ownerId) &&
        Objects.equals(services, basicBot.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, fullName, apiKey, defaultSendingStream, defaultEventsRegisterStream, defaultAllPublicStreams, avatarUrl, ownerId, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicBot {\n");
    
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
