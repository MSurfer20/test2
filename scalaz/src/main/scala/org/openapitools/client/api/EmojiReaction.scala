package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EmojiReaction._

case class EmojiReaction (
  emojiCode: Option[AnyType],
emojiName: Option[AnyType],
reactionType: Option[AnyType],
userId: Option[AnyType],
user: Option[AnyType])

object EmojiReaction {
  import DateTimeCodecs._

  implicit val EmojiReactionCodecJson: CodecJson[EmojiReaction] = CodecJson.derive[EmojiReaction]
  implicit val EmojiReactionDecoder: EntityDecoder[EmojiReaction] = jsonOf[EmojiReaction]
  implicit val EmojiReactionEncoder: EntityEncoder[EmojiReaction] = jsonEncoderOf[EmojiReaction]
}
