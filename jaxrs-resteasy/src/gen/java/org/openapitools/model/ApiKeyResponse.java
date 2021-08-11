package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApiKeyResponseAllOf;
import org.openapitools.model.JsonSuccessBase;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen")
public class ApiKeyResponse   {
  
  private Object result = null;
  private Object msg = null;
  private String apiKey;
  private String email;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("result")
  @NotNull
  public Object getResult() {
    return result;
  }
  public void setResult(Object result) {
    this.result = result;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("msg")
  @NotNull
  public Object getMsg() {
    return msg;
  }
  public void setMsg(Object msg) {
    this.msg = msg;
  }

  /**
   * The API key that can be used to authenticate as the requested user. 
   **/
  
  @ApiModelProperty(required = true, value = "The API key that can be used to authenticate as the requested user. ")
  @JsonProperty("api_key")
  @NotNull
  public String getApiKey() {
    return apiKey;
  }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  /**
   * The email address of the user who owns the API key 
   **/
  
  @ApiModelProperty(required = true, value = "The email address of the user who owns the API key ")
  @JsonProperty("email")
  @NotNull
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

