package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BadEventQueueIdErrorAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-08T20:43:06.633496Z[Etc/UTC]")
public class BadEventQueueIdErrorAllOf   {
  @JsonProperty("result")
  private JsonNullable<Object> result = JsonNullable.undefined();

  @JsonProperty("msg")
  private JsonNullable<Object> msg = JsonNullable.undefined();

  @JsonProperty("code")
  private JsonNullable<Object> code = JsonNullable.undefined();

  @JsonProperty("queue_id")
  private String queueId;

  public BadEventQueueIdErrorAllOf result(Object result) {
    this.result = JsonNullable.of(result);
    return this;
  }

  /**
   * Get result
   * @return result
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getResult() {
    return result;
  }

  public void setResult(JsonNullable<Object> result) {
    this.result = result;
  }

  public BadEventQueueIdErrorAllOf msg(Object msg) {
    this.msg = JsonNullable.of(msg);
    return this;
  }

  /**
   * Get msg
   * @return msg
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getMsg() {
    return msg;
  }

  public void setMsg(JsonNullable<Object> msg) {
    this.msg = msg;
  }

  public BadEventQueueIdErrorAllOf code(Object code) {
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

  public BadEventQueueIdErrorAllOf queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }

  /**
   * The string that identifies the invalid event queue. 
   * @return queueId
  */
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

