package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CodedErrorBaseAllOf._

case class CodedErrorBaseAllOf (
  result: Option[AnyType],
msg: Option[AnyType],
/* A string that identifies the error.  */
  code: Option[String])

object CodedErrorBaseAllOf {
  import DateTimeCodecs._

  implicit val CodedErrorBaseAllOfCodecJson: CodecJson[CodedErrorBaseAllOf] = CodecJson.derive[CodedErrorBaseAllOf]
  implicit val CodedErrorBaseAllOfDecoder: EntityDecoder[CodedErrorBaseAllOf] = jsonOf[CodedErrorBaseAllOf]
  implicit val CodedErrorBaseAllOfEncoder: EntityEncoder[CodedErrorBaseAllOf] = jsonEncoderOf[CodedErrorBaseAllOf]
}
