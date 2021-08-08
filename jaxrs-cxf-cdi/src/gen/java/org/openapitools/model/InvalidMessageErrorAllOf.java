package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;


public class InvalidMessageErrorAllOf   {
  
  private Object result = null;

  private Object msg = null;

  private String rawContent;


  /**
   **/
  public InvalidMessageErrorAllOf result(Object result) {
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
  public InvalidMessageErrorAllOf msg(Object msg) {
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
   * The raw content of the message. 
   **/
  public InvalidMessageErrorAllOf rawContent(String rawContent) {
    this.rawContent = rawContent;
    return this;
  }

  
  @ApiModelProperty(value = "The raw content of the message. ")
  @JsonProperty("raw_content")
  public String getRawContent() {
    return rawContent;
  }
  public void setRawContent(String rawContent) {
    this.rawContent = rawContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidMessageErrorAllOf invalidMessageErrorAllOf = (InvalidMessageErrorAllOf) o;
    return Objects.equals(result, invalidMessageErrorAllOf.result) &&
        Objects.equals(msg, invalidMessageErrorAllOf.msg) &&
        Objects.equals(rawContent, invalidMessageErrorAllOf.rawContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, rawContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidMessageErrorAllOf {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

