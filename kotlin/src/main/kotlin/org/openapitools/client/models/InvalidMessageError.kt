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

import org.openapitools.client.models.AnyType
import org.openapitools.client.models.InvalidMessageErrorAllOf
import org.openapitools.client.models.JsonSuccessBase

import com.squareup.moshi.Json

/**
 * 
 * @param result 
 * @param msg 
 * @param rawContent The raw content of the message. 
 */

data class InvalidMessageError (
    @Json(name = "result")
    val result: AnyType?,
    @Json(name = "msg")
    val msg: AnyType?,
    /* The raw content of the message.  */
    @Json(name = "raw_content")
    val rawContent: kotlin.String? = null
)

