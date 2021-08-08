# OpenAPI\Client\StreamsApi

All URIs are relative to https://example.zulipchat.com/api/v1.

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveStream()**](StreamsApi.md#archiveStream) | **DELETE** /streams/{stream_id} | Archive a stream
[**createBigBlueButtonVideoCall()**](StreamsApi.md#createBigBlueButtonVideoCall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
[**getStreamId()**](StreamsApi.md#getStreamId) | **GET** /get_stream_id | Get stream ID
[**getStreamTopics()**](StreamsApi.md#getStreamTopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
[**getStreams()**](StreamsApi.md#getStreams) | **GET** /streams | Get all streams
[**getSubscriptionStatus()**](StreamsApi.md#getSubscriptionStatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**getSubscriptions()**](StreamsApi.md#getSubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
[**muteTopic()**](StreamsApi.md#muteTopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
[**subscribe()**](StreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
[**unsubscribe()**](StreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
[**updateStream()**](StreamsApi.md#updateStream) | **PATCH** /streams/{stream_id} | Update a stream
[**updateSubscriptionSettings()**](StreamsApi.md#updateSubscriptionSettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
[**updateSubscriptions()**](StreamsApi.md#updateSubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions


## `archiveStream()`

```php
archiveStream($stream_id): JsonSuccess
```

Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StreamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$stream_id = 1; // int | The ID of the stream to access.

try {
    $result = $apiInstance->archiveStream($stream_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StreamsApi->archiveStream: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream_id** | **int**| The ID of the stream to access. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createBigBlueButtonVideoCall()`

```php
createBigBlueButtonVideoCall(): JsonSuccessBase
```

Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StreamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->createBigBlueButtonVideoCall();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StreamsApi->createBigBlueButtonVideoCall: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getStreamId()`

```php
getStreamId($stream): JsonSuccessBase
```

Get stream ID

Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StreamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$stream = Denmark; // string | The name of the stream to access.

try {
    $result = $apiInstance->getStreamId($stream);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StreamsApi->getStreamId: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **string**| The name of the stream to access. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getStreamTopics()`

```php
getStreamTopics($stream_id): JsonSuccessBase
```

Get topics in a stream

Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StreamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$stream_id = 1; // int | The ID of the stream to access.

try {
    $result = $apiInstance->getStreamTopics($stream_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StreamsApi->getStreamTopics: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream_id** | **int**| The ID of the stream to access. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getStreams()`

```php
getStreams($include_public, $include_web_public, $include_subscribed, $include_all_active, $include_default, $include_owner_subscribed): JsonSuccessBase
```

Get all streams

Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StreamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$include_public = false; // bool | Include all public streams.
$include_web_public = true; // bool | Include all web public streams.
$include_subscribed = false; // bool | Include all streams that the user is subscribed to.
$include_all_active = true; // bool | Include all active streams. The user must have administrative privileges to use this parameter.
$include_default = true; // bool | Include all default streams for the user's realm.
$include_owner_subscribed = true; // bool | If the user is a bot, include all streams that the bot's owner is subscribed to.

try {
    $result = $apiInstance->getStreams($include_public, $include_web_public, $include_subscribed, $include_all_active, $include_default, $include_owner_subscribed);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StreamsApi->getStreams: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_public** | **bool**| Include all public streams. | [optional] [default to true]
 **include_web_public** | **bool**| Include all web public streams. | [optional] [default to false]
 **include_subscribed** | **bool**| Include all streams that the user is subscribed to. | [optional] [default to true]
 **include_all_active** | **bool**| Include all active streams. The user must have administrative privileges to use this parameter. | [optional] [default to false]
 **include_default** | **bool**| Include all default streams for the user&#39;s realm. | [optional] [default to false]
 **include_owner_subscribed** | **bool**| If the user is a bot, include all streams that the bot&#39;s owner is subscribed to. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getSubscriptionStatus()`

```php
getSubscriptionStatus($user_id, $stream_id): JsonSuccessBase
```

Get subscription status

Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StreamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$user_id = 12; // int | The target user's ID.
$stream_id = 1; // int | The ID of the stream to access.

try {
    $result = $apiInstance->getSubscriptionStatus($user_id, $stream_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StreamsApi->getSubscriptionStatus: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| The target user&#39;s ID. |
 **stream_id** | **int**| The ID of the stream to access. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getSubscriptions()`

```php
getSubscriptions($include_subscribers): JsonSuccessBase
```

Get subscribed streams

Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StreamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$include_subscribers = true; // bool | Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.

try {
    $result = $apiInstance->getSubscriptions($include_subscribers);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StreamsApi->getSubscriptions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_subscribers** | **bool**| Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `muteTopic()`

```php
muteTopic($topic, $op, $stream, $stream_id): JsonSuccess
```

Topic muting

This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StreamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$topic = dinner; // string | The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.
$op = add; // string | Whether to mute (`add`) or unmute (`remove`) the provided topic.
$stream = Denmark; // string | The name of the stream to access.
$stream_id = 42; // int | The ID of the stream to access.

try {
    $result = $apiInstance->muteTopic($topic, $op, $stream, $stream_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StreamsApi->muteTopic: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topic** | **string**| The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. |
 **op** | **string**| Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. |
 **stream** | **string**| The name of the stream to access. | [optional]
 **stream_id** | **int**| The ID of the stream to access. | [optional]

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `subscribe()`

```php
subscribe($subscriptions, $principals, $authorization_errors_fatal, $announce, $invite_only, $history_public_to_subscribers, $stream_post_policy, $message_retention_days): OneOfObjectObject
```

Subscribe to a stream

Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StreamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$subscriptions = array(new \stdClass); // object[] | A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value.
$principals = array(new \OpenAPI\Client\Model\OneOfStringInteger()); // OneOfStringInteger[] | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).
$authorization_errors_fatal = false; // bool | A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key.
$announce = true; // bool | If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation.
$invite_only = true; // bool | As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.
$history_public_to_subscribers = false; // bool | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.
$stream_post_policy = 2; // int | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.
$message_retention_days = 20; // OneOfStringInteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).

try {
    $result = $apiInstance->subscribe($subscriptions, $principals, $authorization_errors_fatal, $announce, $invite_only, $history_public_to_subscribers, $stream_post_policy, $message_retention_days);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StreamsApi->subscribe: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**object[]**](../Model/object.md)| A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. |
 **principals** | [**OneOfStringInteger[]**](../Model/OneOfStringInteger.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). | [optional]
 **authorization_errors_fatal** | **bool**| A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. | [optional] [default to true]
 **announce** | **bool**| If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation. | [optional] [default to false]
 **invite_only** | **bool**| As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. | [optional] [default to false]
 **history_public_to_subscribers** | **bool**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. | [optional]
 **stream_post_policy** | **int**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. | [optional] [default to 1]
 **message_retention_days** | [**OneOfStringInteger**](../Model/.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). | [optional]

### Return type

[**OneOfObjectObject**](../Model/OneOfObjectObject.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `unsubscribe()`

```php
unsubscribe($subscriptions, $principals): JsonSuccessBase
```

Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StreamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$subscriptions = array('subscriptions_example'); // string[] | A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API.
$principals = array(new \OpenAPI\Client\Model\OneOfStringInteger()); // OneOfStringInteger[] | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).

try {
    $result = $apiInstance->unsubscribe($subscriptions, $principals);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StreamsApi->unsubscribe: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**string[]**](../Model/string.md)| A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. |
 **principals** | [**OneOfStringInteger[]**](../Model/OneOfStringInteger.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). | [optional]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateStream()`

```php
updateStream($stream_id, $description, $new_name, $is_private, $is_announcement_only, $stream_post_policy, $history_public_to_subscribers, $message_retention_days): JsonSuccess
```

Update a stream

Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StreamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$stream_id = 1; // int | The ID of the stream to access.
$description = Discuss Italian history and travel destinations.; // string | The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).
$new_name = Italy; // string | The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).
$is_private = true; // bool | Change whether the stream is a private stream.
$is_announcement_only = true; // bool | Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead.
$stream_post_policy = 2; // int | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.
$history_public_to_subscribers = false; // bool | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.
$message_retention_days = 20; // OneOfStringInteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).

try {
    $result = $apiInstance->updateStream($stream_id, $description, $new_name, $is_private, $is_announcement_only, $stream_post_policy, $history_public_to_subscribers, $message_retention_days);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StreamsApi->updateStream: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream_id** | **int**| The ID of the stream to access. |
 **description** | **string**| The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). | [optional]
 **new_name** | **string**| The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). | [optional]
 **is_private** | **bool**| Change whether the stream is a private stream. | [optional]
 **is_announcement_only** | **bool**| Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. | [optional]
 **stream_post_policy** | **int**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. | [optional] [default to 1]
 **history_public_to_subscribers** | **bool**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. | [optional]
 **message_retention_days** | [**OneOfStringInteger**](../Model/.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). | [optional]

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateSubscriptionSettings()`

```php
updateSubscriptionSettings($subscription_data): JsonSuccessBase
```

Update subscription settings

This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StreamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$subscription_data = array(new \stdClass); // object[] | A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream.

try {
    $result = $apiInstance->updateSubscriptionSettings($subscription_data);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StreamsApi->updateSubscriptionSettings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription_data** | [**object[]**](../Model/object.md)| A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateSubscriptions()`

```php
updateSubscriptions($delete, $add): JsonSuccessBase
```

Update subscriptions

Update which streams you are are subscribed to.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StreamsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$delete = array('delete_example'); // string[] | A list of stream names to unsubscribe from.
$add = array(new \stdClass); // object[] | A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.

try {
    $result = $apiInstance->updateSubscriptions($delete, $add);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StreamsApi->updateSubscriptions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete** | [**string[]**](../Model/string.md)| A list of stream names to unsubscribe from. | [optional]
 **add** | [**object[]**](../Model/object.md)| A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. | [optional]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
