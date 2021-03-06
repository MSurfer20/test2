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


import com.squareup.moshi.Json

/**
 * 
 * @param result 
 * @param msg 
 */

data class JsonSuccessBaseAllOf (
    @Json(name = "result")
    val result: JsonSuccessBaseAllOf.Result,
    @Json(name = "msg")
    val msg: kotlin.String
) {

    /**
     * 
     * Values: success
     */
    enum class Result(val value: kotlin.String) {
        @Json(name = "success") success("success");
    }
}

