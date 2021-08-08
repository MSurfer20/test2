package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * `{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. 
 **/
@ApiModel(description="`{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. ")
public class Presence  {
  
  @ApiModelProperty(value = "The client's platform name. ")
 /**
   * The client's platform name. 
  **/
  private String client;

@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("idle") IDLE(String.valueOf("idle")), @XmlEnumValue("active") ACTIVE(String.valueOf("active"));


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

  @ApiModelProperty(value = "The status of the user on this client. It is either `idle` or `active`. ")
 /**
   * The status of the user on this client. It is either `idle` or `active`. 
  **/
  private StatusEnum status;

  @ApiModelProperty(value = "The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. ")
 /**
   * The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
  **/
  private Integer timestamp;

  @ApiModelProperty(value = "Whether the client is capable of showing mobile/push notifications to the user. ")
 /**
   * Whether the client is capable of showing mobile/push notifications to the user. 
  **/
  private Boolean pushable;
 /**
   * The client&#39;s platform name. 
   * @return client
  **/
  @JsonProperty("client")
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public Presence client(String client) {
    this.client = client;
    return this;
  }

 /**
   * The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;. 
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Presence status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second. 
   * @return timestamp
  **/
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public Presence timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

 /**
   * Whether the client is capable of showing mobile/push notifications to the user. 
   * @return pushable
  **/
  @JsonProperty("pushable")
  public Boolean getPushable() {
    return pushable;
  }

  public void setPushable(Boolean pushable) {
    this.pushable = pushable;
  }

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

