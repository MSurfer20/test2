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
 * @param result 
 * @param msg 
 * @param code 
 * @param queueId The string that identifies the invalid event queue. 
 */
data class BadEventQueueIdErrorAllOf(

    @field:Valid
    @field:JsonProperty("result") val result: AnyType? = null,

    @field:Valid
    @field:JsonProperty("msg") val msg: AnyType? = null,

    @field:Valid
    @field:JsonProperty("code") val code: AnyType? = null,

    @field:JsonProperty("queue_id") val queueId: kotlin.String? = null
) {

}

