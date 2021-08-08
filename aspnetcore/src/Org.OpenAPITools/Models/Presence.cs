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
    /// &#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. 
    /// </summary>
    [DataContract]
    public partial class Presence : IEquatable<Presence>
    {
        /// <summary>
        /// The client&#39;s platform name. 
        /// </summary>
        /// <value>The client&#39;s platform name. </value>
        [DataMember(Name="client", EmitDefaultValue=false)]
        public string _Client { get; set; }


        /// <summary>
        /// The status of the user on this client. It is either `idle` or `active`. 
        /// </summary>
        /// <value>The status of the user on this client. It is either `idle` or `active`. </value>
        [TypeConverter(typeof(CustomEnumConverter<StatusEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum StatusEnum
        {
            
            /// <summary>
            /// Enum IdleEnum for idle
            /// </summary>
            [EnumMember(Value = "idle")]
            IdleEnum = 1,
            
            /// <summary>
            /// Enum ActiveEnum for active
            /// </summary>
            [EnumMember(Value = "active")]
            ActiveEnum = 2
        }

        /// <summary>
        /// The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;. 
        /// </summary>
        /// <value>The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;. </value>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public StatusEnum Status { get; set; }

        /// <summary>
        /// The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second. 
        /// </summary>
        /// <value>The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second. </value>
        [DataMember(Name="timestamp", EmitDefaultValue=false)]
        public int Timestamp { get; set; }

        /// <summary>
        /// Whether the client is capable of showing mobile/push notifications to the user. 
        /// </summary>
        /// <value>Whether the client is capable of showing mobile/push notifications to the user. </value>
        [DataMember(Name="pushable", EmitDefaultValue=false)]
        public bool Pushable { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Presence {\n");
            sb.Append("  _Client: ").Append(_Client).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Pushable: ").Append(Pushable).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Presence)obj);
        }

        /// <summary>
        /// Returns true if Presence instances are equal
        /// </summary>
        /// <param name="other">Instance of Presence to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Presence other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    _Client == other._Client ||
                    _Client != null &&
                    _Client.Equals(other._Client)
                ) && 
                (
                    Status == other.Status ||
                    
                    Status.Equals(other.Status)
                ) && 
                (
                    Timestamp == other.Timestamp ||
                    
                    Timestamp.Equals(other.Timestamp)
                ) && 
                (
                    Pushable == other.Pushable ||
                    
                    Pushable.Equals(other.Pushable)
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
                    if (_Client != null)
                    hashCode = hashCode * 59 + _Client.GetHashCode();
                    
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    
                    hashCode = hashCode * 59 + Timestamp.GetHashCode();
                    
                    hashCode = hashCode * 59 + Pushable.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Presence left, Presence right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Presence left, Presence right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
