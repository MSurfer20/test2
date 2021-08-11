package model

import play.api.libs.json._

/**
  * Object containing details of a bot. 
  * @param email The email of the bot. 
  * @param botType An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
  * @param isActive A boolean describing whether the user account has been deactivated. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class BotAllOf(
  userId: Option[OasAnyTypeNotMapped],
  fullName: Option[OasAnyTypeNotMapped],
  apiKey: Option[OasAnyTypeNotMapped],
  defaultSendingStream: Option[OasAnyTypeNotMapped],
  defaultEventsRegisterStream: Option[OasAnyTypeNotMapped],
  defaultAllPublicStreams: Option[OasAnyTypeNotMapped],
  avatarUrl: Option[OasAnyTypeNotMapped],
  ownerId: Option[OasAnyTypeNotMapped],
  services: Option[OasAnyTypeNotMapped],
  email: Option[String],
  botType: Option[Int],
  isActive: Option[Boolean]
)

object BotAllOf {
  implicit lazy val botAllOfJsonFormat: Format[BotAllOf] = Json.format[BotAllOf]
}

