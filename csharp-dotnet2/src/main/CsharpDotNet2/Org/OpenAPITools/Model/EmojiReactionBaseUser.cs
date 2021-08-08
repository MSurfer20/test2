using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Dictionary with data on the user who added the reaction, including the user ID as the &#x60;id&#x60; field.  **Note**: In the [events API](/api/get-events), this &#x60;user&#x60; dictionary confusing had the user ID in a field called &#x60;user_id&#x60; instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the &#x60;user_id&#x60; field. 
  /// </summary>
  [DataContract]
  public class EmojiReactionBaseUser {
    /// <summary>
    /// ID of the user. 
    /// </summary>
    /// <value>ID of the user. </value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

    /// <summary>
    /// Email of the user. 
    /// </summary>
    /// <value>Email of the user. </value>
    [DataMember(Name="email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email")]
    public string Email { get; set; }

    /// <summary>
    /// Full name of the user. 
    /// </summary>
    /// <value>Full name of the user. </value>
    [DataMember(Name="full_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "full_name")]
    public string FullName { get; set; }

    /// <summary>
    /// Whether the user is a mirror dummy. 
    /// </summary>
    /// <value>Whether the user is a mirror dummy. </value>
    [DataMember(Name="is_mirror_dummy", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_mirror_dummy")]
    public bool? IsMirrorDummy { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class EmojiReactionBaseUser {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Email: ").Append(Email).Append("\n");
      sb.Append("  FullName: ").Append(FullName).Append("\n");
      sb.Append("  IsMirrorDummy: ").Append(IsMirrorDummy).Append("\n");
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
