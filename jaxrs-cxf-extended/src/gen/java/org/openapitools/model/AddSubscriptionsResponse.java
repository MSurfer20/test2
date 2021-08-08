package org.openapitools.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.AddSubscriptionsResponseAllOf;
import org.openapitools.model.JsonSuccessBase;
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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AddSubscriptionsResponse  {
  
  @ApiModelProperty(required = true, value = "")
  private Object result = null;

  @ApiModelProperty(required = true, value = "")
  private Object msg = null;

 /**
  * A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
  */
  @ApiModelProperty(value = "A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. ")
  @Valid
  private Map<String, List<String>> subscribed = null;

 /**
  * A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
  */
  @ApiModelProperty(value = "A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. ")
  @Valid
  private Map<String, List<String>> alreadySubscribed = null;

 /**
  * A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
  */
  @ApiModelProperty(value = "A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. ")
  private List<String> unauthorized = null;
 /**
  * Get result
  * @return result
  */
  @JsonProperty("result")
  @NotNull
  public Object getResult() {
    return result;
  }

  /**
   * Sets the <code>result</code> property.
   */
  public void setResult(Object result) {
    this.result = result;
  }

  /**
   * Sets the <code>result</code> property.
   */
  public AddSubscriptionsResponse result(Object result) {
    this.result = result;
    return this;
  }

 /**
  * Get msg
  * @return msg
  */
  @JsonProperty("msg")
  @NotNull
  public Object getMsg() {
    return msg;
  }

  /**
   * Sets the <code>msg</code> property.
   */
  public void setMsg(Object msg) {
    this.msg = msg;
  }

  /**
   * Sets the <code>msg</code> property.
   */
  public AddSubscriptionsResponse msg(Object msg) {
    this.msg = msg;
    return this;
  }

 /**
  * A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
  * @return subscribed
  */
  @JsonProperty("subscribed")
  public Map<String, List<String>> getSubscribed() {
    return subscribed;
  }

  /**
   * Sets the <code>subscribed</code> property.
   */
  public void setSubscribed(Map<String, List<String>> subscribed) {
    this.subscribed = subscribed;
  }

  /**
   * Sets the <code>subscribed</code> property.
   */
  public AddSubscriptionsResponse subscribed(Map<String, List<String>> subscribed) {
    this.subscribed = subscribed;
    return this;
  }

  /**
   * Puts a new item into the <code>subscribed</code> map.
   */
  public AddSubscriptionsResponse putSubscribedItem(String key, List<String> subscribedItem) {
    this.subscribed.put(key, subscribedItem);
    return this;
  }

 /**
  * A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
  * @return alreadySubscribed
  */
  @JsonProperty("already_subscribed")
  public Map<String, List<String>> getAlreadySubscribed() {
    return alreadySubscribed;
  }

  /**
   * Sets the <code>alreadySubscribed</code> property.
   */
  public void setAlreadySubscribed(Map<String, List<String>> alreadySubscribed) {
    this.alreadySubscribed = alreadySubscribed;
  }

  /**
   * Sets the <code>alreadySubscribed</code> property.
   */
  public AddSubscriptionsResponse alreadySubscribed(Map<String, List<String>> alreadySubscribed) {
    this.alreadySubscribed = alreadySubscribed;
    return this;
  }

  /**
   * Puts a new item into the <code>alreadySubscribed</code> map.
   */
  public AddSubscriptionsResponse putAlreadySubscribedItem(String key, List<String> alreadySubscribedItem) {
    this.alreadySubscribed.put(key, alreadySubscribedItem);
    return this;
  }

 /**
  * A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;. 
  * @return unauthorized
  */
  @JsonProperty("unauthorized")
  public List<String> getUnauthorized() {
    return unauthorized;
  }

  /**
   * Sets the <code>unauthorized</code> property.
   */
  public void setUnauthorized(List<String> unauthorized) {
    this.unauthorized = unauthorized;
  }

  /**
   * Sets the <code>unauthorized</code> property.
   */
  public AddSubscriptionsResponse unauthorized(List<String> unauthorized) {
    this.unauthorized = unauthorized;
    return this;
  }

  /**
   * Adds a new item to the <code>unauthorized</code> list.
   */
  public AddSubscriptionsResponse addUnauthorizedItem(String unauthorizedItem) {
    this.unauthorized.add(unauthorizedItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

