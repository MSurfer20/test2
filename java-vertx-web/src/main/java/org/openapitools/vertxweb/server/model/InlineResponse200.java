package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.MessagesBase;

/**
 * This is an example of the JSON payload that the Zulip server will &#x60;POST&#x60; to your server 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InlineResponse200   {
  
  private String botEmail;
  private String botFullName;
  private String data;
  private String trigger;
  private String token;
  private MessagesBase message;

  public InlineResponse200 () {

  }

  public InlineResponse200 (String botEmail, String botFullName, String data, String trigger, String token, MessagesBase message) {
    this.botEmail = botEmail;
    this.botFullName = botFullName;
    this.data = data;
    this.trigger = trigger;
    this.token = token;
    this.message = message;
  }

    
  @JsonProperty("bot_email")
  public String getBotEmail() {
    return botEmail;
  }
  public void setBotEmail(String botEmail) {
    this.botEmail = botEmail;
  }

    
  @JsonProperty("bot_full_name")
  public String getBotFullName() {
    return botFullName;
  }
  public void setBotFullName(String botFullName) {
    this.botFullName = botFullName;
  }

    
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

    
  @JsonProperty("trigger")
  public String getTrigger() {
    return trigger;
  }
  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }

    
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

    
  @JsonProperty("message")
  public MessagesBase getMessage() {
    return message;
  }
  public void setMessage(MessagesBase message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(botEmail, inlineResponse200.botEmail) &&
        Objects.equals(botFullName, inlineResponse200.botFullName) &&
        Objects.equals(data, inlineResponse200.data) &&
        Objects.equals(trigger, inlineResponse200.trigger) &&
        Objects.equals(token, inlineResponse200.token) &&
        Objects.equals(message, inlineResponse200.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botEmail, botFullName, data, trigger, token, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    botEmail: ").append(toIndentedString(botEmail)).append("\n");
    sb.append("    botFullName: ").append(toIndentedString(botFullName)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
