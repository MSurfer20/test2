package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BasicBotBase;
import com.prokarma.pkmst.model.BotAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Bot
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen")
public class Bot   {
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

  public Bot userId(Object userId) {
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

  public Bot fullName(Object fullName) {
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

  public Bot apiKey(Object apiKey) {
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

  public Bot defaultSendingStream(Object defaultSendingStream) {
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

  public Bot defaultEventsRegisterStream(Object defaultEventsRegisterStream) {
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

  public Bot defaultAllPublicStreams(Object defaultAllPublicStreams) {
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

  public Bot avatarUrl(Object avatarUrl) {
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

  public Bot ownerId(Object ownerId) {
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

  public Bot services(Object services) {
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

  public Bot email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email of the bot. 
   * @return email
  **/
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
   * An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
   * @return botType
  **/
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

