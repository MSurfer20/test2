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
 * AttachmentsMessages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-10T11:44:04.874947Z[Etc/UTC]")
public class AttachmentsMessages {
  public static final String SERIALIZED_NAME_DATE_SENT = "date_sent";
  @SerializedName(SERIALIZED_NAME_DATE_SENT)
  private Integer dateSent;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;


  public AttachmentsMessages dateSent(Integer dateSent) {
    
    this.dateSent = dateSent;
    return this;
  }

   /**
   * Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called &#x60;name&#x60; and was a floating point number. 
   * @return dateSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. ")

  public Integer getDateSent() {
    return dateSent;
  }


  public void setDateSent(Integer dateSent) {
    this.dateSent = dateSent;
  }


  public AttachmentsMessages id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique message ID.  Messages should always be displayed sorted by ID. 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique message ID.  Messages should always be displayed sorted by ID. ")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentsMessages attachmentsMessages = (AttachmentsMessages) o;
    return Objects.equals(this.dateSent, attachmentsMessages.dateSent) &&
        Objects.equals(this.id, attachmentsMessages.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateSent, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentsMessages {\n");
    sb.append("    dateSent: ").append(toIndentedString(dateSent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

