package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CodedErrorBase;
import org.openapitools.model.NonExistingStreamErrorAllOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NonExistingStreamError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-10T11:47:39.922565Z[Etc/UTC]")
public class NonExistingStreamError   {
  @JsonProperty("result")
  private JsonNullable<Object> result = JsonNullable.undefined();

  @JsonProperty("msg")
  private JsonNullable<Object> msg = JsonNullable.undefined();

  @JsonProperty("code")
  private JsonNullable<Object> code = JsonNullable.undefined();

  @JsonProperty("stream")
  private String stream;

  public NonExistingStreamError result(Object result) {
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

  public NonExistingStreamError msg(Object msg) {
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

  public NonExistingStreamError code(Object code) {
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

  public NonExistingStreamError stream(String stream) {
    this.stream = stream;
    return this;
  }

  /**
   * The name of the stream that could not be found. 
   * @return stream
  */
  @ApiModelProperty(value = "The name of the stream that could not be found. ")


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
    return Objects.equals(this.result, nonExistingStreamError.result) &&
        Objects.equals(this.msg, nonExistingStreamError.msg) &&
        Objects.equals(this.code, nonExistingStreamError.code) &&
        Objects.equals(this.stream, nonExistingStreamError.stream);
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

