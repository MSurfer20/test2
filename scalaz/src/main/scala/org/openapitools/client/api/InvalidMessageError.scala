package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InvalidMessageError._

case class InvalidMessageError (
  result: AnyType,
msg: AnyType,
/* The raw content of the message.  */
  rawContent: Option[String])

object InvalidMessageError {
  import DateTimeCodecs._

  implicit val InvalidMessageErrorCodecJson: CodecJson[InvalidMessageError] = CodecJson.derive[InvalidMessageError]
  implicit val InvalidMessageErrorDecoder: EntityDecoder[InvalidMessageError] = jsonOf[InvalidMessageError]
  implicit val InvalidMessageErrorEncoder: EntityEncoder[InvalidMessageError] = jsonEncoderOf[InvalidMessageError]
}
