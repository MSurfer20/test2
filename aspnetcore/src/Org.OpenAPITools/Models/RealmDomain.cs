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
    /// Object containing details of the newly added domain. 
    /// </summary>
    [DataContract]
    public partial class RealmDomain : IEquatable<RealmDomain>
    {
        /// <summary>
        /// The new allowed domain. 
        /// </summary>
        /// <value>The new allowed domain. </value>
        [DataMember(Name="domain", EmitDefaultValue=false)]
        public string Domain { get; set; }

        /// <summary>
        /// Whether subdomains are allowed for this domain. 
        /// </summary>
        /// <value>Whether subdomains are allowed for this domain. </value>
        [DataMember(Name="allow_subdomains", EmitDefaultValue=false)]
        public bool AllowSubdomains { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RealmDomain {\n");
            sb.Append("  Domain: ").Append(Domain).Append("\n");
            sb.Append("  AllowSubdomains: ").Append(AllowSubdomains).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RealmDomain)obj);
        }

        /// <summary>
        /// Returns true if RealmDomain instances are equal
        /// </summary>
        /// <param name="other">Instance of RealmDomain to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RealmDomain other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Domain == other.Domain ||
                    Domain != null &&
                    Domain.Equals(other.Domain)
                ) && 
                (
                    AllowSubdomains == other.AllowSubdomains ||
                    
                    AllowSubdomains.Equals(other.AllowSubdomains)
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
                    if (Domain != null)
                    hashCode = hashCode * 59 + Domain.GetHashCode();
                    
                    hashCode = hashCode * 59 + AllowSubdomains.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RealmDomain left, RealmDomain right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RealmDomain left, RealmDomain right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
