package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EmojiReaction_allOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:23:09.886767Z[Etc/UTC]")
case class EmojiReactionAllOf(
  emojiCode: Option[OasAnyTypeNotMapped],
  emojiName: Option[OasAnyTypeNotMapped],
  reactionType: Option[OasAnyTypeNotMapped],
  userId: Option[OasAnyTypeNotMapped],
  user: Option[OasAnyTypeNotMapped]
)

object EmojiReactionAllOf {
  implicit lazy val emojiReactionAllOfJsonFormat: Format[EmojiReactionAllOf] = Json.format[EmojiReactionAllOf]
}

