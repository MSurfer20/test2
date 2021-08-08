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
import org.openapitools.model.BadEventQueueIdErrorAllOf;
import org.openapitools.model.CodedErrorBase;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * BadEventQueueIdError
 */
@JsonPropertyOrder({
  BadEventQueueIdError.JSON_PROPERTY_RESULT,
  BadEventQueueIdError.JSON_PROPERTY_MSG,
  BadEventQueueIdError.JSON_PROPERTY_CODE,
  BadEventQueueIdError.JSON_PROPERTY_QUEUE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:42:23.370561Z[Etc/UTC]")
public class BadEventQueueIdError   {
  public static final String JSON_PROPERTY_RESULT = "result";
  @JsonProperty(JSON_PROPERTY_RESULT)
  private Object result = null;

  public static final String JSON_PROPERTY_MSG = "msg";
  @JsonProperty(JSON_PROPERTY_MSG)
  private Object msg = null;

  public static final String JSON_PROPERTY_CODE = "code";
  @JsonProperty(JSON_PROPERTY_CODE)
  private Object code = null;

  public static final String JSON_PROPERTY_QUEUE_ID = "queue_id";
  @JsonProperty(JSON_PROPERTY_QUEUE_ID)
  private String queueId;

  public BadEventQueueIdError result(Object result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  @JsonProperty(value = "result")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public BadEventQueueIdError msg(Object msg) {
    this.msg = msg;
    return this;
  }

  /**
   * Get msg
   * @return msg
   **/
  @JsonProperty(value = "msg")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public Object getMsg() {
    return msg;
  }

  public void setMsg(Object msg) {
    this.msg = msg;
  }

  public BadEventQueueIdError code(Object code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   **/
  @JsonProperty(value = "code")
  @ApiModelProperty(value = "")
  
  public Object getCode() {
    return code;
  }

  public void setCode(Object code) {
    this.code = code;
  }

  public BadEventQueueIdError queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }

  /**
   * The string that identifies the invalid event queue. 
   * @return queueId
   **/
  @JsonProperty(value = "queue_id")
  @ApiModelProperty(value = "The string that identifies the invalid event queue. ")
  
  public String getQueueId() {
    return queueId;
  }

  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadEventQueueIdError badEventQueueIdError = (BadEventQueueIdError) o;
    return Objects.equals(this.result, badEventQueueIdError.result) &&
        Objects.equals(this.msg, badEventQueueIdError.msg) &&
        Objects.equals(this.code, badEventQueueIdError.code) &&
        Objects.equals(this.queueId, badEventQueueIdError.queueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, code, queueId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadEventQueueIdError {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
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

