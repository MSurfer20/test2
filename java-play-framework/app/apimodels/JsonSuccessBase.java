package apimodels;

import apimodels.JsonResponseBase;
import apimodels.JsonSuccessBaseAllOf;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * JsonSuccessBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-10T11:44:22.210302Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class JsonSuccessBase   {
  /**
   * Gets or Sets result
   */
  public enum ResultEnum {
    SUCCESS("success");

    private final String value;

    ResultEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResultEnum fromValue(String value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("result")
  @NotNull

  private ResultEnum result;

  @JsonProperty("msg")
  @NotNull

  private String msg;

  public JsonSuccessBase result(ResultEnum result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  public ResultEnum getResult() {
    return result;
  }

  public void setResult(ResultEnum result) {
    this.result = result;
  }

  public JsonSuccessBase msg(String msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSuccessBase jsonSuccessBase = (JsonSuccessBase) o;
    return Objects.equals(result, jsonSuccessBase.result) &&
        Objects.equals(msg, jsonSuccessBase.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSuccessBase {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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

