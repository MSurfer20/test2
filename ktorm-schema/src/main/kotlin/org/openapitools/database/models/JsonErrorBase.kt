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
object JsonErrorBases : BaseTable<JsonErrorBase>("JsonErrorBase") {
    val result = text("result").transform({ JsonErrorBase.Result.valueOf(it) }, { it.value })
    val msg = text("msg")

    /**
     * Create an entity of type JsonErrorBase from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = JsonErrorBase(
        result = row[result] ?: JsonErrorBase.Result.valueOf("") /* kotlin.String */,
        msg = row[msg] ?: "" /* kotlin.String */
    )

    /**
    * Assign all the columns from the entity of type JsonErrorBase to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = JsonErrorBase()
    * database.update(JsonErrorBases, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: JsonErrorBase) {
        this.apply {
            set(JsonErrorBases.result, entity.result)
            set(JsonErrorBases.msg, entity.msg)
        }
    }

}


