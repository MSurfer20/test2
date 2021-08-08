using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Dictionary containing details of a default stream group. 
  /// </summary>
  [DataContract]
  public class DefaultStreamGroup {
    /// <summary>
    /// Name of the default stream group. 
    /// </summary>
    /// <value>Name of the default stream group. </value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Description of the default stream group. 
    /// </summary>
    /// <value>Description of the default stream group. </value>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// id of the default stream group. 
    /// </summary>
    /// <value>id of the default stream group. </value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

    /// <summary>
    /// Array containing details about the streams in the default stream group. 
    /// </summary>
    /// <value>Array containing details about the streams in the default stream group. </value>
    [DataMember(Name="streams", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "streams")]
    public List<BasicStream> Streams { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DefaultStreamGroup {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Streams: ").Append(Streams).Append("\n");
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
