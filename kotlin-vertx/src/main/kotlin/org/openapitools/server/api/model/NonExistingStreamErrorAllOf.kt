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

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param result 
 * @param msg 
 * @param code 
 * @param stream The name of the stream that could not be found. 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class NonExistingStreamErrorAllOf (
    val result: AnyType? = null,
    val msg: AnyType? = null,
    val code: AnyType? = null,
    /* The name of the stream that could not be found.  */
    val stream: kotlin.String? = null
) {

}

