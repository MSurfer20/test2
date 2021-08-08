package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
 */
@ApiModel(description = "## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T20:41:44.271935Z[Etc/UTC]")
public class MissingArgumentErrorAllOf   {
  @JsonProperty("result")
  private Object result = null;

  @JsonProperty("msg")
  private Object msg = null;

  @JsonProperty("code")
  private Object code = null;

  @JsonProperty("var_name")
  private String varName;

  public MissingArgumentErrorAllOf result(Object result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public MissingArgumentErrorAllOf msg(Object msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @ApiModelProperty(value = "")
  public Object getMsg() {
    return msg;
  }

  public void setMsg(Object msg) {
    this.msg = msg;
  }

  public MissingArgumentErrorAllOf code(Object code) {
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

  public MissingArgumentErrorAllOf varName(String varName) {
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
    MissingArgumentErrorAllOf missingArgumentErrorAllOf = (MissingArgumentErrorAllOf) o;
    return Objects.equals(this.result, missingArgumentErrorAllOf.result) &&
        Objects.equals(this.msg, missingArgumentErrorAllOf.msg) &&
        Objects.equals(this.code, missingArgumentErrorAllOf.code) &&
        Objects.equals(this.varName, missingArgumentErrorAllOf.varName);
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

