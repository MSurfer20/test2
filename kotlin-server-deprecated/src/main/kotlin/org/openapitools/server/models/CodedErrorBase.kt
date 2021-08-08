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

import org.openapitools.server.models.AnyType
import org.openapitools.server.models.CodedErrorBaseAllOf
import org.openapitools.server.models.JsonErrorBase

/**
 * 
 * @param result 
 * @param msg 
 * @param code A string that identifies the error. 
 */
data class CodedErrorBase (
    val result: AnyType,
    val msg: AnyType,
    /* A string that identifies the error.  */
    val code: kotlin.String? = null
) 

