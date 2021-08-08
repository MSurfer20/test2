
package org.openapitools.client.model


case class BasicStreamBase (
    /* The unique ID of the stream.  */
    _streamId: Option[Integer],
    /* The name of the stream.  */
    _name: Option[String],
    /* The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.  */
    _description: Option[String],
    /* The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  */
    _dateCreated: Option[Integer],
    /* Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  */
    _inviteOnly: Option[Boolean],
    /* The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  */
    _renderedDescription: Option[String],
    /* Whether the stream has been configured to allow unauthenticated access to its message history from the web.  */
    _isWebPublic: Option[Boolean],
    /* Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  */
    _streamPostPolicy: Option[Integer],
    /* Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  */
    _messageRetentionDays: Option[Integer],
    /* Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future.  */
    _historyPublicToSubscribers: Option[Boolean],
    /* The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  */
    _firstMessageId: Option[Integer],
    /* Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.  */
    _isAnnouncementOnly: Option[Boolean]
)
object BasicStreamBase {
    def toStringBody(var_streamId: Object, var_name: Object, var_description: Object, var_dateCreated: Object, var_inviteOnly: Object, var_renderedDescription: Object, var_isWebPublic: Object, var_streamPostPolicy: Object, var_messageRetentionDays: Object, var_historyPublicToSubscribers: Object, var_firstMessageId: Object, var_isAnnouncementOnly: Object) =
        s"""
        | {
        | "streamId":$var_streamId,"name":$var_name,"description":$var_description,"dateCreated":$var_dateCreated,"inviteOnly":$var_inviteOnly,"renderedDescription":$var_renderedDescription,"isWebPublic":$var_isWebPublic,"streamPostPolicy":$var_streamPostPolicy,"messageRetentionDays":$var_messageRetentionDays,"historyPublicToSubscribers":$var_historyPublicToSubscribers,"firstMessageId":$var_firstMessageId,"isAnnouncementOnly":$var_isAnnouncementOnly
        | }
        """.stripMargin
}
