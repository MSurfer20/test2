package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessagesBase;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="This is an example of the JSON payload that the Zulip server will `POST` to your server ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T20:40:06.005587Z[Etc/UTC]")
public class InlineResponse200   {
  
  private String botEmail;
  private String botFullName;
  private String data;
  private String trigger;
  private String token;
  private MessagesBase message;

  /**
   * Email of the bot user. 
   **/
  
  @ApiModelProperty(value = "Email of the bot user. ")
  @JsonProperty("bot_email")
  public String getBotEmail() {
    return botEmail;
  }
  public void setBotEmail(String botEmail) {
    this.botEmail = botEmail;
  }

  /**
   * The full name of the bot user. 
   **/
  
  @ApiModelProperty(value = "The full name of the bot user. ")
  @JsonProperty("bot_full_name")
  public String getBotFullName() {
    return botFullName;
  }
  public void setBotFullName(String botFullName) {
    this.botFullName = botFullName;
  }

  /**
   * The message content, in raw Markdown format (not rendered to HTML). 
   **/
  
  @ApiModelProperty(value = "The message content, in raw Markdown format (not rendered to HTML). ")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  /**
   * What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;. 
   **/
  
  @ApiModelProperty(value = "What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. ")
  @JsonProperty("trigger")
  public String getTrigger() {
    return trigger;
  }
  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }

  /**
   * A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot. 
   **/
  
  @ApiModelProperty(value = "A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. ")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   * A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages). 
   **/
  
  @ApiModelProperty(value = "A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). ")
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

