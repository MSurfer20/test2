package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EmojiReactionBaseUser

/**
 * 
 * @param emojiUnderscorecode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint. 
 * @param emojiUnderscorename Name of the emoji. 
 * @param reactionUnderscoretype One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
 * @param userUnderscoreid The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
 * @param user 
 */
case class EmojiReactionBase(emojiUnderscorecode: Option[String],
                emojiUnderscorename: Option[String],
                reactionUnderscoretype: Option[String],
                userUnderscoreid: Option[Int],
                user: Option[EmojiReactionBaseUser]
                )

object EmojiReactionBase {
    /**
     * Creates the codec for converting EmojiReactionBase from and to JSON.
     */
    implicit val decoder: Decoder[EmojiReactionBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[EmojiReactionBase] = deriveEncoder
}
