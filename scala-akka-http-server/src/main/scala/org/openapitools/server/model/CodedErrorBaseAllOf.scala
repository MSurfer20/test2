package org.openapitools.server.model


/**
 * @param result  for example: ''null''
 * @param msg  for example: ''null''
 * @param code A string that identifies the error.  for example: ''null''
*/
final case class CodedErrorBaseAllOf (
  result: Option[AnyType],
  msg: Option[AnyType],
  code: Option[String]
)

