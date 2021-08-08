/**
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

package org.openapitools.client.model;

import org.openapitools.client.model.BasicBotBase;
import org.openapitools.client.model.BotAllOf;
import org.openapitools.client.model.OasAnyTypeNotMapped;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Bot {
  
  @SerializedName("user_id")
  private OasAnyTypeNotMapped userId = null;
  @SerializedName("full_name")
  private OasAnyTypeNotMapped fullName = null;
  @SerializedName("api_key")
  private OasAnyTypeNotMapped apiKey = null;
  @SerializedName("default_sending_stream")
  private OasAnyTypeNotMapped defaultSendingStream = null;
  @SerializedName("default_events_register_stream")
  private OasAnyTypeNotMapped defaultEventsRegisterStream = null;
  @SerializedName("default_all_public_streams")
  private OasAnyTypeNotMapped defaultAllPublicStreams = null;
  @SerializedName("avatar_url")
  private OasAnyTypeNotMapped avatarUrl = null;
  @SerializedName("owner_id")
  private OasAnyTypeNotMapped ownerId = null;
  @SerializedName("services")
  private OasAnyTypeNotMapped services = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("bot_type")
  private Integer botType = null;
  @SerializedName("is_active")
  private Boolean isActive = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getUserId() {
    return userId;
  }
  public void setUserId(OasAnyTypeNotMapped userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getFullName() {
    return fullName;
  }
  public void setFullName(OasAnyTypeNotMapped fullName) {
    this.fullName = fullName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getApiKey() {
    return apiKey;
  }
  public void setApiKey(OasAnyTypeNotMapped apiKey) {
    this.apiKey = apiKey;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getDefaultSendingStream() {
    return defaultSendingStream;
  }
  public void setDefaultSendingStream(OasAnyTypeNotMapped defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getDefaultEventsRegisterStream() {
    return defaultEventsRegisterStream;
  }
  public void setDefaultEventsRegisterStream(OasAnyTypeNotMapped defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getDefaultAllPublicStreams() {
    return defaultAllPublicStreams;
  }
  public void setDefaultAllPublicStreams(OasAnyTypeNotMapped defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(OasAnyTypeNotMapped avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(OasAnyTypeNotMapped ownerId) {
    this.ownerId = ownerId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OasAnyTypeNotMapped getServices() {
    return services;
  }
  public void setServices(OasAnyTypeNotMapped services) {
    this.services = services;
  }

  /**
   * The email of the bot. 
   **/
  @ApiModelProperty(value = "The email of the bot. ")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
   **/
  @ApiModelProperty(value = "An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. ")
  public Integer getBotType() {
    return botType;
  }
  public void setBotType(Integer botType) {
    this.botType = botType;
  }

  /**
   * A boolean describing whether the user account has been deactivated. 
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
    return (this.userId == null ? bot.userId == null : this.userId.equals(bot.userId)) &&
        (this.fullName == null ? bot.fullName == null : this.fullName.equals(bot.fullName)) &&
        (this.apiKey == null ? bot.apiKey == null : this.apiKey.equals(bot.apiKey)) &&
        (this.defaultSendingStream == null ? bot.defaultSendingStream == null : this.defaultSendingStream.equals(bot.defaultSendingStream)) &&
        (this.defaultEventsRegisterStream == null ? bot.defaultEventsRegisterStream == null : this.defaultEventsRegisterStream.equals(bot.defaultEventsRegisterStream)) &&
        (this.defaultAllPublicStreams == null ? bot.defaultAllPublicStreams == null : this.defaultAllPublicStreams.equals(bot.defaultAllPublicStreams)) &&
        (this.avatarUrl == null ? bot.avatarUrl == null : this.avatarUrl.equals(bot.avatarUrl)) &&
        (this.ownerId == null ? bot.ownerId == null : this.ownerId.equals(bot.ownerId)) &&
        (this.services == null ? bot.services == null : this.services.equals(bot.services)) &&
        (this.email == null ? bot.email == null : this.email.equals(bot.email)) &&
        (this.botType == null ? bot.botType == null : this.botType.equals(bot.botType)) &&
        (this.isActive == null ? bot.isActive == null : this.isActive.equals(bot.isActive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.fullName == null ? 0: this.fullName.hashCode());
    result = 31 * result + (this.apiKey == null ? 0: this.apiKey.hashCode());
    result = 31 * result + (this.defaultSendingStream == null ? 0: this.defaultSendingStream.hashCode());
    result = 31 * result + (this.defaultEventsRegisterStream == null ? 0: this.defaultEventsRegisterStream.hashCode());
    result = 31 * result + (this.defaultAllPublicStreams == null ? 0: this.defaultAllPublicStreams.hashCode());
    result = 31 * result + (this.avatarUrl == null ? 0: this.avatarUrl.hashCode());
    result = 31 * result + (this.ownerId == null ? 0: this.ownerId.hashCode());
    result = 31 * result + (this.services == null ? 0: this.services.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.botType == null ? 0: this.botType.hashCode());
    result = 31 * result + (this.isActive == null ? 0: this.isActive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bot {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  fullName: ").append(fullName).append("\n");
    sb.append("  apiKey: ").append(apiKey).append("\n");
    sb.append("  defaultSendingStream: ").append(defaultSendingStream).append("\n");
    sb.append("  defaultEventsRegisterStream: ").append(defaultEventsRegisterStream).append("\n");
    sb.append("  defaultAllPublicStreams: ").append(defaultAllPublicStreams).append("\n");
    sb.append("  avatarUrl: ").append(avatarUrl).append("\n");
    sb.append("  ownerId: ").append(ownerId).append("\n");
    sb.append("  services: ").append(services).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  botType: ").append(botType).append("\n");
    sb.append("  isActive: ").append(isActive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}