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
 * @param code 
 */
object RateLimitedErrors : BaseTable<RateLimitedError>("RateLimitedError") {
    val result = blob("result")
    val msg = blob("msg")
    val code = blob("code") /* null */

    /**
     * Create an entity of type RateLimitedError from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RateLimitedError(
        result = row[result] /* kotlin.Any */,
        msg = row[msg] /* kotlin.Any */,
        code = row[code]  /* kotlin.Any? */
    )

    /**
    * Assign all the columns from the entity of type RateLimitedError to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RateLimitedError()
    * database.update(RateLimitedErrors, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RateLimitedError) {
        this.apply {
            set(RateLimitedErrors.result, entity.result)
            set(RateLimitedErrors.msg, entity.msg)
            set(RateLimitedErrors.code, entity.code)
        }
    }

}


