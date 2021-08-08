using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// UserAllOf
    /// </summary>
    public sealed class UserAllOf:  IEquatable<UserAllOf>
    { 
        /// <summary>
        /// Email
        /// </summary>
        public Object Email { get; private set; }

        /// <summary>
        /// IsBot
        /// </summary>
        public Object IsBot { get; private set; }

        /// <summary>
        /// AvatarUrl
        /// </summary>
        public Object AvatarUrl { get; private set; }

        /// <summary>
        /// AvatarVersion
        /// </summary>
        public Object AvatarVersion { get; private set; }

        /// <summary>
        /// FullName
        /// </summary>
        public Object FullName { get; private set; }

        /// <summary>
        /// IsAdmin
        /// </summary>
        public Object IsAdmin { get; private set; }

        /// <summary>
        /// IsOwner
        /// </summary>
        public Object IsOwner { get; private set; }

        /// <summary>
        /// IsBillingAdmin
        /// </summary>
        public Object IsBillingAdmin { get; private set; }

        /// <summary>
        /// Role
        /// </summary>
        public Object Role { get; private set; }

        /// <summary>
        /// BotType
        /// </summary>
        public Object BotType { get; private set; }

        /// <summary>
        /// UserId
        /// </summary>
        public Object UserId { get; private set; }

        /// <summary>
        /// BotOwnerId
        /// </summary>
        public Object BotOwnerId { get; private set; }

        /// <summary>
        /// IsActive
        /// </summary>
        public Object IsActive { get; private set; }

        /// <summary>
        /// IsGuest
        /// </summary>
        public Object IsGuest { get; private set; }

        /// <summary>
        /// Timezone
        /// </summary>
        public Object Timezone { get; private set; }

        /// <summary>
        /// DateJoined
        /// </summary>
        public Object DateJoined { get; private set; }

        /// <summary>
        /// DeliveryEmail
        /// </summary>
        public Object DeliveryEmail { get; private set; }

        /// <summary>
        /// ProfileData
        /// </summary>
        public Object ProfileData { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use UserAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public UserAllOf()
        {
        }

        private UserAllOf(Object Email, Object IsBot, Object AvatarUrl, Object AvatarVersion, Object FullName, Object IsAdmin, Object IsOwner, Object IsBillingAdmin, Object Role, Object BotType, Object UserId, Object BotOwnerId, Object IsActive, Object IsGuest, Object Timezone, Object DateJoined, Object DeliveryEmail, Object ProfileData)
        {
            
            this.Email = Email;
            
            this.IsBot = IsBot;
            
            this.AvatarUrl = AvatarUrl;
            
            this.AvatarVersion = AvatarVersion;
            
            this.FullName = FullName;
            
            this.IsAdmin = IsAdmin;
            
            this.IsOwner = IsOwner;
            
            this.IsBillingAdmin = IsBillingAdmin;
            
            this.Role = Role;
            
            this.BotType = BotType;
            
            this.UserId = UserId;
            
            this.BotOwnerId = BotOwnerId;
            
            this.IsActive = IsActive;
            
            this.IsGuest = IsGuest;
            
            this.Timezone = Timezone;
            
            this.DateJoined = DateJoined;
            
            this.DeliveryEmail = DeliveryEmail;
            
            this.ProfileData = ProfileData;
            
        }

        /// <summary>
        /// Returns builder of UserAllOf.
        /// </summary>
        /// <returns>UserAllOfBuilder</returns>
        public static UserAllOfBuilder Builder()
        {
            return new UserAllOfBuilder();
        }

        /// <summary>
        /// Returns UserAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UserAllOfBuilder</returns>
        public UserAllOfBuilder With()
        {
            return Builder()
                .Email(Email)
                .IsBot(IsBot)
                .AvatarUrl(AvatarUrl)
                .AvatarVersion(AvatarVersion)
                .FullName(FullName)
                .IsAdmin(IsAdmin)
                .IsOwner(IsOwner)
                .IsBillingAdmin(IsBillingAdmin)
                .Role(Role)
                .BotType(BotType)
                .UserId(UserId)
                .BotOwnerId(BotOwnerId)
                .IsActive(IsActive)
                .IsGuest(IsGuest)
                .Timezone(Timezone)
                .DateJoined(DateJoined)
                .DeliveryEmail(DeliveryEmail)
                .ProfileData(ProfileData);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(UserAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (UserAllOf.
        /// </summary>
        /// <param name="left">Compared (UserAllOf</param>
        /// <param name="right">Compared (UserAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (UserAllOf left, UserAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (UserAllOf.
        /// </summary>
        /// <param name="left">Compared (UserAllOf</param>
        /// <param name="right">Compared (UserAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (UserAllOf left, UserAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of UserAllOf.
        /// </summary>
        public sealed class UserAllOfBuilder
        {
            private Object _Email;
            private Object _IsBot;
            private Object _AvatarUrl;
            private Object _AvatarVersion;
            private Object _FullName;
            private Object _IsAdmin;
            private Object _IsOwner;
            private Object _IsBillingAdmin;
            private Object _Role;
            private Object _BotType;
            private Object _UserId;
            private Object _BotOwnerId;
            private Object _IsActive;
            private Object _IsGuest;
            private Object _Timezone;
            private Object _DateJoined;
            private Object _DeliveryEmail;
            private Object _ProfileData;

            internal UserAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for UserAllOf.Email property.
            /// </summary>
            /// <param name="value">Email</param>
            public UserAllOfBuilder Email(Object value)
            {
                _Email = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.IsBot property.
            /// </summary>
            /// <param name="value">IsBot</param>
            public UserAllOfBuilder IsBot(Object value)
            {
                _IsBot = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.AvatarUrl property.
            /// </summary>
            /// <param name="value">AvatarUrl</param>
            public UserAllOfBuilder AvatarUrl(Object value)
            {
                _AvatarUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.AvatarVersion property.
            /// </summary>
            /// <param name="value">AvatarVersion</param>
            public UserAllOfBuilder AvatarVersion(Object value)
            {
                _AvatarVersion = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.FullName property.
            /// </summary>
            /// <param name="value">FullName</param>
            public UserAllOfBuilder FullName(Object value)
            {
                _FullName = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.IsAdmin property.
            /// </summary>
            /// <param name="value">IsAdmin</param>
            public UserAllOfBuilder IsAdmin(Object value)
            {
                _IsAdmin = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.IsOwner property.
            /// </summary>
            /// <param name="value">IsOwner</param>
            public UserAllOfBuilder IsOwner(Object value)
            {
                _IsOwner = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.IsBillingAdmin property.
            /// </summary>
            /// <param name="value">IsBillingAdmin</param>
            public UserAllOfBuilder IsBillingAdmin(Object value)
            {
                _IsBillingAdmin = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.Role property.
            /// </summary>
            /// <param name="value">Role</param>
            public UserAllOfBuilder Role(Object value)
            {
                _Role = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.BotType property.
            /// </summary>
            /// <param name="value">BotType</param>
            public UserAllOfBuilder BotType(Object value)
            {
                _BotType = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.UserId property.
            /// </summary>
            /// <param name="value">UserId</param>
            public UserAllOfBuilder UserId(Object value)
            {
                _UserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.BotOwnerId property.
            /// </summary>
            /// <param name="value">BotOwnerId</param>
            public UserAllOfBuilder BotOwnerId(Object value)
            {
                _BotOwnerId = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.IsActive property.
            /// </summary>
            /// <param name="value">IsActive</param>
            public UserAllOfBuilder IsActive(Object value)
            {
                _IsActive = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.IsGuest property.
            /// </summary>
            /// <param name="value">IsGuest</param>
            public UserAllOfBuilder IsGuest(Object value)
            {
                _IsGuest = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.Timezone property.
            /// </summary>
            /// <param name="value">Timezone</param>
            public UserAllOfBuilder Timezone(Object value)
            {
                _Timezone = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.DateJoined property.
            /// </summary>
            /// <param name="value">DateJoined</param>
            public UserAllOfBuilder DateJoined(Object value)
            {
                _DateJoined = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.DeliveryEmail property.
            /// </summary>
            /// <param name="value">DeliveryEmail</param>
            public UserAllOfBuilder DeliveryEmail(Object value)
            {
                _DeliveryEmail = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserAllOf.ProfileData property.
            /// </summary>
            /// <param name="value">ProfileData</param>
            public UserAllOfBuilder ProfileData(Object value)
            {
                _ProfileData = value;
                return this;
            }


            /// <summary>
            /// Builds instance of UserAllOf.
            /// </summary>
            /// <returns>UserAllOf</returns>
            public UserAllOf Build()
            {
                Validate();
                return new UserAllOf(
                    Email: _Email,
                    IsBot: _IsBot,
                    AvatarUrl: _AvatarUrl,
                    AvatarVersion: _AvatarVersion,
                    FullName: _FullName,
                    IsAdmin: _IsAdmin,
                    IsOwner: _IsOwner,
                    IsBillingAdmin: _IsBillingAdmin,
                    Role: _Role,
                    BotType: _BotType,
                    UserId: _UserId,
                    BotOwnerId: _BotOwnerId,
                    IsActive: _IsActive,
                    IsGuest: _IsGuest,
                    Timezone: _Timezone,
                    DateJoined: _DateJoined,
                    DeliveryEmail: _DeliveryEmail,
                    ProfileData: _ProfileData
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
