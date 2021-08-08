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
import org.openapitools.server.models.BasicBotAllOf
import org.openapitools.server.models.BasicBotBase

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
data class BasicBot (
    val userId: AnyType? = null,
    val fullName: AnyType? = null,
    val apiKey: AnyType? = null,
    val defaultSendingStream: AnyType? = null,
    val defaultEventsRegisterStream: AnyType? = null,
    val defaultAllPublicStreams: AnyType? = null,
    val avatarUrl: AnyType? = null,
    val ownerId: AnyType? = null,
    val services: AnyType? = null
) 

