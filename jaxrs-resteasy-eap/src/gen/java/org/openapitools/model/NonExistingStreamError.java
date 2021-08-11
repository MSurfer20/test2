package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CodedErrorBase;
import org.openapitools.model.NonExistingStreamErrorAllOf;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen")
public class NonExistingStreamError   {
  

  private Object result = null;

  private Object msg = null;

  private Object code = null;

  private String stream;

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

  /**
   **/
  
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
   **/
  
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
    NonExistingStreamError nonExistingStreamError = (NonExistingStreamError) o;
    return Objects.equals(result, nonExistingStreamError.result) &&
        Objects.equals(msg, nonExistingStreamError.msg) &&
        Objects.equals(code, nonExistingStreamError.code) &&
        Objects.equals(stream, nonExistingStreamError.stream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, code, stream);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonExistingStreamError {\n");
    
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

