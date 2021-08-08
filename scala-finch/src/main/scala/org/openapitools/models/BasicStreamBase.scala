package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Object containing basic details about the stream. 
 * @param streamUnderscoreid The unique ID of the stream. 
 * @param name The name of the stream. 
 * @param description The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
 * @param dateUnderscorecreated The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
 * @param inviteUnderscoreonly Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
 * @param renderedUnderscoredescription The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
 * @param isUnderscorewebUnderscorepublic Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
 * @param streamUnderscorepostUnderscorepolicy Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
 * @param messageUnderscoreretentionUnderscoredays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
 * @param historyUnderscorepublicUnderscoretoUnderscoresubscribers Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
 * @param firstUnderscoremessageUnderscoreid The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
 * @param isUnderscoreannouncementUnderscoreonly Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
 */
case class BasicStreamBase(streamUnderscoreid: Option[Int],
                name: Option[String],
                description: Option[String],
                dateUnderscorecreated: Option[Int],
                inviteUnderscoreonly: Option[Boolean],
                renderedUnderscoredescription: Option[String],
                isUnderscorewebUnderscorepublic: Option[Boolean],
                streamUnderscorepostUnderscorepolicy: Option[Int],
                messageUnderscoreretentionUnderscoredays: Option[Int],
                historyUnderscorepublicUnderscoretoUnderscoresubscribers: Option[Boolean],
                firstUnderscoremessageUnderscoreid: Option[Int],
                isUnderscoreannouncementUnderscoreonly: Option[Boolean]
                )

object BasicStreamBase {
    /**
     * Creates the codec for converting BasicStreamBase from and to JSON.
     */
    implicit val decoder: Decoder[BasicStreamBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[BasicStreamBase] = deriveEncoder
}
