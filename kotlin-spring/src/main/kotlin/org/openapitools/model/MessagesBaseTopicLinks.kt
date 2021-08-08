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
 * 
 * @param text The original link text present in the topic. 
 * @param url The expanded target url which the link points to. 
 */
data class MessagesBaseTopicLinks(

    @field:JsonProperty("text") val text: kotlin.String? = null,

    @field:JsonProperty("url") val url: kotlin.String? = null
) {

}

