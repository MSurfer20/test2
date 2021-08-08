package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for User_allOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:45:49.166589Z[Etc/UTC]")
case class UserAllOf(
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

object UserAllOf {
  implicit lazy val userAllOfJsonFormat: Format[UserAllOf] = Json.format[UserAllOf]
}

