package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CodedErrorBase._

case class CodedErrorBase (
  result: AnyType,
msg: AnyType,
/* A string that identifies the error.  */
  code: Option[String])

object CodedErrorBase {
  import DateTimeCodecs._

  implicit val CodedErrorBaseCodecJson: CodecJson[CodedErrorBase] = CodecJson.derive[CodedErrorBase]
  implicit val CodedErrorBaseDecoder: EntityDecoder[CodedErrorBase] = jsonOf[CodedErrorBase]
  implicit val CodedErrorBaseEncoder: EntityEncoder[CodedErrorBase] = jsonEncoderOf[CodedErrorBase]
}
