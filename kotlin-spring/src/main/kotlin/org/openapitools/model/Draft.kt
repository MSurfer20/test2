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
 * A dictionary for representing a message draft. 
 * @param type The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
 * @param to An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
 * @param topic For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
 * @param content The body of the draft. Should not contain null bytes. 
 * @param id The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
 * @param timestamp A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
 */
data class Draft(

    @field:JsonProperty("type", required = true) val type: Draft.Type,

    @field:JsonProperty("to", required = true) val to: kotlin.collections.List<kotlin.Int>,

    @field:JsonProperty("topic", required = true) val topic: kotlin.String,

    @field:JsonProperty("content", required = true) val content: kotlin.String,

    @field:JsonProperty("id") val id: kotlin.Int? = null,

    @field:JsonProperty("timestamp") val timestamp: java.math.BigDecimal? = null
) {

    /**
    * The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
    * Values: eMPTY,stream,`private`
    */
    enum class Type(val value: kotlin.String) {
    
        @JsonProperty("") eMPTY(""),
    
        @JsonProperty("stream") stream("stream"),
    
        @JsonProperty("private") `private`("private");
    
    }

}

