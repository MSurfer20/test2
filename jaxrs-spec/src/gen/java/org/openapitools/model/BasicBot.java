package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BasicBotAllOf;
import org.openapitools.model.BasicBotBase;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-10T11:44:56.462938Z[Etc/UTC]")public class BasicBot   {
  
  private @Valid Object userId = null;
  private @Valid Object fullName = null;
  private @Valid Object apiKey = null;
  private @Valid Object defaultSendingStream = null;
  private @Valid Object defaultEventsRegisterStream = null;
  private @Valid Object defaultAllPublicStreams = null;
  private @Valid Object avatarUrl = null;
  private @Valid Object ownerId = null;
  private @Valid Object services = null;

  /**
   **/
  public BasicBot userId(Object userId) {
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
   **/
  public BasicBot fullName(Object fullName) {
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
   **/
  public BasicBot apiKey(Object apiKey) {
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
   **/
  public BasicBot defaultSendingStream(Object defaultSendingStream) {
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
   **/
  public BasicBot defaultEventsRegisterStream(Object defaultEventsRegisterStream) {
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
   **/
  public BasicBot defaultAllPublicStreams(Object defaultAllPublicStreams) {
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
   **/
  public BasicBot avatarUrl(Object avatarUrl) {
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
   **/
  public BasicBot ownerId(Object ownerId) {
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
   **/
  public BasicBot services(Object services) {
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

