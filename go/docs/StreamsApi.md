# \StreamsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ArchiveStream**](StreamsApi.md#ArchiveStream) | **Delete** /streams/{stream_id} | Archive a stream
[**CreateBigBlueButtonVideoCall**](StreamsApi.md#CreateBigBlueButtonVideoCall) | **Get** /calls/bigbluebutton/create | Create BigBlueButton video call
[**GetStreamId**](StreamsApi.md#GetStreamId) | **Get** /get_stream_id | Get stream ID
[**GetStreamTopics**](StreamsApi.md#GetStreamTopics) | **Get** /users/me/{stream_id}/topics | Get topics in a stream
[**GetStreams**](StreamsApi.md#GetStreams) | **Get** /streams | Get all streams
[**GetSubscriptionStatus**](StreamsApi.md#GetSubscriptionStatus) | **Get** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**GetSubscriptions**](StreamsApi.md#GetSubscriptions) | **Get** /users/me/subscriptions | Get subscribed streams
[**MuteTopic**](StreamsApi.md#MuteTopic) | **Patch** /users/me/subscriptions/muted_topics | Topic muting
[**Subscribe**](StreamsApi.md#Subscribe) | **Post** /users/me/subscriptions | Subscribe to a stream
[**Unsubscribe**](StreamsApi.md#Unsubscribe) | **Delete** /users/me/subscriptions | Unsubscribe from a stream
[**UpdateStream**](StreamsApi.md#UpdateStream) | **Patch** /streams/{stream_id} | Update a stream
[**UpdateSubscriptionSettings**](StreamsApi.md#UpdateSubscriptionSettings) | **Post** /users/me/subscriptions/properties | Update subscription settings
[**UpdateSubscriptions**](StreamsApi.md#UpdateSubscriptions) | **Patch** /users/me/subscriptions | Update subscriptions



## ArchiveStream

> JsonSuccess ArchiveStream(ctx, streamId).Execute()

Archive a stream



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    streamId := int32(1) // int32 | The ID of the stream to access. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StreamsApi.ArchiveStream(context.Background(), streamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StreamsApi.ArchiveStream``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ArchiveStream`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `StreamsApi.ArchiveStream`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**streamId** | **int32** | The ID of the stream to access.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiArchiveStreamRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateBigBlueButtonVideoCall

> JsonSuccessBase CreateBigBlueButtonVideoCall(ctx).Execute()

Create BigBlueButton video call



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StreamsApi.CreateBigBlueButtonVideoCall(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StreamsApi.CreateBigBlueButtonVideoCall``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateBigBlueButtonVideoCall`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `StreamsApi.CreateBigBlueButtonVideoCall`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiCreateBigBlueButtonVideoCallRequest struct via the builder pattern


### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetStreamId

> JsonSuccessBase GetStreamId(ctx).Stream(stream).Execute()

Get stream ID



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    stream := "Denmark" // string | The name of the stream to access. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StreamsApi.GetStreamId(context.Background()).Stream(stream).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StreamsApi.GetStreamId``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetStreamId`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `StreamsApi.GetStreamId`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetStreamIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **string** | The name of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetStreamTopics

> JsonSuccessBase GetStreamTopics(ctx, streamId).Execute()

Get topics in a stream



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    streamId := int32(1) // int32 | The ID of the stream to access. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StreamsApi.GetStreamTopics(context.Background(), streamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StreamsApi.GetStreamTopics``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetStreamTopics`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `StreamsApi.GetStreamTopics`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**streamId** | **int32** | The ID of the stream to access.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetStreamTopicsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetStreams

> JsonSuccessBase GetStreams(ctx).IncludePublic(includePublic).IncludeWebPublic(includeWebPublic).IncludeSubscribed(includeSubscribed).IncludeAllActive(includeAllActive).IncludeDefault(includeDefault).IncludeOwnerSubscribed(includeOwnerSubscribed).Execute()

Get all streams



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    includePublic := false // bool | Include all public streams.  (optional) (default to true)
    includeWebPublic := true // bool | Include all web public streams.  (optional) (default to false)
    includeSubscribed := false // bool | Include all streams that the user is subscribed to.  (optional) (default to true)
    includeAllActive := true // bool | Include all active streams. The user must have administrative privileges to use this parameter.  (optional) (default to false)
    includeDefault := true // bool | Include all default streams for the user's realm.  (optional) (default to false)
    includeOwnerSubscribed := true // bool | If the user is a bot, include all streams that the bot's owner is subscribed to.  (optional) (default to false)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StreamsApi.GetStreams(context.Background()).IncludePublic(includePublic).IncludeWebPublic(includeWebPublic).IncludeSubscribed(includeSubscribed).IncludeAllActive(includeAllActive).IncludeDefault(includeDefault).IncludeOwnerSubscribed(includeOwnerSubscribed).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StreamsApi.GetStreams``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetStreams`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `StreamsApi.GetStreams`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetStreamsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includePublic** | **bool** | Include all public streams.  | [default to true]
 **includeWebPublic** | **bool** | Include all web public streams.  | [default to false]
 **includeSubscribed** | **bool** | Include all streams that the user is subscribed to.  | [default to true]
 **includeAllActive** | **bool** | Include all active streams. The user must have administrative privileges to use this parameter.  | [default to false]
 **includeDefault** | **bool** | Include all default streams for the user&#39;s realm.  | [default to false]
 **includeOwnerSubscribed** | **bool** | If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  | [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetSubscriptionStatus

> JsonSuccessBase GetSubscriptionStatus(ctx, userId, streamId).Execute()

Get subscription status



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    userId := int32(12) // int32 | The target user's ID. 
    streamId := int32(1) // int32 | The ID of the stream to access. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StreamsApi.GetSubscriptionStatus(context.Background(), userId, streamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StreamsApi.GetSubscriptionStatus``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetSubscriptionStatus`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `StreamsApi.GetSubscriptionStatus`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**userId** | **int32** | The target user&#39;s ID.  | 
**streamId** | **int32** | The ID of the stream to access.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetSubscriptionStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetSubscriptions

> JsonSuccessBase GetSubscriptions(ctx).IncludeSubscribers(includeSubscribers).Execute()

Get subscribed streams



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    includeSubscribers := true // bool | Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  (optional) (default to false)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StreamsApi.GetSubscriptions(context.Background()).IncludeSubscribers(includeSubscribers).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StreamsApi.GetSubscriptions``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetSubscriptions`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `StreamsApi.GetSubscriptions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetSubscriptionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeSubscribers** | **bool** | Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MuteTopic

> JsonSuccess MuteTopic(ctx).Topic(topic).Op(op).Stream(stream).StreamId(streamId).Execute()

Topic muting



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    topic := "dinner" // string | The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
    op := "add" // string | Whether to mute (`add`) or unmute (`remove`) the provided topic. 
    stream := "Denmark" // string | The name of the stream to access.  (optional)
    streamId := int32(42) // int32 | The ID of the stream to access.  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StreamsApi.MuteTopic(context.Background()).Topic(topic).Op(op).Stream(stream).StreamId(streamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StreamsApi.MuteTopic``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MuteTopic`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `StreamsApi.MuteTopic`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMuteTopicRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topic** | **string** | The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  | 
 **op** | **string** | Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic.  | 
 **stream** | **string** | The name of the stream to access.  | 
 **streamId** | **int32** | The ID of the stream to access.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Subscribe

> OneOfobjectobject Subscribe(ctx).Subscriptions(subscriptions).Principals(principals).AuthorizationErrorsFatal(authorizationErrorsFatal).Announce(announce).InviteOnly(inviteOnly).HistoryPublicToSubscribers(historyPublicToSubscribers).StreamPostPolicy(streamPostPolicy).MessageRetentionDays(messageRetentionDays).Execute()

Subscribe to a stream



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    subscriptions := []map[string]interface{}{map[string]interface{}(123)} // []map[string]interface{} | A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
    principals := []OneOfstringinteger{"TODO"} // []OneOfstringinteger | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)
    authorizationErrorsFatal := false // bool | A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key.  (optional) (default to true)
    announce := true // bool | If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation.  (optional) (default to false)
    inviteOnly := true // bool | As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  (optional) (default to false)
    historyPublicToSubscribers := false // bool | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
    streamPostPolicy := int32(2) // int32 | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional) (default to 1)
    messageRetentionDays := TODO // OneOfstringinteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StreamsApi.Subscribe(context.Background()).Subscriptions(subscriptions).Principals(principals).AuthorizationErrorsFatal(authorizationErrorsFatal).Announce(announce).InviteOnly(inviteOnly).HistoryPublicToSubscribers(historyPublicToSubscribers).StreamPostPolicy(streamPostPolicy).MessageRetentionDays(messageRetentionDays).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StreamsApi.Subscribe``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Subscribe`: OneOfobjectobject
    fmt.Fprintf(os.Stdout, "Response from `StreamsApi.Subscribe`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSubscribeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | **[]map[string]interface{}** | A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value.  | 
 **principals** | [**[]OneOfstringinteger**](oneOf&lt;string,integer&gt;.md) | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | 
 **authorizationErrorsFatal** | **bool** | A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  | [default to true]
 **announce** | **bool** | If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  | [default to false]
 **inviteOnly** | **bool** | As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  | [default to false]
 **historyPublicToSubscribers** | **bool** | Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | 
 **streamPostPolicy** | **int32** | Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [default to 1]
 **messageRetentionDays** | [**OneOfstringinteger**](OneOfstringinteger.md) | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | 

### Return type

[**OneOfobjectobject**](oneOf&lt;object,object&gt;.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Unsubscribe

> JsonSuccessBase Unsubscribe(ctx).Subscriptions(subscriptions).Principals(principals).Execute()

Unsubscribe from a stream



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    subscriptions := []string{"Inner_example"} // []string | A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
    principals := []OneOfstringinteger{"TODO"} // []OneOfstringinteger | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StreamsApi.Unsubscribe(context.Background()).Subscriptions(subscriptions).Principals(principals).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StreamsApi.Unsubscribe``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Unsubscribe`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `StreamsApi.Unsubscribe`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUnsubscribeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | **[]string** | A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API.  | 
 **principals** | [**[]OneOfstringinteger**](oneOf&lt;string,integer&gt;.md) | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateStream

> JsonSuccess UpdateStream(ctx, streamId).Description(description).NewName(newName).IsPrivate(isPrivate).IsAnnouncementOnly(isAnnouncementOnly).StreamPostPolicy(streamPostPolicy).HistoryPublicToSubscribers(historyPublicToSubscribers).MessageRetentionDays(messageRetentionDays).Execute()

Update a stream



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    streamId := int32(1) // int32 | The ID of the stream to access. 
    description := "Discuss Italian history and travel destinations." // string | The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
    newName := "Italy" // string | The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
    isPrivate := true // bool | Change whether the stream is a private stream.  (optional)
    isAnnouncementOnly := true // bool | Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead.  (optional)
    streamPostPolicy := int32(2) // int32 | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional) (default to 1)
    historyPublicToSubscribers := false // bool | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
    messageRetentionDays := TODO // OneOfstringinteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StreamsApi.UpdateStream(context.Background(), streamId).Description(description).NewName(newName).IsPrivate(isPrivate).IsAnnouncementOnly(isAnnouncementOnly).StreamPostPolicy(streamPostPolicy).HistoryPublicToSubscribers(historyPublicToSubscribers).MessageRetentionDays(messageRetentionDays).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StreamsApi.UpdateStream``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateStream`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `StreamsApi.UpdateStream`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**streamId** | **int32** | The ID of the stream to access.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateStreamRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **description** | **string** | The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | 
 **newName** | **string** | The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | 
 **isPrivate** | **bool** | Change whether the stream is a private stream.  | 
 **isAnnouncementOnly** | **bool** | Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  | 
 **streamPostPolicy** | **int32** | Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [default to 1]
 **historyPublicToSubscribers** | **bool** | Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | 
 **messageRetentionDays** | [**OneOfstringinteger**](OneOfstringinteger.md) | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateSubscriptionSettings

> JsonSuccessBase UpdateSubscriptionSettings(ctx).SubscriptionData(subscriptionData).Execute()

Update subscription settings



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    subscriptionData := []map[string]interface{}{map[string]interface{}(123)} // []map[string]interface{} | A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StreamsApi.UpdateSubscriptionSettings(context.Background()).SubscriptionData(subscriptionData).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StreamsApi.UpdateSubscriptionSettings``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateSubscriptionSettings`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `StreamsApi.UpdateSubscriptionSettings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUpdateSubscriptionSettingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionData** | **[]map[string]interface{}** | A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateSubscriptions

> JsonSuccessBase UpdateSubscriptions(ctx).Delete(delete).Add(add).Execute()

Update subscriptions



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    delete := []string{"Inner_example"} // []string | A list of stream names to unsubscribe from.  (optional)
    add := []map[string]interface{}{map[string]interface{}(123)} // []map[string]interface{} | A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.StreamsApi.UpdateSubscriptions(context.Background()).Delete(delete).Add(add).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StreamsApi.UpdateSubscriptions``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateSubscriptions`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `StreamsApi.UpdateSubscriptions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUpdateSubscriptionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete** | **[]string** | A list of stream names to unsubscribe from.  | 
 **add** | **[]map[string]interface{}** | A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

