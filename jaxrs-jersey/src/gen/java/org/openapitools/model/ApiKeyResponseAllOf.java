/*
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ApiKeyResponseAllOf
 */
@JsonPropertyOrder({
  ApiKeyResponseAllOf.JSON_PROPERTY_RESULT,
  ApiKeyResponseAllOf.JSON_PROPERTY_MSG,
  ApiKeyResponseAllOf.JSON_PROPERTY_API_KEY,
  ApiKeyResponseAllOf.JSON_PROPERTY_EMAIL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-09T21:34:02.517112Z[Etc/UTC]")
public class ApiKeyResponseAllOf   {
  public static final String JSON_PROPERTY_RESULT = "result";
  @JsonProperty(JSON_PROPERTY_RESULT)
  private Object result = null;

  public static final String JSON_PROPERTY_MSG = "msg";
  @JsonProperty(JSON_PROPERTY_MSG)
  private Object msg = null;

  public static final String JSON_PROPERTY_API_KEY = "api_key";
  @JsonProperty(JSON_PROPERTY_API_KEY)
  private String apiKey;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @JsonProperty(JSON_PROPERTY_EMAIL)
  private String email;

  public ApiKeyResponseAllOf result(Object result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  @JsonProperty(value = "result")
  @ApiModelProperty(value = "")
  
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
  @JsonProperty(value = "msg")
  @ApiModelProperty(value = "")
  
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
  @JsonProperty(value = "api_key")
  @ApiModelProperty(required = true, value = "The API key that can be used to authenticate as the requested user. ")
  @NotNull 
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
  @JsonProperty(value = "email")
  @ApiModelProperty(required = true, value = "The email address of the user who owns the API key ")
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
    ApiKeyResponseAllOf apiKeyResponseAllOf = (ApiKeyResponseAllOf) o;
    return Objects.equals(this.result, apiKeyResponseAllOf.result) &&
        Objects.equals(this.msg, apiKeyResponseAllOf.msg) &&
        Objects.equals(this.apiKey, apiKeyResponseAllOf.apiKey) &&
        Objects.equals(this.email, apiKeyResponseAllOf.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, apiKey, email);
  }


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

