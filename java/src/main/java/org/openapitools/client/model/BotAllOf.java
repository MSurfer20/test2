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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object containing details of a bot. 
 */
@ApiModel(description = "Object containing details of a bot. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-08T20:41:30.598125Z[Etc/UTC]")
public class BotAllOf {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Object userId = null;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private Object fullName = null;

  public static final String SERIALIZED_NAME_API_KEY = "api_key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private Object apiKey = null;

  public static final String SERIALIZED_NAME_DEFAULT_SENDING_STREAM = "default_sending_stream";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SENDING_STREAM)
  private Object defaultSendingStream = null;

  public static final String SERIALIZED_NAME_DEFAULT_EVENTS_REGISTER_STREAM = "default_events_register_stream";
  @SerializedName(SERIALIZED_NAME_DEFAULT_EVENTS_REGISTER_STREAM)
  private Object defaultEventsRegisterStream = null;

  public static final String SERIALIZED_NAME_DEFAULT_ALL_PUBLIC_STREAMS = "default_all_public_streams";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ALL_PUBLIC_STREAMS)
  private Object defaultAllPublicStreams = null;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatar_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private Object avatarUrl = null;

  public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private Object ownerId = null;

  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private Object services = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_BOT_TYPE = "bot_type";
  @SerializedName(SERIALIZED_NAME_BOT_TYPE)
  private Integer botType;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;


  public BotAllOf userId(Object userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getUserId() {
    return userId;
  }


  public void setUserId(Object userId) {
    this.userId = userId;
  }


  public BotAllOf fullName(Object fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFullName() {
    return fullName;
  }


  public void setFullName(Object fullName) {
    this.fullName = fullName;
  }


  public BotAllOf apiKey(Object apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getApiKey() {
    return apiKey;
  }


  public void setApiKey(Object apiKey) {
    this.apiKey = apiKey;
  }


  public BotAllOf defaultSendingStream(Object defaultSendingStream) {
    
    this.defaultSendingStream = defaultSendingStream;
    return this;
  }

   /**
   * Get defaultSendingStream
   * @return defaultSendingStream
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDefaultSendingStream() {
    return defaultSendingStream;
  }


  public void setDefaultSendingStream(Object defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
  }


  public BotAllOf defaultEventsRegisterStream(Object defaultEventsRegisterStream) {
    
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
    return this;
  }

   /**
   * Get defaultEventsRegisterStream
   * @return defaultEventsRegisterStream
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDefaultEventsRegisterStream() {
    return defaultEventsRegisterStream;
  }


  public void setDefaultEventsRegisterStream(Object defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
  }


  public BotAllOf defaultAllPublicStreams(Object defaultAllPublicStreams) {
    
    this.defaultAllPublicStreams = defaultAllPublicStreams;
    return this;
  }

   /**
   * Get defaultAllPublicStreams
   * @return defaultAllPublicStreams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDefaultAllPublicStreams() {
    return defaultAllPublicStreams;
  }


  public void setDefaultAllPublicStreams(Object defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
  }


  public BotAllOf avatarUrl(Object avatarUrl) {
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAvatarUrl() {
    return avatarUrl;
  }


  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public BotAllOf ownerId(Object ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(Object ownerId) {
    this.ownerId = ownerId;
  }


  public BotAllOf services(Object services) {
    
    this.services = services;
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getServices() {
    return services;
  }


  public void setServices(Object services) {
    this.services = services;
  }


  public BotAllOf email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email of the bot. 
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email of the bot. ")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public BotAllOf botType(Integer botType) {
    
    this.botType = botType;
    return this;
  }

   /**
   * An integer describing the type of bot: * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot. 
   * @return botType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. ")

  public Integer getBotType() {
    return botType;
  }


  public void setBotType(Integer botType) {
    this.botType = botType;
  }


  public BotAllOf isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * A boolean describing whether the user account has been deactivated. 
   * @return isActive
  **/
  @javax.annotation.Nullable
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

