package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param dateUnderscoresent Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
 * @param id The unique message ID.  Messages should always be displayed sorted by ID. 
 */
case class AttachmentsMessages(dateUnderscoresent: Option[Int],
                id: Option[Int]
                )

object AttachmentsMessages {
    /**
     * Creates the codec for converting AttachmentsMessages from and to JSON.
     */
    implicit val decoder: Decoder[AttachmentsMessages] = deriveDecoder
    implicit val encoder: ObjectEncoder[AttachmentsMessages] = deriveEncoder
}
