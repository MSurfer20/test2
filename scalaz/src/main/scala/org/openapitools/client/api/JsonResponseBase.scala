package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import JsonResponseBase._

case class JsonResponseBase (
  result: Option[String])

object JsonResponseBase {
  import DateTimeCodecs._

  implicit val JsonResponseBaseCodecJson: CodecJson[JsonResponseBase] = CodecJson.derive[JsonResponseBase]
  implicit val JsonResponseBaseDecoder: EntityDecoder[JsonResponseBase] = jsonOf[JsonResponseBase]
  implicit val JsonResponseBaseEncoder: EntityEncoder[JsonResponseBase] = jsonEncoderOf[JsonResponseBase]
}
