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
    /// Object containing details about a realm export. 
    /// </summary>
    [DataContract(Name = "RealmExport")]
    public partial class RealmExport : IEquatable<RealmExport>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RealmExport" /> class.
        /// </summary>
        /// <param name="id">The id of the export. .</param>
        /// <param name="actingUserId">The id of the user who did the export. .</param>
        /// <param name="exportTime">The UNIX timestamp of when the export was made. .</param>
        /// <param name="deletedTimestamp">The timestamp of when the export was deleted. Null if it wasn&#39;t. .</param>
        /// <param name="failedTimestamp">The timestamp of when the export failed. Null if it didn&#39;t. .</param>
        /// <param name="exportUrl">The URL of the export. &#x60;null&#x60; if there&#39;s no URL. .</param>
        /// <param name="pending">Whether the export is pending or not. .</param>
        public RealmExport(int id = default(int), int actingUserId = default(int), decimal exportTime = default(decimal), decimal? deletedTimestamp = default(decimal?), decimal? failedTimestamp = default(decimal?), string exportUrl = default(string), bool pending = default(bool))
        {
            this.Id = id;
            this.ActingUserId = actingUserId;
            this.ExportTime = exportTime;
            this.DeletedTimestamp = deletedTimestamp;
            this.FailedTimestamp = failedTimestamp;
            this.ExportUrl = exportUrl;
            this.Pending = pending;
        }

        /// <summary>
        /// The id of the export. 
        /// </summary>
        /// <value>The id of the export. </value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// The id of the user who did the export. 
        /// </summary>
        /// <value>The id of the user who did the export. </value>
        [DataMember(Name = "acting_user_id", EmitDefaultValue = false)]
        public int ActingUserId { get; set; }

        /// <summary>
        /// The UNIX timestamp of when the export was made. 
        /// </summary>
        /// <value>The UNIX timestamp of when the export was made. </value>
        [DataMember(Name = "export_time", EmitDefaultValue = false)]
        public decimal ExportTime { get; set; }

        /// <summary>
        /// The timestamp of when the export was deleted. Null if it wasn&#39;t. 
        /// </summary>
        /// <value>The timestamp of when the export was deleted. Null if it wasn&#39;t. </value>
        [DataMember(Name = "deleted_timestamp", EmitDefaultValue = true)]
        public decimal? DeletedTimestamp { get; set; }

        /// <summary>
        /// The timestamp of when the export failed. Null if it didn&#39;t. 
        /// </summary>
        /// <value>The timestamp of when the export failed. Null if it didn&#39;t. </value>
        [DataMember(Name = "failed_timestamp", EmitDefaultValue = true)]
        public decimal? FailedTimestamp { get; set; }

        /// <summary>
        /// The URL of the export. &#x60;null&#x60; if there&#39;s no URL. 
        /// </summary>
        /// <value>The URL of the export. &#x60;null&#x60; if there&#39;s no URL. </value>
        [DataMember(Name = "export_url", EmitDefaultValue = true)]
        public string ExportUrl { get; set; }

        /// <summary>
        /// Whether the export is pending or not. 
        /// </summary>
        /// <value>Whether the export is pending or not. </value>
        [DataMember(Name = "pending", EmitDefaultValue = true)]
        public bool Pending { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RealmExport {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ActingUserId: ").Append(ActingUserId).Append("\n");
            sb.Append("  ExportTime: ").Append(ExportTime).Append("\n");
            sb.Append("  DeletedTimestamp: ").Append(DeletedTimestamp).Append("\n");
            sb.Append("  FailedTimestamp: ").Append(FailedTimestamp).Append("\n");
            sb.Append("  ExportUrl: ").Append(ExportUrl).Append("\n");
            sb.Append("  Pending: ").Append(Pending).Append("\n");
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
            return this.Equals(input as RealmExport);
        }

        /// <summary>
        /// Returns true if RealmExport instances are equal
        /// </summary>
        /// <param name="input">Instance of RealmExport to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RealmExport input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    this.Id.Equals(input.Id)
                ) && 
                (
                    this.ActingUserId == input.ActingUserId ||
                    this.ActingUserId.Equals(input.ActingUserId)
                ) && 
                (
                    this.ExportTime == input.ExportTime ||
                    this.ExportTime.Equals(input.ExportTime)
                ) && 
                (
                    this.DeletedTimestamp == input.DeletedTimestamp ||
                    (this.DeletedTimestamp != null &&
                    this.DeletedTimestamp.Equals(input.DeletedTimestamp))
                ) && 
                (
                    this.FailedTimestamp == input.FailedTimestamp ||
                    (this.FailedTimestamp != null &&
                    this.FailedTimestamp.Equals(input.FailedTimestamp))
                ) && 
                (
                    this.ExportUrl == input.ExportUrl ||
                    (this.ExportUrl != null &&
                    this.ExportUrl.Equals(input.ExportUrl))
                ) && 
                (
                    this.Pending == input.Pending ||
                    this.Pending.Equals(input.Pending)
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
                hashCode = hashCode * 59 + this.Id.GetHashCode();
                hashCode = hashCode * 59 + this.ActingUserId.GetHashCode();
                hashCode = hashCode * 59 + this.ExportTime.GetHashCode();
                if (this.DeletedTimestamp != null)
                    hashCode = hashCode * 59 + this.DeletedTimestamp.GetHashCode();
                if (this.FailedTimestamp != null)
                    hashCode = hashCode * 59 + this.FailedTimestamp.GetHashCode();
                if (this.ExportUrl != null)
                    hashCode = hashCode * 59 + this.ExportUrl.GetHashCode();
                hashCode = hashCode * 59 + this.Pending.GetHashCode();
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
