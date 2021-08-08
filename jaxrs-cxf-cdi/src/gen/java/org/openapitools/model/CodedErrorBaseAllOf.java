package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;


public class CodedErrorBaseAllOf   {
  
  private Object result = null;

  private Object msg = null;

  private String code;


  /**
   **/
  public CodedErrorBaseAllOf result(Object result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("result")
  public Object getResult() {
    return result;
  }
  public void setResult(Object result) {
    this.result = result;
  }


  /**
   **/
  public CodedErrorBaseAllOf msg(Object msg) {
    this.msg = msg;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("msg")
  public Object getMsg() {
    return msg;
  }
  public void setMsg(Object msg) {
    this.msg = msg;
  }


  /**
   * A string that identifies the error. 
   **/
  public CodedErrorBaseAllOf code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(value = "A string that identifies the error. ")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodedErrorBaseAllOf codedErrorBaseAllOf = (CodedErrorBaseAllOf) o;
    return Objects.equals(result, codedErrorBaseAllOf.result) &&
        Objects.equals(msg, codedErrorBaseAllOf.msg) &&
        Objects.equals(code, codedErrorBaseAllOf.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, code);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

