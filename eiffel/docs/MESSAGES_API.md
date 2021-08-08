# MESSAGES_API

All URIs are relative to *https://example.zulipchat.com/api/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**add_reaction**](MESSAGES_API.md#add_reaction) | **Post** /messages/{message_id}/reactions | Add an emoji reaction
[**check_messages_match_narrow**](MESSAGES_API.md#check_messages_match_narrow) | **Get** /messages/matches_narrow | Check if messages match a narrow
[**delete_message**](MESSAGES_API.md#delete_message) | **Delete** /messages/{message_id} | Delete a message
[**file_temporary_url**](MESSAGES_API.md#file_temporary_url) | **Get** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
[**mark_all_as_read**](MESSAGES_API.md#mark_all_as_read) | **Post** /mark_all_as_read | Mark all messages as read
[**mark_stream_as_read**](MESSAGES_API.md#mark_stream_as_read) | **Post** /mark_stream_as_read | Mark messages in a stream as read
[**mark_topic_as_read**](MESSAGES_API.md#mark_topic_as_read) | **Post** /mark_topic_as_read | Mark messages in a topic as read
[**message_history**](MESSAGES_API.md#message_history) | **Get** /messages/{message_id}/history | Get a message&#39;s edit history
[**messages**](MESSAGES_API.md#messages) | **Get** /messages | Get messages
[**raw_message**](MESSAGES_API.md#raw_message) | **Get** /messages/{message_id} | Get a message&#39;s raw Markdown
[**remove_reaction**](MESSAGES_API.md#remove_reaction) | **Delete** /messages/{message_id}/reactions | Remove an emoji reaction
[**render_message**](MESSAGES_API.md#render_message) | **Post** /messages/render | Render message
[**send_message**](MESSAGES_API.md#send_message) | **Post** /messages | Send a message
[**update_message**](MESSAGES_API.md#update_message) | **Patch** /messages/{message_id} | Edit a message
[**update_message_flags**](MESSAGES_API.md#update_message_flags) | **Post** /messages/flags | Update personal message flags
[**upload_file**](MESSAGES_API.md#upload_file) | **Post** /user_uploads | Upload a file


# **add_reaction**
> add_reaction (message_id: INTEGER_32 ; emoji_name: STRING_32 ; emoji_code:  detachable STRING_32 ; reaction_type:  detachable STRING_32 ): detachable JSON_SUCCESS
	

Add an emoji reaction

Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_id** | **INTEGER_32**| The target message&#39;s ID.  | [default to null]
 **emoji_name** | **STRING_32**| The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | [default to null]
 **emoji_code** | **STRING_32**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | [optional] [default to null]
 **reaction_type** | **STRING_32**| If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional] [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **check_messages_match_narrow**
> check_messages_match_narrow (msg_ids: LIST [INTEGER_32] ; narrow: LIST [ANY] ): detachable ANY
	

Check if messages match a narrow

Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msg_ids** | [**LIST [INTEGER_32]**](INTEGER_32.md)| List of IDs for the messages to check. | [default to null]
 **narrow** | [**LIST [ANY]**](ANY.md)| A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow). | [default to null]

### Return type

[**ANY**](ANY.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_message**
> delete_message (message_id: INTEGER_32 ): detachable JSON_SUCCESS
	

Delete a message

Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_id** | **INTEGER_32**| The target message&#39;s ID.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **file_temporary_url**
> file_temporary_url (realm_id_str: INTEGER_32 ; filename: STRING_32 ): detachable JSON_SUCCESS_BASE
	

Get public temporary URL

Get a temporary URL for access to the file that doesn't require authentication. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realm_id_str** | **INTEGER_32**| The realm id.  | [default to null]
 **filename** | **STRING_32**| Path to the URL.  | [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mark_all_as_read**
> mark_all_as_read : detachable JSON_SUCCESS
	

Mark all messages as read

Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 


### Parameters
This endpoint does not need any parameter.

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mark_stream_as_read**
> mark_stream_as_read (stream_id: INTEGER_32 ): detachable JSON_SUCCESS
	

Mark messages in a stream as read

Mark all the unread messages in a stream as read. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream_id** | **INTEGER_32**| The ID of the stream to access.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mark_topic_as_read**
> mark_topic_as_read (stream_id: INTEGER_32 ; topic_name: STRING_32 ): detachable JSON_SUCCESS
	

Mark messages in a topic as read

Mark all the unread messages in a topic as read. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream_id** | **INTEGER_32**| The ID of the stream to access.  | [default to null]
 **topic_name** | **STRING_32**| The name of the topic whose messages should be marked as read.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **message_history**
> message_history (message_id: INTEGER_32 ): detachable JSON_SUCCESS_BASE
	

Get a message's edit history

Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_id** | **INTEGER_32**| The target message&#39;s ID.  | [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **messages**
> messages (num_before: INTEGER_32 ; num_after: INTEGER_32 ; anchor:  detachable ONE_OFSTRINGINTEGER ; narrow:  detachable LIST [ANY] ; client_gravatar:  detachable BOOLEAN ; apply_markdown:  detachable BOOLEAN ; use_first_unread_anchor:  detachable BOOLEAN ): detachable JSON_SUCCESS_BASE
	

Get messages

Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **num_before** | **INTEGER_32**| The number of messages with IDs less than the anchor to retrieve.  | [default to null]
 **num_after** | **INTEGER_32**| The number of messages with IDs greater than the anchor to retrieve.  | [default to null]
 **anchor** | [**ONE_OFSTRINGINTEGER**](.md)| Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value).  | [optional] [default to null]
 **narrow** | [**LIST [ANY]**](ANY.md)| The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  | [optional] [default to []]
 **client_gravatar** | **BOOLEAN**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **apply_markdown** | **BOOLEAN**| If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered.  | [optional] [default to true]
 **use_first_unread_anchor** | **BOOLEAN**| Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead.  | [optional] [default to false]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **raw_message**
> raw_message (message_id: INTEGER_32 ): detachable JSON_SUCCESS_BASE
	

Get a message's raw Markdown

Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_id** | **INTEGER_32**| The target message&#39;s ID.  | [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_reaction**
> remove_reaction (message_id: INTEGER_32 ; emoji_name:  detachable STRING_32 ; emoji_code:  detachable STRING_32 ; reaction_type:  detachable STRING_32 ): detachable JSON_SUCCESS
	

Remove an emoji reaction

Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_id** | **INTEGER_32**| The target message&#39;s ID.  | [default to null]
 **emoji_name** | **STRING_32**| The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | [optional] [default to null]
 **emoji_code** | **STRING_32**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | [optional] [default to null]
 **reaction_type** | **STRING_32**| If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional] [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **render_message**
> render_message (content: STRING_32 ): detachable JSON_SUCCESS_BASE
	

Render message

Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **STRING_32**| The content of the message. Maximum message size of 10000 bytes.  | [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_message**
> send_message (type: STRING_32 ; to: LIST [INTEGER_32] ; content: STRING_32 ; topic:  detachable STRING_32 ; queue_id:  detachable STRING_32 ; local_id:  detachable STRING_32 ): detachable JSON_SUCCESS_BASE
	

Send a message

Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **STRING_32**| The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message.  | [default to null]
 **to** | [**LIST [INTEGER_32]**](INTEGER_32.md)| For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0.  | [default to null]
 **content** | **STRING_32**| The content of the message. Maximum message size of 10000 bytes.  | [default to null]
 **topic** | **STRING_32**| The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional] [default to null]
 **queue_id** | **STRING_32**| For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  | [optional] [default to null]
 **local_id** | **STRING_32**| For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description.  | [optional] [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_message**
> update_message (message_id: INTEGER_32 ; topic:  detachable STRING_32 ; propagate_mode:  detachable STRING_32 ; send_notification_to_old_thread:  detachable BOOLEAN ; send_notification_to_new_thread:  detachable BOOLEAN ; content:  detachable STRING_32 ; stream_id:  detachable INTEGER_32 ): detachable JSON_SUCCESS
	

Edit a message

Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_id** | **INTEGER_32**| The target message&#39;s ID.  | [default to null]
 **topic** | **STRING_32**| The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional] [default to null]
 **propagate_mode** | **STRING_32**| Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  | [optional] [default to change_one]
 **send_notification_to_old_thread** | **BOOLEAN**| Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional] [default to true]
 **send_notification_to_new_thread** | **BOOLEAN**| Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional] [default to true]
 **content** | **STRING_32**| The content of the message. Maximum message size of 10000 bytes.  | [optional] [default to null]
 **stream_id** | **INTEGER_32**| The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  | [optional] [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_message_flags**
> update_message_flags (messages: LIST [INTEGER_32] ; op: STRING_32 ; flag: STRING_32 ): detachable JSON_SUCCESS_BASE
	

Update personal message flags

Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messages** | [**LIST [INTEGER_32]**](INTEGER_32.md)| An array containing the IDs of the target messages.  | [default to null]
 **op** | **STRING_32**| Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it.  | [default to null]
 **flag** | **STRING_32**| The flag that should be added/removed.  | [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_file**
> upload_file (filename:  detachable FILE ): detachable JSON_SUCCESS_BASE
	

Upload a file

Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **FILE**|  | [optional] [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

