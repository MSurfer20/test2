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
import org.openapitools.server.models.JsonError

/**
 * 
 * @param result 
 * @param msg 
 */
data class InvalidApiKeyError (
    val result: AnyType,
    val msg: AnyType
) 

