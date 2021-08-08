package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiKeyResponseAllOf  {
  
  @ApiModelProperty(value = "")
  private Object result = null;

  @ApiModelProperty(value = "")
  private Object msg = null;

  @ApiModelProperty(required = true, value = "The API key that can be used to authenticate as the requested user. ")
 /**
   * The API key that can be used to authenticate as the requested user. 
  **/
  private String apiKey;

  @ApiModelProperty(required = true, value = "The email address of the user who owns the API key ")
 /**
   * The email address of the user who owns the API key 
  **/
  private String email;
 /**
   * Get result
   * @return result
  **/
  @JsonProperty("result")
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public ApiKeyResponseAllOf result(Object result) {
    this.result = result;
    return this;
  }

 /**
   * Get msg
   * @return msg
  **/
  @JsonProperty("msg")
  public Object getMsg() {
    return msg;
  }

  public void setMsg(Object msg) {
    this.msg = msg;
  }

  public ApiKeyResponseAllOf msg(Object msg) {
    this.msg = msg;
    return this;
  }

 /**
   * The API key that can be used to authenticate as the requested user. 
   * @return apiKey
  **/
  @JsonProperty("api_key")
  @NotNull
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public ApiKeyResponseAllOf apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

 /**
   * The email address of the user who owns the API key 
   * @return email
  **/
  @JsonProperty("email")
  @NotNull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ApiKeyResponseAllOf email(String email) {
    this.email = email;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

