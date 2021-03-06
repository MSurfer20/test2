/*
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * &#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. 
 */
@ApiModel(description = "`{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Presence {
  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private String client;

  /**
   * The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;. 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    IDLE("idle"),
    
    ACTIVE("active");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
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

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_PUSHABLE = "pushable";
  @SerializedName(SERIALIZED_NAME_PUSHABLE)
  private Boolean pushable;


  public Presence client(String client) {
    
    this.client = client;
    return this;
  }

   /**
   * The client&#39;s platform name. 
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client's platform name. ")

  public String getClient() {
    return client;
  }


  public void setClient(String client) {
    this.client = client;
  }


  public Presence status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;. 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the user on this client. It is either `idle` or `active`. ")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Presence timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second. 
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. ")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public Presence pushable(Boolean pushable) {
    
    this.pushable = pushable;
    return this;
  }

   /**
   * Whether the client is capable of showing mobile/push notifications to the user. 
   * @return pushable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the client is capable of showing mobile/push notifications to the user. ")

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

