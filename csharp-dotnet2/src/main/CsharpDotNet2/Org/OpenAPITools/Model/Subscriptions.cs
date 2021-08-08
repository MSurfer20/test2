using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class Subscriptions {
    /// <summary>
    /// The unique ID of a stream. 
    /// </summary>
    /// <value>The unique ID of a stream. </value>
    [DataMember(Name="stream_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stream_id")]
    public int? StreamId { get; set; }

    /// <summary>
    /// The name of a stream. 
    /// </summary>
    /// <value>The name of a stream. </value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
    /// </summary>
    /// <value>The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. </value>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
    /// </summary>
    /// <value>A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. </value>
    [DataMember(Name="rendered_description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rendered_description")]
    public string RenderedDescription { get; set; }

    /// <summary>
    /// The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
    /// </summary>
    /// <value>The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). </value>
    [DataMember(Name="date_created", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "date_created")]
    public int? DateCreated { get; set; }

    /// <summary>
    /// Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
    /// </summary>
    /// <value>Specifies whether the stream is private or not. Only people who have been invited can access a private stream. </value>
    [DataMember(Name="invite_only", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "invite_only")]
    public bool? InviteOnly { get; set; }

    /// <summary>
    /// A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
    /// </summary>
    /// <value>A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. </value>
    [DataMember(Name="subscribers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subscribers")]
    public List<int?> Subscribers { get; set; }

    /// <summary>
    /// A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
    /// </summary>
    /// <value>A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. </value>
    [DataMember(Name="desktop_notifications", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "desktop_notifications")]
    public bool? DesktopNotifications { get; set; }

    /// <summary>
    /// A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
    /// </summary>
    /// <value>A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. </value>
    [DataMember(Name="email_notifications", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email_notifications")]
    public bool? EmailNotifications { get; set; }

    /// <summary>
    /// A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
    /// </summary>
    /// <value>A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. </value>
    [DataMember(Name="wildcard_mentions_notify", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "wildcard_mentions_notify")]
    public bool? WildcardMentionsNotify { get; set; }

    /// <summary>
    /// A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
    /// </summary>
    /// <value>A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. </value>
    [DataMember(Name="push_notifications", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "push_notifications")]
    public bool? PushNotifications { get; set; }

    /// <summary>
    /// A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
    /// </summary>
    /// <value>A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. </value>
    [DataMember(Name="audible_notifications", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "audible_notifications")]
    public bool? AudibleNotifications { get; set; }

    /// <summary>
    /// A boolean specifying whether the given stream has been pinned to the top. 
    /// </summary>
    /// <value>A boolean specifying whether the given stream has been pinned to the top. </value>
    [DataMember(Name="pin_to_top", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pin_to_top")]
    public bool? PinToTop { get; set; }

    /// <summary>
    /// Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
    /// </summary>
    /// <value>Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). </value>
    [DataMember(Name="email_address", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email_address")]
    public string EmailAddress { get; set; }

    /// <summary>
    /// Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
    /// </summary>
    /// <value>Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). </value>
    [DataMember(Name="is_muted", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_muted")]
    public bool? IsMuted { get; set; }

    /// <summary>
    /// Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
    /// </summary>
    /// <value>Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. </value>
    [DataMember(Name="in_home_view", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "in_home_view")]
    public bool? InHomeView { get; set; }

    /// <summary>
    /// Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
    /// </summary>
    /// <value>Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. </value>
    [DataMember(Name="is_announcement_only", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_announcement_only")]
    public bool? IsAnnouncementOnly { get; set; }

    /// <summary>
    /// Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
    /// </summary>
    /// <value>Whether the stream has been configured to allow unauthenticated access to its message history from the web. </value>
    [DataMember(Name="is_web_public", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_web_public")]
    public bool? IsWebPublic { get; set; }

    /// <summary>
    /// The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
    /// </summary>
    /// <value>The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). </value>
    [DataMember(Name="role", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "role")]
    public int? Role { get; set; }

    /// <summary>
    /// The user's personal color for the stream. 
    /// </summary>
    /// <value>The user's personal color for the stream. </value>
    [DataMember(Name="color", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "color")]
    public string Color { get; set; }

    /// <summary>
    /// Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
    /// </summary>
    /// <value>Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. </value>
    [DataMember(Name="stream_post_policy", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stream_post_policy")]
    public int? StreamPostPolicy { get; set; }

    /// <summary>
    /// Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
    /// </summary>
    /// <value>Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). </value>
    [DataMember(Name="message_retention_days", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "message_retention_days")]
    public int? MessageRetentionDays { get; set; }

    /// <summary>
    /// Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
    /// </summary>
    /// <value>Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. </value>
    [DataMember(Name="history_public_to_subscribers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "history_public_to_subscribers")]
    public bool? HistoryPublicToSubscribers { get; set; }

    /// <summary>
    /// The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
    /// </summary>
    /// <value>The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. </value>
    [DataMember(Name="first_message_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "first_message_id")]
    public int? FirstMessageId { get; set; }

    /// <summary>
    /// The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
    /// </summary>
    /// <value>The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. </value>
    [DataMember(Name="stream_weekly_traffic", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stream_weekly_traffic")]
    public int? StreamWeeklyTraffic { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
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
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

}
}
