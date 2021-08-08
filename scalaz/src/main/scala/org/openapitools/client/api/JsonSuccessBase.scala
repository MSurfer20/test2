package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import JsonSuccessBase._

case class JsonSuccessBase (
  result: Result,
msg: String)

object JsonSuccessBase {
  import DateTimeCodecs._
  sealed trait Result
  case object Success extends Result

  object Result {
    def toResult(s: String): Option[Result] = s match {
      case "Success" => Some(Success)
      case _ => None
    }

    def fromResult(x: Result): String = x match {
      case Success => "Success"
    }
  }

  implicit val ResultEnumEncoder: EncodeJson[Result] =
    EncodeJson[Result](is => StringEncodeJson(Result.fromResult(is)))

  implicit val ResultEnumDecoder: DecodeJson[Result] =
    DecodeJson.optionDecoder[Result](n => n.string.flatMap(jStr => Result.toResult(jStr)), "Result failed to de-serialize")

  implicit val JsonSuccessBaseCodecJson: CodecJson[JsonSuccessBase] = CodecJson.derive[JsonSuccessBase]
  implicit val JsonSuccessBaseDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]
  implicit val JsonSuccessBaseEncoder: EntityEncoder[JsonSuccessBase] = jsonEncoderOf[JsonSuccessBase]
}
