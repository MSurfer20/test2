package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EmojiBase._

case class EmojiBase (
  /* A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji.  */
  emojiCode: Option[String],
/* Name of the emoji.  */
  emojiName: Option[String],
/* One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.  */
  reactionType: Option[String])

object EmojiBase {
  import DateTimeCodecs._

  implicit val EmojiBaseCodecJson: CodecJson[EmojiBase] = CodecJson.derive[EmojiBase]
  implicit val EmojiBaseDecoder: EntityDecoder[EmojiBase] = jsonOf[EmojiBase]
  implicit val EmojiBaseEncoder: EntityEncoder[EmojiBase] = jsonEncoderOf[EmojiBase]
}
