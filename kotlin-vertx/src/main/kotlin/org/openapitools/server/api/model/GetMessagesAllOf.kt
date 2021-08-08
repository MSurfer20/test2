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

import org.openapitools.server.api.model.AnyType

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
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
 * @param flags The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
 * @param lastEditTimestamp The UNIX timestamp for when the message was last edited, in UTC seconds. 
 * @param matchContent Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
 * @param matchSubject Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class GetMessagesAllOf (
    val avatarUrl: AnyType? = null,
    val client: AnyType? = null,
    val content: AnyType? = null,
    val contentType: AnyType? = null,
    val displayRecipient: AnyType? = null,
    val id: AnyType? = null,
    val isMeMessage: AnyType? = null,
    val reactions: AnyType? = null,
    val recipientId: AnyType? = null,
    val senderEmail: AnyType? = null,
    val senderFullName: AnyType? = null,
    val senderId: AnyType? = null,
    val senderRealmStr: AnyType? = null,
    val streamId: AnyType? = null,
    val subject: AnyType? = null,
    val topicLinks: AnyType? = null,
    val submessages: AnyType? = null,
    val timestamp: AnyType? = null,
    val type: AnyType? = null,
    /* The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  */
    val flags: kotlin.Array<kotlin.String>? = null,
    /* The UNIX timestamp for when the message was last edited, in UTC seconds.  */
    val lastEditTimestamp: kotlin.Int? = null,
    /* Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  */
    val matchContent: kotlin.String? = null,
    /* Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  */
    val matchSubject: kotlin.String? = null
) {

}

