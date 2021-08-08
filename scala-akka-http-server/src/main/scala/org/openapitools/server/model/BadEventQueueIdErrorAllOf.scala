package org.openapitools.server.model


/**
 * @param result  for example: ''null''
 * @param msg  for example: ''null''
 * @param code  for example: ''null''
 * @param queueId The string that identifies the invalid event queue.  for example: ''null''
*/
final case class BadEventQueueIdErrorAllOf (
  result: Option[AnyType],
  msg: Option[AnyType],
  code: Option[AnyType],
  queueId: Option[String]
)

