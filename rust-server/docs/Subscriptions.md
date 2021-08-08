# Subscriptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stream_id** | **isize** | The unique ID of a stream.  | [optional] [default to None]
**name** | **String** | The name of a stream.  | [optional] [default to None]
**description** | **String** | The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.  | [optional] [default to None]
**rendered_description** | **String** | A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  | [optional] [default to None]
**date_created** | **isize** | The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  | [optional] [default to None]
**invite_only** | **bool** | Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  | [optional] [default to None]
**subscribers** | **Vec<i32>** | A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`.  | [optional] [default to None]
**desktop_notifications** | **bool** | A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream.  | [optional] [default to None]
**email_notifications** | **bool** | A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream.  | [optional] [default to None]
**wildcard_mentions_notify** | **bool** | A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream.  | [optional] [default to None]
**push_notifications** | **bool** | A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream.  | [optional] [default to None]
**audible_notifications** | **bool** | A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream.  | [optional] [default to None]
**pin_to_top** | **bool** | A boolean specifying whether the given stream has been pinned to the top.  | [optional] [default to None]
**email_address** | **String** | Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email).  | [optional] [default to None]
**is_muted** | **bool** | Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`).  | [optional] [default to None]
**in_home_view** | **bool** | Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available.  | [optional] [default to None]
**is_announcement_only** | **bool** | Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.  | [optional] [default to None]
**is_web_public** | **bool** | Whether the stream has been configured to allow unauthenticated access to its message history from the web.  | [optional] [default to None]
**role** | **isize** | The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31).  | [optional] [default to None]
**color** | **String** | The user's personal color for the stream.  | [optional] [default to None]
**stream_post_policy** | **isize** | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  | [optional] [default to None]
**message_retention_days** | **isize** | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] [default to None]
**history_public_to_subscribers** | **bool** | Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future.  | [optional] [default to None]
**first_message_id** | **isize** | The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  | [optional] [default to None]
**stream_weekly_traffic** | **isize** | The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


