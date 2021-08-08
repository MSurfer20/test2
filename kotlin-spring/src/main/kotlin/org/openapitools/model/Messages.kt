package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AnyType
import org.openapitools.model.MessagesAllOf
import org.openapitools.model.MessagesBase
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
 * @param avatarUrl 
 * @param client 
 * @param content 
 * @param contentType 
 * @param displayRecipient 
 * @param id 
 * @param isMeMessage 
 * @param reactions 
 * @param recipientId 
 * @param senderEmail 
 * @param senderFullName 
 * @param senderId 
 * @param senderRealmStr 
 * @param streamId 
 * @param subject 
 * @param topicLinks 
 * @param submessages 
 * @param timestamp 
 * @param type 
 */
data class Messages(

    @field:Valid
    @field:JsonProperty("avatar_url") val avatarUrl: AnyType? = null,

    @field:Valid
    @field:JsonProperty("client") val client: AnyType? = null,

    @field:Valid
    @field:JsonProperty("content") val content: AnyType? = null,

    @field:Valid
    @field:JsonProperty("content_type") val contentType: AnyType? = null,

    @field:Valid
    @field:JsonProperty("display_recipient") val displayRecipient: AnyType? = null,

    @field:Valid
    @field:JsonProperty("id") val id: AnyType? = null,

    @field:Valid
    @field:JsonProperty("is_me_message") val isMeMessage: AnyType? = null,

    @field:Valid
    @field:JsonProperty("reactions") val reactions: AnyType? = null,

    @field:Valid
    @field:JsonProperty("recipient_id") val recipientId: AnyType? = null,

    @field:Valid
    @field:JsonProperty("sender_email") val senderEmail: AnyType? = null,

    @field:Valid
    @field:JsonProperty("sender_full_name") val senderFullName: AnyType? = null,

    @field:Valid
    @field:JsonProperty("sender_id") val senderId: AnyType? = null,

    @field:Valid
    @field:JsonProperty("sender_realm_str") val senderRealmStr: AnyType? = null,

    @field:Valid
    @field:JsonProperty("stream_id") val streamId: AnyType? = null,

    @field:Valid
    @field:JsonProperty("subject") val subject: AnyType? = null,

    @field:Valid
    @field:JsonProperty("topic_links") val topicLinks: AnyType? = null,

    @field:Valid
    @field:JsonProperty("submessages") val submessages: AnyType? = null,

    @field:Valid
    @field:JsonProperty("timestamp") val timestamp: AnyType? = null,

    @field:Valid
    @field:JsonProperty("type") val type: AnyType? = null
) {

}

