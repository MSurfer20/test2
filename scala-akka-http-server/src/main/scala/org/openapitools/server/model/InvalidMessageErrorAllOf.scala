package org.openapitools.server.model


/**
 * @param result  for example: ''null''
 * @param msg  for example: ''null''
 * @param rawContent The raw content of the message.  for example: ''null''
*/
final case class InvalidMessageErrorAllOf (
  result: Option[AnyType],
  msg: Option[AnyType],
  rawContent: Option[String]
)

