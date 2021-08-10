package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.AddSubscriptionsResponseAllOf;
import org.openapitools.model.JsonSuccessBase;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-10T11:44:56.462938Z[Etc/UTC]")public class AddSubscriptionsResponse   {
  
  private @Valid Object result = null;
  private @Valid Object msg = null;
  private @Valid Map<String, List<String>> subscribed = new HashMap<String, List<String>>();
  private @Valid Map<String, List<String>> alreadySubscribed = new HashMap<String, List<String>>();
  private @Valid List<String> unauthorized = new ArrayList<String>();

  /**
   **/
  public AddSubscriptionsResponse result(Object result) {
    this.result = result;
    return this;
  }

  

  
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
  public AddSubscriptionsResponse msg(Object msg) {
    this.msg = msg;
    return this;
  }

  

  
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
   * A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
   **/
  public AddSubscriptionsResponse subscribed(Map<String, List<String>> subscribed) {
    this.subscribed = subscribed;
    return this;
  }

  

  
  @ApiModelProperty(value = "A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. ")
  @JsonProperty("subscribed")
  public Map<String, List<String>> getSubscribed() {
    return subscribed;
  }

  public void setSubscribed(Map<String, List<String>> subscribed) {
    this.subscribed = subscribed;
  }

/**
   * A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
   **/
  public AddSubscriptionsResponse alreadySubscribed(Map<String, List<String>> alreadySubscribed) {
    this.alreadySubscribed = alreadySubscribed;
    return this;
  }

  

  
  @ApiModelProperty(value = "A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. ")
  @JsonProperty("already_subscribed")
  public Map<String, List<String>> getAlreadySubscribed() {
    return alreadySubscribed;
  }

  public void setAlreadySubscribed(Map<String, List<String>> alreadySubscribed) {
    this.alreadySubscribed = alreadySubscribed;
  }

/**
   * A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;. 
   **/
  public AddSubscriptionsResponse unauthorized(List<String> unauthorized) {
    this.unauthorized = unauthorized;
    return this;
  }

  

  
  @ApiModelProperty(value = "A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. ")
  @JsonProperty("unauthorized")
  public List<String> getUnauthorized() {
    return unauthorized;
  }

  public void setUnauthorized(List<String> unauthorized) {
    this.unauthorized = unauthorized;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddSubscriptionsResponse addSubscriptionsResponse = (AddSubscriptionsResponse) o;
    return Objects.equals(this.result, addSubscriptionsResponse.result) &&
        Objects.equals(this.msg, addSubscriptionsResponse.msg) &&
        Objects.equals(this.subscribed, addSubscriptionsResponse.subscribed) &&
        Objects.equals(this.alreadySubscribed, addSubscriptionsResponse.alreadySubscribed) &&
        Objects.equals(this.unauthorized, addSubscriptionsResponse.unauthorized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, subscribed, alreadySubscribed, unauthorized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSubscriptionsResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
    sb.append("    alreadySubscribed: ").append(toIndentedString(alreadySubscribed)).append("\n");
    sb.append("    unauthorized: ").append(toIndentedString(unauthorized)).append("\n");
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

