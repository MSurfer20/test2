/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class BadEventQueueIdError (
  result: AnyType,
  msg: AnyType,
  code: Option[AnyType] = None,
  /* The string that identifies the invalid event queue.  */
  queueId: Option[String] = None
) extends ApiModel

