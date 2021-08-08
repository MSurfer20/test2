package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OneOfobjectobject;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-08-08T20:42:32.152989Z[Etc/UTC]")
public class BasicBotBase   {
  

  private Integer userId;

  private String fullName;

  private String apiKey;

  private String defaultSendingStream;

  private String defaultEventsRegisterStream;

  private Boolean defaultAllPublicStreams;

  private String avatarUrl;

  private Integer ownerId;

  private List<OneOfobjectobject> services = new ArrayList<OneOfobjectobject>();

  /**
   * The user id of the bot. 
   **/
  
  @ApiModelProperty(value = "The user id of the bot. ")
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * The full name of the bot. 
   **/
  
  @ApiModelProperty(value = "The full name of the bot. ")
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * The API key of the bot which it uses to make API requests. 
   **/
  
  @ApiModelProperty(value = "The API key of the bot which it uses to make API requests. ")
  @JsonProperty("api_key")
  public String getApiKey() {
    return apiKey;
  }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  /**
   * The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream. 
   **/
  
  @ApiModelProperty(value = "The default sending stream of the bot. Null if the bot doesn't have a default sending stream. ")
  @JsonProperty("default_sending_stream")
  public String getDefaultSendingStream() {
    return defaultSendingStream;
  }
  public void setDefaultSendingStream(String defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
  }

  /**
   * The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream. 
   **/
  
  @ApiModelProperty(value = "The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. ")
  @JsonProperty("default_events_register_stream")
  public String getDefaultEventsRegisterStream() {
    return defaultEventsRegisterStream;
  }
  public void setDefaultEventsRegisterStream(String defaultEventsRegisterStream) {
    this.defaultEventsRegisterStream = defaultEventsRegisterStream;
  }

  /**
   * Whether the bot can send messages to all streams by default. 
   **/
  
  @ApiModelProperty(value = "Whether the bot can send messages to all streams by default. ")
  @JsonProperty("default_all_public_streams")
  public Boolean getDefaultAllPublicStreams() {
    return defaultAllPublicStreams;
  }
  public void setDefaultAllPublicStreams(Boolean defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
  }

  /**
   * The URL of the bot&#39;s avatar. 
   **/
  
  @ApiModelProperty(value = "The URL of the bot's avatar. ")
  @JsonProperty("avatar_url")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * The user id of the bot&#39;s owner.  Null if the bot has no owner. 
   **/
  
  @ApiModelProperty(value = "The user id of the bot's owner.  Null if the bot has no owner. ")
  @JsonProperty("owner_id")
  public Integer getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  /**
   * The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
   **/
  
  @ApiModelProperty(value = "The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. ")
  @JsonProperty("services")
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
    return Objects.equals(userId, basicBotBase.userId) &&
        Objects.equals(fullName, basicBotBase.fullName) &&
        Objects.equals(apiKey, basicBotBase.apiKey) &&
        Objects.equals(defaultSendingStream, basicBotBase.defaultSendingStream) &&
        Objects.equals(defaultEventsRegisterStream, basicBotBase.defaultEventsRegisterStream) &&
        Objects.equals(defaultAllPublicStreams, basicBotBase.defaultAllPublicStreams) &&
        Objects.equals(avatarUrl, basicBotBase.avatarUrl) &&
        Objects.equals(ownerId, basicBotBase.ownerId) &&
        Objects.equals(services, basicBotBase.services);
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

