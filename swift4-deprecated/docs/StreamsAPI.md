# StreamsAPI

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveStream**](StreamsAPI.md#archivestream) | **DELETE** /streams/{stream_id} | Archive a stream
[**createBigBlueButtonVideoCall**](StreamsAPI.md#createbigbluebuttonvideocall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
[**deleteTopic**](StreamsAPI.md#deletetopic) | **POST** /streams/{stream_id}/delete_topic | Delete a topic
[**getStreamId**](StreamsAPI.md#getstreamid) | **GET** /get_stream_id | Get stream ID
[**getStreamTopics**](StreamsAPI.md#getstreamtopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
[**getStreams**](StreamsAPI.md#getstreams) | **GET** /streams | Get all streams
[**getSubscribers**](StreamsAPI.md#getsubscribers) | **GET** /streams/{stream_id}/members | Get the subscribers of a stream
[**getSubscriptionStatus**](StreamsAPI.md#getsubscriptionstatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**getSubscriptions**](StreamsAPI.md#getsubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
[**muteTopic**](StreamsAPI.md#mutetopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
[**subscribe**](StreamsAPI.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
[**unsubscribe**](StreamsAPI.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
[**updateStream**](StreamsAPI.md#updatestream) | **PATCH** /streams/{stream_id} | Update a stream
[**updateSubscriptionSettings**](StreamsAPI.md#updatesubscriptionsettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
[**updateSubscriptions**](StreamsAPI.md#updatesubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions


# **archiveStream**
```swift
    open class func archiveStream(streamId: Int, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let streamId = 987 // Int | The ID of the stream to access. 

// Archive a stream
StreamsAPI.archiveStream(streamId: streamId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **Int** | The ID of the stream to access.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createBigBlueButtonVideoCall**
```swift
    open class func createBigBlueButtonVideoCall(completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Create BigBlueButton video call
StreamsAPI.createBigBlueButtonVideoCall() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
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
```swift
    open class func deleteTopic(streamId: Int, topicName: String, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Delete a topic

Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let streamId = 987 // Int | The ID of the stream to access. 
let topicName = "topicName_example" // String | The name of the topic to delete. 

// Delete a topic
StreamsAPI.deleteTopic(streamId: streamId, topicName: topicName) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **Int** | The ID of the stream to access.  | 
 **topicName** | **String** | The name of the topic to delete.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getStreamId**
```swift
    open class func getStreamId(stream: String, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get stream ID

Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let stream = "stream_example" // String | The name of the stream to access. 

// Get stream ID
StreamsAPI.getStreamId(stream: stream) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **String** | The name of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getStreamTopics**
```swift
    open class func getStreamTopics(streamId: Int, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get topics in a stream

Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let streamId = 987 // Int | The ID of the stream to access. 

// Get topics in a stream
StreamsAPI.getStreamTopics(streamId: streamId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **Int** | The ID of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getStreams**
```swift
    open class func getStreams(includePublic: Bool? = nil, includeWebPublic: Bool? = nil, includeSubscribed: Bool? = nil, includeAllActive: Bool? = nil, includeDefault: Bool? = nil, includeOwnerSubscribed: Bool? = nil, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get all streams

Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let includePublic = false // Bool | Include all public streams.  (optional) (default to true)
let includeWebPublic = true // Bool | Include all web public streams.  (optional) (default to false)
let includeSubscribed = false // Bool | Include all streams that the user is subscribed to.  (optional) (default to true)
let includeAllActive = true // Bool | Include all active streams. The user must have administrative privileges to use this parameter.  (optional) (default to false)
let includeDefault = true // Bool | Include all default streams for the user's realm.  (optional) (default to false)
let includeOwnerSubscribed = true // Bool | If the user is a bot, include all streams that the bot's owner is subscribed to.  (optional) (default to false)

// Get all streams
StreamsAPI.getStreams(includePublic: includePublic, includeWebPublic: includeWebPublic, includeSubscribed: includeSubscribed, includeAllActive: includeAllActive, includeDefault: includeDefault, includeOwnerSubscribed: includeOwnerSubscribed) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includePublic** | **Bool** | Include all public streams.  | [optional] [default to true]
 **includeWebPublic** | **Bool** | Include all web public streams.  | [optional] [default to false]
 **includeSubscribed** | **Bool** | Include all streams that the user is subscribed to.  | [optional] [default to true]
 **includeAllActive** | **Bool** | Include all active streams. The user must have administrative privileges to use this parameter.  | [optional] [default to false]
 **includeDefault** | **Bool** | Include all default streams for the user&#39;s realm.  | [optional] [default to false]
 **includeOwnerSubscribed** | **Bool** | If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSubscribers**
```swift
    open class func getSubscribers(streamId: Int, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get the subscribers of a stream

Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let streamId = 987 // Int | The ID of the stream to access. 

// Get the subscribers of a stream
StreamsAPI.getSubscribers(streamId: streamId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **Int** | The ID of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSubscriptionStatus**
```swift
    open class func getSubscriptionStatus(userId: Int, streamId: Int, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get subscription status

Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let userId = 987 // Int | The target user's ID. 
let streamId = 987 // Int | The ID of the stream to access. 

// Get subscription status
StreamsAPI.getSubscriptionStatus(userId: userId, streamId: streamId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Int** | The target user&#39;s ID.  | 
 **streamId** | **Int** | The ID of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSubscriptions**
```swift
    open class func getSubscriptions(includeSubscribers: Bool? = nil, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get subscribed streams

Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let includeSubscribers = true // Bool | Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  (optional) (default to false)

// Get subscribed streams
StreamsAPI.getSubscriptions(includeSubscribers: includeSubscribers) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeSubscribers** | **Bool** | Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **muteTopic**
```swift
    open class func muteTopic(topic: String, op: Op_muteTopic, stream: String? = nil, streamId: Int? = nil, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Topic muting

This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let topic = "topic_example" // String | The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
let op = "op_example" // String | Whether to mute (`add`) or unmute (`remove`) the provided topic. 
let stream = "stream_example" // String | The name of the stream to access.  (optional)
let streamId = 987 // Int | The ID of the stream to access.  (optional)

// Topic muting
StreamsAPI.muteTopic(topic: topic, op: op, stream: stream, streamId: streamId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topic** | **String** | The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  | 
 **op** | **String** | Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic.  | 
 **stream** | **String** | The name of the stream to access.  | [optional] 
 **streamId** | **Int** | The ID of the stream to access.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **subscribe**
```swift
    open class func subscribe(subscriptions: [Any], principals: [OneOfstringinteger]? = nil, authorizationErrorsFatal: Bool? = nil, announce: Bool? = nil, inviteOnly: Bool? = nil, historyPublicToSubscribers: Bool? = nil, streamPostPolicy: Int? = nil, messageRetentionDays: OneOfstringinteger? = nil, completion: @escaping (_ data: OneOfobjectobject?, _ error: Error?) -> Void)
```

Subscribe to a stream

Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let subscriptions = [123] // [Any] | A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
let principals = ["TODO"] // [OneOfstringinteger] | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)
let authorizationErrorsFatal = false // Bool | A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key.  (optional) (default to true)
let announce = true // Bool | If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation.  (optional) (default to false)
let inviteOnly = true // Bool | As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  (optional) (default to false)
let historyPublicToSubscribers = false // Bool | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
let streamPostPolicy = 987 // Int | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional) (default to 1)
let messageRetentionDays = TODO // OneOfstringinteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)

// Subscribe to a stream
StreamsAPI.subscribe(subscriptions: subscriptions, principals: principals, authorizationErrorsFatal: authorizationErrorsFatal, announce: announce, inviteOnly: inviteOnly, historyPublicToSubscribers: historyPublicToSubscribers, streamPostPolicy: streamPostPolicy, messageRetentionDays: messageRetentionDays) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**[Any]**](Any.md) | A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value.  | 
 **principals** | [**[OneOfstringinteger]**](OneOfstringinteger.md) | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] 
 **authorizationErrorsFatal** | **Bool** | A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  | [optional] [default to true]
 **announce** | **Bool** | If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  | [optional] [default to false]
 **inviteOnly** | **Bool** | As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  | [optional] [default to false]
 **historyPublicToSubscribers** | **Bool** | Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] 
 **streamPostPolicy** | **Int** | Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **messageRetentionDays** | [**OneOfstringinteger**](.md) | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 

### Return type

[**OneOfobjectobject**](OneOfobjectobject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unsubscribe**
```swift
    open class func unsubscribe(subscriptions: [String], principals: [OneOfstringinteger]? = nil, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let subscriptions = ["inner_example"] // [String] | A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
let principals = ["TODO"] // [OneOfstringinteger] | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)

// Unsubscribe from a stream
StreamsAPI.unsubscribe(subscriptions: subscriptions, principals: principals) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**[String]**](String.md) | A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API.  | 
 **principals** | [**[OneOfstringinteger]**](OneOfstringinteger.md) | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateStream**
```swift
    open class func updateStream(streamId: Int, description: String? = nil, newName: String? = nil, isPrivate: Bool? = nil, isAnnouncementOnly: Bool? = nil, streamPostPolicy: Int? = nil, historyPublicToSubscribers: Bool? = nil, messageRetentionDays: OneOfstringinteger? = nil, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Update a stream

Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let streamId = 987 // Int | The ID of the stream to access. 
let description = "description_example" // String | The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
let newName = "newName_example" // String | The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
let isPrivate = true // Bool | Change whether the stream is a private stream.  (optional)
let isAnnouncementOnly = true // Bool | Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead.  (optional)
let streamPostPolicy = 987 // Int | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional) (default to 1)
let historyPublicToSubscribers = false // Bool | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
let messageRetentionDays = TODO // OneOfstringinteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)

// Update a stream
StreamsAPI.updateStream(streamId: streamId, description: description, newName: newName, isPrivate: isPrivate, isAnnouncementOnly: isAnnouncementOnly, streamPostPolicy: streamPostPolicy, historyPublicToSubscribers: historyPublicToSubscribers, messageRetentionDays: messageRetentionDays) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **Int** | The ID of the stream to access.  | 
 **description** | **String** | The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **newName** | **String** | The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **isPrivate** | **Bool** | Change whether the stream is a private stream.  | [optional] 
 **isAnnouncementOnly** | **Bool** | Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  | [optional] 
 **streamPostPolicy** | **Int** | Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **historyPublicToSubscribers** | **Bool** | Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] 
 **messageRetentionDays** | [**OneOfstringinteger**](.md) | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateSubscriptionSettings**
```swift
    open class func updateSubscriptionSettings(subscriptionData: [Any], completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Update subscription settings

This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let subscriptionData = [123] // [Any] | A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 

// Update subscription settings
StreamsAPI.updateSubscriptionSettings(subscriptionData: subscriptionData) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionData** | [**[Any]**](Any.md) | A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateSubscriptions**
```swift
    open class func updateSubscriptions(delete: [String]? = nil, add: [Any]? = nil, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Update subscriptions

Update which streams you are are subscribed to. 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let delete = ["inner_example"] // [String] | A list of stream names to unsubscribe from.  (optional)
let add = [123] // [Any] | A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  (optional)

// Update subscriptions
StreamsAPI.updateSubscriptions(delete: delete, add: add) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete** | [**[String]**](String.md) | A list of stream names to unsubscribe from.  | [optional] 
 **add** | [**[Any]**](Any.md) | A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

