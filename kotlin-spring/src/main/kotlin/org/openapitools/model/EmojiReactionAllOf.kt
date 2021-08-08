package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AnyType
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
 * @param emojiCode 
 * @param emojiName 
 * @param reactionType 
 * @param userId 
 * @param user 
 */
data class EmojiReactionAllOf(

    @field:Valid
    @field:JsonProperty("emoji_code") val emojiCode: AnyType? = null,

    @field:Valid
    @field:JsonProperty("emoji_name") val emojiName: AnyType? = null,

    @field:Valid
    @field:JsonProperty("reaction_type") val reactionType: AnyType? = null,

    @field:Valid
    @field:JsonProperty("user_id") val userId: AnyType? = null,

    @field:Valid
    @field:JsonProperty("user") val user: AnyType? = null
) {

}

