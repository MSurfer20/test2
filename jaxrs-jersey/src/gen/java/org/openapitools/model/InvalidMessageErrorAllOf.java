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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * InvalidMessageErrorAllOf
 */
@JsonPropertyOrder({
  InvalidMessageErrorAllOf.JSON_PROPERTY_RESULT,
  InvalidMessageErrorAllOf.JSON_PROPERTY_MSG,
  InvalidMessageErrorAllOf.JSON_PROPERTY_RAW_CONTENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:20:01.120158Z[Etc/UTC]")
public class InvalidMessageErrorAllOf   {
  public static final String JSON_PROPERTY_RESULT = "result";
  @JsonProperty(JSON_PROPERTY_RESULT)
  private Object result = null;

  public static final String JSON_PROPERTY_MSG = "msg";
  @JsonProperty(JSON_PROPERTY_MSG)
  private Object msg = null;

  public static final String JSON_PROPERTY_RAW_CONTENT = "raw_content";
  @JsonProperty(JSON_PROPERTY_RAW_CONTENT)
  private String rawContent;

  public InvalidMessageErrorAllOf result(Object result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  @JsonProperty(value = "result")
  @ApiModelProperty(value = "")
  
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public InvalidMessageErrorAllOf msg(Object msg) {
    this.msg = msg;
    return this;
  }

  /**
   * Get msg
   * @return msg
   **/
  @JsonProperty(value = "msg")
  @ApiModelProperty(value = "")
  
  public Object getMsg() {
    return msg;
  }

  public void setMsg(Object msg) {
    this.msg = msg;
  }

  public InvalidMessageErrorAllOf rawContent(String rawContent) {
    this.rawContent = rawContent;
    return this;
  }

  /**
   * The raw content of the message. 
   * @return rawContent
   **/
  @JsonProperty(value = "raw_content")
  @ApiModelProperty(value = "The raw content of the message. ")
  
  public String getRawContent() {
    return rawContent;
  }

  public void setRawContent(String rawContent) {
    this.rawContent = rawContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidMessageErrorAllOf invalidMessageErrorAllOf = (InvalidMessageErrorAllOf) o;
    return Objects.equals(this.result, invalidMessageErrorAllOf.result) &&
        Objects.equals(this.msg, invalidMessageErrorAllOf.msg) &&
        Objects.equals(this.rawContent, invalidMessageErrorAllOf.rawContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, rawContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidMessageErrorAllOf {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    rawContent: ").append(toIndentedString(rawContent)).append("\n");
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

