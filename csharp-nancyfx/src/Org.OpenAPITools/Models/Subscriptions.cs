using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Subscriptions
    /// </summary>
    public sealed class Subscriptions:  IEquatable<Subscriptions>
    { 
        /// <summary>
        /// The unique ID of a stream. 
        /// </summary>
        public int? StreamId { get; private set; }

        /// <summary>
        /// The name of a stream. 
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. 
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
        /// </summary>
        public string RenderedDescription { get; private set; }

        /// <summary>
        /// The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
        /// </summary>
        public int? DateCreated { get; private set; }

        /// <summary>
        /// Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
        /// </summary>
        public bool? InviteOnly { get; private set; }

        /// <summary>
        /// A list of user IDs of users who are also subscribed to a given stream. Included only if &#x60;include_subscribers&#x60; is &#x60;true&#x60;. 
        /// </summary>
        public List<int?> Subscribers { get; private set; }

        /// <summary>
        /// A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
        /// </summary>
        public bool? DesktopNotifications { get; private set; }

        /// <summary>
        /// A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
        /// </summary>
        public bool? EmailNotifications { get; private set; }

        /// <summary>
        /// A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
        /// </summary>
        public bool? WildcardMentionsNotify { get; private set; }

        /// <summary>
        /// A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
        /// </summary>
        public bool? PushNotifications { get; private set; }

        /// <summary>
        /// A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
        /// </summary>
        public bool? AudibleNotifications { get; private set; }

        /// <summary>
        /// A boolean specifying whether the given stream has been pinned to the top. 
        /// </summary>
        public bool? PinToTop { get; private set; }

        /// <summary>
        /// Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
        /// </summary>
        public string EmailAddress { get; private set; }

        /// <summary>
        /// Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in &#x60;All messages&#x60; view (previously known as &#x60;Home&#x60; view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named &#x60;in_home_view&#x60; (with the opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;). 
        /// </summary>
        public bool? IsMuted { get; private set; }

        /// <summary>
        /// Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
        /// </summary>
        public bool? InHomeView { get; private set; }

        /// <summary>
        /// Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. 
        /// </summary>
        public bool? IsAnnouncementOnly { get; private set; }

        /// <summary>
        /// Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
        /// </summary>
        public bool? IsWebPublic { get; private set; }

        /// <summary>
        /// The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
        /// </summary>
        public RoleEnum? Role { get; private set; }

        /// <summary>
        /// The user&#39;s personal color for the stream. 
        /// </summary>
        public string Color { get; private set; }

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
        /// The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
        /// </summary>
        public int? StreamWeeklyTraffic { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Subscriptions.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Subscriptions()
        {
        }

        private Subscriptions(int? StreamId, string Name, string Description, string RenderedDescription, int? DateCreated, bool? InviteOnly, List<int?> Subscribers, bool? DesktopNotifications, bool? EmailNotifications, bool? WildcardMentionsNotify, bool? PushNotifications, bool? AudibleNotifications, bool? PinToTop, string EmailAddress, bool? IsMuted, bool? InHomeView, bool? IsAnnouncementOnly, bool? IsWebPublic, RoleEnum? Role, string Color, int? StreamPostPolicy, int? MessageRetentionDays, bool? HistoryPublicToSubscribers, int? FirstMessageId, int? StreamWeeklyTraffic)
        {
            
            this.StreamId = StreamId;
            
            this.Name = Name;
            
            this.Description = Description;
            
            this.RenderedDescription = RenderedDescription;
            
            this.DateCreated = DateCreated;
            
            this.InviteOnly = InviteOnly;
            
            this.Subscribers = Subscribers;
            
            this.DesktopNotifications = DesktopNotifications;
            
            this.EmailNotifications = EmailNotifications;
            
            this.WildcardMentionsNotify = WildcardMentionsNotify;
            
            this.PushNotifications = PushNotifications;
            
            this.AudibleNotifications = AudibleNotifications;
            
            this.PinToTop = PinToTop;
            
            this.EmailAddress = EmailAddress;
            
            this.IsMuted = IsMuted;
            
            this.InHomeView = InHomeView;
            
            this.IsAnnouncementOnly = IsAnnouncementOnly;
            
            this.IsWebPublic = IsWebPublic;
            
            this.Role = Role;
            
            this.Color = Color;
            
            this.StreamPostPolicy = StreamPostPolicy;
            
            this.MessageRetentionDays = MessageRetentionDays;
            
            this.HistoryPublicToSubscribers = HistoryPublicToSubscribers;
            
            this.FirstMessageId = FirstMessageId;
            
            this.StreamWeeklyTraffic = StreamWeeklyTraffic;
            
        }

        /// <summary>
        /// Returns builder of Subscriptions.
        /// </summary>
        /// <returns>SubscriptionsBuilder</returns>
        public static SubscriptionsBuilder Builder()
        {
            return new SubscriptionsBuilder();
        }

        /// <summary>
        /// Returns SubscriptionsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SubscriptionsBuilder</returns>
        public SubscriptionsBuilder With()
        {
            return Builder()
                .StreamId(StreamId)
                .Name(Name)
                .Description(Description)
                .RenderedDescription(RenderedDescription)
                .DateCreated(DateCreated)
                .InviteOnly(InviteOnly)
                .Subscribers(Subscribers)
                .DesktopNotifications(DesktopNotifications)
                .EmailNotifications(EmailNotifications)
                .WildcardMentionsNotify(WildcardMentionsNotify)
                .PushNotifications(PushNotifications)
                .AudibleNotifications(AudibleNotifications)
                .PinToTop(PinToTop)
                .EmailAddress(EmailAddress)
                .IsMuted(IsMuted)
                .InHomeView(InHomeView)
                .IsAnnouncementOnly(IsAnnouncementOnly)
                .IsWebPublic(IsWebPublic)
                .Role(Role)
                .Color(Color)
                .StreamPostPolicy(StreamPostPolicy)
                .MessageRetentionDays(MessageRetentionDays)
                .HistoryPublicToSubscribers(HistoryPublicToSubscribers)
                .FirstMessageId(FirstMessageId)
                .StreamWeeklyTraffic(StreamWeeklyTraffic);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Subscriptions other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Subscriptions.
        /// </summary>
        /// <param name="left">Compared (Subscriptions</param>
        /// <param name="right">Compared (Subscriptions</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Subscriptions left, Subscriptions right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Subscriptions.
        /// </summary>
        /// <param name="left">Compared (Subscriptions</param>
        /// <param name="right">Compared (Subscriptions</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Subscriptions left, Subscriptions right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Subscriptions.
        /// </summary>
        public sealed class SubscriptionsBuilder
        {
            private int? _StreamId;
            private string _Name;
            private string _Description;
            private string _RenderedDescription;
            private int? _DateCreated;
            private bool? _InviteOnly;
            private List<int?> _Subscribers;
            private bool? _DesktopNotifications;
            private bool? _EmailNotifications;
            private bool? _WildcardMentionsNotify;
            private bool? _PushNotifications;
            private bool? _AudibleNotifications;
            private bool? _PinToTop;
            private string _EmailAddress;
            private bool? _IsMuted;
            private bool? _InHomeView;
            private bool? _IsAnnouncementOnly;
            private bool? _IsWebPublic;
            private RoleEnum? _Role;
            private string _Color;
            private int? _StreamPostPolicy;
            private int? _MessageRetentionDays;
            private bool? _HistoryPublicToSubscribers;
            private int? _FirstMessageId;
            private int? _StreamWeeklyTraffic;

            internal SubscriptionsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Subscriptions.StreamId property.
            /// </summary>
            /// <param name="value">The unique ID of a stream. </param>
            public SubscriptionsBuilder StreamId(int? value)
            {
                _StreamId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.Name property.
            /// </summary>
            /// <param name="value">The name of a stream. </param>
            public SubscriptionsBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.Description property.
            /// </summary>
            /// <param name="value">The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. </param>
            public SubscriptionsBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.RenderedDescription property.
            /// </summary>
            /// <param name="value">A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. </param>
            public SubscriptionsBuilder RenderedDescription(string value)
            {
                _RenderedDescription = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.DateCreated property.
            /// </summary>
            /// <param name="value">The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). </param>
            public SubscriptionsBuilder DateCreated(int? value)
            {
                _DateCreated = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.InviteOnly property.
            /// </summary>
            /// <param name="value">Specifies whether the stream is private or not. Only people who have been invited can access a private stream. </param>
            public SubscriptionsBuilder InviteOnly(bool? value)
            {
                _InviteOnly = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.Subscribers property.
            /// </summary>
            /// <param name="value">A list of user IDs of users who are also subscribed to a given stream. Included only if &#x60;include_subscribers&#x60; is &#x60;true&#x60;. </param>
            public SubscriptionsBuilder Subscribers(List<int?> value)
            {
                _Subscribers = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.DesktopNotifications property.
            /// </summary>
            /// <param name="value">A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. </param>
            public SubscriptionsBuilder DesktopNotifications(bool? value)
            {
                _DesktopNotifications = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.EmailNotifications property.
            /// </summary>
            /// <param name="value">A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. </param>
            public SubscriptionsBuilder EmailNotifications(bool? value)
            {
                _EmailNotifications = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.WildcardMentionsNotify property.
            /// </summary>
            /// <param name="value">A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. </param>
            public SubscriptionsBuilder WildcardMentionsNotify(bool? value)
            {
                _WildcardMentionsNotify = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.PushNotifications property.
            /// </summary>
            /// <param name="value">A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. </param>
            public SubscriptionsBuilder PushNotifications(bool? value)
            {
                _PushNotifications = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.AudibleNotifications property.
            /// </summary>
            /// <param name="value">A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. </param>
            public SubscriptionsBuilder AudibleNotifications(bool? value)
            {
                _AudibleNotifications = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.PinToTop property.
            /// </summary>
            /// <param name="value">A boolean specifying whether the given stream has been pinned to the top. </param>
            public SubscriptionsBuilder PinToTop(bool? value)
            {
                _PinToTop = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.EmailAddress property.
            /// </summary>
            /// <param name="value">Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). </param>
            public SubscriptionsBuilder EmailAddress(string value)
            {
                _EmailAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.IsMuted property.
            /// </summary>
            /// <param name="value">Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in &#x60;All messages&#x60; view (previously known as &#x60;Home&#x60; view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named &#x60;in_home_view&#x60; (with the opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;). </param>
            public SubscriptionsBuilder IsMuted(bool? value)
            {
                _IsMuted = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.InHomeView property.
            /// </summary>
            /// <param name="value">Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. </param>
            public SubscriptionsBuilder InHomeView(bool? value)
            {
                _InHomeView = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.IsAnnouncementOnly property.
            /// </summary>
            /// <param name="value">Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. </param>
            public SubscriptionsBuilder IsAnnouncementOnly(bool? value)
            {
                _IsAnnouncementOnly = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.IsWebPublic property.
            /// </summary>
            /// <param name="value">Whether the stream has been configured to allow unauthenticated access to its message history from the web. </param>
            public SubscriptionsBuilder IsWebPublic(bool? value)
            {
                _IsWebPublic = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.Role property.
            /// </summary>
            /// <param name="value">The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). </param>
            public SubscriptionsBuilder Role(RoleEnum? value)
            {
                _Role = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.Color property.
            /// </summary>
            /// <param name="value">The user&#39;s personal color for the stream. </param>
            public SubscriptionsBuilder Color(string value)
            {
                _Color = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.StreamPostPolicy property.
            /// </summary>
            /// <param name="value">Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. </param>
            public SubscriptionsBuilder StreamPostPolicy(int? value)
            {
                _StreamPostPolicy = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.MessageRetentionDays property.
            /// </summary>
            /// <param name="value">Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). </param>
            public SubscriptionsBuilder MessageRetentionDays(int? value)
            {
                _MessageRetentionDays = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.HistoryPublicToSubscribers property.
            /// </summary>
            /// <param name="value">Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. </param>
            public SubscriptionsBuilder HistoryPublicToSubscribers(bool? value)
            {
                _HistoryPublicToSubscribers = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.FirstMessageId property.
            /// </summary>
            /// <param name="value">The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. </param>
            public SubscriptionsBuilder FirstMessageId(int? value)
            {
                _FirstMessageId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Subscriptions.StreamWeeklyTraffic property.
            /// </summary>
            /// <param name="value">The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. </param>
            public SubscriptionsBuilder StreamWeeklyTraffic(int? value)
            {
                _StreamWeeklyTraffic = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Subscriptions.
            /// </summary>
            /// <returns>Subscriptions</returns>
            public Subscriptions Build()
            {
                Validate();
                return new Subscriptions(
                    StreamId: _StreamId,
                    Name: _Name,
                    Description: _Description,
                    RenderedDescription: _RenderedDescription,
                    DateCreated: _DateCreated,
                    InviteOnly: _InviteOnly,
                    Subscribers: _Subscribers,
                    DesktopNotifications: _DesktopNotifications,
                    EmailNotifications: _EmailNotifications,
                    WildcardMentionsNotify: _WildcardMentionsNotify,
                    PushNotifications: _PushNotifications,
                    AudibleNotifications: _AudibleNotifications,
                    PinToTop: _PinToTop,
                    EmailAddress: _EmailAddress,
                    IsMuted: _IsMuted,
                    InHomeView: _InHomeView,
                    IsAnnouncementOnly: _IsAnnouncementOnly,
                    IsWebPublic: _IsWebPublic,
                    Role: _Role,
                    Color: _Color,
                    StreamPostPolicy: _StreamPostPolicy,
                    MessageRetentionDays: _MessageRetentionDays,
                    HistoryPublicToSubscribers: _HistoryPublicToSubscribers,
                    FirstMessageId: _FirstMessageId,
                    StreamWeeklyTraffic: _StreamWeeklyTraffic
                );
            }

            private void Validate()
            { 
            }
        }

        
        public enum RoleEnum { _20, _50 };
    }
}
