package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MissingArgumentError._

case class MissingArgumentError (
  result: AnyType,
msg: AnyType,
code: Option[AnyType],
/* It contains the information about the missing parameter.  */
  varName: Option[String])

object MissingArgumentError {
  import DateTimeCodecs._

  implicit val MissingArgumentErrorCodecJson: CodecJson[MissingArgumentError] = CodecJson.derive[MissingArgumentError]
  implicit val MissingArgumentErrorDecoder: EntityDecoder[MissingArgumentError] = jsonOf[MissingArgumentError]
  implicit val MissingArgumentErrorEncoder: EntityEncoder[MissingArgumentError] = jsonEncoderOf[MissingArgumentError]
}
