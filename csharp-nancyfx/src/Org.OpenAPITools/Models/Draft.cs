using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// A dictionary for representing a message draft. 
    /// </summary>
    public sealed class Draft:  IEquatable<Draft>
    { 
        /// <summary>
        /// The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
        /// </summary>
        public int? Id { get; private set; }

        /// <summary>
        /// The type of the draft. Either unaddressed (empty string), \&quot;stream\&quot;, or \&quot;private\&quot; (for PMs and private group messages). 
        /// </summary>
        public TypeEnum? Type { get; private set; }

        /// <summary>
        /// An array of the tentative target audience IDs. For \&quot;stream\&quot; messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
        /// </summary>
        public List<int?> To { get; private set; }

        /// <summary>
        /// For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
        /// </summary>
        public string Topic { get; private set; }

        /// <summary>
        /// The body of the draft. Should not contain null bytes. 
        /// </summary>
        public string Content { get; private set; }

        /// <summary>
        /// A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
        /// </summary>
        public decimal? Timestamp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Draft.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Draft()
        {
        }

        private Draft(int? Id, TypeEnum? Type, List<int?> To, string Topic, string Content, decimal? Timestamp)
        {
            
            this.Id = Id;
            
            this.Type = Type;
            
            this.To = To;
            
            this.Topic = Topic;
            
            this.Content = Content;
            
            this.Timestamp = Timestamp;
            
        }

        /// <summary>
        /// Returns builder of Draft.
        /// </summary>
        /// <returns>DraftBuilder</returns>
        public static DraftBuilder Builder()
        {
            return new DraftBuilder();
        }

        /// <summary>
        /// Returns DraftBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DraftBuilder</returns>
        public DraftBuilder With()
        {
            return Builder()
                .Id(Id)
                .Type(Type)
                .To(To)
                .Topic(Topic)
                .Content(Content)
                .Timestamp(Timestamp);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Draft other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Draft.
        /// </summary>
        /// <param name="left">Compared (Draft</param>
        /// <param name="right">Compared (Draft</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Draft left, Draft right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Draft.
        /// </summary>
        /// <param name="left">Compared (Draft</param>
        /// <param name="right">Compared (Draft</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Draft left, Draft right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Draft.
        /// </summary>
        public sealed class DraftBuilder
        {
            private int? _Id;
            private TypeEnum? _Type;
            private List<int?> _To;
            private string _Topic;
            private string _Content;
            private decimal? _Timestamp;

            internal DraftBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Draft.Id property.
            /// </summary>
            /// <param name="value">The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. </param>
            public DraftBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Draft.Type property.
            /// </summary>
            /// <param name="value">The type of the draft. Either unaddressed (empty string), \&quot;stream\&quot;, or \&quot;private\&quot; (for PMs and private group messages). </param>
            public DraftBuilder Type(TypeEnum? value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for Draft.To property.
            /// </summary>
            /// <param name="value">An array of the tentative target audience IDs. For \&quot;stream\&quot; messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. </param>
            public DraftBuilder To(List<int?> value)
            {
                _To = value;
                return this;
            }

            /// <summary>
            /// Sets value for Draft.Topic property.
            /// </summary>
            /// <param name="value">For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. </param>
            public DraftBuilder Topic(string value)
            {
                _Topic = value;
                return this;
            }

            /// <summary>
            /// Sets value for Draft.Content property.
            /// </summary>
            /// <param name="value">The body of the draft. Should not contain null bytes. </param>
            public DraftBuilder Content(string value)
            {
                _Content = value;
                return this;
            }

            /// <summary>
            /// Sets value for Draft.Timestamp property.
            /// </summary>
            /// <param name="value">A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. </param>
            public DraftBuilder Timestamp(decimal? value)
            {
                _Timestamp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Draft.
            /// </summary>
            /// <returns>Draft</returns>
            public Draft Build()
            {
                Validate();
                return new Draft(
                    Id: _Id,
                    Type: _Type,
                    To: _To,
                    Topic: _Topic,
                    Content: _Content,
                    Timestamp: _Timestamp
                );
            }

            private void Validate()
            { 
                if (_Type == null)
                {
                    throw new ArgumentException("Type is a required property for Draft and cannot be null");
                } 
                if (_To == null)
                {
                    throw new ArgumentException("To is a required property for Draft and cannot be null");
                } 
                if (_Topic == null)
                {
                    throw new ArgumentException("Topic is a required property for Draft and cannot be null");
                } 
                if (_Content == null)
                {
                    throw new ArgumentException("Content is a required property for Draft and cannot be null");
                } 
            }
        }

        
        public enum TypeEnum { Empty, Stream, Private };
    }
}
