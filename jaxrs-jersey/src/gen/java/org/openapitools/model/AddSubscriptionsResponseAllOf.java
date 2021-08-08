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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * AddSubscriptionsResponseAllOf
 */
@JsonPropertyOrder({
  AddSubscriptionsResponseAllOf.JSON_PROPERTY_RESULT,
  AddSubscriptionsResponseAllOf.JSON_PROPERTY_MSG,
  AddSubscriptionsResponseAllOf.JSON_PROPERTY_SUBSCRIBED,
  AddSubscriptionsResponseAllOf.JSON_PROPERTY_ALREADY_SUBSCRIBED,
  AddSubscriptionsResponseAllOf.JSON_PROPERTY_UNAUTHORIZED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:42:23.370561Z[Etc/UTC]")
public class AddSubscriptionsResponseAllOf   {
  public static final String JSON_PROPERTY_RESULT = "result";
  @JsonProperty(JSON_PROPERTY_RESULT)
  private Object result = null;

  public static final String JSON_PROPERTY_MSG = "msg";
  @JsonProperty(JSON_PROPERTY_MSG)
  private Object msg = null;

  public static final String JSON_PROPERTY_SUBSCRIBED = "subscribed";
  @JsonProperty(JSON_PROPERTY_SUBSCRIBED)
  private Map<String, List<String>> subscribed = null;

  public static final String JSON_PROPERTY_ALREADY_SUBSCRIBED = "already_subscribed";
  @JsonProperty(JSON_PROPERTY_ALREADY_SUBSCRIBED)
  private Map<String, List<String>> alreadySubscribed = null;

  public static final String JSON_PROPERTY_UNAUTHORIZED = "unauthorized";
  @JsonProperty(JSON_PROPERTY_UNAUTHORIZED)
  private List<String> unauthorized = null;

  public AddSubscriptionsResponseAllOf result(Object result) {
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

  public AddSubscriptionsResponseAllOf msg(Object msg) {
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

  public AddSubscriptionsResponseAllOf subscribed(Map<String, List<String>> subscribed) {
    this.subscribed = subscribed;
    return this;
  }

  public AddSubscriptionsResponseAllOf putSubscribedItem(String key, List<String> subscribedItem) {
    if (this.subscribed == null) {
      this.subscribed = new HashMap<String, List<String>>();
    }
    this.subscribed.put(key, subscribedItem);
    return this;
  }

  /**
   * A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
   * @return subscribed
   **/
  @JsonProperty(value = "subscribed")
  @ApiModelProperty(value = "A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. ")
  @Valid 
  public Map<String, List<String>> getSubscribed() {
    return subscribed;
  }

  public void setSubscribed(Map<String, List<String>> subscribed) {
    this.subscribed = subscribed;
  }

  public AddSubscriptionsResponseAllOf alreadySubscribed(Map<String, List<String>> alreadySubscribed) {
    this.alreadySubscribed = alreadySubscribed;
    return this;
  }

  public AddSubscriptionsResponseAllOf putAlreadySubscribedItem(String key, List<String> alreadySubscribedItem) {
    if (this.alreadySubscribed == null) {
      this.alreadySubscribed = new HashMap<String, List<String>>();
    }
    this.alreadySubscribed.put(key, alreadySubscribedItem);
    return this;
  }

  /**
   * A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
   * @return alreadySubscribed
   **/
  @JsonProperty(value = "already_subscribed")
  @ApiModelProperty(value = "A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. ")
  @Valid 
  public Map<String, List<String>> getAlreadySubscribed() {
    return alreadySubscribed;
  }

  public void setAlreadySubscribed(Map<String, List<String>> alreadySubscribed) {
    this.alreadySubscribed = alreadySubscribed;
  }

  public AddSubscriptionsResponseAllOf unauthorized(List<String> unauthorized) {
    this.unauthorized = unauthorized;
    return this;
  }

  public AddSubscriptionsResponseAllOf addUnauthorizedItem(String unauthorizedItem) {
    if (this.unauthorized == null) {
      this.unauthorized = new ArrayList<String>();
    }
    this.unauthorized.add(unauthorizedItem);
    return this;
  }

  /**
   * A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;. 
   * @return unauthorized
   **/
  @JsonProperty(value = "unauthorized")
  @ApiModelProperty(value = "A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. ")
  
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
    AddSubscriptionsResponseAllOf addSubscriptionsResponseAllOf = (AddSubscriptionsResponseAllOf) o;
    return Objects.equals(this.result, addSubscriptionsResponseAllOf.result) &&
        Objects.equals(this.msg, addSubscriptionsResponseAllOf.msg) &&
        Objects.equals(this.subscribed, addSubscriptionsResponseAllOf.subscribed) &&
        Objects.equals(this.alreadySubscribed, addSubscriptionsResponseAllOf.alreadySubscribed) &&
        Objects.equals(this.unauthorized, addSubscriptionsResponseAllOf.unauthorized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, msg, subscribed, alreadySubscribed, unauthorized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSubscriptionsResponseAllOf {\n");
    
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

