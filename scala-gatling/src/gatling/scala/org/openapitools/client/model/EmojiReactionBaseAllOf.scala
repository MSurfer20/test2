
package org.openapitools.client.model


case class EmojiReactionBaseAllOf (
    /* The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.  */
    _userId: Option[Integer],
    _user: Option[EmojiReactionBaseAllOfUser]
)
object EmojiReactionBaseAllOf {
    def toStringBody(var_userId: Object, var_user: Object) =
        s"""
        | {
        | "userId":$var_userId,"user":$var_user
        | }
        """.stripMargin
}
