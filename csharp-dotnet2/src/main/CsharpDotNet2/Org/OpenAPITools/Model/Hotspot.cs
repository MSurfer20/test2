using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Dictionary containing details of a single hotspot. 
  /// </summary>
  [DataContract]
  public class Hotspot {
    /// <summary>
    /// The delay after which the user should be shown the hotspot. 
    /// </summary>
    /// <value>The delay after which the user should be shown the hotspot. </value>
    [DataMember(Name="delay", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "delay")]
    public decimal? Delay { get; set; }

    /// <summary>
    /// The name of the hotspot. 
    /// </summary>
    /// <value>The name of the hotspot. </value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// The title of the hotspot, as will be displayed to the user. 
    /// </summary>
    /// <value>The title of the hotspot, as will be displayed to the user. </value>
    [DataMember(Name="title", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "title")]
    public string Title { get; set; }

    /// <summary>
    /// The description of the hotspot, as will be displayed to the user. 
    /// </summary>
    /// <value>The description of the hotspot, as will be displayed to the user. </value>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Hotspot {\n");
      sb.Append("  Delay: ").Append(Delay).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Title: ").Append(Title).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
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
