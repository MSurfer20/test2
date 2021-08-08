package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import JsonSuccessAllOf._

case class JsonSuccessAllOf (
  result: Option[AnyType],
msg: Option[AnyType])

object JsonSuccessAllOf {
  import DateTimeCodecs._

  implicit val JsonSuccessAllOfCodecJson: CodecJson[JsonSuccessAllOf] = CodecJson.derive[JsonSuccessAllOf]
  implicit val JsonSuccessAllOfDecoder: EntityDecoder[JsonSuccessAllOf] = jsonOf[JsonSuccessAllOf]
  implicit val JsonSuccessAllOfEncoder: EntityEncoder[JsonSuccessAllOf] = jsonEncoderOf[JsonSuccessAllOf]
}
