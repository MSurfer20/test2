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
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


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
object RealmExports : BaseTable<RealmExport>("RealmExport") {
    val id = int("id") /* null */ /* The id of the export.  */
    val actingUserId = int("acting_user_id") /* null */ /* The id of the user who did the export.  */
    val exportTime = decimal("export_time") /* null */ /* The UNIX timestamp of when the export was made.  */
    val deletedTimestamp = decimal("deleted_timestamp") /* null */ /* The timestamp of when the export was deleted. Null if it wasn't.  */
    val failedTimestamp = decimal("failed_timestamp") /* null */ /* The timestamp of when the export failed. Null if it didn't.  */
    val exportUrl = text("export_url") /* null */ /* The URL of the export. `null` if there's no URL.  */
    val pending = boolean("pending") /* null */ /* Whether the export is pending or not.  */

    /**
     * Create an entity of type RealmExport from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RealmExport(
        id = row[id]  /* kotlin.Int? */ /* The id of the export.  */,
        actingUserId = row[actingUserId]  /* kotlin.Int? */ /* The id of the user who did the export.  */,
        exportTime = row[exportTime]  /* java.math.BigDecimal? */ /* The UNIX timestamp of when the export was made.  */,
        deletedTimestamp = row[deletedTimestamp]  /* java.math.BigDecimal? */ /* The timestamp of when the export was deleted. Null if it wasn't.  */,
        failedTimestamp = row[failedTimestamp]  /* java.math.BigDecimal? */ /* The timestamp of when the export failed. Null if it didn't.  */,
        exportUrl = row[exportUrl]  /* kotlin.String? */ /* The URL of the export. `null` if there's no URL.  */,
        pending = row[pending]  /* kotlin.Boolean? */ /* Whether the export is pending or not.  */
    )

    /**
    * Assign all the columns from the entity of type RealmExport to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RealmExport()
    * database.update(RealmExports, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RealmExport) {
        this.apply {
            set(RealmExports.id, entity.id)
            set(RealmExports.actingUserId, entity.actingUserId)
            set(RealmExports.exportTime, entity.exportTime)
            set(RealmExports.deletedTimestamp, entity.deletedTimestamp)
            set(RealmExports.failedTimestamp, entity.failedTimestamp)
            set(RealmExports.exportUrl, entity.exportUrl)
            set(RealmExports.pending, entity.pending)
        }
    }

}


