# UsersAPI

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UsersAPI.md#createuser) | **POST** /users | Create a user
[**createUserGroup**](UsersAPI.md#createusergroup) | **POST** /user_groups/create | Create a user group
[**deactivateOwnUser**](UsersAPI.md#deactivateownuser) | **DELETE** /users/me | Deactivate own user
[**deactivateUser**](UsersAPI.md#deactivateuser) | **DELETE** /users/{user_id} | Deactivate a user
[**getAttachments**](UsersAPI.md#getattachments) | **GET** /attachments | Get attachments
[**getOwnUser**](UsersAPI.md#getownuser) | **GET** /users/me | Get own user
[**getUser**](UsersAPI.md#getuser) | **GET** /users/{user_id} | Get a user
[**getUserByEmail**](UsersAPI.md#getuserbyemail) | **GET** /users/{email} | Get a user by email
[**getUserGroups**](UsersAPI.md#getusergroups) | **GET** /user_groups | Get user groups
[**getUserPresence**](UsersAPI.md#getuserpresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
[**getUsers**](UsersAPI.md#getusers) | **GET** /users | Get all users
[**muteUser**](UsersAPI.md#muteuser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
[**reactivateUser**](UsersAPI.md#reactivateuser) | **POST** /users/{user_id}/reactivate | Reactivate a user
[**removeUserGroup**](UsersAPI.md#removeusergroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
[**setTypingStatus**](UsersAPI.md#settypingstatus) | **POST** /typing | Set \&quot;typing\&quot; status
[**unmuteUser**](UsersAPI.md#unmuteuser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
[**updateDisplaySettings**](UsersAPI.md#updatedisplaysettings) | **PATCH** /settings/display | Update display settings
[**updateNotificationSettings**](UsersAPI.md#updatenotificationsettings) | **PATCH** /settings/notifications | Update notification settings
[**updateUser**](UsersAPI.md#updateuser) | **PATCH** /users/{user_id} | Update a user
[**updateUserGroup**](UsersAPI.md#updateusergroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**updateUserGroupMembers**](UsersAPI.md#updateusergroupmembers) | **POST** /user_groups/{user_group_id}/members | Update user group members


# **createUser**
```swift
    open class func createUser(email: String, password: String, fullName: String, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let email = "email_example" // String | The email address of the new user. 
let password = "password_example" // String | The password of the new user. 
let fullName = "fullName_example" // String | The full name of the new user. 

// Create a user
UsersAPI.createUser(email: email, password: password, fullName: fullName) { (response, error) in
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
 **email** | **String** | The email address of the new user.  | 
 **password** | **String** | The password of the new user.  | 
 **fullName** | **String** | The full name of the new user.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createUserGroup**
```swift
    open class func createUserGroup(name: String, description: String, members: [Int], completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Create a user group

Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let name = "name_example" // String | The name of the user group. 
let description = "description_example" // String | The description of the user group. 
let members = [123] // [Int] | An array containing the user IDs of the initial members for the new user group. 

// Create a user group
UsersAPI.createUserGroup(name: name, description: description, members: members) { (response, error) in
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
 **name** | **String** | The name of the user group.  | 
 **description** | **String** | The description of the user group.  | 
 **members** | [**[Int]**](Int.md) | An array containing the user IDs of the initial members for the new user group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivateOwnUser**
```swift
    open class func deactivateOwnUser(completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Deactivate own user

Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Deactivate own user
UsersAPI.deactivateOwnUser() { (response, error) in
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

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivateUser**
```swift
    open class func deactivateUser(userId: Int, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let userId = 987 // Int | The target user's ID. 

// Deactivate a user
UsersAPI.deactivateUser(userId: userId) { (response, error) in
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

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAttachments**
```swift
    open class func getAttachments(completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get attachments

Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Get attachments
UsersAPI.getAttachments() { (response, error) in
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

# **getOwnUser**
```swift
    open class func getOwnUser(completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get own user

Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Get own user
UsersAPI.getOwnUser() { (response, error) in
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

# **getUser**
```swift
    open class func getUser(userId: Int, clientGravatar: Bool? = nil, includeCustomProfileFields: Bool? = nil, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get a user

Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let userId = 987 // Int | The target user's ID. 
let clientGravatar = true // Bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to false)
let includeCustomProfileFields = true // Bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) (default to false)

// Get a user
UsersAPI.getUser(userId: userId, clientGravatar: clientGravatar, includeCustomProfileFields: includeCustomProfileFields) { (response, error) in
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
 **clientGravatar** | **Bool** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **Bool** | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUserByEmail**
```swift
    open class func getUserByEmail(email: String, clientGravatar: Bool? = nil, includeCustomProfileFields: Bool? = nil, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let email = "email_example" // String | The email address of the user whose details you want to fetch. 
let clientGravatar = true // Bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to false)
let includeCustomProfileFields = true // Bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) (default to false)

// Get a user by email
UsersAPI.getUserByEmail(email: email, clientGravatar: clientGravatar, includeCustomProfileFields: includeCustomProfileFields) { (response, error) in
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
 **email** | **String** | The email address of the user whose details you want to fetch.  | 
 **clientGravatar** | **Bool** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **Bool** | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUserGroups**
```swift
    open class func getUserGroups(completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Get user groups
UsersAPI.getUserGroups() { (response, error) in
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

# **getUserPresence**
```swift
    open class func getUserPresence(userIdOrEmail: String, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let userIdOrEmail = "userIdOrEmail_example" // String | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 

// Get user presence
UsersAPI.getUserPresence(userIdOrEmail: userIdOrEmail) { (response, error) in
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
 **userIdOrEmail** | **String** | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUsers**
```swift
    open class func getUsers(clientGravatar: Bool? = nil, includeCustomProfileFields: Bool? = nil, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let clientGravatar = true // Bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to false)
let includeCustomProfileFields = true // Bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) (default to false)

// Get all users
UsersAPI.getUsers(clientGravatar: clientGravatar, includeCustomProfileFields: includeCustomProfileFields) { (response, error) in
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
 **clientGravatar** | **Bool** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **Bool** | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **muteUser**
```swift
    open class func muteUser(mutedUserId: Int, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let mutedUserId = 987 // Int | The ID of the user to mute/un-mute. 

// Mute a user
UsersAPI.muteUser(mutedUserId: mutedUserId) { (response, error) in
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
 **mutedUserId** | **Int** | The ID of the user to mute/un-mute.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reactivateUser**
```swift
    open class func reactivateUser(userId: Int, completion: @escaping (_ data: Any?, _ error: Error?) -> Void)
```

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let userId = 987 // Int | The target user's ID. 

// Reactivate a user
UsersAPI.reactivateUser(userId: userId) { (response, error) in
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

### Return type

**Any**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **removeUserGroup**
```swift
    open class func removeUserGroup(userGroupId: Int, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Delete a user group

Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let userGroupId = 987 // Int | The ID of the target user group. 

// Delete a user group
UsersAPI.removeUserGroup(userGroupId: userGroupId) { (response, error) in
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
 **userGroupId** | **Int** | The ID of the target user group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **setTypingStatus**
```swift
    open class func setTypingStatus(op: Op_setTypingStatus, to: [Int], type: ModelType_setTypingStatus? = nil, topic: String? = nil, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Set \"typing\" status

Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let op = "op_example" // String | Whether the user has started (`start`) or stopped (`stop`) to type. 
let to = [123] // [Int] | For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
let type = "type_example" // String | Type of the message being composed.  (optional) (default to ._private)
let topic = "topic_example" // String | Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type.  (optional)

// Set \"typing\" status
UsersAPI.setTypingStatus(op: op, to: to, type: type, topic: topic) { (response, error) in
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
 **op** | **String** | Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type.  | 
 **to** | [**[Int]**](Int.md) | For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  | 
 **type** | **String** | Type of the message being composed.  | [optional] [default to ._private]
 **topic** | **String** | Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unmuteUser**
```swift
    open class func unmuteUser(mutedUserId: Int, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Unmute a user

This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let mutedUserId = 987 // Int | The ID of the user to mute/un-mute. 

// Unmute a user
UsersAPI.unmuteUser(mutedUserId: mutedUserId) { (response, error) in
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
 **mutedUserId** | **Int** | The ID of the user to mute/un-mute.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateDisplaySettings**
```swift
    open class func updateDisplaySettings(twentyFourHourTime: Bool? = nil, denseMode: Bool? = nil, starredMessageCounts: Bool? = nil, fluidLayoutWidth: Bool? = nil, highContrastMode: Bool? = nil, colorScheme: ColorScheme_updateDisplaySettings? = nil, translateEmoticons: Bool? = nil, defaultLanguage: String? = nil, defaultView: String? = nil, leftSideUserlist: Bool? = nil, emojiset: String? = nil, demoteInactiveStreams: DemoteInactiveStreams_updateDisplaySettings? = nil, timezone: String? = nil, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Update display settings

This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let twentyFourHourTime = true // Bool | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  (optional)
let denseMode = true // Bool | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  (optional)
let starredMessageCounts = true // Bool | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  (optional)
let fluidLayoutWidth = true // Bool | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  (optional)
let highContrastMode = true // Bool | This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  (optional)
let colorScheme = 987 // Int | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  (optional)
let translateEmoticons = true // Bool | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  (optional)
let defaultLanguage = "defaultLanguage_example" // String | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  (optional)
let defaultView = "defaultView_example" // String | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  (optional)
let leftSideUserlist = true // Bool | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  (optional)
let emojiset = "emojiset_example" // String | The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  (optional)
let demoteInactiveStreams = 987 // Int | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  (optional)
let timezone = "timezone_example" // String | The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  (optional)

// Update display settings
UsersAPI.updateDisplaySettings(twentyFourHourTime: twentyFourHourTime, denseMode: denseMode, starredMessageCounts: starredMessageCounts, fluidLayoutWidth: fluidLayoutWidth, highContrastMode: highContrastMode, colorScheme: colorScheme, translateEmoticons: translateEmoticons, defaultLanguage: defaultLanguage, defaultView: defaultView, leftSideUserlist: leftSideUserlist, emojiset: emojiset, demoteInactiveStreams: demoteInactiveStreams, timezone: timezone) { (response, error) in
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
 **twentyFourHourTime** | **Bool** | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  | [optional] 
 **denseMode** | **Bool** | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  | [optional] 
 **starredMessageCounts** | **Bool** | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  | [optional] 
 **fluidLayoutWidth** | **Bool** | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  | [optional] 
 **highContrastMode** | **Bool** | This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  | [optional] 
 **colorScheme** | **Int** | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  | [optional] 
 **translateEmoticons** | **Bool** | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  | [optional] 
 **defaultLanguage** | **String** | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | [optional] 
 **defaultView** | **String** | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **leftSideUserlist** | **Bool** | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  | [optional] 
 **emojiset** | **String** | The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **demoteInactiveStreams** | **Int** | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  | [optional] 
 **timezone** | **String** | The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateNotificationSettings**
```swift
    open class func updateNotificationSettings(enableStreamDesktopNotifications: Bool? = nil, enableStreamEmailNotifications: Bool? = nil, enableStreamPushNotifications: Bool? = nil, enableStreamAudibleNotifications: Bool? = nil, notificationSound: String? = nil, enableDesktopNotifications: Bool? = nil, enableSounds: Bool? = nil, enableOfflineEmailNotifications: Bool? = nil, enableOfflinePushNotifications: Bool? = nil, enableOnlinePushNotifications: Bool? = nil, enableDigestEmails: Bool? = nil, enableMarketingEmails: Bool? = nil, enableLoginEmails: Bool? = nil, messageContentInEmailNotifications: Bool? = nil, pmContentInDesktopNotifications: Bool? = nil, wildcardMentionsNotify: Bool? = nil, desktopIconCountDisplay: DesktopIconCountDisplay_updateNotificationSettings? = nil, realmNameInNotifications: Bool? = nil, presenceEnabled: Bool? = nil, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Update notification settings

This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let enableStreamDesktopNotifications = true // Bool | Enable visual desktop notifications for stream messages.  (optional)
let enableStreamEmailNotifications = true // Bool | Enable email notifications for stream messages.  (optional)
let enableStreamPushNotifications = true // Bool | Enable mobile notifications for stream messages.  (optional)
let enableStreamAudibleNotifications = true // Bool | Enable audible desktop notifications for stream messages.  (optional)
let notificationSound = "notificationSound_example" // String | Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  (optional)
let enableDesktopNotifications = true // Bool | Enable visual desktop notifications for private messages and @-mentions.  (optional)
let enableSounds = true // Bool | Enable audible desktop notifications for private messages and @-mentions.  (optional)
let enableOfflineEmailNotifications = true // Bool | Enable email notifications for private messages and @-mentions received when the user is offline.  (optional)
let enableOfflinePushNotifications = true // Bool | Enable mobile notification for private messages and @-mentions received when the user is offline.  (optional)
let enableOnlinePushNotifications = true // Bool | Enable mobile notification for private messages and @-mentions received when the user is online.  (optional)
let enableDigestEmails = true // Bool | Enable digest emails when the user is away.  (optional)
let enableMarketingEmails = true // Bool | Enable marketing emails. Has no function outside Zulip Cloud.  (optional)
let enableLoginEmails = true // Bool | Enable email notifications for new logins to account.  (optional)
let messageContentInEmailNotifications = true // Bool | Include the message's content in email notifications for new messages.  (optional)
let pmContentInDesktopNotifications = true // Bool | Include content of private messages in desktop notifications.  (optional)
let wildcardMentionsNotify = true // Bool | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  (optional)
let desktopIconCountDisplay = 987 // Int | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  (optional)
let realmNameInNotifications = true // Bool | Include organization name in subject of message notification emails.  (optional)
let presenceEnabled = true // Bool | Display the presence status to other users when online.  (optional)

// Update notification settings
UsersAPI.updateNotificationSettings(enableStreamDesktopNotifications: enableStreamDesktopNotifications, enableStreamEmailNotifications: enableStreamEmailNotifications, enableStreamPushNotifications: enableStreamPushNotifications, enableStreamAudibleNotifications: enableStreamAudibleNotifications, notificationSound: notificationSound, enableDesktopNotifications: enableDesktopNotifications, enableSounds: enableSounds, enableOfflineEmailNotifications: enableOfflineEmailNotifications, enableOfflinePushNotifications: enableOfflinePushNotifications, enableOnlinePushNotifications: enableOnlinePushNotifications, enableDigestEmails: enableDigestEmails, enableMarketingEmails: enableMarketingEmails, enableLoginEmails: enableLoginEmails, messageContentInEmailNotifications: messageContentInEmailNotifications, pmContentInDesktopNotifications: pmContentInDesktopNotifications, wildcardMentionsNotify: wildcardMentionsNotify, desktopIconCountDisplay: desktopIconCountDisplay, realmNameInNotifications: realmNameInNotifications, presenceEnabled: presenceEnabled) { (response, error) in
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
 **enableStreamDesktopNotifications** | **Bool** | Enable visual desktop notifications for stream messages.  | [optional] 
 **enableStreamEmailNotifications** | **Bool** | Enable email notifications for stream messages.  | [optional] 
 **enableStreamPushNotifications** | **Bool** | Enable mobile notifications for stream messages.  | [optional] 
 **enableStreamAudibleNotifications** | **Bool** | Enable audible desktop notifications for stream messages.  | [optional] 
 **notificationSound** | **String** | Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | [optional] 
 **enableDesktopNotifications** | **Bool** | Enable visual desktop notifications for private messages and @-mentions.  | [optional] 
 **enableSounds** | **Bool** | Enable audible desktop notifications for private messages and @-mentions.  | [optional] 
 **enableOfflineEmailNotifications** | **Bool** | Enable email notifications for private messages and @-mentions received when the user is offline.  | [optional] 
 **enableOfflinePushNotifications** | **Bool** | Enable mobile notification for private messages and @-mentions received when the user is offline.  | [optional] 
 **enableOnlinePushNotifications** | **Bool** | Enable mobile notification for private messages and @-mentions received when the user is online.  | [optional] 
 **enableDigestEmails** | **Bool** | Enable digest emails when the user is away.  | [optional] 
 **enableMarketingEmails** | **Bool** | Enable marketing emails. Has no function outside Zulip Cloud.  | [optional] 
 **enableLoginEmails** | **Bool** | Enable email notifications for new logins to account.  | [optional] 
 **messageContentInEmailNotifications** | **Bool** | Include the message&#39;s content in email notifications for new messages.  | [optional] 
 **pmContentInDesktopNotifications** | **Bool** | Include content of private messages in desktop notifications.  | [optional] 
 **wildcardMentionsNotify** | **Bool** | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  | [optional] 
 **desktopIconCountDisplay** | **Int** | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  | [optional] 
 **realmNameInNotifications** | **Bool** | Include organization name in subject of message notification emails.  | [optional] 
 **presenceEnabled** | **Bool** | Display the presence status to other users when online.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateUser**
```swift
    open class func updateUser(userId: Int, fullName: String? = nil, role: Int? = nil, profileData: [Any]? = nil, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Update a user

Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let userId = 987 // Int | The target user's ID. 
let fullName = "fullName_example" // String | The user's full name.  (optional)
let role = 987 // Int | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  (optional)
let profileData = [123] // [Any] | A dictionary containing the to be updated custom profile field data for the user.  (optional)

// Update a user
UsersAPI.updateUser(userId: userId, fullName: fullName, role: role, profileData: profileData) { (response, error) in
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
 **fullName** | **String** | The user&#39;s full name.  | [optional] 
 **role** | **Int** | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | [optional] 
 **profileData** | [**[Any]**](Any.md) | A dictionary containing the to be updated custom profile field data for the user.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateUserGroup**
```swift
    open class func updateUserGroup(userGroupId: Int, name: String, description: String, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Update a user group

Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let userGroupId = 987 // Int | The ID of the target user group. 
let name = "name_example" // String | The new name of the group. 
let description = "description_example" // String | The new description of the group. 

// Update a user group
UsersAPI.updateUserGroup(userGroupId: userGroupId, name: name, description: description) { (response, error) in
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
 **userGroupId** | **Int** | The ID of the target user group.  | 
 **name** | **String** | The new name of the group.  | 
 **description** | **String** | The new description of the group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateUserGroupMembers**
```swift
    open class func updateUserGroupMembers(userGroupId: Int, delete: [Int]? = nil, add: [Int]? = nil, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Update user group members

Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let userGroupId = 987 // Int | The ID of the target user group. 
let delete = [123] // [Int] | The list of user ids to be removed from the user group.  (optional)
let add = [123] // [Int] | The list of user ids to be added to the user group.  (optional)

// Update user group members
UsersAPI.updateUserGroupMembers(userGroupId: userGroupId, delete: delete, add: add) { (response, error) in
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
 **userGroupId** | **Int** | The ID of the target user group.  | 
 **delete** | [**[Int]**](Int.md) | The list of user ids to be removed from the user group.  | [optional] 
 **add** | [**[Int]**](Int.md) | The list of user ids to be added to the user group.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

