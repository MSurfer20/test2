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
 * Object containing details about a realm export. 
 * @param id The id of the export. 
 * @param actingUserId The id of the user who did the export. 
 * @param exportTime The UNIX timestamp of when the export was made. 
 * @param deletedTimestamp The timestamp of when the export was deleted. Null if it wasn't. 
 * @param failedTimestamp The timestamp of when the export failed. Null if it didn't. 
 * @param exportUrl The URL of the export. `null` if there's no URL. 
 * @param pending Whether the export is pending or not. 
 */

data class RealmExport (
    /* The id of the export.  */
    @Json(name = "id")
    val id: kotlin.Int? = null,
    /* The id of the user who did the export.  */
    @Json(name = "acting_user_id")
    val actingUserId: kotlin.Int? = null,
    /* The UNIX timestamp of when the export was made.  */
    @Json(name = "export_time")
    val exportTime: java.math.BigDecimal? = null,
    /* The timestamp of when the export was deleted. Null if it wasn't.  */
    @Json(name = "deleted_timestamp")
    val deletedTimestamp: java.math.BigDecimal? = null,
    /* The timestamp of when the export failed. Null if it didn't.  */
    @Json(name = "failed_timestamp")
    val failedTimestamp: java.math.BigDecimal? = null,
    /* The URL of the export. `null` if there's no URL.  */
    @Json(name = "export_url")
    val exportUrl: kotlin.String? = null,
    /* Whether the export is pending or not.  */
    @Json(name = "pending")
    val pending: kotlin.Boolean? = null
)

