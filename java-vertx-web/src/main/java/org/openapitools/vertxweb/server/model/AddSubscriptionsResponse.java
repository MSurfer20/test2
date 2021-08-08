package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.vertxweb.server.model.AddSubscriptionsResponseAllOf;
import org.openapitools.vertxweb.server.model.JsonSuccessBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddSubscriptionsResponse   {
  
  private Object result = null;
  private Object msg = null;
  private Map<String, List<String>> subscribed = new HashMap<>();
  private Map<String, List<String>> alreadySubscribed = new HashMap<>();
  private List<String> unauthorized = new ArrayList<>();

  public AddSubscriptionsResponse () {

  }

  public AddSubscriptionsResponse (Object result, Object msg, Map<String, List<String>> subscribed, Map<String, List<String>> alreadySubscribed, List<String> unauthorized) {
    this.result = result;
    this.msg = msg;
    this.subscribed = subscribed;
    this.alreadySubscribed = alreadySubscribed;
    this.unauthorized = unauthorized;
  }

    
  @JsonProperty("result")
  public Object getResult() {
    return result;
  }
  public void setResult(Object result) {
    this.result = result;
  }

    
  @JsonProperty("msg")
  public Object getMsg() {
    return msg;
  }
  public void setMsg(Object msg) {
    this.msg = msg;
  }

    
  @JsonProperty("subscribed")
  public Map<String, List<String>> getSubscribed() {
    return subscribed;
  }
  public void setSubscribed(Map<String, List<String>> subscribed) {
    this.subscribed = subscribed;
  }

    
  @JsonProperty("already_subscribed")
  public Map<String, List<String>> getAlreadySubscribed() {
    return alreadySubscribed;
  }
  public void setAlreadySubscribed(Map<String, List<String>> alreadySubscribed) {
    this.alreadySubscribed = alreadySubscribed;
  }

    
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
