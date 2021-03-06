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

import org.openapitools.client.models.EmojiReactionBaseAllOfUser

import com.squareup.moshi.Json

/**
 * 
 * @param userId The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
 * @param user 
 */

data class EmojiReactionBaseAllOf (
    /* The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.  */
    @Json(name = "user_id")
    val userId: kotlin.Int? = null,
    @Json(name = "user")
    @Deprecated(message = "This property is deprecated.")
    val user: EmojiReactionBaseAllOfUser? = null
)

