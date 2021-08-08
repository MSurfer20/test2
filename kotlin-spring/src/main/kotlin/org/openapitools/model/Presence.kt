package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * `{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. 
 * @param client The client's platform name. 
 * @param status The status of the user on this client. It is either `idle` or `active`. 
 * @param timestamp The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
 * @param pushable Whether the client is capable of showing mobile/push notifications to the user. 
 */
data class Presence(

    @field:JsonProperty("client") val client: kotlin.String? = null,

    @field:JsonProperty("status") val status: Presence.Status? = null,

    @field:JsonProperty("timestamp") val timestamp: kotlin.Int? = null,

    @field:JsonProperty("pushable") val pushable: kotlin.Boolean? = null
) {

    /**
    * The status of the user on this client. It is either `idle` or `active`. 
    * Values: idle,active
    */
    enum class Status(val value: kotlin.String) {
    
        @JsonProperty("idle") idle("idle"),
    
        @JsonProperty("active") active("active");
    
    }

}

