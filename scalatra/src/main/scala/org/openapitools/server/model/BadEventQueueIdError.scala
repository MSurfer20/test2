/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class BadEventQueueIdError(
  result: AnyType,

  msg: AnyType,

  code: Option[AnyType],

  /* The string that identifies the invalid event queue.  */
  queueId: Option[String]

 )
