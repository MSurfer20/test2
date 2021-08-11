package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CodedError;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen")
public class RateLimitedError   {
  @JsonProperty("result")
  private Object result = null;

  @JsonProperty("msg")
  private Object msg = null;

  @JsonProperty("code")
  private Object code = null;

  /**
   **/
  public RateLimitedError result(Object result) {
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
  public RateLimitedError msg(Object msg) {
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
  public RateLimitedError code(Object code) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimitedError rateLimitedError = (RateLimitedError) o;
    return Objects.equals(result, rateLimitedError.result) &&
        Objects.equals(msg, rateLimitedError.msg) &&
        Objects.equals(code, rateLimitedError.code);
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

