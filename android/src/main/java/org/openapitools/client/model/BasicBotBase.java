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

import java.util.*;
import org.openapitools.client.model.OneOfobjectobject;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BasicBotBase {
  
  @SerializedName("user_id")
  private Integer userId = null;
  @SerializedName("full_name")
  private String fullName = null;
  @SerializedName("api_key")
  private String apiKey = null;
  @SerializedName("default_sending_stream")
  private String defaultSendingStream = null;
  @SerializedName("default_events_register_stream")
  private String defaultEventsRegisterStream = null;
  @SerializedName("default_all_public_streams")
  private Boolean defaultAllPublicStreams = null;
  @SerializedName("avatar_url")
  private String avatarUrl = null;
  @SerializedName("owner_id")
  private Integer ownerId = null;
  @SerializedName("services")
  private List<OneOfobjectobject> services = null;

  /**
   * The user id of the bot. 
   **/
  @ApiModelProperty(value = "The user id of the bot. ")
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
  public String getApiKey() {
    return apiKey;
  }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  /**
   * The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
   **/
  @ApiModelProperty(value = "The default sending stream of the bot. Null if the bot doesn't have a default sending stream. ")
  public String getDefaultSendingStream() {
    return defaultSendingStream;
  }
  public void setDefaultSendingStream(String defaultSendingStream) {
    this.defaultSendingStream = defaultSendingStream;
  }

  /**
   * The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
   **/
  @ApiModelProperty(value = "The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. ")
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
  public Boolean getDefaultAllPublicStreams() {
    return defaultAllPublicStreams;
  }
  public void setDefaultAllPublicStreams(Boolean defaultAllPublicStreams) {
    this.defaultAllPublicStreams = defaultAllPublicStreams;
  }

  /**
   * The URL of the bot's avatar. 
   **/
  @ApiModelProperty(value = "The URL of the bot's avatar. ")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * The user id of the bot's owner.  Null if the bot has no owner. 
   **/
  @ApiModelProperty(value = "The user id of the bot's owner.  Null if the bot has no owner. ")
  public Integer getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  /**
   * The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
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
    return (this.userId == null ? basicBotBase.userId == null : this.userId.equals(basicBotBase.userId)) &&
        (this.fullName == null ? basicBotBase.fullName == null : this.fullName.equals(basicBotBase.fullName)) &&
        (this.apiKey == null ? basicBotBase.apiKey == null : this.apiKey.equals(basicBotBase.apiKey)) &&
        (this.defaultSendingStream == null ? basicBotBase.defaultSendingStream == null : this.defaultSendingStream.equals(basicBotBase.defaultSendingStream)) &&
        (this.defaultEventsRegisterStream == null ? basicBotBase.defaultEventsRegisterStream == null : this.defaultEventsRegisterStream.equals(basicBotBase.defaultEventsRegisterStream)) &&
        (this.defaultAllPublicStreams == null ? basicBotBase.defaultAllPublicStreams == null : this.defaultAllPublicStreams.equals(basicBotBase.defaultAllPublicStreams)) &&
        (this.avatarUrl == null ? basicBotBase.avatarUrl == null : this.avatarUrl.equals(basicBotBase.avatarUrl)) &&
        (this.ownerId == null ? basicBotBase.ownerId == null : this.ownerId.equals(basicBotBase.ownerId)) &&
        (this.services == null ? basicBotBase.services == null : this.services.equals(basicBotBase.services));
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
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicBotBase {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  fullName: ").append(fullName).append("\n");
    sb.append("  apiKey: ").append(apiKey).append("\n");
    sb.append("  defaultSendingStream: ").append(defaultSendingStream).append("\n");
    sb.append("  defaultEventsRegisterStream: ").append(defaultEventsRegisterStream).append("\n");
    sb.append("  defaultAllPublicStreams: ").append(defaultAllPublicStreams).append("\n");
    sb.append("  avatarUrl: ").append(avatarUrl).append("\n");
    sb.append("  ownerId: ").append(ownerId).append("\n");
    sb.append("  services: ").append(services).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
