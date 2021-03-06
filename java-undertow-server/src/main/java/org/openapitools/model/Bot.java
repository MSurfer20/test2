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
import org.openapitools.model.BasicBotBase;
import org.openapitools.model.BotAllOf;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen")
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

  /**
   */
  public Bot userId(Object userId) {
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
  public Bot fullName(Object fullName) {
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
  public Bot apiKey(Object apiKey) {
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
  public Bot defaultSendingStream(Object defaultSendingStream) {
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
  public Bot defaultEventsRegisterStream(Object defaultEventsRegisterStream) {
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
  public Bot defaultAllPublicStreams(Object defaultAllPublicStreams) {
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
  public Bot avatarUrl(Object avatarUrl) {
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
  public Bot ownerId(Object ownerId) {
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
  public Bot services(Object services) {
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

  /**
   * The email of the bot. 
   */
  public Bot email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "The email of the bot. ")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
   */
  public Bot botType(Integer botType) {
    this.botType = botType;
    return this;
  }

  
  @ApiModelProperty(value = "An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. ")
  @JsonProperty("bot_type")
  public Integer getBotType() {
    return botType;
  }
  public void setBotType(Integer botType) {
    this.botType = botType;
  }

  /**
   * A boolean describing whether the user account has been deactivated. 
   */
  public Bot isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean describing whether the user account has been deactivated. ")
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

