using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// &#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. 
  /// </summary>
  [DataContract]
  public class Presence {
    /// <summary>
    /// The client's platform name. 
    /// </summary>
    /// <value>The client's platform name. </value>
    [DataMember(Name="client", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "client")]
    public string _Client { get; set; }

    /// <summary>
    /// The status of the user on this client. It is either `idle` or `active`. 
    /// </summary>
    /// <value>The status of the user on this client. It is either `idle` or `active`. </value>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public string Status { get; set; }

    /// <summary>
    /// The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
    /// </summary>
    /// <value>The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. </value>
    [DataMember(Name="timestamp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timestamp")]
    public int? Timestamp { get; set; }

    /// <summary>
    /// Whether the client is capable of showing mobile/push notifications to the user. 
    /// </summary>
    /// <value>Whether the client is capable of showing mobile/push notifications to the user. </value>
    [DataMember(Name="pushable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pushable")]
    public bool? Pushable { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Presence {\n");
      sb.Append("  _Client: ").Append(_Client).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
      sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
      sb.Append("  Pushable: ").Append(Pushable).Append("\n");
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
