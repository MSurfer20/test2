package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Attachments_messages.
  * @param dateSent Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
  * @param id The unique message ID.  Messages should always be displayed sorted by ID. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-10T11:47:30.086135Z[Etc/UTC]")
case class AttachmentsMessages(
  dateSent: Option[Int],
  id: Option[Int]
)

object AttachmentsMessages {
  implicit lazy val attachmentsMessagesJsonFormat: Format[AttachmentsMessages] = Json.format[AttachmentsMessages]
}

