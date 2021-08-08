package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import JsonErrorBaseAllOf._

case class JsonErrorBaseAllOf (
  result: Result,
msg: String)

object JsonErrorBaseAllOf {
  import DateTimeCodecs._
  sealed trait Result
  case object Error extends Result

  object Result {
    def toResult(s: String): Option[Result] = s match {
      case "Error" => Some(Error)
      case _ => None
    }

    def fromResult(x: Result): String = x match {
      case Error => "Error"
    }
  }

  implicit val ResultEnumEncoder: EncodeJson[Result] =
    EncodeJson[Result](is => StringEncodeJson(Result.fromResult(is)))

  implicit val ResultEnumDecoder: DecodeJson[Result] =
    DecodeJson.optionDecoder[Result](n => n.string.flatMap(jStr => Result.toResult(jStr)), "Result failed to de-serialize")

  implicit val JsonErrorBaseAllOfCodecJson: CodecJson[JsonErrorBaseAllOf] = CodecJson.derive[JsonErrorBaseAllOf]
  implicit val JsonErrorBaseAllOfDecoder: EntityDecoder[JsonErrorBaseAllOf] = jsonOf[JsonErrorBaseAllOf]
  implicit val JsonErrorBaseAllOfEncoder: EntityEncoder[JsonErrorBaseAllOf] = jsonEncoderOf[JsonErrorBaseAllOf]
}
