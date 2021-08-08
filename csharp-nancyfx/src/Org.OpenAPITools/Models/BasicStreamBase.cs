using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Object containing basic details about the stream. 
    /// </summary>
    public sealed class BasicStreamBase:  IEquatable<BasicStreamBase>
    { 
        /// <summary>
        /// The unique ID of the stream. 
        /// </summary>
        public int? StreamId { get; private set; }

        /// <summary>
        /// The name of the stream. 
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. 
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
        /// </summary>
        public int? DateCreated { get; private set; }

        /// <summary>
        /// Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
        /// </summary>
        public bool? InviteOnly { get; private set; }

        /// <summary>
        /// The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
        /// </summary>
        public string RenderedDescription { get; private set; }

        /// <summary>
        /// Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
        /// </summary>
        public bool? IsWebPublic { get; private set; }

        /// <summary>
        /// Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
        /// </summary>
        public int? StreamPostPolicy { get; private set; }

        /// <summary>
        /// Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
        /// </summary>
        public int? MessageRetentionDays { get; private set; }

        /// <summary>
        /// Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. 
        /// </summary>
        public bool? HistoryPublicToSubscribers { get; private set; }

        /// <summary>
        /// The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
        /// </summary>
        public int? FirstMessageId { get; private set; }

        /// <summary>
        /// Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. 
        /// </summary>
        public bool? IsAnnouncementOnly { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use BasicStreamBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BasicStreamBase()
        {
        }

        private BasicStreamBase(int? StreamId, string Name, string Description, int? DateCreated, bool? InviteOnly, string RenderedDescription, bool? IsWebPublic, int? StreamPostPolicy, int? MessageRetentionDays, bool? HistoryPublicToSubscribers, int? FirstMessageId, bool? IsAnnouncementOnly)
        {
            
            this.StreamId = StreamId;
            
            this.Name = Name;
            
            this.Description = Description;
            
            this.DateCreated = DateCreated;
            
            this.InviteOnly = InviteOnly;
            
            this.RenderedDescription = RenderedDescription;
            
            this.IsWebPublic = IsWebPublic;
            
            this.StreamPostPolicy = StreamPostPolicy;
            
            this.MessageRetentionDays = MessageRetentionDays;
            
            this.HistoryPublicToSubscribers = HistoryPublicToSubscribers;
            
            this.FirstMessageId = FirstMessageId;
            
            this.IsAnnouncementOnly = IsAnnouncementOnly;
            
        }

        /// <summary>
        /// Returns builder of BasicStreamBase.
        /// </summary>
        /// <returns>BasicStreamBaseBuilder</returns>
        public static BasicStreamBaseBuilder Builder()
        {
            return new BasicStreamBaseBuilder();
        }

        /// <summary>
        /// Returns BasicStreamBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BasicStreamBaseBuilder</returns>
        public BasicStreamBaseBuilder With()
        {
            return Builder()
                .StreamId(StreamId)
                .Name(Name)
                .Description(Description)
                .DateCreated(DateCreated)
                .InviteOnly(InviteOnly)
                .RenderedDescription(RenderedDescription)
                .IsWebPublic(IsWebPublic)
                .StreamPostPolicy(StreamPostPolicy)
                .MessageRetentionDays(MessageRetentionDays)
                .HistoryPublicToSubscribers(HistoryPublicToSubscribers)
                .FirstMessageId(FirstMessageId)
                .IsAnnouncementOnly(IsAnnouncementOnly);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(BasicStreamBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BasicStreamBase.
        /// </summary>
        /// <param name="left">Compared (BasicStreamBase</param>
        /// <param name="right">Compared (BasicStreamBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BasicStreamBase left, BasicStreamBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BasicStreamBase.
        /// </summary>
        /// <param name="left">Compared (BasicStreamBase</param>
        /// <param name="right">Compared (BasicStreamBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BasicStreamBase left, BasicStreamBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BasicStreamBase.
        /// </summary>
        public sealed class BasicStreamBaseBuilder
        {
            private int? _StreamId;
            private string _Name;
            private string _Description;
            private int? _DateCreated;
            private bool? _InviteOnly;
            private string _RenderedDescription;
            private bool? _IsWebPublic;
            private int? _StreamPostPolicy;
            private int? _MessageRetentionDays;
            private bool? _HistoryPublicToSubscribers;
            private int? _FirstMessageId;
            private bool? _IsAnnouncementOnly;

            internal BasicStreamBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BasicStreamBase.StreamId property.
            /// </summary>
            /// <param name="value">The unique ID of the stream. </param>
            public BasicStreamBaseBuilder StreamId(int? value)
            {
                _StreamId = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamBase.Name property.
            /// </summary>
            /// <param name="value">The name of the stream. </param>
            public BasicStreamBaseBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamBase.Description property.
            /// </summary>
            /// <param name="value">The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. </param>
            public BasicStreamBaseBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamBase.DateCreated property.
            /// </summary>
            /// <param name="value">The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). </param>
            public BasicStreamBaseBuilder DateCreated(int? value)
            {
                _DateCreated = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamBase.InviteOnly property.
            /// </summary>
            /// <param name="value">Specifies whether the stream is private or not. Only people who have been invited can access a private stream. </param>
            public BasicStreamBaseBuilder InviteOnly(bool? value)
            {
                _InviteOnly = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamBase.RenderedDescription property.
            /// </summary>
            /// <param name="value">The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. </param>
            public BasicStreamBaseBuilder RenderedDescription(string value)
            {
                _RenderedDescription = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamBase.IsWebPublic property.
            /// </summary>
            /// <param name="value">Whether the stream has been configured to allow unauthenticated access to its message history from the web. </param>
            public BasicStreamBaseBuilder IsWebPublic(bool? value)
            {
                _IsWebPublic = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamBase.StreamPostPolicy property.
            /// </summary>
            /// <param name="value">Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. </param>
            public BasicStreamBaseBuilder StreamPostPolicy(int? value)
            {
                _StreamPostPolicy = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamBase.MessageRetentionDays property.
            /// </summary>
            /// <param name="value">Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). </param>
            public BasicStreamBaseBuilder MessageRetentionDays(int? value)
            {
                _MessageRetentionDays = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamBase.HistoryPublicToSubscribers property.
            /// </summary>
            /// <param name="value">Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. </param>
            public BasicStreamBaseBuilder HistoryPublicToSubscribers(bool? value)
            {
                _HistoryPublicToSubscribers = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamBase.FirstMessageId property.
            /// </summary>
            /// <param name="value">The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. </param>
            public BasicStreamBaseBuilder FirstMessageId(int? value)
            {
                _FirstMessageId = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamBase.IsAnnouncementOnly property.
            /// </summary>
            /// <param name="value">Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. </param>
            public BasicStreamBaseBuilder IsAnnouncementOnly(bool? value)
            {
                _IsAnnouncementOnly = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BasicStreamBase.
            /// </summary>
            /// <returns>BasicStreamBase</returns>
            public BasicStreamBase Build()
            {
                Validate();
                return new BasicStreamBase(
                    StreamId: _StreamId,
                    Name: _Name,
                    Description: _Description,
                    DateCreated: _DateCreated,
                    InviteOnly: _InviteOnly,
                    RenderedDescription: _RenderedDescription,
                    IsWebPublic: _IsWebPublic,
                    StreamPostPolicy: _StreamPostPolicy,
                    MessageRetentionDays: _MessageRetentionDays,
                    HistoryPublicToSubscribers: _HistoryPublicToSubscribers,
                    FirstMessageId: _FirstMessageId,
                    IsAnnouncementOnly: _IsAnnouncementOnly
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
