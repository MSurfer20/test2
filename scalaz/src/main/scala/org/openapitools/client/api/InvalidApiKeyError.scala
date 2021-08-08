package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InvalidApiKeyError._

case class InvalidApiKeyError (
  result: AnyType,
msg: AnyType)

object InvalidApiKeyError {
  import DateTimeCodecs._

  implicit val InvalidApiKeyErrorCodecJson: CodecJson[InvalidApiKeyError] = CodecJson.derive[InvalidApiKeyError]
  implicit val InvalidApiKeyErrorDecoder: EntityDecoder[InvalidApiKeyError] = jsonOf[InvalidApiKeyError]
  implicit val InvalidApiKeyErrorEncoder: EntityEncoder[InvalidApiKeyError] = jsonEncoderOf[InvalidApiKeyError]
}
