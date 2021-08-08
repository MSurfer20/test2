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
> JsonSuccess addReaction(messageId, emojiName, emojiCode, reactionType)

Add an emoji reaction

Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val messageId : kotlin.Int = 42 // kotlin.Int | The target message's ID. 
val emojiName : kotlin.String = octopus // kotlin.String | The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
val emojiCode : kotlin.String = 1f419 // kotlin.String | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
val reactionType : kotlin.String = unicode_emoji // kotlin.String | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
try {
    val result : JsonSuccess = apiInstance.addReaction(messageId, emojiName, emojiCode, reactionType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#addReaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#addReaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **kotlin.Int**| The target message&#39;s ID.  |
 **emojiName** | **kotlin.String**| The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  |
 **emojiCode** | **kotlin.String**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | [optional]
 **reactionType** | **kotlin.String**| If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="checkMessagesMatchNarrow"></a>
# **checkMessagesMatchNarrow**
> AnyType checkMessagesMatchNarrow(msgIds, narrow)

Check if messages match a narrow

Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val msgIds : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | List of IDs for the messages to check.
val narrow : kotlin.collections.List<kotlin.Any> =  // kotlin.collections.List<kotlin.Any> | A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).
try {
    val result : AnyType = apiInstance.checkMessagesMatchNarrow(msgIds, narrow)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#checkMessagesMatchNarrow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#checkMessagesMatchNarrow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgIds** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| List of IDs for the messages to check. |
 **narrow** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md)| A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow). |

### Return type

[**AnyType**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteMessage"></a>
# **deleteMessage**
> JsonSuccess deleteMessage(messageId)

Delete a message

Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val messageId : kotlin.Int = 42 // kotlin.Int | The target message's ID. 
try {
    val result : JsonSuccess = apiInstance.deleteMessage(messageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#deleteMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#deleteMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **kotlin.Int**| The target message&#39;s ID.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFileTemporaryUrl"></a>
# **getFileTemporaryUrl**
> JsonSuccessBase getFileTemporaryUrl(realmIdStr, filename)

Get public temporary URL

Get a temporary URL for access to the file that doesn&#39;t require authentication. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val realmIdStr : kotlin.Int = 1 // kotlin.Int | The realm id. 
val filename : kotlin.String = 4e/m2A3MSqFnWRLUf9SaPzQ0Up_/zulip.txt // kotlin.String | Path to the URL. 
try {
    val result : JsonSuccessBase = apiInstance.getFileTemporaryUrl(realmIdStr, filename)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#getFileTemporaryUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#getFileTemporaryUrl")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmIdStr** | **kotlin.Int**| The realm id.  |
 **filename** | **kotlin.String**| Path to the URL.  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMessageHistory"></a>
# **getMessageHistory**
> JsonSuccessBase getMessageHistory(messageId)

Get a message&#39;s edit history

Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val messageId : kotlin.Int = 42 // kotlin.Int | The target message's ID. 
try {
    val result : JsonSuccessBase = apiInstance.getMessageHistory(messageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#getMessageHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#getMessageHistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **kotlin.Int**| The target message&#39;s ID.  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMessages"></a>
# **getMessages**
> JsonSuccessBase getMessages(numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor)

Get messages

Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val numBefore : kotlin.Int = 4 // kotlin.Int | The number of messages with IDs less than the anchor to retrieve. 
val numAfter : kotlin.Int = 8 // kotlin.Int | The number of messages with IDs greater than the anchor to retrieve. 
val anchor : OneOfLessThanStringCommaIntegerGreaterThan = 42 // OneOfLessThanStringCommaIntegerGreaterThan | Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value). 
val narrow : kotlin.collections.List<kotlin.Any> =  // kotlin.collections.List<kotlin.Any> | The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). 
val clientGravatar : kotlin.Boolean = true // kotlin.Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
val applyMarkdown : kotlin.Boolean = false // kotlin.Boolean | If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered. 
val useFirstUnreadAnchor : kotlin.Boolean = true // kotlin.Boolean | Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead. 
try {
    val result : JsonSuccessBase = apiInstance.getMessages(numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#getMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#getMessages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numBefore** | **kotlin.Int**| The number of messages with IDs less than the anchor to retrieve.  |
 **numAfter** | **kotlin.Int**| The number of messages with IDs greater than the anchor to retrieve.  |
 **anchor** | [**OneOfLessThanStringCommaIntegerGreaterThan**](.md)| Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value).  | [optional]
 **narrow** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md)| The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  | [optional]
 **clientGravatar** | **kotlin.Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **applyMarkdown** | **kotlin.Boolean**| If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered.  | [optional] [default to true]
 **useFirstUnreadAnchor** | **kotlin.Boolean**| Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRawMessage"></a>
# **getRawMessage**
> JsonSuccessBase getRawMessage(messageId)

Get a message&#39;s raw Markdown

Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val messageId : kotlin.Int = 42 // kotlin.Int | The target message's ID. 
try {
    val result : JsonSuccessBase = apiInstance.getRawMessage(messageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#getRawMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#getRawMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **kotlin.Int**| The target message&#39;s ID.  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

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

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
try {
    val result : JsonSuccess = apiInstance.markAllAsRead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#markAllAsRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#markAllAsRead")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="markStreamAsRead"></a>
# **markStreamAsRead**
> JsonSuccess markStreamAsRead(streamId)

Mark messages in a stream as read

Mark all the unread messages in a stream as read. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val streamId : kotlin.Int = 42 // kotlin.Int | The ID of the stream to access. 
try {
    val result : JsonSuccess = apiInstance.markStreamAsRead(streamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#markStreamAsRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#markStreamAsRead")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **kotlin.Int**| The ID of the stream to access.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="markTopicAsRead"></a>
# **markTopicAsRead**
> JsonSuccess markTopicAsRead(streamId, topicName)

Mark messages in a topic as read

Mark all the unread messages in a topic as read. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val streamId : kotlin.Int = 42 // kotlin.Int | The ID of the stream to access. 
val topicName : kotlin.String = new coffee machine // kotlin.String | The name of the topic whose messages should be marked as read. 
try {
    val result : JsonSuccess = apiInstance.markTopicAsRead(streamId, topicName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#markTopicAsRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#markTopicAsRead")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **kotlin.Int**| The ID of the stream to access.  |
 **topicName** | **kotlin.String**| The name of the topic whose messages should be marked as read.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeReaction"></a>
# **removeReaction**
> JsonSuccess removeReaction(messageId, emojiName, emojiCode, reactionType)

Remove an emoji reaction

Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val messageId : kotlin.Int = 42 // kotlin.Int | The target message's ID. 
val emojiName : kotlin.String = octopus // kotlin.String | The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
val emojiCode : kotlin.String = 1f419 // kotlin.String | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
val reactionType : kotlin.String = unicode_emoji // kotlin.String | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
try {
    val result : JsonSuccess = apiInstance.removeReaction(messageId, emojiName, emojiCode, reactionType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#removeReaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#removeReaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **kotlin.Int**| The target message&#39;s ID.  |
 **emojiName** | **kotlin.String**| The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | [optional]
 **emojiCode** | **kotlin.String**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | [optional]
 **reactionType** | **kotlin.String**| If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional]

### Return type

[**JsonSuccess**](JsonSuccess.md)

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

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val content : kotlin.String = Hello // kotlin.String | The content of the message. Maximum message size of 10000 bytes. 
try {
    val result : JsonSuccessBase = apiInstance.renderMessage(content)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#renderMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#renderMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **kotlin.String**| The content of the message. Maximum message size of 10000 bytes.  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendMessage"></a>
# **sendMessage**
> JsonSuccessBase sendMessage(type, to, content, topic, queueId, localId)

Send a message

Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val type : kotlin.String = private // kotlin.String | The type of message to be sent. `private` for a private message and `stream` for a stream message. 
val to : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
val content : kotlin.String = Hello // kotlin.String | The content of the message. Maximum message size of 10000 bytes. 
val topic : kotlin.String = Castle // kotlin.String | The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
val queueId : kotlin.String = 1593114627:0 // kotlin.String | For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). 
val localId : kotlin.String = 100.01 // kotlin.String | For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description. 
try {
    val result : JsonSuccessBase = apiInstance.sendMessage(type, to, content, topic, queueId, localId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#sendMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#sendMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **kotlin.String**| The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message.  | [enum: private, stream]
 **to** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0.  |
 **content** | **kotlin.String**| The content of the message. Maximum message size of 10000 bytes.  |
 **topic** | **kotlin.String**| The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional]
 **queueId** | **kotlin.String**| For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  | [optional]
 **localId** | **kotlin.String**| For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description.  | [optional]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMessage"></a>
# **updateMessage**
> JsonSuccess updateMessage(messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId)

Edit a message

Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;✔ {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val messageId : kotlin.Int = 42 // kotlin.Int | The target message's ID. 
val topic : kotlin.String = Castle // kotlin.String | The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
val propagateMode : kotlin.String = change_all // kotlin.String | Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. 
val sendNotificationToOldThread : kotlin.Boolean = true // kotlin.Boolean | Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). 
val sendNotificationToNewThread : kotlin.Boolean = true // kotlin.Boolean | Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). 
val content : kotlin.String = Hello // kotlin.String | The content of the message. Maximum message size of 10000 bytes. 
val streamId : kotlin.Int = 42 // kotlin.Int | The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. 
try {
    val result : JsonSuccess = apiInstance.updateMessage(messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#updateMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#updateMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **kotlin.Int**| The target message&#39;s ID.  |
 **topic** | **kotlin.String**| The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional]
 **propagateMode** | **kotlin.String**| Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  | [optional] [default to change_one] [enum: change_one, change_later, change_all]
 **sendNotificationToOldThread** | **kotlin.Boolean**| Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional] [default to true]
 **sendNotificationToNewThread** | **kotlin.Boolean**| Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional] [default to true]
 **content** | **kotlin.String**| The content of the message. Maximum message size of 10000 bytes.  | [optional]
 **streamId** | **kotlin.Int**| The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  | [optional]

### Return type

[**JsonSuccess**](JsonSuccess.md)

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

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val messages : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | An array containing the IDs of the target messages. 
val op : kotlin.String = add // kotlin.String | Whether to `add` the flag or `remove` it. 
val flag : kotlin.String = read // kotlin.String | The flag that should be added/removed. 
try {
    val result : JsonSuccessBase = apiInstance.updateMessageFlags(messages, op, flag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#updateMessageFlags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#updateMessageFlags")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messages** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| An array containing the IDs of the target messages.  |
 **op** | **kotlin.String**| Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it.  | [enum: add, remove]
 **flag** | **kotlin.String**| The flag that should be added/removed.  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

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

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MessagesApi()
val filename : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : JsonSuccessBase = apiInstance.uploadFile(filename)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#uploadFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#uploadFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **java.io.File**|  | [optional]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

