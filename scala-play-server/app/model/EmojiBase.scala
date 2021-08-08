package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EmojiBase.
  * @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
  * @param emojiName Name of the emoji. 
  * @param reactionType One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:23:09.886767Z[Etc/UTC]")
case class EmojiBase(
  emojiCode: Option[String],
  emojiName: Option[String],
  reactionType: Option[String]
)

object EmojiBase {
  implicit lazy val emojiBaseJsonFormat: Format[EmojiBase] = Json.format[EmojiBase]
}

