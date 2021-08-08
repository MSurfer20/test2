using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
    /// </summary>
    public sealed class RealmEmoji:  IEquatable<RealmEmoji>
    { 
        /// <summary>
        /// The ID for this emoji, same as the object&#39;s key. 
        /// </summary>
        public string Id { get; private set; }

        /// <summary>
        /// The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;). 
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The path relative to the organization&#39;s URL where the emoji&#39;s image can be found. 
        /// </summary>
        public string SourceUrl { get; private set; }

        /// <summary>
        /// Whether the emoji has been deactivated or not. 
        /// </summary>
        public bool? Deactivated { get; private set; }

        /// <summary>
        /// The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field. 
        /// </summary>
        public int? AuthorId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use RealmEmoji.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public RealmEmoji()
        {
        }

        private RealmEmoji(string Id, string Name, string SourceUrl, bool? Deactivated, int? AuthorId)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.SourceUrl = SourceUrl;
            
            this.Deactivated = Deactivated;
            
            this.AuthorId = AuthorId;
            
        }

        /// <summary>
        /// Returns builder of RealmEmoji.
        /// </summary>
        /// <returns>RealmEmojiBuilder</returns>
        public static RealmEmojiBuilder Builder()
        {
            return new RealmEmojiBuilder();
        }

        /// <summary>
        /// Returns RealmEmojiBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RealmEmojiBuilder</returns>
        public RealmEmojiBuilder With()
        {
            return Builder()
                .Id(Id)
                .Name(Name)
                .SourceUrl(SourceUrl)
                .Deactivated(Deactivated)
                .AuthorId(AuthorId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(RealmEmoji other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (RealmEmoji.
        /// </summary>
        /// <param name="left">Compared (RealmEmoji</param>
        /// <param name="right">Compared (RealmEmoji</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (RealmEmoji left, RealmEmoji right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (RealmEmoji.
        /// </summary>
        /// <param name="left">Compared (RealmEmoji</param>
        /// <param name="right">Compared (RealmEmoji</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (RealmEmoji left, RealmEmoji right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of RealmEmoji.
        /// </summary>
        public sealed class RealmEmojiBuilder
        {
            private string _Id;
            private string _Name;
            private string _SourceUrl;
            private bool? _Deactivated;
            private int? _AuthorId;

            internal RealmEmojiBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for RealmEmoji.Id property.
            /// </summary>
            /// <param name="value">The ID for this emoji, same as the object&#39;s key. </param>
            public RealmEmojiBuilder Id(string value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmEmoji.Name property.
            /// </summary>
            /// <param name="value">The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;). </param>
            public RealmEmojiBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmEmoji.SourceUrl property.
            /// </summary>
            /// <param name="value">The path relative to the organization&#39;s URL where the emoji&#39;s image can be found. </param>
            public RealmEmojiBuilder SourceUrl(string value)
            {
                _SourceUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmEmoji.Deactivated property.
            /// </summary>
            /// <param name="value">Whether the emoji has been deactivated or not. </param>
            public RealmEmojiBuilder Deactivated(bool? value)
            {
                _Deactivated = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmEmoji.AuthorId property.
            /// </summary>
            /// <param name="value">The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field. </param>
            public RealmEmojiBuilder AuthorId(int? value)
            {
                _AuthorId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of RealmEmoji.
            /// </summary>
            /// <returns>RealmEmoji</returns>
            public RealmEmoji Build()
            {
                Validate();
                return new RealmEmoji(
                    Id: _Id,
                    Name: _Name,
                    SourceUrl: _SourceUrl,
                    Deactivated: _Deactivated,
                    AuthorId: _AuthorId
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
