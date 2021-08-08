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
import org.openapitools.server.api.model.JsonErrorBase
import org.openapitools.server.api.model.JsonSuccessAllOf

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param result 
 * @param msg 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class JsonError (
    @SerializedName("result") private val _result: AnyType?,
    @SerializedName("msg") private val _msg: AnyType?
) {

        val result get() = _result ?: throw IllegalArgumentException("result is required")
                    
        val msg get() = _msg ?: throw IllegalArgumentException("msg is required")
                    
}

