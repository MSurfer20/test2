package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * &#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "`{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. ")
public class Presence   {
  
  private String client;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

    @XmlEnumValue("idle") IDLE(String.valueOf("idle")), @XmlEnumValue("active") ACTIVE(String.valueOf("active"));


    private String value;

    StatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private StatusEnum status;

  private Integer timestamp;

  private Boolean pushable;


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

