package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CodedError;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserNotAuthorizedError   {
  
  private Object result = null;
  private Object msg = null;
  private Object code = null;

  public UserNotAuthorizedError () {

  }

  public UserNotAuthorizedError (Object result, Object msg, Object code) {
    this.result = result;
    this.msg = msg;
    this.code = code;
  }

    
  @JsonProperty("result")
  public Object getResult() {
    return result;
  }
  public void setResult(Object result) {
    this.result = result;
  }

    
  @JsonProperty("msg")
  public Object getMsg() {
    return msg;
  }
  public void setMsg(Object msg) {
    this.msg = msg;
  }

    
  @JsonProperty("code")
  public Object getCode() {
    return code;
  }
  public void setCode(Object code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserNotAuthorizedError userNotAuthorizedError = (UserNotAuthorizedError) o;
    return Objects.equals(result, userNotAuthorizedError.result) &&
        Objects.equals(msg, userNotAuthorizedError.msg) &&
        Objects.equals(code, userNotAuthorizedError.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserNotAuthorizedError {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
