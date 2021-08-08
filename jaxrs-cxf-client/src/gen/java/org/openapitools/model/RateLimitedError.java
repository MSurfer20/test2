package org.openapitools.model;

import org.openapitools.model.CodedError;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RateLimitedError  {
  
  @ApiModelProperty(required = true, value = "")
  private Object result = null;

  @ApiModelProperty(required = true, value = "")
  private Object msg = null;

  @ApiModelProperty(value = "")
  private Object code = null;
 /**
   * Get result
   * @return result
  **/
  @JsonProperty("result")
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public RateLimitedError result(Object result) {
    this.result = result;
    return this;
  }

 /**
   * Get msg
   * @return msg
  **/
  @JsonProperty("msg")
  public Object getMsg() {
    return msg;
  }

  public void setMsg(Object msg) {
    this.msg = msg;
  }

  public RateLimitedError msg(Object msg) {
    this.msg = msg;
    return this;
  }

 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public Object getCode() {
    return code;
  }

  public void setCode(Object code) {
    this.code = code;
  }

  public RateLimitedError code(Object code) {
    this.code = code;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimitedError {\n");
    
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

