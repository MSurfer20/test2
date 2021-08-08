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

import org.openapitools.server.api.model.BasicStream

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Dictionary containing details of a default stream group. 
 * @param name Name of the default stream group. 
 * @param description Description of the default stream group. 
 * @param id id of the default stream group. 
 * @param streams Array containing details about the streams in the default stream group. 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class DefaultStreamGroup (
    /* Name of the default stream group.  */
    val name: kotlin.String? = null,
    /* Description of the default stream group.  */
    val description: kotlin.String? = null,
    /* id of the default stream group.  */
    val id: kotlin.Int? = null,
    /* Array containing details about the streams in the default stream group.  */
    val streams: kotlin.Array<BasicStream>? = null
) {

}
