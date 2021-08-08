package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EmojiReactionBaseAllOfUser._

case class EmojiReactionBaseAllOfUser (
  /* ID of the user.  */
  id: Option[Integer],
/* Email of the user.  */
  email: Option[String],
/* Full name of the user.  */
  fullName: Option[String],
/* Whether the user is a mirror dummy.  */
  isMirrorDummy: Option[Boolean])

object EmojiReactionBaseAllOfUser {
  import DateTimeCodecs._

  implicit val EmojiReactionBaseAllOfUserCodecJson: CodecJson[EmojiReactionBaseAllOfUser] = CodecJson.derive[EmojiReactionBaseAllOfUser]
  implicit val EmojiReactionBaseAllOfUserDecoder: EntityDecoder[EmojiReactionBaseAllOfUser] = jsonOf[EmojiReactionBaseAllOfUser]
  implicit val EmojiReactionBaseAllOfUserEncoder: EntityEncoder[EmojiReactionBaseAllOfUser] = jsonEncoderOf[EmojiReactionBaseAllOfUser]
}
