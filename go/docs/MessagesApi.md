# \MessagesApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddReaction**](MessagesApi.md#AddReaction) | **Post** /messages/{message_id}/reactions | Add an emoji reaction
[**CheckMessagesMatchNarrow**](MessagesApi.md#CheckMessagesMatchNarrow) | **Get** /messages/matches_narrow | Check if messages match a narrow
[**DeleteMessage**](MessagesApi.md#DeleteMessage) | **Delete** /messages/{message_id} | Delete a message
[**GetFileTemporaryUrl**](MessagesApi.md#GetFileTemporaryUrl) | **Get** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
[**GetMessageHistory**](MessagesApi.md#GetMessageHistory) | **Get** /messages/{message_id}/history | Get a message&#39;s edit history
[**GetMessages**](MessagesApi.md#GetMessages) | **Get** /messages | Get messages
[**GetRawMessage**](MessagesApi.md#GetRawMessage) | **Get** /messages/{message_id} | Get a message&#39;s raw Markdown
[**MarkAllAsRead**](MessagesApi.md#MarkAllAsRead) | **Post** /mark_all_as_read | Mark all messages as read
[**MarkStreamAsRead**](MessagesApi.md#MarkStreamAsRead) | **Post** /mark_stream_as_read | Mark messages in a stream as read
[**MarkTopicAsRead**](MessagesApi.md#MarkTopicAsRead) | **Post** /mark_topic_as_read | Mark messages in a topic as read
[**RemoveReaction**](MessagesApi.md#RemoveReaction) | **Delete** /messages/{message_id}/reactions | Remove an emoji reaction
[**RenderMessage**](MessagesApi.md#RenderMessage) | **Post** /messages/render | Render message
[**SendMessage**](MessagesApi.md#SendMessage) | **Post** /messages | Send a message
[**UpdateMessage**](MessagesApi.md#UpdateMessage) | **Patch** /messages/{message_id} | Edit a message
[**UpdateMessageFlags**](MessagesApi.md#UpdateMessageFlags) | **Post** /messages/flags | Update personal message flags
[**UploadFile**](MessagesApi.md#UploadFile) | **Post** /user_uploads | Upload a file



## AddReaction

> JsonSuccess AddReaction(ctx, messageId).EmojiName(emojiName).EmojiCode(emojiCode).ReactionType(reactionType).Execute()

Add an emoji reaction



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
    messageId := int32(42) // int32 | The target message's ID. 
    emojiName := "octopus" // string | The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
    emojiCode := "1f419" // string | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji.  (optional)
    reactionType := "unicode_emoji" // string | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified.  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.AddReaction(context.Background(), messageId).EmojiName(emojiName).EmojiCode(emojiCode).ReactionType(reactionType).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.AddReaction``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AddReaction`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.AddReaction`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**messageId** | **int32** | The target message&#39;s ID.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiAddReactionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **emojiName** | **string** | The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | 
 **emojiCode** | **string** | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | 
 **reactionType** | **string** | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | 

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


## CheckMessagesMatchNarrow

> interface{} CheckMessagesMatchNarrow(ctx).MsgIds(msgIds).Narrow(narrow).Execute()

Check if messages match a narrow



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
    msgIds := []int32{int32(123)} // []int32 | List of IDs for the messages to check.
    narrow := []map[string]interface{}{map[string]interface{}(123)} // []map[string]interface{} | A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.CheckMessagesMatchNarrow(context.Background()).MsgIds(msgIds).Narrow(narrow).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.CheckMessagesMatchNarrow``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CheckMessagesMatchNarrow`: interface{}
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.CheckMessagesMatchNarrow`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCheckMessagesMatchNarrowRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgIds** | **[]int32** | List of IDs for the messages to check. | 
 **narrow** | **[]map[string]interface{}** | A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow). | 

### Return type

**interface{}**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteMessage

> JsonSuccess DeleteMessage(ctx, messageId).Execute()

Delete a message



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
    messageId := int32(42) // int32 | The target message's ID. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.DeleteMessage(context.Background(), messageId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.DeleteMessage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DeleteMessage`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.DeleteMessage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**messageId** | **int32** | The target message&#39;s ID.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteMessageRequest struct via the builder pattern


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


## GetFileTemporaryUrl

> JsonSuccessBase GetFileTemporaryUrl(ctx, realmIdStr, filename).Execute()

Get public temporary URL



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
    realmIdStr := int32(1) // int32 | The realm id. 
    filename := "4e/m2A3MSqFnWRLUf9SaPzQ0Up_/zulip.txt" // string | Path to the URL. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.GetFileTemporaryUrl(context.Background(), realmIdStr, filename).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.GetFileTemporaryUrl``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetFileTemporaryUrl`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.GetFileTemporaryUrl`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**realmIdStr** | **int32** | The realm id.  | 
**filename** | **string** | Path to the URL.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetFileTemporaryUrlRequest struct via the builder pattern


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


## GetMessageHistory

> JsonSuccessBase GetMessageHistory(ctx, messageId).Execute()

Get a message's edit history



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
    messageId := int32(42) // int32 | The target message's ID. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.GetMessageHistory(context.Background(), messageId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.GetMessageHistory``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetMessageHistory`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.GetMessageHistory`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**messageId** | **int32** | The target message&#39;s ID.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetMessageHistoryRequest struct via the builder pattern


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


## GetMessages

> JsonSuccessBase GetMessages(ctx).NumBefore(numBefore).NumAfter(numAfter).Anchor(anchor).Narrow(narrow).ClientGravatar(clientGravatar).ApplyMarkdown(applyMarkdown).UseFirstUnreadAnchor(useFirstUnreadAnchor).Execute()

Get messages



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
    numBefore := int32(4) // int32 | The number of messages with IDs less than the anchor to retrieve. 
    numAfter := int32(8) // int32 | The number of messages with IDs greater than the anchor to retrieve. 
    anchor := TODO // OneOfstringinteger | Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value).  (optional)
    narrow := []map[string]interface{}{map[string]interface{}(123)} // []map[string]interface{} | The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  (optional) (default to [])
    clientGravatar := true // bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to false)
    applyMarkdown := false // bool | If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered.  (optional) (default to true)
    useFirstUnreadAnchor := true // bool | Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead.  (optional) (default to false)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.GetMessages(context.Background()).NumBefore(numBefore).NumAfter(numAfter).Anchor(anchor).Narrow(narrow).ClientGravatar(clientGravatar).ApplyMarkdown(applyMarkdown).UseFirstUnreadAnchor(useFirstUnreadAnchor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.GetMessages``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetMessages`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.GetMessages`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetMessagesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numBefore** | **int32** | The number of messages with IDs less than the anchor to retrieve.  | 
 **numAfter** | **int32** | The number of messages with IDs greater than the anchor to retrieve.  | 
 **anchor** | [**OneOfstringinteger**](OneOfstringinteger.md) | Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value).  | 
 **narrow** | **[]map[string]interface{}** | The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  | [default to []]
 **clientGravatar** | **bool** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [default to false]
 **applyMarkdown** | **bool** | If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered.  | [default to true]
 **useFirstUnreadAnchor** | **bool** | Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead.  | [default to false]

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


## GetRawMessage

> JsonSuccessBase GetRawMessage(ctx, messageId).Execute()

Get a message's raw Markdown



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
    messageId := int32(42) // int32 | The target message's ID. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.GetRawMessage(context.Background(), messageId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.GetRawMessage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetRawMessage`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.GetRawMessage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**messageId** | **int32** | The target message&#39;s ID.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetRawMessageRequest struct via the builder pattern


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


## MarkAllAsRead

> JsonSuccess MarkAllAsRead(ctx).Execute()

Mark all messages as read



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
    resp, r, err := api_client.MessagesApi.MarkAllAsRead(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.MarkAllAsRead``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarkAllAsRead`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.MarkAllAsRead`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiMarkAllAsReadRequest struct via the builder pattern


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


## MarkStreamAsRead

> JsonSuccess MarkStreamAsRead(ctx).StreamId(streamId).Execute()

Mark messages in a stream as read



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
    streamId := int32(42) // int32 | The ID of the stream to access. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.MarkStreamAsRead(context.Background()).StreamId(streamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.MarkStreamAsRead``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarkStreamAsRead`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.MarkStreamAsRead`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarkStreamAsReadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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


## MarkTopicAsRead

> JsonSuccess MarkTopicAsRead(ctx).StreamId(streamId).TopicName(topicName).Execute()

Mark messages in a topic as read



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
    streamId := int32(42) // int32 | The ID of the stream to access. 
    topicName := "new coffee machine" // string | The name of the topic whose messages should be marked as read. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.MarkTopicAsRead(context.Background()).StreamId(streamId).TopicName(topicName).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.MarkTopicAsRead``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MarkTopicAsRead`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.MarkTopicAsRead`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMarkTopicAsReadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **int32** | The ID of the stream to access.  | 
 **topicName** | **string** | The name of the topic whose messages should be marked as read.  | 

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


## RemoveReaction

> JsonSuccess RemoveReaction(ctx, messageId).EmojiName(emojiName).EmojiCode(emojiCode).ReactionType(reactionType).Execute()

Remove an emoji reaction



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
    messageId := int32(42) // int32 | The target message's ID. 
    emojiName := "octopus" // string | The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name.  (optional)
    emojiCode := "1f419" // string | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji.  (optional)
    reactionType := "unicode_emoji" // string | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified.  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.RemoveReaction(context.Background(), messageId).EmojiName(emojiName).EmojiCode(emojiCode).ReactionType(reactionType).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.RemoveReaction``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RemoveReaction`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.RemoveReaction`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**messageId** | **int32** | The target message&#39;s ID.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiRemoveReactionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **emojiName** | **string** | The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | 
 **emojiCode** | **string** | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | 
 **reactionType** | **string** | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | 

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


## RenderMessage

> JsonSuccessBase RenderMessage(ctx).Content(content).Execute()

Render message



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
    content := "Hello" // string | The content of the message. Maximum message size of 10000 bytes. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.RenderMessage(context.Background()).Content(content).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.RenderMessage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RenderMessage`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.RenderMessage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRenderMessageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **string** | The content of the message. Maximum message size of 10000 bytes.  | 

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


## SendMessage

> JsonSuccessBase SendMessage(ctx).Type_(type_).To(to).Content(content).Topic(topic).QueueId(queueId).LocalId(localId).Execute()

Send a message



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
    type_ := "private" // string | The type of message to be sent. `private` for a private message and `stream` for a stream message. 
    to := []int32{int32(123)} // []int32 | For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
    content := "Hello" // string | The content of the message. Maximum message size of 10000 bytes. 
    topic := "Castle" // string | The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias.  (optional)
    queueId := "1593114627:0" // string | For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  (optional)
    localId := "100.01" // string | For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description.  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.SendMessage(context.Background()).Type_(type_).To(to).Content(content).Topic(topic).QueueId(queueId).LocalId(localId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.SendMessage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SendMessage`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.SendMessage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSendMessageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type_** | **string** | The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message.  | 
 **to** | **[]int32** | For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0.  | 
 **content** | **string** | The content of the message. Maximum message size of 10000 bytes.  | 
 **topic** | **string** | The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | 
 **queueId** | **string** | For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  | 
 **localId** | **string** | For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description.  | 

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


## UpdateMessage

> JsonSuccess UpdateMessage(ctx, messageId).Topic(topic).PropagateMode(propagateMode).SendNotificationToOldThread(sendNotificationToOldThread).SendNotificationToNewThread(sendNotificationToNewThread).Content(content).StreamId(streamId).Execute()

Edit a message



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
    messageId := int32(42) // int32 | The target message's ID. 
    topic := "Castle" // string | The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias.  (optional)
    propagateMode := "change_all" // string | Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  (optional) (default to "change_one")
    sendNotificationToOldThread := true // bool | Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  (optional) (default to true)
    sendNotificationToNewThread := true // bool | Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  (optional) (default to true)
    content := "Hello" // string | The content of the message. Maximum message size of 10000 bytes.  (optional)
    streamId := int32(42) // int32 | The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.UpdateMessage(context.Background(), messageId).Topic(topic).PropagateMode(propagateMode).SendNotificationToOldThread(sendNotificationToOldThread).SendNotificationToNewThread(sendNotificationToNewThread).Content(content).StreamId(streamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.UpdateMessage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateMessage`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.UpdateMessage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**messageId** | **int32** | The target message&#39;s ID.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateMessageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **topic** | **string** | The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | 
 **propagateMode** | **string** | Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  | [default to &quot;change_one&quot;]
 **sendNotificationToOldThread** | **bool** | Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  | [default to true]
 **sendNotificationToNewThread** | **bool** | Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  | [default to true]
 **content** | **string** | The content of the message. Maximum message size of 10000 bytes.  | 
 **streamId** | **int32** | The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  | 

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


## UpdateMessageFlags

> JsonSuccessBase UpdateMessageFlags(ctx).Messages(messages).Op(op).Flag(flag).Execute()

Update personal message flags



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
    messages := []int32{int32(123)} // []int32 | An array containing the IDs of the target messages. 
    op := "add" // string | Whether to `add` the flag or `remove` it. 
    flag := "read" // string | The flag that should be added/removed. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.UpdateMessageFlags(context.Background()).Messages(messages).Op(op).Flag(flag).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.UpdateMessageFlags``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateMessageFlags`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.UpdateMessageFlags`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUpdateMessageFlagsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messages** | **[]int32** | An array containing the IDs of the target messages.  | 
 **op** | **string** | Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it.  | 
 **flag** | **string** | The flag that should be added/removed.  | 

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


## UploadFile

> JsonSuccessBase UploadFile(ctx).Filename(filename).Execute()

Upload a file



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
    filename := os.NewFile(1234, "some_file") // *os.File |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.MessagesApi.UploadFile(context.Background()).Filename(filename).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessagesApi.UploadFile``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UploadFile`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `MessagesApi.UploadFile`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUploadFileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | ***os.File** |  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

