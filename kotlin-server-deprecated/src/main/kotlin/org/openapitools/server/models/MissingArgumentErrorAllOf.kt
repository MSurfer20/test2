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

/**
 * ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
 * @param result 
 * @param msg 
 * @param code 
 * @param varName It contains the information about the missing parameter. 
 */
data class MissingArgumentErrorAllOf (
    val result: AnyType? = null,
    val msg: AnyType? = null,
    val code: AnyType? = null,
    /* It contains the information about the missing parameter.  */
    val varName: kotlin.String? = null
) 

