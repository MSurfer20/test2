# \ServerAndOrganizationsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddCodePlayground**](ServerAndOrganizationsApi.md#AddCodePlayground) | **Post** /realm/playgrounds | Add a code playground
[**AddLinkifier**](ServerAndOrganizationsApi.md#AddLinkifier) | **Post** /realm/filters | Add a linkifier
[**CreateCustomProfileField**](ServerAndOrganizationsApi.md#CreateCustomProfileField) | **Post** /realm/profile_fields | Create a custom profile field
[**GetCustomEmoji**](ServerAndOrganizationsApi.md#GetCustomEmoji) | **Get** /realm/emoji | Get all custom emoji
[**GetCustomProfileFields**](ServerAndOrganizationsApi.md#GetCustomProfileFields) | **Get** /realm/profile_fields | Get all custom profile fields
[**GetLinkifiers**](ServerAndOrganizationsApi.md#GetLinkifiers) | **Get** /realm/linkifiers | Get linkifiers
[**GetServerSettings**](ServerAndOrganizationsApi.md#GetServerSettings) | **Get** /server_settings | Get server settings
[**RemoveCodePlayground**](ServerAndOrganizationsApi.md#RemoveCodePlayground) | **Delete** /realm/playgrounds/{playground_id} | Remove a code playground
[**RemoveLinkifier**](ServerAndOrganizationsApi.md#RemoveLinkifier) | **Delete** /realm/filters/{filter_id} | Remove a linkifier
[**ReorderCustomProfileFields**](ServerAndOrganizationsApi.md#ReorderCustomProfileFields) | **Patch** /realm/profile_fields | Reorder custom profile fields
[**UpdateLinkifier**](ServerAndOrganizationsApi.md#UpdateLinkifier) | **Patch** /realm/filters/{filter_id} | Update a linkifier
[**UploadCustomEmoji**](ServerAndOrganizationsApi.md#UploadCustomEmoji) | **Post** /realm/emoji/{emoji_name} | Upload custom emoji



## AddCodePlayground

> JsonSuccessBase AddCodePlayground(ctx).Name(name).PygmentsLanguage(pygmentsLanguage).UrlPrefix(urlPrefix).Execute()

Add a code playground



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
    name := "Python playground" // string | The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
    pygmentsLanguage := "Python" // string | The name of the Pygments language lexer for that programming language. 
    urlPrefix := "https://python.example.com" // string | The url prefix for the playground. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ServerAndOrganizationsApi.AddCodePlayground(context.Background()).Name(name).PygmentsLanguage(pygmentsLanguage).UrlPrefix(urlPrefix).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ServerAndOrganizationsApi.AddCodePlayground``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AddCodePlayground`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `ServerAndOrganizationsApi.AddCodePlayground`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAddCodePlaygroundRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** | The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  | 
 **pygmentsLanguage** | **string** | The name of the Pygments language lexer for that programming language.  | 
 **urlPrefix** | **string** | The url prefix for the playground.  | 

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


## AddLinkifier

> JsonSuccessBase AddLinkifier(ctx).Pattern(pattern).UrlFormatString(urlFormatString).Execute()

Add a linkifier



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
    pattern := "#(?P<id>[0-9]+)" // string | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
    urlFormatString := "https://github.com/zulip/zulip/issues/%(id)s" // string | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ServerAndOrganizationsApi.AddLinkifier(context.Background()).Pattern(pattern).UrlFormatString(urlFormatString).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ServerAndOrganizationsApi.AddLinkifier``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AddLinkifier`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `ServerAndOrganizationsApi.AddLinkifier`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAddLinkifierRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pattern** | **string** | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
 **urlFormatString** | **string** | The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

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


## CreateCustomProfileField

> JsonSuccessBase CreateCustomProfileField(ctx).FieldType(fieldType).Name(name).Hint(hint).FieldData(fieldData).Execute()

Create a custom profile field



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
    fieldType := int32(3) // int32 | The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
    name := "Favorite programming language" // string | The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile.  (optional)
    hint := "Your favorite programming language." // string | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  (optional)
    fieldData := TODO // map[string]interface{} | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ServerAndOrganizationsApi.CreateCustomProfileField(context.Background()).FieldType(fieldType).Name(name).Hint(hint).FieldData(fieldData).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ServerAndOrganizationsApi.CreateCustomProfileField``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateCustomProfileField`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `ServerAndOrganizationsApi.CreateCustomProfileField`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateCustomProfileFieldRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldType** | **int32** | The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  | 
 **name** | **string** | The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile.  | 
 **hint** | **string** | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  | 
 **fieldData** | [**map[string]interface{}**](map[string]interface{}.md) | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  | 

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


## GetCustomEmoji

> JsonSuccessBase GetCustomEmoji(ctx).Execute()

Get all custom emoji



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
    resp, r, err := api_client.ServerAndOrganizationsApi.GetCustomEmoji(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ServerAndOrganizationsApi.GetCustomEmoji``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetCustomEmoji`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `ServerAndOrganizationsApi.GetCustomEmoji`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetCustomEmojiRequest struct via the builder pattern


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


## GetCustomProfileFields

> JsonSuccessBase GetCustomProfileFields(ctx).Execute()

Get all custom profile fields



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
    resp, r, err := api_client.ServerAndOrganizationsApi.GetCustomProfileFields(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ServerAndOrganizationsApi.GetCustomProfileFields``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetCustomProfileFields`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `ServerAndOrganizationsApi.GetCustomProfileFields`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetCustomProfileFieldsRequest struct via the builder pattern


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


## GetLinkifiers

> JsonSuccessBase GetLinkifiers(ctx).Execute()

Get linkifiers



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
    resp, r, err := api_client.ServerAndOrganizationsApi.GetLinkifiers(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ServerAndOrganizationsApi.GetLinkifiers``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetLinkifiers`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `ServerAndOrganizationsApi.GetLinkifiers`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetLinkifiersRequest struct via the builder pattern


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


## GetServerSettings

> JsonSuccessBase GetServerSettings(ctx).Execute()

Get server settings



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
    resp, r, err := api_client.ServerAndOrganizationsApi.GetServerSettings(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ServerAndOrganizationsApi.GetServerSettings``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetServerSettings`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `ServerAndOrganizationsApi.GetServerSettings`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetServerSettingsRequest struct via the builder pattern


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


## RemoveCodePlayground

> JsonSuccess RemoveCodePlayground(ctx, playgroundId).Execute()

Remove a code playground



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
    playgroundId := int32(1) // int32 | The ID of the playground that you want to remove. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ServerAndOrganizationsApi.RemoveCodePlayground(context.Background(), playgroundId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ServerAndOrganizationsApi.RemoveCodePlayground``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RemoveCodePlayground`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `ServerAndOrganizationsApi.RemoveCodePlayground`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**playgroundId** | **int32** | The ID of the playground that you want to remove.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiRemoveCodePlaygroundRequest struct via the builder pattern


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


## RemoveLinkifier

> JsonSuccess RemoveLinkifier(ctx, filterId).Execute()

Remove a linkifier



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
    filterId := int32(42) // int32 | The ID of the linkifier that you want to remove. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ServerAndOrganizationsApi.RemoveLinkifier(context.Background(), filterId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ServerAndOrganizationsApi.RemoveLinkifier``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RemoveLinkifier`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `ServerAndOrganizationsApi.RemoveLinkifier`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**filterId** | **int32** | The ID of the linkifier that you want to remove.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiRemoveLinkifierRequest struct via the builder pattern


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


## ReorderCustomProfileFields

> JsonSuccess ReorderCustomProfileFields(ctx).Order(order).Execute()

Reorder custom profile fields



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
    order := []int32{int32(123)} // []int32 | A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ServerAndOrganizationsApi.ReorderCustomProfileFields(context.Background()).Order(order).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ServerAndOrganizationsApi.ReorderCustomProfileFields``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ReorderCustomProfileFields`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `ServerAndOrganizationsApi.ReorderCustomProfileFields`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReorderCustomProfileFieldsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | **[]int32** | A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  | 

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


## UpdateLinkifier

> JsonSuccess UpdateLinkifier(ctx, filterId).Pattern(pattern).UrlFormatString(urlFormatString).Execute()

Update a linkifier



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
    filterId := int32(2) // int32 | The ID of the linkifier that you want to update. 
    pattern := "#(?P<id>[0-9]+)" // string | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
    urlFormatString := "https://github.com/zulip/zulip/issues/%(id)s" // string | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ServerAndOrganizationsApi.UpdateLinkifier(context.Background(), filterId).Pattern(pattern).UrlFormatString(urlFormatString).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ServerAndOrganizationsApi.UpdateLinkifier``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateLinkifier`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `ServerAndOrganizationsApi.UpdateLinkifier`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**filterId** | **int32** | The ID of the linkifier that you want to update.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateLinkifierRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pattern** | **string** | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
 **urlFormatString** | **string** | The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

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


## UploadCustomEmoji

> JsonSuccess UploadCustomEmoji(ctx, emojiName).Filename(filename).Execute()

Upload custom emoji



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
    emojiName := "smile" // string | The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
    filename := os.NewFile(1234, "some_file") // *os.File |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.ServerAndOrganizationsApi.UploadCustomEmoji(context.Background(), emojiName).Filename(filename).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ServerAndOrganizationsApi.UploadCustomEmoji``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UploadCustomEmoji`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `ServerAndOrganizationsApi.UploadCustomEmoji`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**emojiName** | **string** | The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUploadCustomEmojiRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **filename** | ***os.File** |  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

