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
 * @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint. 
 * @param emojiName Name of the emoji. 
 * @param reactionType One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
 * @param userId The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
 * @param user 
 */
object EmojiReactionBases : BaseTable<EmojiReactionBase>("EmojiReactionBase") {
    val emojiCode = text("emoji_code") /* null */ /* A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint.  */
    val emojiName = text("emoji_name") /* null */ /* Name of the emoji.  */
    val reactionType = text("reaction_type") /* null */ /* One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.  */
    val userId = int("user_id") /* null */ /* The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.  */
    @Deprecated(message = "This property is deprecated.")
    val user = long("user") /* null */

    /**
     * Create an entity of type EmojiReactionBase from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = EmojiReactionBase(
        emojiCode = row[emojiCode]  /* kotlin.String? */ /* A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint.  */,
        emojiName = row[emojiName]  /* kotlin.String? */ /* Name of the emoji.  */,
        reactionType = row[reactionType]  /* kotlin.String? */ /* One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.  */,
        userId = row[userId]  /* kotlin.Int? */ /* The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.  */,
        user = EmojiReactionBaseUsers.createEntity(row, withReferences) /* EmojiReactionBaseUser? */
    )

    /**
    * Assign all the columns from the entity of type EmojiReactionBase to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = EmojiReactionBase()
    * database.update(EmojiReactionBases, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: EmojiReactionBase) {
        this.apply {
            set(EmojiReactionBases.emojiCode, entity.emojiCode)
            set(EmojiReactionBases.emojiName, entity.emojiName)
            set(EmojiReactionBases.reactionType, entity.reactionType)
            set(EmojiReactionBases.userId, entity.userId)
            set(EmojiReactionBases.user, entity.user)
        }
    }

}

