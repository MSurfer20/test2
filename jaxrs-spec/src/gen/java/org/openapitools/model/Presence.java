package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. 
 **/
@ApiModel(description = "`{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public class Presence   {
  
  private @Valid String client;

public enum StatusEnum {

    IDLE(String.valueOf("idle")), ACTIVE(String.valueOf("active"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid StatusEnum status;
  private @Valid Integer timestamp;
  private @Valid Boolean pushable;

  /**
   * The client&#39;s platform name. 
   **/
  public Presence client(String client) {
    this.client = client;
    return this;
  }

  

  
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
  public Presence status(StatusEnum status) {
    this.status = status;
    return this;
  }

  

  
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
  public Presence timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  

  
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
  public Presence pushable(Boolean pushable) {
    this.pushable = pushable;
    return this;
  }

  

  
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
    return Objects.equals(this.client, presence.client) &&
        Objects.equals(this.status, presence.status) &&
        Objects.equals(this.timestamp, presence.timestamp) &&
        Objects.equals(this.pushable, presence.pushable);
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

