package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BasicBot.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class BasicBot(
  userId: Option[OasAnyTypeNotMapped],
  fullName: Option[OasAnyTypeNotMapped],
  apiKey: Option[OasAnyTypeNotMapped],
  defaultSendingStream: Option[OasAnyTypeNotMapped],
  defaultEventsRegisterStream: Option[OasAnyTypeNotMapped],
  defaultAllPublicStreams: Option[OasAnyTypeNotMapped],
  avatarUrl: Option[OasAnyTypeNotMapped],
  ownerId: Option[OasAnyTypeNotMapped],
  services: Option[OasAnyTypeNotMapped]
)

object BasicBot {
  implicit lazy val basicBotJsonFormat: Format[BasicBot] = Json.format[BasicBot]
}

