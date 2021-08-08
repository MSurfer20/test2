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
package org.openapitools.client.models


import com.squareup.moshi.Json

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

data class Subscriptions (
    /* The unique ID of a stream.  */
    @Json(name = "stream_id")
    val streamId: kotlin.Int? = null,
    /* The name of a stream.  */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.  */
    @Json(name = "description")
    val description: kotlin.String? = null,
    /* A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  */
    @Json(name = "rendered_description")
    val renderedDescription: kotlin.String? = null,
    /* The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  */
    @Json(name = "date_created")
    val dateCreated: kotlin.Int? = null,
    /* Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  */
    @Json(name = "invite_only")
    val inviteOnly: kotlin.Boolean? = null,
    /* A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`.  */
    @Json(name = "subscribers")
    val subscribers: kotlin.collections.List<kotlin.Int>? = null,
    /* A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream.  */
    @Json(name = "desktop_notifications")
    val desktopNotifications: kotlin.Boolean? = null,
    /* A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream.  */
    @Json(name = "email_notifications")
    val emailNotifications: kotlin.Boolean? = null,
    /* A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream.  */
    @Json(name = "wildcard_mentions_notify")
    val wildcardMentionsNotify: kotlin.Boolean? = null,
    /* A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream.  */
    @Json(name = "push_notifications")
    val pushNotifications: kotlin.Boolean? = null,
    /* A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream.  */
    @Json(name = "audible_notifications")
    val audibleNotifications: kotlin.Boolean? = null,
    /* A boolean specifying whether the given stream has been pinned to the top.  */
    @Json(name = "pin_to_top")
    val pinToTop: kotlin.Boolean? = null,
    /* Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email).  */
    @Json(name = "email_address")
    val emailAddress: kotlin.String? = null,
    /* Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`).  */
    @Json(name = "is_muted")
    val isMuted: kotlin.Boolean? = null,
    /* Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available.  */
    @Json(name = "in_home_view")
    @Deprecated(message = "This property is deprecated.")
    val inHomeView: kotlin.Boolean? = null,
    /* Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.  */
    @Json(name = "is_announcement_only")
    @Deprecated(message = "This property is deprecated.")
    val isAnnouncementOnly: kotlin.Boolean? = null,
    /* Whether the stream has been configured to allow unauthenticated access to its message history from the web.  */
    @Json(name = "is_web_public")
    val isWebPublic: kotlin.Boolean? = null,
    /* The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31).  */
    @Json(name = "role")
    val role: Subscriptions.Role? = null,
    /* The user's personal color for the stream.  */
    @Json(name = "color")
    val color: kotlin.String? = null,
    /* Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  */
    @Json(name = "stream_post_policy")
    val streamPostPolicy: kotlin.Int? = null,
    /* Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  */
    @Json(name = "message_retention_days")
    val messageRetentionDays: kotlin.Int? = null,
    /* Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future.  */
    @Json(name = "history_public_to_subscribers")
    val historyPublicToSubscribers: kotlin.Boolean? = null,
    /* The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  */
    @Json(name = "first_message_id")
    val firstMessageId: kotlin.Int? = null,
    /* The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic.  */
    @Json(name = "stream_weekly_traffic")
    val streamWeeklyTraffic: kotlin.Int? = null
) {

    /**
     * The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
     * Values: _20,_50
     */
    enum class Role(val value: kotlin.Int) {
        @Json(name = "20") _20(20),
        @Json(name = "50") _50(50);
    }
}

