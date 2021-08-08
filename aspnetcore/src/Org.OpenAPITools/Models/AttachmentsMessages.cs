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
    /// 
    /// </summary>
    [DataContract]
    public partial class AttachmentsMessages : IEquatable<AttachmentsMessages>
    {
        /// <summary>
        /// Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called &#x60;name&#x60; and was a floating point number. 
        /// </summary>
        /// <value>Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called &#x60;name&#x60; and was a floating point number. </value>
        [DataMember(Name="date_sent", EmitDefaultValue=false)]
        public int DateSent { get; set; }

        /// <summary>
        /// The unique message ID.  Messages should always be displayed sorted by ID. 
        /// </summary>
        /// <value>The unique message ID.  Messages should always be displayed sorted by ID. </value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public int Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AttachmentsMessages {\n");
            sb.Append("  DateSent: ").Append(DateSent).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AttachmentsMessages)obj);
        }

        /// <summary>
        /// Returns true if AttachmentsMessages instances are equal
        /// </summary>
        /// <param name="other">Instance of AttachmentsMessages to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AttachmentsMessages other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DateSent == other.DateSent ||
                    
                    DateSent.Equals(other.DateSent)
                ) && 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
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
                    
                    hashCode = hashCode * 59 + DateSent.GetHashCode();
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AttachmentsMessages left, AttachmentsMessages right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AttachmentsMessages left, AttachmentsMessages right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
