package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AttachmentsMessages
import scala.collection.immutable.Seq

/**
 * Dictionary containing details of a file uploaded by a user. 
 * @param id The unique ID for the attachment. 
 * @param name Name of the uploaded file. 
 * @param pathUnderscoreid A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
 * @param size Size of the file in bytes. 
 * @param createUnderscoretime Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
 * @param messages Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
 */
case class Attachments(id: Option[Int],
                name: Option[String],
                pathUnderscoreid: Option[String],
                size: Option[Int],
                createUnderscoretime: Option[Int],
                messages: Option[Seq[AttachmentsMessages]]
                )

object Attachments {
    /**
     * Creates the codec for converting Attachments from and to JSON.
     */
    implicit val decoder: Decoder[Attachments] = deriveDecoder
    implicit val encoder: ObjectEncoder[Attachments] = deriveEncoder
}
