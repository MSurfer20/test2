package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApiKeyResponseAllOf;
import org.openapitools.model.JsonSuccessBase;

/**
 * ApiKeyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-10T11:44:15.430476Z[Etc/UTC]")
public class ApiKeyResponse   {
  @JsonProperty("result")
  private Object result = null;

  @JsonProperty("msg")
  private Object msg = null;

  @JsonProperty("api_key")
  private String apiKey;

  @JsonProperty("email")
  private String email;

  public ApiKeyResponse result(Object result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "The API key that can be used to authenticate as the requested user. ")
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
  @ApiModelProperty(required = true, value = "The email address of the user who owns the API key ")
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
    return Objects.equals(this.result, apiKeyResponse.result) &&
        Objects.equals(this.msg, apiKeyResponse.msg) &&
        Objects.equals(this.apiKey, apiKeyResponse.apiKey) &&
        Objects.equals(this.email, apiKeyResponse.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, apiKey, email);
  }

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

