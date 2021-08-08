# StreamsApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveStream**](StreamsApi.md#archiveStream) | **DELETE** /streams/{stream_id} | Archive a stream
[**createBigBlueButtonVideoCall**](StreamsApi.md#createBigBlueButtonVideoCall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
[**getStreamId**](StreamsApi.md#getStreamId) | **GET** /get_stream_id | Get stream ID
[**getStreamTopics**](StreamsApi.md#getStreamTopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
[**getStreams**](StreamsApi.md#getStreams) | **GET** /streams | Get all streams
[**getSubscriptionStatus**](StreamsApi.md#getSubscriptionStatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**getSubscriptions**](StreamsApi.md#getSubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
[**muteTopic**](StreamsApi.md#muteTopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
[**subscribe**](StreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
[**unsubscribe**](StreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
[**updateStream**](StreamsApi.md#updateStream) | **PATCH** /streams/{stream_id} | Update a stream
[**updateSubscriptionSettings**](StreamsApi.md#updateSubscriptionSettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
[**updateSubscriptions**](StreamsApi.md#updateSubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions



## archiveStream

Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID 'stream_id'.

'DELETE {{ api_url }}/v1/streams/{stream_id}'

### Example

```bash
 archiveStream stream_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **integer** | The ID of the stream to access. | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createBigBlueButtonVideoCall

Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call.
Requires BigBlueButton to be configured on the Zulip server.

### Example

```bash
 createBigBlueButtonVideoCall
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getStreamId

Get stream ID

Get the unique ID of a given stream.

'GET {{ api_url }}/v1/get_stream_id'

### Example

```bash
 getStreamId  stream=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **string** | The name of the stream to access. | [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getStreamTopics

Get topics in a stream

Get all the topics in a specific stream

'GET {{ api_url }}/v1/users/me/{stream_id}/topics'

### Example

```bash
 getStreamTopics stream_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **integer** | The ID of the stream to access. | [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getStreams

Get all streams

Get all streams that the user has access to.

'GET {{ api_url }}/v1/streams'

### Example

```bash
 getStreams  include_public=value  include_web_public=value  include_subscribed=value  include_all_active=value  include_default=value  include_owner_subscribed=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includePublic** | **boolean** | Include all public streams. | [optional] [default to true]
 **includeWebPublic** | **boolean** | Include all web public streams. | [optional] [default to false]
 **includeSubscribed** | **boolean** | Include all streams that the user is subscribed to. | [optional] [default to true]
 **includeAllActive** | **boolean** | Include all active streams. The user must have administrative privileges
to use this parameter. | [optional] [default to false]
 **includeDefault** | **boolean** | Include all default streams for the user's realm. | [optional] [default to false]
 **includeOwnerSubscribed** | **boolean** | If the user is a bot, include all streams that the bot's owner is
subscribed to. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getSubscriptionStatus

Get subscription status

Check whether a user is subscribed to a stream.

'GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}'

**Changes**: New in Zulip 3.0 (feature level 11).

### Example

```bash
 getSubscriptionStatus user_id=value stream_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **integer** | The target user's ID. | [default to null]
 **streamId** | **integer** | The ID of the stream to access. | [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getSubscriptions

Get subscribed streams

Get all streams that the user is subscribed to.

'GET {{ api_url }}/v1/users/me/subscriptions'

### Example

```bash
 getSubscriptions  include_subscribers=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeSubscribers** | **boolean** | Whether each returned stream object should include a 'subscribers'
field containing a list of the user IDs of its subscribers.

(This may be significantly slower in organizations with
thousands of users subscribed to many streams.)

**Changes**: New in Zulip 2.1.0. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## muteTopic

Topic muting

This endpoint mutes/unmutes a topic within a stream that the current
user is subscribed to.  Muted topics are displayed faded in the Zulip
UI, and are not included in the user's unread count totals.

'PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics'

### Example

```bash
 muteTopic  topic=value  op=value  stream=value  stream_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topic** | **string** | The topic to (un)mute. Note that the request will succeed regardless of
whether any messages have been sent to the specified topic. | [default to null]
 **op** | **string** | Whether to mute ('add') or unmute ('remove') the provided topic. | [default to null]
 **stream** | **string** | The name of the stream to access. | [optional] [default to null]
 **streamId** | **integer** | The ID of the stream to access. | [optional] [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## subscribe

Subscribe to a stream

Subscribe one or more users to one or more streams.

'POST {{ api_url }}/v1/users/me/subscriptions'

If any of the specified streams do not exist, they are automatically
created.  The initial [stream settings](/api/update-stream) will be determined
by the optional parameters like 'invite_only' detailed below.

### Example

```bash
 subscribe  Specify as:  subscriptions=value1 subscriptions=value2 subscriptions=...  Specify as:  principals=value1 principals=value2 principals=...  authorization_errors_fatal=value  announce=value  invite_only=value  history_public_to_subscribers=value  stream_post_policy=value  message_retention_days=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**array[map]**](map.md) | A list of dictionaries containing the key 'name' and value
specifying the name of the stream to subscribe. If the stream does not
exist a new stream is created. The description of the stream created can
be specified by setting the dictionary key 'description' with an
appropriate value. | [default to null]
 **principals** | [**array[OneOf&lt;string,integer&gt;]**](OneOf&lt;string,integer&gt;.md) | A list of user ids (preferred) or Zulip display email
addresses of the users to be subscribed to or unsubscribed
from the streams specified in the 'subscriptions' parameter. If
not provided, then the requesting user/bot is subscribed.

**Changes**: The integer format is new in Zulip 3.0 (feature level 9). | [optional] [default to null]
 **authorizationErrorsFatal** | **boolean** | A boolean specifying whether authorization errors (such as when the
requesting user is not authorized to access a private stream) should be
considered fatal or not. When 'True', an authorization error is reported
as such. When set to 'False', the response will be a 200 and any streams
where the request encountered an authorization error will be listed
in the 'unauthorized' key. | [optional] [default to true]
 **announce** | **boolean** | If one of the streams specified did not exist previously and is thus craeted
by this call, this determines whether [notification bot](/help/configure-notification-bot)
will send an announcement about the new stream's creation. | [optional] [default to false]
 **inviteOnly** | **boolean** | As described above, this endpoint will create a new stream if passed
a stream name that doesn't already exist.  This parameters and the ones
that follow are used to request an initial configuration of a created
stream; they are ignored for streams that already exist.

This parameter determines whether any newly created streams will be
private streams. | [optional] [default to false]
 **historyPublicToSubscribers** | **boolean** | Whether the stream's message history should be available to
newly subscribed members, or users can only access messages
they actually received while subscribed to the stream.

Corresponds to the [shared history](/help/stream-permissions)
option in documentation. | [optional] [default to null]
 **streamPostPolicy** | **integer** | Policy for which users can post messages to the stream.

* 1 => Any user can post.
* 2 => Only administrators can post.
* 3 => Only full members can post.
* 4 => Only moderators can post.

**Changes**: New in Zulip 3.0, replacing the previous
'is_announcement_only' boolean. | [optional] [default to 1]
 **messageRetentionDays** | [**OneOf&lt;string,integer&gt;**](.md) | Number of days that messages sent to this stream will be stored
before being automatically deleted by the [message retention
policy](/help/message-retention-policy).  Two special string format
values are supported:

* \"realm_default\" => Return to the organization-level setting.
* \"forever\" => Retain messages forever.

**Changes**: New in Zulip 3.0 (feature level 17). | [optional] [default to null]

### Return type

[**OneOf<object,object>**](OneOf&lt;object,object&gt;.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## unsubscribe

Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.

'DELETE {{ api_url }}/v1/users/me/subscriptions'

### Example

```bash
 unsubscribe  Specify as:  subscriptions=value1 subscriptions=value2 subscriptions=...  Specify as:  principals=value1 principals=value2 principals=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**array[string]**](string.md) | A list of stream names to unsubscribe from. This parameter is called
'streams' in our Python API. | [default to null]
 **principals** | [**array[OneOf&lt;string,integer&gt;]**](OneOf&lt;string,integer&gt;.md) | A list of user ids (preferred) or Zulip display email
addresses of the users to be subscribed to or unsubscribed
from the streams specified in the 'subscriptions' parameter. If
not provided, then the requesting user/bot is subscribed.

**Changes**: The integer format is new in Zulip 3.0 (feature level 9). | [optional] [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateStream

Update a stream

Configure the stream with the ID 'stream_id'.  This endpoint supports
an organization administrator editing any property of a stream,
including:

* Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description)
* Stream [permissions](/help/stream-permissions), including
[privacy](/help/change-the-privacy-of-a-stream) and [who can
send](/help/stream-sending-policy).

'PATCH {{ api_url }}/v1/streams/{stream_id}'

### Example

```bash
 updateStream stream_id=value  description=value  new_name=value  is_private=value  is_announcement_only=value  stream_post_policy=value  history_public_to_subscribers=value  message_retention_days=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **integer** | The ID of the stream to access. | [default to null]
 **description** | **string** | The new description for the stream. Limited Zulip markdown is allowed in this
field.

**Changes**: Removed unnecessary JSON-encoding of this parameter in
Zulip 4.0 (feature level 64). | [optional] [default to null]
 **newName** | **string** | The new name for the stream.

**Changes**: Removed unnecessary JSON-encoding of this parameter in
Zulip 4.0 (feature level 64). | [optional] [default to null]
 **isPrivate** | **boolean** | Change whether the stream is a private stream. | [optional] [default to null]
 **isAnnouncementOnly** | **boolean** | Whether the stream is limited to announcements.

**Changes**: Deprecated in Zulip 3.0 (feature level 1), use
  'stream_post_policy' instead. | [optional] [default to null]
 **streamPostPolicy** | **integer** | Policy for which users can post messages to the stream.

* 1 => Any user can post.
* 2 => Only administrators can post.
* 3 => Only full members can post.
* 4 => Only moderators can post.

**Changes**: New in Zulip 3.0, replacing the previous
'is_announcement_only' boolean. | [optional] [default to 1]
 **historyPublicToSubscribers** | **boolean** | Whether the stream's message history should be available to
newly subscribed members, or users can only access messages
they actually received while subscribed to the stream.

Corresponds to the [shared history](/help/stream-permissions)
option in documentation. | [optional] [default to null]
 **messageRetentionDays** | [**OneOf&lt;string,integer&gt;**](.md) | Number of days that messages sent to this stream will be stored
before being automatically deleted by the [message retention
policy](/help/message-retention-policy).  Two special string format
values are supported:

* \"realm_default\" => Return to the organization-level setting.
* \"forever\" => Retain messages forever.

**Changes**: New in Zulip 3.0 (feature level 17). | [optional] [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateSubscriptionSettings

Update subscription settings

This endpoint is used to update the user's personal settings for the
streams they are subscribed to, including muting, color, pinning, and
per-stream notification settings.

'POST {{ api_url }}/v1/users/me/subscriptions/properties'

### Example

```bash
 updateSubscriptionSettings  Specify as:  subscription_data=value1 subscription_data=value2 subscription_data=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionData** | [**array[map]**](map.md) | A list of objects that describe the changes that should be applied in
each subscription. Each object represents a subscription, and must have
a 'stream_id' key that identifies the stream, as well as the 'property'
being modified and its new 'value'.

The possible values for each 'property' and 'value' pairs are:

* 'color' (string): the hex value of the user's display color for the stream.
* 'is_muted' (boolean): whether the stream is
  [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was
  represented by the more confusingly named 'in_home_view' (with the
  opposite value, 'in_home_view=!is_muted'); for
  backwards-compatibility, modern Zulip still accepts that value.
* 'pin_to_top' (boolean): whether to pin the stream at the top of the stream list.
* 'desktop_notifications' (boolean): whether to show desktop notifications
    for all messages sent to the stream.
* 'audible_notifications' (boolean): whether to play a sound
  notification for all messages sent to the stream.
* 'push_notifications' (boolean): whether to trigger a mobile push
    notification for all messages sent to the stream.
* 'email_notifications' (boolean): whether to trigger an email
    notification for all messages sent to the stream. | [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateSubscriptions

Update subscriptions

Update which streams you are are subscribed to.

### Example

```bash
 updateSubscriptions  Specify as:  delete=value1 delete=value2 delete=...  Specify as:  add=value1 add=value2 add=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete** | [**array[string]**](string.md) | A list of stream names to unsubscribe from. | [optional] [default to null]
 **add** | [**array[map]**](map.md) | A list of objects describing which streams to subscribe to, optionally
including per-user subscription parameters (e.g. color) and if the
stream is to be created, its description. | [optional] [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

