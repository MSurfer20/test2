package org.openapitools.model;

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


public class CodedErrorBaseAllOf  {
  
  @ApiModelProperty(value = "")
  private Object result = null;

  @ApiModelProperty(value = "")
  private Object msg = null;

 /**
  * A string that identifies the error. 
  */
  @ApiModelProperty(value = "A string that identifies the error. ")
  private String code;
 /**
  * Get result
  * @return result
  */
  @JsonProperty("result")
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
  public CodedErrorBaseAllOf result(Object result) {
    this.result = result;
    return this;
  }

 /**
  * Get msg
  * @return msg
  */
  @JsonProperty("msg")
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
  public CodedErrorBaseAllOf msg(Object msg) {
    this.msg = msg;
    return this;
  }

 /**
  * A string that identifies the error. 
  * @return code
  */
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public CodedErrorBaseAllOf code(String code) {
    this.code = code;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodedErrorBaseAllOf {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

