package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EmojiReactionBaseUser._

case class EmojiReactionBaseUser (
  /* ID of the user.  */
  id: Option[Integer],
/* Email of the user.  */
  email: Option[String],
/* Full name of the user.  */
  fullName: Option[String],
/* Whether the user is a mirror dummy.  */
  isMirrorDummy: Option[Boolean])

object EmojiReactionBaseUser {
  import DateTimeCodecs._

  implicit val EmojiReactionBaseUserCodecJson: CodecJson[EmojiReactionBaseUser] = CodecJson.derive[EmojiReactionBaseUser]
  implicit val EmojiReactionBaseUserDecoder: EntityDecoder[EmojiReactionBaseUser] = jsonOf[EmojiReactionBaseUser]
  implicit val EmojiReactionBaseUserEncoder: EntityEncoder[EmojiReactionBaseUser] = jsonEncoderOf[EmojiReactionBaseUser]
}
