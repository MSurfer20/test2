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
 * @param userId 
 * @param fullName 
 * @param apiKey 
 * @param defaultSendingStream 
 * @param defaultEventsRegisterStream 
 * @param defaultAllPublicStreams 
 * @param avatarUrl 
 * @param ownerId 
 * @param services 
 */
data class BasicBotAllOf(

    @field:Valid
    @field:JsonProperty("user_id") val userId: AnyType? = null,

    @field:Valid
    @field:JsonProperty("full_name") val fullName: AnyType? = null,

    @field:Valid
    @field:JsonProperty("api_key") val apiKey: AnyType? = null,

    @field:Valid
    @field:JsonProperty("default_sending_stream") val defaultSendingStream: AnyType? = null,

    @field:Valid
    @field:JsonProperty("default_events_register_stream") val defaultEventsRegisterStream: AnyType? = null,

    @field:Valid
    @field:JsonProperty("default_all_public_streams") val defaultAllPublicStreams: AnyType? = null,

    @field:Valid
    @field:JsonProperty("avatar_url") val avatarUrl: AnyType? = null,

    @field:Valid
    @field:JsonProperty("owner_id") val ownerId: AnyType? = null,

    @field:Valid
    @field:JsonProperty("services") val services: AnyType? = null
) {

}

