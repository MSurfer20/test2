/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// EmojiReactionBase
    /// </summary>
    [DataContract(Name = "EmojiReactionBase")]
    public partial class EmojiReactionBase : IEquatable<EmojiReactionBase>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EmojiReactionBase" /> class.
        /// </summary>
        /// <param name="emojiCode">A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint. .</param>
        /// <param name="emojiName">Name of the emoji. .</param>
        /// <param name="reactionType">One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. .</param>
        /// <param name="userId">The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future. .</param>
        /// <param name="user">user.</param>
        public EmojiReactionBase(string emojiCode = default(string), string emojiName = default(string), string reactionType = default(string), int userId = default(int), EmojiReactionBaseUser user = default(EmojiReactionBaseUser))
        {
            this.EmojiCode = emojiCode;
            this.EmojiName = emojiName;
            this.ReactionType = reactionType;
            this.UserId = userId;
            this.User = user;
        }

        /// <summary>
        /// A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint. 
        /// </summary>
        /// <value>A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint. </value>
        [DataMember(Name = "emoji_code", EmitDefaultValue = false)]
        public string EmojiCode { get; set; }

        /// <summary>
        /// Name of the emoji. 
        /// </summary>
        /// <value>Name of the emoji. </value>
        [DataMember(Name = "emoji_name", EmitDefaultValue = false)]
        public string EmojiName { get; set; }

        /// <summary>
        /// One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. 
        /// </summary>
        /// <value>One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. </value>
        [DataMember(Name = "reaction_type", EmitDefaultValue = false)]
        public string ReactionType { get; set; }

        /// <summary>
        /// The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future. 
        /// </summary>
        /// <value>The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future. </value>
        [DataMember(Name = "user_id", EmitDefaultValue = false)]
        public int UserId { get; set; }

        /// <summary>
        /// Gets or Sets User
        /// </summary>
        [DataMember(Name = "user", EmitDefaultValue = false)]
        public EmojiReactionBaseUser User { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EmojiReactionBase {\n");
            sb.Append("  EmojiCode: ").Append(EmojiCode).Append("\n");
            sb.Append("  EmojiName: ").Append(EmojiName).Append("\n");
            sb.Append("  ReactionType: ").Append(ReactionType).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as EmojiReactionBase);
        }

        /// <summary>
        /// Returns true if EmojiReactionBase instances are equal
        /// </summary>
        /// <param name="input">Instance of EmojiReactionBase to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EmojiReactionBase input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.EmojiCode == input.EmojiCode ||
                    (this.EmojiCode != null &&
                    this.EmojiCode.Equals(input.EmojiCode))
                ) && 
                (
                    this.EmojiName == input.EmojiName ||
                    (this.EmojiName != null &&
                    this.EmojiName.Equals(input.EmojiName))
                ) && 
                (
                    this.ReactionType == input.ReactionType ||
                    (this.ReactionType != null &&
                    this.ReactionType.Equals(input.ReactionType))
                ) && 
                (
                    this.UserId == input.UserId ||
                    this.UserId.Equals(input.UserId)
                ) && 
                (
                    this.User == input.User ||
                    (this.User != null &&
                    this.User.Equals(input.User))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.EmojiCode != null)
                    hashCode = hashCode * 59 + this.EmojiCode.GetHashCode();
                if (this.EmojiName != null)
                    hashCode = hashCode * 59 + this.EmojiName.GetHashCode();
                if (this.ReactionType != null)
                    hashCode = hashCode * 59 + this.ReactionType.GetHashCode();
                hashCode = hashCode * 59 + this.UserId.GetHashCode();
                if (this.User != null)
                    hashCode = hashCode * 59 + this.User.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}