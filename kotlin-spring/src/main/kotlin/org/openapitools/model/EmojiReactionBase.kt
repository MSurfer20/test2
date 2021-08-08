package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.EmojiBase
import org.openapitools.model.EmojiReactionBaseAllOf
import org.openapitools.model.EmojiReactionBaseAllOfUser
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
 * @param emojiName Name of the emoji. 
 * @param reactionType One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
 * @param userId The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
 * @param user 
 */
data class EmojiReactionBase(

    @field:JsonProperty("emoji_code") val emojiCode: kotlin.String? = null,

    @field:JsonProperty("emoji_name") val emojiName: kotlin.String? = null,

    @field:JsonProperty("reaction_type") val reactionType: kotlin.String? = null,

    @field:JsonProperty("user_id") val userId: kotlin.Int? = null,

    @field:Valid
    @Deprecated(message = "")
    @field:JsonProperty("user") val user: EmojiReactionBaseAllOfUser? = null
) {

}

