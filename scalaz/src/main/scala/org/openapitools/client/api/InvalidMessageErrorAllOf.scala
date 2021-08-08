package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InvalidMessageErrorAllOf._

case class InvalidMessageErrorAllOf (
  result: Option[AnyType],
msg: Option[AnyType],
/* The raw content of the message.  */
  rawContent: Option[String])

object InvalidMessageErrorAllOf {
  import DateTimeCodecs._

  implicit val InvalidMessageErrorAllOfCodecJson: CodecJson[InvalidMessageErrorAllOf] = CodecJson.derive[InvalidMessageErrorAllOf]
  implicit val InvalidMessageErrorAllOfDecoder: EntityDecoder[InvalidMessageErrorAllOf] = jsonOf[InvalidMessageErrorAllOf]
  implicit val InvalidMessageErrorAllOfEncoder: EntityEncoder[InvalidMessageErrorAllOf] = jsonEncoderOf[InvalidMessageErrorAllOf]
}
