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
 * A dictionary for representing a message draft. 
 * @param type The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
 * @param to An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
 * @param topic For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
 * @param content The body of the draft. Should not contain null bytes. 
 * @param id The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
 * @param timestamp A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
 */
object Drafts : BaseTable<Draft>("Draft") {
    val type = text("type").transform({ Draft.Type.valueOf(it) }, { it.value }) /* The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages).  */
    val topic = text("topic") /* For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes.  */
    val content = text("content") /* The body of the draft. Should not contain null bytes.  */
    val id = int("id") /* null */ /* The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited.  */
    val timestamp = decimal("timestamp") /* null */ /* A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server.  */

    /**
     * Create an entity of type Draft from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Draft(
        type = row[type] ?: Draft.Type.valueOf("") /* kotlin.String */ /* The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages).  */,
        to = emptyList() /* kotlin.Array<kotlin.Int> */ /* An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array.  */,
        topic = row[topic] ?: "" /* kotlin.String */ /* For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes.  */,
        content = row[content] ?: "" /* kotlin.String */ /* The body of the draft. Should not contain null bytes.  */,
        id = row[id]  /* kotlin.Int? */ /* The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited.  */,
        timestamp = row[timestamp]  /* java.math.BigDecimal? */ /* A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server.  */
    )

    /**
    * Assign all the columns from the entity of type Draft to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Draft()
    * database.update(Drafts, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Draft) {
        this.apply {
            set(Drafts.type, entity.type)
            set(Drafts.topic, entity.topic)
            set(Drafts.content, entity.content)
            set(Drafts.id, entity.id)
            set(Drafts.timestamp, entity.timestamp)
        }
    }

}


object DraftTo : BaseTable<Pair<kotlin.Long, kotlin.Int>>("DraftTo") {
    val draft = long("draft")
    val to = int("to")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Int> =
        Pair(row[draft] ?: 0, row[to] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Int>) {
        this.apply {
            set(DraftTo.draft, entity.first)
            set(DraftTo.to, entity.second)
        }
    }

}
