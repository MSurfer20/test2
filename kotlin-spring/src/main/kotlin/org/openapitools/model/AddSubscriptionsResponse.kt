package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AddSubscriptionsResponseAllOf
import org.openapitools.model.AnyType
import org.openapitools.model.JsonSuccessBase
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
 * @param subscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
 * @param alreadySubscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
 * @param unauthorized A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
 */
data class AddSubscriptionsResponse(

    @field:Valid
    @field:JsonProperty("result", required = true) val result: AnyType,

    @field:Valid
    @field:JsonProperty("msg", required = true) val msg: AnyType,

    @field:JsonProperty("subscribed") val subscribed: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null,

    @field:JsonProperty("already_subscribed") val alreadySubscribed: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null,

    @field:JsonProperty("unauthorized") val unauthorized: kotlin.collections.List<kotlin.String>? = null
) {

}

