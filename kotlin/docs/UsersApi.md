# UsersApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UsersApi.md#createUser) | **POST** /users | Create a user
[**createUserGroup**](UsersApi.md#createUserGroup) | **POST** /user_groups/create | Create a user group
[**deactivateOwnUser**](UsersApi.md#deactivateOwnUser) | **DELETE** /users/me | Deactivate own user
[**deactivateUser**](UsersApi.md#deactivateUser) | **DELETE** /users/{user_id} | Deactivate a user
[**getAttachments**](UsersApi.md#getAttachments) | **GET** /attachments | Get attachments
[**getOwnUser**](UsersApi.md#getOwnUser) | **GET** /users/me | Get own user
[**getUser**](UsersApi.md#getUser) | **GET** /users/{user_id} | Get a user
[**getUserByEmail**](UsersApi.md#getUserByEmail) | **GET** /users/{email} | Get a user by email
[**getUserGroups**](UsersApi.md#getUserGroups) | **GET** /user_groups | Get user groups
[**getUserPresence**](UsersApi.md#getUserPresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
[**getUsers**](UsersApi.md#getUsers) | **GET** /users | Get all users
[**muteUser**](UsersApi.md#muteUser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
[**reactivateUser**](UsersApi.md#reactivateUser) | **POST** /users/{user_id}/reactivate | Reactivate a user
[**removeUserGroup**](UsersApi.md#removeUserGroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
[**setTypingStatus**](UsersApi.md#setTypingStatus) | **POST** /typing | Set \&quot;typing\&quot; status
[**unmuteUser**](UsersApi.md#unmuteUser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
[**updateDisplaySettings**](UsersApi.md#updateDisplaySettings) | **PATCH** /settings/display | Update display settings
[**updateNotificationSettings**](UsersApi.md#updateNotificationSettings) | **PATCH** /settings/notifications | Update notification settings
[**updateUser**](UsersApi.md#updateUser) | **PATCH** /users/{user_id} | Update a user
[**updateUserGroup**](UsersApi.md#updateUserGroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**updateUserGroupMembers**](UsersApi.md#updateUserGroupMembers) | **POST** /user_groups/{user_group_id}/members | Update user group members


<a name="createUser"></a>
# **createUser**
> JsonSuccessBase createUser(email, password, fullName)

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val email : kotlin.String = username@example.com // kotlin.String | The email address of the new user. 
val password : kotlin.String = abcd1234 // kotlin.String | The password of the new user. 
val fullName : kotlin.String = New User // kotlin.String | The full name of the new user. 
try {
    val result : JsonSuccessBase = apiInstance.createUser(email, password, fullName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#createUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#createUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**| The email address of the new user.  |
 **password** | **kotlin.String**| The password of the new user.  |
 **fullName** | **kotlin.String**| The full name of the new user.  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createUserGroup"></a>
# **createUserGroup**
> JsonSuccess createUserGroup(name, description, members)

Create a user group

Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val name : kotlin.String = marketing // kotlin.String | The name of the user group. 
val description : kotlin.String = The marketing team. // kotlin.String | The description of the user group. 
val members : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | An array containing the user IDs of the initial members for the new user group. 
try {
    val result : JsonSuccess = apiInstance.createUserGroup(name, description, members)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#createUserGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#createUserGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| The name of the user group.  |
 **description** | **kotlin.String**| The description of the user group.  |
 **members** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| An array containing the user IDs of the initial members for the new user group.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deactivateOwnUser"></a>
# **deactivateOwnUser**
> JsonSuccess deactivateOwnUser()

Deactivate own user

Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
try {
    val result : JsonSuccess = apiInstance.deactivateOwnUser()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#deactivateOwnUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#deactivateOwnUser")
    e.printStackTrace()
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

<a name="deactivateUser"></a>
# **deactivateUser**
> JsonSuccess deactivateUser(userId)

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userId : kotlin.Int = 12 // kotlin.Int | The target user's ID. 
try {
    val result : JsonSuccess = apiInstance.deactivateUser(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#deactivateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#deactivateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.Int**| The target user&#39;s ID.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAttachments"></a>
# **getAttachments**
> JsonSuccessBase getAttachments()

Get attachments

Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
try {
    val result : JsonSuccessBase = apiInstance.getAttachments()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getAttachments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getAttachments")
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

<a name="getOwnUser"></a>
# **getOwnUser**
> JsonSuccessBase getOwnUser()

Get own user

Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
try {
    val result : JsonSuccessBase = apiInstance.getOwnUser()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getOwnUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getOwnUser")
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

<a name="getUser"></a>
# **getUser**
> JsonSuccessBase getUser(userId, clientGravatar, includeCustomProfileFields)

Get a user

Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userId : kotlin.Int = 12 // kotlin.Int | The target user's ID. 
val clientGravatar : kotlin.Boolean = true // kotlin.Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
val includeCustomProfileFields : kotlin.Boolean = true // kotlin.Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
try {
    val result : JsonSuccessBase = apiInstance.getUser(userId, clientGravatar, includeCustomProfileFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.Int**| The target user&#39;s ID.  |
 **clientGravatar** | **kotlin.Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **kotlin.Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserByEmail"></a>
# **getUserByEmail**
> JsonSuccessBase getUserByEmail(email, clientGravatar, includeCustomProfileFields)

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val email : kotlin.String = iago@zulip.com // kotlin.String | The email address of the user whose details you want to fetch. 
val clientGravatar : kotlin.Boolean = true // kotlin.Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
val includeCustomProfileFields : kotlin.Boolean = true // kotlin.Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
try {
    val result : JsonSuccessBase = apiInstance.getUserByEmail(email, clientGravatar, includeCustomProfileFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserByEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserByEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**| The email address of the user whose details you want to fetch.  |
 **clientGravatar** | **kotlin.Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **kotlin.Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserGroups"></a>
# **getUserGroups**
> JsonSuccessBase getUserGroups()

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
try {
    val result : JsonSuccessBase = apiInstance.getUserGroups()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserGroups")
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

<a name="getUserPresence"></a>
# **getUserPresence**
> JsonSuccessBase getUserPresence(userIdOrEmail)

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userIdOrEmail : kotlin.String = iago@zulip.com // kotlin.String | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 
try {
    val result : JsonSuccessBase = apiInstance.getUserPresence(userIdOrEmail)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserPresence")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserPresence")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIdOrEmail** | **kotlin.String**| The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> JsonSuccessBase getUsers(clientGravatar, includeCustomProfileFields)

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val clientGravatar : kotlin.Boolean = true // kotlin.Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
val includeCustomProfileFields : kotlin.Boolean = true // kotlin.Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
try {
    val result : JsonSuccessBase = apiInstance.getUsers(clientGravatar, includeCustomProfileFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGravatar** | **kotlin.Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **kotlin.Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="muteUser"></a>
# **muteUser**
> JsonSuccess muteUser(mutedUserId)

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val mutedUserId : kotlin.Int = 10 // kotlin.Int | The ID of the user to mute/un-mute. 
try {
    val result : JsonSuccess = apiInstance.muteUser(mutedUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#muteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#muteUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutedUserId** | **kotlin.Int**| The ID of the user to mute/un-mute.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reactivateUser"></a>
# **reactivateUser**
> AnyType reactivateUser(userId)

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userId : kotlin.Int = 12 // kotlin.Int | The target user's ID. 
try {
    val result : AnyType = apiInstance.reactivateUser(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#reactivateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#reactivateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.Int**| The target user&#39;s ID.  |

### Return type

[**AnyType**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeUserGroup"></a>
# **removeUserGroup**
> JsonSuccess removeUserGroup(userGroupId)

Delete a user group

Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userGroupId : kotlin.Int = 1 // kotlin.Int | The ID of the target user group. 
try {
    val result : JsonSuccess = apiInstance.removeUserGroup(userGroupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#removeUserGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#removeUserGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **kotlin.Int**| The ID of the target user group.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setTypingStatus"></a>
# **setTypingStatus**
> JsonSuccess setTypingStatus(op, to, type, topic)

Set \&quot;typing\&quot; status

Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val op : kotlin.String = start // kotlin.String | Whether the user has started (`start`) or stopped (`stop`) to type. 
val to : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
val type : kotlin.String = private // kotlin.String | Type of the message being composed. 
val topic : kotlin.String = typing notifications // kotlin.String | Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. 
try {
    val result : JsonSuccess = apiInstance.setTypingStatus(op, to, type, topic)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#setTypingStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#setTypingStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | **kotlin.String**| Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type.  | [enum: start, stop]
 **to** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  |
 **type** | **kotlin.String**| Type of the message being composed.  | [optional] [default to private] [enum: private, stream]
 **topic** | **kotlin.String**| Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  | [optional]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unmuteUser"></a>
# **unmuteUser**
> JsonSuccess unmuteUser(mutedUserId)

Unmute a user

This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val mutedUserId : kotlin.Int = 10 // kotlin.Int | The ID of the user to mute/un-mute. 
try {
    val result : JsonSuccess = apiInstance.unmuteUser(mutedUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#unmuteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#unmuteUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutedUserId** | **kotlin.Int**| The ID of the user to mute/un-mute.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDisplaySettings"></a>
# **updateDisplaySettings**
> JsonSuccessBase updateDisplaySettings(twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone)

Update display settings

This endpoint is used to edit the current user&#39;s user interface settings.  &#x60;PATCH {{ api_url }}/v1/settings/display&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val twentyFourHourTime : kotlin.Boolean = true // kotlin.Boolean | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format). 
val denseMode : kotlin.Boolean = true // kotlin.Boolean | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip. 
val starredMessageCounts : kotlin.Boolean = true // kotlin.Boolean | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages). 
val fluidLayoutWidth : kotlin.Boolean = true // kotlin.Boolean | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens. 
val highContrastMode : kotlin.Boolean = true // kotlin.Boolean | This setting is reserved for use to control variations in Zulip's design to help visually impaired users. 
val colorScheme : kotlin.Int = 56 // kotlin.Int | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query. 
val translateEmoticons : kotlin.Boolean = true // kotlin.Boolean | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends. 
val defaultLanguage : kotlin.String = en // kotlin.String | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
val defaultView : kotlin.String = all_messages // kotlin.String | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
val leftSideUserlist : kotlin.Boolean = true // kotlin.Boolean | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked. 
val emojiset : kotlin.String = google // kotlin.String | The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
val demoteInactiveStreams : kotlin.Int = 56 // kotlin.Int | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never 
val timezone : kotlin.String = Asia/Kolkata // kotlin.String | The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
try {
    val result : JsonSuccessBase = apiInstance.updateDisplaySettings(twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateDisplaySettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateDisplaySettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **twentyFourHourTime** | **kotlin.Boolean**| Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  | [optional]
 **denseMode** | **kotlin.Boolean**| This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  | [optional]
 **starredMessageCounts** | **kotlin.Boolean**| Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  | [optional]
 **fluidLayoutWidth** | **kotlin.Boolean**| Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  | [optional]
 **highContrastMode** | **kotlin.Boolean**| This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  | [optional]
 **colorScheme** | **kotlin.Int**| Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  | [optional] [enum: 1, 2, 3]
 **translateEmoticons** | **kotlin.Boolean**| Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  | [optional]
 **defaultLanguage** | **kotlin.String**| What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | [optional]
 **defaultView** | **kotlin.String**| The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional]
 **leftSideUserlist** | **kotlin.Boolean**| Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  | [optional]
 **emojiset** | **kotlin.String**| The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional]
 **demoteInactiveStreams** | **kotlin.Int**| Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  | [optional] [enum: 1, 2, 3]
 **timezone** | **kotlin.String**| The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNotificationSettings"></a>
# **updateNotificationSettings**
> JsonSuccessBase updateNotificationSettings(enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled)

Update notification settings

This endpoint is used to edit the user&#39;s global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  &#x60;PATCH {{ api_url }}/v1/settings/notifications&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val enableStreamDesktopNotifications : kotlin.Boolean = true // kotlin.Boolean | Enable visual desktop notifications for stream messages. 
val enableStreamEmailNotifications : kotlin.Boolean = true // kotlin.Boolean | Enable email notifications for stream messages. 
val enableStreamPushNotifications : kotlin.Boolean = true // kotlin.Boolean | Enable mobile notifications for stream messages. 
val enableStreamAudibleNotifications : kotlin.Boolean = true // kotlin.Boolean | Enable audible desktop notifications for stream messages. 
val notificationSound : kotlin.String = ding // kotlin.String | Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
val enableDesktopNotifications : kotlin.Boolean = true // kotlin.Boolean | Enable visual desktop notifications for private messages and @-mentions. 
val enableSounds : kotlin.Boolean = true // kotlin.Boolean | Enable audible desktop notifications for private messages and @-mentions. 
val enableOfflineEmailNotifications : kotlin.Boolean = true // kotlin.Boolean | Enable email notifications for private messages and @-mentions received when the user is offline. 
val enableOfflinePushNotifications : kotlin.Boolean = true // kotlin.Boolean | Enable mobile notification for private messages and @-mentions received when the user is offline. 
val enableOnlinePushNotifications : kotlin.Boolean = true // kotlin.Boolean | Enable mobile notification for private messages and @-mentions received when the user is online. 
val enableDigestEmails : kotlin.Boolean = true // kotlin.Boolean | Enable digest emails when the user is away. 
val enableMarketingEmails : kotlin.Boolean = true // kotlin.Boolean | Enable marketing emails. Has no function outside Zulip Cloud. 
val enableLoginEmails : kotlin.Boolean = true // kotlin.Boolean | Enable email notifications for new logins to account. 
val messageContentInEmailNotifications : kotlin.Boolean = true // kotlin.Boolean | Include the message's content in email notifications for new messages. 
val pmContentInDesktopNotifications : kotlin.Boolean = true // kotlin.Boolean | Include content of private messages in desktop notifications. 
val wildcardMentionsNotify : kotlin.Boolean = true // kotlin.Boolean | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention. 
val desktopIconCountDisplay : kotlin.Int = 56 // kotlin.Int | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None 
val realmNameInNotifications : kotlin.Boolean = true // kotlin.Boolean | Include organization name in subject of message notification emails. 
val presenceEnabled : kotlin.Boolean = true // kotlin.Boolean | Display the presence status to other users when online. 
try {
    val result : JsonSuccessBase = apiInstance.updateNotificationSettings(enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateNotificationSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateNotificationSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enableStreamDesktopNotifications** | **kotlin.Boolean**| Enable visual desktop notifications for stream messages.  | [optional]
 **enableStreamEmailNotifications** | **kotlin.Boolean**| Enable email notifications for stream messages.  | [optional]
 **enableStreamPushNotifications** | **kotlin.Boolean**| Enable mobile notifications for stream messages.  | [optional]
 **enableStreamAudibleNotifications** | **kotlin.Boolean**| Enable audible desktop notifications for stream messages.  | [optional]
 **notificationSound** | **kotlin.String**| Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | [optional]
 **enableDesktopNotifications** | **kotlin.Boolean**| Enable visual desktop notifications for private messages and @-mentions.  | [optional]
 **enableSounds** | **kotlin.Boolean**| Enable audible desktop notifications for private messages and @-mentions.  | [optional]
 **enableOfflineEmailNotifications** | **kotlin.Boolean**| Enable email notifications for private messages and @-mentions received when the user is offline.  | [optional]
 **enableOfflinePushNotifications** | **kotlin.Boolean**| Enable mobile notification for private messages and @-mentions received when the user is offline.  | [optional]
 **enableOnlinePushNotifications** | **kotlin.Boolean**| Enable mobile notification for private messages and @-mentions received when the user is online.  | [optional]
 **enableDigestEmails** | **kotlin.Boolean**| Enable digest emails when the user is away.  | [optional]
 **enableMarketingEmails** | **kotlin.Boolean**| Enable marketing emails. Has no function outside Zulip Cloud.  | [optional]
 **enableLoginEmails** | **kotlin.Boolean**| Enable email notifications for new logins to account.  | [optional]
 **messageContentInEmailNotifications** | **kotlin.Boolean**| Include the message&#39;s content in email notifications for new messages.  | [optional]
 **pmContentInDesktopNotifications** | **kotlin.Boolean**| Include content of private messages in desktop notifications.  | [optional]
 **wildcardMentionsNotify** | **kotlin.Boolean**| Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  | [optional]
 **desktopIconCountDisplay** | **kotlin.Int**| Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  | [optional] [enum: 1, 2, 3]
 **realmNameInNotifications** | **kotlin.Boolean**| Include organization name in subject of message notification emails.  | [optional]
 **presenceEnabled** | **kotlin.Boolean**| Display the presence status to other users when online.  | [optional]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> JsonSuccess updateUser(userId, fullName, role, profileData)

Update a user

Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userId : kotlin.Int = 12 // kotlin.Int | The target user's ID. 
val fullName : kotlin.String = fullName_example // kotlin.String | The user's full name. 
val role : kotlin.Int = 400 // kotlin.Int | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
val profileData : kotlin.collections.List<kotlin.Any> =  // kotlin.collections.List<kotlin.Any> | A dictionary containing the to be updated custom profile field data for the user. 
try {
    val result : JsonSuccess = apiInstance.updateUser(userId, fullName, role, profileData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.Int**| The target user&#39;s ID.  |
 **fullName** | **kotlin.String**| The user&#39;s full name.  | [optional]
 **role** | **kotlin.Int**| New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | [optional]
 **profileData** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md)| A dictionary containing the to be updated custom profile field data for the user.  | [optional]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUserGroup"></a>
# **updateUserGroup**
> JsonSuccess updateUserGroup(userGroupId, name, description)

Update a user group

Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userGroupId : kotlin.Int = 1 // kotlin.Int | The ID of the target user group. 
val name : kotlin.String = marketing team // kotlin.String | The new name of the group. 
val description : kotlin.String = The marketing team. // kotlin.String | The new description of the group. 
try {
    val result : JsonSuccess = apiInstance.updateUserGroup(userGroupId, name, description)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateUserGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateUserGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **kotlin.Int**| The ID of the target user group.  |
 **name** | **kotlin.String**| The new name of the group.  |
 **description** | **kotlin.String**| The new description of the group.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUserGroupMembers"></a>
# **updateUserGroupMembers**
> JsonSuccess updateUserGroupMembers(userGroupId, delete, add)

Update user group members

Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userGroupId : kotlin.Int = 1 // kotlin.Int | The ID of the target user group. 
val delete : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | The list of user ids to be removed from the user group. 
val add : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | The list of user ids to be added to the user group. 
try {
    val result : JsonSuccess = apiInstance.updateUserGroupMembers(userGroupId, delete, add)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateUserGroupMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateUserGroupMembers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **kotlin.Int**| The ID of the target user group.  |
 **delete** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| The list of user ids to be removed from the user group.  | [optional]
 **add** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| The list of user ids to be added to the user group.  | [optional]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

