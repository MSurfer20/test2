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

case class DefaultStreamGroup(
  /* Name of the default stream group.  */
  name: Option[String],

  /* Description of the default stream group.  */
  description: Option[String],

  /* id of the default stream group.  */
  id: Option[Int],

  /* Array containing details about the streams in the default stream group.  */
  streams: Option[List[BasicStream]]

 )
