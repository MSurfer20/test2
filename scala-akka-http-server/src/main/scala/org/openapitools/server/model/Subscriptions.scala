package org.openapitools.server.model


/**
 * @param streamId The unique ID of a stream.  for example: ''null''
 * @param name The name of a stream.  for example: ''null''
 * @param description The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.  for example: ''null''
 * @param renderedDescription A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  for example: ''null''
 * @param dateCreated The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  for example: ''null''
 * @param inviteOnly Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  for example: ''null''
 * @param subscribers A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`.  for example: ''null''
 * @param desktopNotifications A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream.  for example: ''null''
 * @param emailNotifications A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream.  for example: ''null''
 * @param wildcardMentionsNotify A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream.  for example: ''null''
 * @param pushNotifications A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream.  for example: ''null''
 * @param audibleNotifications A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream.  for example: ''null''
 * @param pinToTop A boolean specifying whether the given stream has been pinned to the top.  for example: ''null''
 * @param emailAddress Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email).  for example: ''null''
 * @param isMuted Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`).  for example: ''null''
 * @param inHomeView Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available.  for example: ''null''
 * @param isAnnouncementOnly Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.  for example: ''null''
 * @param isWebPublic Whether the stream has been configured to allow unauthenticated access to its message history from the web.  for example: ''null''
 * @param role The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31).  for example: ''null''
 * @param color The user's personal color for the stream.  for example: ''null''
 * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  for example: ''null''
 * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  for example: ''null''
 * @param historyPublicToSubscribers Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future.  for example: ''null''
 * @param firstMessageId The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  for example: ''null''
 * @param streamWeeklyTraffic The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic.  for example: ''null''
*/
final case class Subscriptions (
  streamId: Option[Int],
  name: Option[String],
  description: Option[String],
  renderedDescription: Option[String],
  dateCreated: Option[Int],
  inviteOnly: Option[Boolean],
  subscribers: Option[Seq[Int]],
  desktopNotifications: Option[Boolean],
  emailNotifications: Option[Boolean],
  wildcardMentionsNotify: Option[Boolean],
  pushNotifications: Option[Boolean],
  audibleNotifications: Option[Boolean],
  pinToTop: Option[Boolean],
  emailAddress: Option[String],
  isMuted: Option[Boolean],
  inHomeView: Option[Boolean],
  isAnnouncementOnly: Option[Boolean],
  isWebPublic: Option[Boolean],
  role: Option[Int],
  color: Option[String],
  streamPostPolicy: Option[Int],
  messageRetentionDays: Option[Int],
  historyPublicToSubscribers: Option[Boolean],
  firstMessageId: Option[Int],
  streamWeeklyTraffic: Option[Int]
)

