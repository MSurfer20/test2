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
    /// JsonErrorBaseAllOf
    /// </summary>
    [DataContract]
    public partial class JsonErrorBaseAllOf :  IEquatable<JsonErrorBaseAllOf>, IValidatableObject
    {
        /// <summary>
        /// Defines Result
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ResultEnum
        {
            /// <summary>
            /// Enum Error for value: error
            /// </summary>
            [EnumMember(Value = "error")]
            Error = 1

        }

        /// <summary>
        /// Gets or Sets Result
        /// </summary>
        [DataMember(Name="result", EmitDefaultValue=true)]
        public ResultEnum Result { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="JsonErrorBaseAllOf" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected JsonErrorBaseAllOf() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="JsonErrorBaseAllOf" /> class.
        /// </summary>
        /// <param name="result">result (required).</param>
        /// <param name="msg">msg (required).</param>
        public JsonErrorBaseAllOf(ResultEnum result = default(ResultEnum), string msg = default(string))
        {
            // to ensure "result" is required (not null)
            if (result == null)
            {
                throw new InvalidDataException("result is a required property for JsonErrorBaseAllOf and cannot be null");
            }
            else
            {
                this.Result = result;
            }

            // to ensure "msg" is required (not null)
            if (msg == null)
            {
                throw new InvalidDataException("msg is a required property for JsonErrorBaseAllOf and cannot be null");
            }
            else
            {
                this.Msg = msg;
            }

        }


        /// <summary>
        /// Gets or Sets Msg
        /// </summary>
        [DataMember(Name="msg", EmitDefaultValue=true)]
        public string Msg { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class JsonErrorBaseAllOf {\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
            sb.Append("  Msg: ").Append(Msg).Append("\n");
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
            return this.Equals(input as JsonErrorBaseAllOf);
        }

        /// <summary>
        /// Returns true if JsonErrorBaseAllOf instances are equal
        /// </summary>
        /// <param name="input">Instance of JsonErrorBaseAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(JsonErrorBaseAllOf input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Result == input.Result ||
                    (this.Result != null &&
                    this.Result.Equals(input.Result))
                ) && 
                (
                    this.Msg == input.Msg ||
                    (this.Msg != null &&
                    this.Msg.Equals(input.Msg))
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
                if (this.Result != null)
                    hashCode = hashCode * 59 + this.Result.GetHashCode();
                if (this.Msg != null)
                    hashCode = hashCode * 59 + this.Msg.GetHashCode();
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
