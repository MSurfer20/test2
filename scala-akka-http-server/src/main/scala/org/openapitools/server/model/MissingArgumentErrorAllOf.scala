package org.openapitools.server.model


/**
 * ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
 *
 * @param result  for example: ''null''
 * @param msg  for example: ''null''
 * @param code  for example: ''null''
 * @param varName It contains the information about the missing parameter.  for example: ''null''
*/
final case class MissingArgumentErrorAllOf (
  result: Option[AnyType],
  msg: Option[AnyType],
  code: Option[AnyType],
  varName: Option[String]
)

