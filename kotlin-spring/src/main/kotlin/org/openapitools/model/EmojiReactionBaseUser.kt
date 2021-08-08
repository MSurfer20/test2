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
 * Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
 * @param id ID of the user. 
 * @param email Email of the user. 
 * @param fullName Full name of the user. 
 * @param isMirrorDummy Whether the user is a mirror dummy. 
 */
data class EmojiReactionBaseUser(

    @field:JsonProperty("id") val id: kotlin.Int? = null,

    @field:JsonProperty("email") val email: kotlin.String? = null,

    @field:JsonProperty("full_name") val fullName: kotlin.String? = null,

    @field:JsonProperty("is_mirror_dummy") val isMirrorDummy: kotlin.Boolean? = null
) {

}

