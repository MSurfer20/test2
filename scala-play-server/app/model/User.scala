package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for User.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:23:09.886767Z[Etc/UTC]")
case class User(
  email: Option[OasAnyTypeNotMapped],
  isBot: Option[OasAnyTypeNotMapped],
  avatarUrl: Option[OasAnyTypeNotMapped],
  avatarVersion: Option[OasAnyTypeNotMapped],
  fullName: Option[OasAnyTypeNotMapped],
  isAdmin: Option[OasAnyTypeNotMapped],
  isOwner: Option[OasAnyTypeNotMapped],
  isBillingAdmin: Option[OasAnyTypeNotMapped],
  role: Option[OasAnyTypeNotMapped],
  botType: Option[OasAnyTypeNotMapped],
  userId: Option[OasAnyTypeNotMapped],
  botOwnerId: Option[OasAnyTypeNotMapped],
  isActive: Option[OasAnyTypeNotMapped],
  isGuest: Option[OasAnyTypeNotMapped],
  timezone: Option[OasAnyTypeNotMapped],
  dateJoined: Option[OasAnyTypeNotMapped],
  deliveryEmail: Option[OasAnyTypeNotMapped],
  profileData: Option[OasAnyTypeNotMapped]
)

object User {
  implicit lazy val userJsonFormat: Format[User] = Json.format[User]
}

