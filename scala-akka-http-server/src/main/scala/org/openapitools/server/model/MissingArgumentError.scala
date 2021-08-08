package org.openapitools.server.model


/**
 * @param result  for example: ''null''
 * @param msg  for example: ''null''
 * @param code  for example: ''null''
 * @param varName It contains the information about the missing parameter.  for example: ''null''
*/
final case class MissingArgumentError (
  result: AnyType,
  msg: AnyType,
  code: Option[AnyType],
  varName: Option[String]
)

