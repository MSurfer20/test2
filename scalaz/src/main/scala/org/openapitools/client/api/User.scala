package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import User._

case class User (
  email: Option[AnyType],
isBot: Option[AnyType],
avatarUrl: Option[AnyType],
avatarVersion: Option[AnyType],
fullName: Option[AnyType],
isAdmin: Option[AnyType],
isOwner: Option[AnyType],
isBillingAdmin: Option[AnyType],
role: Option[AnyType],
botType: Option[AnyType],
userId: Option[AnyType],
botOwnerId: Option[AnyType],
isActive: Option[AnyType],
isGuest: Option[AnyType],
timezone: Option[AnyType],
dateJoined: Option[AnyType],
deliveryEmail: Option[AnyType],
profileData: Option[AnyType])

object User {
  import DateTimeCodecs._

  implicit val UserCodecJson: CodecJson[User] = CodecJson.derive[User]
  implicit val UserDecoder: EntityDecoder[User] = jsonOf[User]
  implicit val UserEncoder: EntityEncoder[User] = jsonEncoderOf[User]
}
