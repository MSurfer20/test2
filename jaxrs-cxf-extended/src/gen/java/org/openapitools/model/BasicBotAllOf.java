package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BasicBotAllOf  {
  
  @ApiModelProperty(value = "")
  private Object userId = null;

  @ApiModelProperty(value = "")
  private Object fullName = null;

  @ApiModelProperty(value = "")
  private Object apiKey = null;

  @ApiModelProperty(value = "")
  private Object defaultSendingStream = null;

  @ApiModelProperty(value = "")
  private Object defaultEventsRegisterStream = null;

  @ApiModelProperty(value = "")
  private Object defaultAllPublicStreams = null;

  @ApiModelProperty(value = "")
  private Object avatarUrl = null;

  @ApiModelProperty(value = "")
  private Object ownerId = null;

  @ApiModelProperty(value = "")
  private Object services = null;
 /**
  * Get userId
  * @return userId
  */
  @JsonProperty("user_id")
  public Object getUserId() {
    return userId;
  }

  /**
   * Sets the <code>userId</code> property.
   */
  public void setUserId(Object userId) {
    this.userId = userId;
  }

  /**
   * Sets the <code>userId</code> property.
   */
  public BasicBotAllOf userId(Object userId) {
    this.userId = userId;
    return this;
  }

 /**
  * Get fullName
  * @return fullName
  */
  @JsonProperty("full_name")
  public Object getFullName() {
    return fullName;
  }

  /**
   * Sets the <code>fullName</code> property.
   */
  public void setFullName(Object fullName) {
    this.fullName = fullName;
  }

  /**
   * Sets the <code>fullName</code> property.
   */
  public BasicBotAllOf fullName(Object fullName) {
    this.fullName = fullName;
    return this;
  }

 /**
  * Get apiKey
  * @return apiKey
  */
  @JsonProperty("api_key")
  public Object getApiKey() {
    return apiKey;
  }

  /**
   * Sets the <code>apiKey</code> property.
   */
  public void setApiKey(Object apiKey) {
    this.apiKey = apiKey;
  }

  /**
   * Sets the <code>apiKey</code> property.
   */
  public BasicBotAllOf apiKey(Object apiKey) {
    this.apiKey = apiKey;
    return this;
  }

 /**
  * Get defaultSendingStream
  * @return defaultSendingStream
  */
  @JsonProperty("default_sending_stream")
  public Object getDefaultSendingStream() {
    return defaultSendingStream;
  }

  /**
   * Sets the <code>defaultSendingStream</code> property.
   */
  public void setDefaultSendingStream(Object defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
  }

  /**
   * Sets the <code>defaultSendingStream</code> property.
   */
  public BasicBotAllOf defaultSendingStream(Object defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
    return this;
  }

 /**
  * Get defaultEventsRegisterStream
  * @return defaultEventsRegisterStream
  */
  @JsonProperty("default_events_register_stream")
  public Object getDefaultEventsRegisterStream() {
    return defaultEventsRegisterStream;
  }

  /**
   * Sets the <code>defaultEventsRegisterStream</code> property.
   */
  public void setDefaultEventsRegisterStream(Object defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
  }

  /**
   * Sets the <code>defaultEventsRegisterStream</code> property.
   */
  public BasicBotAllOf defaultEventsRegisterStream(Object defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
    return this;
  }

 /**
  * Get defaultAllPublicStreams
  * @return defaultAllPublicStreams
  */
  @JsonProperty("default_all_public_streams")
  public Object getDefaultAllPublicStreams() {
    return defaultAllPublicStreams;
  }

  /**
   * Sets the <code>defaultAllPublicStreams</code> property.
   */
  public void setDefaultAllPublicStreams(Object defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
  }

  /**
   * Sets the <code>defaultAllPublicStreams</code> property.
   */
  public BasicBotAllOf defaultAllPublicStreams(Object defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
    return this;
  }

 /**
  * Get avatarUrl
  * @return avatarUrl
  */
  @JsonProperty("avatar_url")
  public Object getAvatarUrl() {
    return avatarUrl;
  }

  /**
   * Sets the <code>avatarUrl</code> property.
   */
  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * Sets the <code>avatarUrl</code> property.
   */
  public BasicBotAllOf avatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

 /**
  * Get ownerId
  * @return ownerId
  */
  @JsonProperty("owner_id")
  public Object getOwnerId() {
    return ownerId;
  }

  /**
   * Sets the <code>ownerId</code> property.
   */
  public void setOwnerId(Object ownerId) {
    this.ownerId = ownerId;
  }

  /**
   * Sets the <code>ownerId</code> property.
   */
  public BasicBotAllOf ownerId(Object ownerId) {
    this.ownerId = ownerId;
    return this;
  }

 /**
  * Get services
  * @return services
  */
  @JsonProperty("services")
  public Object getServices() {
    return services;
  }

  /**
   * Sets the <code>services</code> property.
   */
  public void setServices(Object services) {
    this.services = services;
  }

  /**
   * Sets the <code>services</code> property.
   */
  public BasicBotAllOf services(Object services) {
    this.services = services;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

