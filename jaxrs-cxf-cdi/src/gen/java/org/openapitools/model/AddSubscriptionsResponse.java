package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.AddSubscriptionsResponseAllOf;
import org.openapitools.model.JsonSuccessBase;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;


public class AddSubscriptionsResponse   {
  
  private Object result = null;

  private Object msg = null;

  private Map<String, List<String>> subscribed = null;

  private Map<String, List<String>> alreadySubscribed = null;

  private List<String> unauthorized = null;


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


  public AddSubscriptionsResponse putSubscribedItem(String key, List<String> subscribedItem) {
    if (this.subscribed == null) {
      this.subscribed = new HashMap<String, List<String>>();
    }
    this.subscribed.put(key, subscribedItem);
    return this;
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


  public AddSubscriptionsResponse putAlreadySubscribedItem(String key, List<String> alreadySubscribedItem) {
    if (this.alreadySubscribed == null) {
      this.alreadySubscribed = new HashMap<String, List<String>>();
    }
    this.alreadySubscribed.put(key, alreadySubscribedItem);
    return this;
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

  public AddSubscriptionsResponse addUnauthorizedItem(String unauthorizedItem) {
    if (this.unauthorized == null) {
      this.unauthorized = new ArrayList<String>();
    }
    this.unauthorized.add(unauthorizedItem);
    return this;
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
    return Objects.equals(result, addSubscriptionsResponse.result) &&
        Objects.equals(msg, addSubscriptionsResponse.msg) &&
        Objects.equals(subscribed, addSubscriptionsResponse.subscribed) &&
        Objects.equals(alreadySubscribed, addSubscriptionsResponse.alreadySubscribed) &&
        Objects.equals(unauthorized, addSubscriptionsResponse.unauthorized);
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

