package apimodels;

import apimodels.InvalidMessageErrorAllOf;
import apimodels.JsonSuccessBase;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InvalidMessageError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-10T11:44:22.210302Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InvalidMessageError   {
  @JsonProperty("result")
  @NotNull

  private Object result = null;

  @JsonProperty("msg")
  @NotNull

  private Object msg = null;

  @JsonProperty("raw_content")
  
  private String rawContent;

  public InvalidMessageError result(Object result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public InvalidMessageError msg(Object msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  public Object getMsg() {
    return msg;
  }

  public void setMsg(Object msg) {
    this.msg = msg;
  }

  public InvalidMessageError rawContent(String rawContent) {
    this.rawContent = rawContent;
    return this;
  }

   /**
   * The raw content of the message. 
   * @return rawContent
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

