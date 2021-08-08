package org.openapitools.server.model


/**
 * Dictionary containing details of a default stream group. 
 *
 * @param name Name of the default stream group.  for example: ''null''
 * @param description Description of the default stream group.  for example: ''null''
 * @param id id of the default stream group.  for example: ''null''
 * @param streams Array containing details about the streams in the default stream group.  for example: ''null''
*/
final case class DefaultStreamGroup (
  name: Option[String],
  description: Option[String],
  id: Option[Int],
  streams: Option[Seq[BasicStream]]
)

