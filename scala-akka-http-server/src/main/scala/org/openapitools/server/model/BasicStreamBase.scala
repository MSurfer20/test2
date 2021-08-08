package org.openapitools.server.model


/**
 * Object containing basic details about the stream. 
 *
 * @param streamId The unique ID of the stream.  for example: ''null''
 * @param name The name of the stream.  for example: ''null''
 * @param description The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.  for example: ''null''
 * @param dateCreated The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  for example: ''null''
 * @param inviteOnly Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  for example: ''null''
 * @param renderedDescription The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  for example: ''null''
 * @param isWebPublic Whether the stream has been configured to allow unauthenticated access to its message history from the web.  for example: ''null''
 * @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  for example: ''null''
 * @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  for example: ''null''
 * @param historyPublicToSubscribers Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future.  for example: ''null''
 * @param firstMessageId The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  for example: ''null''
 * @param isAnnouncementOnly Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.  for example: ''null''
*/
final case class BasicStreamBase (
  streamId: Option[Int],
  name: Option[String],
  description: Option[String],
  dateCreated: Option[Int],
  inviteOnly: Option[Boolean],
  renderedDescription: Option[String],
  isWebPublic: Option[Boolean],
  streamPostPolicy: Option[Int],
  messageRetentionDays: Option[Int],
  historyPublicToSubscribers: Option[Boolean],
  firstMessageId: Option[Int],
  isAnnouncementOnly: Option[Boolean]
)

