package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OneOfLessThanObjectCommaObjectGreaterThan
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
 * @param userId The user id of the bot. 
 * @param fullName The full name of the bot. 
 * @param apiKey The API key of the bot which it uses to make API requests. 
 * @param defaultSendingStream The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
 * @param defaultEventsRegisterStream The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
 * @param defaultAllPublicStreams Whether the bot can send messages to all streams by default. 
 * @param avatarUrl The URL of the bot's avatar. 
 * @param ownerId The user id of the bot's owner.  Null if the bot has no owner. 
 * @param services The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
 */
data class BasicBotBase(

    @field:JsonProperty("user_id") val userId: kotlin.Int? = null,

    @field:JsonProperty("full_name") val fullName: kotlin.String? = null,

    @field:JsonProperty("api_key") val apiKey: kotlin.String? = null,

    @field:JsonProperty("default_sending_stream") val defaultSendingStream: kotlin.String? = null,

    @field:JsonProperty("default_events_register_stream") val defaultEventsRegisterStream: kotlin.String? = null,

    @field:JsonProperty("default_all_public_streams") val defaultAllPublicStreams: kotlin.Boolean? = null,

    @field:JsonProperty("avatar_url") val avatarUrl: kotlin.String? = null,

    @field:JsonProperty("owner_id") val ownerId: kotlin.Int? = null,

    @field:Valid
    @field:JsonProperty("services") val services: kotlin.collections.List<OneOfLessThanObjectCommaObjectGreaterThan>? = null
) {

}

