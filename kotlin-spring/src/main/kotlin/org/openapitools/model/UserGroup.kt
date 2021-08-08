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
 * Object containing the user group's attributes. 
 * @param name The name of the user group. 
 * @param description The description of the user group. 
 * @param members Array containing the id of the users who are members of this user group. 
 * @param id The ID of the user group. 
 */
data class UserGroup(

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("description") val description: kotlin.String? = null,

    @field:JsonProperty("members") val members: kotlin.collections.List<kotlin.Int>? = null,

    @field:JsonProperty("id") val id: kotlin.Int? = null
) {

}

