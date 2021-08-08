package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CodedError;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RateLimitedError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-08T21:15:36.024879Z[Etc/UTC]")
public class RateLimitedError   {
  @JsonProperty("result")
  private JsonNullable<Object> result = JsonNullable.undefined();

  @JsonProperty("msg")
  private JsonNullable<Object> msg = JsonNullable.undefined();

  @JsonProperty("code")
  private JsonNullable<Object> code = JsonNullable.undefined();

  public RateLimitedError result(Object result) {
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

  public RateLimitedError msg(Object msg) {
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

  public RateLimitedError code(Object code) {
    this.code = JsonNullable.of(code);
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getCode() {
    return code;
  }

  public void setCode(JsonNullable<Object> code) {
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
    RateLimitedError rateLimitedError = (RateLimitedError) o;
    return Objects.equals(this.result, rateLimitedError.result) &&
        Objects.equals(this.msg, rateLimitedError.msg) &&
        Objects.equals(this.code, rateLimitedError.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimitedError {\n");
    
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

