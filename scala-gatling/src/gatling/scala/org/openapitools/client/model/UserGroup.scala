
package org.openapitools.client.model


case class UserGroup (
    /* The name of the user group.  */
    _name: Option[String],
    /* The description of the user group.  */
    _description: Option[String],
    /* Array containing the id of the users who are members of this user group.  */
    _members: Option[List[Integer]],
    /* The ID of the user group.  */
    _id: Option[Integer]
)
object UserGroup {
    def toStringBody(var_name: Object, var_description: Object, var_members: Object, var_id: Object) =
        s"""
        | {
        | "name":$var_name,"description":$var_description,"members":$var_members,"id":$var_id
        | }
        """.stripMargin
}
