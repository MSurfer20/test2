# OpenAPI\Server\Api\StreamsApiInterface

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveStream**](StreamsApiInterface.md#archiveStream) | **DELETE** /streams/{stream_id} | Archive a stream
[**createBigBlueButtonVideoCall**](StreamsApiInterface.md#createBigBlueButtonVideoCall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
[**getStreamId**](StreamsApiInterface.md#getStreamId) | **GET** /get_stream_id | Get stream ID
[**getStreamTopics**](StreamsApiInterface.md#getStreamTopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
[**getStreams**](StreamsApiInterface.md#getStreams) | **GET** /streams | Get all streams
[**getSubscriptionStatus**](StreamsApiInterface.md#getSubscriptionStatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**getSubscriptions**](StreamsApiInterface.md#getSubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
[**muteTopic**](StreamsApiInterface.md#muteTopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
[**subscribe**](StreamsApiInterface.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
[**unsubscribe**](StreamsApiInterface.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
[**updateStream**](StreamsApiInterface.md#updateStream) | **PATCH** /streams/{stream_id} | Update a stream
[**updateSubscriptionSettings**](StreamsApiInterface.md#updateSubscriptionSettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
[**updateSubscriptions**](StreamsApiInterface.md#updateSubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.streams:
        class: Acme\MyBundle\Api\StreamsApi
        tags:
            - { name: "open_api_server.api", api: "streams" }
    # ...
```

## **archiveStream**
> JsonSuccess archiveStream($streamId)

Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StreamsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StreamsApiInterface;

class StreamsApi implements StreamsApiInterface
{

    // ...

    /**
     * Implementation of StreamsApiInterface#archiveStream
     */
    public function archiveStream($streamId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **int**| The ID of the stream to access. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createBigBlueButtonVideoCall**
> JsonSuccessBase createBigBlueButtonVideoCall()

Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StreamsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StreamsApiInterface;

class StreamsApi implements StreamsApiInterface
{

    // ...

    /**
     * Implementation of StreamsApiInterface#createBigBlueButtonVideoCall
     */
    public function createBigBlueButtonVideoCall()
    {
        // Implement the operation ...
    }

    // ...
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getStreamId**
> JsonSuccessBase getStreamId($stream)

Get stream ID

Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StreamsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StreamsApiInterface;

class StreamsApi implements StreamsApiInterface
{

    // ...

    /**
     * Implementation of StreamsApiInterface#getStreamId
     */
    public function getStreamId($stream)
    {
        // Implement the operation ...
    }

    // ...
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getStreamTopics**
> JsonSuccessBase getStreamTopics($streamId)

Get topics in a stream

Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StreamsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StreamsApiInterface;

class StreamsApi implements StreamsApiInterface
{

    // ...

    /**
     * Implementation of StreamsApiInterface#getStreamTopics
     */
    public function getStreamTopics($streamId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **int**| The ID of the stream to access. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getStreams**
> JsonSuccessBase getStreams($includePublic, $includeWebPublic, $includeSubscribed, $includeAllActive, $includeDefault, $includeOwnerSubscribed)

Get all streams

Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StreamsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StreamsApiInterface;

class StreamsApi implements StreamsApiInterface
{

    // ...

    /**
     * Implementation of StreamsApiInterface#getStreams
     */
    public function getStreams($includePublic = 'true', $includeWebPublic = 'false', $includeSubscribed = 'true', $includeAllActive = 'false', $includeDefault = 'false', $includeOwnerSubscribed = 'false')
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includePublic** | **bool**| Include all public streams. | [optional] [default to true]
 **includeWebPublic** | **bool**| Include all web public streams. | [optional] [default to false]
 **includeSubscribed** | **bool**| Include all streams that the user is subscribed to. | [optional] [default to true]
 **includeAllActive** | **bool**| Include all active streams. The user must have administrative privileges to use this parameter. | [optional] [default to false]
 **includeDefault** | **bool**| Include all default streams for the user&#39;s realm. | [optional] [default to false]
 **includeOwnerSubscribed** | **bool**| If the user is a bot, include all streams that the bot&#39;s owner is subscribed to. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getSubscriptionStatus**
> JsonSuccessBase getSubscriptionStatus($userId, $streamId)

Get subscription status

Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StreamsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StreamsApiInterface;

class StreamsApi implements StreamsApiInterface
{

    // ...

    /**
     * Implementation of StreamsApiInterface#getSubscriptionStatus
     */
    public function getSubscriptionStatus($userId, $streamId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **int**| The target user&#39;s ID. |
 **streamId** | **int**| The ID of the stream to access. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getSubscriptions**
> JsonSuccessBase getSubscriptions($includeSubscribers)

Get subscribed streams

Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StreamsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StreamsApiInterface;

class StreamsApi implements StreamsApiInterface
{

    // ...

    /**
     * Implementation of StreamsApiInterface#getSubscriptions
     */
    public function getSubscriptions($includeSubscribers = 'false')
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeSubscribers** | **bool**| Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **muteTopic**
> JsonSuccess muteTopic($topic, $op, $stream, $streamId)

Topic muting

This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StreamsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StreamsApiInterface;

class StreamsApi implements StreamsApiInterface
{

    // ...

    /**
     * Implementation of StreamsApiInterface#muteTopic
     */
    public function muteTopic($topic, $op, $stream = null, $streamId = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topic** | **string**| The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. |
 **op** | **string**| Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. |
 **stream** | **string**| The name of the stream to access. | [optional]
 **streamId** | **int**| The ID of the stream to access. | [optional]

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **subscribe**
> OneOfObjectObject subscribe($subscriptions, $principals, $authorizationErrorsFatal, $announce, $inviteOnly, $historyPublicToSubscribers, $streamPostPolicy, $messageRetentionDays)

Subscribe to a stream

Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StreamsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StreamsApiInterface;

class StreamsApi implements StreamsApiInterface
{

    // ...

    /**
     * Implementation of StreamsApiInterface#subscribe
     */
    public function subscribe(array $subscriptions, array $principals = null, $authorizationErrorsFatal = 'true', $announce = 'false', $inviteOnly = 'false', $historyPublicToSubscribers = null, $streamPostPolicy = '1', $messageRetentionDays = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**array**](../Model/array.md)| A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. |
 **principals** | [**OneOfStringInteger**](../Model/OneOfStringInteger.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). | [optional]
 **authorizationErrorsFatal** | **bool**| A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key. | [optional] [default to true]
 **announce** | **bool**| If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation. | [optional] [default to false]
 **inviteOnly** | **bool**| As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. | [optional] [default to false]
 **historyPublicToSubscribers** | **bool**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. | [optional]
 **streamPostPolicy** | **int**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. | [optional] [default to 1]
 **messageRetentionDays** | [**OneOfStringInteger**](../Model/.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). | [optional]

### Return type

[**OneOfObjectObject**](../Model/OneOfObjectObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **unsubscribe**
> JsonSuccessBase unsubscribe($subscriptions, $principals)

Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StreamsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StreamsApiInterface;

class StreamsApi implements StreamsApiInterface
{

    // ...

    /**
     * Implementation of StreamsApiInterface#unsubscribe
     */
    public function unsubscribe(array $subscriptions, array $principals = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**string**](../Model/string.md)| A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. |
 **principals** | [**OneOfStringInteger**](../Model/OneOfStringInteger.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). | [optional]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateStream**
> JsonSuccess updateStream($streamId, $description, $newName, $isPrivate, $isAnnouncementOnly, $streamPostPolicy, $historyPublicToSubscribers, $messageRetentionDays)

Update a stream

Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StreamsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StreamsApiInterface;

class StreamsApi implements StreamsApiInterface
{

    // ...

    /**
     * Implementation of StreamsApiInterface#updateStream
     */
    public function updateStream($streamId, $description = null, $newName = null, $isPrivate = null, $isAnnouncementOnly = null, $streamPostPolicy = '1', $historyPublicToSubscribers = null, $messageRetentionDays = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **int**| The ID of the stream to access. |
 **description** | **string**| The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). | [optional]
 **newName** | **string**| The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). | [optional]
 **isPrivate** | **bool**| Change whether the stream is a private stream. | [optional]
 **isAnnouncementOnly** | **bool**| Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. | [optional]
 **streamPostPolicy** | **int**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. | [optional] [default to 1]
 **historyPublicToSubscribers** | **bool**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. | [optional]
 **messageRetentionDays** | [**OneOfStringInteger**](../Model/.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). | [optional]

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateSubscriptionSettings**
> JsonSuccessBase updateSubscriptionSettings($subscriptionData)

Update subscription settings

This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StreamsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StreamsApiInterface;

class StreamsApi implements StreamsApiInterface
{

    // ...

    /**
     * Implementation of StreamsApiInterface#updateSubscriptionSettings
     */
    public function updateSubscriptionSettings(array $subscriptionData)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionData** | [**array**](../Model/array.md)| A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateSubscriptions**
> JsonSuccessBase updateSubscriptions($delete, $add)

Update subscriptions

Update which streams you are are subscribed to.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StreamsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StreamsApiInterface;

class StreamsApi implements StreamsApiInterface
{

    // ...

    /**
     * Implementation of StreamsApiInterface#updateSubscriptions
     */
    public function updateSubscriptions(array $delete = null, array $add = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete** | [**string**](../Model/string.md)| A list of stream names to unsubscribe from. | [optional]
 **add** | [**array**](../Model/array.md)| A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. | [optional]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

