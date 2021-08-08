
# Table `BasicStreamBase` 
(mapped from: BasicStreamBase)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**streamId** | stream_id | int |  | **kotlin.Int** | The unique ID of the stream.  |  [optional]
**name** | name | text |  | **kotlin.String** | The name of the stream.  |  [optional]
**description** | description | text |  | **kotlin.String** | The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description.  |  [optional]
**dateCreated** | date_created | int |  | **kotlin.Int** | The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  |  [optional]
**inviteOnly** | invite_only | boolean |  | **kotlin.Boolean** | Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  |  [optional]
**renderedDescription** | rendered_description | text |  | **kotlin.String** | The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  |  [optional]
**isWebPublic** | is_web_public | boolean |  | **kotlin.Boolean** | Whether the stream has been configured to allow unauthenticated access to its message history from the web.  |  [optional]
**streamPostPolicy** | stream_post_policy | int |  | **kotlin.Int** | Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  |  [optional]
**messageRetentionDays** | message_retention_days | int |  | **kotlin.Int** | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  |  [optional]
**historyPublicToSubscribers** | history_public_to_subscribers | boolean |  | **kotlin.Boolean** | Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future.  |  [optional]
**firstMessageId** | first_message_id | int |  | **kotlin.Int** | The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  |  [optional]
**isAnnouncementOnly** | is_announcement_only | boolean |  | **kotlin.Boolean** | Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead.  |  [optional]














