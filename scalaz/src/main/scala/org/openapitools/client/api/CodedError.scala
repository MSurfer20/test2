package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CodedError._

case class CodedError (
  result: AnyType,
msg: AnyType,
code: Option[AnyType])

object CodedError {
  import DateTimeCodecs._

  implicit val CodedErrorCodecJson: CodecJson[CodedError] = CodecJson.derive[CodedError]
  implicit val CodedErrorDecoder: EntityDecoder[CodedError] = jsonOf[CodedError]
  implicit val CodedErrorEncoder: EntityEncoder[CodedError] = jsonEncoderOf[CodedError]
}
