package org.openapitools.model;

import org.openapitools.model.CodedErrorBase;
import org.openapitools.model.NonExistingStreamErrorAllOf;
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


public class NonExistingStreamError  {
  
  @ApiModelProperty(required = true, value = "")
  private Object result = null;

  @ApiModelProperty(required = true, value = "")
  private Object msg = null;

  @ApiModelProperty(value = "")
  private Object code = null;

 /**
  * The name of the stream that could not be found. 
  */
  @ApiModelProperty(value = "The name of the stream that could not be found. ")
  private String stream;
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
  public NonExistingStreamError result(Object result) {
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
  public NonExistingStreamError msg(Object msg) {
    this.msg = msg;
    return this;
  }

 /**
  * Get code
  * @return code
  */
  @JsonProperty("code")
  public Object getCode() {
    return code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public void setCode(Object code) {
    this.code = code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public NonExistingStreamError code(Object code) {
    this.code = code;
    return this;
  }

 /**
  * The name of the stream that could not be found. 
  * @return stream
  */
  @JsonProperty("stream")
  public String getStream() {
    return stream;
  }

  /**
   * Sets the <code>stream</code> property.
   */
  public void setStream(String stream) {
    this.stream = stream;
  }

  /**
   * Sets the <code>stream</code> property.
   */
  public NonExistingStreamError stream(String stream) {
    this.stream = stream;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonExistingStreamError {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
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

