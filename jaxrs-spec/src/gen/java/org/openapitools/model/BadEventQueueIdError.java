package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BadEventQueueIdErrorAllOf;
import org.openapitools.model.CodedErrorBase;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-09T21:34:15.269802Z[Etc/UTC]")public class BadEventQueueIdError   {
  
  private @Valid Object result = null;
  private @Valid Object msg = null;
  private @Valid Object code = null;
  private @Valid String queueId;

  /**
   **/
  public BadEventQueueIdError result(Object result) {
    this.result = result;
    return this;
  }

  

  
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
  public BadEventQueueIdError msg(Object msg) {
    this.msg = msg;
    return this;
  }

  

  
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
  public BadEventQueueIdError code(Object code) {
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
   * The string that identifies the invalid event queue. 
   **/
  public BadEventQueueIdError queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }

  

  
  @ApiModelProperty(value = "The string that identifies the invalid event queue. ")
  @JsonProperty("queue_id")
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

