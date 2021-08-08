# MessagesApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddReaction**](MessagesApi.md#AddReaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
[**CheckMessagesMatchNarrow**](MessagesApi.md#CheckMessagesMatchNarrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
[**DeleteMessage**](MessagesApi.md#DeleteMessage) | **DELETE** /messages/{message_id} | Delete a message
[**GetFileTemporaryUrl**](MessagesApi.md#GetFileTemporaryUrl) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
[**GetMessageHistory**](MessagesApi.md#GetMessageHistory) | **GET** /messages/{message_id}/history | Get a message&#39;s edit history
[**GetMessages**](MessagesApi.md#GetMessages) | **GET** /messages | Get messages
[**GetRawMessage**](MessagesApi.md#GetRawMessage) | **GET** /messages/{message_id} | Get a message&#39;s raw Markdown
[**MarkAllAsRead**](MessagesApi.md#MarkAllAsRead) | **POST** /mark_all_as_read | Mark all messages as read
[**MarkStreamAsRead**](MessagesApi.md#MarkStreamAsRead) | **POST** /mark_stream_as_read | Mark messages in a stream as read
[**MarkTopicAsRead**](MessagesApi.md#MarkTopicAsRead) | **POST** /mark_topic_as_read | Mark messages in a topic as read
[**RemoveReaction**](MessagesApi.md#RemoveReaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
[**RenderMessage**](MessagesApi.md#RenderMessage) | **POST** /messages/render | Render message
[**SendMessage**](MessagesApi.md#SendMessage) | **POST** /messages | Send a message
[**UpdateMessage**](MessagesApi.md#UpdateMessage) | **PATCH** /messages/{message_id} | Edit a message
[**UpdateMessageFlags**](MessagesApi.md#UpdateMessageFlags) | **POST** /messages/flags | Update personal message flags
[**UploadFile**](MessagesApi.md#UploadFile) | **POST** /user_uploads | Upload a file


# **AddReaction**
> JsonSuccess AddReaction(message.id, emoji.name, emoji.code=var.emoji.code, reaction.type=var.reaction.type)

Add an emoji reaction

Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 

### Example
```R
library(openapi)

var.message.id <- 42 # integer | The target message's ID. 
var.emoji.name <- 'octopus' # character | The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
var.emoji.code <- '1f419' # character | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
var.reaction.type <- 'unicode_emoji' # character | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 

#Add an emoji reaction
api.instance <- MessagesApi$new()
result <- api.instance$AddReaction(var.message.id, var.emoji.name, emoji.code=var.emoji.code, reaction.type=var.reaction.type)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message.id** | **integer**| The target message&#39;s ID.  | 
 **emoji.name** | **character**| The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | 
 **emoji.code** | **character**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | [optional] 
 **reaction.type** | **character**| If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **CheckMessagesMatchNarrow**
> AnyType CheckMessagesMatchNarrow(msg.ids, narrow)

Check if messages match a narrow

Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 

### Example
```R
library(openapi)

var.msg.ids <- list(123) # array[integer] | List of IDs for the messages to check.
var.narrow <- list(123) # array[object] | A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).

#Check if messages match a narrow
api.instance <- MessagesApi$new()
result <- api.instance$CheckMessagesMatchNarrow(var.msg.ids, var.narrow)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msg.ids** | list( **integer** )| List of IDs for the messages to check. | 
 **narrow** | list( **object** )| A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow). | 

### Return type

[**AnyType**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **DeleteMessage**
> JsonSuccess DeleteMessage(message.id)

Delete a message

Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 

### Example
```R
library(openapi)

var.message.id <- 42 # integer | The target message's ID. 

#Delete a message
api.instance <- MessagesApi$new()
result <- api.instance$DeleteMessage(var.message.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message.id** | **integer**| The target message&#39;s ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **GetFileTemporaryUrl**
> JsonSuccessBase GetFileTemporaryUrl(realm.id.str, filename)

Get public temporary URL

Get a temporary URL for access to the file that doesn't require authentication. 

### Example
```R
library(openapi)

var.realm.id.str <- 1 # integer | The realm id. 
var.filename <- '4e/m2A3MSqFnWRLUf9SaPzQ0Up_/zulip.txt' # character | Path to the URL. 

#Get public temporary URL
api.instance <- MessagesApi$new()
result <- api.instance$GetFileTemporaryUrl(var.realm.id.str, var.filename)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realm.id.str** | **integer**| The realm id.  | 
 **filename** | **character**| Path to the URL.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **GetMessageHistory**
> JsonSuccessBase GetMessageHistory(message.id)

Get a message's edit history

Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 

### Example
```R
library(openapi)

var.message.id <- 42 # integer | The target message's ID. 

#Get a message's edit history
api.instance <- MessagesApi$new()
result <- api.instance$GetMessageHistory(var.message.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message.id** | **integer**| The target message&#39;s ID.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **GetMessages**
> JsonSuccessBase GetMessages(num.before, num.after, anchor=var.anchor, narrow=[], client.gravatar=FALSE, apply.markdown=TRUE, use.first.unread.anchor=FALSE)

Get messages

Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 

### Example
```R
library(openapi)

var.num.before <- 4 # integer | The number of messages with IDs less than the anchor to retrieve. 
var.num.after <- 8 # integer | The number of messages with IDs greater than the anchor to retrieve. 
var.anchor <- TODO # OneOfstringinteger | Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value). 
var.narrow <- list(123) # array[object] | The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). 
var.client.gravatar <- FALSE # character | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
var.apply.markdown <- TRUE # character | If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered. 
var.use.first.unread.anchor <- FALSE # character | Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead. 

#Get messages
api.instance <- MessagesApi$new()
result <- api.instance$GetMessages(var.num.before, var.num.after, anchor=var.anchor, narrow=var.narrow, client.gravatar=var.client.gravatar, apply.markdown=var.apply.markdown, use.first.unread.anchor=var.use.first.unread.anchor)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **num.before** | **integer**| The number of messages with IDs less than the anchor to retrieve.  | 
 **num.after** | **integer**| The number of messages with IDs greater than the anchor to retrieve.  | 
 **anchor** | [**OneOfstringinteger**](.md)| Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value).  | [optional] 
 **narrow** | list( **object** )| The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  | [optional] [default to []]
 **client.gravatar** | **character**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to FALSE]
 **apply.markdown** | **character**| If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered.  | [optional] [default to TRUE]
 **use.first.unread.anchor** | **character**| Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead.  | [optional] [default to FALSE]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **GetRawMessage**
> JsonSuccessBase GetRawMessage(message.id)

Get a message's raw Markdown

Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 

### Example
```R
library(openapi)

var.message.id <- 42 # integer | The target message's ID. 

#Get a message's raw Markdown
api.instance <- MessagesApi$new()
result <- api.instance$GetRawMessage(var.message.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message.id** | **integer**| The target message&#39;s ID.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **MarkAllAsRead**
> JsonSuccess MarkAllAsRead()

Mark all messages as read

Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 

### Example
```R
library(openapi)


#Mark all messages as read
api.instance <- MessagesApi$new()
result <- api.instance$MarkAllAsRead()
dput(result)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **MarkStreamAsRead**
> JsonSuccess MarkStreamAsRead(stream.id)

Mark messages in a stream as read

Mark all the unread messages in a stream as read. 

### Example
```R
library(openapi)

var.stream.id <- 42 # integer | The ID of the stream to access. 

#Mark messages in a stream as read
api.instance <- MessagesApi$new()
result <- api.instance$MarkStreamAsRead(var.stream.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream.id** | **integer**| The ID of the stream to access.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **MarkTopicAsRead**
> JsonSuccess MarkTopicAsRead(stream.id, topic.name)

Mark messages in a topic as read

Mark all the unread messages in a topic as read. 

### Example
```R
library(openapi)

var.stream.id <- 42 # integer | The ID of the stream to access. 
var.topic.name <- 'new coffee machine' # character | The name of the topic whose messages should be marked as read. 

#Mark messages in a topic as read
api.instance <- MessagesApi$new()
result <- api.instance$MarkTopicAsRead(var.stream.id, var.topic.name)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream.id** | **integer**| The ID of the stream to access.  | 
 **topic.name** | **character**| The name of the topic whose messages should be marked as read.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **RemoveReaction**
> JsonSuccess RemoveReaction(message.id, emoji.name=var.emoji.name, emoji.code=var.emoji.code, reaction.type=var.reaction.type)

Remove an emoji reaction

Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 

### Example
```R
library(openapi)

var.message.id <- 42 # integer | The target message's ID. 
var.emoji.name <- 'octopus' # character | The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
var.emoji.code <- '1f419' # character | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
var.reaction.type <- 'unicode_emoji' # character | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 

#Remove an emoji reaction
api.instance <- MessagesApi$new()
result <- api.instance$RemoveReaction(var.message.id, emoji.name=var.emoji.name, emoji.code=var.emoji.code, reaction.type=var.reaction.type)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message.id** | **integer**| The target message&#39;s ID.  | 
 **emoji.name** | **character**| The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | [optional] 
 **emoji.code** | **character**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | [optional] 
 **reaction.type** | **character**| If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **RenderMessage**
> JsonSuccessBase RenderMessage(content)

Render message

Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 

### Example
```R
library(openapi)

var.content <- 'Hello' # character | The content of the message. Maximum message size of 10000 bytes. 

#Render message
api.instance <- MessagesApi$new()
result <- api.instance$RenderMessage(var.content)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **character**| The content of the message. Maximum message size of 10000 bytes.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **SendMessage**
> JsonSuccessBase SendMessage(type, to, content, topic=var.topic, queue.id=var.queue.id, local.id=var.local.id)

Send a message

Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 

### Example
```R
library(openapi)

var.type <- 'private' # character | The type of message to be sent. `private` for a private message and `stream` for a stream message. 
var.to <- list(123) # array[integer] | For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
var.content <- 'Hello' # character | The content of the message. Maximum message size of 10000 bytes. 
var.topic <- 'Castle' # character | The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
var.queue.id <- '1593114627:0' # character | For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). 
var.local.id <- '100.01' # character | For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description. 

#Send a message
api.instance <- MessagesApi$new()
result <- api.instance$SendMessage(var.type, var.to, var.content, topic=var.topic, queue.id=var.queue.id, local.id=var.local.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | Enum [private, stream] | The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message.  | 
 **to** | list( **integer** )| For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0.  | 
 **content** | **character**| The content of the message. Maximum message size of 10000 bytes.  | 
 **topic** | **character**| The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional] 
 **queue.id** | **character**| For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  | [optional] 
 **local.id** | **character**| For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **UpdateMessage**
> JsonSuccess UpdateMessage(message.id, topic=var.topic, propagate.mode='change_one', send.notification.to.old.thread=TRUE, send.notification.to.new.thread=TRUE, content=var.content, stream.id=var.stream.id)

Edit a message

Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 

### Example
```R
library(openapi)

var.message.id <- 42 # integer | The target message's ID. 
var.topic <- 'Castle' # character | The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
var.propagate.mode <- 'change_one' # character | Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. 
var.send.notification.to.old.thread <- TRUE # character | Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). 
var.send.notification.to.new.thread <- TRUE # character | Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). 
var.content <- 'Hello' # character | The content of the message. Maximum message size of 10000 bytes. 
var.stream.id <- 42 # integer | The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. 

#Edit a message
api.instance <- MessagesApi$new()
result <- api.instance$UpdateMessage(var.message.id, topic=var.topic, propagate.mode=var.propagate.mode, send.notification.to.old.thread=var.send.notification.to.old.thread, send.notification.to.new.thread=var.send.notification.to.new.thread, content=var.content, stream.id=var.stream.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message.id** | **integer**| The target message&#39;s ID.  | 
 **topic** | **character**| The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional] 
 **propagate.mode** | Enum [change_one, change_later, change_all] | Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  | [optional] [default to &#39;change_one&#39;]
 **send.notification.to.old.thread** | **character**| Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional] [default to TRUE]
 **send.notification.to.new.thread** | **character**| Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional] [default to TRUE]
 **content** | **character**| The content of the message. Maximum message size of 10000 bytes.  | [optional] 
 **stream.id** | **integer**| The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **UpdateMessageFlags**
> JsonSuccessBase UpdateMessageFlags(messages, op, flag)

Update personal message flags

Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 

### Example
```R
library(openapi)

var.messages <- list(123) # array[integer] | An array containing the IDs of the target messages. 
var.op <- 'add' # character | Whether to `add` the flag or `remove` it. 
var.flag <- 'read' # character | The flag that should be added/removed. 

#Update personal message flags
api.instance <- MessagesApi$new()
result <- api.instance$UpdateMessageFlags(var.messages, var.op, var.flag)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messages** | list( **integer** )| An array containing the IDs of the target messages.  | 
 **op** | Enum [add, remove] | Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it.  | 
 **flag** | **character**| The flag that should be added/removed.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **UploadFile**
> JsonSuccessBase UploadFile(filename=var.filename)

Upload a file

Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 

### Example
```R
library(openapi)

var.filename <- File.new('/path/to/file') # data.frame | 

#Upload a file
api.instance <- MessagesApi$new()
result <- api.instance$UploadFile(filename=var.filename)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **data.frame**|  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

