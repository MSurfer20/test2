package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NonExistingStreamError._

case class NonExistingStreamError (
  result: AnyType,
msg: AnyType,
code: Option[AnyType],
/* The name of the stream that could not be found.  */
  stream: Option[String])

object NonExistingStreamError {
  import DateTimeCodecs._

  implicit val NonExistingStreamErrorCodecJson: CodecJson[NonExistingStreamError] = CodecJson.derive[NonExistingStreamError]
  implicit val NonExistingStreamErrorDecoder: EntityDecoder[NonExistingStreamError] = jsonOf[NonExistingStreamError]
  implicit val NonExistingStreamErrorEncoder: EntityEncoder[NonExistingStreamError] = jsonEncoderOf[NonExistingStreamError]
}
