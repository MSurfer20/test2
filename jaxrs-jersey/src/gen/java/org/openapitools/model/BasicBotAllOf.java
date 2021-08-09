/*
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * BasicBotAllOf
 */
@JsonPropertyOrder({
  BasicBotAllOf.JSON_PROPERTY_USER_ID,
  BasicBotAllOf.JSON_PROPERTY_FULL_NAME,
  BasicBotAllOf.JSON_PROPERTY_API_KEY,
  BasicBotAllOf.JSON_PROPERTY_DEFAULT_SENDING_STREAM,
  BasicBotAllOf.JSON_PROPERTY_DEFAULT_EVENTS_REGISTER_STREAM,
  BasicBotAllOf.JSON_PROPERTY_DEFAULT_ALL_PUBLIC_STREAMS,
  BasicBotAllOf.JSON_PROPERTY_AVATAR_URL,
  BasicBotAllOf.JSON_PROPERTY_OWNER_ID,
  BasicBotAllOf.JSON_PROPERTY_SERVICES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-09T21:34:02.517112Z[Etc/UTC]")
public class BasicBotAllOf   {
  public static final String JSON_PROPERTY_USER_ID = "user_id";
  @JsonProperty(JSON_PROPERTY_USER_ID)
  private Object userId = null;

  public static final String JSON_PROPERTY_FULL_NAME = "full_name";
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  private Object fullName = null;

  public static final String JSON_PROPERTY_API_KEY = "api_key";
  @JsonProperty(JSON_PROPERTY_API_KEY)
  private Object apiKey = null;

  public static final String JSON_PROPERTY_DEFAULT_SENDING_STREAM = "default_sending_stream";
  @JsonProperty(JSON_PROPERTY_DEFAULT_SENDING_STREAM)
  private Object defaultSendingStream = null;

  public static final String JSON_PROPERTY_DEFAULT_EVENTS_REGISTER_STREAM = "default_events_register_stream";
  @JsonProperty(JSON_PROPERTY_DEFAULT_EVENTS_REGISTER_STREAM)
  private Object defaultEventsRegisterStream = null;

  public static final String JSON_PROPERTY_DEFAULT_ALL_PUBLIC_STREAMS = "default_all_public_streams";
  @JsonProperty(JSON_PROPERTY_DEFAULT_ALL_PUBLIC_STREAMS)
  private Object defaultAllPublicStreams = null;

  public static final String JSON_PROPERTY_AVATAR_URL = "avatar_url";
  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  private Object avatarUrl = null;

  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  private Object ownerId = null;

  public static final String JSON_PROPERTY_SERVICES = "services";
  @JsonProperty(JSON_PROPERTY_SERVICES)
  private Object services = null;

  public BasicBotAllOf userId(Object userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @JsonProperty(value = "user_id")
  @ApiModelProperty(value = "")
  
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
  @JsonProperty(value = "full_name")
  @ApiModelProperty(value = "")
  
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
  @JsonProperty(value = "api_key")
  @ApiModelProperty(value = "")
  
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
  @JsonProperty(value = "default_sending_stream")
  @ApiModelProperty(value = "")
  
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
  @JsonProperty(value = "default_events_register_stream")
  @ApiModelProperty(value = "")
  
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
  @JsonProperty(value = "default_all_public_streams")
  @ApiModelProperty(value = "")
  
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
  @JsonProperty(value = "avatar_url")
  @ApiModelProperty(value = "")
  
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
  @JsonProperty(value = "owner_id")
  @ApiModelProperty(value = "")
  
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
  @JsonProperty(value = "services")
  @ApiModelProperty(value = "")
  
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
    return Objects.equals(this.userId, basicBotAllOf.userId) &&
        Objects.equals(this.fullName, basicBotAllOf.fullName) &&
        Objects.equals(this.apiKey, basicBotAllOf.apiKey) &&
        Objects.equals(this.defaultSendingStream, basicBotAllOf.defaultSendingStream) &&
        Objects.equals(this.defaultEventsRegisterStream, basicBotAllOf.defaultEventsRegisterStream) &&
        Objects.equals(this.defaultAllPublicStreams, basicBotAllOf.defaultAllPublicStreams) &&
        Objects.equals(this.avatarUrl, basicBotAllOf.avatarUrl) &&
        Objects.equals(this.ownerId, basicBotAllOf.ownerId) &&
        Objects.equals(this.services, basicBotAllOf.services);
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

