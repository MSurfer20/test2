package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EmojiReactionBase._

case class EmojiReactionBase (
  /* A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint.  */
  emojiCode: Option[String],
/* Name of the emoji.  */
  emojiName: Option[String],
/* One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.  */
  reactionType: Option[String],
/* The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.  */
  userId: Option[Integer],
user: Option[EmojiReactionBaseUser])

object EmojiReactionBase {
  import DateTimeCodecs._

  implicit val EmojiReactionBaseCodecJson: CodecJson[EmojiReactionBase] = CodecJson.derive[EmojiReactionBase]
  implicit val EmojiReactionBaseDecoder: EntityDecoder[EmojiReactionBase] = jsonOf[EmojiReactionBase]
  implicit val EmojiReactionBaseEncoder: EntityEncoder[EmojiReactionBase] = jsonEncoderOf[EmojiReactionBase]
}
