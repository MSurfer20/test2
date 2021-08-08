package org.openapitools.server.model


/**
 * Object containing the user group's attributes. 
 *
 * @param name The name of the user group.  for example: ''null''
 * @param description The description of the user group.  for example: ''null''
 * @param members Array containing the id of the users who are members of this user group.  for example: ''null''
 * @param id The ID of the user group.  for example: ''null''
*/
final case class UserGroup (
  name: Option[String],
  description: Option[String],
  members: Option[Seq[Int]],
  id: Option[Int]
)

