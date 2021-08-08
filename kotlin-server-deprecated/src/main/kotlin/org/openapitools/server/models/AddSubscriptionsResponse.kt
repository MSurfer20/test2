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

import org.openapitools.server.models.AddSubscriptionsResponseAllOf
import org.openapitools.server.models.AnyType
import org.openapitools.server.models.JsonSuccessBase

/**
 * 
 * @param result 
 * @param msg 
 * @param subscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
 * @param alreadySubscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
 * @param unauthorized A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
 */
data class AddSubscriptionsResponse (
    val result: AnyType,
    val msg: AnyType,
    /* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  */
    val subscribed: kotlin.collections.Map<kotlin.String, kotlin.Array<kotlin.String>>? = null,
    /* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  */
    val alreadySubscribed: kotlin.collections.Map<kotlin.String, kotlin.Array<kotlin.String>>? = null,
    /* A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`.  */
    val unauthorized: kotlin.Array<kotlin.String>? = null
) 

