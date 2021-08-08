package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.MessagesBase;
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


/**
 * This is an example of the JSON payload that the Zulip server will `POST` to your server 
 */
@ApiModel(description="This is an example of the JSON payload that the Zulip server will `POST` to your server ")

public class InlineResponse200  {
  
 /**
  * Email of the bot user. 
  */
  @ApiModelProperty(value = "Email of the bot user. ")
  private String botEmail;

 /**
  * The full name of the bot user. 
  */
  @ApiModelProperty(value = "The full name of the bot user. ")
  private String botFullName;

 /**
  * The message content, in raw Markdown format (not rendered to HTML). 
  */
  @ApiModelProperty(value = "The message content, in raw Markdown format (not rendered to HTML). ")
  private String data;

 /**
  * What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
  */
  @ApiModelProperty(value = "What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. ")
  private String trigger;

 /**
  * A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
  */
  @ApiModelProperty(value = "A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. ")
  private String token;

 /**
  * A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
  */
  @ApiModelProperty(value = "A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). ")
  @Valid
  private MessagesBase message;
 /**
  * Email of the bot user. 
  * @return botEmail
  */
  @JsonProperty("bot_email")
  public String getBotEmail() {
    return botEmail;
  }

  /**
   * Sets the <code>botEmail</code> property.
   */
  public void setBotEmail(String botEmail) {
    this.botEmail = botEmail;
  }

  /**
   * Sets the <code>botEmail</code> property.
   */
  public InlineResponse200 botEmail(String botEmail) {
    this.botEmail = botEmail;
    return this;
  }

 /**
  * The full name of the bot user. 
  * @return botFullName
  */
  @JsonProperty("bot_full_name")
  public String getBotFullName() {
    return botFullName;
  }

  /**
   * Sets the <code>botFullName</code> property.
   */
  public void setBotFullName(String botFullName) {
    this.botFullName = botFullName;
  }

  /**
   * Sets the <code>botFullName</code> property.
   */
  public InlineResponse200 botFullName(String botFullName) {
    this.botFullName = botFullName;
    return this;
  }

 /**
  * The message content, in raw Markdown format (not rendered to HTML). 
  * @return data
  */
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public InlineResponse200 data(String data) {
    this.data = data;
    return this;
  }

 /**
  * What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;. 
  * @return trigger
  */
  @JsonProperty("trigger")
  public String getTrigger() {
    return trigger;
  }

  /**
   * Sets the <code>trigger</code> property.
   */
  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }

  /**
   * Sets the <code>trigger</code> property.
   */
  public InlineResponse200 trigger(String trigger) {
    this.trigger = trigger;
    return this;
  }

 /**
  * A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot. 
  * @return token
  */
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  /**
   * Sets the <code>token</code> property.
   */
  public void setToken(String token) {
    this.token = token;
  }

  /**
   * Sets the <code>token</code> property.
   */
  public InlineResponse200 token(String token) {
    this.token = token;
    return this;
  }

 /**
  * A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages). 
  * @return message
  */
  @JsonProperty("message")
  public MessagesBase getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public void setMessage(MessagesBase message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public InlineResponse200 message(MessagesBase message) {
    this.message = message;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

