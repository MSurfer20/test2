package model

import play.api.libs.json._

/**
  * Object containing the user group's attributes. 
  * @param name The name of the user group. 
  * @param description The description of the user group. 
  * @param members Array containing the id of the users who are members of this user group. 
  * @param id The ID of the user group. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class UserGroup(
  name: Option[String],
  description: Option[String],
  members: Option[List[Int]],
  id: Option[Int]
)

object UserGroup {
  implicit lazy val userGroupJsonFormat: Format[UserGroup] = Json.format[UserGroup]
}

