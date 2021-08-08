package org.openapitools.server.model


/**
 * @param dateSent Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number.  for example: ''null''
 * @param id The unique message ID.  Messages should always be displayed sorted by ID.  for example: ''null''
*/
final case class AttachmentsMessages (
  dateSent: Option[Int],
  id: Option[Int]
)

