package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Messages_allOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-10T11:47:30.086135Z[Etc/UTC]")
case class MessagesAllOf(
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

object MessagesAllOf {
  implicit lazy val messagesAllOfJsonFormat: Format[MessagesAllOf] = Json.format[MessagesAllOf]
}

