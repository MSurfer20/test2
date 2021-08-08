/*
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
 */
@ApiModel(description = "## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-08T20:39:18.495644Z[Etc/UTC]")
public class MissingArgumentErrorAllOf {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Object result = null;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private Object msg = null;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Object code = null;

  public static final String SERIALIZED_NAME_VAR_NAME = "var_name";
  @SerializedName(SERIALIZED_NAME_VAR_NAME)
  private String varName;


  public MissingArgumentErrorAllOf result(Object result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
