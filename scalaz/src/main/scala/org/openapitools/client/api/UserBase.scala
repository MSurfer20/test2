package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserBase._

case class UserBase (
  /* The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else.  */
  email: Option[String],
/* A boolean specifying whether the user is a bot or full account.  */
  isBot: Option[Boolean],
/* URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion.  */
  avatarUrl: Option[String],
/* Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`.  */
  avatarVersion: Option[Integer],
/* Full name of the user or bot, used for all display purposes.  */
  fullName: Option[String],
/* A boolean specifying whether the user is an organization administrator.  */
  isAdmin: Option[Boolean],
/* A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8).  */
  isOwner: Option[Boolean],
/* A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73).  */
  isBillingAdmin: Option[Boolean],
/* [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59).  */
  role: Option[Role],
/* An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  */
  botType: Option[Integer],
/* The unique ID of the user.  */
  userId: Option[Integer],
/* If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner.  */
  botOwnerId: Option[Integer],
/* A boolean specifying whether the user account has been deactivated.  */
  isActive: Option[Boolean],
/* A boolean specifying whether the user is a guest user.  */
  isGuest: Option[Boolean],
/* The time zone of the user.  */
  timezone: Option[String],
/* The time the user account was created.  */
  dateJoined: Option[String],
/* The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy.  */
  deliveryEmail: Option[String],
/* A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present.  */
  profileData: Option[Map[String, Any]])

object UserBase {
  import DateTimeCodecs._
  sealed trait Role
  case object `100` extends Role
  case object `200` extends Role
  case object `300` extends Role
  case object `400` extends Role
  case object `600` extends Role

  object Role {
    def toRole(s: String): Option[Role] = s match {
      case "`100`" => Some(`100`)
      case "`200`" => Some(`200`)
      case "`300`" => Some(`300`)
      case "`400`" => Some(`400`)
      case "`600`" => Some(`600`)
      case _ => None
    }

    def fromRole(x: Role): String = x match {
      case `100` => "`100`"
      case `200` => "`200`"
      case `300` => "`300`"
      case `400` => "`400`"
      case `600` => "`600`"
    }
  }

  implicit val RoleEnumEncoder: EncodeJson[Role] =
    EncodeJson[Role](is => StringEncodeJson(Role.fromRole(is)))

  implicit val RoleEnumDecoder: DecodeJson[Role] =
    DecodeJson.optionDecoder[Role](n => n.string.flatMap(jStr => Role.toRole(jStr)), "Role failed to de-serialize")

  implicit val UserBaseCodecJson: CodecJson[UserBase] = CodecJson.derive[UserBase]
  implicit val UserBaseDecoder: EntityDecoder[UserBase] = jsonOf[UserBase]
  implicit val UserBaseEncoder: EntityEncoder[UserBase] = jsonEncoderOf[UserBase]
}
