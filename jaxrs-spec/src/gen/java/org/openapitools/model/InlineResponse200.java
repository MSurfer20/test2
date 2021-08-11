package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessagesBase;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * This is an example of the JSON payload that the Zulip server will &#x60;POST&#x60; to your server 
 **/
@ApiModel(description = "This is an example of the JSON payload that the Zulip server will `POST` to your server ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public class InlineResponse200   {
  
  private @Valid String botEmail;
  private @Valid String botFullName;
  private @Valid String data;
  private @Valid String trigger;
  private @Valid String token;
  private @Valid MessagesBase message;

  /**
   * Email of the bot user. 
   **/
  public InlineResponse200 botEmail(String botEmail) {
    this.botEmail = botEmail;
    return this;
  }

  

  
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
  public InlineResponse200 botFullName(String botFullName) {
    this.botFullName = botFullName;
    return this;
  }

  

  
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
  public InlineResponse200 data(String data) {
    this.data = data;
    return this;
  }

  

  
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
  public InlineResponse200 trigger(String trigger) {
    this.trigger = trigger;
    return this;
  }

  

  
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
  public InlineResponse200 token(String token) {
    this.token = token;
    return this;
  }

  

  
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
  public InlineResponse200 message(MessagesBase message) {
    this.message = message;
    return this;
  }

  

  
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
    return Objects.equals(this.botEmail, inlineResponse200.botEmail) &&
        Objects.equals(this.botFullName, inlineResponse200.botFullName) &&
        Objects.equals(this.data, inlineResponse200.data) &&
        Objects.equals(this.trigger, inlineResponse200.trigger) &&
        Objects.equals(this.token, inlineResponse200.token) &&
        Objects.equals(this.message, inlineResponse200.message);
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

