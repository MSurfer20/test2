package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ApiKeyResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T20:41:53.018098Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ApiKeyResponseAllOf   {
  @JsonProperty("result")
  
  private Object result = null;

  @JsonProperty("msg")
  
  private Object msg = null;

  @JsonProperty("api_key")
  @NotNull

  private String apiKey;

  @JsonProperty("email")
  @NotNull

  private String email;

  public ApiKeyResponseAllOf result(Object result) {
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

  public ApiKeyResponseAllOf msg(Object msg) {
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

  public ApiKeyResponseAllOf apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The API key that can be used to authenticate as the requested user. 
   * @return apiKey
  **/
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public ApiKeyResponseAllOf email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the user who owns the API key 
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyResponseAllOf apiKeyResponseAllOf = (ApiKeyResponseAllOf) o;
    return Objects.equals(result, apiKeyResponseAllOf.result) &&
        Objects.equals(msg, apiKeyResponseAllOf.msg) &&
        Objects.equals(apiKey, apiKeyResponseAllOf.apiKey) &&
        Objects.equals(email, apiKeyResponseAllOf.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, apiKey, email);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyResponseAllOf {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

