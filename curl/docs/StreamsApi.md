# openapi_client.StreamsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archive_stream**](StreamsApi.md#archive_stream) | **DELETE** /streams/{stream_id} | Archive a stream
[**create_big_blue_button_video_call**](StreamsApi.md#create_big_blue_button_video_call) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
[**get_stream_id**](StreamsApi.md#get_stream_id) | **GET** /get_stream_id | Get stream ID
[**get_stream_topics**](StreamsApi.md#get_stream_topics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
[**get_streams**](StreamsApi.md#get_streams) | **GET** /streams | Get all streams
[**get_subscription_status**](StreamsApi.md#get_subscription_status) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**get_subscriptions**](StreamsApi.md#get_subscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
[**mute_topic**](StreamsApi.md#mute_topic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
[**subscribe**](StreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
[**unsubscribe**](StreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
[**update_stream**](StreamsApi.md#update_stream) | **PATCH** /streams/{stream_id} | Update a stream
[**update_subscription_settings**](StreamsApi.md#update_subscription_settings) | **POST** /users/me/subscriptions/properties | Update subscription settings
[**update_subscriptions**](StreamsApi.md#update_subscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions


# **archive_stream**
> dict archive_stream(stream_id)

Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 

### Example

```python
import time
import openapi_client
from openapi_client.api import streams_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = streams_api.StreamsApi(api_client)
    stream_id = 1 # int | The ID of the stream to access. 

    # example passing only required values which don't have defaults set
    try:
        # Archive a stream
        api_response = api_instance.archive_stream(stream_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->archive_stream: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream_id** | **int**| The ID of the stream to access.  |

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

# **create_big_blue_button_video_call**
> dict create_big_blue_button_video_call()

Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 

### Example

```python
import time
import openapi_client
from openapi_client.api import streams_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = streams_api.StreamsApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Create BigBlueButton video call
        api_response = api_instance.create_big_blue_button_video_call()
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->create_big_blue_button_video_call: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

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

# **get_stream_id**
> dict get_stream_id(stream)

Get stream ID

Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 

### Example

```python
import time
import openapi_client
from openapi_client.api import streams_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = streams_api.StreamsApi(api_client)
    stream = "Denmark" # str | The name of the stream to access. 

    # example passing only required values which don't have defaults set
    try:
        # Get stream ID
        api_response = api_instance.get_stream_id(stream)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->get_stream_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **str**| The name of the stream to access.  |

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

# **get_stream_topics**
> dict get_stream_topics(stream_id)

Get topics in a stream

Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 

### Example

```python
import time
import openapi_client
from openapi_client.api import streams_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = streams_api.StreamsApi(api_client)
    stream_id = 1 # int | The ID of the stream to access. 

    # example passing only required values which don't have defaults set
    try:
        # Get topics in a stream
        api_response = api_instance.get_stream_topics(stream_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->get_stream_topics: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream_id** | **int**| The ID of the stream to access.  |

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

# **get_streams**
> dict get_streams()

Get all streams

Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 

### Example

```python
import time
import openapi_client
from openapi_client.api import streams_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = streams_api.StreamsApi(api_client)
    include_public = False # bool | Include all public streams.  (optional) if omitted the server will use the default value of True
    include_web_public = True # bool | Include all web public streams.  (optional) if omitted the server will use the default value of False
    include_subscribed = False # bool | Include all streams that the user is subscribed to.  (optional) if omitted the server will use the default value of True
    include_all_active = True # bool | Include all active streams. The user must have administrative privileges to use this parameter.  (optional) if omitted the server will use the default value of False
    include_default = True # bool | Include all default streams for the user's realm.  (optional) if omitted the server will use the default value of False
    include_owner_subscribed = True # bool | If the user is a bot, include all streams that the bot's owner is subscribed to.  (optional) if omitted the server will use the default value of False

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get all streams
        api_response = api_instance.get_streams(include_public=include_public, include_web_public=include_web_public, include_subscribed=include_subscribed, include_all_active=include_all_active, include_default=include_default, include_owner_subscribed=include_owner_subscribed)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->get_streams: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_public** | **bool**| Include all public streams.  | [optional] if omitted the server will use the default value of True
 **include_web_public** | **bool**| Include all web public streams.  | [optional] if omitted the server will use the default value of False
 **include_subscribed** | **bool**| Include all streams that the user is subscribed to.  | [optional] if omitted the server will use the default value of True
 **include_all_active** | **bool**| Include all active streams. The user must have administrative privileges to use this parameter.  | [optional] if omitted the server will use the default value of False
 **include_default** | **bool**| Include all default streams for the user&#39;s realm.  | [optional] if omitted the server will use the default value of False
 **include_owner_subscribed** | **bool**| If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  | [optional] if omitted the server will use the default value of False

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

# **get_subscription_status**
> dict get_subscription_status(user_id, stream_id)

Get subscription status

Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 

### Example

```python
import time
import openapi_client
from openapi_client.api import streams_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = streams_api.StreamsApi(api_client)
    user_id = 12 # int | The target user's ID. 
    stream_id = 1 # int | The ID of the stream to access. 

    # example passing only required values which don't have defaults set
    try:
        # Get subscription status
        api_response = api_instance.get_subscription_status(user_id, stream_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->get_subscription_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| The target user&#39;s ID.  |
 **stream_id** | **int**| The ID of the stream to access.  |

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
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_subscriptions**
> dict get_subscriptions()

Get subscribed streams

Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 

### Example

```python
import time
import openapi_client
from openapi_client.api import streams_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = streams_api.StreamsApi(api_client)
    include_subscribers = True # bool | Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  (optional) if omitted the server will use the default value of False

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get subscribed streams
        api_response = api_instance.get_subscriptions(include_subscribers=include_subscribers)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->get_subscriptions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_subscribers** | **bool**| Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [optional] if omitted the server will use the default value of False

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

# **mute_topic**
> dict mute_topic(topic, op)

Topic muting

This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 

### Example

```python
import time
import openapi_client
from openapi_client.api import streams_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = streams_api.StreamsApi(api_client)
    topic = "dinner" # str | The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
    op = "add" # str | Whether to mute (`add`) or unmute (`remove`) the provided topic. 
    stream = "Denmark" # str | The name of the stream to access.  (optional)
    stream_id = 42 # int | The ID of the stream to access.  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Topic muting
        api_response = api_instance.mute_topic(topic, op)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->mute_topic: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Topic muting
        api_response = api_instance.mute_topic(topic, op, stream=stream, stream_id=stream_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->mute_topic: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topic** | **str**| The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  |
 **op** | **str**| Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic.  |
 **stream** | **str**| The name of the stream to access.  | [optional]
 **stream_id** | **int**| The ID of the stream to access.  | [optional]

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

# **subscribe**
> dict subscribe(subscriptions)

Subscribe to a stream

Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 

### Example

```python
import time
import openapi_client
from openapi_client.api import streams_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = streams_api.StreamsApi(api_client)
    subscriptions =  # [{str: (bool, date, datetime, dict, float, int, list, str, none_type)}] | A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
    principals =  # [dict] | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)
    authorization_errors_fatal = False # bool | A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key.  (optional) if omitted the server will use the default value of True
    announce = True # bool | If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation.  (optional) if omitted the server will use the default value of False
    invite_only = True # bool | As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  (optional) if omitted the server will use the default value of False
    history_public_to_subscribers = False # bool | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
    stream_post_policy = 2 # int | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional) if omitted the server will use the default value of 1
    message_retention_days =  # dict | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Subscribe to a stream
        api_response = api_instance.subscribe(subscriptions)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->subscribe: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Subscribe to a stream
        api_response = api_instance.subscribe(subscriptions, principals=principals, authorization_errors_fatal=authorization_errors_fatal, announce=announce, invite_only=invite_only, history_public_to_subscribers=history_public_to_subscribers, stream_post_policy=stream_post_policy, message_retention_days=message_retention_days)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->subscribe: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**[{str: (bool, date, datetime, dict, float, int, list, str, none_type)}]**]({str: (bool, date, datetime, dict, float, int, list, str, none_type)}.md)| A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value.  |
 **principals** | **[dict]**| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional]
 **authorization_errors_fatal** | **bool**| A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  | [optional] if omitted the server will use the default value of True
 **announce** | **bool**| If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  | [optional] if omitted the server will use the default value of False
 **invite_only** | **bool**| As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  | [optional] if omitted the server will use the default value of False
 **history_public_to_subscribers** | **bool**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional]
 **stream_post_policy** | **int**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] if omitted the server will use the default value of 1
 **message_retention_days** | **dict**| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional]

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
**400** | Success. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unsubscribe**
> dict unsubscribe(subscriptions)

Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 

### Example

```python
import time
import openapi_client
from openapi_client.api import streams_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = streams_api.StreamsApi(api_client)
    subscriptions =  # [str] | A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
    principals =  # [dict] | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Unsubscribe from a stream
        api_response = api_instance.unsubscribe(subscriptions)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->unsubscribe: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Unsubscribe from a stream
        api_response = api_instance.unsubscribe(subscriptions, principals=principals)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->unsubscribe: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | **[str]**| A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API.  |
 **principals** | **[dict]**| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional]

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

# **update_stream**
> dict update_stream(stream_id)

Update a stream

Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 

### Example

```python
import time
import openapi_client
from openapi_client.api import streams_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = streams_api.StreamsApi(api_client)
    stream_id = 1 # int | The ID of the stream to access. 
    description = "Discuss Italian history and travel destinations." # str | The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
    new_name = "Italy" # str | The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
    is_private = True # bool | Change whether the stream is a private stream.  (optional)
    is_announcement_only = True # bool | Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead.  (optional)
    stream_post_policy = 2 # int | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional) if omitted the server will use the default value of 1
    history_public_to_subscribers = False # bool | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
    message_retention_days =  # dict | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Update a stream
        api_response = api_instance.update_stream(stream_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->update_stream: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Update a stream
        api_response = api_instance.update_stream(stream_id, description=description, new_name=new_name, is_private=is_private, is_announcement_only=is_announcement_only, stream_post_policy=stream_post_policy, history_public_to_subscribers=history_public_to_subscribers, message_retention_days=message_retention_days)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->update_stream: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream_id** | **int**| The ID of the stream to access.  |
 **description** | **str**| The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional]
 **new_name** | **str**| The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional]
 **is_private** | **bool**| Change whether the stream is a private stream.  | [optional]
 **is_announcement_only** | **bool**| Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  | [optional]
 **stream_post_policy** | **int**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] if omitted the server will use the default value of 1
 **history_public_to_subscribers** | **bool**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional]
 **message_retention_days** | **dict**| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional]

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

# **update_subscription_settings**
> dict update_subscription_settings(subscription_data)

Update subscription settings

This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 

### Example

```python
import time
import openapi_client
from openapi_client.api import streams_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = streams_api.StreamsApi(api_client)
    subscription_data =  # [{str: (bool, date, datetime, dict, float, int, list, str, none_type)}] | A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 

    # example passing only required values which don't have defaults set
    try:
        # Update subscription settings
        api_response = api_instance.update_subscription_settings(subscription_data)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->update_subscription_settings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription_data** | [**[{str: (bool, date, datetime, dict, float, int, list, str, none_type)}]**]({str: (bool, date, datetime, dict, float, int, list, str, none_type)}.md)| A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream.  |

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

# **update_subscriptions**
> dict update_subscriptions()

Update subscriptions

Update which streams you are are subscribed to. 

### Example

```python
import time
import openapi_client
from openapi_client.api import streams_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = streams_api.StreamsApi(api_client)
    delete =  # [str] | A list of stream names to unsubscribe from.  (optional)
    add =  # [dict] | A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Update subscriptions
        api_response = api_instance.update_subscriptions(delete=delete, add=add)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling StreamsApi->update_subscriptions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete** | **[str]**| A list of stream names to unsubscribe from.  | [optional]
 **add** | **[dict]**| A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  | [optional]

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

