package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BasicBotAllOf;
import org.openapitools.model.BasicBotBase;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BasicBot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BasicBot   {
  @JsonProperty("user_id")
  private JsonNullable<Object> userId = JsonNullable.undefined();

  @JsonProperty("full_name")
  private JsonNullable<Object> fullName = JsonNullable.undefined();

  @JsonProperty("api_key")
  private JsonNullable<Object> apiKey = JsonNullable.undefined();

  @JsonProperty("default_sending_stream")
  private JsonNullable<Object> defaultSendingStream = JsonNullable.undefined();

  @JsonProperty("default_events_register_stream")
  private JsonNullable<Object> defaultEventsRegisterStream = JsonNullable.undefined();

  @JsonProperty("default_all_public_streams")
  private JsonNullable<Object> defaultAllPublicStreams = JsonNullable.undefined();

  @JsonProperty("avatar_url")
  private JsonNullable<Object> avatarUrl = JsonNullable.undefined();

  @JsonProperty("owner_id")
  private JsonNullable<Object> ownerId = JsonNullable.undefined();

  @JsonProperty("services")
  private JsonNullable<Object> services = JsonNullable.undefined();

  public BasicBot userId(Object userId) {
    this.userId = JsonNullable.of(userId);
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getUserId() {
    return userId;
  }

  public void setUserId(JsonNullable<Object> userId) {
    this.userId = userId;
  }

  public BasicBot fullName(Object fullName) {
    this.fullName = JsonNullable.of(fullName);
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getFullName() {
    return fullName;
  }

  public void setFullName(JsonNullable<Object> fullName) {
    this.fullName = fullName;
  }

  public BasicBot apiKey(Object apiKey) {
    this.apiKey = JsonNullable.of(apiKey);
    return this;
  }

  /**
   * Get apiKey
   * @return apiKey
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getApiKey() {
    return apiKey;
  }

  public void setApiKey(JsonNullable<Object> apiKey) {
    this.apiKey = apiKey;
  }

  public BasicBot defaultSendingStream(Object defaultSendingStream) {
    this.defaultSendingStream = JsonNullable.of(defaultSendingStream);
    return this;
  }

  /**
   * Get defaultSendingStream
   * @return defaultSendingStream
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getDefaultSendingStream() {
    return defaultSendingStream;
  }

  public void setDefaultSendingStream(JsonNullable<Object> defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
  }

  public BasicBot defaultEventsRegisterStream(Object defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = JsonNullable.of(defaultEventsRegisterStream);
    return this;
  }

  /**
   * Get defaultEventsRegisterStream
   * @return defaultEventsRegisterStream
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getDefaultEventsRegisterStream() {
    return defaultEventsRegisterStream;
  }

  public void setDefaultEventsRegisterStream(JsonNullable<Object> defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
  }

  public BasicBot defaultAllPublicStreams(Object defaultAllPublicStreams) {
    this.defaultAllPublicStreams = JsonNullable.of(defaultAllPublicStreams);
    return this;
  }

  /**
   * Get defaultAllPublicStreams
   * @return defaultAllPublicStreams
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getDefaultAllPublicStreams() {
    return defaultAllPublicStreams;
  }

  public void setDefaultAllPublicStreams(JsonNullable<Object> defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
  }

  public BasicBot avatarUrl(Object avatarUrl) {
    this.avatarUrl = JsonNullable.of(avatarUrl);
    return this;
  }

  /**
   * Get avatarUrl
   * @return avatarUrl
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(JsonNullable<Object> avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public BasicBot ownerId(Object ownerId) {
    this.ownerId = JsonNullable.of(ownerId);
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(JsonNullable<Object> ownerId) {
    this.ownerId = ownerId;
  }

  public BasicBot services(Object services) {
    this.services = JsonNullable.of(services);
    return this;
  }

  /**
   * Get services
   * @return services
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getServices() {
    return services;
  }

  public void setServices(JsonNullable<Object> services) {
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

