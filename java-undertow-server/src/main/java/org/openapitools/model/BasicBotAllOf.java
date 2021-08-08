/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * OpenAPI document version: 1.0.0
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2021-08-08T21:19:37.133192Z[Etc/UTC]")
public class BasicBotAllOf   {
  
  private Object userId = null;
  private Object fullName = null;
  private Object apiKey = null;
  private Object defaultSendingStream = null;
  private Object defaultEventsRegisterStream = null;
  private Object defaultAllPublicStreams = null;
  private Object avatarUrl = null;
  private Object ownerId = null;
  private Object services = null;

  /**
   */
  public BasicBotAllOf userId(Object userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user_id")
  public Object getUserId() {
    return userId;
  }
  public void setUserId(Object userId) {
    this.userId = userId;
  }

  /**
   */
  public BasicBotAllOf fullName(Object fullName) {
    this.fullName = fullName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("full_name")
  public Object getFullName() {
    return fullName;
  }
  public void setFullName(Object fullName) {
    this.fullName = fullName;
  }

  /**
   */
  public BasicBotAllOf apiKey(Object apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("api_key")
  public Object getApiKey() {
    return apiKey;
  }
  public void setApiKey(Object apiKey) {
    this.apiKey = apiKey;
  }

  /**
   */
  public BasicBotAllOf defaultSendingStream(Object defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default_sending_stream")
  public Object getDefaultSendingStream() {
    return defaultSendingStream;
  }
  public void setDefaultSendingStream(Object defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
  }

  /**
   */
  public BasicBotAllOf defaultEventsRegisterStream(Object defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default_events_register_stream")
  public Object getDefaultEventsRegisterStream() {
    return defaultEventsRegisterStream;
  }
  public void setDefaultEventsRegisterStream(Object defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
  }

  /**
   */
  public BasicBotAllOf defaultAllPublicStreams(Object defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default_all_public_streams")
  public Object getDefaultAllPublicStreams() {
    return defaultAllPublicStreams;
  }
  public void setDefaultAllPublicStreams(Object defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
  }

  /**
   */
  public BasicBotAllOf avatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("avatar_url")
  public Object getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   */
  public BasicBotAllOf ownerId(Object ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("owner_id")
  public Object getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(Object ownerId) {
    this.ownerId = ownerId;
  }

  /**
   */
  public BasicBotAllOf services(Object services) {
    this.services = services;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

