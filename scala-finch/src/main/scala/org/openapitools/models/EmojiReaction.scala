package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.EmojiReactionAllOf
import org.openapitools.models.EmojiReactionBase

/**
 * 
 * @param emojiUnderscorecode 
 * @param emojiUnderscorename 
 * @param reactionUnderscoretype 
 * @param userUnderscoreid 
 * @param user 
 */
case class EmojiReaction(emojiUnderscorecode: Option[AnyType],
                emojiUnderscorename: Option[AnyType],
                reactionUnderscoretype: Option[AnyType],
                userUnderscoreid: Option[AnyType],
                user: Option[AnyType]
                )

object EmojiReaction {
    /**
     * Creates the codec for converting EmojiReaction from and to JSON.
     */
    implicit val decoder: Decoder[EmojiReaction] = deriveDecoder
    implicit val encoder: ObjectEncoder[EmojiReaction] = deriveEncoder
}
