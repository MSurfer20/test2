using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Object containing the user group&#39;s attributes. 
  /// </summary>
  [DataContract]
  public class UserGroup {
    /// <summary>
    /// The name of the user group. 
    /// </summary>
    /// <value>The name of the user group. </value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// The description of the user group. 
    /// </summary>
    /// <value>The description of the user group. </value>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// Array containing the id of the users who are members of this user group. 
    /// </summary>
    /// <value>Array containing the id of the users who are members of this user group. </value>
    [DataMember(Name="members", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "members")]
    public List<int?> Members { get; set; }

    /// <summary>
    /// The ID of the user group. 
    /// </summary>
    /// <value>The ID of the user group. </value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class UserGroup {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  Members: ").Append(Members).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
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
