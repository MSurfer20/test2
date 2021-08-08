package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType

/**
 * 
 * @param emojiUnderscorecode 
 * @param emojiUnderscorename 
 * @param reactionUnderscoretype 
 * @param userUnderscoreid 
 * @param user 
 */
case class EmojiReactionAllOf(emojiUnderscorecode: Option[AnyType],
                emojiUnderscorename: Option[AnyType],
                reactionUnderscoretype: Option[AnyType],
                userUnderscoreid: Option[AnyType],
                user: Option[AnyType]
                )

object EmojiReactionAllOf {
    /**
     * Creates the codec for converting EmojiReactionAllOf from and to JSON.
     */
    implicit val decoder: Decoder[EmojiReactionAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[EmojiReactionAllOf] = deriveEncoder
}
