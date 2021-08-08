# \UsersApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateUser**](UsersApi.md#CreateUser) | **Post** /users | Create a user
[**CreateUserGroup**](UsersApi.md#CreateUserGroup) | **Post** /user_groups/create | Create a user group
[**DeactivateOwnUser**](UsersApi.md#DeactivateOwnUser) | **Delete** /users/me | Deactivate own user
[**DeactivateUser**](UsersApi.md#DeactivateUser) | **Delete** /users/{user_id} | Deactivate a user
[**GetAttachments**](UsersApi.md#GetAttachments) | **Get** /attachments | Get attachments
[**GetOwnUser**](UsersApi.md#GetOwnUser) | **Get** /users/me | Get own user
[**GetUser**](UsersApi.md#GetUser) | **Get** /users/{user_id} | Get a user
[**GetUserByEmail**](UsersApi.md#GetUserByEmail) | **Get** /users/{email} | Get a user by email
[**GetUserGroups**](UsersApi.md#GetUserGroups) | **Get** /user_groups | Get user groups
[**GetUserPresence**](UsersApi.md#GetUserPresence) | **Get** /users/{user_id_or_email}/presence | Get user presence
[**GetUsers**](UsersApi.md#GetUsers) | **Get** /users | Get all users
[**MuteUser**](UsersApi.md#MuteUser) | **Post** /users/me/muted_users/{muted_user_id} | Mute a user
[**ReactivateUser**](UsersApi.md#ReactivateUser) | **Post** /users/{user_id}/reactivate | Reactivate a user
[**RemoveUserGroup**](UsersApi.md#RemoveUserGroup) | **Delete** /user_groups/{user_group_id} | Delete a user group
[**SetTypingStatus**](UsersApi.md#SetTypingStatus) | **Post** /typing | Set \&quot;typing\&quot; status
[**UnmuteUser**](UsersApi.md#UnmuteUser) | **Delete** /users/me/muted_users/{muted_user_id} | Unmute a user
[**UpdateDisplaySettings**](UsersApi.md#UpdateDisplaySettings) | **Patch** /settings/display | Update display settings
[**UpdateNotificationSettings**](UsersApi.md#UpdateNotificationSettings) | **Patch** /settings/notifications | Update notification settings
[**UpdateUser**](UsersApi.md#UpdateUser) | **Patch** /users/{user_id} | Update a user
[**UpdateUserGroup**](UsersApi.md#UpdateUserGroup) | **Patch** /user_groups/{user_group_id} | Update a user group
[**UpdateUserGroupMembers**](UsersApi.md#UpdateUserGroupMembers) | **Post** /user_groups/{user_group_id}/members | Update user group members



## CreateUser

> JsonSuccessBase CreateUser(ctx).Email(email).Password(password).FullName(fullName).Execute()

Create a user



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
    email := "username@example.com" // string | The email address of the new user. 
    password := "abcd1234" // string | The password of the new user. 
    fullName := "New User" // string | The full name of the new user. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.CreateUser(context.Background()).Email(email).Password(password).FullName(fullName).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.CreateUser``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateUser`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.CreateUser`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string** | The email address of the new user.  | 
 **password** | **string** | The password of the new user.  | 
 **fullName** | **string** | The full name of the new user.  | 

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


## CreateUserGroup

> JsonSuccess CreateUserGroup(ctx).Name(name).Description(description).Members(members).Execute()

Create a user group



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
    name := "marketing" // string | The name of the user group. 
    description := "The marketing team." // string | The description of the user group. 
    members := []int32{int32(123)} // []int32 | An array containing the user IDs of the initial members for the new user group. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.CreateUserGroup(context.Background()).Name(name).Description(description).Members(members).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.CreateUserGroup``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateUserGroup`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.CreateUserGroup`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateUserGroupRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** | The name of the user group.  | 
 **description** | **string** | The description of the user group.  | 
 **members** | **[]int32** | An array containing the user IDs of the initial members for the new user group.  | 

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


## DeactivateOwnUser

> JsonSuccess DeactivateOwnUser(ctx).Execute()

Deactivate own user



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
    resp, r, err := api_client.UsersApi.DeactivateOwnUser(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.DeactivateOwnUser``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DeactivateOwnUser`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.DeactivateOwnUser`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDeactivateOwnUserRequest struct via the builder pattern


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


## DeactivateUser

> JsonSuccess DeactivateUser(ctx, userId).Execute()

Deactivate a user



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

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.DeactivateUser(context.Background(), userId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.DeactivateUser``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DeactivateUser`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.DeactivateUser`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**userId** | **int32** | The target user&#39;s ID.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeactivateUserRequest struct via the builder pattern


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


## GetAttachments

> JsonSuccessBase GetAttachments(ctx).Execute()

Get attachments



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
    resp, r, err := api_client.UsersApi.GetAttachments(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.GetAttachments``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetAttachments`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.GetAttachments`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetAttachmentsRequest struct via the builder pattern


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


## GetOwnUser

> JsonSuccessBase GetOwnUser(ctx).Execute()

Get own user



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
    resp, r, err := api_client.UsersApi.GetOwnUser(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.GetOwnUser``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetOwnUser`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.GetOwnUser`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetOwnUserRequest struct via the builder pattern


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


## GetUser

> JsonSuccessBase GetUser(ctx, userId).ClientGravatar(clientGravatar).IncludeCustomProfileFields(includeCustomProfileFields).Execute()

Get a user



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
    clientGravatar := true // bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to false)
    includeCustomProfileFields := true // bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) (default to false)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.GetUser(context.Background(), userId).ClientGravatar(clientGravatar).IncludeCustomProfileFields(includeCustomProfileFields).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.GetUser``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetUser`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.GetUser`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**userId** | **int32** | The target user&#39;s ID.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **clientGravatar** | **bool** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [default to false]
 **includeCustomProfileFields** | **bool** | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [default to false]

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


## GetUserByEmail

> JsonSuccessBase GetUserByEmail(ctx, email).ClientGravatar(clientGravatar).IncludeCustomProfileFields(includeCustomProfileFields).Execute()

Get a user by email



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
    email := "iago@zulip.com" // string | The email address of the user whose details you want to fetch. 
    clientGravatar := true // bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to false)
    includeCustomProfileFields := true // bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) (default to false)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.GetUserByEmail(context.Background(), email).ClientGravatar(clientGravatar).IncludeCustomProfileFields(includeCustomProfileFields).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.GetUserByEmail``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetUserByEmail`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.GetUserByEmail`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**email** | **string** | The email address of the user whose details you want to fetch.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetUserByEmailRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **clientGravatar** | **bool** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [default to false]
 **includeCustomProfileFields** | **bool** | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [default to false]

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


## GetUserGroups

> JsonSuccessBase GetUserGroups(ctx).Execute()

Get user groups



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
    resp, r, err := api_client.UsersApi.GetUserGroups(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.GetUserGroups``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetUserGroups`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.GetUserGroups`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetUserGroupsRequest struct via the builder pattern


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


## GetUserPresence

> JsonSuccessBase GetUserPresence(ctx, userIdOrEmail).Execute()

Get user presence



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
    userIdOrEmail := "iago@zulip.com" // string | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.GetUserPresence(context.Background(), userIdOrEmail).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.GetUserPresence``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetUserPresence`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.GetUserPresence`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**userIdOrEmail** | **string** | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetUserPresenceRequest struct via the builder pattern


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


## GetUsers

> JsonSuccessBase GetUsers(ctx).ClientGravatar(clientGravatar).IncludeCustomProfileFields(includeCustomProfileFields).Execute()

Get all users



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
    clientGravatar := true // bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to false)
    includeCustomProfileFields := true // bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) (default to false)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.GetUsers(context.Background()).ClientGravatar(clientGravatar).IncludeCustomProfileFields(includeCustomProfileFields).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.GetUsers``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetUsers`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.GetUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGravatar** | **bool** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [default to false]
 **includeCustomProfileFields** | **bool** | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [default to false]

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


## MuteUser

> JsonSuccess MuteUser(ctx, mutedUserId).Execute()

Mute a user



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
    mutedUserId := int32(10) // int32 | The ID of the user to mute/un-mute. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.MuteUser(context.Background(), mutedUserId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.MuteUser``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MuteUser`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.MuteUser`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**mutedUserId** | **int32** | The ID of the user to mute/un-mute.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiMuteUserRequest struct via the builder pattern


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


## ReactivateUser

> interface{} ReactivateUser(ctx, userId).Execute()

Reactivate a user



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

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.ReactivateUser(context.Background(), userId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.ReactivateUser``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ReactivateUser`: interface{}
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.ReactivateUser`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**userId** | **int32** | The target user&#39;s ID.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiReactivateUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


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


## RemoveUserGroup

> JsonSuccess RemoveUserGroup(ctx, userGroupId).Execute()

Delete a user group



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
    userGroupId := int32(1) // int32 | The ID of the target user group. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.RemoveUserGroup(context.Background(), userGroupId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.RemoveUserGroup``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RemoveUserGroup`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.RemoveUserGroup`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**userGroupId** | **int32** | The ID of the target user group.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiRemoveUserGroupRequest struct via the builder pattern


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


## SetTypingStatus

> JsonSuccess SetTypingStatus(ctx).Op(op).To(to).Type_(type_).Topic(topic).Execute()

Set \"typing\" status



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
    op := "start" // string | Whether the user has started (`start`) or stopped (`stop`) to type. 
    to := []int32{int32(123)} // []int32 | For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
    type_ := "private" // string | Type of the message being composed.  (optional) (default to "private")
    topic := "typing notifications" // string | Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type.  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.SetTypingStatus(context.Background()).Op(op).To(to).Type_(type_).Topic(topic).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.SetTypingStatus``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SetTypingStatus`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.SetTypingStatus`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSetTypingStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | **string** | Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type.  | 
 **to** | **[]int32** | For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  | 
 **type_** | **string** | Type of the message being composed.  | [default to &quot;private&quot;]
 **topic** | **string** | Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  | 

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


## UnmuteUser

> JsonSuccess UnmuteUser(ctx, mutedUserId).Execute()

Unmute a user



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
    mutedUserId := int32(10) // int32 | The ID of the user to mute/un-mute. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.UnmuteUser(context.Background(), mutedUserId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UnmuteUser``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UnmuteUser`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UnmuteUser`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**mutedUserId** | **int32** | The ID of the user to mute/un-mute.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUnmuteUserRequest struct via the builder pattern


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


## UpdateDisplaySettings

> JsonSuccessBase UpdateDisplaySettings(ctx).TwentyFourHourTime(twentyFourHourTime).DenseMode(denseMode).StarredMessageCounts(starredMessageCounts).FluidLayoutWidth(fluidLayoutWidth).HighContrastMode(highContrastMode).ColorScheme(colorScheme).TranslateEmoticons(translateEmoticons).DefaultLanguage(defaultLanguage).DefaultView(defaultView).LeftSideUserlist(leftSideUserlist).Emojiset(emojiset).DemoteInactiveStreams(demoteInactiveStreams).Timezone(timezone).Execute()

Update display settings



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
    twentyFourHourTime := true // bool | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  (optional)
    denseMode := true // bool | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  (optional)
    starredMessageCounts := true // bool | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  (optional)
    fluidLayoutWidth := true // bool | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  (optional)
    highContrastMode := true // bool | This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  (optional)
    colorScheme := int32(56) // int32 | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  (optional)
    translateEmoticons := true // bool | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  (optional)
    defaultLanguage := "en" // string | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  (optional)
    defaultView := "all_messages" // string | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  (optional)
    leftSideUserlist := true // bool | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  (optional)
    emojiset := "google" // string | The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  (optional)
    demoteInactiveStreams := int32(56) // int32 | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  (optional)
    timezone := "Asia/Kolkata" // string | The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.UpdateDisplaySettings(context.Background()).TwentyFourHourTime(twentyFourHourTime).DenseMode(denseMode).StarredMessageCounts(starredMessageCounts).FluidLayoutWidth(fluidLayoutWidth).HighContrastMode(highContrastMode).ColorScheme(colorScheme).TranslateEmoticons(translateEmoticons).DefaultLanguage(defaultLanguage).DefaultView(defaultView).LeftSideUserlist(leftSideUserlist).Emojiset(emojiset).DemoteInactiveStreams(demoteInactiveStreams).Timezone(timezone).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UpdateDisplaySettings``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateDisplaySettings`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UpdateDisplaySettings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUpdateDisplaySettingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **twentyFourHourTime** | **bool** | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  | 
 **denseMode** | **bool** | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  | 
 **starredMessageCounts** | **bool** | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  | 
 **fluidLayoutWidth** | **bool** | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  | 
 **highContrastMode** | **bool** | This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  | 
 **colorScheme** | **int32** | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  | 
 **translateEmoticons** | **bool** | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  | 
 **defaultLanguage** | **string** | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | 
 **defaultView** | **string** | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | 
 **leftSideUserlist** | **bool** | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  | 
 **emojiset** | **string** | The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | 
 **demoteInactiveStreams** | **int32** | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  | 
 **timezone** | **string** | The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | 

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


## UpdateNotificationSettings

> JsonSuccessBase UpdateNotificationSettings(ctx).EnableStreamDesktopNotifications(enableStreamDesktopNotifications).EnableStreamEmailNotifications(enableStreamEmailNotifications).EnableStreamPushNotifications(enableStreamPushNotifications).EnableStreamAudibleNotifications(enableStreamAudibleNotifications).NotificationSound(notificationSound).EnableDesktopNotifications(enableDesktopNotifications).EnableSounds(enableSounds).EnableOfflineEmailNotifications(enableOfflineEmailNotifications).EnableOfflinePushNotifications(enableOfflinePushNotifications).EnableOnlinePushNotifications(enableOnlinePushNotifications).EnableDigestEmails(enableDigestEmails).EnableMarketingEmails(enableMarketingEmails).EnableLoginEmails(enableLoginEmails).MessageContentInEmailNotifications(messageContentInEmailNotifications).PmContentInDesktopNotifications(pmContentInDesktopNotifications).WildcardMentionsNotify(wildcardMentionsNotify).DesktopIconCountDisplay(desktopIconCountDisplay).RealmNameInNotifications(realmNameInNotifications).PresenceEnabled(presenceEnabled).Execute()

Update notification settings



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
    enableStreamDesktopNotifications := true // bool | Enable visual desktop notifications for stream messages.  (optional)
    enableStreamEmailNotifications := true // bool | Enable email notifications for stream messages.  (optional)
    enableStreamPushNotifications := true // bool | Enable mobile notifications for stream messages.  (optional)
    enableStreamAudibleNotifications := true // bool | Enable audible desktop notifications for stream messages.  (optional)
    notificationSound := "ding" // string | Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  (optional)
    enableDesktopNotifications := true // bool | Enable visual desktop notifications for private messages and @-mentions.  (optional)
    enableSounds := true // bool | Enable audible desktop notifications for private messages and @-mentions.  (optional)
    enableOfflineEmailNotifications := true // bool | Enable email notifications for private messages and @-mentions received when the user is offline.  (optional)
    enableOfflinePushNotifications := true // bool | Enable mobile notification for private messages and @-mentions received when the user is offline.  (optional)
    enableOnlinePushNotifications := true // bool | Enable mobile notification for private messages and @-mentions received when the user is online.  (optional)
    enableDigestEmails := true // bool | Enable digest emails when the user is away.  (optional)
    enableMarketingEmails := true // bool | Enable marketing emails. Has no function outside Zulip Cloud.  (optional)
    enableLoginEmails := true // bool | Enable email notifications for new logins to account.  (optional)
    messageContentInEmailNotifications := true // bool | Include the message's content in email notifications for new messages.  (optional)
    pmContentInDesktopNotifications := true // bool | Include content of private messages in desktop notifications.  (optional)
    wildcardMentionsNotify := true // bool | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  (optional)
    desktopIconCountDisplay := int32(56) // int32 | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  (optional)
    realmNameInNotifications := true // bool | Include organization name in subject of message notification emails.  (optional)
    presenceEnabled := true // bool | Display the presence status to other users when online.  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.UpdateNotificationSettings(context.Background()).EnableStreamDesktopNotifications(enableStreamDesktopNotifications).EnableStreamEmailNotifications(enableStreamEmailNotifications).EnableStreamPushNotifications(enableStreamPushNotifications).EnableStreamAudibleNotifications(enableStreamAudibleNotifications).NotificationSound(notificationSound).EnableDesktopNotifications(enableDesktopNotifications).EnableSounds(enableSounds).EnableOfflineEmailNotifications(enableOfflineEmailNotifications).EnableOfflinePushNotifications(enableOfflinePushNotifications).EnableOnlinePushNotifications(enableOnlinePushNotifications).EnableDigestEmails(enableDigestEmails).EnableMarketingEmails(enableMarketingEmails).EnableLoginEmails(enableLoginEmails).MessageContentInEmailNotifications(messageContentInEmailNotifications).PmContentInDesktopNotifications(pmContentInDesktopNotifications).WildcardMentionsNotify(wildcardMentionsNotify).DesktopIconCountDisplay(desktopIconCountDisplay).RealmNameInNotifications(realmNameInNotifications).PresenceEnabled(presenceEnabled).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UpdateNotificationSettings``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateNotificationSettings`: JsonSuccessBase
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UpdateNotificationSettings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUpdateNotificationSettingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enableStreamDesktopNotifications** | **bool** | Enable visual desktop notifications for stream messages.  | 
 **enableStreamEmailNotifications** | **bool** | Enable email notifications for stream messages.  | 
 **enableStreamPushNotifications** | **bool** | Enable mobile notifications for stream messages.  | 
 **enableStreamAudibleNotifications** | **bool** | Enable audible desktop notifications for stream messages.  | 
 **notificationSound** | **string** | Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | 
 **enableDesktopNotifications** | **bool** | Enable visual desktop notifications for private messages and @-mentions.  | 
 **enableSounds** | **bool** | Enable audible desktop notifications for private messages and @-mentions.  | 
 **enableOfflineEmailNotifications** | **bool** | Enable email notifications for private messages and @-mentions received when the user is offline.  | 
 **enableOfflinePushNotifications** | **bool** | Enable mobile notification for private messages and @-mentions received when the user is offline.  | 
 **enableOnlinePushNotifications** | **bool** | Enable mobile notification for private messages and @-mentions received when the user is online.  | 
 **enableDigestEmails** | **bool** | Enable digest emails when the user is away.  | 
 **enableMarketingEmails** | **bool** | Enable marketing emails. Has no function outside Zulip Cloud.  | 
 **enableLoginEmails** | **bool** | Enable email notifications for new logins to account.  | 
 **messageContentInEmailNotifications** | **bool** | Include the message&#39;s content in email notifications for new messages.  | 
 **pmContentInDesktopNotifications** | **bool** | Include content of private messages in desktop notifications.  | 
 **wildcardMentionsNotify** | **bool** | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  | 
 **desktopIconCountDisplay** | **int32** | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  | 
 **realmNameInNotifications** | **bool** | Include organization name in subject of message notification emails.  | 
 **presenceEnabled** | **bool** | Display the presence status to other users when online.  | 

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


## UpdateUser

> JsonSuccess UpdateUser(ctx, userId).FullName(fullName).Role(role).ProfileData(profileData).Execute()

Update a user



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
    fullName := "fullName_example" // string | The user's full name.  (optional)
    role := int32(400) // int32 | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  (optional)
    profileData := []map[string]interface{}{map[string]interface{}(123)} // []map[string]interface{} | A dictionary containing the to be updated custom profile field data for the user.  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.UpdateUser(context.Background(), userId).FullName(fullName).Role(role).ProfileData(profileData).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UpdateUser``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateUser`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UpdateUser`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**userId** | **int32** | The target user&#39;s ID.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **fullName** | **string** | The user&#39;s full name.  | 
 **role** | **int32** | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | 
 **profileData** | **[]map[string]interface{}** | A dictionary containing the to be updated custom profile field data for the user.  | 

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


## UpdateUserGroup

> JsonSuccess UpdateUserGroup(ctx, userGroupId).Name(name).Description(description).Execute()

Update a user group



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
    userGroupId := int32(1) // int32 | The ID of the target user group. 
    name := "marketing team" // string | The new name of the group. 
    description := "The marketing team." // string | The new description of the group. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.UpdateUserGroup(context.Background(), userGroupId).Name(name).Description(description).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UpdateUserGroup``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateUserGroup`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UpdateUserGroup`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**userGroupId** | **int32** | The ID of the target user group.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateUserGroupRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **name** | **string** | The new name of the group.  | 
 **description** | **string** | The new description of the group.  | 

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


## UpdateUserGroupMembers

> JsonSuccess UpdateUserGroupMembers(ctx, userGroupId).Delete(delete).Add(add).Execute()

Update user group members



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
    userGroupId := int32(1) // int32 | The ID of the target user group. 
    delete := []int32{int32(123)} // []int32 | The list of user ids to be removed from the user group.  (optional)
    add := []int32{int32(123)} // []int32 | The list of user ids to be added to the user group.  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.UsersApi.UpdateUserGroupMembers(context.Background(), userGroupId).Delete(delete).Add(add).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UpdateUserGroupMembers``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateUserGroupMembers`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UpdateUserGroupMembers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**userGroupId** | **int32** | The ID of the target user group.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateUserGroupMembersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **delete** | **[]int32** | The list of user ids to be removed from the user group.  | 
 **add** | **[]int32** | The list of user ids to be added to the user group.  | 

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

