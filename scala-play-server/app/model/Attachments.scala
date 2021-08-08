package model

import play.api.libs.json._

/**
  * Dictionary containing details of a file uploaded by a user. 
  * @param id The unique ID for the attachment. 
  * @param name Name of the uploaded file. 
  * @param pathId A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
  * @param size Size of the file in bytes. 
  * @param createTime Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
  * @param messages Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:15:24.853051Z[Etc/UTC]")
case class Attachments(
  id: Option[Int],
  name: Option[String],
  pathId: Option[String],
  size: Option[Int],
  createTime: Option[Int],
  messages: Option[List[AttachmentsMessages]]
)

object Attachments {
  implicit lazy val attachmentsJsonFormat: Format[Attachments] = Json.format[Attachments]
}

