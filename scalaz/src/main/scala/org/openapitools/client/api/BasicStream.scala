package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BasicStream._

case class BasicStream (
  streamId: Option[AnyType],
name: Option[AnyType],
description: Option[AnyType],
dateCreated: Option[AnyType],
inviteOnly: Option[AnyType],
renderedDescription: Option[AnyType],
isWebPublic: Option[AnyType],
streamPostPolicy: Option[AnyType],
messageRetentionDays: Option[AnyType],
historyPublicToSubscribers: Option[AnyType],
firstMessageId: Option[AnyType],
isAnnouncementOnly: Option[AnyType])

object BasicStream {
  import DateTimeCodecs._

  implicit val BasicStreamCodecJson: CodecJson[BasicStream] = CodecJson.derive[BasicStream]
  implicit val BasicStreamDecoder: EntityDecoder[BasicStream] = jsonOf[BasicStream]
  implicit val BasicStreamEncoder: EntityEncoder[BasicStream] = jsonEncoderOf[BasicStream]
}
