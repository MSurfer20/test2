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
 * @param streamId The unique ID of a stream. 
 * @param name The name of a stream. 
 * @param description The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
 * @param renderedDescription A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
 * @param dateCreated The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
 * @param inviteOnly Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
 * @param subscribers A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
 * @param desktopNotifications A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
 * @param emailNotifications A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
 * @param wildcardMentionsNotify A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
 * @param pushNotifications A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
 * @param audibleNotifications A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
 * @param pinToTop A boolean specifying whether the given stream has been pinned to the top. 
 * @param emailAddress Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
 * @param isMuted Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
 * @param inHomeView Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
 * @param isAnnouncementOnly Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
 * @param isWebPublic Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
 * @param role The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
 * @param color The user's personal color for the stream. 
 * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
 * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
 * @param historyPublicToSubscribers Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
 * @param firstMessageId The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
 * @param streamWeeklyTraffic The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
 */
object Subscriptionss : BaseTable<Subscriptions>("Subscriptions") {
    val streamId = int("stream_id") /* null */ /* The unique ID of a stream.  */
    val name = text("name") /* null */ /* The name of a stream.  */
    val description = text("description") /* null */ /* The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.  */
    val renderedDescription = text("rendered_description") /* null */ /* A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  */
    val dateCreated = int("date_created") /* null */ /* The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  */
    val inviteOnly = boolean("invite_only") /* null */ /* Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  */
    val desktopNotifications = boolean("desktop_notifications") /* null */ /* A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream.  */
    val emailNotifications = boolean("email_notifications") /* null */ /* A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream.  */
    val wildcardMentionsNotify = boolean("wildcard_mentions_notify") /* null */ /* A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream.  */
    val pushNotifications = boolean("push_notifications") /* null */ /* A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream.  */
    val audibleNotifications = boolean("audible_notifications") /* null */ /* A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream.  */
    val pinToTop = boolean("pin_to_top") /* null */ /* A boolean specifying whether the given stream has been pinned to the top.  */
    val emailAddress = text("email_address") /* null */ /* Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email).  */
    val isMuted = boolean("is_muted") /* null */ /* Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`).  */
    @Deprecated(message = "This property is deprecated.")
    val inHomeView = boolean("in_home_view") /* null */ /* Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available.  */
    @Deprecated(message = "This property is deprecated.")
    val isAnnouncementOnly = boolean("is_announcement_only") /* null */ /* Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.  */
    val isWebPublic = boolean("is_web_public") /* null */ /* Whether the stream has been configured to allow unauthenticated access to its message history from the web.  */
    val role = int("role").transform({ Subscriptions.Role.valueOf(it ?: 20) }, { it.value }) /* null */ /* The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31).  */

    val color = text("color") /* null */ /* The user's personal color for the stream.  */
    val streamPostPolicy = int("stream_post_policy") /* null */ /* Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  */
    val messageRetentionDays = int("message_retention_days") /* null */ /* Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  */
    val historyPublicToSubscribers = boolean("history_public_to_subscribers") /* null */ /* Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future.  */
    val firstMessageId = int("first_message_id") /* null */ /* The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  */
    val streamWeeklyTraffic = int("stream_weekly_traffic") /* null */ /* The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic.  */

