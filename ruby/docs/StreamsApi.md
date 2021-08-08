# OpenapiClient::StreamsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**archive_stream**](StreamsApi.md#archive_stream) | **DELETE** /streams/{stream_id} | Archive a stream |
| [**create_big_blue_button_video_call**](StreamsApi.md#create_big_blue_button_video_call) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call |
| [**get_stream_id**](StreamsApi.md#get_stream_id) | **GET** /get_stream_id | Get stream ID |
| [**get_stream_topics**](StreamsApi.md#get_stream_topics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream |
| [**get_streams**](StreamsApi.md#get_streams) | **GET** /streams | Get all streams |
| [**get_subscription_status**](StreamsApi.md#get_subscription_status) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status |
| [**get_subscriptions**](StreamsApi.md#get_subscriptions) | **GET** /users/me/subscriptions | Get subscribed streams |
| [**mute_topic**](StreamsApi.md#mute_topic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting |
| [**subscribe**](StreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream |
| [**unsubscribe**](StreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream |
| [**update_stream**](StreamsApi.md#update_stream) | **PATCH** /streams/{stream_id} | Update a stream |
| [**update_subscription_settings**](StreamsApi.md#update_subscription_settings) | **POST** /users/me/subscriptions/properties | Update subscription settings |
| [**update_subscriptions**](StreamsApi.md#update_subscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions |


## archive_stream

> <JsonSuccess> archive_stream(stream_id)

Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StreamsApi.new
stream_id = 1 # Integer | The ID of the stream to access. 

begin
  # Archive a stream
  result = api_instance.archive_stream(stream_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->archive_stream: #{e}"
end
```

#### Using the archive_stream_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> archive_stream_with_http_info(stream_id)

```ruby
begin
  # Archive a stream
  data, status_code, headers = api_instance.archive_stream_with_http_info(stream_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->archive_stream_with_http_info: #{e}"
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


## create_big_blue_button_video_call

> <JsonSuccessBase> create_big_blue_button_video_call

Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StreamsApi.new

begin
  # Create BigBlueButton video call
  result = api_instance.create_big_blue_button_video_call
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->create_big_blue_button_video_call: #{e}"
end
```

#### Using the create_big_blue_button_video_call_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> create_big_blue_button_video_call_with_http_info

```ruby
begin
  # Create BigBlueButton video call
  data, status_code, headers = api_instance.create_big_blue_button_video_call_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->create_big_blue_button_video_call_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_stream_id

> <JsonSuccessBase> get_stream_id(stream)

Get stream ID

Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StreamsApi.new
stream = 'Denmark' # String | The name of the stream to access. 

begin
  # Get stream ID
  result = api_instance.get_stream_id(stream)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->get_stream_id: #{e}"
end
```

#### Using the get_stream_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_stream_id_with_http_info(stream)

```ruby
begin
  # Get stream ID
  data, status_code, headers = api_instance.get_stream_id_with_http_info(stream)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->get_stream_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **stream** | **String** | The name of the stream to access.  |  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_stream_topics

> <JsonSuccessBase> get_stream_topics(stream_id)

Get topics in a stream

Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StreamsApi.new
stream_id = 1 # Integer | The ID of the stream to access. 

begin
  # Get topics in a stream
  result = api_instance.get_stream_topics(stream_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->get_stream_topics: #{e}"
end
```

#### Using the get_stream_topics_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_stream_topics_with_http_info(stream_id)

```ruby
begin
  # Get topics in a stream
  data, status_code, headers = api_instance.get_stream_topics_with_http_info(stream_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->get_stream_topics_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **stream_id** | **Integer** | The ID of the stream to access.  |  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_streams

> <JsonSuccessBase> get_streams(opts)

Get all streams

Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StreamsApi.new
opts = {
  include_public: false, # Boolean | Include all public streams. 
  include_web_public: true, # Boolean | Include all web public streams. 
  include_subscribed: false, # Boolean | Include all streams that the user is subscribed to. 
  include_all_active: true, # Boolean | Include all active streams. The user must have administrative privileges to use this parameter. 
  include_default: true, # Boolean | Include all default streams for the user's realm. 
  include_owner_subscribed: true # Boolean | If the user is a bot, include all streams that the bot's owner is subscribed to. 
}

begin
  # Get all streams
  result = api_instance.get_streams(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->get_streams: #{e}"
end
```

#### Using the get_streams_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_streams_with_http_info(opts)

```ruby
begin
  # Get all streams
  data, status_code, headers = api_instance.get_streams_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->get_streams_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **include_public** | **Boolean** | Include all public streams.  | [optional][default to true] |
| **include_web_public** | **Boolean** | Include all web public streams.  | [optional][default to false] |
| **include_subscribed** | **Boolean** | Include all streams that the user is subscribed to.  | [optional][default to true] |
| **include_all_active** | **Boolean** | Include all active streams. The user must have administrative privileges to use this parameter.  | [optional][default to false] |
| **include_default** | **Boolean** | Include all default streams for the user&#39;s realm.  | [optional][default to false] |
| **include_owner_subscribed** | **Boolean** | If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  | [optional][default to false] |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_subscription_status

> <JsonSuccessBase> get_subscription_status(user_id, stream_id)

Get subscription status

Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StreamsApi.new
user_id = 12 # Integer | The target user's ID. 
stream_id = 1 # Integer | The ID of the stream to access. 

begin
  # Get subscription status
  result = api_instance.get_subscription_status(user_id, stream_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->get_subscription_status: #{e}"
end
```

#### Using the get_subscription_status_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_subscription_status_with_http_info(user_id, stream_id)

```ruby
begin
  # Get subscription status
  data, status_code, headers = api_instance.get_subscription_status_with_http_info(user_id, stream_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->get_subscription_status_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_id** | **Integer** | The target user&#39;s ID.  |  |
| **stream_id** | **Integer** | The ID of the stream to access.  |  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_subscriptions

> <JsonSuccessBase> get_subscriptions(opts)

Get subscribed streams

Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StreamsApi.new
opts = {
  include_subscribers: true # Boolean | Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
}

begin
  # Get subscribed streams
  result = api_instance.get_subscriptions(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->get_subscriptions: #{e}"
end
```

#### Using the get_subscriptions_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_subscriptions_with_http_info(opts)

```ruby
begin
  # Get subscribed streams
  data, status_code, headers = api_instance.get_subscriptions_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->get_subscriptions_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **include_subscribers** | **Boolean** | Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [optional][default to false] |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## mute_topic

> <JsonSuccess> mute_topic(topic, op, opts)

Topic muting

This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StreamsApi.new
topic = 'dinner' # String | The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
op = 'add' # String | Whether to mute (`add`) or unmute (`remove`) the provided topic. 
opts = {
  stream: 'Denmark', # String | The name of the stream to access. 
  stream_id: 42 # Integer | The ID of the stream to access. 
}

begin
  # Topic muting
  result = api_instance.mute_topic(topic, op, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->mute_topic: #{e}"
end
```

#### Using the mute_topic_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> mute_topic_with_http_info(topic, op, opts)

```ruby
begin
  # Topic muting
  data, status_code, headers = api_instance.mute_topic_with_http_info(topic, op, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->mute_topic_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **topic** | **String** | The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  |  |
| **op** | **String** | Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic.  |  |
| **stream** | **String** | The name of the stream to access.  | [optional] |
| **stream_id** | **Integer** | The ID of the stream to access.  | [optional] |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## subscribe

> <OneOfobjectobject> subscribe(subscriptions, opts)

Subscribe to a stream

Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StreamsApi.new
subscriptions = [3.56] # Array<Object> | A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
opts = {
  principals: [TODO], # Array<OneOfstringinteger> | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
  authorization_errors_fatal: false, # Boolean | A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key. 
  announce: true, # Boolean | If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation. 
  invite_only: true, # Boolean | As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
  history_public_to_subscribers: false, # Boolean | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
  stream_post_policy: 2, # Integer | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
  message_retention_days: TODO # OneOfstringinteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
}

begin
  # Subscribe to a stream
  result = api_instance.subscribe(subscriptions, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->subscribe: #{e}"
end
```

#### Using the subscribe_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OneOfobjectobject>, Integer, Hash)> subscribe_with_http_info(subscriptions, opts)

```ruby
begin
  # Subscribe to a stream
  data, status_code, headers = api_instance.subscribe_with_http_info(subscriptions, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OneOfobjectobject>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->subscribe_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **subscriptions** | [**Array&lt;Object&gt;**](Object.md) | A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value.  |  |
| **principals** | [**Array&lt;OneOfstringinteger&gt;**](OneOfstringinteger.md) | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] |
| **authorization_errors_fatal** | **Boolean** | A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  | [optional][default to true] |
| **announce** | **Boolean** | If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  | [optional][default to false] |
| **invite_only** | **Boolean** | As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  | [optional][default to false] |
| **history_public_to_subscribers** | **Boolean** | Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] |
| **stream_post_policy** | **Integer** | Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional][default to 1] |
| **message_retention_days** | [**OneOfstringinteger**](.md) | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] |

### Return type

[**OneOfobjectobject**](OneOfobjectobject.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## unsubscribe

> <JsonSuccessBase> unsubscribe(subscriptions, opts)

Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StreamsApi.new
subscriptions = ['inner_example'] # Array<String> | A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
opts = {
  principals: [TODO] # Array<OneOfstringinteger> | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
}

begin
  # Unsubscribe from a stream
  result = api_instance.unsubscribe(subscriptions, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->unsubscribe: #{e}"
end
```

#### Using the unsubscribe_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> unsubscribe_with_http_info(subscriptions, opts)

```ruby
begin
  # Unsubscribe from a stream
  data, status_code, headers = api_instance.unsubscribe_with_http_info(subscriptions, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->unsubscribe_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **subscriptions** | [**Array&lt;String&gt;**](String.md) | A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API.  |  |
| **principals** | [**Array&lt;OneOfstringinteger&gt;**](OneOfstringinteger.md) | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_stream

> <JsonSuccess> update_stream(stream_id, opts)

Update a stream

Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StreamsApi.new
stream_id = 1 # Integer | The ID of the stream to access. 
opts = {
  description: 'Discuss Italian history and travel destinations.', # String | The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
  new_name: 'Italy', # String | The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
  is_private: true, # Boolean | Change whether the stream is a private stream. 
  is_announcement_only: true, # Boolean | Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. 
  stream_post_policy: 2, # Integer | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
  history_public_to_subscribers: false, # Boolean | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
  message_retention_days: TODO # OneOfstringinteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
}

begin
  # Update a stream
  result = api_instance.update_stream(stream_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->update_stream: #{e}"
end
```

#### Using the update_stream_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> update_stream_with_http_info(stream_id, opts)

```ruby
begin
  # Update a stream
  data, status_code, headers = api_instance.update_stream_with_http_info(stream_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->update_stream_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **stream_id** | **Integer** | The ID of the stream to access.  |  |
| **description** | **String** | The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] |
| **new_name** | **String** | The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] |
| **is_private** | **Boolean** | Change whether the stream is a private stream.  | [optional] |
| **is_announcement_only** | **Boolean** | Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  | [optional] |
| **stream_post_policy** | **Integer** | Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional][default to 1] |
| **history_public_to_subscribers** | **Boolean** | Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] |
| **message_retention_days** | [**OneOfstringinteger**](.md) | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_subscription_settings

> <JsonSuccessBase> update_subscription_settings(subscription_data)

Update subscription settings

This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StreamsApi.new
subscription_data = [3.56] # Array<Object> | A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 

begin
  # Update subscription settings
  result = api_instance.update_subscription_settings(subscription_data)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->update_subscription_settings: #{e}"
end
```

#### Using the update_subscription_settings_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> update_subscription_settings_with_http_info(subscription_data)

```ruby
begin
  # Update subscription settings
  data, status_code, headers = api_instance.update_subscription_settings_with_http_info(subscription_data)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->update_subscription_settings_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **subscription_data** | [**Array&lt;Object&gt;**](Object.md) | A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream.  |  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_subscriptions

> <JsonSuccessBase> update_subscriptions(opts)

Update subscriptions

Update which streams you are are subscribed to. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StreamsApi.new
opts = {
  delete: ['inner_example'], # Array<String> | A list of stream names to unsubscribe from. 
  add: [3.56] # Array<Object> | A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
}

begin
  # Update subscriptions
  result = api_instance.update_subscriptions(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->update_subscriptions: #{e}"
end
```

#### Using the update_subscriptions_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> update_subscriptions_with_http_info(opts)

```ruby
begin
  # Update subscriptions
  data, status_code, headers = api_instance.update_subscriptions_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StreamsApi->update_subscriptions_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **delete** | [**Array&lt;String&gt;**](String.md) | A list of stream names to unsubscribe from.  | [optional] |
| **add** | [**Array&lt;Object&gt;**](Object.md) | A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  | [optional] |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

