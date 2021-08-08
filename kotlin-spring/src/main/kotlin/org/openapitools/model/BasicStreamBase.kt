package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

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
data class BasicStreamBase(

    @field:JsonProperty("stream_id") val streamId: kotlin.Int? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("description") val description: kotlin.String? = null,

    @field:JsonProperty("date_created") val dateCreated: kotlin.Int? = null,

    @field:JsonProperty("invite_only") val inviteOnly: kotlin.Boolean? = null,

    @field:JsonProperty("rendered_description") val renderedDescription: kotlin.String? = null,

    @field:JsonProperty("is_web_public") val isWebPublic: kotlin.Boolean? = null,

    @field:JsonProperty("stream_post_policy") val streamPostPolicy: kotlin.Int? = null,

    @field:JsonProperty("message_retention_days") val messageRetentionDays: kotlin.Int? = null,

    @field:JsonProperty("history_public_to_subscribers") val historyPublicToSubscribers: kotlin.Boolean? = null,

    @field:JsonProperty("first_message_id") val firstMessageId: kotlin.Int? = null,

    @Deprecated(message = "")
    @field:JsonProperty("is_announcement_only") val isAnnouncementOnly: kotlin.Boolean? = null
) {

}

