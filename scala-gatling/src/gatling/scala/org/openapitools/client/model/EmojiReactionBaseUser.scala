
package org.openapitools.client.model


case class EmojiReactionBaseUser (
    /* ID of the user.  */
    _id: Option[Integer],
    /* Email of the user.  */
    _email: Option[String],
    /* Full name of the user.  */
    _fullName: Option[String],
    /* Whether the user is a mirror dummy.  */
    _isMirrorDummy: Option[Boolean]
)
object EmojiReactionBaseUser {
    def toStringBody(var_id: Object, var_email: Object, var_fullName: Object, var_isMirrorDummy: Object) =
        s"""
        | {
        | "id":$var_id,"email":$var_email,"fullName":$var_fullName,"isMirrorDummy":$var_isMirrorDummy
        | }
        """.stripMargin
}
