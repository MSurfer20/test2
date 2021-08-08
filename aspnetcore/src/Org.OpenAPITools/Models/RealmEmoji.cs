/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
    /// </summary>
    [DataContract]
    public partial class RealmEmoji : IEquatable<RealmEmoji>
    {
        /// <summary>
        /// The ID for this emoji, same as the object&#39;s key. 
        /// </summary>
        /// <value>The ID for this emoji, same as the object&#39;s key. </value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;). 
        /// </summary>
        /// <value>The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;). </value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The path relative to the organization&#39;s URL where the emoji&#39;s image can be found. 
        /// </summary>
        /// <value>The path relative to the organization&#39;s URL where the emoji&#39;s image can be found. </value>
        [DataMember(Name="source_url", EmitDefaultValue=false)]
        public string SourceUrl { get; set; }

        /// <summary>
        /// Whether the emoji has been deactivated or not. 
        /// </summary>
        /// <value>Whether the emoji has been deactivated or not. </value>
        [DataMember(Name="deactivated", EmitDefaultValue=false)]
        public bool Deactivated { get; set; }

        /// <summary>
        /// The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field. 
        /// </summary>
        /// <value>The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field. </value>
        [DataMember(Name="author_id", EmitDefaultValue=true)]
        public int? AuthorId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
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
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((RealmEmoji)obj);
        }

        /// <summary>
        /// Returns true if RealmEmoji instances are equal
        /// </summary>
        /// <param name="other">Instance of RealmEmoji to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RealmEmoji other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    SourceUrl == other.SourceUrl ||
                    SourceUrl != null &&
                    SourceUrl.Equals(other.SourceUrl)
                ) && 
                (
                    Deactivated == other.Deactivated ||
                    
                    Deactivated.Equals(other.Deactivated)
                ) && 
                (
                    AuthorId == other.AuthorId ||
                    AuthorId != null &&
                    AuthorId.Equals(other.AuthorId)
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
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (SourceUrl != null)
                    hashCode = hashCode * 59 + SourceUrl.GetHashCode();
                    
                    hashCode = hashCode * 59 + Deactivated.GetHashCode();
                    if (AuthorId != null)
                    hashCode = hashCode * 59 + AuthorId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RealmEmoji left, RealmEmoji right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RealmEmoji left, RealmEmoji right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
