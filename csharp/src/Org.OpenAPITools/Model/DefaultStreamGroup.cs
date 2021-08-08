/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Dictionary containing details of a default stream group. 
    /// </summary>
    [DataContract]
    public partial class DefaultStreamGroup :  IEquatable<DefaultStreamGroup>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultStreamGroup" /> class.
        /// </summary>
        /// <param name="name">Name of the default stream group. .</param>
        /// <param name="description">Description of the default stream group. .</param>
        /// <param name="id">id of the default stream group. .</param>
        /// <param name="streams">Array containing details about the streams in the default stream group. .</param>
        public DefaultStreamGroup(string name = default(string), string description = default(string), int id = default(int), List<BasicStream> streams = default(List<BasicStream>))
        {
            this.Name = name;
            this.Description = description;
            this.Id = id;
            this.Streams = streams;
        }

        /// <summary>
        /// Name of the default stream group. 
        /// </summary>
        /// <value>Name of the default stream group. </value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Description of the default stream group. 
        /// </summary>
        /// <value>Description of the default stream group. </value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// id of the default stream group. 
        /// </summary>
        /// <value>id of the default stream group. </value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public int Id { get; set; }

        /// <summary>
        /// Array containing details about the streams in the default stream group. 
        /// </summary>
        /// <value>Array containing details about the streams in the default stream group. </value>
        [DataMember(Name="streams", EmitDefaultValue=false)]
        public List<BasicStream> Streams { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DefaultStreamGroup {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Streams: ").Append(Streams).Append("\n");
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
            return this.Equals(input as DefaultStreamGroup);
        }

        /// <summary>
        /// Returns true if DefaultStreamGroup instances are equal
        /// </summary>
        /// <param name="input">Instance of DefaultStreamGroup to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DefaultStreamGroup input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Streams == input.Streams ||
                    this.Streams != null &&
                    input.Streams != null &&
                    this.Streams.SequenceEqual(input.Streams)
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Streams != null)
                    hashCode = hashCode * 59 + this.Streams.GetHashCode();
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
