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
package org.openapitools.client.models

import org.openapitools.client.models.OneOfLessThanObjectCommaObjectGreaterThan

import com.squareup.moshi.Json

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

data class BasicBotBase (
    /* The user id of the bot.  */
    @Json(name = "user_id")
    val userId: kotlin.Int? = null,
    /* The full name of the bot.  */
    @Json(name = "full_name")
    val fullName: kotlin.String? = null,
    /* The API key of the bot which it uses to make API requests.  */
    @Json(name = "api_key")
    val apiKey: kotlin.String? = null,
    /* The default sending stream of the bot. Null if the bot doesn't have a default sending stream.  */
    @Json(name = "default_sending_stream")
    val defaultSendingStream: kotlin.String? = null,
    /* The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream.  */
    @Json(name = "default_events_register_stream")
    val defaultEventsRegisterStream: kotlin.String? = null,
    /* Whether the bot can send messages to all streams by default.  */
    @Json(name = "default_all_public_streams")
    val defaultAllPublicStreams: kotlin.Boolean? = null,
    /* The URL of the bot's avatar.  */
    @Json(name = "avatar_url")
    val avatarUrl: kotlin.String? = null,
    /* The user id of the bot's owner.  Null if the bot has no owner.  */
    @Json(name = "owner_id")
    val ownerId: kotlin.Int? = null,
    /* The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  */
    @Json(name = "services")
    val services: kotlin.collections.List<OneOfLessThanObjectCommaObjectGreaterThan>? = null
)
