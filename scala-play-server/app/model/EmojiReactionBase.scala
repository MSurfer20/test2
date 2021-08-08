package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EmojiReactionBase.
  * @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint. 
  * @param emojiName Name of the emoji. 
  * @param reactionType One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
  * @param userId The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:45:49.166589Z[Etc/UTC]")
case class EmojiReactionBase(
  emojiCode: Option[String],
  emojiName: Option[String],
  reactionType: Option[String],
  userId: Option[Int],
  user: Option[EmojiReactionBaseUser]
)

object EmojiReactionBase {
  implicit lazy val emojiReactionBaseJsonFormat: Format[EmojiReactionBase] = Json.format[EmojiReactionBase]
}

