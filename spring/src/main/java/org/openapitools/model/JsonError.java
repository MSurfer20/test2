package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.JsonErrorBase;
import org.openapitools.model.JsonSuccessAllOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JsonError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class JsonError   {
  @JsonProperty("result")
  private JsonNullable<Object> result = JsonNullable.undefined();

  @JsonProperty("msg")
  private JsonNullable<Object> msg = JsonNullable.undefined();

  public JsonError result(Object result) {
    this.result = JsonNullable.of(result);
    return this;
  }

  /**
   * Get result
   * @return result
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public JsonNullable<Object> getResult() {
    return result;
  }

  public void setResult(JsonNullable<Object> result) {
    this.result = result;
  }

  public JsonError msg(Object msg) {
    this.msg = JsonNullable.of(msg);
    return this;
  }

  /**
   * Get msg
   * @return msg
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public JsonNullable<Object> getMsg() {
    return msg;
  }

  public void setMsg(JsonNullable<Object> msg) {
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
    return Objects.equals(this.result, jsonError.result) &&
        Objects.equals(this.msg, jsonError.msg);
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

