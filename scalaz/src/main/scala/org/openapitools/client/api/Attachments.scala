package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Attachments._

case class Attachments (
  /* The unique ID for the attachment.  */
  id: Option[Integer],
/* Name of the uploaded file.  */
  name: Option[String],
/* A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`.  */
  pathId: Option[String],
/* Size of the file in bytes.  */
  size: Option[Integer],
/* Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number.  */
  createTime: Option[Integer],
/* Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file.  */
  messages: Option[List[AttachmentsMessages]])

object Attachments {
  import DateTimeCodecs._

  implicit val AttachmentsCodecJson: CodecJson[Attachments] = CodecJson.derive[Attachments]
  implicit val AttachmentsDecoder: EntityDecoder[Attachments] = jsonOf[Attachments]
  implicit val AttachmentsEncoder: EntityEncoder[Attachments] = jsonEncoderOf[Attachments]
}
