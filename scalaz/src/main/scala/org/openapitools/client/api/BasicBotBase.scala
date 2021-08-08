package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BasicBotBase._

case class BasicBotBase (
  /* The user id of the bot.  */
  userId: Option[Integer],
/* The full name of the bot.  */
  fullName: Option[String],
/* The API key of the bot which it uses to make API requests.  */
  apiKey: Option[String],
/* The default sending stream of the bot. Null if the bot doesn't have a default sending stream.  */
  defaultSendingStream: Option[String],
/* The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream.  */
  defaultEventsRegisterStream: Option[String],
/* Whether the bot can send messages to all streams by default.  */
  defaultAllPublicStreams: Option[Boolean],
/* The URL of the bot's avatar.  */
  avatarUrl: Option[String],
/* The user id of the bot's owner.  Null if the bot has no owner.  */
  ownerId: Option[Integer],
/* The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  */
  services: Option[List[OneOfobjectobject]])

object BasicBotBase {
  import DateTimeCodecs._

  implicit val BasicBotBaseCodecJson: CodecJson[BasicBotBase] = CodecJson.derive[BasicBotBase]
  implicit val BasicBotBaseDecoder: EntityDecoder[BasicBotBase] = jsonOf[BasicBotBase]
  implicit val BasicBotBaseEncoder: EntityEncoder[BasicBotBase] = jsonEncoderOf[BasicBotBase]
}
