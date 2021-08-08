package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EmojiReactionBaseAllOfUser

/**
 * 
 * @param userUnderscoreid The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
 * @param user 
 */
case class EmojiReactionBaseAllOf(userUnderscoreid: Option[Int],
                user: Option[EmojiReactionBaseAllOfUser]
                )

object EmojiReactionBaseAllOf {
    /**
     * Creates the codec for converting EmojiReactionBaseAllOf from and to JSON.
     */
    implicit val decoder: Decoder[EmojiReactionBaseAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[EmojiReactionBaseAllOf] = deriveEncoder
}
