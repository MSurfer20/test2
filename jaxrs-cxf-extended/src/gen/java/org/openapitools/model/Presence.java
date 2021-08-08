package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
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


/**
 * `{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. 
 */
@ApiModel(description="`{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. ")

public class Presence  {
  
 /**
  * The client's platform name. 
  */
  @ApiModelProperty(value = "The client's platform name. ")
  private String client;

@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

    @XmlEnumValue("idle") @JsonProperty("idle") IDLE(String.valueOf("idle")), 
    @XmlEnumValue("active") @JsonProperty("active") ACTIVE(String.valueOf("active"));

    private String value;

    StatusEnum (String v) {
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

 /**
  * The status of the user on this client. It is either `idle` or `active`. 
  */
  @ApiModelProperty(value = "The status of the user on this client. It is either `idle` or `active`. ")
  private StatusEnum status;

 /**
  * The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
  */
  @ApiModelProperty(value = "The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. ")
  private Integer timestamp;

 /**
  * Whether the client is capable of showing mobile/push notifications to the user. 
  */
  @ApiModelProperty(value = "Whether the client is capable of showing mobile/push notifications to the user. ")
  private Boolean pushable;
 /**
  * The client&#39;s platform name. 
  * @return client
  */
  @JsonProperty("client")
  public String getClient() {
    return client;
  }

  /**
   * Sets the <code>client</code> property.
   */
  public void setClient(String client) {
    this.client = client;
  }

  /**
   * Sets the <code>client</code> property.
   */
  public Presence client(String client) {
    this.client = client;
    return this;
  }

 /**
  * The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;. 
  * @return status
  */
  @JsonProperty("status")
  public String getStatus() {
    return status == null ? null : status.value();
  }

  /**
   * Sets the <code>status</code> property.
   */
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public Presence status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
  * The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second. 
  * @return timestamp
  */
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the <code>timestamp</code> property.
   */
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Sets the <code>timestamp</code> property.
   */
  public Presence timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

 /**
  * Whether the client is capable of showing mobile/push notifications to the user. 
  * @return pushable
  */
  @JsonProperty("pushable")
  public Boolean getPushable() {
    return pushable;
  }

  /**
   * Sets the <code>pushable</code> property.
   */
  public void setPushable(Boolean pushable) {
    this.pushable = pushable;
  }

  /**
   * Sets the <code>pushable</code> property.
   */
  public Presence pushable(Boolean pushable) {
    this.pushable = pushable;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

