using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the &#x60;id&#x60; field.  **Note**: In the [events API](/api/get-events), this &#x60;user&#x60; dictionary confusing had the user ID in a field called &#x60;user_id&#x60; instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the &#x60;user_id&#x60; field. 
    /// </summary>
    public sealed class EmojiReactionBaseAllOfUser:  IEquatable<EmojiReactionBaseAllOfUser>
    { 
        /// <summary>
        /// ID of the user. 
        /// </summary>
        public int? Id { get; private set; }

        /// <summary>
        /// Email of the user. 
        /// </summary>
        public string Email { get; private set; }

        /// <summary>
        /// Full name of the user. 
        /// </summary>
        public string FullName { get; private set; }

        /// <summary>
        /// Whether the user is a mirror dummy. 
        /// </summary>
        public bool? IsMirrorDummy { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use EmojiReactionBaseAllOfUser.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EmojiReactionBaseAllOfUser()
        {
        }

        private EmojiReactionBaseAllOfUser(int? Id, string Email, string FullName, bool? IsMirrorDummy)
        {
            
            this.Id = Id;
            
            this.Email = Email;
            
            this.FullName = FullName;
            
            this.IsMirrorDummy = IsMirrorDummy;
            
        }

        /// <summary>
        /// Returns builder of EmojiReactionBaseAllOfUser.
        /// </summary>
        /// <returns>EmojiReactionBaseAllOfUserBuilder</returns>
        public static EmojiReactionBaseAllOfUserBuilder Builder()
        {
            return new EmojiReactionBaseAllOfUserBuilder();
        }

        /// <summary>
        /// Returns EmojiReactionBaseAllOfUserBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EmojiReactionBaseAllOfUserBuilder</returns>
        public EmojiReactionBaseAllOfUserBuilder With()
        {
            return Builder()
                .Id(Id)
                .Email(Email)
                .FullName(FullName)
                .IsMirrorDummy(IsMirrorDummy);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(EmojiReactionBaseAllOfUser other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EmojiReactionBaseAllOfUser.
        /// </summary>
        /// <param name="left">Compared (EmojiReactionBaseAllOfUser</param>
        /// <param name="right">Compared (EmojiReactionBaseAllOfUser</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EmojiReactionBaseAllOfUser left, EmojiReactionBaseAllOfUser right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EmojiReactionBaseAllOfUser.
        /// </summary>
        /// <param name="left">Compared (EmojiReactionBaseAllOfUser</param>
        /// <param name="right">Compared (EmojiReactionBaseAllOfUser</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EmojiReactionBaseAllOfUser left, EmojiReactionBaseAllOfUser right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EmojiReactionBaseAllOfUser.
        /// </summary>
        public sealed class EmojiReactionBaseAllOfUserBuilder
        {
            private int? _Id;
            private string _Email;
            private string _FullName;
            private bool? _IsMirrorDummy;

            internal EmojiReactionBaseAllOfUserBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EmojiReactionBaseAllOfUser.Id property.
            /// </summary>
            /// <param name="value">ID of the user. </param>
            public EmojiReactionBaseAllOfUserBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReactionBaseAllOfUser.Email property.
            /// </summary>
            /// <param name="value">Email of the user. </param>
            public EmojiReactionBaseAllOfUserBuilder Email(string value)
            {
                _Email = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReactionBaseAllOfUser.FullName property.
            /// </summary>
            /// <param name="value">Full name of the user. </param>
            public EmojiReactionBaseAllOfUserBuilder FullName(string value)
            {
                _FullName = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReactionBaseAllOfUser.IsMirrorDummy property.
            /// </summary>
            /// <param name="value">Whether the user is a mirror dummy. </param>
            public EmojiReactionBaseAllOfUserBuilder IsMirrorDummy(bool? value)
            {
                _IsMirrorDummy = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EmojiReactionBaseAllOfUser.
            /// </summary>
            /// <returns>EmojiReactionBaseAllOfUser</returns>
            public EmojiReactionBaseAllOfUser Build()
            {
                Validate();
                return new EmojiReactionBaseAllOfUser(
                    Id: _Id,
                    Email: _Email,
                    FullName: _FullName,
                    IsMirrorDummy: _IsMirrorDummy
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
