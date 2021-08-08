# StreamsApi

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


<a name="archiveStream"></a>
# **archiveStream**
> JsonSuccess archiveStream(streamId)

Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
val streamId : kotlin.Int = 1 // kotlin.Int | The ID of the stream to access. 
try {
    val result : JsonSuccess = apiInstance.archiveStream(streamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#archiveStream")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#archiveStream")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **kotlin.Int**| The ID of the stream to access.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBigBlueButtonVideoCall"></a>
# **createBigBlueButtonVideoCall**
> JsonSuccessBase createBigBlueButtonVideoCall()

Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
try {
    val result : JsonSuccessBase = apiInstance.createBigBlueButtonVideoCall()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#createBigBlueButtonVideoCall")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#createBigBlueButtonVideoCall")
    e.printStackTrace()
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

<a name="deleteTopic"></a>
# **deleteTopic**
> JsonSuccess deleteTopic(streamId, topicName)

Delete a topic

Delete all messages in a topic.  &#x60;POST {{ api_url }}/v1/streams/{stream_id}/delete_topic&#x60;  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
val streamId : kotlin.Int = 1 // kotlin.Int | The ID of the stream to access. 
val topicName : kotlin.String = new coffee machine // kotlin.String | The name of the topic to delete. 
try {
    val result : JsonSuccess = apiInstance.deleteTopic(streamId, topicName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#deleteTopic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#deleteTopic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **kotlin.Int**| The ID of the stream to access.  |
 **topicName** | **kotlin.String**| The name of the topic to delete.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStreamId"></a>
# **getStreamId**
> JsonSuccessBase getStreamId(stream)

Get stream ID

Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
val stream : kotlin.String = Denmark // kotlin.String | The name of the stream to access. 
try {
    val result : JsonSuccessBase = apiInstance.getStreamId(stream)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#getStreamId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#getStreamId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **kotlin.String**| The name of the stream to access.  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStreamTopics"></a>
# **getStreamTopics**
> JsonSuccessBase getStreamTopics(streamId)

Get topics in a stream

Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
val streamId : kotlin.Int = 1 // kotlin.Int | The ID of the stream to access. 
try {
    val result : JsonSuccessBase = apiInstance.getStreamTopics(streamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#getStreamTopics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#getStreamTopics")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **kotlin.Int**| The ID of the stream to access.  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStreams"></a>
# **getStreams**
> JsonSuccessBase getStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed)

Get all streams

Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
val includePublic : kotlin.Boolean = false // kotlin.Boolean | Include all public streams. 
val includeWebPublic : kotlin.Boolean = true // kotlin.Boolean | Include all web public streams. 
val includeSubscribed : kotlin.Boolean = false // kotlin.Boolean | Include all streams that the user is subscribed to. 
val includeAllActive : kotlin.Boolean = true // kotlin.Boolean | Include all active streams. The user must have administrative privileges to use this parameter. 
val includeDefault : kotlin.Boolean = true // kotlin.Boolean | Include all default streams for the user's realm. 
val includeOwnerSubscribed : kotlin.Boolean = true // kotlin.Boolean | If the user is a bot, include all streams that the bot's owner is subscribed to. 
try {
    val result : JsonSuccessBase = apiInstance.getStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#getStreams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#getStreams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includePublic** | **kotlin.Boolean**| Include all public streams.  | [optional] [default to true]
 **includeWebPublic** | **kotlin.Boolean**| Include all web public streams.  | [optional] [default to false]
 **includeSubscribed** | **kotlin.Boolean**| Include all streams that the user is subscribed to.  | [optional] [default to true]
 **includeAllActive** | **kotlin.Boolean**| Include all active streams. The user must have administrative privileges to use this parameter.  | [optional] [default to false]
 **includeDefault** | **kotlin.Boolean**| Include all default streams for the user&#39;s realm.  | [optional] [default to false]
 **includeOwnerSubscribed** | **kotlin.Boolean**| If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSubscribers"></a>
# **getSubscribers**
> JsonSuccessBase getSubscribers(streamId)

Get the subscribers of a stream

Get all users subscribed to a stream.  &#x60;Get {{ api_url }}/v1/streams/{stream_id}/members&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
val streamId : kotlin.Int = 1 // kotlin.Int | The ID of the stream to access. 
try {
    val result : JsonSuccessBase = apiInstance.getSubscribers(streamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#getSubscribers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#getSubscribers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **kotlin.Int**| The ID of the stream to access.  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSubscriptionStatus"></a>
# **getSubscriptionStatus**
> JsonSuccessBase getSubscriptionStatus(userId, streamId)

Get subscription status

Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
val userId : kotlin.Int = 12 // kotlin.Int | The target user's ID. 
val streamId : kotlin.Int = 1 // kotlin.Int | The ID of the stream to access. 
try {
    val result : JsonSuccessBase = apiInstance.getSubscriptionStatus(userId, streamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#getSubscriptionStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#getSubscriptionStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.Int**| The target user&#39;s ID.  |
 **streamId** | **kotlin.Int**| The ID of the stream to access.  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSubscriptions"></a>
# **getSubscriptions**
> JsonSuccessBase getSubscriptions(includeSubscribers)

Get subscribed streams

Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
val includeSubscribers : kotlin.Boolean = true // kotlin.Boolean | Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
try {
    val result : JsonSuccessBase = apiInstance.getSubscriptions(includeSubscribers)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#getSubscriptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#getSubscriptions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeSubscribers** | **kotlin.Boolean**| Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="muteTopic"></a>
# **muteTopic**
> JsonSuccess muteTopic(topic, op, stream, streamId)

Topic muting

This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
val topic : kotlin.String = dinner // kotlin.String | The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
val op : kotlin.String = add // kotlin.String | Whether to mute (`add`) or unmute (`remove`) the provided topic. 
val stream : kotlin.String = Denmark // kotlin.String | The name of the stream to access. 
val streamId : kotlin.Int = 42 // kotlin.Int | The ID of the stream to access. 
try {
    val result : JsonSuccess = apiInstance.muteTopic(topic, op, stream, streamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#muteTopic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#muteTopic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topic** | **kotlin.String**| The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  |
 **op** | **kotlin.String**| Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic.  | [enum: add, remove]
 **stream** | **kotlin.String**| The name of the stream to access.  | [optional]
 **streamId** | **kotlin.Int**| The ID of the stream to access.  | [optional]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="subscribe"></a>
# **subscribe**
> OneOfLessThanObjectCommaObjectGreaterThan subscribe(subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays)

Subscribe to a stream

Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
val subscriptions : kotlin.collections.List<kotlin.Any> =  // kotlin.collections.List<kotlin.Any> | A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
val principals : kotlin.collections.List<OneOfLessThanStringCommaIntegerGreaterThan> =  // kotlin.collections.List<OneOfLessThanStringCommaIntegerGreaterThan> | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
val authorizationErrorsFatal : kotlin.Boolean = false // kotlin.Boolean | A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key. 
val announce : kotlin.Boolean = true // kotlin.Boolean | If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation. 
val inviteOnly : kotlin.Boolean = true // kotlin.Boolean | As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
val historyPublicToSubscribers : kotlin.Boolean = false // kotlin.Boolean | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
val streamPostPolicy : kotlin.Int = 2 // kotlin.Int | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
val messageRetentionDays : OneOfLessThanStringCommaIntegerGreaterThan = 20 // OneOfLessThanStringCommaIntegerGreaterThan | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
try {
    val result : OneOfLessThanObjectCommaObjectGreaterThan = apiInstance.subscribe(subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#subscribe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#subscribe")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md)| A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value.  |
 **principals** | [**kotlin.collections.List&lt;OneOfLessThanStringCommaIntegerGreaterThan&gt;**](OneOfLessThanStringCommaIntegerGreaterThan.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional]
 **authorizationErrorsFatal** | **kotlin.Boolean**| A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  | [optional] [default to true]
 **announce** | **kotlin.Boolean**| If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  | [optional] [default to false]
 **inviteOnly** | **kotlin.Boolean**| As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  | [optional] [default to false]
 **historyPublicToSubscribers** | **kotlin.Boolean**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional]
 **streamPostPolicy** | **kotlin.Int**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **messageRetentionDays** | [**OneOfLessThanStringCommaIntegerGreaterThan**](.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional]

### Return type

[**OneOfLessThanObjectCommaObjectGreaterThan**](OneOfLessThanObjectCommaObjectGreaterThan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unsubscribe"></a>
# **unsubscribe**
> JsonSuccessBase unsubscribe(subscriptions, principals)

Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
val subscriptions : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
val principals : kotlin.collections.List<OneOfLessThanStringCommaIntegerGreaterThan> =  // kotlin.collections.List<OneOfLessThanStringCommaIntegerGreaterThan> | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
try {
    val result : JsonSuccessBase = apiInstance.unsubscribe(subscriptions, principals)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#unsubscribe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#unsubscribe")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API.  |
 **principals** | [**kotlin.collections.List&lt;OneOfLessThanStringCommaIntegerGreaterThan&gt;**](OneOfLessThanStringCommaIntegerGreaterThan.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStream"></a>
# **updateStream**
> JsonSuccess updateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays)

Update a stream

Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
val streamId : kotlin.Int = 1 // kotlin.Int | The ID of the stream to access. 
val description : kotlin.String = Discuss Italian history and travel destinations. // kotlin.String | The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
val newName : kotlin.String = Italy // kotlin.String | The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
val isPrivate : kotlin.Boolean = true // kotlin.Boolean | Change whether the stream is a private stream. 
val isAnnouncementOnly : kotlin.Boolean = true // kotlin.Boolean | Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. 
val streamPostPolicy : kotlin.Int = 2 // kotlin.Int | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
val historyPublicToSubscribers : kotlin.Boolean = false // kotlin.Boolean | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
val messageRetentionDays : OneOfLessThanStringCommaIntegerGreaterThan = 20 // OneOfLessThanStringCommaIntegerGreaterThan | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
try {
    val result : JsonSuccess = apiInstance.updateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#updateStream")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#updateStream")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **kotlin.Int**| The ID of the stream to access.  |
 **description** | **kotlin.String**| The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional]
 **newName** | **kotlin.String**| The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional]
 **isPrivate** | **kotlin.Boolean**| Change whether the stream is a private stream.  | [optional]
 **isAnnouncementOnly** | **kotlin.Boolean**| Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  | [optional]
 **streamPostPolicy** | **kotlin.Int**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **historyPublicToSubscribers** | **kotlin.Boolean**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional]
 **messageRetentionDays** | [**OneOfLessThanStringCommaIntegerGreaterThan**](.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSubscriptionSettings"></a>
# **updateSubscriptionSettings**
> JsonSuccessBase updateSubscriptionSettings(subscriptionData)

Update subscription settings

This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
val subscriptionData : kotlin.collections.List<kotlin.Any> =  // kotlin.collections.List<kotlin.Any> | A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 
try {
    val result : JsonSuccessBase = apiInstance.updateSubscriptionSettings(subscriptionData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#updateSubscriptionSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#updateSubscriptionSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionData** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md)| A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream.  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSubscriptions"></a>
# **updateSubscriptions**
> JsonSuccessBase updateSubscriptions(delete, add)

Update subscriptions

Update which streams you are are subscribed to. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StreamsApi()
val delete : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | A list of stream names to unsubscribe from. 
val add : kotlin.collections.List<kotlin.Any> =  // kotlin.collections.List<kotlin.Any> | A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
try {
    val result : JsonSuccessBase = apiInstance.updateSubscriptions(delete, add)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StreamsApi#updateSubscriptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StreamsApi#updateSubscriptions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A list of stream names to unsubscribe from.  | [optional]
 **add** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md)| A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  | [optional]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

