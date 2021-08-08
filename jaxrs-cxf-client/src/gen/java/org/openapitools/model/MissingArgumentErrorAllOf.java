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
  * ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
 **/
@ApiModel(description="## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied ")
public class MissingArgumentErrorAllOf  {
  
  @ApiModelProperty(value = "")
  private Object result = null;

  @ApiModelProperty(value = "")
  private Object msg = null;

  @ApiModelProperty(value = "")
  private Object code = null;

  @ApiModelProperty(value = "It contains the information about the missing parameter. ")
 /**
   * It contains the information about the missing parameter. 
  **/
  private String varName;
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

  public MissingArgumentErrorAllOf result(Object result) {
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

  public MissingArgumentErrorAllOf msg(Object msg) {
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

  public MissingArgumentErrorAllOf code(Object code) {
    this.code = code;
    return this;
  }

 /**
   * It contains the information about the missing parameter. 
   * @return varName
  **/
  @JsonProperty("var_name")
  public String getVarName() {
    return varName;
  }

  public void setVarName(String varName) {
    this.varName = varName;
  }

  public MissingArgumentErrorAllOf varName(String varName) {
    this.varName = varName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissingArgumentErrorAllOf {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    varName: ").append(toIndentedString(varName)).append("\n");
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

