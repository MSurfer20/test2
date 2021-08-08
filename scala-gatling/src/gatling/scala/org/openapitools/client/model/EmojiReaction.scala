
package org.openapitools.client.model


case class EmojiReaction (
    _emojiCode: Option[AnyType],
    _emojiName: Option[AnyType],
    _reactionType: Option[AnyType],
    _userId: Option[AnyType],
    _user: Option[AnyType]
)
object EmojiReaction {
    def toStringBody(var_emojiCode: Object, var_emojiName: Object, var_reactionType: Object, var_userId: Object, var_user: Object) =
        s"""
        | {
        | "emojiCode":$var_emojiCode,"emojiName":$var_emojiName,"reactionType":$var_reactionType,"userId":$var_userId,"user":$var_user
        | }
        """.stripMargin
}
