package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserDeactivatedError._

case class UserDeactivatedError (
  result: AnyType,
msg: AnyType,
code: Option[AnyType])

object UserDeactivatedError {
  import DateTimeCodecs._

  implicit val UserDeactivatedErrorCodecJson: CodecJson[UserDeactivatedError] = CodecJson.derive[UserDeactivatedError]
  implicit val UserDeactivatedErrorDecoder: EntityDecoder[UserDeactivatedError] = jsonOf[UserDeactivatedError]
  implicit val UserDeactivatedErrorEncoder: EntityEncoder[UserDeactivatedError] = jsonEncoderOf[UserDeactivatedError]
}
