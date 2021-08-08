using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// This is an example of the JSON payload that the Zulip server will &#x60;POST&#x60; to your server 
  /// </summary>
  [DataContract]
  public class InlineResponse200 {
    /// <summary>
    /// Email of the bot user. 
    /// </summary>
    /// <value>Email of the bot user. </value>
    [DataMember(Name="bot_email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bot_email")]
    public string BotEmail { get; set; }

    /// <summary>
    /// The full name of the bot user. 
    /// </summary>
    /// <value>The full name of the bot user. </value>
    [DataMember(Name="bot_full_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bot_full_name")]
    public string BotFullName { get; set; }

    /// <summary>
    /// The message content, in raw Markdown format (not rendered to HTML). 
    /// </summary>
    /// <value>The message content, in raw Markdown format (not rendered to HTML). </value>
    [DataMember(Name="data", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "data")]
    public string Data { get; set; }

    /// <summary>
    /// What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
    /// </summary>
    /// <value>What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. </value>
    [DataMember(Name="trigger", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "trigger")]
    public string Trigger { get; set; }

    /// <summary>
    /// A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
    /// </summary>
    /// <value>A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. </value>
    [DataMember(Name="token", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "token")]
    public string Token { get; set; }

    /// <summary>
    /// A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
    /// </summary>
    /// <value>A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). </value>
    [DataMember(Name="message", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "message")]
    public MessagesBase Message { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class InlineResponse200 {\n");
      sb.Append("  BotEmail: ").Append(BotEmail).Append("\n");
      sb.Append("  BotFullName: ").Append(BotFullName).Append("\n");
      sb.Append("  Data: ").Append(Data).Append("\n");
      sb.Append("  Trigger: ").Append(Trigger).Append("\n");
      sb.Append("  Token: ").Append(Token).Append("\n");
      sb.Append("  Message: ").Append(Message).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

}
}
