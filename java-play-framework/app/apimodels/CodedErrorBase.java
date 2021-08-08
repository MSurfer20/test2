package apimodels;

import apimodels.CodedErrorBaseAllOf;
import apimodels.JsonErrorBase;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * CodedErrorBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T20:39:36.686816Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CodedErrorBase   {
  @JsonProperty("result")
  @NotNull

  private Object result = null;

  @JsonProperty("msg")
  @NotNull

  private Object msg = null;

  @JsonProperty("code")
  
  private String code;

  public CodedErrorBase result(Object result) {
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

  public CodedErrorBase msg(Object msg) {
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

  public CodedErrorBase code(String code) {
    this.code = code;
    return this;
  }

   /**
   * A string that identifies the error. 
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
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
    CodedErrorBase codedErrorBase = (CodedErrorBase) o;
    return Objects.equals(result, codedErrorBase.result) &&
        Objects.equals(msg, codedErrorBase.msg) &&
        Objects.equals(code, codedErrorBase.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, code);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodedErrorBase {\n");
    
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

