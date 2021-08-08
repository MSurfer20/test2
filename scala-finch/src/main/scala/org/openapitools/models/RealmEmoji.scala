package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
 * @param id The ID for this emoji, same as the object's key. 
 * @param name The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
 * @param sourceUnderscoreurl The path relative to the organization's URL where the emoji's image can be found. 
 * @param deactivated Whether the emoji has been deactivated or not. 
 * @param authorUnderscoreid The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
 */
case class RealmEmoji(id: Option[String],
                name: Option[String],
                sourceUnderscoreurl: Option[String],
                deactivated: Option[Boolean],
                authorUnderscoreid: Option[Int]
                )

object RealmEmoji {
    /**
     * Creates the codec for converting RealmEmoji from and to JSON.
     */
    implicit val decoder: Decoder[RealmEmoji] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealmEmoji] = deriveEncoder
}
