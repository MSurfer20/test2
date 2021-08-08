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
import org.openapitools.client.model.CodedErrorBase;
import org.openapitools.client.model.NonExistingStreamErrorAllOf;

/**
 * NonExistingStreamError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-15T18:03:22.744839Z[Etc/UTC]")
public class NonExistingStreamError {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Object result = null;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private Object msg = null;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Object code = null;

  public static final String SERIALIZED_NAME_STREAM = "stream";
  @SerializedName(SERIALIZED_NAME_STREAM)
  private String stream;


  public NonExistingStreamError result(Object result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getResult() {
    return result;
  }


  public void setResult(Object result) {
    this.result = result;
  }


  public NonExistingStreamError msg(Object msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getMsg() {
    return msg;
  }


  public void setMsg(Object msg) {
    this.msg = msg;
  }


  public NonExistingStreamError code(Object code) {
    
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


  public NonExistingStreamError stream(String stream) {
    
    this.stream = stream;
    return this;
  }

   /**
   * The name of the stream that could not be found. 
   * @return stream
  **/
  @javax.annotation.Nullable
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

