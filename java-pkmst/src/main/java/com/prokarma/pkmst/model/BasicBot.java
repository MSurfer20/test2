package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BasicBotAllOf;
import com.prokarma.pkmst.model.BasicBotBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BasicBot
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen")
public class BasicBot   {
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

  public BasicBot userId(Object userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Object getUserId() {
    return userId;
  }

  public void setUserId(Object userId) {
    this.userId = userId;
  }

  public BasicBot fullName(Object fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(value = "")
  public Object getFullName() {
    return fullName;
  }

  public void setFullName(Object fullName) {
    this.fullName = fullName;
  }

  public BasicBot apiKey(Object apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @ApiModelProperty(value = "")
  public Object getApiKey() {
    return apiKey;
  }

  public void setApiKey(Object apiKey) {
    this.apiKey = apiKey;
  }

  public BasicBot defaultSendingStream(Object defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
    return this;
  }

   /**
   * Get defaultSendingStream
   * @return defaultSendingStream
  **/
  @ApiModelProperty(value = "")
  public Object getDefaultSendingStream() {
    return defaultSendingStream;
  }

  public void setDefaultSendingStream(Object defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
  }

  public BasicBot defaultEventsRegisterStream(Object defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
    return this;
  }

   /**
   * Get defaultEventsRegisterStream
   * @return defaultEventsRegisterStream
  **/
  @ApiModelProperty(value = "")
  public Object getDefaultEventsRegisterStream() {
    return defaultEventsRegisterStream;
  }

  public void setDefaultEventsRegisterStream(Object defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
  }

  public BasicBot defaultAllPublicStreams(Object defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
    return this;
  }

   /**
   * Get defaultAllPublicStreams
   * @return defaultAllPublicStreams
  **/
  @ApiModelProperty(value = "")
  public Object getDefaultAllPublicStreams() {
    return defaultAllPublicStreams;
  }

  public void setDefaultAllPublicStreams(Object defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
  }

  public BasicBot avatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "")
  public Object getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public BasicBot ownerId(Object ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")
  public Object getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Object ownerId) {
    this.ownerId = ownerId;
  }

  public BasicBot services(Object services) {
    this.services = services;
    return this;
  }

   /**
   * Get services
   * @return services
  **/
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
    BasicBot basicBot = (BasicBot) o;
    return Objects.equals(this.userId, basicBot.userId) &&
        Objects.equals(this.fullName, basicBot.fullName) &&
        Objects.equals(this.apiKey, basicBot.apiKey) &&
        Objects.equals(this.defaultSendingStream, basicBot.defaultSendingStream) &&
        Objects.equals(this.defaultEventsRegisterStream, basicBot.defaultEventsRegisterStream) &&
        Objects.equals(this.defaultAllPublicStreams, basicBot.defaultAllPublicStreams) &&
        Objects.equals(this.avatarUrl, basicBot.avatarUrl) &&
        Objects.equals(this.ownerId, basicBot.ownerId) &&
        Objects.equals(this.services, basicBot.services);
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

