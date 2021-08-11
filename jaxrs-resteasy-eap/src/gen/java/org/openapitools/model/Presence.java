package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="`{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen")
public class Presence   {
  

  private String client;

  /**
   * The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;. 
   */
  public enum StatusEnum {
    IDLE("idle"),

        ACTIVE("active");
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }


  private StatusEnum status;

  private Integer timestamp;

  private Boolean pushable;

  /**
   * The client&#39;s platform name. 
   **/
  
  @ApiModelProperty(value = "The client's platform name. ")
  @JsonProperty("client")
  public String getClient() {
    return client;
  }
  public void setClient(String client) {
    this.client = client;
  }

  /**
   * The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;. 
   **/
  
  @ApiModelProperty(value = "The status of the user on this client. It is either `idle` or `active`. ")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second. 
   **/
  
  @ApiModelProperty(value = "The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. ")
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Whether the client is capable of showing mobile/push notifications to the user. 
   **/
  
  @ApiModelProperty(value = "Whether the client is capable of showing mobile/push notifications to the user. ")
  @JsonProperty("pushable")
  public Boolean getPushable() {
    return pushable;
  }
  public void setPushable(Boolean pushable) {
    this.pushable = pushable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Presence presence = (Presence) o;
    return Objects.equals(client, presence.client) &&
        Objects.equals(status, presence.status) &&
        Objects.equals(timestamp, presence.timestamp) &&
        Objects.equals(pushable, presence.pushable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, status, timestamp, pushable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Presence {\n");
    
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    pushable: ").append(toIndentedString(pushable)).append("\n");
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

