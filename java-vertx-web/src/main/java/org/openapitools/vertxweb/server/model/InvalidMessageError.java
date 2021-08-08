package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.InvalidMessageErrorAllOf;
import org.openapitools.vertxweb.server.model.JsonSuccessBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvalidMessageError   {
  
  private Object result = null;
  private Object msg = null;
  private String rawContent;

  public InvalidMessageError () {

  }

  public InvalidMessageError (Object result, Object msg, String rawContent) {
    this.result = result;
    this.msg = msg;
    this.rawContent = rawContent;
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

    
  @JsonProperty("raw_content")
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
    InvalidMessageError invalidMessageError = (InvalidMessageError) o;
    return Objects.equals(result, invalidMessageError.result) &&
        Objects.equals(msg, invalidMessageError.msg) &&
        Objects.equals(rawContent, invalidMessageError.rawContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, rawContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidMessageError {\n");
    
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
