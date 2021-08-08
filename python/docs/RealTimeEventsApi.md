# openapi_client.RealTimeEventsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_queue**](RealTimeEventsApi.md#delete_queue) | **DELETE** /events | Delete an event queue
[**get_events**](RealTimeEventsApi.md#get_events) | **GET** /events | Get events from an event queue
[**real_time_post**](RealTimeEventsApi.md#real_time_post) | **POST** /real-time | 
[**register_queue**](RealTimeEventsApi.md#register_queue) | **POST** /register | Register an event queue
[**rest_error_handling**](RealTimeEventsApi.md#rest_error_handling) | **POST** /rest-error-handling | Error handling


# **delete_queue**
> dict delete_queue(queue_id)

Delete an event queue

Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` 

### Example

```python
import time
import openapi_client
from openapi_client.api import real_time_events_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = real_time_events_api.RealTimeEventsApi(api_client)
    queue_id = "1375801870:2942" # str | The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). 

    # example passing only required values which don't have defaults set
    try:
        # Delete an event queue
        api_response = api_instance.delete_queue(queue_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling RealTimeEventsApi->delete_queue: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue_id** | **str**| The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)).  |

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_events**
> dict get_events(queue_id)

Get events from an event queue

`GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 

### Example

```python
import time
import openapi_client
from openapi_client.api import real_time_events_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = real_time_events_api.RealTimeEventsApi(api_client)
    queue_id = "1375801870:2942" # str | The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). 
    last_event_id = -1 # int | The highest event ID in this queue that you've received and wish to acknowledge. See the [code for `call_on_each_event`](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once.  (optional)
    dont_block = True # bool | Set to `true` if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event.  (optional) if omitted the server will use the default value of False

    # example passing only required values which don't have defaults set
    try:
        # Get events from an event queue
        api_response = api_instance.get_events(queue_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling RealTimeEventsApi->get_events: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get events from an event queue
        api_response = api_instance.get_events(queue_id, last_event_id=last_event_id, dont_block=dont_block)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling RealTimeEventsApi->get_events: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue_id** | **str**| The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)).  |
 **last_event_id** | **int**| The highest event ID in this queue that you&#39;ve received and wish to acknowledge. See the [code for &#x60;call_on_each_event&#x60;](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once.  | [optional]
 **dont_block** | **bool**| Set to &#x60;true&#x60; if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event.  | [optional] if omitted the server will use the default value of False

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **real_time_post**
> real_time_post()



(Ignored) 

### Example

```python
import time
import openapi_client
from openapi_client.api import real_time_events_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = real_time_events_api.RealTimeEventsApi(api_client)
    event_types =  # [str] | A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions.  (optional)
    narrow =  # [[str]] | A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`.  (optional) if omitted the server will use the default value of []
    all_public_streams = True # bool | Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams).  (optional) if omitted the server will use the default value of False

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        api_instance.real_time_post(event_types=event_types, narrow=narrow, all_public_streams=all_public_streams)
    except openapi_client.ApiException as e:
        print("Exception when calling RealTimeEventsApi->real_time_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_types** | **[str]**| A JSON-encoded array indicating which types of events you&#39;re interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: &#x60;event_types&#x3D;[&#39;message&#39;]&#x60;  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions.  | [optional]
 **narrow** | [**[[str]]**]([str].md)| A JSON-encoded array of arrays of length 2 indicating the narrow for which you&#39;d like to receive events for. For instance, to receive events for the stream &#x60;Denmark&#x60;, you would specify &#x60;narrow&#x3D;[[&#39;stream&#39;, &#39;Denmark&#39;]]&#x60;.  Another example is &#x60;narrow&#x3D;[[&#39;is&#39;, &#39;private&#39;]]&#x60; for private messages. Default is &#x60;[]&#x60;.  | [optional] if omitted the server will use the default value of []
 **all_public_streams** | **bool**| Whether you would like to request message events from all public streams.  Useful for workflow bots that you&#39;d like to see all new messages sent to public streams.  (You can also subscribe the user to private streams).  | [optional] if omitted the server will use the default value of False

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **register_queue**
> dict register_queue()

Register an event queue

`POST {{ api_url }}/v1/register`  This powerful endpoint can be used to register a Zulip \"event queue\" (subscribed to certain types of \"events\", or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (`register` also powers the `call_on_each_event` Python API, and is intended primarily for complex applications for which the more convenient `call_on_each_event` API is insufficient).  This endpoint returns a `queue_id` and a `last_event_id`; these can be used in subsequent calls to the [\"events\" endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send `heartbeat` events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling `register` with no `event_types` parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate `event_types` and `fetch_event_types` filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 

### Example

```python
import time
import openapi_client
from openapi_client.api import real_time_events_api
from openapi_client.model.str_bool_date_datetime_dict_float_int_list_str_none_type import StrBoolDateDatetimeDictFloatIntListStrNoneType
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = real_time_events_api.RealTimeEventsApi(api_client)
    apply_markdown = True # bool | Set to `true` if you would like the content to be rendered in HTML format (otherwise the API will return the raw text that the user entered)  (optional) if omitted the server will use the default value of False
    client_gravatar = True # bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) if omitted the server will use the default value of False
    slim_presence = True # bool | Setting this to `true` will make presence dictionaries be keyed by user_id instead of email.  **Changes**: New in Zulip 3.0 (Unstable with no feature level yet).  (optional) if omitted the server will use the default value of False
    event_types =  # [str] | A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions.  (optional)
    all_public_streams = True # bool | Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams).  (optional) if omitted the server will use the default value of False
    include_subscribers = True # bool | Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  (optional) if omitted the server will use the default value of False
    client_capabilities =  # {str: (bool, date, datetime, dict, float, int, list, str, none_type)} | Dictionary containing details on features the client supports that are relevant to the format of responses sent by the server.  * `notification_settings_null`: Boolean for whether the   client can handle the current API with null values for   stream-level notification settings (which means the stream   is not customized and should inherit the user's global   notification settings for stream messages).  New in Zulip   2.1.0; in earlier Zulip releases, stream-level   notification settings were simple booleans.  * `bulk_message_deletion`: Boolean for whether the client's    handler for the `delete_message` event type has been    updated to process the new bulk format (with a    `message_ids`, rather than a singleton `message_id`).    Otherwise, the server will send `delete_message` events    in a loop.  New in Zulip 3.0 (feature level 13).  This    capability is for backwards-compatibility; it will be    required in a future server release.  * `user_avatar_url_field_optional`: Boolean for whether the    client required avatar URLs for all users, or supports    using `GET /avatar/{user_id}` to access user avatars.  If the    client has this capability, the server may skip sending a    `avatar_url` field in the `realm_user` at its sole discretion    to optimize network performance.  This is an important optimization    in organizations with 10,000s of users.    New in Zulip 3.0 (feature level 18).  * `stream_typing_notifications`: Boolean for whether the client   supports stream typing notifications.    New in Zulip 4.0 (feature level 58).  This capability is   for backwards-compatibility; it will be required in a   future server release.  (optional)
    fetch_event_types =  # [str] | Same as the `event_types` parameter except that the values in `fetch_event_types` are used to fetch initial data. If `fetch_event_types` is not provided, `event_types` is used and if `event_types` is not provided, this parameter defaults to `None`.  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions.  (optional)
    narrow =  # [[str]] | A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`.  (optional) if omitted the server will use the default value of []

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Register an event queue
        api_response = api_instance.register_queue(apply_markdown=apply_markdown, client_gravatar=client_gravatar, slim_presence=slim_presence, event_types=event_types, all_public_streams=all_public_streams, include_subscribers=include_subscribers, client_capabilities=client_capabilities, fetch_event_types=fetch_event_types, narrow=narrow)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling RealTimeEventsApi->register_queue: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apply_markdown** | **bool**| Set to &#x60;true&#x60; if you would like the content to be rendered in HTML format (otherwise the API will return the raw text that the user entered)  | [optional] if omitted the server will use the default value of False
 **client_gravatar** | **bool**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] if omitted the server will use the default value of False
 **slim_presence** | **bool**| Setting this to &#x60;true&#x60; will make presence dictionaries be keyed by user_id instead of email.  **Changes**: New in Zulip 3.0 (Unstable with no feature level yet).  | [optional] if omitted the server will use the default value of False
 **event_types** | **[str]**| A JSON-encoded array indicating which types of events you&#39;re interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: &#x60;event_types&#x3D;[&#39;message&#39;]&#x60;  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions.  | [optional]
 **all_public_streams** | **bool**| Whether you would like to request message events from all public streams.  Useful for workflow bots that you&#39;d like to see all new messages sent to public streams.  (You can also subscribe the user to private streams).  | [optional] if omitted the server will use the default value of False
 **include_subscribers** | **bool**| Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [optional] if omitted the server will use the default value of False
 **client_capabilities** | **{str: (bool, date, datetime, dict, float, int, list, str, none_type)}**| Dictionary containing details on features the client supports that are relevant to the format of responses sent by the server.  * &#x60;notification_settings_null&#x60;: Boolean for whether the   client can handle the current API with null values for   stream-level notification settings (which means the stream   is not customized and should inherit the user&#39;s global   notification settings for stream messages).  New in Zulip   2.1.0; in earlier Zulip releases, stream-level   notification settings were simple booleans.  * &#x60;bulk_message_deletion&#x60;: Boolean for whether the client&#39;s    handler for the &#x60;delete_message&#x60; event type has been    updated to process the new bulk format (with a    &#x60;message_ids&#x60;, rather than a singleton &#x60;message_id&#x60;).    Otherwise, the server will send &#x60;delete_message&#x60; events    in a loop.  New in Zulip 3.0 (feature level 13).  This    capability is for backwards-compatibility; it will be    required in a future server release.  * &#x60;user_avatar_url_field_optional&#x60;: Boolean for whether the    client required avatar URLs for all users, or supports    using &#x60;GET /avatar/{user_id}&#x60; to access user avatars.  If the    client has this capability, the server may skip sending a    &#x60;avatar_url&#x60; field in the &#x60;realm_user&#x60; at its sole discretion    to optimize network performance.  This is an important optimization    in organizations with 10,000s of users.    New in Zulip 3.0 (feature level 18).  * &#x60;stream_typing_notifications&#x60;: Boolean for whether the client   supports stream typing notifications.    New in Zulip 4.0 (feature level 58).  This capability is   for backwards-compatibility; it will be required in a   future server release.  | [optional]
 **fetch_event_types** | **[str]**| Same as the &#x60;event_types&#x60; parameter except that the values in &#x60;fetch_event_types&#x60; are used to fetch initial data. If &#x60;fetch_event_types&#x60; is not provided, &#x60;event_types&#x60; is used and if &#x60;event_types&#x60; is not provided, this parameter defaults to &#x60;None&#x60;.  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions.  | [optional]
 **narrow** | [**[[str]]**]([str].md)| A JSON-encoded array of arrays of length 2 indicating the narrow for which you&#39;d like to receive events for. For instance, to receive events for the stream &#x60;Denmark&#x60;, you would specify &#x60;narrow&#x3D;[[&#39;stream&#39;, &#39;Denmark&#39;]]&#x60;.  Another example is &#x60;narrow&#x3D;[[&#39;is&#39;, &#39;private&#39;]]&#x60; for private messages. Default is &#x60;[]&#x60;.  | [optional] if omitted the server will use the default value of []

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **rest_error_handling**
> rest_error_handling()

Error handling

Common error to many endpoints 

### Example

```python
import time
import openapi_client
from openapi_client.api import real_time_events_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = real_time_events_api.RealTimeEventsApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Error handling
        api_instance.rest_error_handling()
    except openapi_client.ApiException as e:
        print("Exception when calling RealTimeEventsApi->rest_error_handling: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Bad request.  |  -  |
**401** | Unauthorized.  |  -  |
**429** | Rate limit exceeded.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

