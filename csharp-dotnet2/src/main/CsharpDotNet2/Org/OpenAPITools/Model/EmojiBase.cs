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
  public class EmojiBase {
    /// <summary>
    /// A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
    /// </summary>
    /// <value>A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. </value>
    [DataMember(Name="emoji_code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "emoji_code")]
    public string EmojiCode { get; set; }

    /// <summary>
    /// Name of the emoji. 
    /// </summary>
    /// <value>Name of the emoji. </value>
    [DataMember(Name="emoji_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "emoji_name")]
    public string EmojiName { get; set; }

    /// <summary>
    /// One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
    /// </summary>
    /// <value>One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. </value>
    [DataMember(Name="reaction_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "reaction_type")]
    public string ReactionType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class EmojiBase {\n");
      sb.Append("  EmojiCode: ").Append(EmojiCode).Append("\n");
      sb.Append("  EmojiName: ").Append(EmojiName).Append("\n");
      sb.Append("  ReactionType: ").Append(ReactionType).Append("\n");
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
