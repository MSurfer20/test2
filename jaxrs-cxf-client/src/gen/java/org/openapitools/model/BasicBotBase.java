package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OneOfobjectobject;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BasicBotBase  {
  
  @ApiModelProperty(value = "The user id of the bot. ")
 /**
   * The user id of the bot. 
  **/
  private Integer userId;

  @ApiModelProperty(value = "The full name of the bot. ")
 /**
   * The full name of the bot. 
  **/
  private String fullName;

  @ApiModelProperty(value = "The API key of the bot which it uses to make API requests. ")
 /**
   * The API key of the bot which it uses to make API requests. 
  **/
  private String apiKey;

  @ApiModelProperty(value = "The default sending stream of the bot. Null if the bot doesn't have a default sending stream. ")
 /**
   * The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
  **/
  private String defaultSendingStream;

  @ApiModelProperty(value = "The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. ")
 /**
   * The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
  **/
  private String defaultEventsRegisterStream;

  @ApiModelProperty(value = "Whether the bot can send messages to all streams by default. ")
 /**
   * Whether the bot can send messages to all streams by default. 
  **/
  private Boolean defaultAllPublicStreams;

  @ApiModelProperty(value = "The URL of the bot's avatar. ")
 /**
   * The URL of the bot's avatar. 
  **/
  private String avatarUrl;

  @ApiModelProperty(value = "The user id of the bot's owner.  Null if the bot has no owner. ")
 /**
   * The user id of the bot's owner.  Null if the bot has no owner. 
  **/
  private Integer ownerId;

  @ApiModelProperty(value = "The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. ")
 /**
   * The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
  **/
  private List<OneOfobjectobject> services = null;
 /**
   * The user id of the bot. 
   * @return userId
  **/
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public BasicBotBase userId(Integer userId) {
    this.userId = userId;
    return this;
  }

 /**
   * The full name of the bot. 
   * @return fullName
  **/
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public BasicBotBase fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

 /**
   * The API key of the bot which it uses to make API requests. 
   * @return apiKey
  **/
  @JsonProperty("api_key")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public BasicBotBase apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

 /**
   * The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream. 
   * @return defaultSendingStream
  **/
  @JsonProperty("default_sending_stream")
  public String getDefaultSendingStream() {
    return defaultSendingStream;
  }

  public void setDefaultSendingStream(String defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
  }

  public BasicBotBase defaultSendingStream(String defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
    return this;
  }

 /**
   * The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream. 
   * @return defaultEventsRegisterStream
  **/
  @JsonProperty("default_events_register_stream")
  public String getDefaultEventsRegisterStream() {
    return defaultEventsRegisterStream;
  }

  public void setDefaultEventsRegisterStream(String defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
  }

  public BasicBotBase defaultEventsRegisterStream(String defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
    return this;
  }

 /**
   * Whether the bot can send messages to all streams by default. 
   * @return defaultAllPublicStreams
  **/
  @JsonProperty("default_all_public_streams")
  public Boolean getDefaultAllPublicStreams() {
    return defaultAllPublicStreams;
  }

  public void setDefaultAllPublicStreams(Boolean defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
  }

  public BasicBotBase defaultAllPublicStreams(Boolean defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
    return this;
  }

 /**
   * The URL of the bot&#39;s avatar. 
   * @return avatarUrl
  **/
  @JsonProperty("avatar_url")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public BasicBotBase avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

 /**
   * The user id of the bot&#39;s owner.  Null if the bot has no owner. 
   * @return ownerId
  **/
  @JsonProperty("owner_id")
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public BasicBotBase ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

 /**
   * The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
   * @return services
  **/
  @JsonProperty("services")
  public List<OneOfobjectobject> getServices() {
    return services;
  }

  public void setServices(List<OneOfobjectobject> services) {
    this.services = services;
  }

  public BasicBotBase services(List<OneOfobjectobject> services) {
    this.services = services;
    return this;
  }

  public BasicBotBase addServicesItem(OneOfobjectobject servicesItem) {
    this.services.add(servicesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicBotBase {\n");
    
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

