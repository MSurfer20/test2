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
import org.openapitools.client.models.CodedError

import com.squareup.moshi.Json

/**
 * 
 * @param result 
 * @param msg 
 * @param code 
 */

data class UserDeactivatedError (
    @Json(name = "result")
    val result: AnyType?,
    @Json(name = "msg")
    val msg: AnyType?,
    @Json(name = "code")
    val code: AnyType? = null
)

