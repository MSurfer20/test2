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
package org.openapitools.server.models

import org.openapitools.server.models.AnyType

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
data class MessagesAllOf(
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
    val type: AnyType? = null
) 

