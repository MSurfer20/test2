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
    public partial class BadEventQueueIdError : IEquatable<BadEventQueueIdError>
    {
        /// <summary>
        /// Gets or Sets Result
        /// </summary>
        [Required]
        [DataMember(Name="result", EmitDefaultValue=true)]
        public Object Result { get; set; }

        /// <summary>
        /// Gets or Sets Msg
        /// </summary>
        [Required]
        [DataMember(Name="msg", EmitDefaultValue=true)]
        public Object Msg { get; set; }

        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [DataMember(Name="code", EmitDefaultValue=true)]
        public Object Code { get; set; }

        /// <summary>
        /// The string that identifies the invalid event queue. 
        /// </summary>
        /// <value>The string that identifies the invalid event queue. </value>
        [DataMember(Name="queue_id", EmitDefaultValue=false)]
        public string QueueId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BadEventQueueIdError {\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
            sb.Append("  Msg: ").Append(Msg).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  QueueId: ").Append(QueueId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BadEventQueueIdError)obj);
        }

        /// <summary>
        /// Returns true if BadEventQueueIdError instances are equal
        /// </summary>
        /// <param name="other">Instance of BadEventQueueIdError to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BadEventQueueIdError other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Result == other.Result ||
                    Result != null &&
                    Result.Equals(other.Result)
                ) && 
                (
                    Msg == other.Msg ||
                    Msg != null &&
                    Msg.Equals(other.Msg)
                ) && 
                (
                    Code == other.Code ||
                    Code != null &&
                    Code.Equals(other.Code)
                ) && 
                (
                    QueueId == other.QueueId ||
                    QueueId != null &&
                    QueueId.Equals(other.QueueId)
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
                    if (Result != null)
                    hashCode = hashCode * 59 + Result.GetHashCode();
                    if (Msg != null)
                    hashCode = hashCode * 59 + Msg.GetHashCode();
                    if (Code != null)
                    hashCode = hashCode * 59 + Code.GetHashCode();
                    if (QueueId != null)
                    hashCode = hashCode * 59 + QueueId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BadEventQueueIdError left, BadEventQueueIdError right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BadEventQueueIdError left, BadEventQueueIdError right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
