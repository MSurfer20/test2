package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object containing details of a bot. 
 */
@ApiModel(description = "Object containing details of a bot. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-08T21:15:43.843274Z[Etc/UTC]")
public class BotAllOf   {
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

  @JsonProperty("email")
  private String email;

  @JsonProperty("bot_type")
  private JsonNullable<Integer> botType = JsonNullable.undefined();

  @JsonProperty("is_active")
  private Boolean isActive;

  public BotAllOf userId(Object userId) {
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

  public BotAllOf fullName(Object fullName) {
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

  public BotAllOf apiKey(Object apiKey) {
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

  public BotAllOf defaultSendingStream(Object defaultSendingStream) {
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

  public BotAllOf defaultEventsRegisterStream(Object defaultEventsRegisterStream) {
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

  public BotAllOf defaultAllPublicStreams(Object defaultAllPublicStreams) {
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

  public BotAllOf avatarUrl(Object avatarUrl) {
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

  public BotAllOf ownerId(Object ownerId) {
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

  public BotAllOf services(Object services) {
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

  public BotAllOf email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the bot. 
   * @return email
  */
  @ApiModelProperty(value = "The email of the bot. ")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BotAllOf botType(Integer botType) {
    this.botType = JsonNullable.of(botType);
    return this;
  }

  /**
   * An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
   * @return botType
  */
  @ApiModelProperty(value = "An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. ")


  public JsonNullable<Integer> getBotType() {
    return botType;
  }

  public void setBotType(JsonNullable<Integer> botType) {
    this.botType = botType;
  }

  public BotAllOf isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * A boolean describing whether the user account has been deactivated. 
   * @return isActive
  */
  @ApiModelProperty(value = "A boolean describing whether the user account has been deactivated. ")


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
    return Objects.equals(this.userId, botAllOf.userId) &&
        Objects.equals(this.fullName, botAllOf.fullName) &&
        Objects.equals(this.apiKey, botAllOf.apiKey) &&
        Objects.equals(this.defaultSendingStream, botAllOf.defaultSendingStream) &&
        Objects.equals(this.defaultEventsRegisterStream, botAllOf.defaultEventsRegisterStream) &&
        Objects.equals(this.defaultAllPublicStreams, botAllOf.defaultAllPublicStreams) &&
        Objects.equals(this.avatarUrl, botAllOf.avatarUrl) &&
        Objects.equals(this.ownerId, botAllOf.ownerId) &&
        Objects.equals(this.services, botAllOf.services) &&
        Objects.equals(this.email, botAllOf.email) &&
        Objects.equals(this.botType, botAllOf.botType) &&
        Objects.equals(this.isActive, botAllOf.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, fullName, apiKey, defaultSendingStream, defaultEventsRegisterStream, defaultAllPublicStreams, avatarUrl, ownerId, services, email, botType, isActive);
  }

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

