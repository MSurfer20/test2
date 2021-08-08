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
 * 
 * @param apiKey The API key that can be used to authenticate as the requested user. 
 * @param email The email address of the user who owns the API key 
 * @param result 
 * @param msg 
 */
data class ApiKeyResponseAllOf (
    /* The API key that can be used to authenticate as the requested user.  */
    val apiKey: kotlin.String,
    /* The email address of the user who owns the API key  */
    val email: kotlin.String,
    val result: AnyType? = null,
    val msg: AnyType? = null
) 

