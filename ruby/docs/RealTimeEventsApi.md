# OpenapiClient::RealTimeEventsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**delete_queue**](RealTimeEventsApi.md#delete_queue) | **DELETE** /events | Delete an event queue |
| [**get_events**](RealTimeEventsApi.md#get_events) | **GET** /events | Get events from an event queue |
| [**real_time_post**](RealTimeEventsApi.md#real_time_post) | **POST** /real-time |  |
| [**register_queue**](RealTimeEventsApi.md#register_queue) | **POST** /register | Register an event queue |
| [**rest_error_handling**](RealTimeEventsApi.md#rest_error_handling) | **POST** /rest-error-handling | Error handling |


## delete_queue

> <JsonSuccess> delete_queue(queue_id)

Delete an event queue

Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::RealTimeEventsApi.new
queue_id = '1375801870:2942' # String | The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). 

begin
  # Delete an event queue
  result = api_instance.delete_queue(queue_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling RealTimeEventsApi->delete_queue: #{e}"
end
```

#### Using the delete_queue_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> delete_queue_with_http_info(queue_id)

```ruby
begin
  # Delete an event queue
  data, status_code, headers = api_instance.delete_queue_with_http_info(queue_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling RealTimeEventsApi->delete_queue_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **queue_id** | **String** | The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)).  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_events

> <JsonSuccessBase> get_events(queue_id, opts)

Get events from an event queue

`GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::RealTimeEventsApi.new
queue_id = '1375801870:2942' # String | The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). 
opts = {
  last_event_id: -1, # Integer | The highest event ID in this queue that you've received and wish to acknowledge. See the [code for `call_on_each_event`](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once. 
  dont_block: true # Boolean | Set to `true` if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event. 
}

begin
  # Get events from an event queue
  result = api_instance.get_events(queue_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling RealTimeEventsApi->get_events: #{e}"
end
```

#### Using the get_events_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_events_with_http_info(queue_id, opts)

```ruby
begin
  # Get events from an event queue
  data, status_code, headers = api_instance.get_events_with_http_info(queue_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling RealTimeEventsApi->get_events_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **queue_id** | **String** | The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)).  |  |
| **last_event_id** | **Integer** | The highest event ID in this queue that you&#39;ve received and wish to acknowledge. See the [code for &#x60;call_on_each_event&#x60;](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once.  | [optional] |
| **dont_block** | **Boolean** | Set to &#x60;true&#x60; if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event.  | [optional][default to false] |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## real_time_post

> real_time_post(opts)



(Ignored) 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::RealTimeEventsApi.new
opts = {
  event_types: ['inner_example'], # Array<String> | A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
  narrow: [['inner_example']], # Array<Array<String>> | A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`. 
  all_public_streams: true # Boolean | Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). 
}

begin
  
  api_instance.real_time_post(opts)
rescue OpenapiClient::ApiError => e
  puts "Error when calling RealTimeEventsApi->real_time_post: #{e}"
end
```

#### Using the real_time_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> real_time_post_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.real_time_post_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling RealTimeEventsApi->real_time_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_types** | [**Array&lt;String&gt;**](String.md) | A JSON-encoded array indicating which types of events you&#39;re interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: &#x60;event_types&#x3D;[&#39;message&#39;]&#x60;  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions.  | [optional] |
| **narrow** | [**Array&lt;Array&lt;String&gt;&gt;**](Array&lt;String&gt;.md) | A JSON-encoded array of arrays of length 2 indicating the narrow for which you&#39;d like to receive events for. For instance, to receive events for the stream &#x60;Denmark&#x60;, you would specify &#x60;narrow&#x3D;[[&#39;stream&#39;, &#39;Denmark&#39;]]&#x60;.  Another example is &#x60;narrow&#x3D;[[&#39;is&#39;, &#39;private&#39;]]&#x60; for private messages. Default is &#x60;[]&#x60;.  | [optional] |
| **all_public_streams** | **Boolean** | Whether you would like to request message events from all public streams.  Useful for workflow bots that you&#39;d like to see all new messages sent to public streams.  (You can also subscribe the user to private streams).  | [optional][default to false] |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## register_queue

> <JsonSuccessBase> register_queue(opts)

Register an event queue

`POST {{ api_url }}/v1/register`  This powerful endpoint can be used to register a Zulip \"event queue\" (subscribed to certain types of \"events\", or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (`register` also powers the `call_on_each_event` Python API, and is intended primarily for complex applications for which the more convenient `call_on_each_event` API is insufficient).  This endpoint returns a `queue_id` and a `last_event_id`; these can be used in subsequent calls to the [\"events\" endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send `heartbeat` events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling `register` with no `event_types` parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate `event_types` and `fetch_event_types` filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::RealTimeEventsApi.new
opts = {
  apply_markdown: true, # Boolean | Set to `true` if you would like the content to be rendered in HTML format (otherwise the API will return the raw text that the user entered) 
  client_gravatar: true, # Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  slim_presence: true, # Boolean | Setting this to `true` will make presence dictionaries be keyed by user_id instead of email.  **Changes**: New in Zulip 3.0 (Unstable with no feature level yet). 
  event_types: ['inner_example'], # Array<String> | A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
  all_public_streams: true, # Boolean | Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). 
  include_subscribers: true, # Boolean | Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
  client_capabilities: TODO, # Object | Dictionary containing details on features the client supports that are relevant to the format of responses sent by the server.  * `notification_settings_null`: Boolean for whether the   client can handle the current API with null values for   stream-level notification settings (which means the stream   is not customized and should inherit the user's global   notification settings for stream messages).   <br />   New in Zulip 2.1.0; in earlier Zulip releases, stream-level   notification settings were simple booleans.  * `bulk_message_deletion`: Boolean for whether the client's    handler for the `delete_message` event type has been    updated to process the new bulk format (with a    `message_ids`, rather than a singleton `message_id`).    Otherwise, the server will send `delete_message` events    in a loop.    <br />    New in Zulip 3.0 (feature level 13).  This    capability is for backwards-compatibility; it will be    required in a future server release.  * `user_avatar_url_field_optional`: Boolean for whether the    client required avatar URLs for all users, or supports    using `GET /avatar/{user_id}` to access user avatars.  If the    client has this capability, the server may skip sending a    `avatar_url` field in the `realm_user` at its sole discretion    to optimize network performance.  This is an important optimization    in organizations with 10,000s of users.    <br />    New in Zulip 3.0 (feature level 18).  * `stream_typing_notifications`: Boolean for whether the client   supports stream typing notifications.   <br />   New in Zulip 4.0 (feature level 58).  This capability is   for backwards-compatibility; it will be required in a   future server release.  * `user_settings_object`: Boolean for whether the client supports the modern   `user_settings` event type. If False, the server will additionally send the   legacy `update_display_settings` and `update_global_notifications` event   types for backwards-compatibility with clients that predate this API migration.   <br />   <br />   Because the feature level 89 API changes were merged together, clients can   safely make a request with this client capability and requesting all of the   `user_settings`, `update_display_settings`, and   `update_global_notifications` event types, and get exactly one copy of   settings data on any server version. (And then use the `zulip_feature_level`   in the `/register` response or the presence/absence of a `user_settings` key   to determine where to look).   <br />   New in Zulip 5.0 (feature level 89).  This capability is for   backwards-compatibility; it will be removed in a future server release. 
  fetch_event_types: ['inner_example'], # Array<String> | Same as the `event_types` parameter except that the values in `fetch_event_types` are used to fetch initial data. If `fetch_event_types` is not provided, `event_types` is used and if `event_types` is not provided, this parameter defaults to `None`.  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. 
  narrow: [['inner_example']] # Array<Array<String>> | A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`. 
}

begin
  # Register an event queue
  result = api_instance.register_queue(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling RealTimeEventsApi->register_queue: #{e}"
end
```

#### Using the register_queue_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> register_queue_with_http_info(opts)

```ruby
begin
  # Register an event queue
  data, status_code, headers = api_instance.register_queue_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling RealTimeEventsApi->register_queue_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **apply_markdown** | **Boolean** | Set to &#x60;true&#x60; if you would like the content to be rendered in HTML format (otherwise the API will return the raw text that the user entered)  | [optional][default to false] |
| **client_gravatar** | **Boolean** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional][default to false] |
| **slim_presence** | **Boolean** | Setting this to &#x60;true&#x60; will make presence dictionaries be keyed by user_id instead of email.  **Changes**: New in Zulip 3.0 (Unstable with no feature level yet).  | [optional][default to false] |
| **event_types** | [**Array&lt;String&gt;**](String.md) | A JSON-encoded array indicating which types of events you&#39;re interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: &#x60;event_types&#x3D;[&#39;message&#39;]&#x60;  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions.  | [optional] |
| **all_public_streams** | **Boolean** | Whether you would like to request message events from all public streams.  Useful for workflow bots that you&#39;d like to see all new messages sent to public streams.  (You can also subscribe the user to private streams).  | [optional][default to false] |
| **include_subscribers** | **Boolean** | Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [optional][default to false] |
| **client_capabilities** | [**Object**](.md) | Dictionary containing details on features the client supports that are relevant to the format of responses sent by the server.  * &#x60;notification_settings_null&#x60;: Boolean for whether the   client can handle the current API with null values for   stream-level notification settings (which means the stream   is not customized and should inherit the user&#39;s global   notification settings for stream messages).   &lt;br /&gt;   New in Zulip 2.1.0; in earlier Zulip releases, stream-level   notification settings were simple booleans.  * &#x60;bulk_message_deletion&#x60;: Boolean for whether the client&#39;s    handler for the &#x60;delete_message&#x60; event type has been    updated to process the new bulk format (with a    &#x60;message_ids&#x60;, rather than a singleton &#x60;message_id&#x60;).    Otherwise, the server will send &#x60;delete_message&#x60; events    in a loop.    &lt;br /&gt;    New in Zulip 3.0 (feature level 13).  This    capability is for backwards-compatibility; it will be    required in a future server release.  * &#x60;user_avatar_url_field_optional&#x60;: Boolean for whether the    client required avatar URLs for all users, or supports    using &#x60;GET /avatar/{user_id}&#x60; to access user avatars.  If the    client has this capability, the server may skip sending a    &#x60;avatar_url&#x60; field in the &#x60;realm_user&#x60; at its sole discretion    to optimize network performance.  This is an important optimization    in organizations with 10,000s of users.    &lt;br /&gt;    New in Zulip 3.0 (feature level 18).  * &#x60;stream_typing_notifications&#x60;: Boolean for whether the client   supports stream typing notifications.   &lt;br /&gt;   New in Zulip 4.0 (feature level 58).  This capability is   for backwards-compatibility; it will be required in a   future server release.  * &#x60;user_settings_object&#x60;: Boolean for whether the client supports the modern   &#x60;user_settings&#x60; event type. If False, the server will additionally send the   legacy &#x60;update_display_settings&#x60; and &#x60;update_global_notifications&#x60; event   types for backwards-compatibility with clients that predate this API migration.   &lt;br /&gt;   &lt;br /&gt;   Because the feature level 89 API changes were merged together, clients can   safely make a request with this client capability and requesting all of the   &#x60;user_settings&#x60;, &#x60;update_display_settings&#x60;, and   &#x60;update_global_notifications&#x60; event types, and get exactly one copy of   settings data on any server version. (And then use the &#x60;zulip_feature_level&#x60;   in the &#x60;/register&#x60; response or the presence/absence of a &#x60;user_settings&#x60; key   to determine where to look).   &lt;br /&gt;   New in Zulip 5.0 (feature level 89).  This capability is for   backwards-compatibility; it will be removed in a future server release.  | [optional] |
| **fetch_event_types** | [**Array&lt;String&gt;**](String.md) | Same as the &#x60;event_types&#x60; parameter except that the values in &#x60;fetch_event_types&#x60; are used to fetch initial data. If &#x60;fetch_event_types&#x60; is not provided, &#x60;event_types&#x60; is used and if &#x60;event_types&#x60; is not provided, this parameter defaults to &#x60;None&#x60;.  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions.  | [optional] |
| **narrow** | [**Array&lt;Array&lt;String&gt;&gt;**](Array&lt;String&gt;.md) | A JSON-encoded array of arrays of length 2 indicating the narrow for which you&#39;d like to receive events for. For instance, to receive events for the stream &#x60;Denmark&#x60;, you would specify &#x60;narrow&#x3D;[[&#39;stream&#39;, &#39;Denmark&#39;]]&#x60;.  Another example is &#x60;narrow&#x3D;[[&#39;is&#39;, &#39;private&#39;]]&#x60; for private messages. Default is &#x60;[]&#x60;.  | [optional] |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## rest_error_handling

> rest_error_handling

Error handling

Common error to many endpoints 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::RealTimeEventsApi.new

begin
  # Error handling
  api_instance.rest_error_handling
rescue OpenapiClient::ApiError => e
  puts "Error when calling RealTimeEventsApi->rest_error_handling: #{e}"
end
```

#### Using the rest_error_handling_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> rest_error_handling_with_http_info

```ruby
begin
  # Error handling
  data, status_code, headers = api_instance.rest_error_handling_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling RealTimeEventsApi->rest_error_handling_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

