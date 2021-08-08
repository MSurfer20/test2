package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.OneOfobjectobject;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicBotBase   {
  
  private Integer userId;
  private String fullName;
  private String apiKey;
  private String defaultSendingStream;
  private String defaultEventsRegisterStream;
  private Boolean defaultAllPublicStreams;
  private String avatarUrl;
  private Integer ownerId;
  private List<OneOfobjectobject> services = new ArrayList<>();

  public BasicBotBase () {

  }

  public BasicBotBase (Integer userId, String fullName, String apiKey, String defaultSendingStream, String defaultEventsRegisterStream, Boolean defaultAllPublicStreams, String avatarUrl, Integer ownerId, List<OneOfobjectobject> services) {
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
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

    
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

    
  @JsonProperty("api_key")
  public String getApiKey() {
    return apiKey;
  }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

    
  @JsonProperty("default_sending_stream")
  public String getDefaultSendingStream() {
    return defaultSendingStream;
  }
  public void setDefaultSendingStream(String defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
  }

    
  @JsonProperty("default_events_register_stream")
  public String getDefaultEventsRegisterStream() {
    return defaultEventsRegisterStream;
  }
  public void setDefaultEventsRegisterStream(String defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
  }

    
  @JsonProperty("default_all_public_streams")
  public Boolean getDefaultAllPublicStreams() {
    return defaultAllPublicStreams;
  }
  public void setDefaultAllPublicStreams(Boolean defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
  }

    
  @JsonProperty("avatar_url")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

    
  @JsonProperty("owner_id")
  public Integer getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

    
  @JsonProperty("services")
  public List<OneOfobjectobject> getServices() {
    return services;
  }
  public void setServices(List<OneOfobjectobject> services) {
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
    BasicBotBase basicBotBase = (BasicBotBase) o;
    return Objects.equals(userId, basicBotBase.userId) &&
        Objects.equals(fullName, basicBotBase.fullName) &&
        Objects.equals(apiKey, basicBotBase.apiKey) &&
        Objects.equals(defaultSendingStream, basicBotBase.defaultSendingStream) &&
        Objects.equals(defaultEventsRegisterStream, basicBotBase.defaultEventsRegisterStream) &&
        Objects.equals(defaultAllPublicStreams, basicBotBase.defaultAllPublicStreams) &&
        Objects.equals(avatarUrl, basicBotBase.avatarUrl) &&
        Objects.equals(ownerId, basicBotBase.ownerId) &&
        Objects.equals(services, basicBotBase.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, fullName, apiKey, defaultSendingStream, defaultEventsRegisterStream, defaultAllPublicStreams, avatarUrl, ownerId, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicBotBase {\n");
    
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
