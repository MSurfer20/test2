package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BasicStream_allOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-10T11:47:30.086135Z[Etc/UTC]")
case class BasicStreamAllOf(
  streamId: Option[OasAnyTypeNotMapped],
  name: Option[OasAnyTypeNotMapped],
  description: Option[OasAnyTypeNotMapped],
  dateCreated: Option[OasAnyTypeNotMapped],
  inviteOnly: Option[OasAnyTypeNotMapped],
  renderedDescription: Option[OasAnyTypeNotMapped],
  isWebPublic: Option[OasAnyTypeNotMapped],
  streamPostPolicy: Option[OasAnyTypeNotMapped],
  messageRetentionDays: Option[OasAnyTypeNotMapped],
  historyPublicToSubscribers: Option[OasAnyTypeNotMapped],
  firstMessageId: Option[OasAnyTypeNotMapped],
  isAnnouncementOnly: Option[OasAnyTypeNotMapped]
)

object BasicStreamAllOf {
  implicit lazy val basicStreamAllOfJsonFormat: Format[BasicStreamAllOf] = Json.format[BasicStreamAllOf]
}

