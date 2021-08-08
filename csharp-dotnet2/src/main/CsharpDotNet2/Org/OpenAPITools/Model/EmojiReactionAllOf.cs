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
  public class EmojiReactionAllOf {
    /// <summary>
    /// Gets or Sets EmojiCode
    /// </summary>
    [DataMember(Name="emoji_code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "emoji_code")]
    public Object EmojiCode { get; set; }

    /// <summary>
    /// Gets or Sets EmojiName
    /// </summary>
    [DataMember(Name="emoji_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "emoji_name")]
    public Object EmojiName { get; set; }

    /// <summary>
    /// Gets or Sets ReactionType
    /// </summary>
    [DataMember(Name="reaction_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "reaction_type")]
    public Object ReactionType { get; set; }

    /// <summary>
    /// Gets or Sets UserId
    /// </summary>
    [DataMember(Name="user_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user_id")]
    public Object UserId { get; set; }

    /// <summary>
    /// Gets or Sets User
    /// </summary>
    [DataMember(Name="user", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user")]
    public Object User { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class EmojiReactionAllOf {\n");
      sb.Append("  EmojiCode: ").Append(EmojiCode).Append("\n");
      sb.Append("  EmojiName: ").Append(EmojiName).Append("\n");
      sb.Append("  ReactionType: ").Append(ReactionType).Append("\n");
      sb.Append("  UserId: ").Append(UserId).Append("\n");
      sb.Append("  User: ").Append(User).Append("\n");
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
