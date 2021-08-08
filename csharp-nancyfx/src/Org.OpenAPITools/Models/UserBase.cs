using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// A dictionary containing basic data on a given Zulip user. 
    /// </summary>
    public sealed class UserBase:  IEquatable<UserBase>
    { 
        /// <summary>
        /// The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
        /// </summary>
        public string Email { get; private set; }

        /// <summary>
        /// A boolean specifying whether the user is a bot or full account. 
        /// </summary>
        public bool? IsBot { get; private set; }

        /// <summary>
        /// URL for the user&#39;s avatar.  Will be &#x60;null&#x60; if the &#x60;client_gravatar&#x60; query parameter was set to &#x60;True&#x60; and the user&#39;s avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the &#x60;user_avatar_url_field_optional&#x60; capability, this will be missing at the server&#39;s sole discretion. 
        /// </summary>
        public string AvatarUrl { get; private set; }

        /// <summary>
        /// Version for the user&#39;s avatar.  Used for cache-busting requests for the user&#39;s avatar.  Clients generally shouldn&#39;t need to use this; most avatar URLs sent by Zulip will already end with &#x60;?v&#x3D;{avatar_version}&#x60;. 
        /// </summary>
        public int? AvatarVersion { get; private set; }

        /// <summary>
        /// Full name of the user or bot, used for all display purposes. 
        /// </summary>
        public string FullName { get; private set; }

        /// <summary>
        /// A boolean specifying whether the user is an organization administrator. 
        /// </summary>
        public bool? IsAdmin { get; private set; }

        /// <summary>
        /// A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
        /// </summary>
        public bool? IsOwner { get; private set; }

        /// <summary>
        /// A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
        /// </summary>
        public bool? IsBillingAdmin { get; private set; }

        /// <summary>
        /// [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner &#x3D;&gt; 100 * Organization administrator &#x3D;&gt; 200 * Organization moderator &#x3D;&gt; 300 * Member &#x3D;&gt; 400 * Guest &#x3D;&gt; 600  **Changes**: New in Zulip 4.0 (feature level 59). 
        /// </summary>
        public RoleEnum? Role { get; private set; }

        /// <summary>
        /// An integer describing the type of bot: * &#x60;null&#x60; if the user isn&#39;t a bot. * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot. 
        /// </summary>
        public int? BotType { get; private set; }

        /// <summary>
        /// The unique ID of the user. 
        /// </summary>
        public int? UserId { get; private set; }

        /// <summary>
        /// If the user is a bot (i.e. &#x60;is_bot&#x60; is &#x60;True&#x60;), &#x60;bot_owner&#x60; is the user ID of the bot&#39;s owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a &#x60;bot_owner&#x60; field containing the email address of the bot&#39;s owner. 
        /// </summary>
        public int? BotOwnerId { get; private set; }

        /// <summary>
        /// A boolean specifying whether the user account has been deactivated. 
        /// </summary>
        public bool? IsActive { get; private set; }

        /// <summary>
        /// A boolean specifying whether the user is a guest user. 
        /// </summary>
        public bool? IsGuest { get; private set; }

        /// <summary>
        /// The time zone of the user. 
        /// </summary>
        public string Timezone { get; private set; }

        /// <summary>
        /// The time the user account was created. 
        /// </summary>
        public string DateJoined { get; private set; }

        /// <summary>
        /// The user&#39;s real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
        /// </summary>
        public string DeliveryEmail { get; private set; }

        /// <summary>
        /// A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user&#39;s data for that field.  Generally the data includes just a single &#x60;value&#x60; key; for those custom profile fields supporting Markdown, a &#x60;rendered_value&#x60; key will also be present. 
        /// </summary>
        public Dictionary<string, Object> ProfileData { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use UserBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public UserBase()
        {
        }

        private UserBase(string Email, bool? IsBot, string AvatarUrl, int? AvatarVersion, string FullName, bool? IsAdmin, bool? IsOwner, bool? IsBillingAdmin, RoleEnum? Role, int? BotType, int? UserId, int? BotOwnerId, bool? IsActive, bool? IsGuest, string Timezone, string DateJoined, string DeliveryEmail, Dictionary<string, Object> ProfileData)
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
        /// Returns builder of UserBase.
        /// </summary>
        /// <returns>UserBaseBuilder</returns>
        public static UserBaseBuilder Builder()
        {
            return new UserBaseBuilder();
        }

        /// <summary>
        /// Returns UserBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UserBaseBuilder</returns>
        public UserBaseBuilder With()
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

        public bool Equals(UserBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (UserBase.
        /// </summary>
        /// <param name="left">Compared (UserBase</param>
        /// <param name="right">Compared (UserBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (UserBase left, UserBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (UserBase.
        /// </summary>
        /// <param name="left">Compared (UserBase</param>
        /// <param name="right">Compared (UserBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (UserBase left, UserBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of UserBase.
        /// </summary>
        public sealed class UserBaseBuilder
        {
            private string _Email;
            private bool? _IsBot;
            private string _AvatarUrl;
            private int? _AvatarVersion;
            private string _FullName;
            private bool? _IsAdmin;
            private bool? _IsOwner;
            private bool? _IsBillingAdmin;
            private RoleEnum? _Role;
            private int? _BotType;
            private int? _UserId;
            private int? _BotOwnerId;
            private bool? _IsActive;
            private bool? _IsGuest;
            private string _Timezone;
            private string _DateJoined;
            private string _DeliveryEmail;
            private Dictionary<string, Object> _ProfileData;

            internal UserBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for UserBase.Email property.
            /// </summary>
            /// <param name="value">The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. </param>
            public UserBaseBuilder Email(string value)
            {
                _Email = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.IsBot property.
            /// </summary>
            /// <param name="value">A boolean specifying whether the user is a bot or full account. </param>
            public UserBaseBuilder IsBot(bool? value)
            {
                _IsBot = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.AvatarUrl property.
            /// </summary>
            /// <param name="value">URL for the user&#39;s avatar.  Will be &#x60;null&#x60; if the &#x60;client_gravatar&#x60; query parameter was set to &#x60;True&#x60; and the user&#39;s avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the &#x60;user_avatar_url_field_optional&#x60; capability, this will be missing at the server&#39;s sole discretion. </param>
            public UserBaseBuilder AvatarUrl(string value)
            {
                _AvatarUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.AvatarVersion property.
            /// </summary>
            /// <param name="value">Version for the user&#39;s avatar.  Used for cache-busting requests for the user&#39;s avatar.  Clients generally shouldn&#39;t need to use this; most avatar URLs sent by Zulip will already end with &#x60;?v&#x3D;{avatar_version}&#x60;. </param>
            public UserBaseBuilder AvatarVersion(int? value)
            {
                _AvatarVersion = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.FullName property.
            /// </summary>
            /// <param name="value">Full name of the user or bot, used for all display purposes. </param>
            public UserBaseBuilder FullName(string value)
            {
                _FullName = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.IsAdmin property.
            /// </summary>
            /// <param name="value">A boolean specifying whether the user is an organization administrator. </param>
            public UserBaseBuilder IsAdmin(bool? value)
            {
                _IsAdmin = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.IsOwner property.
            /// </summary>
            /// <param name="value">A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). </param>
            public UserBaseBuilder IsOwner(bool? value)
            {
                _IsOwner = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.IsBillingAdmin property.
            /// </summary>
            /// <param name="value">A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). </param>
            public UserBaseBuilder IsBillingAdmin(bool? value)
            {
                _IsBillingAdmin = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.Role property.
            /// </summary>
            /// <param name="value">[Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner &#x3D;&gt; 100 * Organization administrator &#x3D;&gt; 200 * Organization moderator &#x3D;&gt; 300 * Member &#x3D;&gt; 400 * Guest &#x3D;&gt; 600  **Changes**: New in Zulip 4.0 (feature level 59). </param>
            public UserBaseBuilder Role(RoleEnum? value)
            {
                _Role = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.BotType property.
            /// </summary>
            /// <param name="value">An integer describing the type of bot: * &#x60;null&#x60; if the user isn&#39;t a bot. * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot. </param>
            public UserBaseBuilder BotType(int? value)
            {
                _BotType = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.UserId property.
            /// </summary>
            /// <param name="value">The unique ID of the user. </param>
            public UserBaseBuilder UserId(int? value)
            {
                _UserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.BotOwnerId property.
            /// </summary>
            /// <param name="value">If the user is a bot (i.e. &#x60;is_bot&#x60; is &#x60;True&#x60;), &#x60;bot_owner&#x60; is the user ID of the bot&#39;s owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a &#x60;bot_owner&#x60; field containing the email address of the bot&#39;s owner. </param>
            public UserBaseBuilder BotOwnerId(int? value)
            {
                _BotOwnerId = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.IsActive property.
            /// </summary>
            /// <param name="value">A boolean specifying whether the user account has been deactivated. </param>
            public UserBaseBuilder IsActive(bool? value)
            {
                _IsActive = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.IsGuest property.
            /// </summary>
            /// <param name="value">A boolean specifying whether the user is a guest user. </param>
            public UserBaseBuilder IsGuest(bool? value)
            {
                _IsGuest = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.Timezone property.
            /// </summary>
            /// <param name="value">The time zone of the user. </param>
            public UserBaseBuilder Timezone(string value)
            {
                _Timezone = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.DateJoined property.
            /// </summary>
            /// <param name="value">The time the user account was created. </param>
            public UserBaseBuilder DateJoined(string value)
            {
                _DateJoined = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.DeliveryEmail property.
            /// </summary>
            /// <param name="value">The user&#39;s real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. </param>
            public UserBaseBuilder DeliveryEmail(string value)
            {
                _DeliveryEmail = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.ProfileData property.
            /// </summary>
            /// <param name="value">A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user&#39;s data for that field.  Generally the data includes just a single &#x60;value&#x60; key; for those custom profile fields supporting Markdown, a &#x60;rendered_value&#x60; key will also be present. </param>
            public UserBaseBuilder ProfileData(Dictionary<string, Object> value)
            {
                _ProfileData = value;
                return this;
            }


            /// <summary>
            /// Builds instance of UserBase.
            /// </summary>
            /// <returns>UserBase</returns>
            public UserBase Build()
            {
                Validate();
                return new UserBase(
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

        
        public enum RoleEnum { _100, _200, _300, _400, _600 };
    }
}
