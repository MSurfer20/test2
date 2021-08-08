# UsersApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateUser**](UsersApi.md#CreateUser) | **POST** /users | Create a user
[**CreateUserGroup**](UsersApi.md#CreateUserGroup) | **POST** /user_groups/create | Create a user group
[**DeactivateOwnUser**](UsersApi.md#DeactivateOwnUser) | **DELETE** /users/me | Deactivate own user
[**DeactivateUser**](UsersApi.md#DeactivateUser) | **DELETE** /users/{user_id} | Deactivate a user
[**GetAttachments**](UsersApi.md#GetAttachments) | **GET** /attachments | Get attachments
[**GetOwnUser**](UsersApi.md#GetOwnUser) | **GET** /users/me | Get own user
[**GetUser**](UsersApi.md#GetUser) | **GET** /users/{user_id} | Get a user
[**GetUserByEmail**](UsersApi.md#GetUserByEmail) | **GET** /users/{email} | Get a user by email
[**GetUserGroups**](UsersApi.md#GetUserGroups) | **GET** /user_groups | Get user groups
[**GetUserPresence**](UsersApi.md#GetUserPresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
[**GetUsers**](UsersApi.md#GetUsers) | **GET** /users | Get all users
[**MuteUser**](UsersApi.md#MuteUser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
[**ReactivateUser**](UsersApi.md#ReactivateUser) | **POST** /users/{user_id}/reactivate | Reactivate a user
[**RemoveUserGroup**](UsersApi.md#RemoveUserGroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
[**SetTypingStatus**](UsersApi.md#SetTypingStatus) | **POST** /typing | Set \&quot;typing\&quot; status
[**UnmuteUser**](UsersApi.md#UnmuteUser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
[**UpdateSettings**](UsersApi.md#UpdateSettings) | **PATCH** /settings | Update settings
[**UpdateStatus**](UsersApi.md#UpdateStatus) | **POST** /users/me/status | Update your status
[**UpdateUser**](UsersApi.md#UpdateUser) | **PATCH** /users/{user_id} | Update a user
[**UpdateUserGroup**](UsersApi.md#UpdateUserGroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**UpdateUserGroupMembers**](UsersApi.md#UpdateUserGroupMembers) | **POST** /user_groups/{user_group_id}/members | Update user group members


# **CreateUser**
> JsonSuccessBase CreateUser(email, password, full.name)

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 

### Example
```R
library(openapi)

var.email <- 'username@example.com' # character | The email address of the new user. 
var.password <- 'abcd1234' # character | The password of the new user. 
var.full.name <- 'New User' # character | The full name of the new user. 

#Create a user
api.instance <- UsersApi$new()
result <- api.instance$CreateUser(var.email, var.password, var.full.name)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **character**| The email address of the new user.  | 
 **password** | **character**| The password of the new user.  | 
 **full.name** | **character**| The full name of the new user.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **CreateUserGroup**
> JsonSuccess CreateUserGroup(name, description, members)

Create a user group

Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 

### Example
```R
library(openapi)

var.name <- 'marketing' # character | The name of the user group. 
var.description <- 'The marketing team.' # character | The description of the user group. 
var.members <- list(123) # array[integer] | An array containing the user IDs of the initial members for the new user group. 

#Create a user group
api.instance <- UsersApi$new()
result <- api.instance$CreateUserGroup(var.name, var.description, var.members)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **character**| The name of the user group.  | 
 **description** | **character**| The description of the user group.  | 
 **members** | list( **integer** )| An array containing the user IDs of the initial members for the new user group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **DeactivateOwnUser**
> JsonSuccess DeactivateOwnUser()

Deactivate own user

Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 

### Example
```R
library(openapi)


#Deactivate own user
api.instance <- UsersApi$new()
result <- api.instance$DeactivateOwnUser()
dput(result)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **DeactivateUser**
> JsonSuccess DeactivateUser(user.id)

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 

### Example
```R
library(openapi)

var.user.id <- 12 # integer | The target user's ID. 

#Deactivate a user
api.instance <- UsersApi$new()
result <- api.instance$DeactivateUser(var.user.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user.id** | **integer**| The target user&#39;s ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |

# **GetAttachments**
> JsonSuccessBase GetAttachments()

Get attachments

Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 

### Example
```R
library(openapi)


#Get attachments
api.instance <- UsersApi$new()
result <- api.instance$GetAttachments()
dput(result)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **GetOwnUser**
> JsonSuccessBase GetOwnUser()

Get own user

Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 

### Example
```R
library(openapi)


#Get own user
api.instance <- UsersApi$new()
result <- api.instance$GetOwnUser()
dput(result)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

# **GetUser**
> JsonSuccessBase GetUser(user.id, client.gravatar=FALSE, include.custom.profile.fields=FALSE)

Get a user

Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 

### Example
```R
library(openapi)

var.user.id <- 12 # integer | The target user's ID. 
var.client.gravatar <- FALSE # character | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
var.include.custom.profile.fields <- FALSE # character | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 

#Get a user
api.instance <- UsersApi$new()
result <- api.instance$GetUser(var.user.id, client.gravatar=var.client.gravatar, include.custom.profile.fields=var.include.custom.profile.fields)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user.id** | **integer**| The target user&#39;s ID.  | 
 **client.gravatar** | **character**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to FALSE]
 **include.custom.profile.fields** | **character**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to FALSE]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **GetUserByEmail**
> JsonSuccessBase GetUserByEmail(email, client.gravatar=FALSE, include.custom.profile.fields=FALSE)

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 

### Example
```R
library(openapi)

var.email <- 'iago@zulip.com' # character | The email address of the user whose details you want to fetch. 
var.client.gravatar <- FALSE # character | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
var.include.custom.profile.fields <- FALSE # character | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 

#Get a user by email
api.instance <- UsersApi$new()
result <- api.instance$GetUserByEmail(var.email, client.gravatar=var.client.gravatar, include.custom.profile.fields=var.include.custom.profile.fields)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **character**| The email address of the user whose details you want to fetch.  | 
 **client.gravatar** | **character**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to FALSE]
 **include.custom.profile.fields** | **character**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to FALSE]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **GetUserGroups**
> JsonSuccessBase GetUserGroups()

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 

### Example
```R
library(openapi)


#Get user groups
api.instance <- UsersApi$new()
result <- api.instance$GetUserGroups()
dput(result)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **GetUserPresence**
> JsonSuccessBase GetUserPresence(user.id.or.email)

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 

### Example
```R
library(openapi)

var.user.id.or.email <- 'iago@zulip.com' # character | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 

#Get user presence
api.instance <- UsersApi$new()
result <- api.instance$GetUserPresence(var.user.id.or.email)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user.id.or.email** | **character**| The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **GetUsers**
> JsonSuccessBase GetUsers(client.gravatar=FALSE, include.custom.profile.fields=FALSE)

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 

### Example
```R
library(openapi)

var.client.gravatar <- FALSE # character | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
var.include.custom.profile.fields <- FALSE # character | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 

#Get all users
api.instance <- UsersApi$new()
result <- api.instance$GetUsers(client.gravatar=var.client.gravatar, include.custom.profile.fields=var.include.custom.profile.fields)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client.gravatar** | **character**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to FALSE]
 **include.custom.profile.fields** | **character**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to FALSE]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **MuteUser**
> JsonSuccess MuteUser(muted.user.id)

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example
```R
library(openapi)

var.muted.user.id <- 10 # integer | The ID of the user to mute/un-mute. 

#Mute a user
api.instance <- UsersApi$new()
result <- api.instance$MuteUser(var.muted.user.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muted.user.id** | **integer**| The ID of the user to mute/un-mute.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **ReactivateUser**
> AnyType ReactivateUser(user.id)

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 

### Example
```R
library(openapi)

var.user.id <- 12 # integer | The target user's ID. 

#Reactivate a user
api.instance <- UsersApi$new()
result <- api.instance$ReactivateUser(var.user.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user.id** | **integer**| The target user&#39;s ID.  | 

### Return type

[**AnyType**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

# **RemoveUserGroup**
> JsonSuccess RemoveUserGroup(user.group.id)

Delete a user group

Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 

### Example
```R
library(openapi)

var.user.group.id <- 1 # integer | The ID of the target user group. 

#Delete a user group
api.instance <- UsersApi$new()
result <- api.instance$RemoveUserGroup(var.user.group.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user.group.id** | **integer**| The ID of the target user group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **SetTypingStatus**
> JsonSuccess SetTypingStatus(op, to, type='private', topic=var.topic)

Set \"typing\" status

Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 

### Example
```R
library(openapi)

var.op <- 'start' # character | Whether the user has started (`start`) or stopped (`stop`) to type. 
var.to <- list(123) # array[integer] | For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
var.type <- 'private' # character | Type of the message being composed. 
var.topic <- 'typing notifications' # character | Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. 

#Set \"typing\" status
api.instance <- UsersApi$new()
result <- api.instance$SetTypingStatus(var.op, var.to, type=var.type, topic=var.topic)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | Enum [start, stop] | Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type.  | 
 **to** | list( **integer** )| For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  | 
 **type** | Enum [private, stream] | Type of the message being composed.  | [optional] [default to &#39;private&#39;]
 **topic** | **character**| Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **UnmuteUser**
> JsonSuccess UnmuteUser(muted.user.id)

Unmute a user

This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example
```R
library(openapi)

var.muted.user.id <- 10 # integer | The ID of the user to mute/un-mute. 

#Unmute a user
api.instance <- UsersApi$new()
result <- api.instance$UnmuteUser(var.muted.user.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muted.user.id** | **integer**| The ID of the user to mute/un-mute.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **UpdateSettings**
> JsonSuccessBase UpdateSettings(full.name=var.full.name, email=var.email, old.password=var.old.password, new.password=var.new.password, twenty.four.hour.time=var.twenty.four.hour.time, dense.mode=var.dense.mode, starred.message.counts=var.starred.message.counts, fluid.layout.width=var.fluid.layout.width, high.contrast.mode=var.high.contrast.mode, color.scheme=var.color.scheme, enable.drafts.synchronization=var.enable.drafts.synchronization, translate.emoticons=var.translate.emoticons, default.language=var.default.language, default.view=var.default.view, left.side.userlist=var.left.side.userlist, emojiset=var.emojiset, demote.inactive.streams=var.demote.inactive.streams, timezone=var.timezone, enable.stream.desktop.notifications=var.enable.stream.desktop.notifications, enable.stream.email.notifications=var.enable.stream.email.notifications, enable.stream.push.notifications=var.enable.stream.push.notifications, enable.stream.audible.notifications=var.enable.stream.audible.notifications, notification.sound=var.notification.sound, enable.desktop.notifications=var.enable.desktop.notifications, enable.sounds=var.enable.sounds, email.notifications.batching.period.seconds=var.email.notifications.batching.period.seconds, enable.offline.email.notifications=var.enable.offline.email.notifications, enable.offline.push.notifications=var.enable.offline.push.notifications, enable.online.push.notifications=var.enable.online.push.notifications, enable.digest.emails=var.enable.digest.emails, enable.marketing.emails=var.enable.marketing.emails, enable.login.emails=var.enable.login.emails, message.content.in.email.notifications=var.message.content.in.email.notifications, pm.content.in.desktop.notifications=var.pm.content.in.desktop.notifications, wildcard.mentions.notify=var.wildcard.mentions.notify, desktop.icon.count.display=var.desktop.icon.count.display, realm.name.in.notifications=var.realm.name.in.notifications, presence.enabled=var.presence.enabled, enter.sends=var.enter.sends)

Update settings

This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 

### Example
```R
library(openapi)

var.full.name <- 'NewName' # character | A new display name for the user. 
var.email <- 'newname@example.com' # character | Asks the server to initiate a confirmation sequence to change the user's email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. 
var.old.password <- 'old12345' # character | The user's old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the `new_password` parameter. 
var.new.password <- 'new12345' # character | The user's new Zulip password (or LDAP password, if LDAP authentication is in use).  The `old_password` parameter must be included in the request. 
var.twenty.four.hour.time <- 'true' # character | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
var.dense.mode <- 'true' # character | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
var.starred.message.counts <- 'true' # character | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
var.fluid.layout.width <- 'true' # character | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
var.high.contrast.mode <- 'true' # character | This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
var.color.scheme <- 56 # integer | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
var.enable.drafts.synchronization <- 'true' # character | A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). 
var.translate.emoticons <- 'true' # character | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
var.default.language <- 'en' # character | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
var.default.view <- 'all_messages' # character | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
var.left.side.userlist <- 'true' # character | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
var.emojiset <- 'google' # character | The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
var.demote.inactive.streams <- 56 # integer | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
var.timezone <- 'Asia/Kolkata' # character | The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
var.enable.stream.desktop.notifications <- 'true' # character | Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.enable.stream.email.notifications <- 'true' # character | Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.enable.stream.push.notifications <- 'true' # character | Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.enable.stream.audible.notifications <- 'true' # character | Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.notification.sound <- 'ding' # character | Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
var.enable.desktop.notifications <- 'true' # character | Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.enable.sounds <- 'true' # character | Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.email.notifications.batching.period.seconds <- 120 # integer | The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) 
var.enable.offline.email.notifications <- 'true' # character | Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.enable.offline.push.notifications <- 'true' # character | Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.enable.online.push.notifications <- 'true' # character | Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.enable.digest.emails <- 'true' # character | Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.enable.marketing.emails <- 'true' # character | Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.enable.login.emails <- 'true' # character | Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.message.content.in.email.notifications <- 'true' # character | Include the message's content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.pm.content.in.desktop.notifications <- 'true' # character | Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.wildcard.mentions.notify <- 'true' # character | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.desktop.icon.count.display <- 56 # integer | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.realm.name.in.notifications <- 'true' # character | Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.presence.enabled <- 'true' # character | Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
var.enter.sends <- 'true' # character | Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the `POST /users/me/enter-sends` endpoint, with the same parameter format. 

#Update settings
api.instance <- UsersApi$new()
result <- api.instance$UpdateSettings(full.name=var.full.name, email=var.email, old.password=var.old.password, new.password=var.new.password, twenty.four.hour.time=var.twenty.four.hour.time, dense.mode=var.dense.mode, starred.message.counts=var.starred.message.counts, fluid.layout.width=var.fluid.layout.width, high.contrast.mode=var.high.contrast.mode, color.scheme=var.color.scheme, enable.drafts.synchronization=var.enable.drafts.synchronization, translate.emoticons=var.translate.emoticons, default.language=var.default.language, default.view=var.default.view, left.side.userlist=var.left.side.userlist, emojiset=var.emojiset, demote.inactive.streams=var.demote.inactive.streams, timezone=var.timezone, enable.stream.desktop.notifications=var.enable.stream.desktop.notifications, enable.stream.email.notifications=var.enable.stream.email.notifications, enable.stream.push.notifications=var.enable.stream.push.notifications, enable.stream.audible.notifications=var.enable.stream.audible.notifications, notification.sound=var.notification.sound, enable.desktop.notifications=var.enable.desktop.notifications, enable.sounds=var.enable.sounds, email.notifications.batching.period.seconds=var.email.notifications.batching.period.seconds, enable.offline.email.notifications=var.enable.offline.email.notifications, enable.offline.push.notifications=var.enable.offline.push.notifications, enable.online.push.notifications=var.enable.online.push.notifications, enable.digest.emails=var.enable.digest.emails, enable.marketing.emails=var.enable.marketing.emails, enable.login.emails=var.enable.login.emails, message.content.in.email.notifications=var.message.content.in.email.notifications, pm.content.in.desktop.notifications=var.pm.content.in.desktop.notifications, wildcard.mentions.notify=var.wildcard.mentions.notify, desktop.icon.count.display=var.desktop.icon.count.display, realm.name.in.notifications=var.realm.name.in.notifications, presence.enabled=var.presence.enabled, enter.sends=var.enter.sends)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **full.name** | **character**| A new display name for the user.  | [optional] 
 **email** | **character**| Asks the server to initiate a confirmation sequence to change the user&#39;s email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address.  | [optional] 
 **old.password** | **character**| The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the &#x60;new_password&#x60; parameter.  | [optional] 
 **new.password** | **character**| The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).  The &#x60;old_password&#x60; parameter must be included in the request.  | [optional] 
 **twenty.four.hour.time** | **character**| Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **dense.mode** | **character**| This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **starred.message.counts** | **character**| Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **fluid.layout.width** | **character**| Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **high.contrast.mode** | **character**| This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **color.scheme** | Enum [1, 2, 3] | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **enable.drafts.synchronization** | **character**| A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87).  | [optional] 
 **translate.emoticons** | **character**| Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **default.language** | **character**| What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  | [optional] 
 **default.view** | **character**| The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] 
 **left.side.userlist** | **character**| Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **emojiset** | **character**| The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] 
 **demote.inactive.streams** | Enum [1, 2, 3] | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **timezone** | **character**| The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] 
 **enable.stream.desktop.notifications** | **character**| Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enable.stream.email.notifications** | **character**| Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enable.stream.push.notifications** | **character**| Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enable.stream.audible.notifications** | **character**| Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **notification.sound** | **character**| Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  | [optional] 
 **enable.desktop.notifications** | **character**| Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enable.sounds** | **character**| Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **email.notifications.batching.period.seconds** | **integer**| The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82)  | [optional] 
 **enable.offline.email.notifications** | **character**| Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enable.offline.push.notifications** | **character**| Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enable.online.push.notifications** | **character**| Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enable.digest.emails** | **character**| Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enable.marketing.emails** | **character**| Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enable.login.emails** | **character**| Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **message.content.in.email.notifications** | **character**| Include the message&#39;s content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **pm.content.in.desktop.notifications** | **character**| Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **wildcard.mentions.notify** | **character**| Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **desktop.icon.count.display** | Enum [1, 2, 3] | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **realm.name.in.notifications** | **character**| Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **presence.enabled** | **character**| Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enter.sends** | **character**| Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the &#x60;POST /users/me/enter-sends&#x60; endpoint, with the same parameter format.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

# **UpdateStatus**
> JsonSuccess UpdateStatus(status.text=var.status.text, away=var.away, emoji.name=var.emoji.name, emoji.code=var.emoji.code, reaction.type=var.reaction.type)

Update your status

Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 

### Example
```R
library(openapi)

var.status.text <- 'on vacation' # character | The text content of the status message. Sending the empty string will clear the user's status.  **Note**: The limit on the size of the message is 60 characters. 
var.away <- 'true' # character | Whether the user should be marked as \"away\". 
var.emoji.name <- 'car' # character | The name for the emoji to associate with this status. 
var.emoji.code <- '1f697' # character | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
var.reaction.type <- 'unicode_emoji' # character | One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 

#Update your status
api.instance <- UsersApi$new()
result <- api.instance$UpdateStatus(status.text=var.status.text, away=var.away, emoji.name=var.emoji.name, emoji.code=var.emoji.code, reaction.type=var.reaction.type)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status.text** | **character**| The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters.  | [optional] 
 **away** | **character**| Whether the user should be marked as \&quot;away\&quot;.  | [optional] 
 **emoji.name** | **character**| The name for the emoji to associate with this status.  | [optional] 
 **emoji.code** | **character**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji.  | [optional] 
 **reaction.type** | **character**| One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Success. |  -  |

# **UpdateUser**
> JsonSuccess UpdateUser(user.id, full.name=var.full.name, role=var.role, profile.data=var.profile.data)

Update a user

Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 

### Example
```R
library(openapi)

var.user.id <- 12 # integer | The target user's ID. 
var.full.name <- 'full.name_example' # character | The user's full name. 
var.role <- 400 # integer | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
var.profile.data <- list(123) # array[object] | A dictionary containing the to be updated custom profile field data for the user. 

#Update a user
api.instance <- UsersApi$new()
result <- api.instance$UpdateUser(var.user.id, full.name=var.full.name, role=var.role, profile.data=var.profile.data)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user.id** | **integer**| The target user&#39;s ID.  | 
 **full.name** | **character**| The user&#39;s full name.  | [optional] 
 **role** | **integer**| New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | [optional] 
 **profile.data** | list( **object** )| A dictionary containing the to be updated custom profile field data for the user.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **UpdateUserGroup**
> JsonSuccess UpdateUserGroup(user.group.id, name, description)

Update a user group

Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 

### Example
```R
library(openapi)

var.user.group.id <- 1 # integer | The ID of the target user group. 
var.name <- 'marketing team' # character | The new name of the group. 
var.description <- 'The marketing team.' # character | The new description of the group. 

#Update a user group
api.instance <- UsersApi$new()
result <- api.instance$UpdateUserGroup(var.user.group.id, var.name, var.description)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user.group.id** | **integer**| The ID of the target user group.  | 
 **name** | **character**| The new name of the group.  | 
 **description** | **character**| The new description of the group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **UpdateUserGroupMembers**
> JsonSuccess UpdateUserGroupMembers(user.group.id, delete=var.delete, add=var.add)

Update user group members

Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 

### Example
```R
library(openapi)

var.user.group.id <- 1 # integer | The ID of the target user group. 
var.delete <- list(123) # array[integer] | The list of user ids to be removed from the user group. 
var.add <- list(123) # array[integer] | The list of user ids to be added to the user group. 

#Update user group members
api.instance <- UsersApi$new()
result <- api.instance$UpdateUserGroupMembers(var.user.group.id, delete=var.delete, add=var.add)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user.group.id** | **integer**| The ID of the target user group.  | 
 **delete** | list( **integer** )| The list of user ids to be removed from the user group.  | [optional] 
 **add** | list( **integer** )| The list of user ids to be added to the user group.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

