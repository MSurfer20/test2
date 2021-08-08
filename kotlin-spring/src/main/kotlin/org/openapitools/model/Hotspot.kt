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
 * Dictionary containing details of a single hotspot. 
 * @param delay The delay after which the user should be shown the hotspot. 
 * @param name The name of the hotspot. 
 * @param title The title of the hotspot, as will be displayed to the user. 
 * @param description The description of the hotspot, as will be displayed to the user. 
 */
data class Hotspot(

    @field:JsonProperty("delay") val delay: java.math.BigDecimal? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("title") val title: kotlin.String? = null,

    @field:JsonProperty("description") val description: kotlin.String? = null
) {

}

