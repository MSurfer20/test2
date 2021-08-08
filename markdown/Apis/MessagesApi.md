# MessagesApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addReaction**](MessagesApi.md#addReaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
[**checkMessagesMatchNarrow**](MessagesApi.md#checkMessagesMatchNarrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
[**deleteMessage**](MessagesApi.md#deleteMessage) | **DELETE** /messages/{message_id} | Delete a message
[**getFileTemporaryUrl**](MessagesApi.md#getFileTemporaryUrl) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
[**getMessageHistory**](MessagesApi.md#getMessageHistory) | **GET** /messages/{message_id}/history | Get a message&#39;s edit history
[**getMessages**](MessagesApi.md#getMessages) | **GET** /messages | Get messages
[**getRawMessage**](MessagesApi.md#getRawMessage) | **GET** /messages/{message_id} | Get a message&#39;s raw Markdown
[**markAllAsRead**](MessagesApi.md#markAllAsRead) | **POST** /mark_all_as_read | Mark all messages as read
[**markStreamAsRead**](MessagesApi.md#markStreamAsRead) | **POST** /mark_stream_as_read | Mark messages in a stream as read
[**markTopicAsRead**](MessagesApi.md#markTopicAsRead) | **POST** /mark_topic_as_read | Mark messages in a topic as read
[**removeReaction**](MessagesApi.md#removeReaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
[**renderMessage**](MessagesApi.md#renderMessage) | **POST** /messages/render | Render message
[**sendMessage**](MessagesApi.md#sendMessage) | **POST** /messages | Send a message
[**updateMessage**](MessagesApi.md#updateMessage) | **PATCH** /messages/{message_id} | Edit a message
[**updateMessageFlags**](MessagesApi.md#updateMessageFlags) | **POST** /messages/flags | Update personal message flags
[**uploadFile**](MessagesApi.md#uploadFile) | **POST** /user_uploads | Upload a file


<a name="addReaction"></a>
# **addReaction**
> JsonSuccess addReaction(message\_id, emoji\_name, emoji\_code, reaction\_type)

Add an emoji reaction

    Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message\_id** | **Integer**| The target message&#39;s ID.  | [default to null]
 **emoji\_name** | **String**| The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | [default to null]
 **emoji\_code** | **String**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | [optional] [default to null]
 **reaction\_type** | **String**| If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional] [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="checkMessagesMatchNarrow"></a>
# **checkMessagesMatchNarrow**
> oas_any_type_not_mapped checkMessagesMatchNarrow(msg\_ids, narrow)

Check if messages match a narrow

    Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msg\_ids** | [**List**](../Models/Integer.md)| List of IDs for the messages to check. | [default to null]
 **narrow** | [**List**](../Models/Object.md)| A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow). | [default to null]

### Return type

[**oas_any_type_not_mapped**](../Models/AnyType.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteMessage"></a>
# **deleteMessage**
> JsonSuccess deleteMessage(message\_id)

Delete a message

    Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message\_id** | **Integer**| The target message&#39;s ID.  | [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getFileTemporaryUrl"></a>
# **getFileTemporaryUrl**
> JsonSuccessBase getFileTemporaryUrl(realm\_id\_str, filename)

Get public temporary URL

    Get a temporary URL for access to the file that doesn&#39;t require authentication. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realm\_id\_str** | **Integer**| The realm id.  | [default to null]
 **filename** | **String**| Path to the URL.  | [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getMessageHistory"></a>
# **getMessageHistory**
> JsonSuccessBase getMessageHistory(message\_id)

Get a message&#39;s edit history

    Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message\_id** | **Integer**| The target message&#39;s ID.  | [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getMessages"></a>
# **getMessages**
> JsonSuccessBase getMessages(num\_before, num\_after, anchor, narrow, client\_gravatar, apply\_markdown, use\_first\_unread\_anchor)

Get messages

    Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **num\_before** | **Integer**| The number of messages with IDs less than the anchor to retrieve.  | [default to null]
 **num\_after** | **Integer**| The number of messages with IDs greater than the anchor to retrieve.  | [default to null]
 **anchor** | [**oneOf&lt;string,integer&gt;**](../Models/.md)| Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value).  | [optional] [default to null]
 **narrow** | [**List**](../Models/Object.md)| The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  | [optional] [default to []]
 **client\_gravatar** | **Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **apply\_markdown** | **Boolean**| If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered.  | [optional] [default to true]
 **use\_first\_unread\_anchor** | **Boolean**| Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getRawMessage"></a>
# **getRawMessage**
> JsonSuccessBase getRawMessage(message\_id)

Get a message&#39;s raw Markdown

    Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI). 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message\_id** | **Integer**| The target message&#39;s ID.  | [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="markAllAsRead"></a>
# **markAllAsRead**
> JsonSuccess markAllAsRead()

Mark all messages as read

    Marks all of the current user&#39;s unread messages as read.  &#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60; 

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="markStreamAsRead"></a>
# **markStreamAsRead**
> JsonSuccess markStreamAsRead(stream\_id)

Mark messages in a stream as read

    Mark all the unread messages in a stream as read. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream\_id** | **Integer**| The ID of the stream to access.  | [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="markTopicAsRead"></a>
# **markTopicAsRead**
> JsonSuccess markTopicAsRead(stream\_id, topic\_name)

Mark messages in a topic as read

    Mark all the unread messages in a topic as read. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream\_id** | **Integer**| The ID of the stream to access.  | [default to null]
 **topic\_name** | **String**| The name of the topic whose messages should be marked as read.  | [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="removeReaction"></a>
# **removeReaction**
> JsonSuccess removeReaction(message\_id, emoji\_name, emoji\_code, reaction\_type)

Remove an emoji reaction

    Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message\_id** | **Integer**| The target message&#39;s ID.  | [default to null]
 **emoji\_name** | **String**| The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | [optional] [default to null]
 **emoji\_code** | **String**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | [optional] [default to null]
 **reaction\_type** | **String**| If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional] [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="renderMessage"></a>
# **renderMessage**
> JsonSuccessBase renderMessage(content)

Render message

    Render a message to HTML.  &#x60;POST {{ api_url }}/v1/messages/render&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **String**| The content of the message. Maximum message size of 10000 bytes.  | [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="sendMessage"></a>
# **sendMessage**
> JsonSuccessBase sendMessage(type, to, content, topic, queue\_id, local\_id)

Send a message

    Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message.  | [default to null] [enum: private, stream]
 **to** | [**List**](../Models/Integer.md)| For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0.  | [default to null]
 **content** | **String**| The content of the message. Maximum message size of 10000 bytes.  | [default to null]
 **topic** | **String**| The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional] [default to null]
 **queue\_id** | **String**| For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  | [optional] [default to null]
 **local\_id** | **String**| For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description.  | [optional] [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateMessage"></a>
# **updateMessage**
> JsonSuccess updateMessage(message\_id, topic, propagate\_mode, send\_notification\_to\_old\_thread, send\_notification\_to\_new\_thread, content, stream\_id)

Edit a message

    Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;✔ {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message\_id** | **Integer**| The target message&#39;s ID.  | [default to null]
 **topic** | **String**| The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional] [default to null]
 **propagate\_mode** | **String**| Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  | [optional] [default to change_one] [enum: change_one, change_later, change_all]
 **send\_notification\_to\_old\_thread** | **Boolean**| Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional] [default to true]
 **send\_notification\_to\_new\_thread** | **Boolean**| Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional] [default to true]
 **content** | **String**| The content of the message. Maximum message size of 10000 bytes.  | [optional] [default to null]
 **stream\_id** | **Integer**| The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  | [optional] [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateMessageFlags"></a>
# **updateMessageFlags**
> JsonSuccessBase updateMessageFlags(messages, op, flag)

Update personal message flags

    Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60; on a collection of message IDs.  &#x60;POST {{ api_url }}/v1/messages/flags&#x60;  For updating the &#x60;read&#x60; flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messages** | [**List**](../Models/Integer.md)| An array containing the IDs of the target messages.  | [default to null]
 **op** | **String**| Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it.  | [default to null] [enum: add, remove]
 **flag** | **String**| The flag that should be added/removed.  | [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="uploadFile"></a>
# **uploadFile**
> JsonSuccessBase uploadFile(filename)

Upload a file

    Upload a single file and get the corresponding URI.  &#x60;POST {{ api_url }}/v1/user_uploads&#x60;  Initially, only you will be able to access the link.  To share the uploaded file, you&#39;ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **File**|  | [optional] [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