    /**
     * Create an entity of type Subscriptions from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Subscriptions(
        streamId = row[streamId]  /* kotlin.Int? */ /* The unique ID of a stream.  */,
        name = row[name]  /* kotlin.String? */ /* The name of a stream.  */,
        description = row[description]  /* kotlin.String? */ /* The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.  */,
        renderedDescription = row[renderedDescription]  /* kotlin.String? */ /* A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  */,
        dateCreated = row[dateCreated]  /* kotlin.Int? */ /* The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  */,
        inviteOnly = row[inviteOnly]  /* kotlin.Boolean? */ /* Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  */,
        subscribers = emptyList() /* kotlin.Array<kotlin.Int>? */ /* A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`.  */,
        desktopNotifications = row[desktopNotifications]  /* kotlin.Boolean? */ /* A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream.  */,
        emailNotifications = row[emailNotifications]  /* kotlin.Boolean? */ /* A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream.  */,
        wildcardMentionsNotify = row[wildcardMentionsNotify]  /* kotlin.Boolean? */ /* A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream.  */,
        pushNotifications = row[pushNotifications]  /* kotlin.Boolean? */ /* A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream.  */,
        audibleNotifications = row[audibleNotifications]  /* kotlin.Boolean? */ /* A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream.  */,
        pinToTop = row[pinToTop]  /* kotlin.Boolean? */ /* A boolean specifying whether the given stream has been pinned to the top.  */,
        emailAddress = row[emailAddress]  /* kotlin.String? */ /* Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email).  */,
        isMuted = row[isMuted]  /* kotlin.Boolean? */ /* Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`).  */,
        inHomeView = row[inHomeView]  /* kotlin.Boolean? */ /* Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available.  */,
        isAnnouncementOnly = row[isAnnouncementOnly]  /* kotlin.Boolean? */ /* Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.  */,
        isWebPublic = row[isWebPublic]  /* kotlin.Boolean? */ /* Whether the stream has been configured to allow unauthenticated access to its message history from the web.  */,
        role = row[role]  /* kotlin.Int? */ /* The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31).  */,
        color = row[color]  /* kotlin.String? */ /* The user's personal color for the stream.  */,
        streamPostPolicy = row[streamPostPolicy]  /* kotlin.Int? */ /* Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  */,
        messageRetentionDays = row[messageRetentionDays]  /* kotlin.Int? */ /* Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  */,
        historyPublicToSubscribers = row[historyPublicToSubscribers]  /* kotlin.Boolean? */ /* Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future.  */,
        firstMessageId = row[firstMessageId]  /* kotlin.Int? */ /* The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  */,
        streamWeeklyTraffic = row[streamWeeklyTraffic]  /* kotlin.Int? */ /* The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic.  */
    )

    /**
    * Assign all the columns from the entity of type Subscriptions to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Subscriptions()
    * database.update(Subscriptionss, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Subscriptions) {
        this.apply {
            set(Subscriptionss.streamId, entity.streamId)
            set(Subscriptionss.name, entity.name)
            set(Subscriptionss.description, entity.description)
            set(Subscriptionss.renderedDescription, entity.renderedDescription)
            set(Subscriptionss.dateCreated, entity.dateCreated)
            set(Subscriptionss.inviteOnly, entity.inviteOnly)
            set(Subscriptionss.desktopNotifications, entity.desktopNotifications)
            set(Subscriptionss.emailNotifications, entity.emailNotifications)
            set(Subscriptionss.wildcardMentionsNotify, entity.wildcardMentionsNotify)
            set(Subscriptionss.pushNotifications, entity.pushNotifications)
            set(Subscriptionss.audibleNotifications, entity.audibleNotifications)
            set(Subscriptionss.pinToTop, entity.pinToTop)
            set(Subscriptionss.emailAddress, entity.emailAddress)
            set(Subscriptionss.isMuted, entity.isMuted)
            set(Subscriptionss.inHomeView, entity.inHomeView)
            set(Subscriptionss.isAnnouncementOnly, entity.isAnnouncementOnly)
            set(Subscriptionss.isWebPublic, entity.isWebPublic)
            set(Subscriptionss.role, entity.role)
            set(Subscriptionss.color, entity.color)
            set(Subscriptionss.streamPostPolicy, entity.streamPostPolicy)
            set(Subscriptionss.messageRetentionDays, entity.messageRetentionDays)
            set(Subscriptionss.historyPublicToSubscribers, entity.historyPublicToSubscribers)
            set(Subscriptionss.firstMessageId, entity.firstMessageId)
            set(Subscriptionss.streamWeeklyTraffic, entity.streamWeeklyTraffic)
        }
    }

}


object SubscriptionsSubscribers : BaseTable<Pair<kotlin.Long, kotlin.Int>>("SubscriptionsSubscribers") {
    val subscriptions = long("subscriptions")
    val subscribers = int("subscribers")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Int> =
        Pair(row[subscriptions] ?: 0, row[subscribers] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Int>) {
        this.apply {
            set(SubscriptionsSubscribers.subscriptions, entity.first)
            set(SubscriptionsSubscribers.subscribers, entity.second)
        }
    }

}

