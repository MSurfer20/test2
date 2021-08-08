package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserNotAuthorizedError._

case class UserNotAuthorizedError (
  result: AnyType,
msg: AnyType,
code: Option[AnyType])

object UserNotAuthorizedError {
  import DateTimeCodecs._

  implicit val UserNotAuthorizedErrorCodecJson: CodecJson[UserNotAuthorizedError] = CodecJson.derive[UserNotAuthorizedError]
  implicit val UserNotAuthorizedErrorDecoder: EntityDecoder[UserNotAuthorizedError] = jsonOf[UserNotAuthorizedError]
  implicit val UserNotAuthorizedErrorEncoder: EntityEncoder[UserNotAuthorizedError] = jsonEncoderOf[UserNotAuthorizedError]
}
