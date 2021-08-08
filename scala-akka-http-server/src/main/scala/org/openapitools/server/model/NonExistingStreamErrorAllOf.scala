package org.openapitools.server.model


/**
 * @param result  for example: ''null''
 * @param msg  for example: ''null''
 * @param code  for example: ''null''
 * @param stream The name of the stream that could not be found.  for example: ''null''
*/
final case class NonExistingStreamErrorAllOf (
  result: Option[AnyType],
  msg: Option[AnyType],
  code: Option[AnyType],
  stream: Option[String]
)

