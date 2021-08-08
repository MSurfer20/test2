using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Object containing details about a realm playground. 
  /// </summary>
  [DataContract]
  public class RealmPlayground {
    /// <summary>
    /// The unique ID for the realm playground. 
    /// </summary>
    /// <value>The unique ID for the realm playground. </value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

    /// <summary>
    /// The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
    /// </summary>
    /// <value>The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). </value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// The name of the Pygments language lexer for that programming language. 
    /// </summary>
    /// <value>The name of the Pygments language lexer for that programming language. </value>
    [DataMember(Name="pygments_language", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pygments_language")]
    public string PygmentsLanguage { get; set; }

    /// <summary>
    /// The url prefix for the playground. 
    /// </summary>
    /// <value>The url prefix for the playground. </value>
    [DataMember(Name="url_prefix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "url_prefix")]
    public string UrlPrefix { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class RealmPlayground {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  PygmentsLanguage: ").Append(PygmentsLanguage).Append("\n");
      sb.Append("  UrlPrefix: ").Append(UrlPrefix).Append("\n");
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
