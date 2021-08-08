package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param emojiUnderscorecode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
 * @param emojiUnderscorename Name of the emoji. 
 * @param reactionUnderscoretype One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
 */
case class EmojiBase(emojiUnderscorecode: Option[String],
                emojiUnderscorename: Option[String],
                reactionUnderscoretype: Option[String]
                )

object EmojiBase {
    /**
     * Creates the codec for converting EmojiBase from and to JSON.
     */
    implicit val decoder: Decoder[EmojiBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[EmojiBase] = deriveEncoder
}
