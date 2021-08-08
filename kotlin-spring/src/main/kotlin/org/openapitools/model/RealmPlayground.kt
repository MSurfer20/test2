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
 * Object containing details about a realm playground. 
 * @param id The unique ID for the realm playground. 
 * @param name The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
 * @param pygmentsLanguage The name of the Pygments language lexer for that programming language. 
 * @param urlPrefix The url prefix for the playground. 
 */
data class RealmPlayground(

    @field:JsonProperty("id") val id: kotlin.Int? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("pygments_language") val pygmentsLanguage: kotlin.String? = null,

    @field:JsonProperty("url_prefix") val urlPrefix: kotlin.String? = null
) {

}

