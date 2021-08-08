package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BasicStreamAllOf._

case class BasicStreamAllOf (
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

object BasicStreamAllOf {
  import DateTimeCodecs._

  implicit val BasicStreamAllOfCodecJson: CodecJson[BasicStreamAllOf] = CodecJson.derive[BasicStreamAllOf]
  implicit val BasicStreamAllOfDecoder: EntityDecoder[BasicStreamAllOf] = jsonOf[BasicStreamAllOf]
  implicit val BasicStreamAllOfEncoder: EntityEncoder[BasicStreamAllOf] = jsonEncoderOf[BasicStreamAllOf]
}
