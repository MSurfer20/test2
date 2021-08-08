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
 * Object containing the user group's attributes. 
 * @param name The name of the user group. 
 * @param description The description of the user group. 
 * @param members Array containing the id of the users who are members of this user group. 
 * @param id The ID of the user group. 
 */

data class UserGroup (
    /* The name of the user group.  */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* The description of the user group.  */
    @Json(name = "description")
    val description: kotlin.String? = null,
    /* Array containing the id of the users who are members of this user group.  */
    @Json(name = "members")
    val members: kotlin.collections.List<kotlin.Int>? = null,
    /* The ID of the user group.  */
    @Json(name = "id")
    val id: kotlin.Int? = null
)
