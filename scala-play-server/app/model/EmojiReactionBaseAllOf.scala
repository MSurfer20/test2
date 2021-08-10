package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EmojiReactionBase_allOf.
  * @param userId The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-10T11:47:30.086135Z[Etc/UTC]")
case class EmojiReactionBaseAllOf(
  userId: Option[Int],
  user: Option[EmojiReactionBaseAllOfUser]
)

object EmojiReactionBaseAllOf {
  implicit lazy val emojiReactionBaseAllOfJsonFormat: Format[EmojiReactionBaseAllOf] = Json.format[EmojiReactionBaseAllOf]
}

