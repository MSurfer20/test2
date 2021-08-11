package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CodedErrorBaseAllOf;
import org.openapitools.model.JsonErrorBase;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public class CodedErrorBase   {
  
  private @Valid Object result = null;
  private @Valid Object msg = null;
  private @Valid String code;

  /**
   **/
  public CodedErrorBase result(Object result) {
    this.result = result;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("result")
  @NotNull
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

/**
   **/
  public CodedErrorBase msg(Object msg) {
    this.msg = msg;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("msg")
  @NotNull
  public Object getMsg() {
    return msg;
  }

  public void setMsg(Object msg) {
    this.msg = msg;
  }

/**
   * A string that identifies the error. 
   **/
  public CodedErrorBase code(String code) {
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
    CodedErrorBase codedErrorBase = (CodedErrorBase) o;
    return Objects.equals(this.result, codedErrorBase.result) &&
        Objects.equals(this.msg, codedErrorBase.msg) &&
        Objects.equals(this.code, codedErrorBase.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodedErrorBase {\n");
    
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

