package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CodedErrorAllOf._

case class CodedErrorAllOf (
  result: Option[AnyType],
msg: Option[AnyType],
code: Option[AnyType])

object CodedErrorAllOf {
  import DateTimeCodecs._

  implicit val CodedErrorAllOfCodecJson: CodecJson[CodedErrorAllOf] = CodecJson.derive[CodedErrorAllOf]
  implicit val CodedErrorAllOfDecoder: EntityDecoder[CodedErrorAllOf] = jsonOf[CodedErrorAllOf]
  implicit val CodedErrorAllOfEncoder: EntityEncoder[CodedErrorAllOf] = jsonEncoderOf[CodedErrorAllOf]
}
