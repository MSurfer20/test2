package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealmDeactivatedError._

case class RealmDeactivatedError (
  result: AnyType,
msg: AnyType,
code: Option[AnyType])

object RealmDeactivatedError {
  import DateTimeCodecs._

  implicit val RealmDeactivatedErrorCodecJson: CodecJson[RealmDeactivatedError] = CodecJson.derive[RealmDeactivatedError]
  implicit val RealmDeactivatedErrorDecoder: EntityDecoder[RealmDeactivatedError] = jsonOf[RealmDeactivatedError]
  implicit val RealmDeactivatedErrorEncoder: EntityEncoder[RealmDeactivatedError] = jsonEncoderOf[RealmDeactivatedError]
}
