package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RateLimitedError._

case class RateLimitedError (
  result: AnyType,
msg: AnyType,
code: Option[AnyType])

object RateLimitedError {
  import DateTimeCodecs._

  implicit val RateLimitedErrorCodecJson: CodecJson[RateLimitedError] = CodecJson.derive[RateLimitedError]
  implicit val RateLimitedErrorDecoder: EntityDecoder[RateLimitedError] = jsonOf[RateLimitedError]
  implicit val RateLimitedErrorEncoder: EntityEncoder[RateLimitedError] = jsonEncoderOf[RateLimitedError]
}
