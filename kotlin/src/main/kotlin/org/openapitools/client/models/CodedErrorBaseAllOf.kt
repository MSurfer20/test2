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

import com.squareup.moshi.Json

/**
 * 
 * @param result 
 * @param msg 
 * @param code A string that identifies the error. 
 */

data class CodedErrorBaseAllOf (
    @Json(name = "result")
    val result: AnyType? = null,
    @Json(name = "msg")
    val msg: AnyType? = null,
    /* A string that identifies the error.  */
    @Json(name = "code")
    val code: kotlin.String? = null
)
