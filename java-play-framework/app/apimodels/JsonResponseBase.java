package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * JsonResponseBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T21:19:33.131185Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class JsonResponseBase   {
  @JsonProperty("result")
  
  private String result;

  public JsonResponseBase result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonResponseBase jsonResponseBase = (JsonResponseBase) o;
    return Objects.equals(result, jsonResponseBase.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonResponseBase {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

