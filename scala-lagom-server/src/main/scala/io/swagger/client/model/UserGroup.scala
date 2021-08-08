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

package io.swagger.client.model
import play.api.libs.json._

case class UserGroup (
            /* The name of the user group.  */
                  name: Option[String],
            /* The description of the user group.  */
                  description: Option[String],
            /* Array containing the id of the users who are members of this user group.  */
                  members: Option[Seq[Int]],
            /* The ID of the user group.  */
                  id: Option[Int]
)

object UserGroup {
implicit val format: Format[UserGroup] = Json.format
}

