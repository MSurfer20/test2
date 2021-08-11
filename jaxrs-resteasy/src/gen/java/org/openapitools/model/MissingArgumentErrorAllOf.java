package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen")
public class MissingArgumentErrorAllOf   {
  
  private Object result = null;
  private Object msg = null;
  private Object code = null;
  private String varName;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("msg")
  public Object getMsg() {
    return msg;
  }
  public void setMsg(Object msg) {
    this.msg = msg;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("code")
  public Object getCode() {
    return code;
  }
  public void setCode(Object code) {
    this.code = code;
  }

  /**
   * It contains the information about the missing parameter. 
   **/
  
  @ApiModelProperty(value = "It contains the information about the missing parameter. ")
  @JsonProperty("var_name")
  public String getVarName() {
    return varName;
  }
  public void setVarName(String varName) {
    this.varName = varName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissingArgumentErrorAllOf missingArgumentErrorAllOf = (MissingArgumentErrorAllOf) o;
    return Objects.equals(result, missingArgumentErrorAllOf.result) &&
        Objects.equals(msg, missingArgumentErrorAllOf.msg) &&
        Objects.equals(code, missingArgumentErrorAllOf.code) &&
        Objects.equals(varName, missingArgumentErrorAllOf.varName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, code, varName);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

