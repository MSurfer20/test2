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
object JsonErrors : BaseTable<JsonError>("JsonError") {
    val result = blob("result")
    val msg = blob("msg")

    /**
     * Create an entity of type JsonError from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = JsonError(
        result = row[result] /* kotlin.Any */,
        msg = row[msg] /* kotlin.Any */
    )

    /**
    * Assign all the columns from the entity of type JsonError to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = JsonError()
    * database.update(JsonErrors, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: JsonError) {
        this.apply {
            set(JsonErrors.result, entity.result)
            set(JsonErrors.msg, entity.msg)
        }
    }

}


