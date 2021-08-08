package org.openapitools.model;

import org.openapitools.model.InvalidMessageErrorAllOf;
import org.openapitools.model.JsonSuccessBase;
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


public class InvalidMessageError  {
  
  @ApiModelProperty(required = true, value = "")
  private Object result = null;

  @ApiModelProperty(required = true, value = "")
  private Object msg = null;

 /**
  * The raw content of the message. 
  */
  @ApiModelProperty(value = "The raw content of the message. ")
  private String rawContent;
 /**
  * Get result
  * @return result
  */
  @JsonProperty("result")
  @NotNull
  public Object getResult() {
    return result;
  }

  /**
   * Sets the <code>result</code> property.
   */
  public void setResult(Object result) {
    this.result = result;
  }

  /**
   * Sets the <code>result</code> property.
   */
  public InvalidMessageError result(Object result) {
    this.result = result;
    return this;
  }

 /**
  * Get msg
  * @return msg
  */
  @JsonProperty("msg")
  @NotNull
  public Object getMsg() {
    return msg;
  }

  /**
   * Sets the <code>msg</code> property.
   */
  public void setMsg(Object msg) {
    this.msg = msg;
  }

  /**
   * Sets the <code>msg</code> property.
   */
  public InvalidMessageError msg(Object msg) {
    this.msg = msg;
    return this;
  }

 /**
  * The raw content of the message. 
  * @return rawContent
  */
  @JsonProperty("raw_content")
  public String getRawContent() {
    return rawContent;
  }

  /**
   * Sets the <code>rawContent</code> property.
   */
  public void setRawContent(String rawContent) {
    this.rawContent = rawContent;
  }

  /**
   * Sets the <code>rawContent</code> property.
   */
  public InvalidMessageError rawContent(String rawContent) {
    this.rawContent = rawContent;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidMessageError {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    rawContent: ").append(toIndentedString(rawContent)).append("\n");
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

