package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GetMessages.
  * @param flags The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
  * @param lastEditTimestamp The UNIX timestamp for when the message was last edited, in UTC seconds. 
  * @param matchContent Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
  * @param matchSubject Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:15:24.853051Z[Etc/UTC]")
case class GetMessages(
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
  `type`: Option[OasAnyTypeNotMapped],
  flags: Option[List[String]],
  lastEditTimestamp: Option[Int],
  matchContent: Option[String],
  matchSubject: Option[String]
)

object GetMessages {
  implicit lazy val getMessagesJsonFormat: Format[GetMessages] = Json.format[GetMessages]
}

