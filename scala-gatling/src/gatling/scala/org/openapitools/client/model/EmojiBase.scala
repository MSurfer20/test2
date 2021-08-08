
package org.openapitools.client.model


case class EmojiBase (
    /* A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji.  */
    _emojiCode: Option[String],
    /* Name of the emoji.  */
    _emojiName: Option[String],
    /* One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.  */
    _reactionType: Option[String]
)
object EmojiBase {
    def toStringBody(var_emojiCode: Object, var_emojiName: Object, var_reactionType: Object) =
        s"""
        | {
        | "emojiCode":$var_emojiCode,"emojiName":$var_emojiName,"reactionType":$var_reactionType
        | }
        """.stripMargin
}
