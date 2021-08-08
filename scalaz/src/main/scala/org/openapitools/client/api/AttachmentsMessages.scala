package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AttachmentsMessages._

case class AttachmentsMessages (
  /* Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number.  */
  dateSent: Option[Integer],
/* The unique message ID.  Messages should always be displayed sorted by ID.  */
  id: Option[Integer])

object AttachmentsMessages {
  import DateTimeCodecs._

  implicit val AttachmentsMessagesCodecJson: CodecJson[AttachmentsMessages] = CodecJson.derive[AttachmentsMessages]
  implicit val AttachmentsMessagesDecoder: EntityDecoder[AttachmentsMessages] = jsonOf[AttachmentsMessages]
  implicit val AttachmentsMessagesEncoder: EntityEncoder[AttachmentsMessages] = jsonEncoderOf[AttachmentsMessages]
}
