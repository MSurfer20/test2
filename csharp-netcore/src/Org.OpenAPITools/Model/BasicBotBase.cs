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
    /// BasicBotBase
    /// </summary>
    [DataContract(Name = "BasicBotBase")]
    public partial class BasicBotBase : IEquatable<BasicBotBase>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BasicBotBase" /> class.
        /// </summary>
        /// <param name="userId">The user id of the bot. .</param>
        /// <param name="fullName">The full name of the bot. .</param>
        /// <param name="apiKey">The API key of the bot which it uses to make API requests. .</param>
        /// <param name="defaultSendingStream">The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream. .</param>
        /// <param name="defaultEventsRegisterStream">The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream. .</param>
        /// <param name="defaultAllPublicStreams">Whether the bot can send messages to all streams by default. .</param>
        /// <param name="avatarUrl">The URL of the bot&#39;s avatar. .</param>
        /// <param name="ownerId">The user id of the bot&#39;s owner.  Null if the bot has no owner. .</param>
        /// <param name="services">The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. .</param>
        public BasicBotBase(int userId = default(int), string fullName = default(string), string apiKey = default(string), string defaultSendingStream = default(string), string defaultEventsRegisterStream = default(string), bool defaultAllPublicStreams = default(bool), string avatarUrl = default(string), int? ownerId = default(int?), List<OneOfobjectobject> services = default(List<OneOfobjectobject>))
        {
            this.UserId = userId;
            this.FullName = fullName;
            this.ApiKey = apiKey;
            this.DefaultSendingStream = defaultSendingStream;
            this.DefaultEventsRegisterStream = defaultEventsRegisterStream;
            this.DefaultAllPublicStreams = defaultAllPublicStreams;
            this.AvatarUrl = avatarUrl;
            this.OwnerId = ownerId;
            this.Services = services;
        }

        /// <summary>
        /// The user id of the bot. 
        /// </summary>
        /// <value>The user id of the bot. </value>
        [DataMember(Name = "user_id", EmitDefaultValue = false)]
        public int UserId { get; set; }

        /// <summary>
        /// The full name of the bot. 
        /// </summary>
        /// <value>The full name of the bot. </value>
        [DataMember(Name = "full_name", EmitDefaultValue = false)]
        public string FullName { get; set; }

        /// <summary>
        /// The API key of the bot which it uses to make API requests. 
        /// </summary>
        /// <value>The API key of the bot which it uses to make API requests. </value>
        [DataMember(Name = "api_key", EmitDefaultValue = false)]
        public string ApiKey { get; set; }

        /// <summary>
        /// The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream. 
        /// </summary>
        /// <value>The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream. </value>
        [DataMember(Name = "default_sending_stream", EmitDefaultValue = true)]
        public string DefaultSendingStream { get; set; }

        /// <summary>
        /// The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream. 
        /// </summary>
        /// <value>The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream. </value>
        [DataMember(Name = "default_events_register_stream", EmitDefaultValue = true)]
        public string DefaultEventsRegisterStream { get; set; }

        /// <summary>
        /// Whether the bot can send messages to all streams by default. 
        /// </summary>
        /// <value>Whether the bot can send messages to all streams by default. </value>
        [DataMember(Name = "default_all_public_streams", EmitDefaultValue = true)]
        public bool DefaultAllPublicStreams { get; set; }

        /// <summary>
        /// The URL of the bot&#39;s avatar. 
        /// </summary>
        /// <value>The URL of the bot&#39;s avatar. </value>
        [DataMember(Name = "avatar_url", EmitDefaultValue = false)]
        public string AvatarUrl { get; set; }

        /// <summary>
        /// The user id of the bot&#39;s owner.  Null if the bot has no owner. 
        /// </summary>
        /// <value>The user id of the bot&#39;s owner.  Null if the bot has no owner. </value>
        [DataMember(Name = "owner_id", EmitDefaultValue = true)]
        public int? OwnerId { get; set; }

        /// <summary>
        /// The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
        /// </summary>
        /// <value>The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. </value>
        [DataMember(Name = "services", EmitDefaultValue = false)]
        public List<OneOfobjectobject> Services { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BasicBotBase {\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  FullName: ").Append(FullName).Append("\n");
            sb.Append("  ApiKey: ").Append(ApiKey).Append("\n");
            sb.Append("  DefaultSendingStream: ").Append(DefaultSendingStream).Append("\n");
            sb.Append("  DefaultEventsRegisterStream: ").Append(DefaultEventsRegisterStream).Append("\n");
            sb.Append("  DefaultAllPublicStreams: ").Append(DefaultAllPublicStreams).Append("\n");
            sb.Append("  AvatarUrl: ").Append(AvatarUrl).Append("\n");
            sb.Append("  OwnerId: ").Append(OwnerId).Append("\n");
            sb.Append("  Services: ").Append(Services).Append("\n");
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
            return this.Equals(input as BasicBotBase);
        }

        /// <summary>
        /// Returns true if BasicBotBase instances are equal
        /// </summary>
        /// <param name="input">Instance of BasicBotBase to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BasicBotBase input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.UserId == input.UserId ||
                    this.UserId.Equals(input.UserId)
                ) && 
                (
                    this.FullName == input.FullName ||
                    (this.FullName != null &&
                    this.FullName.Equals(input.FullName))
                ) && 
                (
                    this.ApiKey == input.ApiKey ||
                    (this.ApiKey != null &&
                    this.ApiKey.Equals(input.ApiKey))
                ) && 
                (
                    this.DefaultSendingStream == input.DefaultSendingStream ||
                    (this.DefaultSendingStream != null &&
                    this.DefaultSendingStream.Equals(input.DefaultSendingStream))
                ) && 
                (
                    this.DefaultEventsRegisterStream == input.DefaultEventsRegisterStream ||
                    (this.DefaultEventsRegisterStream != null &&
                    this.DefaultEventsRegisterStream.Equals(input.DefaultEventsRegisterStream))
                ) && 
                (
                    this.DefaultAllPublicStreams == input.DefaultAllPublicStreams ||
                    this.DefaultAllPublicStreams.Equals(input.DefaultAllPublicStreams)
                ) && 
                (
                    this.AvatarUrl == input.AvatarUrl ||
                    (this.AvatarUrl != null &&
                    this.AvatarUrl.Equals(input.AvatarUrl))
                ) && 
                (
                    this.OwnerId == input.OwnerId ||
                    (this.OwnerId != null &&
                    this.OwnerId.Equals(input.OwnerId))
                ) && 
                (
                    this.Services == input.Services ||
                    this.Services != null &&
                    input.Services != null &&
                    this.Services.SequenceEqual(input.Services)
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
                hashCode = hashCode * 59 + this.UserId.GetHashCode();
                if (this.FullName != null)
                    hashCode = hashCode * 59 + this.FullName.GetHashCode();
                if (this.ApiKey != null)
                    hashCode = hashCode * 59 + this.ApiKey.GetHashCode();
                if (this.DefaultSendingStream != null)
                    hashCode = hashCode * 59 + this.DefaultSendingStream.GetHashCode();
                if (this.DefaultEventsRegisterStream != null)
                    hashCode = hashCode * 59 + this.DefaultEventsRegisterStream.GetHashCode();
                hashCode = hashCode * 59 + this.DefaultAllPublicStreams.GetHashCode();
                if (this.AvatarUrl != null)
                    hashCode = hashCode * 59 + this.AvatarUrl.GetHashCode();
                if (this.OwnerId != null)
                    hashCode = hashCode * 59 + this.OwnerId.GetHashCode();
                if (this.Services != null)
                    hashCode = hashCode * 59 + this.Services.GetHashCode();
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
