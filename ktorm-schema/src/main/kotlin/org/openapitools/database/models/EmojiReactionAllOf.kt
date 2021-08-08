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
 * @param emojiCode 
 * @param emojiName 
 * @param reactionType 
 * @param userId 
 * @param user 
 */
object EmojiReactionAllOfs : BaseTable<EmojiReactionAllOf>("EmojiReaction_allOf") {
    val emojiCode = blob("emoji_code") /* null */
    val emojiName = blob("emoji_name") /* null */
    val reactionType = blob("reaction_type") /* null */
    val userId = blob("user_id") /* null */
    val user = blob("user") /* null */

    /**
     * Create an entity of type EmojiReactionAllOf from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = EmojiReactionAllOf(
        emojiCode = row[emojiCode]  /* kotlin.Any? */,
        emojiName = row[emojiName]  /* kotlin.Any? */,
        reactionType = row[reactionType]  /* kotlin.Any? */,
        userId = row[userId]  /* kotlin.Any? */,
        user = row[user]  /* kotlin.Any? */
    )

    /**
    * Assign all the columns from the entity of type EmojiReactionAllOf to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = EmojiReactionAllOf()
    * database.update(EmojiReactionAllOfs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: EmojiReactionAllOf) {
        this.apply {
            set(EmojiReactionAllOfs.emojiCode, entity.emojiCode)
            set(EmojiReactionAllOfs.emojiName, entity.emojiName)
            set(EmojiReactionAllOfs.reactionType, entity.reactionType)
            set(EmojiReactionAllOfs.userId, entity.userId)
            set(EmojiReactionAllOfs.user, entity.user)
        }
    }

}


