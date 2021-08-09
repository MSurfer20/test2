package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BadEventQueueIdErrorAllOf;
import org.openapitools.model.CodedErrorBase;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BadEventQueueIdError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-09T21:37:26.812648Z[Etc/UTC]")
public class BadEventQueueIdError   {
  @JsonProperty("result")
  private JsonNullable<Object> result = JsonNullable.undefined();

  @JsonProperty("msg")
  private JsonNullable<Object> msg = JsonNullable.undefined();

  @JsonProperty("code")
  private JsonNullable<Object> code = JsonNullable.undefined();

  @JsonProperty("queue_id")
  private String queueId;

  public BadEventQueueIdError result(Object result) {
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

  public BadEventQueueIdError msg(Object msg) {
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

  public BadEventQueueIdError code(Object code) {
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

  public BadEventQueueIdError queueId(String queueId) {
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

