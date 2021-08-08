package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EmojiReaction.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:15:31.623147Z[Etc/UTC]")
case class EmojiReaction(
  emojiCode: Option[OasAnyTypeNotMapped],
  emojiName: Option[OasAnyTypeNotMapped],
  reactionType: Option[OasAnyTypeNotMapped],
  userId: Option[OasAnyTypeNotMapped],
  user: Option[OasAnyTypeNotMapped]
)

object EmojiReaction {
  implicit lazy val emojiReactionJsonFormat: Format[EmojiReaction] = Json.format[EmojiReaction]
}

