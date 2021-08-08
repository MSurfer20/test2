package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AttachmentsMessages  {
  
  @ApiModelProperty(value = "Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. ")
 /**
   * Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
  **/
  private Integer dateSent;

  @ApiModelProperty(value = "The unique message ID.  Messages should always be displayed sorted by ID. ")
 /**
   * The unique message ID.  Messages should always be displayed sorted by ID. 
  **/
  private Integer id;
 /**
   * Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called &#x60;name&#x60; and was a floating point number. 
   * @return dateSent
  **/
  @JsonProperty("date_sent")
  public Integer getDateSent() {
    return dateSent;
  }

  public void setDateSent(Integer dateSent) {
    this.dateSent = dateSent;
  }

  public AttachmentsMessages dateSent(Integer dateSent) {
    this.dateSent = dateSent;
    return this;
  }

 /**
   * The unique message ID.  Messages should always be displayed sorted by ID. 
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AttachmentsMessages id(Integer id) {
    this.id = id;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

