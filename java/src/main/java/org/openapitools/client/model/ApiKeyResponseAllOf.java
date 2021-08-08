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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ApiKeyResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-08T20:41:30.598125Z[Etc/UTC]")
public class ApiKeyResponseAllOf {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Object result = null;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private Object msg = null;

  public static final String SERIALIZED_NAME_API_KEY = "api_key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;


  public ApiKeyResponseAllOf result(Object result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @ApiModelProperty(required = true, value = "The API key that can be used to authenticate as the requested user. ")

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

