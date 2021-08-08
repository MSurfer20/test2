/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * OpenAPI document version: 1.0.0
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.JsonResponseBase;
import org.openapitools.model.JsonSuccessBaseAllOf;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2021-08-08T20:39:40.345387Z[Etc/UTC]")
public class JsonSuccessBase   {
  


  public enum ResultEnum {
    SUCCESS("success");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ResultEnum result;
  private String msg;

  /**
   */
  public JsonSuccessBase result(ResultEnum result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("result")
  public ResultEnum getResult() {
    return result;
  }
  public void setResult(ResultEnum result) {
    this.result = result;
  }

  /**
   */
  public JsonSuccessBase msg(String msg) {
    this.msg = msg;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("msg")
  public String getMsg() {
    return msg;
  }
  public void setMsg(String msg) {
    this.msg = msg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSuccessBase jsonSuccessBase = (JsonSuccessBase) o;
    return Objects.equals(result, jsonSuccessBase.result) &&
        Objects.equals(msg, jsonSuccessBase.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSuccessBase {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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

