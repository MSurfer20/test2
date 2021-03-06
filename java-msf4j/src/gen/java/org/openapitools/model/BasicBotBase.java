package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OneOfobjectobject;

/**
 * BasicBotBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen")
public class BasicBotBase   {
  @JsonProperty("user_id")
  private Integer userId;

  @JsonProperty("full_name")
  private String fullName;

  @JsonProperty("api_key")
  private String apiKey;

  @JsonProperty("default_sending_stream")
  private String defaultSendingStream;

  @JsonProperty("default_events_register_stream")
  private String defaultEventsRegisterStream;

  @JsonProperty("default_all_public_streams")
  private Boolean defaultAllPublicStreams;

  @JsonProperty("avatar_url")
  private String avatarUrl;

  @JsonProperty("owner_id")
  private Integer ownerId;

  @JsonProperty("services")
  private List<OneOfobjectobject> services = null;

  public BasicBotBase userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user id of the bot. 
   * @return userId
  **/
  @ApiModelProperty(value = "The user id of the bot. ")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public BasicBotBase fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * The full name of the bot. 
   * @return fullName
  **/
  @ApiModelProperty(value = "The full name of the bot. ")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public BasicBotBase apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The API key of the bot which it uses to make API requests. 
   * @return apiKey
  **/
  @ApiModelProperty(value = "The API key of the bot which it uses to make API requests. ")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public BasicBotBase defaultSendingStream(String defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
    return this;
  }

   /**
   * The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
   * @return defaultSendingStream
  **/
  @ApiModelProperty(value = "The default sending stream of the bot. Null if the bot doesn't have a default sending stream. ")
  public String getDefaultSendingStream() {
    return defaultSendingStream;
  }

  public void setDefaultSendingStream(String defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
  }

  public BasicBotBase defaultEventsRegisterStream(String defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
    return this;
  }

   /**
   * The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
   * @return defaultEventsRegisterStream
  **/
  @ApiModelProperty(value = "The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. ")
  public String getDefaultEventsRegisterStream() {
    return defaultEventsRegisterStream;
  }

  public void setDefaultEventsRegisterStream(String defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
  }

  public BasicBotBase defaultAllPublicStreams(Boolean defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
    return this;
  }

   /**
   * Whether the bot can send messages to all streams by default. 
   * @return defaultAllPublicStreams
  **/
  @ApiModelProperty(value = "Whether the bot can send messages to all streams by default. ")
  public Boolean getDefaultAllPublicStreams() {
    return defaultAllPublicStreams;
  }

  public void setDefaultAllPublicStreams(Boolean defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
  }

  public BasicBotBase avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The URL of the bot's avatar. 
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "The URL of the bot's avatar. ")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public BasicBotBase ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The user id of the bot's owner.  Null if the bot has no owner. 
   * @return ownerId
  **/
  @ApiModelProperty(value = "The user id of the bot's owner.  Null if the bot has no owner. ")
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public BasicBotBase services(List<OneOfobjectobject> services) {
    this.services = services;
    return this;
  }

  public BasicBotBase addServicesItem(OneOfobjectobject servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<OneOfobjectobject>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
   * @return services
  **/
  @ApiModelProperty(value = "The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. ")
  public List<OneOfobjectobject> getServices() {
    return services;
  }

  public void setServices(List<OneOfobjectobject> services) {
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
    BasicBotBase basicBotBase = (BasicBotBase) o;
    return Objects.equals(this.userId, basicBotBase.userId) &&
        Objects.equals(this.fullName, basicBotBase.fullName) &&
        Objects.equals(this.apiKey, basicBotBase.apiKey) &&
        Objects.equals(this.defaultSendingStream, basicBotBase.defaultSendingStream) &&
        Objects.equals(this.defaultEventsRegisterStream, basicBotBase.defaultEventsRegisterStream) &&
        Objects.equals(this.defaultAllPublicStreams, basicBotBase.defaultAllPublicStreams) &&
        Objects.equals(this.avatarUrl, basicBotBase.avatarUrl) &&
        Objects.equals(this.ownerId, basicBotBase.ownerId) &&
        Objects.equals(this.services, basicBotBase.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, fullName, apiKey, defaultSendingStream, defaultEventsRegisterStream, defaultAllPublicStreams, avatarUrl, ownerId, services);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

