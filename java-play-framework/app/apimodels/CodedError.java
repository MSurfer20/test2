package apimodels;

import apimodels.CodedErrorAllOf;
import apimodels.CodedErrorBase;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * CodedError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T21:11:44.583112Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CodedError   {
  @JsonProperty("result")
  @NotNull

  private Object result = null;

  @JsonProperty("msg")
  @NotNull

  private Object msg = null;

  @JsonProperty("code")
  
  private Object code = null;

  public CodedError result(Object result) {
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

  public CodedError msg(Object msg) {
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

  public CodedError code(Object code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
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
    CodedError codedError = (CodedError) o;
    return Objects.equals(result, codedError.result) &&
        Objects.equals(msg, codedError.msg) &&
        Objects.equals(code, codedError.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, code);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodedError {\n");
    
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

