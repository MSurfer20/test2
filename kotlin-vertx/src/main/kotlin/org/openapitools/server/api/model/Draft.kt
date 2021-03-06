/**
* Zulip REST API
* Powerful open source group chat 
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.api.model


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * A dictionary for representing a message draft. 
 * @param type The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
 * @param to An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
 * @param topic For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
 * @param content The body of the draft. Should not contain null bytes. 
 * @param id The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
 * @param timestamp A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Draft (
    /* The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages).  */
    @SerializedName("type") private val _type: Draft.Type?,
    /* An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array.  */
    @SerializedName("to") private val _to: kotlin.Array<kotlin.Int>?,
    /* For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes.  */
    @SerializedName("topic") private val _topic: kotlin.String?,
    /* The body of the draft. Should not contain null bytes.  */
    @SerializedName("content") private val _content: kotlin.String?,
    /* The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited.  */
    val id: kotlin.Int? = null,
    /* A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server.  */
    val timestamp: java.math.BigDecimal? = null
) {

    /**
    * The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
    * Values: eMPTY,stream,`private`
    */
    enum class Type(val value: kotlin.String){
    
        eMPTY(""),
    
        stream("stream"),
    
        `private`("private");
    
    }

        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
        val to get() = _to ?: throw IllegalArgumentException("to is required")
                    
        val topic get() = _topic ?: throw IllegalArgumentException("topic is required")
                    
        val content get() = _content ?: throw IllegalArgumentException("content is required")
                    
}

