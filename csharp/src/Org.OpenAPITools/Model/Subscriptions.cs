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
    /// Subscriptions
    /// </summary>
    [DataContract]
    public partial class Subscriptions :  IEquatable<Subscriptions>, IValidatableObject
    {
        /// <summary>
        /// The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
        /// </summary>
        /// <value>The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). </value>
        public enum RoleEnum
        {
            /// <summary>
            /// Enum NUMBER_20 for value: 20
            /// </summary>
            NUMBER_20 = 20,

            /// <summary>
            /// Enum NUMBER_50 for value: 50
            /// </summary>
            NUMBER_50 = 50

        }

        /// <summary>
        /// The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
        /// </summary>
        /// <value>The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). </value>
        [DataMember(Name="role", EmitDefaultValue=false)]
        public RoleEnum? Role { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Subscriptions" /> class.
        /// </summary>
        /// <param name="streamId">The unique ID of a stream. .</param>
        /// <param name="name">The name of a stream. .</param>
        /// <param name="description">The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. .</param>
        /// <param name="renderedDescription">A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. .</param>
        /// <param name="dateCreated">The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). .</param>
        /// <param name="inviteOnly">Specifies whether the stream is private or not. Only people who have been invited can access a private stream. .</param>
        /// <param name="subscribers">A list of user IDs of users who are also subscribed to a given stream. Included only if &#x60;include_subscribers&#x60; is &#x60;true&#x60;. .</param>
        /// <param name="desktopNotifications">A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. .</param>
        /// <param name="emailNotifications">A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. .</param>
        /// <param name="wildcardMentionsNotify">A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. .</param>
        /// <param name="pushNotifications">A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. .</param>
        /// <param name="audibleNotifications">A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. .</param>
        /// <param name="pinToTop">A boolean specifying whether the given stream has been pinned to the top. .</param>
        /// <param name="emailAddress">Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). .</param>
        /// <param name="isMuted">Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in &#x60;All messages&#x60; view (previously known as &#x60;Home&#x60; view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named &#x60;in_home_view&#x60; (with the opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;). .</param>
        /// <param name="inHomeView">Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. .</param>
        /// <param name="isAnnouncementOnly">Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. .</param>
        /// <param name="isWebPublic">Whether the stream has been configured to allow unauthenticated access to its message history from the web. .</param>
        /// <param name="role">The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). .</param>
        /// <param name="color">The user&#39;s personal color for the stream. .</param>
        /// <param name="streamPostPolicy">Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. .</param>
        /// <param name="messageRetentionDays">Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). .</param>
        /// <param name="historyPublicToSubscribers">Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. .</param>
        /// <param name="firstMessageId">The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. .</param>
        /// <param name="streamWeeklyTraffic">The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. .</param>
        public Subscriptions(int streamId = default(int), string name = default(string), string description = default(string), string renderedDescription = default(string), int dateCreated = default(int), bool inviteOnly = default(bool), List<int> subscribers = default(List<int>), bool? desktopNotifications = default(bool?), bool? emailNotifications = default(bool?), bool? wildcardMentionsNotify = default(bool?), bool? pushNotifications = default(bool?), bool? audibleNotifications = default(bool?), bool pinToTop = default(bool), string emailAddress = default(string), bool isMuted = default(bool), bool inHomeView = default(bool), bool isAnnouncementOnly = default(bool), bool isWebPublic = default(bool), RoleEnum? role = default(RoleEnum?), string color = default(string), int streamPostPolicy = default(int), int? messageRetentionDays = default(int?), bool historyPublicToSubscribers = default(bool), int? firstMessageId = default(int?), int? streamWeeklyTraffic = default(int?))
        {
            this.DesktopNotifications = desktopNotifications;
            this.EmailNotifications = emailNotifications;
            this.WildcardMentionsNotify = wildcardMentionsNotify;
            this.PushNotifications = pushNotifications;
            this.AudibleNotifications = audibleNotifications;
            this.MessageRetentionDays = messageRetentionDays;
            this.FirstMessageId = firstMessageId;
            this.StreamWeeklyTraffic = streamWeeklyTraffic;
            this.StreamId = streamId;
            this.Name = name;
            this.Description = description;
            this.RenderedDescription = renderedDescription;
            this.DateCreated = dateCreated;
            this.InviteOnly = inviteOnly;
            this.Subscribers = subscribers;
            this.DesktopNotifications = desktopNotifications;
            this.EmailNotifications = emailNotifications;
            this.WildcardMentionsNotify = wildcardMentionsNotify;
            this.PushNotifications = pushNotifications;
            this.AudibleNotifications = audibleNotifications;
            this.PinToTop = pinToTop;
            this.EmailAddress = emailAddress;
            this.IsMuted = isMuted;
            this.InHomeView = inHomeView;
            this.IsAnnouncementOnly = isAnnouncementOnly;
            this.IsWebPublic = isWebPublic;
            this.Role = role;
            this.Color = color;
            this.StreamPostPolicy = streamPostPolicy;
            this.MessageRetentionDays = messageRetentionDays;
            this.HistoryPublicToSubscribers = historyPublicToSubscribers;
            this.FirstMessageId = firstMessageId;
            this.StreamWeeklyTraffic = streamWeeklyTraffic;
        }

        /// <summary>
        /// The unique ID of a stream. 
        /// </summary>
        /// <value>The unique ID of a stream. </value>
        [DataMember(Name="stream_id", EmitDefaultValue=false)]
        public int StreamId { get; set; }

        /// <summary>
        /// The name of a stream. 
        /// </summary>
        /// <value>The name of a stream. </value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. 
        /// </summary>
        /// <value>The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description. </value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
        /// </summary>
        /// <value>A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. </value>
        [DataMember(Name="rendered_description", EmitDefaultValue=false)]
        public string RenderedDescription { get; set; }

        /// <summary>
        /// The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
        /// </summary>
        /// <value>The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). </value>
        [DataMember(Name="date_created", EmitDefaultValue=false)]
        public int DateCreated { get; set; }

        /// <summary>
        /// Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
        /// </summary>
        /// <value>Specifies whether the stream is private or not. Only people who have been invited can access a private stream. </value>
        [DataMember(Name="invite_only", EmitDefaultValue=false)]
        public bool InviteOnly { get; set; }

        /// <summary>
        /// A list of user IDs of users who are also subscribed to a given stream. Included only if &#x60;include_subscribers&#x60; is &#x60;true&#x60;. 
        /// </summary>
        /// <value>A list of user IDs of users who are also subscribed to a given stream. Included only if &#x60;include_subscribers&#x60; is &#x60;true&#x60;. </value>
        [DataMember(Name="subscribers", EmitDefaultValue=false)]
        public List<int> Subscribers { get; set; }

        /// <summary>
        /// A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
        /// </summary>
        /// <value>A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. </value>
        [DataMember(Name="desktop_notifications", EmitDefaultValue=true)]
        public bool? DesktopNotifications { get; set; }

        /// <summary>
        /// A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
        /// </summary>
        /// <value>A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. </value>
        [DataMember(Name="email_notifications", EmitDefaultValue=true)]
        public bool? EmailNotifications { get; set; }

        /// <summary>
        /// A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
        /// </summary>
        /// <value>A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. </value>
        [DataMember(Name="wildcard_mentions_notify", EmitDefaultValue=true)]
        public bool? WildcardMentionsNotify { get; set; }

        /// <summary>
        /// A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
        /// </summary>
        /// <value>A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. </value>
        [DataMember(Name="push_notifications", EmitDefaultValue=true)]
        public bool? PushNotifications { get; set; }

        /// <summary>
        /// A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
        /// </summary>
        /// <value>A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. </value>
        [DataMember(Name="audible_notifications", EmitDefaultValue=true)]
        public bool? AudibleNotifications { get; set; }

        /// <summary>
        /// A boolean specifying whether the given stream has been pinned to the top. 
        /// </summary>
        /// <value>A boolean specifying whether the given stream has been pinned to the top. </value>
        [DataMember(Name="pin_to_top", EmitDefaultValue=false)]
        public bool PinToTop { get; set; }

        /// <summary>
        /// Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
        /// </summary>
        /// <value>Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). </value>
        [DataMember(Name="email_address", EmitDefaultValue=false)]
        public string EmailAddress { get; set; }

        /// <summary>
        /// Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in &#x60;All messages&#x60; view (previously known as &#x60;Home&#x60; view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named &#x60;in_home_view&#x60; (with the opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;). 
        /// </summary>
        /// <value>Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in &#x60;All messages&#x60; view (previously known as &#x60;Home&#x60; view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named &#x60;in_home_view&#x60; (with the opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;). </value>
        [DataMember(Name="is_muted", EmitDefaultValue=false)]
        public bool IsMuted { get; set; }

        /// <summary>
        /// Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
        /// </summary>
        /// <value>Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. </value>
        [DataMember(Name="in_home_view", EmitDefaultValue=false)]
        public bool InHomeView { get; set; }

        /// <summary>
        /// Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. 
        /// </summary>
        /// <value>Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead. </value>
        [DataMember(Name="is_announcement_only", EmitDefaultValue=false)]
        public bool IsAnnouncementOnly { get; set; }

        /// <summary>
        /// Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
        /// </summary>
        /// <value>Whether the stream has been configured to allow unauthenticated access to its message history from the web. </value>
        [DataMember(Name="is_web_public", EmitDefaultValue=false)]
        public bool IsWebPublic { get; set; }


        /// <summary>
        /// The user&#39;s personal color for the stream. 
        /// </summary>
        /// <value>The user&#39;s personal color for the stream. </value>
        [DataMember(Name="color", EmitDefaultValue=false)]
        public string Color { get; set; }

        /// <summary>
        /// Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. 
        /// </summary>
        /// <value>Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. </value>
        [DataMember(Name="stream_post_policy", EmitDefaultValue=false)]
        public int StreamPostPolicy { get; set; }

        /// <summary>
        /// Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
        /// </summary>
        /// <value>Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). </value>
        [DataMember(Name="message_retention_days", EmitDefaultValue=true)]
        public int? MessageRetentionDays { get; set; }

        /// <summary>
        /// Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. 
        /// </summary>
        /// <value>Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future. </value>
        [DataMember(Name="history_public_to_subscribers", EmitDefaultValue=false)]
        public bool HistoryPublicToSubscribers { get; set; }

        /// <summary>
        /// The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
        /// </summary>
        /// <value>The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. </value>
        [DataMember(Name="first_message_id", EmitDefaultValue=true)]
        public int? FirstMessageId { get; set; }

        /// <summary>
        /// The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
        /// </summary>
        /// <value>The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. </value>
        [DataMember(Name="stream_weekly_traffic", EmitDefaultValue=true)]
        public int? StreamWeeklyTraffic { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Subscriptions {\n");
            sb.Append("  StreamId: ").Append(StreamId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  RenderedDescription: ").Append(RenderedDescription).Append("\n");
            sb.Append("  DateCreated: ").Append(DateCreated).Append("\n");
            sb.Append("  InviteOnly: ").Append(InviteOnly).Append("\n");
            sb.Append("  Subscribers: ").Append(Subscribers).Append("\n");
            sb.Append("  DesktopNotifications: ").Append(DesktopNotifications).Append("\n");
            sb.Append("  EmailNotifications: ").Append(EmailNotifications).Append("\n");
            sb.Append("  WildcardMentionsNotify: ").Append(WildcardMentionsNotify).Append("\n");
            sb.Append("  PushNotifications: ").Append(PushNotifications).Append("\n");
            sb.Append("  AudibleNotifications: ").Append(AudibleNotifications).Append("\n");
            sb.Append("  PinToTop: ").Append(PinToTop).Append("\n");
            sb.Append("  EmailAddress: ").Append(EmailAddress).Append("\n");
            sb.Append("  IsMuted: ").Append(IsMuted).Append("\n");
            sb.Append("  InHomeView: ").Append(InHomeView).Append("\n");
            sb.Append("  IsAnnouncementOnly: ").Append(IsAnnouncementOnly).Append("\n");
            sb.Append("  IsWebPublic: ").Append(IsWebPublic).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  Color: ").Append(Color).Append("\n");
            sb.Append("  StreamPostPolicy: ").Append(StreamPostPolicy).Append("\n");
            sb.Append("  MessageRetentionDays: ").Append(MessageRetentionDays).Append("\n");
            sb.Append("  HistoryPublicToSubscribers: ").Append(HistoryPublicToSubscribers).Append("\n");
            sb.Append("  FirstMessageId: ").Append(FirstMessageId).Append("\n");
            sb.Append("  StreamWeeklyTraffic: ").Append(StreamWeeklyTraffic).Append("\n");
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
            return this.Equals(input as Subscriptions);
        }

        /// <summary>
        /// Returns true if Subscriptions instances are equal
        /// </summary>
        /// <param name="input">Instance of Subscriptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Subscriptions input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.StreamId == input.StreamId ||
                    (this.StreamId != null &&
                    this.StreamId.Equals(input.StreamId))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.RenderedDescription == input.RenderedDescription ||
                    (this.RenderedDescription != null &&
                    this.RenderedDescription.Equals(input.RenderedDescription))
                ) && 
                (
                    this.DateCreated == input.DateCreated ||
                    (this.DateCreated != null &&
                    this.DateCreated.Equals(input.DateCreated))
                ) && 
                (
                    this.InviteOnly == input.InviteOnly ||
                    (this.InviteOnly != null &&
                    this.InviteOnly.Equals(input.InviteOnly))
                ) && 
                (
                    this.Subscribers == input.Subscribers ||
                    this.Subscribers != null &&
                    input.Subscribers != null &&
                    this.Subscribers.SequenceEqual(input.Subscribers)
                ) && 
                (
                    this.DesktopNotifications == input.DesktopNotifications ||
                    (this.DesktopNotifications != null &&
                    this.DesktopNotifications.Equals(input.DesktopNotifications))
                ) && 
                (
                    this.EmailNotifications == input.EmailNotifications ||
                    (this.EmailNotifications != null &&
                    this.EmailNotifications.Equals(input.EmailNotifications))
                ) && 
                (
                    this.WildcardMentionsNotify == input.WildcardMentionsNotify ||
                    (this.WildcardMentionsNotify != null &&
                    this.WildcardMentionsNotify.Equals(input.WildcardMentionsNotify))
                ) && 
                (
                    this.PushNotifications == input.PushNotifications ||
                    (this.PushNotifications != null &&
                    this.PushNotifications.Equals(input.PushNotifications))
                ) && 
                (
                    this.AudibleNotifications == input.AudibleNotifications ||
                    (this.AudibleNotifications != null &&
                    this.AudibleNotifications.Equals(input.AudibleNotifications))
                ) && 
                (
                    this.PinToTop == input.PinToTop ||
                    (this.PinToTop != null &&
                    this.PinToTop.Equals(input.PinToTop))
                ) && 
                (
                    this.EmailAddress == input.EmailAddress ||
                    (this.EmailAddress != null &&
                    this.EmailAddress.Equals(input.EmailAddress))
                ) && 
                (
                    this.IsMuted == input.IsMuted ||
                    (this.IsMuted != null &&
                    this.IsMuted.Equals(input.IsMuted))
                ) && 
                (
                    this.InHomeView == input.InHomeView ||
                    (this.InHomeView != null &&
                    this.InHomeView.Equals(input.InHomeView))
                ) && 
                (
                    this.IsAnnouncementOnly == input.IsAnnouncementOnly ||
                    (this.IsAnnouncementOnly != null &&
                    this.IsAnnouncementOnly.Equals(input.IsAnnouncementOnly))
                ) && 
                (
                    this.IsWebPublic == input.IsWebPublic ||
                    (this.IsWebPublic != null &&
                    this.IsWebPublic.Equals(input.IsWebPublic))
                ) && 
                (
                    this.Role == input.Role ||
                    (this.Role != null &&
                    this.Role.Equals(input.Role))
                ) && 
                (
                    this.Color == input.Color ||
                    (this.Color != null &&
                    this.Color.Equals(input.Color))
                ) && 
                (
                    this.StreamPostPolicy == input.StreamPostPolicy ||
                    (this.StreamPostPolicy != null &&
                    this.StreamPostPolicy.Equals(input.StreamPostPolicy))
                ) && 
                (
                    this.MessageRetentionDays == input.MessageRetentionDays ||
                    (this.MessageRetentionDays != null &&
                    this.MessageRetentionDays.Equals(input.MessageRetentionDays))
                ) && 
                (
                    this.HistoryPublicToSubscribers == input.HistoryPublicToSubscribers ||
                    (this.HistoryPublicToSubscribers != null &&
                    this.HistoryPublicToSubscribers.Equals(input.HistoryPublicToSubscribers))
                ) && 
                (
                    this.FirstMessageId == input.FirstMessageId ||
                    (this.FirstMessageId != null &&
                    this.FirstMessageId.Equals(input.FirstMessageId))
                ) && 
                (
                    this.StreamWeeklyTraffic == input.StreamWeeklyTraffic ||
                    (this.StreamWeeklyTraffic != null &&
                    this.StreamWeeklyTraffic.Equals(input.StreamWeeklyTraffic))
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
                if (this.StreamId != null)
                    hashCode = hashCode * 59 + this.StreamId.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.RenderedDescription != null)
                    hashCode = hashCode * 59 + this.RenderedDescription.GetHashCode();
                if (this.DateCreated != null)
                    hashCode = hashCode * 59 + this.DateCreated.GetHashCode();
                if (this.InviteOnly != null)
                    hashCode = hashCode * 59 + this.InviteOnly.GetHashCode();
                if (this.Subscribers != null)
                    hashCode = hashCode * 59 + this.Subscribers.GetHashCode();
                if (this.DesktopNotifications != null)
                    hashCode = hashCode * 59 + this.DesktopNotifications.GetHashCode();
                if (this.EmailNotifications != null)
                    hashCode = hashCode * 59 + this.EmailNotifications.GetHashCode();
                if (this.WildcardMentionsNotify != null)
                    hashCode = hashCode * 59 + this.WildcardMentionsNotify.GetHashCode();
                if (this.PushNotifications != null)
                    hashCode = hashCode * 59 + this.PushNotifications.GetHashCode();
                if (this.AudibleNotifications != null)
                    hashCode = hashCode * 59 + this.AudibleNotifications.GetHashCode();
                if (this.PinToTop != null)
                    hashCode = hashCode * 59 + this.PinToTop.GetHashCode();
                if (this.EmailAddress != null)
                    hashCode = hashCode * 59 + this.EmailAddress.GetHashCode();
                if (this.IsMuted != null)
                    hashCode = hashCode * 59 + this.IsMuted.GetHashCode();
                if (this.InHomeView != null)
                    hashCode = hashCode * 59 + this.InHomeView.GetHashCode();
                if (this.IsAnnouncementOnly != null)
                    hashCode = hashCode * 59 + this.IsAnnouncementOnly.GetHashCode();
                if (this.IsWebPublic != null)
                    hashCode = hashCode * 59 + this.IsWebPublic.GetHashCode();
                if (this.Role != null)
                    hashCode = hashCode * 59 + this.Role.GetHashCode();
                if (this.Color != null)
                    hashCode = hashCode * 59 + this.Color.GetHashCode();
                if (this.StreamPostPolicy != null)
                    hashCode = hashCode * 59 + this.StreamPostPolicy.GetHashCode();
                if (this.MessageRetentionDays != null)
                    hashCode = hashCode * 59 + this.MessageRetentionDays.GetHashCode();
                if (this.HistoryPublicToSubscribers != null)
                    hashCode = hashCode * 59 + this.HistoryPublicToSubscribers.GetHashCode();
                if (this.FirstMessageId != null)
                    hashCode = hashCode * 59 + this.FirstMessageId.GetHashCode();
                if (this.StreamWeeklyTraffic != null)
                    hashCode = hashCode * 59 + this.StreamWeeklyTraffic.GetHashCode();
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
