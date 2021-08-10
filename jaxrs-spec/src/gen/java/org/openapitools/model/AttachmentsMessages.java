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



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-10T11:44:56.462938Z[Etc/UTC]")public class AttachmentsMessages   {
  
  private @Valid Integer dateSent;
  private @Valid Integer id;

  /**
   * Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called &#x60;name&#x60; and was a floating point number. 
   **/
  public AttachmentsMessages dateSent(Integer dateSent) {
    this.dateSent = dateSent;
    return this;
  }

  

  
  @ApiModelProperty(value = "Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. ")
  @JsonProperty("date_sent")
  public Integer getDateSent() {
    return dateSent;
  }

  public void setDateSent(Integer dateSent) {
    this.dateSent = dateSent;
  }

/**
   * The unique message ID.  Messages should always be displayed sorted by ID. 
   **/
  public AttachmentsMessages id(Integer id) {
    this.id = id;
    return this;
  }

  

  
  @ApiModelProperty(value = "The unique message ID.  Messages should always be displayed sorted by ID. ")
  @JsonProperty("id")
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

