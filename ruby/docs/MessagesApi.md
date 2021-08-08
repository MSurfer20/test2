# OpenapiClient::MessagesApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**add_reaction**](MessagesApi.md#add_reaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction |
| [**check_messages_match_narrow**](MessagesApi.md#check_messages_match_narrow) | **GET** /messages/matches_narrow | Check if messages match a narrow |
| [**delete_message**](MessagesApi.md#delete_message) | **DELETE** /messages/{message_id} | Delete a message |
| [**get_file_temporary_url**](MessagesApi.md#get_file_temporary_url) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL |
| [**get_message_history**](MessagesApi.md#get_message_history) | **GET** /messages/{message_id}/history | Get a message&#39;s edit history |
| [**get_messages**](MessagesApi.md#get_messages) | **GET** /messages | Get messages |
| [**get_raw_message**](MessagesApi.md#get_raw_message) | **GET** /messages/{message_id} | Get a message&#39;s raw Markdown |
| [**mark_all_as_read**](MessagesApi.md#mark_all_as_read) | **POST** /mark_all_as_read | Mark all messages as read |
| [**mark_stream_as_read**](MessagesApi.md#mark_stream_as_read) | **POST** /mark_stream_as_read | Mark messages in a stream as read |
| [**mark_topic_as_read**](MessagesApi.md#mark_topic_as_read) | **POST** /mark_topic_as_read | Mark messages in a topic as read |
| [**remove_reaction**](MessagesApi.md#remove_reaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction |
| [**render_message**](MessagesApi.md#render_message) | **POST** /messages/render | Render message |
| [**send_message**](MessagesApi.md#send_message) | **POST** /messages | Send a message |
| [**update_message**](MessagesApi.md#update_message) | **PATCH** /messages/{message_id} | Edit a message |
| [**update_message_flags**](MessagesApi.md#update_message_flags) | **POST** /messages/flags | Update personal message flags |
| [**upload_file**](MessagesApi.md#upload_file) | **POST** /user_uploads | Upload a file |


## add_reaction

> <JsonSuccess> add_reaction(message_id, emoji_name, opts)

Add an emoji reaction

Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
message_id = 42 # Integer | The target message's ID. 
emoji_name = 'octopus' # String | The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
opts = {
  emoji_code: '1f419', # String | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
  reaction_type: 'unicode_emoji' # String | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
}

begin
  # Add an emoji reaction
  result = api_instance.add_reaction(message_id, emoji_name, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->add_reaction: #{e}"
end
```

#### Using the add_reaction_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> add_reaction_with_http_info(message_id, emoji_name, opts)

```ruby
begin
  # Add an emoji reaction
  data, status_code, headers = api_instance.add_reaction_with_http_info(message_id, emoji_name, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->add_reaction_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **message_id** | **Integer** | The target message&#39;s ID.  |  |
| **emoji_name** | **String** | The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  |  |
| **emoji_code** | **String** | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | [optional] |
| **reaction_type** | **String** | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional] |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## check_messages_match_narrow

> <AnyType> check_messages_match_narrow(msg_ids, narrow)

Check if messages match a narrow

Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
msg_ids = [37] # Array<Integer> | List of IDs for the messages to check.
narrow = [3.56] # Array<Object> | A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).

begin
  # Check if messages match a narrow
  result = api_instance.check_messages_match_narrow(msg_ids, narrow)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->check_messages_match_narrow: #{e}"
end
```

#### Using the check_messages_match_narrow_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AnyType>, Integer, Hash)> check_messages_match_narrow_with_http_info(msg_ids, narrow)

```ruby
begin
  # Check if messages match a narrow
  data, status_code, headers = api_instance.check_messages_match_narrow_with_http_info(msg_ids, narrow)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AnyType>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->check_messages_match_narrow_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **msg_ids** | [**Array&lt;Integer&gt;**](Integer.md) | List of IDs for the messages to check. |  |
| **narrow** | [**Array&lt;Object&gt;**](Object.md) | A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow). |  |

### Return type

[**AnyType**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## delete_message

> <JsonSuccess> delete_message(message_id)

Delete a message

Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
message_id = 42 # Integer | The target message's ID. 

begin
  # Delete a message
  result = api_instance.delete_message(message_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->delete_message: #{e}"
end
```

#### Using the delete_message_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> delete_message_with_http_info(message_id)

```ruby
begin
  # Delete a message
  data, status_code, headers = api_instance.delete_message_with_http_info(message_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->delete_message_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **message_id** | **Integer** | The target message&#39;s ID.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_file_temporary_url

> <JsonSuccessBase> get_file_temporary_url(realm_id_str, filename)

Get public temporary URL

Get a temporary URL for access to the file that doesn't require authentication. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
realm_id_str = 1 # Integer | The realm id. 
filename = '4e/m2A3MSqFnWRLUf9SaPzQ0Up_/zulip.txt' # String | Path to the URL. 

begin
  # Get public temporary URL
  result = api_instance.get_file_temporary_url(realm_id_str, filename)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->get_file_temporary_url: #{e}"
end
```

#### Using the get_file_temporary_url_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_file_temporary_url_with_http_info(realm_id_str, filename)

```ruby
begin
  # Get public temporary URL
  data, status_code, headers = api_instance.get_file_temporary_url_with_http_info(realm_id_str, filename)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->get_file_temporary_url_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **realm_id_str** | **Integer** | The realm id.  |  |
| **filename** | **String** | Path to the URL.  |  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_message_history

> <JsonSuccessBase> get_message_history(message_id)

Get a message's edit history

Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
message_id = 42 # Integer | The target message's ID. 

begin
  # Get a message's edit history
  result = api_instance.get_message_history(message_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->get_message_history: #{e}"
end
```

#### Using the get_message_history_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_message_history_with_http_info(message_id)

```ruby
begin
  # Get a message's edit history
  data, status_code, headers = api_instance.get_message_history_with_http_info(message_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->get_message_history_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **message_id** | **Integer** | The target message&#39;s ID.  |  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_messages

> <JsonSuccessBase> get_messages(num_before, num_after, opts)

Get messages

Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
num_before = 4 # Integer | The number of messages with IDs less than the anchor to retrieve. 
num_after = 8 # Integer | The number of messages with IDs greater than the anchor to retrieve. 
opts = {
  anchor: TODO, # OneOfstringinteger | Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value). 
  narrow: [3.56], # Array<Object> | The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). 
  client_gravatar: true, # Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  apply_markdown: false, # Boolean | If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered. 
  use_first_unread_anchor: true # Boolean | Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead. 
}

begin
  # Get messages
  result = api_instance.get_messages(num_before, num_after, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->get_messages: #{e}"
end
```

#### Using the get_messages_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_messages_with_http_info(num_before, num_after, opts)

```ruby
begin
  # Get messages
  data, status_code, headers = api_instance.get_messages_with_http_info(num_before, num_after, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->get_messages_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **num_before** | **Integer** | The number of messages with IDs less than the anchor to retrieve.  |  |
| **num_after** | **Integer** | The number of messages with IDs greater than the anchor to retrieve.  |  |
| **anchor** | [**OneOfstringinteger**](.md) | Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value).  | [optional] |
| **narrow** | [**Array&lt;Object&gt;**](Object.md) | The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  | [optional] |
| **client_gravatar** | **Boolean** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional][default to false] |
| **apply_markdown** | **Boolean** | If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered.  | [optional][default to true] |
| **use_first_unread_anchor** | **Boolean** | Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead.  | [optional][default to false] |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_raw_message

> <JsonSuccessBase> get_raw_message(message_id)

Get a message's raw Markdown

Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
message_id = 42 # Integer | The target message's ID. 

begin
  # Get a message's raw Markdown
  result = api_instance.get_raw_message(message_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->get_raw_message: #{e}"
end
```

#### Using the get_raw_message_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_raw_message_with_http_info(message_id)

```ruby
begin
  # Get a message's raw Markdown
  data, status_code, headers = api_instance.get_raw_message_with_http_info(message_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->get_raw_message_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **message_id** | **Integer** | The target message&#39;s ID.  |  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## mark_all_as_read

> <JsonSuccess> mark_all_as_read

Mark all messages as read

Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new

begin
  # Mark all messages as read
  result = api_instance.mark_all_as_read
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->mark_all_as_read: #{e}"
end
```

#### Using the mark_all_as_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> mark_all_as_read_with_http_info

```ruby
begin
  # Mark all messages as read
  data, status_code, headers = api_instance.mark_all_as_read_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->mark_all_as_read_with_http_info: #{e}"
end
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


## mark_stream_as_read

> <JsonSuccess> mark_stream_as_read(stream_id)

Mark messages in a stream as read

Mark all the unread messages in a stream as read. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
stream_id = 42 # Integer | The ID of the stream to access. 

begin
  # Mark messages in a stream as read
  result = api_instance.mark_stream_as_read(stream_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->mark_stream_as_read: #{e}"
end
```

#### Using the mark_stream_as_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> mark_stream_as_read_with_http_info(stream_id)

```ruby
begin
  # Mark messages in a stream as read
  data, status_code, headers = api_instance.mark_stream_as_read_with_http_info(stream_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->mark_stream_as_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **stream_id** | **Integer** | The ID of the stream to access.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## mark_topic_as_read

> <JsonSuccess> mark_topic_as_read(stream_id, topic_name)

Mark messages in a topic as read

Mark all the unread messages in a topic as read. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
stream_id = 42 # Integer | The ID of the stream to access. 
topic_name = 'new coffee machine' # String | The name of the topic whose messages should be marked as read. 

begin
  # Mark messages in a topic as read
  result = api_instance.mark_topic_as_read(stream_id, topic_name)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->mark_topic_as_read: #{e}"
end
```

#### Using the mark_topic_as_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> mark_topic_as_read_with_http_info(stream_id, topic_name)

```ruby
begin
  # Mark messages in a topic as read
  data, status_code, headers = api_instance.mark_topic_as_read_with_http_info(stream_id, topic_name)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->mark_topic_as_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **stream_id** | **Integer** | The ID of the stream to access.  |  |
| **topic_name** | **String** | The name of the topic whose messages should be marked as read.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## remove_reaction

> <JsonSuccess> remove_reaction(message_id, opts)

Remove an emoji reaction

Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
message_id = 42 # Integer | The target message's ID. 
opts = {
  emoji_name: 'octopus', # String | The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
  emoji_code: '1f419', # String | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
  reaction_type: 'unicode_emoji' # String | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
}

begin
  # Remove an emoji reaction
  result = api_instance.remove_reaction(message_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->remove_reaction: #{e}"
end
```

#### Using the remove_reaction_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> remove_reaction_with_http_info(message_id, opts)

```ruby
begin
  # Remove an emoji reaction
  data, status_code, headers = api_instance.remove_reaction_with_http_info(message_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->remove_reaction_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **message_id** | **Integer** | The target message&#39;s ID.  |  |
| **emoji_name** | **String** | The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | [optional] |
| **emoji_code** | **String** | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | [optional] |
| **reaction_type** | **String** | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional] |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## render_message

> <JsonSuccessBase> render_message(content)

Render message

Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
content = 'Hello' # String | The content of the message. Maximum message size of 10000 bytes. 

begin
  # Render message
  result = api_instance.render_message(content)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->render_message: #{e}"
end
```

#### Using the render_message_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> render_message_with_http_info(content)

```ruby
begin
  # Render message
  data, status_code, headers = api_instance.render_message_with_http_info(content)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->render_message_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **content** | **String** | The content of the message. Maximum message size of 10000 bytes.  |  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## send_message

> <JsonSuccessBase> send_message(type, to, content, opts)

Send a message

Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
type = 'private' # String | The type of message to be sent. `private` for a private message and `stream` for a stream message. 
to = [37] # Array<Integer> | For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
content = 'Hello' # String | The content of the message. Maximum message size of 10000 bytes. 
opts = {
  topic: 'Castle', # String | The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
  queue_id: '1593114627:0', # String | For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). 
  local_id: '100.01' # String | For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description. 
}

begin
  # Send a message
  result = api_instance.send_message(type, to, content, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->send_message: #{e}"
end
```

#### Using the send_message_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> send_message_with_http_info(type, to, content, opts)

```ruby
begin
  # Send a message
  data, status_code, headers = api_instance.send_message_with_http_info(type, to, content, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->send_message_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message.  |  |
| **to** | [**Array&lt;Integer&gt;**](Integer.md) | For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0.  |  |
| **content** | **String** | The content of the message. Maximum message size of 10000 bytes.  |  |
| **topic** | **String** | The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional] |
| **queue_id** | **String** | For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  | [optional] |
| **local_id** | **String** | For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description.  | [optional] |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_message

> <JsonSuccess> update_message(message_id, opts)

Edit a message

Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
message_id = 42 # Integer | The target message's ID. 
opts = {
  topic: 'Castle', # String | The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
  propagate_mode: 'change_one', # String | Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. 
  send_notification_to_old_thread: true, # Boolean | Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). 
  send_notification_to_new_thread: true, # Boolean | Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). 
  content: 'Hello', # String | The content of the message. Maximum message size of 10000 bytes. 
  stream_id: 42 # Integer | The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. 
}

begin
  # Edit a message
  result = api_instance.update_message(message_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->update_message: #{e}"
end
```

#### Using the update_message_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> update_message_with_http_info(message_id, opts)

```ruby
begin
  # Edit a message
  data, status_code, headers = api_instance.update_message_with_http_info(message_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->update_message_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **message_id** | **Integer** | The target message&#39;s ID.  |  |
| **topic** | **String** | The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional] |
| **propagate_mode** | **String** | Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  | [optional][default to &#39;change_one&#39;] |
| **send_notification_to_old_thread** | **Boolean** | Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional][default to true] |
| **send_notification_to_new_thread** | **Boolean** | Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional][default to true] |
| **content** | **String** | The content of the message. Maximum message size of 10000 bytes.  | [optional] |
| **stream_id** | **Integer** | The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  | [optional] |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_message_flags

> <JsonSuccessBase> update_message_flags(messages, op, flag)

Update personal message flags

Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
messages = [37] # Array<Integer> | An array containing the IDs of the target messages. 
op = 'add' # String | Whether to `add` the flag or `remove` it. 
flag = 'read' # String | The flag that should be added/removed. 

begin
  # Update personal message flags
  result = api_instance.update_message_flags(messages, op, flag)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->update_message_flags: #{e}"
end
```

#### Using the update_message_flags_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> update_message_flags_with_http_info(messages, op, flag)

```ruby
begin
  # Update personal message flags
  data, status_code, headers = api_instance.update_message_flags_with_http_info(messages, op, flag)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->update_message_flags_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **messages** | [**Array&lt;Integer&gt;**](Integer.md) | An array containing the IDs of the target messages.  |  |
| **op** | **String** | Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it.  |  |
| **flag** | **String** | The flag that should be added/removed.  |  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## upload_file

> <JsonSuccessBase> upload_file(opts)

Upload a file

Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MessagesApi.new
opts = {
  filename: File.new('/path/to/some/file') # File | 
}

begin
  # Upload a file
  result = api_instance.upload_file(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->upload_file: #{e}"
end
```

#### Using the upload_file_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> upload_file_with_http_info(opts)

```ruby
begin
  # Upload a file
  data, status_code, headers = api_instance.upload_file_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling MessagesApi->upload_file_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **filename** | **File** |  | [optional] |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

