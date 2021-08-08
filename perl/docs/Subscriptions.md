# WWW::OpenAPIClient::Object::Subscriptions

## Load the model package
```perl
use WWW::OpenAPIClient::Object::Subscriptions;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stream_id** | **int** | The unique ID of a stream.  | [optional] 
**name** | **string** | The name of a stream.  | [optional] 
**description** | **string** | The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description.  | [optional] 
**rendered_description** | **string** | A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  | [optional] 
**date_created** | **int** | The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  | [optional] 
**invite_only** | **boolean** | Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  | [optional] 
**subscribers** | **ARRAY[int]** | A list of user IDs of users who are also subscribed to a given stream. Included only if &#x60;include_subscribers&#x60; is &#x60;true&#x60;.  | [optional] 
**desktop_notifications** | **boolean** | A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream.  | [optional] 
**email_notifications** | **boolean** | A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream.  | [optional] 
**wildcard_mentions_notify** | **boolean** | A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream.  | [optional] 
**push_notifications** | **boolean** | A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream.  | [optional] 
**audible_notifications** | **boolean** | A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream.  | [optional] 
**pin_to_top** | **boolean** | A boolean specifying whether the given stream has been pinned to the top.  | [optional] 
**email_address** | **string** | Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email).  | [optional] 
**is_muted** | **boolean** | Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in &#x60;All messages&#x60; view (previously known as &#x60;Home&#x60; view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named &#x60;in_home_view&#x60; (with the opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;).  | [optional] 
**in_home_view** | **boolean** | Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available.  | [optional] 
**is_announcement_only** | **boolean** | Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead.  | [optional] 
**is_web_public** | **boolean** | Whether the stream has been configured to allow unauthenticated access to its message history from the web.  | [optional] 
**role** | **int** | The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31).  | [optional] 
**color** | **string** | The user&#39;s personal color for the stream.  | [optional] 
**stream_post_policy** | **int** | Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] 
**message_retention_days** | **int** | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 
**history_public_to_subscribers** | **boolean** | Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future.  | [optional] 
**first_message_id** | **int** | The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  | [optional] 
**stream_weekly_traffic** | **int** | The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


