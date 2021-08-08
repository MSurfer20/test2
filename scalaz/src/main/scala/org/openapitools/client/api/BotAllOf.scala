package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BotAllOf._

case class BotAllOf (
  userId: Option[AnyType],
fullName: Option[AnyType],
apiKey: Option[AnyType],
defaultSendingStream: Option[AnyType],
defaultEventsRegisterStream: Option[AnyType],
defaultAllPublicStreams: Option[AnyType],
avatarUrl: Option[AnyType],
ownerId: Option[AnyType],
services: Option[AnyType],
/* The email of the bot.  */
  email: Option[String],
/* An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  */
  botType: Option[Integer],
/* A boolean describing whether the user account has been deactivated.  */
  isActive: Option[Boolean])

object BotAllOf {
  import DateTimeCodecs._

  implicit val BotAllOfCodecJson: CodecJson[BotAllOf] = CodecJson.derive[BotAllOf]
  implicit val BotAllOfDecoder: EntityDecoder[BotAllOf] = jsonOf[BotAllOf]
  implicit val BotAllOfEncoder: EntityEncoder[BotAllOf] = jsonEncoderOf[BotAllOf]
}
