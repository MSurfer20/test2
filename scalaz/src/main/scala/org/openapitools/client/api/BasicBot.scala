package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BasicBot._

case class BasicBot (
  userId: Option[AnyType],
fullName: Option[AnyType],
apiKey: Option[AnyType],
defaultSendingStream: Option[AnyType],
defaultEventsRegisterStream: Option[AnyType],
defaultAllPublicStreams: Option[AnyType],
avatarUrl: Option[AnyType],
ownerId: Option[AnyType],
services: Option[AnyType])

object BasicBot {
  import DateTimeCodecs._

  implicit val BasicBotCodecJson: CodecJson[BasicBot] = CodecJson.derive[BasicBot]
  implicit val BasicBotDecoder: EntityDecoder[BasicBot] = jsonOf[BasicBot]
  implicit val BasicBotEncoder: EntityEncoder[BasicBot] = jsonEncoderOf[BasicBot]
}
