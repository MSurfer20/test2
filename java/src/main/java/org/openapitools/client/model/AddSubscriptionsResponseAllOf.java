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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AddSubscriptionsResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddSubscriptionsResponseAllOf {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Object result = null;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private Object msg = null;

  public static final String SERIALIZED_NAME_SUBSCRIBED = "subscribed";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED)
  private Map<String, List<String>> subscribed = null;

  public static final String SERIALIZED_NAME_ALREADY_SUBSCRIBED = "already_subscribed";
  @SerializedName(SERIALIZED_NAME_ALREADY_SUBSCRIBED)
  private Map<String, List<String>> alreadySubscribed = null;

  public static final String SERIALIZED_NAME_UNAUTHORIZED = "unauthorized";
  @SerializedName(SERIALIZED_NAME_UNAUTHORIZED)
  private List<String> unauthorized = null;


  public AddSubscriptionsResponseAllOf result(Object result) {
    
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


  public AddSubscriptionsResponseAllOf msg(Object msg) {
    
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. ")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. ")

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
  @javax.annotation.Nullable
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

