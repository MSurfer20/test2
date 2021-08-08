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
 * Object containing basic details about the stream. 
 * @param streamId The unique ID of the stream. 
 * @param name The name of the stream. 
 * @param description The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
 * @param dateCreated The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
 * @param inviteOnly Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
 * @param renderedDescription The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
 * @param isWebPublic Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
 * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
 * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
 * @param historyPublicToSubscribers Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
 * @param firstMessageId The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
 * @param isAnnouncementOnly Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
 */
object BasicStreamBases : BaseTable<BasicStreamBase>("BasicStreamBase") {
    val streamId = int("stream_id") /* null */ /* The unique ID of the stream.  */
    val name = text("name") /* null */ /* The name of the stream.  */
    val description = text("description") /* null */ /* The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.  */
    val dateCreated = int("date_created") /* null */ /* The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  */
    val inviteOnly = boolean("invite_only") /* null */ /* Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  */
    val renderedDescription = text("rendered_description") /* null */ /* The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  */
    val isWebPublic = boolean("is_web_public") /* null */ /* Whether the stream has been configured to allow unauthenticated access to its message history from the web.  */
    val streamPostPolicy = int("stream_post_policy") /* null */ /* Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  */
    val messageRetentionDays = int("message_retention_days") /* null */ /* Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  */
    val historyPublicToSubscribers = boolean("history_public_to_subscribers") /* null */ /* Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future.  */
    val firstMessageId = int("first_message_id") /* null */ /* The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  */
    @Deprecated(message = "This property is deprecated.")
    val isAnnouncementOnly = boolean("is_announcement_only") /* null */ /* Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.  */

    /**
     * Create an entity of type BasicStreamBase from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = BasicStreamBase(
        streamId = row[streamId]  /* kotlin.Int? */ /* The unique ID of the stream.  */,
        name = row[name]  /* kotlin.String? */ /* The name of the stream.  */,
        description = row[description]  /* kotlin.String? */ /* The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.  */,
        dateCreated = row[dateCreated]  /* kotlin.Int? */ /* The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  */,
        inviteOnly = row[inviteOnly]  /* kotlin.Boolean? */ /* Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  */,
        renderedDescription = row[renderedDescription]  /* kotlin.String? */ /* The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  */,
        isWebPublic = row[isWebPublic]  /* kotlin.Boolean? */ /* Whether the stream has been configured to allow unauthenticated access to its message history from the web.  */,
        streamPostPolicy = row[streamPostPolicy]  /* kotlin.Int? */ /* Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  */,
        messageRetentionDays = row[messageRetentionDays]  /* kotlin.Int? */ /* Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  */,
        historyPublicToSubscribers = row[historyPublicToSubscribers]  /* kotlin.Boolean? */ /* Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future.  */,
        firstMessageId = row[firstMessageId]  /* kotlin.Int? */ /* The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  */,
        isAnnouncementOnly = row[isAnnouncementOnly]  /* kotlin.Boolean? */ /* Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.  */
    )

    /**
    * Assign all the columns from the entity of type BasicStreamBase to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = BasicStreamBase()
    * database.update(BasicStreamBases, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: BasicStreamBase) {
        this.apply {
            set(BasicStreamBases.streamId, entity.streamId)
            set(BasicStreamBases.name, entity.name)
            set(BasicStreamBases.description, entity.description)
            set(BasicStreamBases.dateCreated, entity.dateCreated)
            set(BasicStreamBases.inviteOnly, entity.inviteOnly)
            set(BasicStreamBases.renderedDescription, entity.renderedDescription)
            set(BasicStreamBases.isWebPublic, entity.isWebPublic)
            set(BasicStreamBases.streamPostPolicy, entity.streamPostPolicy)
            set(BasicStreamBases.messageRetentionDays, entity.messageRetentionDays)
            set(BasicStreamBases.historyPublicToSubscribers, entity.historyPublicToSubscribers)
            set(BasicStreamBases.firstMessageId, entity.firstMessageId)
            set(BasicStreamBases.isAnnouncementOnly, entity.isAnnouncementOnly)
        }
    }

}


