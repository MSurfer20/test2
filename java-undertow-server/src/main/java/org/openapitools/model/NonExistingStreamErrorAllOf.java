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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2021-08-08T21:19:37.133192Z[Etc/UTC]")
public class NonExistingStreamErrorAllOf   {
  
  private Object result = null;
  private Object msg = null;
  private Object code = null;
  private String stream;

  /**
   */
  public NonExistingStreamErrorAllOf result(Object result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("result")
  public Object getResult() {
    return result;
  }
  public void setResult(Object result) {
    this.result = result;
  }

  /**
   */
  public NonExistingStreamErrorAllOf msg(Object msg) {
    this.msg = msg;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("msg")
  public Object getMsg() {
    return msg;
  }
  public void setMsg(Object msg) {
    this.msg = msg;
  }

  /**
   */
  public NonExistingStreamErrorAllOf code(Object code) {
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
   * The name of the stream that could not be found. 
   */
  public NonExistingStreamErrorAllOf stream(String stream) {
    this.stream = stream;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the stream that could not be found. ")
  @JsonProperty("stream")
  public String getStream() {
    return stream;
  }
  public void setStream(String stream) {
    this.stream = stream;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NonExistingStreamErrorAllOf nonExistingStreamErrorAllOf = (NonExistingStreamErrorAllOf) o;
    return Objects.equals(result, nonExistingStreamErrorAllOf.result) &&
        Objects.equals(msg, nonExistingStreamErrorAllOf.msg) &&
        Objects.equals(code, nonExistingStreamErrorAllOf.code) &&
        Objects.equals(stream, nonExistingStreamErrorAllOf.stream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, code, stream);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonExistingStreamErrorAllOf {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
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

