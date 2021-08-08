package org.openapitools.server.model


/**
 * @param result  for example: ''null''
 * @param msg  for example: ''null''
 * @param code  for example: ''null''
*/
final case class RealmDeactivatedError (
  result: AnyType,
  msg: AnyType,
  code: Option[AnyType]
)

