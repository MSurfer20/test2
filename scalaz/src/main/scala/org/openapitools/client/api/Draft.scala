package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Draft._

case class Draft (
  /* The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited.  */
  id: Option[Integer],
/* The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages).  */
  `type`: `Type`,
/* An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array.  */
  to: List[Integer],
/* For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes.  */
  topic: String,
/* The body of the draft. Should not contain null bytes.  */
  content: String,
/* A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server.  */
  timestamp: Option[BigDecimal])

object Draft {
  import DateTimeCodecs._
  sealed trait `Type`
  case object `` extends `Type`
  case object Stream extends `Type`
  case object `Private` extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "``" => Some(``)
      case "Stream" => Some(Stream)
      case "`Private`" => Some(`Private`)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case `` => "``"
      case Stream => "Stream"
      case `Private` => "`Private`"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val DraftCodecJson: CodecJson[Draft] = CodecJson.derive[Draft]
  implicit val DraftDecoder: EntityDecoder[Draft] = jsonOf[Draft]
  implicit val DraftEncoder: EntityEncoder[Draft] = jsonEncoderOf[Draft]
}
