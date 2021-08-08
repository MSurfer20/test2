package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NonExistingStreamErrorAllOf._

case class NonExistingStreamErrorAllOf (
  result: Option[AnyType],
msg: Option[AnyType],
code: Option[AnyType],
/* The name of the stream that could not be found.  */
  stream: Option[String])

object NonExistingStreamErrorAllOf {
  import DateTimeCodecs._

  implicit val NonExistingStreamErrorAllOfCodecJson: CodecJson[NonExistingStreamErrorAllOf] = CodecJson.derive[NonExistingStreamErrorAllOf]
  implicit val NonExistingStreamErrorAllOfDecoder: EntityDecoder[NonExistingStreamErrorAllOf] = jsonOf[NonExistingStreamErrorAllOf]
  implicit val NonExistingStreamErrorAllOfEncoder: EntityEncoder[NonExistingStreamErrorAllOf] = jsonEncoderOf[NonExistingStreamErrorAllOf]
}
