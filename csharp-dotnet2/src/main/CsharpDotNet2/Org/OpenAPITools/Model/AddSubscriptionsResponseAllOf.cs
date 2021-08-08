using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class AddSubscriptionsResponseAllOf {
    /// <summary>
    /// Gets or Sets Result
    /// </summary>
    [DataMember(Name="result", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "result")]
    public Object Result { get; set; }

    /// <summary>
    /// Gets or Sets Msg
    /// </summary>
    [DataMember(Name="msg", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "msg")]
    public Object Msg { get; set; }

    /// <summary>
    /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
    /// </summary>
    /// <value>A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. </value>
    [DataMember(Name="subscribed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subscribed")]
    public Dictionary<string, List<string>> Subscribed { get; set; }

    /// <summary>
    /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
    /// </summary>
    /// <value>A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. </value>
    [DataMember(Name="already_subscribed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "already_subscribed")]
    public Dictionary<string, List<string>> AlreadySubscribed { get; set; }

    /// <summary>
    /// A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
    /// </summary>
    /// <value>A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. </value>
    [DataMember(Name="unauthorized", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "unauthorized")]
    public List<string> Unauthorized { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AddSubscriptionsResponseAllOf {\n");
      sb.Append("  Result: ").Append(Result).Append("\n");
      sb.Append("  Msg: ").Append(Msg).Append("\n");
      sb.Append("  Subscribed: ").Append(Subscribed).Append("\n");
      sb.Append("  AlreadySubscribed: ").Append(AlreadySubscribed).Append("\n");
      sb.Append("  Unauthorized: ").Append(Unauthorized).Append("\n");
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
