package model

import play.api.libs.json._

/**
  * Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
  * @param id ID of the user. 
  * @param email Email of the user. 
  * @param fullName Full name of the user. 
  * @param isMirrorDummy Whether the user is a mirror dummy. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:45:49.166589Z[Etc/UTC]")
case class EmojiReactionBaseUser(
  id: Option[Int],
  email: Option[String],
  fullName: Option[String],
  isMirrorDummy: Option[Boolean]
)

object EmojiReactionBaseUser {
  implicit lazy val emojiReactionBaseUserJsonFormat: Format[EmojiReactionBaseUser] = Json.format[EmojiReactionBaseUser]
}

