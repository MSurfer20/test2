package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Bot._

case class Bot (
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

object Bot {
  import DateTimeCodecs._

  implicit val BotCodecJson: CodecJson[Bot] = CodecJson.derive[Bot]
  implicit val BotDecoder: EntityDecoder[Bot] = jsonOf[Bot]
  implicit val BotEncoder: EntityEncoder[Bot] = jsonEncoderOf[Bot]
}
