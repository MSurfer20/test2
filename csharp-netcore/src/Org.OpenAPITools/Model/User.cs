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
    /// User
    /// </summary>
    [DataContract(Name = "User")]
    public partial class User : IEquatable<User>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="User" /> class.
        /// </summary>
        /// <param name="email">email.</param>
        /// <param name="isBot">isBot.</param>
        /// <param name="avatarUrl">avatarUrl.</param>
        /// <param name="avatarVersion">avatarVersion.</param>
        /// <param name="fullName">fullName.</param>
        /// <param name="isAdmin">isAdmin.</param>
        /// <param name="isOwner">isOwner.</param>
        /// <param name="isBillingAdmin">isBillingAdmin.</param>
        /// <param name="role">role.</param>
        /// <param name="botType">botType.</param>
        /// <param name="userId">userId.</param>
        /// <param name="botOwnerId">botOwnerId.</param>
        /// <param name="isActive">isActive.</param>
        /// <param name="isGuest">isGuest.</param>
        /// <param name="timezone">timezone.</param>
        /// <param name="dateJoined">dateJoined.</param>
        /// <param name="deliveryEmail">deliveryEmail.</param>
        /// <param name="profileData">profileData.</param>
        public User(Object email = default(Object), Object isBot = default(Object), Object avatarUrl = default(Object), Object avatarVersion = default(Object), Object fullName = default(Object), Object isAdmin = default(Object), Object isOwner = default(Object), Object isBillingAdmin = default(Object), Object role = default(Object), Object botType = default(Object), Object userId = default(Object), Object botOwnerId = default(Object), Object isActive = default(Object), Object isGuest = default(Object), Object timezone = default(Object), Object dateJoined = default(Object), Object deliveryEmail = default(Object), Object profileData = default(Object))
        {
            this.Email = email;
            this.IsBot = isBot;
            this.AvatarUrl = avatarUrl;
            this.AvatarVersion = avatarVersion;
            this.FullName = fullName;
            this.IsAdmin = isAdmin;
            this.IsOwner = isOwner;
            this.IsBillingAdmin = isBillingAdmin;
            this.Role = role;
            this.BotType = botType;
            this.UserId = userId;
            this.BotOwnerId = botOwnerId;
            this.IsActive = isActive;
            this.IsGuest = isGuest;
            this.Timezone = timezone;
            this.DateJoined = dateJoined;
            this.DeliveryEmail = deliveryEmail;
            this.ProfileData = profileData;
        }

        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        [DataMember(Name = "email", EmitDefaultValue = true)]
        public Object Email { get; set; }

        /// <summary>
        /// Gets or Sets IsBot
        /// </summary>
        [DataMember(Name = "is_bot", EmitDefaultValue = true)]
        public Object IsBot { get; set; }

        /// <summary>
        /// Gets or Sets AvatarUrl
        /// </summary>
        [DataMember(Name = "avatar_url", EmitDefaultValue = true)]
        public Object AvatarUrl { get; set; }

        /// <summary>
        /// Gets or Sets AvatarVersion
        /// </summary>
        [DataMember(Name = "avatar_version", EmitDefaultValue = true)]
        public Object AvatarVersion { get; set; }

        /// <summary>
        /// Gets or Sets FullName
        /// </summary>
        [DataMember(Name = "full_name", EmitDefaultValue = true)]
        public Object FullName { get; set; }

        /// <summary>
        /// Gets or Sets IsAdmin
        /// </summary>
        [DataMember(Name = "is_admin", EmitDefaultValue = true)]
        public Object IsAdmin { get; set; }

        /// <summary>
        /// Gets or Sets IsOwner
        /// </summary>
        [DataMember(Name = "is_owner", EmitDefaultValue = true)]
        public Object IsOwner { get; set; }

        /// <summary>
        /// Gets or Sets IsBillingAdmin
        /// </summary>
        [DataMember(Name = "is_billing_admin", EmitDefaultValue = true)]
        public Object IsBillingAdmin { get; set; }

        /// <summary>
        /// Gets or Sets Role
        /// </summary>
        [DataMember(Name = "role", EmitDefaultValue = true)]
        public Object Role { get; set; }

        /// <summary>
        /// Gets or Sets BotType
        /// </summary>
        [DataMember(Name = "bot_type", EmitDefaultValue = true)]
        public Object BotType { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name = "user_id", EmitDefaultValue = true)]
        public Object UserId { get; set; }

        /// <summary>
        /// Gets or Sets BotOwnerId
        /// </summary>
        [DataMember(Name = "bot_owner_id", EmitDefaultValue = true)]
        public Object BotOwnerId { get; set; }

        /// <summary>
        /// Gets or Sets IsActive
        /// </summary>
        [DataMember(Name = "is_active", EmitDefaultValue = true)]
        public Object IsActive { get; set; }

        /// <summary>
        /// Gets or Sets IsGuest
        /// </summary>
        [DataMember(Name = "is_guest", EmitDefaultValue = true)]
        public Object IsGuest { get; set; }

        /// <summary>
        /// Gets or Sets Timezone
        /// </summary>
        [DataMember(Name = "timezone", EmitDefaultValue = true)]
        public Object Timezone { get; set; }

        /// <summary>
        /// Gets or Sets DateJoined
        /// </summary>
        [DataMember(Name = "date_joined", EmitDefaultValue = true)]
        public Object DateJoined { get; set; }

        /// <summary>
        /// Gets or Sets DeliveryEmail
        /// </summary>
        [DataMember(Name = "delivery_email", EmitDefaultValue = true)]
        public Object DeliveryEmail { get; set; }

        /// <summary>
        /// Gets or Sets ProfileData
        /// </summary>
        [DataMember(Name = "profile_data", EmitDefaultValue = true)]
        public Object ProfileData { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class User {\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  IsBot: ").Append(IsBot).Append("\n");
            sb.Append("  AvatarUrl: ").Append(AvatarUrl).Append("\n");
            sb.Append("  AvatarVersion: ").Append(AvatarVersion).Append("\n");
            sb.Append("  FullName: ").Append(FullName).Append("\n");
            sb.Append("  IsAdmin: ").Append(IsAdmin).Append("\n");
            sb.Append("  IsOwner: ").Append(IsOwner).Append("\n");
            sb.Append("  IsBillingAdmin: ").Append(IsBillingAdmin).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  BotType: ").Append(BotType).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  BotOwnerId: ").Append(BotOwnerId).Append("\n");
            sb.Append("  IsActive: ").Append(IsActive).Append("\n");
            sb.Append("  IsGuest: ").Append(IsGuest).Append("\n");
            sb.Append("  Timezone: ").Append(Timezone).Append("\n");
            sb.Append("  DateJoined: ").Append(DateJoined).Append("\n");
            sb.Append("  DeliveryEmail: ").Append(DeliveryEmail).Append("\n");
            sb.Append("  ProfileData: ").Append(ProfileData).Append("\n");
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
            return this.Equals(input as User);
        }

        /// <summary>
        /// Returns true if User instances are equal
        /// </summary>
        /// <param name="input">Instance of User to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(User input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.IsBot == input.IsBot ||
                    (this.IsBot != null &&
                    this.IsBot.Equals(input.IsBot))
                ) && 
                (
                    this.AvatarUrl == input.AvatarUrl ||
                    (this.AvatarUrl != null &&
                    this.AvatarUrl.Equals(input.AvatarUrl))
                ) && 
                (
                    this.AvatarVersion == input.AvatarVersion ||
                    (this.AvatarVersion != null &&
                    this.AvatarVersion.Equals(input.AvatarVersion))
                ) && 
                (
                    this.FullName == input.FullName ||
                    (this.FullName != null &&
                    this.FullName.Equals(input.FullName))
                ) && 
                (
                    this.IsAdmin == input.IsAdmin ||
                    (this.IsAdmin != null &&
                    this.IsAdmin.Equals(input.IsAdmin))
                ) && 
                (
                    this.IsOwner == input.IsOwner ||
                    (this.IsOwner != null &&
                    this.IsOwner.Equals(input.IsOwner))
                ) && 
                (
                    this.IsBillingAdmin == input.IsBillingAdmin ||
                    (this.IsBillingAdmin != null &&
                    this.IsBillingAdmin.Equals(input.IsBillingAdmin))
                ) && 
                (
                    this.Role == input.Role ||
                    (this.Role != null &&
                    this.Role.Equals(input.Role))
                ) && 
                (
                    this.BotType == input.BotType ||
                    (this.BotType != null &&
                    this.BotType.Equals(input.BotType))
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.BotOwnerId == input.BotOwnerId ||
                    (this.BotOwnerId != null &&
                    this.BotOwnerId.Equals(input.BotOwnerId))
                ) && 
                (
                    this.IsActive == input.IsActive ||
                    (this.IsActive != null &&
                    this.IsActive.Equals(input.IsActive))
                ) && 
                (
                    this.IsGuest == input.IsGuest ||
                    (this.IsGuest != null &&
                    this.IsGuest.Equals(input.IsGuest))
                ) && 
                (
                    this.Timezone == input.Timezone ||
                    (this.Timezone != null &&
                    this.Timezone.Equals(input.Timezone))
                ) && 
                (
                    this.DateJoined == input.DateJoined ||
                    (this.DateJoined != null &&
                    this.DateJoined.Equals(input.DateJoined))
                ) && 
                (
                    this.DeliveryEmail == input.DeliveryEmail ||
                    (this.DeliveryEmail != null &&
                    this.DeliveryEmail.Equals(input.DeliveryEmail))
                ) && 
                (
                    this.ProfileData == input.ProfileData ||
                    (this.ProfileData != null &&
                    this.ProfileData.Equals(input.ProfileData))
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
                if (this.Email != null)
                    hashCode = hashCode * 59 + this.Email.GetHashCode();
                if (this.IsBot != null)
                    hashCode = hashCode * 59 + this.IsBot.GetHashCode();
                if (this.AvatarUrl != null)
                    hashCode = hashCode * 59 + this.AvatarUrl.GetHashCode();
                if (this.AvatarVersion != null)
                    hashCode = hashCode * 59 + this.AvatarVersion.GetHashCode();
                if (this.FullName != null)
                    hashCode = hashCode * 59 + this.FullName.GetHashCode();
                if (this.IsAdmin != null)
                    hashCode = hashCode * 59 + this.IsAdmin.GetHashCode();
                if (this.IsOwner != null)
                    hashCode = hashCode * 59 + this.IsOwner.GetHashCode();
                if (this.IsBillingAdmin != null)
                    hashCode = hashCode * 59 + this.IsBillingAdmin.GetHashCode();
                if (this.Role != null)
                    hashCode = hashCode * 59 + this.Role.GetHashCode();
                if (this.BotType != null)
                    hashCode = hashCode * 59 + this.BotType.GetHashCode();
                if (this.UserId != null)
                    hashCode = hashCode * 59 + this.UserId.GetHashCode();
                if (this.BotOwnerId != null)
                    hashCode = hashCode * 59 + this.BotOwnerId.GetHashCode();
                if (this.IsActive != null)
                    hashCode = hashCode * 59 + this.IsActive.GetHashCode();
                if (this.IsGuest != null)
                    hashCode = hashCode * 59 + this.IsGuest.GetHashCode();
                if (this.Timezone != null)
                    hashCode = hashCode * 59 + this.Timezone.GetHashCode();
                if (this.DateJoined != null)
                    hashCode = hashCode * 59 + this.DateJoined.GetHashCode();
                if (this.DeliveryEmail != null)
                    hashCode = hashCode * 59 + this.DeliveryEmail.GetHashCode();
                if (this.ProfileData != null)
                    hashCode = hashCode * 59 + this.ProfileData.GetHashCode();
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