package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EmojiReactionAllOf._

case class EmojiReactionAllOf (
  emojiCode: Option[AnyType],
emojiName: Option[AnyType],
reactionType: Option[AnyType],
userId: Option[AnyType],
user: Option[AnyType])

object EmojiReactionAllOf {
  import DateTimeCodecs._

  implicit val EmojiReactionAllOfCodecJson: CodecJson[EmojiReactionAllOf] = CodecJson.derive[EmojiReactionAllOf]
  implicit val EmojiReactionAllOfDecoder: EntityDecoder[EmojiReactionAllOf] = jsonOf[EmojiReactionAllOf]
  implicit val EmojiReactionAllOfEncoder: EntityEncoder[EmojiReactionAllOf] = jsonEncoderOf[EmojiReactionAllOf]
}
