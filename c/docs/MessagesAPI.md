# MessagesAPI

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MessagesAPI_addReaction**](MessagesAPI.md#MessagesAPI_addReaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
[**MessagesAPI_checkMessagesMatchNarrow**](MessagesAPI.md#MessagesAPI_checkMessagesMatchNarrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
[**MessagesAPI_deleteMessage**](MessagesAPI.md#MessagesAPI_deleteMessage) | **DELETE** /messages/{message_id} | Delete a message
[**MessagesAPI_getFileTemporaryUrl**](MessagesAPI.md#MessagesAPI_getFileTemporaryUrl) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
[**MessagesAPI_getMessageHistory**](MessagesAPI.md#MessagesAPI_getMessageHistory) | **GET** /messages/{message_id}/history | Get a message&#39;s edit history
[**MessagesAPI_getMessages**](MessagesAPI.md#MessagesAPI_getMessages) | **GET** /messages | Get messages
[**MessagesAPI_getRawMessage**](MessagesAPI.md#MessagesAPI_getRawMessage) | **GET** /messages/{message_id} | Get a message&#39;s raw Markdown
[**MessagesAPI_markAllAsRead**](MessagesAPI.md#MessagesAPI_markAllAsRead) | **POST** /mark_all_as_read | Mark all messages as read
[**MessagesAPI_markStreamAsRead**](MessagesAPI.md#MessagesAPI_markStreamAsRead) | **POST** /mark_stream_as_read | Mark messages in a stream as read
[**MessagesAPI_markTopicAsRead**](MessagesAPI.md#MessagesAPI_markTopicAsRead) | **POST** /mark_topic_as_read | Mark messages in a topic as read
[**MessagesAPI_removeReaction**](MessagesAPI.md#MessagesAPI_removeReaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
[**MessagesAPI_renderMessage**](MessagesAPI.md#MessagesAPI_renderMessage) | **POST** /messages/render | Render message
[**MessagesAPI_sendMessage**](MessagesAPI.md#MessagesAPI_sendMessage) | **POST** /messages | Send a message
[**MessagesAPI_updateMessage**](MessagesAPI.md#MessagesAPI_updateMessage) | **PATCH** /messages/{message_id} | Edit a message
[**MessagesAPI_updateMessageFlags**](MessagesAPI.md#MessagesAPI_updateMessageFlags) | **POST** /messages/flags | Update personal message flags
[**MessagesAPI_uploadFile**](MessagesAPI.md#MessagesAPI_uploadFile) | **POST** /user_uploads | Upload a file


# **MessagesAPI_addReaction**
```c
// Add an emoji reaction
//
// Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
//
json_success_t* MessagesAPI_addReaction(apiClient_t *apiClient, int message_id, char * emoji_name, char * emoji_code, char * reaction_type);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**message_id** | **int** | The target message&#39;s ID.  | 
**emoji_name** | **char \*** | The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | 
**emoji_code** | **char \*** | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | [optional] 
**reaction_type** | **char \*** | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional] 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_checkMessagesMatchNarrow**
```c
// Check if messages match a narrow
//
// Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
//
any_type_t* MessagesAPI_checkMessagesMatchNarrow(apiClient_t *apiClient, list_t * msg_ids, list_t * narrow);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**msg_ids** | **[list_t](int.md) \*** | List of IDs for the messages to check. | 
**narrow** | **[list_t](object.md) \*** | A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow). | 

### Return type

[any_type_t](any_type.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_deleteMessage**
```c
// Delete a message
//
// Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
//
json_success_t* MessagesAPI_deleteMessage(apiClient_t *apiClient, int message_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**message_id** | **int** | The target message&#39;s ID.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_getFileTemporaryUrl**
```c
// Get public temporary URL
//
// Get a temporary URL for access to the file that doesn't require authentication. 
//
json_success_base_t* MessagesAPI_getFileTemporaryUrl(apiClient_t *apiClient, int realm_id_str, char * filename);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**realm_id_str** | **int** | The realm id.  | 
**filename** | **char \*** | Path to the URL.  | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_getMessageHistory**
```c
// Get a message's edit history
//
// Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
//
json_success_base_t* MessagesAPI_getMessageHistory(apiClient_t *apiClient, int message_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**message_id** | **int** | The target message&#39;s ID.  | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_getMessages**
```c
// Get messages
//
// Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
//
json_success_base_t* MessagesAPI_getMessages(apiClient_t *apiClient, int num_before, int num_after, one_ofstringinteger_t * anchor, list_t * narrow, int client_gravatar, int apply_markdown, int use_first_unread_anchor);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**num_before** | **int** | The number of messages with IDs less than the anchor to retrieve.  | 
**num_after** | **int** | The number of messages with IDs greater than the anchor to retrieve.  | 
**anchor** | **[one_ofstringinteger_t](.md) \*** | Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value).  | [optional] 
**narrow** | **[list_t](object.md) \*** | The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  | [optional] 
**client_gravatar** | **int** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
**apply_markdown** | **int** | If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered.  | [optional] [default to true]
**use_first_unread_anchor** | **int** | Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead.  | [optional] [default to false]

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_getRawMessage**
```c
// Get a message's raw Markdown
//
// Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 
//
json_success_base_t* MessagesAPI_getRawMessage(apiClient_t *apiClient, int message_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**message_id** | **int** | The target message&#39;s ID.  | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_markAllAsRead**
```c
// Mark all messages as read
//
// Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
//
json_success_t* MessagesAPI_markAllAsRead(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_markStreamAsRead**
```c
// Mark messages in a stream as read
//
// Mark all the unread messages in a stream as read. 
//
json_success_t* MessagesAPI_markStreamAsRead(apiClient_t *apiClient, int stream_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**stream_id** | **int** | The ID of the stream to access.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_markTopicAsRead**
```c
// Mark messages in a topic as read
//
// Mark all the unread messages in a topic as read. 
//
json_success_t* MessagesAPI_markTopicAsRead(apiClient_t *apiClient, int stream_id, char * topic_name);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**stream_id** | **int** | The ID of the stream to access.  | 
**topic_name** | **char \*** | The name of the topic whose messages should be marked as read.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_removeReaction**
```c
// Remove an emoji reaction
//
// Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
//
json_success_t* MessagesAPI_removeReaction(apiClient_t *apiClient, int message_id, char * emoji_name, char * emoji_code, char * reaction_type);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**message_id** | **int** | The target message&#39;s ID.  | 
**emoji_name** | **char \*** | The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | [optional] 
**emoji_code** | **char \*** | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | [optional] 
**reaction_type** | **char \*** | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional] 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_renderMessage**
```c
// Render message
//
// Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
//
json_success_base_t* MessagesAPI_renderMessage(apiClient_t *apiClient, char * content);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**content** | **char \*** | The content of the message. Maximum message size of 10000 bytes.  | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_sendMessage**
```c
// Send a message
//
// Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
//
json_success_base_t* MessagesAPI_sendMessage(apiClient_t *apiClient, zulip_rest_api_sendMessage_type_e type, list_t * to, char * content, char * topic, char * queue_id, char * local_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**type** | **zulip_rest_api_sendMessage_type_e** | The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message.  | 
**to** | **[list_t](int.md) \*** | For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0.  | 
**content** | **char \*** | The content of the message. Maximum message size of 10000 bytes.  | 
**topic** | **char \*** | The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional] 
**queue_id** | **char \*** | For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  | [optional] 
**local_id** | **char \*** | For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description.  | [optional] 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_updateMessage**
```c
// Edit a message
//
// Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `??? {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
//
json_success_t* MessagesAPI_updateMessage(apiClient_t *apiClient, int message_id, char * topic, zulip_rest_api_updateMessage_propagate_mode_e propagate_mode, int send_notification_to_old_thread, int send_notification_to_new_thread, char * content, int stream_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**message_id** | **int** | The target message&#39;s ID.  | 
**topic** | **char \*** | The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional] 
**propagate_mode** | **zulip_rest_api_updateMessage_propagate_mode_e** | Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  | [optional] [default to &#39;change_one&#39;]
**send_notification_to_old_thread** | **int** | Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional] [default to true]
**send_notification_to_new_thread** | **int** | Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional] [default to true]
**content** | **char \*** | The content of the message. Maximum message size of 10000 bytes.  | [optional] 
**stream_id** | **int** | The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  | [optional] 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_updateMessageFlags**
```c
// Update personal message flags
//
// Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
//
json_success_base_t* MessagesAPI_updateMessageFlags(apiClient_t *apiClient, list_t * messages, zulip_rest_api_updateMessageFlags_op_e op, char * flag);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**messages** | **[list_t](int.md) \*** | An array containing the IDs of the target messages.  | 
**op** | **zulip_rest_api_updateMessageFlags_op_e** | Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it.  | 
**flag** | **char \*** | The flag that should be added/removed.  | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MessagesAPI_uploadFile**
```c
// Upload a file
//
// Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
//
json_success_base_t* MessagesAPI_uploadFile(apiClient_t *apiClient, binary_t* filename);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**filename** | **binary_t*** |  | [optional] 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

