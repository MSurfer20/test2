package model

import play.api.libs.json._

/**
  * `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
  * @param id The ID for this emoji, same as the object's key. 
  * @param name The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
  * @param sourceUrl The path relative to the organization's URL where the emoji's image can be found. 
  * @param deactivated Whether the emoji has been deactivated or not. 
  * @param authorId The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:23:09.886767Z[Etc/UTC]")
case class RealmEmoji(
  id: Option[String],
  name: Option[String],
  sourceUrl: Option[String],
  deactivated: Option[Boolean],
  authorId: Option[Int]
)

object RealmEmoji {
  implicit lazy val realmEmojiJsonFormat: Format[RealmEmoji] = Json.format[RealmEmoji]
}

