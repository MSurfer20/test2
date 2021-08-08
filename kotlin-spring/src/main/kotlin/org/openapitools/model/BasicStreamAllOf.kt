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
 * @param streamId 
 * @param name 
 * @param description 
 * @param dateCreated 
 * @param inviteOnly 
 * @param renderedDescription 
 * @param isWebPublic 
 * @param streamPostPolicy 
 * @param messageRetentionDays 
 * @param historyPublicToSubscribers 
 * @param firstMessageId 
 * @param isAnnouncementOnly 
 */
data class BasicStreamAllOf(

    @field:Valid
    @field:JsonProperty("stream_id") val streamId: AnyType? = null,

    @field:Valid
    @field:JsonProperty("name") val name: AnyType? = null,

    @field:Valid
    @field:JsonProperty("description") val description: AnyType? = null,

    @field:Valid
    @field:JsonProperty("date_created") val dateCreated: AnyType? = null,

    @field:Valid
    @field:JsonProperty("invite_only") val inviteOnly: AnyType? = null,

    @field:Valid
    @field:JsonProperty("rendered_description") val renderedDescription: AnyType? = null,

    @field:Valid
    @field:JsonProperty("is_web_public") val isWebPublic: AnyType? = null,

    @field:Valid
    @field:JsonProperty("stream_post_policy") val streamPostPolicy: AnyType? = null,

    @field:Valid
    @field:JsonProperty("message_retention_days") val messageRetentionDays: AnyType? = null,

    @field:Valid
    @field:JsonProperty("history_public_to_subscribers") val historyPublicToSubscribers: AnyType? = null,

    @field:Valid
    @field:JsonProperty("first_message_id") val firstMessageId: AnyType? = null,

    @field:Valid
    @field:JsonProperty("is_announcement_only") val isAnnouncementOnly: AnyType? = null
) {

}

