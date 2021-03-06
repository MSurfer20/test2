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
 * 
 * @param result 
 * @param msg 
 */
object JsonSuccessBaseAllOfs : BaseTable<JsonSuccessBaseAllOf>("JsonSuccessBase_allOf") {
    val result = text("result").transform({ JsonSuccessBaseAllOf.Result.valueOf(it) }, { it.value })
    val msg = text("msg")

    /**
     * Create an entity of type JsonSuccessBaseAllOf from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = JsonSuccessBaseAllOf(
        result = row[result] ?: JsonSuccessBaseAllOf.Result.valueOf("") /* kotlin.String */,
        msg = row[msg] ?: "" /* kotlin.String */
    )

    /**
    * Assign all the columns from the entity of type JsonSuccessBaseAllOf to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = JsonSuccessBaseAllOf()
    * database.update(JsonSuccessBaseAllOfs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: JsonSuccessBaseAllOf) {
        this.apply {
            set(JsonSuccessBaseAllOfs.result, entity.result)
            set(JsonSuccessBaseAllOfs.msg, entity.msg)
        }
    }

}


