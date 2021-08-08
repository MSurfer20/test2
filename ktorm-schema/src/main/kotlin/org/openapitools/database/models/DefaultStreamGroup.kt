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
 * Dictionary containing details of a default stream group. 
 * @param name Name of the default stream group. 
 * @param description Description of the default stream group. 
 * @param id id of the default stream group. 
 * @param streams Array containing details about the streams in the default stream group. 
 */
object DefaultStreamGroups : BaseTable<DefaultStreamGroup>("DefaultStreamGroup") {
    val name = text("name") /* null */ /* Name of the default stream group.  */
    val description = text("description") /* null */ /* Description of the default stream group.  */
    val id = int("id") /* null */ /* id of the default stream group.  */

    /**
     * Create an entity of type DefaultStreamGroup from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = DefaultStreamGroup(
        name = row[name]  /* kotlin.String? */ /* Name of the default stream group.  */,
        description = row[description]  /* kotlin.String? */ /* Description of the default stream group.  */,
        id = row[id]  /* kotlin.Int? */ /* id of the default stream group.  */,
        streams = emptyList() /* kotlin.Array<BasicStream>? */ /* Array containing details about the streams in the default stream group.  */
    )

    /**
    * Assign all the columns from the entity of type DefaultStreamGroup to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = DefaultStreamGroup()
    * database.update(DefaultStreamGroups, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: DefaultStreamGroup) {
        this.apply {
            set(DefaultStreamGroups.name, entity.name)
            set(DefaultStreamGroups.description, entity.description)
            set(DefaultStreamGroups.id, entity.id)
        }
    }

}


object DefaultStreamGroupBasicStream : BaseTable<Pair<kotlin.Long, kotlin.Long>>("DefaultStreamGroupBasicStream") {
    val defaultStreamGroup = long("defaultStreamGroup")
    val basicStream = long("basicStream")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[defaultStreamGroup] ?: 0, row[basicStream] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(DefaultStreamGroupBasicStream.defaultStreamGroup, entity.first)
            set(DefaultStreamGroupBasicStream.basicStream, entity.second)
        }
    }

}

