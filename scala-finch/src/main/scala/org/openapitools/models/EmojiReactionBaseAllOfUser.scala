package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
 * @param id ID of the user. 
 * @param email Email of the user. 
 * @param fullUnderscorename Full name of the user. 
 * @param isUnderscoremirrorUnderscoredummy Whether the user is a mirror dummy. 
 */
case class EmojiReactionBaseAllOfUser(id: Option[Int],
                email: Option[String],
                fullUnderscorename: Option[String],
                isUnderscoremirrorUnderscoredummy: Option[Boolean]
                )

object EmojiReactionBaseAllOfUser {
    /**
     * Creates the codec for converting EmojiReactionBaseAllOfUser from and to JSON.
     */
    implicit val decoder: Decoder[EmojiReactionBaseAllOfUser] = deriveDecoder
    implicit val encoder: ObjectEncoder[EmojiReactionBaseAllOfUser] = deriveEncoder
}
