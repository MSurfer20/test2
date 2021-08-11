package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BasicBot_allOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class BasicBotAllOf(
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

object BasicBotAllOf {
  implicit lazy val basicBotAllOfJsonFormat: Format[BasicBotAllOf] = Json.format[BasicBotAllOf]
}

