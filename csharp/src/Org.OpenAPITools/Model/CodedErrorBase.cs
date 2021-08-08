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
    /// CodedErrorBase
    /// </summary>
    [DataContract]
    public partial class CodedErrorBase :  IEquatable<CodedErrorBase>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CodedErrorBase" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CodedErrorBase() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CodedErrorBase" /> class.
        /// </summary>
        /// <param name="result">result (required).</param>
        /// <param name="msg">msg (required).</param>
        /// <param name="code">A string that identifies the error. .</param>
        public CodedErrorBase(Object result = default(Object), Object msg = default(Object), string code = default(string))
        {
            // to ensure "result" is required (not null)
            if (result == null)
            {
                throw new InvalidDataException("result is a required property for CodedErrorBase and cannot be null");
            }
            else
            {
                this.Result = result;
            }

            this.Result = result;
            // to ensure "msg" is required (not null)
            if (msg == null)
            {
                throw new InvalidDataException("msg is a required property for CodedErrorBase and cannot be null");
            }
            else
            {
                this.Msg = msg;
            }

            this.Msg = msg;
            this.Code = code;
        }

        /// <summary>
        /// Gets or Sets Result
        /// </summary>
        [DataMember(Name="result", EmitDefaultValue=true)]
        public Object Result { get; set; }

        /// <summary>
        /// Gets or Sets Msg
        /// </summary>
        [DataMember(Name="msg", EmitDefaultValue=true)]
        public Object Msg { get; set; }

        /// <summary>
        /// A string that identifies the error. 
        /// </summary>
        /// <value>A string that identifies the error. </value>
        [DataMember(Name="code", EmitDefaultValue=false)]
        public string Code { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CodedErrorBase {\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
            sb.Append("  Msg: ").Append(Msg).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
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
            return this.Equals(input as CodedErrorBase);
        }

        /// <summary>
        /// Returns true if CodedErrorBase instances are equal
        /// </summary>
        /// <param name="input">Instance of CodedErrorBase to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CodedErrorBase input)
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
                ) && 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
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
                if (this.Code != null)
                    hashCode = hashCode * 59 + this.Code.GetHashCode();
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