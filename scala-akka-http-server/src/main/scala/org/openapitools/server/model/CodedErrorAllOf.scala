package org.openapitools.server.model


/**
 * @param result  for example: ''null''
 * @param msg  for example: ''null''
 * @param code  for example: ''null''
*/
final case class CodedErrorAllOf (
  result: Option[AnyType],
  msg: Option[AnyType],
  code: Option[AnyType]
)

