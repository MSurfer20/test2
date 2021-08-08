
package org.openapitools.client.model


case class RealmEmoji (
    /* The ID for this emoji, same as the object's key.  */
    _id: Option[String],
    /* The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`).  */
    _name: Option[String],
    /* The path relative to the organization's URL where the emoji's image can be found.  */
    _sourceUrl: Option[String],
    /* Whether the emoji has been deactivated or not.  */
    _deactivated: Option[Boolean],
    /* The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field.  */
    _authorId: Option[Integer]
)
object RealmEmoji {
    def toStringBody(var_id: Object, var_name: Object, var_sourceUrl: Object, var_deactivated: Object, var_authorId: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"sourceUrl":$var_sourceUrl,"deactivated":$var_deactivated,"authorId":$var_authorId
        | }
        """.stripMargin
}
