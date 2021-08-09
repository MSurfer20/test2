package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BadEventQueueIdErrorAllOf
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2021-08-09T21:33:29.972302Z[Etc/UTC]")
public class BadEventQueueIdErrorAllOf   {
  @JsonProperty("result")
  private Object result = null;

  @JsonProperty("msg")
  private Object msg = null;

  @JsonProperty("code")
  private Object code = null;

  @JsonProperty("queue_id")
  private String queueId;

  public BadEventQueueIdErrorAllOf result(Object result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public BadEventQueueIdErrorAllOf msg(Object msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @ApiModelProperty(value = "")
  public Object getMsg() {
    return msg;
  }

  public void setMsg(Object msg) {
    this.msg = msg;
  }

  public BadEventQueueIdErrorAllOf code(Object code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public Object getCode() {
    return code;
  }

  public void setCode(Object code) {
    this.code = code;
  }

  public BadEventQueueIdErrorAllOf queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }

   /**
   * The string that identifies the invalid event queue. 
   * @return queueId
  **/
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
    BadEventQueueIdErrorAllOf badEventQueueIdErrorAllOf = (BadEventQueueIdErrorAllOf) o;
    return Objects.equals(this.result, badEventQueueIdErrorAllOf.result) &&
        Objects.equals(this.msg, badEventQueueIdErrorAllOf.msg) &&
        Objects.equals(this.code, badEventQueueIdErrorAllOf.code) &&
        Objects.equals(this.queueId, badEventQueueIdErrorAllOf.queueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, code, queueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadEventQueueIdErrorAllOf {\n");
    
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

