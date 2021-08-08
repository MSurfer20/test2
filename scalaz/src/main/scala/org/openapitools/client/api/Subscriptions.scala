package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Subscriptions._

case class Subscriptions (
  /* The unique ID of a stream.  */
  streamId: Option[Integer],
/* The name of a stream.  */
  name: Option[String],
/* The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.  */
  description: Option[String],
/* A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  */
  renderedDescription: Option[String],
/* The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  */
  dateCreated: Option[Integer],
/* Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  */
  inviteOnly: Option[Boolean],
/* A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`.  */
  subscribers: Option[List[Integer]],
/* A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream.  */
  desktopNotifications: Option[Boolean],
/* A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream.  */
  emailNotifications: Option[Boolean],
/* A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream.  */
  wildcardMentionsNotify: Option[Boolean],
/* A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream.  */
  pushNotifications: Option[Boolean],
/* A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream.  */
  audibleNotifications: Option[Boolean],
/* A boolean specifying whether the given stream has been pinned to the top.  */
  pinToTop: Option[Boolean],
/* Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email).  */
  emailAddress: Option[String],
/* Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`).  */
  isMuted: Option[Boolean],
/* Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available.  */
  inHomeView: Option[Boolean],
/* Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.  */
  isAnnouncementOnly: Option[Boolean],
/* Whether the stream has been configured to allow unauthenticated access to its message history from the web.  */
  isWebPublic: Option[Boolean],
/* The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31).  */
  role: Option[Role],
/* The user's personal color for the stream.  */
  color: Option[String],
/* Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  */
  streamPostPolicy: Option[Integer],
/* Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  */
  messageRetentionDays: Option[Integer],
/* Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future.  */
  historyPublicToSubscribers: Option[Boolean],
/* The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  */
  firstMessageId: Option[Integer],
/* The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic.  */
  streamWeeklyTraffic: Option[Integer])

object Subscriptions {
  import DateTimeCodecs._
  sealed trait Role
  case object `20` extends Role
  case object `50` extends Role

  object Role {
    def toRole(s: String): Option[Role] = s match {
      case "`20`" => Some(`20`)
      case "`50`" => Some(`50`)
      case _ => None
    }

    def fromRole(x: Role): String = x match {
      case `20` => "`20`"
      case `50` => "`50`"
    }
  }

  implicit val RoleEnumEncoder: EncodeJson[Role] =
    EncodeJson[Role](is => StringEncodeJson(Role.fromRole(is)))

  implicit val RoleEnumDecoder: DecodeJson[Role] =
    DecodeJson.optionDecoder[Role](n => n.string.flatMap(jStr => Role.toRole(jStr)), "Role failed to de-serialize")

  implicit val SubscriptionsCodecJson: CodecJson[Subscriptions] = CodecJson.derive[Subscriptions]
  implicit val SubscriptionsDecoder: EntityDecoder[Subscriptions] = jsonOf[Subscriptions]
  implicit val SubscriptionsEncoder: EntityEncoder[Subscriptions] = jsonEncoderOf[Subscriptions]
}
