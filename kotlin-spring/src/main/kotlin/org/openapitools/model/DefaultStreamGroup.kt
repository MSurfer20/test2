package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BasicStream
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Dictionary containing details of a default stream group. 
 * @param name Name of the default stream group. 
 * @param description Description of the default stream group. 
 * @param id id of the default stream group. 
 * @param streams Array containing details about the streams in the default stream group. 
 */
data class DefaultStreamGroup(

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("description") val description: kotlin.String? = null,

    @field:JsonProperty("id") val id: kotlin.Int? = null,

    @field:Valid
    @field:JsonProperty("streams") val streams: kotlin.collections.List<BasicStream>? = null
) {

}

