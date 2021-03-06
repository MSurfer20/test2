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
import org.openapitools.model.BasicBotBase;
import org.openapitools.model.BotAllOf;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Bot
 */
@JsonPropertyOrder({
  Bot.JSON_PROPERTY_USER_ID,
  Bot.JSON_PROPERTY_FULL_NAME,
  Bot.JSON_PROPERTY_API_KEY,
  Bot.JSON_PROPERTY_DEFAULT_SENDING_STREAM,
  Bot.JSON_PROPERTY_DEFAULT_EVENTS_REGISTER_STREAM,
  Bot.JSON_PROPERTY_DEFAULT_ALL_PUBLIC_STREAMS,
  Bot.JSON_PROPERTY_AVATAR_URL,
  Bot.JSON_PROPERTY_OWNER_ID,
  Bot.JSON_PROPERTY_SERVICES,
  Bot.JSON_PROPERTY_EMAIL,
  Bot.JSON_PROPERTY_BOT_TYPE,
  Bot.JSON_PROPERTY_IS_ACTIVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class Bot   {
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

  public static final String JSON_PROPERTY_EMAIL = "email";
  @JsonProperty(JSON_PROPERTY_EMAIL)
  private String email;

  public static final String JSON_PROPERTY_BOT_TYPE = "bot_type";
  @JsonProperty(JSON_PROPERTY_BOT_TYPE)
  private Integer botType;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  private Boolean isActive;

  public Bot userId(Object userId) {
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

  public Bot fullName(Object fullName) {
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

  public Bot apiKey(Object apiKey) {
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

  public Bot defaultSendingStream(Object defaultSendingStream) {
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

  public Bot defaultEventsRegisterStream(Object defaultEventsRegisterStream) {
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

  public Bot defaultAllPublicStreams(Object defaultAllPublicStreams) {
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

  public Bot avatarUrl(Object avatarUrl) {
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

  public Bot ownerId(Object ownerId) {
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

  public Bot services(Object services) {
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

  public Bot email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the bot. 
   * @return email
   **/
  @JsonProperty(value = "email")
  @ApiModelProperty(value = "The email of the bot. ")
  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Bot botType(Integer botType) {
    this.botType = botType;
    return this;
  }

  /**
   * An integer describing the type of bot: * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot. 
   * @return botType
   **/
  @JsonProperty(value = "bot_type")
  @ApiModelProperty(value = "An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. ")
  
  public Integer getBotType() {
    return botType;
  }

  public void setBotType(Integer botType) {
    this.botType = botType;
  }

  public Bot isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * A boolean describing whether the user account has been deactivated. 
   * @return isActive
   **/
  @JsonProperty(value = "is_active")
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
    Bot bot = (Bot) o;
    return Objects.equals(this.userId, bot.userId) &&
        Objects.equals(this.fullName, bot.fullName) &&
        Objects.equals(this.apiKey, bot.apiKey) &&
        Objects.equals(this.defaultSendingStream, bot.defaultSendingStream) &&
        Objects.equals(this.defaultEventsRegisterStream, bot.defaultEventsRegisterStream) &&
        Objects.equals(this.defaultAllPublicStreams, bot.defaultAllPublicStreams) &&
        Objects.equals(this.avatarUrl, bot.avatarUrl) &&
        Objects.equals(this.ownerId, bot.ownerId) &&
        Objects.equals(this.services, bot.services) &&
        Objects.equals(this.email, bot.email) &&
        Objects.equals(this.botType, bot.botType) &&
        Objects.equals(this.isActive, bot.isActive);
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

