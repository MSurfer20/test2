package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AnyType
import org.openapitools.model.CodedErrorBase
import org.openapitools.model.NonExistingStreamErrorAllOf
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
 * @param result 
 * @param msg 
 * @param code 
 * @param stream The name of the stream that could not be found. 
 */
data class NonExistingStreamError(

    @field:Valid
    @field:JsonProperty("result", required = true) val result: AnyType,

    @field:Valid
    @field:JsonProperty("msg", required = true) val msg: AnyType,

    @field:Valid
    @field:JsonProperty("code") val code: AnyType? = null,

    @field:JsonProperty("stream") val stream: kotlin.String? = null
) {

}

