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
    /// A dictionary for representing a message draft. 
    /// </summary>
    [DataContract]
    public partial class Draft : IEquatable<Draft>
    {
        /// <summary>
        /// The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
        /// </summary>
        /// <value>The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. </value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public int Id { get; set; }


        /// <summary>
        /// The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
        /// </summary>
        /// <value>The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). </value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum Empty for 
            /// </summary>
            [EnumMember(Value = "")]
            Empty = 1,
            
            /// <summary>
            /// Enum StreamEnum for stream
            /// </summary>
            [EnumMember(Value = "stream")]
            StreamEnum = 2,
            
            /// <summary>
            /// Enum PrivateEnum for private
            /// </summary>
            [EnumMember(Value = "private")]
            PrivateEnum = 3
        }

        /// <summary>
        /// The type of the draft. Either unaddressed (empty string), \&quot;stream\&quot;, or \&quot;private\&quot; (for PMs and private group messages). 
        /// </summary>
        /// <value>The type of the draft. Either unaddressed (empty string), \&quot;stream\&quot;, or \&quot;private\&quot; (for PMs and private group messages). </value>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// An array of the tentative target audience IDs. For \&quot;stream\&quot; messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
        /// </summary>
        /// <value>An array of the tentative target audience IDs. For \&quot;stream\&quot; messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. </value>
        [Required]
        [DataMember(Name="to", EmitDefaultValue=false)]
        public List<int> To { get; set; }

        /// <summary>
        /// For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
        /// </summary>
        /// <value>For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. </value>
        [Required]
        [DataMember(Name="topic", EmitDefaultValue=false)]
        public string Topic { get; set; }

        /// <summary>
        /// The body of the draft. Should not contain null bytes. 
        /// </summary>
        /// <value>The body of the draft. Should not contain null bytes. </value>
        [Required]
        [DataMember(Name="content", EmitDefaultValue=false)]
        public string Content { get; set; }

        /// <summary>
        /// A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
        /// </summary>
        /// <value>A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. </value>
        [DataMember(Name="timestamp", EmitDefaultValue=false)]
        public decimal Timestamp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Draft {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  To: ").Append(To).Append("\n");
            sb.Append("  Topic: ").Append(Topic).Append("\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Draft)obj);
        }

        /// <summary>
        /// Returns true if Draft instances are equal
        /// </summary>
        /// <param name="other">Instance of Draft to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Draft other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    To == other.To ||
                    To != null &&
                    other.To != null &&
                    To.SequenceEqual(other.To)
                ) && 
                (
                    Topic == other.Topic ||
                    Topic != null &&
                    Topic.Equals(other.Topic)
                ) && 
                (
                    Content == other.Content ||
                    Content != null &&
                    Content.Equals(other.Content)
                ) && 
                (
                    Timestamp == other.Timestamp ||
                    
                    Timestamp.Equals(other.Timestamp)
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
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (To != null)
                    hashCode = hashCode * 59 + To.GetHashCode();
                    if (Topic != null)
                    hashCode = hashCode * 59 + Topic.GetHashCode();
                    if (Content != null)
                    hashCode = hashCode * 59 + Content.GetHashCode();
                    
                    hashCode = hashCode * 59 + Timestamp.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Draft left, Draft right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Draft left, Draft right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
