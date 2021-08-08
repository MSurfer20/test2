# openapi.api.StreamsApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveStream**](StreamsApi.md#archiveStream) | **Delete** /streams/:stream_id | Archive a stream
[**createBigBlueButtonVideoCall**](StreamsApi.md#createBigBlueButtonVideoCall) | **Get** /calls/bigbluebutton/create | Create BigBlueButton video call
[**deleteTopic**](StreamsApi.md#deleteTopic) | **Post** /streams/:stream_id/delete_topic | Delete a topic
[**getStreamId**](StreamsApi.md#getStreamId) | **Get** /get_stream_id | Get stream ID
[**getStreamTopics**](StreamsApi.md#getStreamTopics) | **Get** /users/me/:stream_id/topics | Get topics in a stream
[**getStreams**](StreamsApi.md#getStreams) | **Get** /streams | Get all streams
[**getSubscribers**](StreamsApi.md#getSubscribers) | **Get** /streams/:stream_id/members | Get the subscribers of a stream
[**getSubscriptionStatus**](StreamsApi.md#getSubscriptionStatus) | **Get** /users/:user_id/subscriptions/:stream_id | Get subscription status
[**getSubscriptions**](StreamsApi.md#getSubscriptions) | **Get** /users/me/subscriptions | Get subscribed streams
[**muteTopic**](StreamsApi.md#muteTopic) | **Patch** /users/me/subscriptions/muted_topics | Topic muting
[**subscribe**](StreamsApi.md#subscribe) | **Post** /users/me/subscriptions | Subscribe to a stream
[**unsubscribe**](StreamsApi.md#unsubscribe) | **Delete** /users/me/subscriptions | Unsubscribe from a stream
[**updateStream**](StreamsApi.md#updateStream) | **Patch** /streams/:stream_id | Update a stream
[**updateSubscriptionSettings**](StreamsApi.md#updateSubscriptionSettings) | **Post** /users/me/subscriptions/properties | Update subscription settings
[**updateSubscriptions**](StreamsApi.md#updateSubscriptions) | **Patch** /users/me/subscriptions | Update subscriptions


# **archiveStream**
> JsonSuccess archiveStream(streamId)

Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();
var streamId = 1; // int | The ID of the stream to access. 

try { 
    var result = api_instance.archiveStream(streamId);
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->archiveStream: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **int**| The ID of the stream to access.  | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createBigBlueButtonVideoCall**
> JsonSuccessBase createBigBlueButtonVideoCall()

Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();

try { 
    var result = api_instance.createBigBlueButtonVideoCall();
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->createBigBlueButtonVideoCall: $e\n");
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteTopic**
> JsonSuccess deleteTopic(streamId, topicName)

Delete a topic

Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();
var streamId = 1; // int | The ID of the stream to access. 
var topicName = new coffee machine; // String | The name of the topic to delete. 

try { 
    var result = api_instance.deleteTopic(streamId, topicName);
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->deleteTopic: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **int**| The ID of the stream to access.  | [default to null]
 **topicName** | **String**| The name of the topic to delete.  | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getStreamId**
> JsonSuccessBase getStreamId(stream)

Get stream ID

Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();
var stream = Denmark; // String | The name of the stream to access. 

try { 
    var result = api_instance.getStreamId(stream);
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->getStreamId: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **String**| The name of the stream to access.  | [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getStreamTopics**
> JsonSuccessBase getStreamTopics(streamId)

Get topics in a stream

Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();
var streamId = 1; // int | The ID of the stream to access. 

try { 
    var result = api_instance.getStreamTopics(streamId);
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->getStreamTopics: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **int**| The ID of the stream to access.  | [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getStreams**
> JsonSuccessBase getStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed)

Get all streams

Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();
var includePublic = false; // bool | Include all public streams. 
var includeWebPublic = true; // bool | Include all web public streams. 
var includeSubscribed = false; // bool | Include all streams that the user is subscribed to. 
var includeAllActive = true; // bool | Include all active streams. The user must have administrative privileges to use this parameter. 
var includeDefault = true; // bool | Include all default streams for the user's realm. 
var includeOwnerSubscribed = true; // bool | If the user is a bot, include all streams that the bot's owner is subscribed to. 

try { 
    var result = api_instance.getStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed);
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->getStreams: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includePublic** | **bool**| Include all public streams.  | [optional] [default to true]
 **includeWebPublic** | **bool**| Include all web public streams.  | [optional] [default to false]
 **includeSubscribed** | **bool**| Include all streams that the user is subscribed to.  | [optional] [default to true]
 **includeAllActive** | **bool**| Include all active streams. The user must have administrative privileges to use this parameter.  | [optional] [default to false]
 **includeDefault** | **bool**| Include all default streams for the user&#39;s realm.  | [optional] [default to false]
 **includeOwnerSubscribed** | **bool**| If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSubscribers**
> JsonSuccessBase getSubscribers(streamId)

Get the subscribers of a stream

Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();
var streamId = 1; // int | The ID of the stream to access. 

try { 
    var result = api_instance.getSubscribers(streamId);
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->getSubscribers: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **int**| The ID of the stream to access.  | [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSubscriptionStatus**
> JsonSuccessBase getSubscriptionStatus(userId, streamId)

Get subscription status

Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();
var userId = 12; // int | The target user's ID. 
var streamId = 1; // int | The ID of the stream to access. 

try { 
    var result = api_instance.getSubscriptionStatus(userId, streamId);
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->getSubscriptionStatus: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **int**| The target user&#39;s ID.  | [default to null]
 **streamId** | **int**| The ID of the stream to access.  | [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSubscriptions**
> JsonSuccessBase getSubscriptions(includeSubscribers)

Get subscribed streams

Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();
var includeSubscribers = true; // bool | Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 

try { 
    var result = api_instance.getSubscriptions(includeSubscribers);
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->getSubscriptions: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeSubscribers** | **bool**| Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **muteTopic**
> JsonSuccess muteTopic(topic, op, stream, streamId)

Topic muting

This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();
var topic = dinner; // String | The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
var op = add; // String | Whether to mute (`add`) or unmute (`remove`) the provided topic. 
var stream = Denmark; // String | The name of the stream to access. 
var streamId = 42; // int | The ID of the stream to access. 

try { 
    var result = api_instance.muteTopic(topic, op, stream, streamId);
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->muteTopic: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topic** | **String**| The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  | [default to null]
 **op** | **String**| Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic.  | [default to null]
 **stream** | **String**| The name of the stream to access.  | [optional] [default to null]
 **streamId** | **int**| The ID of the stream to access.  | [optional] [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **subscribe**
> OneOfobjectobject subscribe(subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays)

Subscribe to a stream

Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();
var subscriptions = []; // List<Object> | A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
var principals = []; // List<OneOfstringinteger> | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
var authorizationErrorsFatal = false; // bool | A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key. 
var announce = true; // bool | If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation. 
var inviteOnly = true; // bool | As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
var historyPublicToSubscribers = false; // bool | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
var streamPostPolicy = 2; // int | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
var messageRetentionDays = 20; // OneOfstringinteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 

try { 
    var result = api_instance.subscribe(subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays);
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->subscribe: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**List&lt;Object&gt;**](Object.md)| A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value.  | [default to const []]
 **principals** | [**List&lt;OneOfstringinteger&gt;**](OneOfstringinteger.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] [default to const []]
 **authorizationErrorsFatal** | **bool**| A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  | [optional] [default to true]
 **announce** | **bool**| If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  | [optional] [default to false]
 **inviteOnly** | **bool**| As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  | [optional] [default to false]
 **historyPublicToSubscribers** | **bool**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] [default to null]
 **streamPostPolicy** | **int**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **messageRetentionDays** | [**OneOfstringinteger**](.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] [default to null]

### Return type

[**OneOfobjectobject**](OneOfobjectobject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unsubscribe**
> JsonSuccessBase unsubscribe(subscriptions, principals)

Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();
var subscriptions = []; // List<String> | A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
var principals = []; // List<OneOfstringinteger> | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 

try { 
    var result = api_instance.unsubscribe(subscriptions, principals);
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->unsubscribe: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**List&lt;String&gt;**](String.md)| A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API.  | [default to const []]
 **principals** | [**List&lt;OneOfstringinteger&gt;**](OneOfstringinteger.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] [default to const []]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateStream**
> JsonSuccess updateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays)

Update a stream

Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();
var streamId = 1; // int | The ID of the stream to access. 
var description = Discuss Italian history and travel destinations.; // String | The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
var newName = Italy; // String | The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
var isPrivate = true; // bool | Change whether the stream is a private stream. 
var isAnnouncementOnly = true; // bool | Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. 
var streamPostPolicy = 2; // int | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
var historyPublicToSubscribers = false; // bool | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
var messageRetentionDays = 20; // OneOfstringinteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 

try { 
    var result = api_instance.updateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays);
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->updateStream: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **int**| The ID of the stream to access.  | [default to null]
 **description** | **String**| The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] [default to null]
 **newName** | **String**| The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] [default to null]
 **isPrivate** | **bool**| Change whether the stream is a private stream.  | [optional] [default to null]
 **isAnnouncementOnly** | **bool**| Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  | [optional] [default to null]
 **streamPostPolicy** | **int**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **historyPublicToSubscribers** | **bool**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] [default to null]
 **messageRetentionDays** | [**OneOfstringinteger**](.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateSubscriptionSettings**
> JsonSuccessBase updateSubscriptionSettings(subscriptionData)

Update subscription settings

This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();
var subscriptionData = []; // List<Object> | A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 

try { 
    var result = api_instance.updateSubscriptionSettings(subscriptionData);
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->updateSubscriptionSettings: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionData** | [**List&lt;Object&gt;**](Object.md)| A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream.  | [default to const []]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateSubscriptions**
> JsonSuccessBase updateSubscriptions(delete, add)

Update subscriptions

Update which streams you are are subscribed to. 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new StreamsApi();
var delete = []; // List<String> | A list of stream names to unsubscribe from. 
var add = []; // List<Object> | A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 

try { 
    var result = api_instance.updateSubscriptions(delete, add);
    print(result);
} catch (e) {
    print("Exception when calling StreamsApi->updateSubscriptions: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete** | [**List&lt;String&gt;**](String.md)| A list of stream names to unsubscribe from.  | [optional] [default to const []]
 **add** | [**List&lt;Object&gt;**](Object.md)| A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  | [optional] [default to const []]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

