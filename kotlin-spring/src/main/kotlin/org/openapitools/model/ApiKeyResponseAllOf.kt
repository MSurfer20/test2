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
 * @param apiKey The API key that can be used to authenticate as the requested user. 
 * @param email The email address of the user who owns the API key 
 * @param result 
 * @param msg 
 */
data class ApiKeyResponseAllOf(

    @field:JsonProperty("api_key", required = true) val apiKey: kotlin.String,

    @field:JsonProperty("email", required = true) val email: kotlin.String,

    @field:Valid
    @field:JsonProperty("result") val result: AnyType? = null,

    @field:Valid
    @field:JsonProperty("msg") val msg: AnyType? = null
) {

}

