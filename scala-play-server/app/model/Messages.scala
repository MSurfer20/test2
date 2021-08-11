package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Messages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class Messages(
  avatarUrl: Option[OasAnyTypeNotMapped],
  client: Option[OasAnyTypeNotMapped],
  content: Option[OasAnyTypeNotMapped],
  contentType: Option[OasAnyTypeNotMapped],
  displayRecipient: Option[OasAnyTypeNotMapped],
  id: Option[OasAnyTypeNotMapped],
  isMeMessage: Option[OasAnyTypeNotMapped],
  reactions: Option[OasAnyTypeNotMapped],
  recipientId: Option[OasAnyTypeNotMapped],
  senderEmail: Option[OasAnyTypeNotMapped],
  senderFullName: Option[OasAnyTypeNotMapped],
  senderId: Option[OasAnyTypeNotMapped],
  senderRealmStr: Option[OasAnyTypeNotMapped],
  streamId: Option[OasAnyTypeNotMapped],
  subject: Option[OasAnyTypeNotMapped],
  topicLinks: Option[OasAnyTypeNotMapped],
  submessages: Option[OasAnyTypeNotMapped],
  timestamp: Option[OasAnyTypeNotMapped],
  `type`: Option[OasAnyTypeNotMapped]
)

object Messages {
  implicit lazy val messagesJsonFormat: Format[Messages] = Json.format[Messages]
}

