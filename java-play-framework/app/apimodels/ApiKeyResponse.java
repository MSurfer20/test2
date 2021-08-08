package apimodels;

import apimodels.ApiKeyResponseAllOf;
import apimodels.JsonSuccessBase;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ApiKeyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T21:19:33.131185Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ApiKeyResponse   {
  @JsonProperty("result")
  @NotNull

  private Object result = null;

  @JsonProperty("msg")
  @NotNull

  private Object msg = null;

  @JsonProperty("api_key")
  @NotNull

  private String apiKey;

  @JsonProperty("email")
  @NotNull

  private String email;

  public ApiKeyResponse result(Object result) {
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

  public ApiKeyResponse msg(Object msg) {
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

  public ApiKeyResponse apiKey(String apiKey) {
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

  public ApiKeyResponse email(String email) {
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
    ApiKeyResponse apiKeyResponse = (ApiKeyResponse) o;
    return Objects.equals(result, apiKeyResponse.result) &&
        Objects.equals(msg, apiKeyResponse.msg) &&
        Objects.equals(apiKey, apiKeyResponse.apiKey) &&
        Objects.equals(email, apiKeyResponse.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, apiKey, email);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyResponse {\n");
    
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

