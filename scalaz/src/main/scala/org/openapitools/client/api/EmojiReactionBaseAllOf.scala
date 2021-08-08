package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EmojiReactionBaseAllOf._

case class EmojiReactionBaseAllOf (
  /* The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.  */
  userId: Option[Integer],
user: Option[EmojiReactionBaseAllOfUser])

object EmojiReactionBaseAllOf {
  import DateTimeCodecs._

  implicit val EmojiReactionBaseAllOfCodecJson: CodecJson[EmojiReactionBaseAllOf] = CodecJson.derive[EmojiReactionBaseAllOf]
  implicit val EmojiReactionBaseAllOfDecoder: EntityDecoder[EmojiReactionBaseAllOf] = jsonOf[EmojiReactionBaseAllOf]
  implicit val EmojiReactionBaseAllOfEncoder: EntityEncoder[EmojiReactionBaseAllOf] = jsonEncoderOf[EmojiReactionBaseAllOf]
}
