# ZulipRestApi.StreamsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveStream**](StreamsApi.md#archiveStream) | **DELETE** /streams/{stream_id} | Archive a stream
[**createBigBlueButtonVideoCall**](StreamsApi.md#createBigBlueButtonVideoCall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
[**deleteTopic**](StreamsApi.md#deleteTopic) | **POST** /streams/{stream_id}/delete_topic | Delete a topic
[**getStreamId**](StreamsApi.md#getStreamId) | **GET** /get_stream_id | Get stream ID
[**getStreamTopics**](StreamsApi.md#getStreamTopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
[**getStreams**](StreamsApi.md#getStreams) | **GET** /streams | Get all streams
[**getSubscribers**](StreamsApi.md#getSubscribers) | **GET** /streams/{stream_id}/members | Get the subscribers of a stream
[**getSubscriptionStatus**](StreamsApi.md#getSubscriptionStatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**getSubscriptions**](StreamsApi.md#getSubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
[**muteTopic**](StreamsApi.md#muteTopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
[**subscribe**](StreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
[**unsubscribe**](StreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
[**updateStream**](StreamsApi.md#updateStream) | **PATCH** /streams/{stream_id} | Update a stream
[**updateSubscriptionSettings**](StreamsApi.md#updateSubscriptionSettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
[**updateSubscriptions**](StreamsApi.md#updateSubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions



## archiveStream

> JsonSuccess archiveStream(streamId)

Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
let streamId = 1; // Number | The ID of the stream to access. 
apiInstance.archiveStream(streamId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **Number**| The ID of the stream to access.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## createBigBlueButtonVideoCall

> JsonSuccessBase createBigBlueButtonVideoCall()

Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
apiInstance.createBigBlueButtonVideoCall((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## deleteTopic

> JsonSuccess deleteTopic(streamId, topicName)

Delete a topic

Delete all messages in a topic.  &#x60;POST {{ api_url }}/v1/streams/{stream_id}/delete_topic&#x60;  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
let streamId = 1; // Number | The ID of the stream to access. 
let topicName = new coffee machine; // String | The name of the topic to delete. 
apiInstance.deleteTopic(streamId, topicName, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **Number**| The ID of the stream to access.  | 
 **topicName** | **String**| The name of the topic to delete.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStreamId

> JsonSuccessBase getStreamId(stream)

Get stream ID

Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
let stream = Denmark; // String | The name of the stream to access. 
apiInstance.getStreamId(stream, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **String**| The name of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStreamTopics

> JsonSuccessBase getStreamTopics(streamId)

Get topics in a stream

Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
let streamId = 1; // Number | The ID of the stream to access. 
apiInstance.getStreamTopics(streamId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **Number**| The ID of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStreams

> JsonSuccessBase getStreams(opts)

Get all streams

Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
let opts = {
  'includePublic': false, // Boolean | Include all public streams. 
  'includeWebPublic': true, // Boolean | Include all web public streams. 
  'includeSubscribed': false, // Boolean | Include all streams that the user is subscribed to. 
  'includeAllActive': true, // Boolean | Include all active streams. The user must have administrative privileges to use this parameter. 
  'includeDefault': true, // Boolean | Include all default streams for the user's realm. 
  'includeOwnerSubscribed': true // Boolean | If the user is a bot, include all streams that the bot's owner is subscribed to. 
};
apiInstance.getStreams(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includePublic** | **Boolean**| Include all public streams.  | [optional] [default to true]
 **includeWebPublic** | **Boolean**| Include all web public streams.  | [optional] [default to false]
 **includeSubscribed** | **Boolean**| Include all streams that the user is subscribed to.  | [optional] [default to true]
 **includeAllActive** | **Boolean**| Include all active streams. The user must have administrative privileges to use this parameter.  | [optional] [default to false]
 **includeDefault** | **Boolean**| Include all default streams for the user&#39;s realm.  | [optional] [default to false]
 **includeOwnerSubscribed** | **Boolean**| If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSubscribers

> JsonSuccessBase getSubscribers(streamId)

Get the subscribers of a stream

Get all users subscribed to a stream.  &#x60;Get {{ api_url }}/v1/streams/{stream_id}/members&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
let streamId = 1; // Number | The ID of the stream to access. 
apiInstance.getSubscribers(streamId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **Number**| The ID of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSubscriptionStatus

> JsonSuccessBase getSubscriptionStatus(userId, streamId)

Get subscription status

Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
let userId = 12; // Number | The target user's ID. 
let streamId = 1; // Number | The ID of the stream to access. 
apiInstance.getSubscriptionStatus(userId, streamId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Number**| The target user&#39;s ID.  | 
 **streamId** | **Number**| The ID of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSubscriptions

> JsonSuccessBase getSubscriptions(opts)

Get subscribed streams

Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
let opts = {
  'includeSubscribers': true // Boolean | Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
};
apiInstance.getSubscriptions(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeSubscribers** | **Boolean**| Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## muteTopic

> JsonSuccess muteTopic(topic, op, opts)

Topic muting

This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
let topic = dinner; // String | The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
let op = add; // String | Whether to mute (`add`) or unmute (`remove`) the provided topic. 
let opts = {
  'stream': Denmark, // String | The name of the stream to access. 
  'streamId': 42 // Number | The ID of the stream to access. 
};
apiInstance.muteTopic(topic, op, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topic** | **String**| The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  | 
 **op** | **String**| Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic.  | 
 **stream** | **String**| The name of the stream to access.  | [optional] 
 **streamId** | **Number**| The ID of the stream to access.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## subscribe

> OneOfobjectobject subscribe(subscriptions, opts)

Subscribe to a stream

Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
let subscriptions = [null]; // [Object] | A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
let opts = {
  'principals': [new ZulipRestApi.OneOfstringinteger()], // [OneOfstringinteger] | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
  'authorizationErrorsFatal': false, // Boolean | A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key. 
  'announce': true, // Boolean | If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation. 
  'inviteOnly': true, // Boolean | As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
  'historyPublicToSubscribers': false, // Boolean | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
  'streamPostPolicy': 2, // Number | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
  'messageRetentionDays': 20 // OneOfstringinteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
};
apiInstance.subscribe(subscriptions, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**[Object]**](Object.md)| A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value.  | 
 **principals** | [**[OneOfstringinteger]**](OneOfstringinteger.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] 
 **authorizationErrorsFatal** | **Boolean**| A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  | [optional] [default to true]
 **announce** | **Boolean**| If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  | [optional] [default to false]
 **inviteOnly** | **Boolean**| As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  | [optional] [default to false]
 **historyPublicToSubscribers** | **Boolean**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] 
 **streamPostPolicy** | **Number**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **messageRetentionDays** | [**OneOfstringinteger**](.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 

### Return type

[**OneOfobjectobject**](OneOfobjectobject.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## unsubscribe

> JsonSuccessBase unsubscribe(subscriptions, opts)

Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
let subscriptions = ["null"]; // [String] | A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
let opts = {
  'principals': [new ZulipRestApi.OneOfstringinteger()] // [OneOfstringinteger] | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
};
apiInstance.unsubscribe(subscriptions, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**[String]**](String.md)| A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API.  | 
 **principals** | [**[OneOfstringinteger]**](OneOfstringinteger.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateStream

> JsonSuccess updateStream(streamId, opts)

Update a stream

Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
let streamId = 1; // Number | The ID of the stream to access. 
let opts = {
  'description': Discuss Italian history and travel destinations., // String | The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
  'newName': Italy, // String | The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
  'isPrivate': true, // Boolean | Change whether the stream is a private stream. 
  'isAnnouncementOnly': true, // Boolean | Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. 
  'streamPostPolicy': 2, // Number | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
  'historyPublicToSubscribers': false, // Boolean | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
  'messageRetentionDays': 20 // OneOfstringinteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
};
apiInstance.updateStream(streamId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **Number**| The ID of the stream to access.  | 
 **description** | **String**| The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **newName** | **String**| The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **isPrivate** | **Boolean**| Change whether the stream is a private stream.  | [optional] 
 **isAnnouncementOnly** | **Boolean**| Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  | [optional] 
 **streamPostPolicy** | **Number**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **historyPublicToSubscribers** | **Boolean**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] 
 **messageRetentionDays** | [**OneOfstringinteger**](.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateSubscriptionSettings

> JsonSuccessBase updateSubscriptionSettings(subscriptionData)

Update subscription settings

This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
let subscriptionData = [null]; // [Object] | A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 
apiInstance.updateSubscriptionSettings(subscriptionData, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionData** | [**[Object]**](Object.md)| A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateSubscriptions

> JsonSuccessBase updateSubscriptions(opts)

Update subscriptions

Update which streams you are are subscribed to. 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.StreamsApi();
let opts = {
  '_delete': ["null"], // [String] | A list of stream names to unsubscribe from. 
  'add': [null] // [Object] | A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
};
apiInstance.updateSubscriptions(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_delete** | [**[String]**](String.md)| A list of stream names to unsubscribe from.  | [optional] 
 **add** | [**[Object]**](Object.md)| A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

