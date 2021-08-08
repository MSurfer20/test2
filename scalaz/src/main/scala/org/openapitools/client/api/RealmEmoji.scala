package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealmEmoji._

case class RealmEmoji (
  /* The ID for this emoji, same as the object's key.  */
  id: Option[String],
/* The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`).  */
  name: Option[String],
/* The path relative to the organization's URL where the emoji's image can be found.  */
  sourceUrl: Option[String],
/* Whether the emoji has been deactivated or not.  */
  deactivated: Option[Boolean],
/* The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field.  */
  authorId: Option[Integer])

object RealmEmoji {
  import DateTimeCodecs._

  implicit val RealmEmojiCodecJson: CodecJson[RealmEmoji] = CodecJson.derive[RealmEmoji]
  implicit val RealmEmojiDecoder: EntityDecoder[RealmEmoji] = jsonOf[RealmEmoji]
  implicit val RealmEmojiEncoder: EntityEncoder[RealmEmoji] = jsonEncoderOf[RealmEmoji]
}
