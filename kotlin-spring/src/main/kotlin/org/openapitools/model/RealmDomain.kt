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
 * Object containing details of the newly added domain. 
 * @param domain The new allowed domain. 
 * @param allowSubdomains Whether subdomains are allowed for this domain. 
 */
data class RealmDomain(

    @field:JsonProperty("domain") val domain: kotlin.String? = null,

    @field:JsonProperty("allow_subdomains") val allowSubdomains: kotlin.Boolean? = null
) {

}

