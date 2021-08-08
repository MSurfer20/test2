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
import org.openapitools.model.AddSubscriptionsResponseAllOf;
import org.openapitools.model.JsonSuccessBase;

/**
 * AddSubscriptionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T21:19:24.930319Z[Etc/UTC]")
public class AddSubscriptionsResponse   {
  @JsonProperty("result")
  private Object result = null;

  @JsonProperty("msg")
  private Object msg = null;

  @JsonProperty("subscribed")
  private Map<String, List<String>> subscribed = null;

  @JsonProperty("already_subscribed")
  private Map<String, List<String>> alreadySubscribed = null;

  @JsonProperty("unauthorized")
  private List<String> unauthorized = null;

  public AddSubscriptionsResponse result(Object result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(required = true, value = "")
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public AddSubscriptionsResponse msg(Object msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @ApiModelProperty(required = true, value = "")
  public Object getMsg() {
    return msg;
  }

  public void setMsg(Object msg) {
    this.msg = msg;
  }

  public AddSubscriptionsResponse subscribed(Map<String, List<String>> subscribed) {
    this.subscribed = subscribed;
    return this;
  }

  public AddSubscriptionsResponse putSubscribedItem(String key, List<String> subscribedItem) {
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
  @ApiModelProperty(value = "A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. ")
  public Map<String, List<String>> getSubscribed() {
    return subscribed;
  }

  public void setSubscribed(Map<String, List<String>> subscribed) {
    this.subscribed = subscribed;
  }

  public AddSubscriptionsResponse alreadySubscribed(Map<String, List<String>> alreadySubscribed) {
    this.alreadySubscribed = alreadySubscribed;
    return this;
  }

  public AddSubscriptionsResponse putAlreadySubscribedItem(String key, List<String> alreadySubscribedItem) {
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
  @ApiModelProperty(value = "A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. ")
  public Map<String, List<String>> getAlreadySubscribed() {
    return alreadySubscribed;
  }

  public void setAlreadySubscribed(Map<String, List<String>> alreadySubscribed) {
    this.alreadySubscribed = alreadySubscribed;
  }

  public AddSubscriptionsResponse unauthorized(List<String> unauthorized) {
    this.unauthorized = unauthorized;
    return this;
  }

  public AddSubscriptionsResponse addUnauthorizedItem(String unauthorizedItem) {
    if (this.unauthorized == null) {
      this.unauthorized = new ArrayList<String>();
    }
    this.unauthorized.add(unauthorizedItem);
    return this;
  }

   /**
   * A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
   * @return unauthorized
  **/
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

