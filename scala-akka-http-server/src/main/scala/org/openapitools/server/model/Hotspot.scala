package org.openapitools.server.model


/**
 * Dictionary containing details of a single hotspot. 
 *
 * @param delay The delay after which the user should be shown the hotspot.  for example: ''null''
 * @param name The name of the hotspot.  for example: ''null''
 * @param title The title of the hotspot, as will be displayed to the user.  for example: ''null''
 * @param description The description of the hotspot, as will be displayed to the user.  for example: ''null''
*/
final case class Hotspot (
  delay: Option[Double],
  name: Option[String],
  title: Option[String],
  description: Option[String]
)

