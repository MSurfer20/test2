package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CodedErrorBase;
import org.openapitools.model.MissingArgumentErrorAllOf;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen")
public class MissingArgumentError   {
  @JsonProperty("result")
  private Object result = null;

  @JsonProperty("msg")
  private Object msg = null;

  @JsonProperty("code")
  private Object code = null;

  @JsonProperty("var_name")
  private String varName;

  /**
   **/
  public MissingArgumentError result(Object result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("result")
  public Object getResult() {
    return result;
  }
  public void setResult(Object result) {
    this.result = result;
  }

  /**
   **/
  public MissingArgumentError msg(Object msg) {
    this.msg = msg;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("msg")
  public Object getMsg() {
    return msg;
  }
  public void setMsg(Object msg) {
    this.msg = msg;
  }

  /**
   **/
  public MissingArgumentError code(Object code) {
    this.code = code;
    return this;
  }

  
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
  public MissingArgumentError varName(String varName) {
    this.varName = varName;
    return this;
  }

  
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
    MissingArgumentError missingArgumentError = (MissingArgumentError) o;
    return Objects.equals(result, missingArgumentError.result) &&
        Objects.equals(msg, missingArgumentError.msg) &&
        Objects.equals(code, missingArgumentError.code) &&
        Objects.equals(varName, missingArgumentError.varName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, code, varName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissingArgumentError {\n");
    
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

