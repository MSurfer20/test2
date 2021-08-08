package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
 * @param id The ID for this emoji, same as the object's key. 
 * @param name The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
 * @param sourceUrl The path relative to the organization's URL where the emoji's image can be found. 
 * @param deactivated Whether the emoji has been deactivated or not. 
 * @param authorId The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
 */
data class RealmEmoji(

    @field:JsonProperty("id") val id: kotlin.String? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("source_url") val sourceUrl: kotlin.String? = null,

    @field:JsonProperty("deactivated") val deactivated: kotlin.Boolean? = null,

    @field:JsonProperty("author_id") val authorId: kotlin.Int? = null
) {

}

