package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param userId The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
 * @param user 
 */
data class EmojiReactionBaseAllOf(

    @field:JsonProperty("user_id") val userId: kotlin.Int? = null,

    @field:Valid
    @Deprecated(message = "")
    @field:JsonProperty("user") val user: EmojiReactionBaseAllOfUser? = null
) {

}

