package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EmojiReaction_allOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-10T11:47:30.086135Z[Etc/UTC]")
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

