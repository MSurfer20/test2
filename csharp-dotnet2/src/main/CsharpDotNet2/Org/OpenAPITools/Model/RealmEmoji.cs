using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
  /// </summary>
  [DataContract]
  public class RealmEmoji {
    /// <summary>
    /// The ID for this emoji, same as the object's key. 
    /// </summary>
    /// <value>The ID for this emoji, same as the object's key. </value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
    /// </summary>
    /// <value>The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). </value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// The path relative to the organization's URL where the emoji's image can be found. 
    /// </summary>
    /// <value>The path relative to the organization's URL where the emoji's image can be found. </value>
    [DataMember(Name="source_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "source_url")]
    public string SourceUrl { get; set; }

    /// <summary>
    /// Whether the emoji has been deactivated or not. 
    /// </summary>
    /// <value>Whether the emoji has been deactivated or not. </value>
    [DataMember(Name="deactivated", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "deactivated")]
    public bool? Deactivated { get; set; }

    /// <summary>
    /// The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
    /// </summary>
    /// <value>The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. </value>
    [DataMember(Name="author_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "author_id")]
    public int? AuthorId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class RealmEmoji {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  SourceUrl: ").Append(SourceUrl).Append("\n");
      sb.Append("  Deactivated: ").Append(Deactivated).Append("\n");
      sb.Append("  AuthorId: ").Append(AuthorId).Append("\n");
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
