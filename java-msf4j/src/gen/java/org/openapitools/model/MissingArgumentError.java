package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CodedErrorBase;
import org.openapitools.model.MissingArgumentErrorAllOf;

/**
 * MissingArgumentError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-10T11:44:15.430476Z[Etc/UTC]")
public class MissingArgumentError   {
  @JsonProperty("result")
  private Object result = null;

  @JsonProperty("msg")
  private Object msg = null;

  @JsonProperty("code")
  private Object code = null;

  @JsonProperty("var_name")
  private String varName;

  public MissingArgumentError result(Object result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(required = true, value = "")
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public MissingArgumentError msg(Object msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @ApiModelProperty(required = true, value = "")
  public Object getMsg() {
    return msg;
  }

  public void setMsg(Object msg) {
    this.msg = msg;
  }

  public MissingArgumentError code(Object code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public Object getCode() {
    return code;
  }

  public void setCode(Object code) {
    this.code = code;
  }

  public MissingArgumentError varName(String varName) {
    this.varName = varName;
    return this;
  }

   /**
   * It contains the information about the missing parameter. 
   * @return varName
  **/
  @ApiModelProperty(value = "It contains the information about the missing parameter. ")
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
    return Objects.equals(this.result, missingArgumentError.result) &&
        Objects.equals(this.msg, missingArgumentError.msg) &&
        Objects.equals(this.code, missingArgumentError.code) &&
        Objects.equals(this.varName, missingArgumentError.varName);
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

