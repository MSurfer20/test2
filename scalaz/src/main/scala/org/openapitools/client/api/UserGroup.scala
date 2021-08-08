package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserGroup._

case class UserGroup (
  /* The name of the user group.  */
  name: Option[String],
/* The description of the user group.  */
  description: Option[String],
/* Array containing the id of the users who are members of this user group.  */
  members: Option[List[Integer]],
/* The ID of the user group.  */
  id: Option[Integer])

object UserGroup {
  import DateTimeCodecs._

  implicit val UserGroupCodecJson: CodecJson[UserGroup] = CodecJson.derive[UserGroup]
  implicit val UserGroupDecoder: EntityDecoder[UserGroup] = jsonOf[UserGroup]
  implicit val UserGroupEncoder: EntityEncoder[UserGroup] = jsonEncoderOf[UserGroup]
}
