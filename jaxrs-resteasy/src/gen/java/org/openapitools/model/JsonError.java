package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.JsonErrorBase;
import org.openapitools.model.JsonSuccessAllOf;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-10T11:44:49.803797Z[Etc/UTC]")
public class JsonError   {
  
  private Object result = null;
  private Object msg = null;

  /**
   **/
  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("msg")
  @NotNull
  public Object getMsg() {
    return msg;
  }
  public void setMsg(Object msg) {
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
    JsonError jsonError = (JsonError) o;
    return Objects.equals(result, jsonError.result) &&
        Objects.equals(msg, jsonError.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonError {\n");
    
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

