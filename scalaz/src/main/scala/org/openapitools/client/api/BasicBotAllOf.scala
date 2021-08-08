package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BasicBotAllOf._

case class BasicBotAllOf (
  userId: Option[AnyType],
fullName: Option[AnyType],
apiKey: Option[AnyType],
defaultSendingStream: Option[AnyType],
defaultEventsRegisterStream: Option[AnyType],
defaultAllPublicStreams: Option[AnyType],
avatarUrl: Option[AnyType],
ownerId: Option[AnyType],
services: Option[AnyType])

object BasicBotAllOf {
  import DateTimeCodecs._

  implicit val BasicBotAllOfCodecJson: CodecJson[BasicBotAllOf] = CodecJson.derive[BasicBotAllOf]
  implicit val BasicBotAllOfDecoder: EntityDecoder[BasicBotAllOf] = jsonOf[BasicBotAllOf]
  implicit val BasicBotAllOfEncoder: EntityEncoder[BasicBotAllOf] = jsonEncoderOf[BasicBotAllOf]
}
