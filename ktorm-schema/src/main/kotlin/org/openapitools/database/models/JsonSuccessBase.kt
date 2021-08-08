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
object JsonSuccessBases : BaseTable<JsonSuccessBase>("JsonSuccessBase") {
    val result = text("result").transform({ JsonSuccessBase.Result.valueOf(it) }, { it.value })
    val msg = text("msg")

    /**
     * Create an entity of type JsonSuccessBase from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = JsonSuccessBase(
        result = row[result] ?: JsonSuccessBase.Result.valueOf("") /* kotlin.String */,
        msg = row[msg] ?: "" /* kotlin.String */
    )

    /**
    * Assign all the columns from the entity of type JsonSuccessBase to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = JsonSuccessBase()
    * database.update(JsonSuccessBases, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: JsonSuccessBase) {
        this.apply {
            set(JsonSuccessBases.result, entity.result)
            set(JsonSuccessBases.msg, entity.msg)
        }
    }

}

