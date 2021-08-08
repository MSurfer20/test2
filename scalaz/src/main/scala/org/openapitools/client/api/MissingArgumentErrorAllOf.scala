package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MissingArgumentErrorAllOf._

case class MissingArgumentErrorAllOf (
  result: Option[AnyType],
msg: Option[AnyType],
code: Option[AnyType],
/* It contains the information about the missing parameter.  */
  varName: Option[String])

object MissingArgumentErrorAllOf {
  import DateTimeCodecs._

  implicit val MissingArgumentErrorAllOfCodecJson: CodecJson[MissingArgumentErrorAllOf] = CodecJson.derive[MissingArgumentErrorAllOf]
  implicit val MissingArgumentErrorAllOfDecoder: EntityDecoder[MissingArgumentErrorAllOf] = jsonOf[MissingArgumentErrorAllOf]
  implicit val MissingArgumentErrorAllOfEncoder: EntityEncoder[MissingArgumentErrorAllOf] = jsonEncoderOf[MissingArgumentErrorAllOf]
}
