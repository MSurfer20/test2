package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T21:20:13.432792Z[Etc/UTC]")public class ApiKeyResponseAllOf   {
  
  private @Valid Object result = null;
  private @Valid Object msg = null;
  private @Valid String apiKey;
  private @Valid String email;

  /**
   **/
  public ApiKeyResponseAllOf result(Object result) {
    this.result = result;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("result")
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

/**
   **/
  public ApiKeyResponseAllOf msg(Object msg) {
    this.msg = msg;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("msg")
  public Object getMsg() {
    return msg;
  }

  public void setMsg(Object msg) {
    this.msg = msg;
  }

/**
   * The API key that can be used to authenticate as the requested user. 
   **/
  public ApiKeyResponseAllOf apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  

  
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
  public ApiKeyResponseAllOf email(String email) {
    this.email = email;
    return this;
  }

  

  
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

