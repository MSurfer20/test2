package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import JsonError._

case class JsonError (
  result: AnyType,
msg: AnyType)

object JsonError {
  import DateTimeCodecs._

  implicit val JsonErrorCodecJson: CodecJson[JsonError] = CodecJson.derive[JsonError]
  implicit val JsonErrorDecoder: EntityDecoder[JsonError] = jsonOf[JsonError]
  implicit val JsonErrorEncoder: EntityEncoder[JsonError] = jsonEncoderOf[JsonError]
}
