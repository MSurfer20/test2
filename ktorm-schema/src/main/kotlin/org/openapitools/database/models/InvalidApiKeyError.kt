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
object InvalidApiKeyErrors : BaseTable<InvalidApiKeyError>("InvalidApiKeyError") {
    val result = blob("result")
    val msg = blob("msg")

    /**
     * Create an entity of type InvalidApiKeyError from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = InvalidApiKeyError(
        result = row[result] /* kotlin.Any */,
        msg = row[msg] /* kotlin.Any */
    )

    /**
    * Assign all the columns from the entity of type InvalidApiKeyError to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = InvalidApiKeyError()
    * database.update(InvalidApiKeyErrors, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: InvalidApiKeyError) {
        this.apply {
            set(InvalidApiKeyErrors.result, entity.result)
            set(InvalidApiKeyErrors.msg, entity.msg)
        }
    }

}


