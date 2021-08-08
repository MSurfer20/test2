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
 * @param queueId The string that identifies the invalid event queue. 
 */
object BadEventQueueIdErrors : BaseTable<BadEventQueueIdError>("BadEventQueueIdError") {
    val result = blob("result")
    val msg = blob("msg")
    val code = blob("code") /* null */
    val queueId = text("queue_id") /* null */ /* The string that identifies the invalid event queue.  */

    /**
     * Create an entity of type BadEventQueueIdError from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = BadEventQueueIdError(
        result = row[result] /* kotlin.Any */,
        msg = row[msg] /* kotlin.Any */,
        code = row[code]  /* kotlin.Any? */,
        queueId = row[queueId]  /* kotlin.String? */ /* The string that identifies the invalid event queue.  */
    )

    /**
    * Assign all the columns from the entity of type BadEventQueueIdError to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = BadEventQueueIdError()
    * database.update(BadEventQueueIdErrors, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: BadEventQueueIdError) {
        this.apply {
            set(BadEventQueueIdErrors.result, entity.result)
            set(BadEventQueueIdErrors.msg, entity.msg)
            set(BadEventQueueIdErrors.code, entity.code)
            set(BadEventQueueIdErrors.queueId, entity.queueId)
        }
    }

}


