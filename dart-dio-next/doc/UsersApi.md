# openapi.api.UsersApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UsersApi.md#createuser) | **POST** /users | Create a user
[**createUserGroup**](UsersApi.md#createusergroup) | **POST** /user_groups/create | Create a user group
[**deactivateOwnUser**](UsersApi.md#deactivateownuser) | **DELETE** /users/me | Deactivate own user
[**deactivateUser**](UsersApi.md#deactivateuser) | **DELETE** /users/{user_id} | Deactivate a user
[**getAttachments**](UsersApi.md#getattachments) | **GET** /attachments | Get attachments
[**getOwnUser**](UsersApi.md#getownuser) | **GET** /users/me | Get own user
[**getUser**](UsersApi.md#getuser) | **GET** /users/{user_id} | Get a user
[**getUserByEmail**](UsersApi.md#getuserbyemail) | **GET** /users/{email} | Get a user by email
[**getUserGroups**](UsersApi.md#getusergroups) | **GET** /user_groups | Get user groups
[**getUserPresence**](UsersApi.md#getuserpresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
[**getUsers**](UsersApi.md#getusers) | **GET** /users | Get all users
[**muteUser**](UsersApi.md#muteuser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
[**reactivateUser**](UsersApi.md#reactivateuser) | **POST** /users/{user_id}/reactivate | Reactivate a user
[**removeUserGroup**](UsersApi.md#removeusergroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
[**setTypingStatus**](UsersApi.md#settypingstatus) | **POST** /typing | Set \&quot;typing\&quot; status
[**unmuteUser**](UsersApi.md#unmuteuser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
[**updateDisplaySettings**](UsersApi.md#updatedisplaysettings) | **PATCH** /settings/display | Update display settings
[**updateNotificationSettings**](UsersApi.md#updatenotificationsettings) | **PATCH** /settings/notifications | Update notification settings
[**updateUser**](UsersApi.md#updateuser) | **PATCH** /users/{user_id} | Update a user
[**updateUserGroup**](UsersApi.md#updateusergroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**updateUserGroupMembers**](UsersApi.md#updateusergroupmembers) | **POST** /user_groups/{user_group_id}/members | Update user group members


# **createUser**
> JsonSuccessBase createUser(email, password, fullName)

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final String email = username@example.com; // String | The email address of the new user. 
final String password = abcd1234; // String | The password of the new user. 
final String fullName = New User; // String | The full name of the new user. 

try { 
    final response = api.createUser(email, password, fullName);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->createUser: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| The email address of the new user.  | 
 **password** | **String**| The password of the new user.  | 
 **fullName** | **String**| The full name of the new user.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createUserGroup**
> JsonSuccess createUserGroup(name, description, members)

Create a user group

Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final String name = marketing; // String | The name of the user group. 
final String description = The marketing team.; // String | The description of the user group. 
final BuiltList<int> members = ; // BuiltList<int> | An array containing the user IDs of the initial members for the new user group. 

try { 
    final response = api.createUserGroup(name, description, members);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->createUserGroup: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the user group.  | 
 **description** | **String**| The description of the user group.  | 
 **members** | [**BuiltList&lt;int&gt;**](int.md)| An array containing the user IDs of the initial members for the new user group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivateOwnUser**
> JsonSuccess deactivateOwnUser()

Deactivate own user

Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();

try { 
    final response = api.deactivateOwnUser();
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->deactivateOwnUser: $e\n');
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
> JsonSuccess deactivateUser(userId)

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final int userId = 12; // int | The target user's ID. 

try { 
    final response = api.deactivateUser(userId);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->deactivateUser: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **int**| The target user's ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAttachments**
> JsonSuccessBase getAttachments()

Get attachments

Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();

try { 
    final response = api.getAttachments();
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->getAttachments: $e\n');
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
> JsonSuccessBase getOwnUser()

Get own user

Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();

try { 
    final response = api.getOwnUser();
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->getOwnUser: $e\n');
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
> JsonSuccessBase getUser(userId, clientGravatar, includeCustomProfileFields)

Get a user

Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final int userId = 12; // int | The target user's ID. 
final bool clientGravatar = true; // bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
final bool includeCustomProfileFields = true; // bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 

try { 
    final response = api.getUser(userId, clientGravatar, includeCustomProfileFields);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->getUser: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **int**| The target user's ID.  | 
 **clientGravatar** | **bool**| Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **bool**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUserByEmail**
> JsonSuccessBase getUserByEmail(email, clientGravatar, includeCustomProfileFields)

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final String email = iago@zulip.com; // String | The email address of the user whose details you want to fetch. 
final bool clientGravatar = true; // bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
final bool includeCustomProfileFields = true; // bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 

try { 
    final response = api.getUserByEmail(email, clientGravatar, includeCustomProfileFields);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->getUserByEmail: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| The email address of the user whose details you want to fetch.  | 
 **clientGravatar** | **bool**| Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **bool**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUserGroups**
> JsonSuccessBase getUserGroups()

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();

try { 
    final response = api.getUserGroups();
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->getUserGroups: $e\n');
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
> JsonSuccessBase getUserPresence(userIdOrEmail)

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final String userIdOrEmail = iago@zulip.com; // String | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 

try { 
    final response = api.getUserPresence(userIdOrEmail);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->getUserPresence: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIdOrEmail** | **String**| The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUsers**
> JsonSuccessBase getUsers(clientGravatar, includeCustomProfileFields)

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final bool clientGravatar = true; // bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
final bool includeCustomProfileFields = true; // bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 

try { 
    final response = api.getUsers(clientGravatar, includeCustomProfileFields);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->getUsers: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGravatar** | **bool**| Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **bool**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **muteUser**
> JsonSuccess muteUser(mutedUserId)

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final int mutedUserId = 10; // int | The ID of the user to mute/un-mute. 

try { 
    final response = api.muteUser(mutedUserId);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->muteUser: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutedUserId** | **int**| The ID of the user to mute/un-mute.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reactivateUser**
> JsonObject reactivateUser(userId)

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final int userId = 12; // int | The target user's ID. 

try { 
    final response = api.reactivateUser(userId);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->reactivateUser: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **int**| The target user's ID.  | 

### Return type

[**JsonObject**](JsonObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **removeUserGroup**
> JsonSuccess removeUserGroup(userGroupId)

Delete a user group

Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final int userGroupId = 1; // int | The ID of the target user group. 

try { 
    final response = api.removeUserGroup(userGroupId);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->removeUserGroup: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **int**| The ID of the target user group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **setTypingStatus**
> JsonSuccess setTypingStatus(op, to, type, topic)

Set \"typing\" status

Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final String op = start; // String | Whether the user has started (`start`) or stopped (`stop`) to type. 
final BuiltList<int> to = ; // BuiltList<int> | For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
final String type = private; // String | Type of the message being composed. 
final String topic = typing notifications; // String | Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. 

try { 
    final response = api.setTypingStatus(op, to, type, topic);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->setTypingStatus: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | **String**| Whether the user has started (`start`) or stopped (`stop`) to type.  | 
 **to** | [**BuiltList&lt;int&gt;**](int.md)| For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  | 
 **type** | **String**| Type of the message being composed.  | [optional] [default to 'private']
 **topic** | **String**| Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unmuteUser**
> JsonSuccess unmuteUser(mutedUserId)

Unmute a user

This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final int mutedUserId = 10; // int | The ID of the user to mute/un-mute. 

try { 
    final response = api.unmuteUser(mutedUserId);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->unmuteUser: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutedUserId** | **int**| The ID of the user to mute/un-mute.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateDisplaySettings**
> JsonSuccessBase updateDisplaySettings(twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone)

Update display settings

This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display` 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final bool twentyFourHourTime = true; // bool | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format). 
final bool denseMode = true; // bool | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip. 
final bool starredMessageCounts = true; // bool | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages). 
final bool fluidLayoutWidth = true; // bool | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens. 
final bool highContrastMode = true; // bool | This setting is reserved for use to control variations in Zulip's design to help visually impaired users. 
final int colorScheme = 56; // int | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query. 
final bool translateEmoticons = true; // bool | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends. 
final String defaultLanguage = en; // String | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
final String defaultView = all_messages; // String | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
final bool leftSideUserlist = true; // bool | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked. 
final String emojiset = google; // String | The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
final int demoteInactiveStreams = 56; // int | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never 
final String timezone = Asia/Kolkata; // String | The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 

try { 
    final response = api.updateDisplaySettings(twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->updateDisplaySettings: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **twentyFourHourTime** | **bool**| Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  | [optional] 
 **denseMode** | **bool**| This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  | [optional] 
 **starredMessageCounts** | **bool**| Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  | [optional] 
 **fluidLayoutWidth** | **bool**| Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  | [optional] 
 **highContrastMode** | **bool**| This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  | [optional] 
 **colorScheme** | **int**| Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  | [optional] 
 **translateEmoticons** | **bool**| Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  | [optional] 
 **defaultLanguage** | **String**| What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | [optional] 
 **defaultView** | **String**| The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **leftSideUserlist** | **bool**| Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  | [optional] 
 **emojiset** | **String**| The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **demoteInactiveStreams** | **int**| Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  | [optional] 
 **timezone** | **String**| The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateNotificationSettings**
> JsonSuccessBase updateNotificationSettings(enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled)

Update notification settings

This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications` 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final bool enableStreamDesktopNotifications = true; // bool | Enable visual desktop notifications for stream messages. 
final bool enableStreamEmailNotifications = true; // bool | Enable email notifications for stream messages. 
final bool enableStreamPushNotifications = true; // bool | Enable mobile notifications for stream messages. 
final bool enableStreamAudibleNotifications = true; // bool | Enable audible desktop notifications for stream messages. 
final String notificationSound = ding; // String | Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
final bool enableDesktopNotifications = true; // bool | Enable visual desktop notifications for private messages and @-mentions. 
final bool enableSounds = true; // bool | Enable audible desktop notifications for private messages and @-mentions. 
final bool enableOfflineEmailNotifications = true; // bool | Enable email notifications for private messages and @-mentions received when the user is offline. 
final bool enableOfflinePushNotifications = true; // bool | Enable mobile notification for private messages and @-mentions received when the user is offline. 
final bool enableOnlinePushNotifications = true; // bool | Enable mobile notification for private messages and @-mentions received when the user is online. 
final bool enableDigestEmails = true; // bool | Enable digest emails when the user is away. 
final bool enableMarketingEmails = true; // bool | Enable marketing emails. Has no function outside Zulip Cloud. 
final bool enableLoginEmails = true; // bool | Enable email notifications for new logins to account. 
final bool messageContentInEmailNotifications = true; // bool | Include the message's content in email notifications for new messages. 
final bool pmContentInDesktopNotifications = true; // bool | Include content of private messages in desktop notifications. 
final bool wildcardMentionsNotify = true; // bool | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention. 
final int desktopIconCountDisplay = 56; // int | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None 
final bool realmNameInNotifications = true; // bool | Include organization name in subject of message notification emails. 
final bool presenceEnabled = true; // bool | Display the presence status to other users when online. 

try { 
    final response = api.updateNotificationSettings(enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->updateNotificationSettings: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enableStreamDesktopNotifications** | **bool**| Enable visual desktop notifications for stream messages.  | [optional] 
 **enableStreamEmailNotifications** | **bool**| Enable email notifications for stream messages.  | [optional] 
 **enableStreamPushNotifications** | **bool**| Enable mobile notifications for stream messages.  | [optional] 
 **enableStreamAudibleNotifications** | **bool**| Enable audible desktop notifications for stream messages.  | [optional] 
 **notificationSound** | **String**| Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | [optional] 
 **enableDesktopNotifications** | **bool**| Enable visual desktop notifications for private messages and @-mentions.  | [optional] 
 **enableSounds** | **bool**| Enable audible desktop notifications for private messages and @-mentions.  | [optional] 
 **enableOfflineEmailNotifications** | **bool**| Enable email notifications for private messages and @-mentions received when the user is offline.  | [optional] 
 **enableOfflinePushNotifications** | **bool**| Enable mobile notification for private messages and @-mentions received when the user is offline.  | [optional] 
 **enableOnlinePushNotifications** | **bool**| Enable mobile notification for private messages and @-mentions received when the user is online.  | [optional] 
 **enableDigestEmails** | **bool**| Enable digest emails when the user is away.  | [optional] 
 **enableMarketingEmails** | **bool**| Enable marketing emails. Has no function outside Zulip Cloud.  | [optional] 
 **enableLoginEmails** | **bool**| Enable email notifications for new logins to account.  | [optional] 
 **messageContentInEmailNotifications** | **bool**| Include the message's content in email notifications for new messages.  | [optional] 
 **pmContentInDesktopNotifications** | **bool**| Include content of private messages in desktop notifications.  | [optional] 
 **wildcardMentionsNotify** | **bool**| Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  | [optional] 
 **desktopIconCountDisplay** | **int**| Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  | [optional] 
 **realmNameInNotifications** | **bool**| Include organization name in subject of message notification emails.  | [optional] 
 **presenceEnabled** | **bool**| Display the presence status to other users when online.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateUser**
> JsonSuccess updateUser(userId, fullName, role, profileData)

Update a user

Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final int userId = 12; // int | The target user's ID. 
final String fullName = fullName_example; // String | The user's full name. 
final int role = 400; // int | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
final BuiltList<JsonObject> profileData = ; // BuiltList<JsonObject> | A dictionary containing the to be updated custom profile field data for the user. 

try { 
    final response = api.updateUser(userId, fullName, role, profileData);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->updateUser: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **int**| The target user's ID.  | 
 **fullName** | **String**| The user's full name.  | [optional] 
 **role** | **int**| New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | [optional] 
 **profileData** | [**BuiltList&lt;JsonObject&gt;**](JsonObject.md)| A dictionary containing the to be updated custom profile field data for the user.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateUserGroup**
> JsonSuccess updateUserGroup(userGroupId, name, description)

Update a user group

Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final int userGroupId = 1; // int | The ID of the target user group. 
final String name = marketing team; // String | The new name of the group. 
final String description = The marketing team.; // String | The new description of the group. 

try { 
    final response = api.updateUserGroup(userGroupId, name, description);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->updateUserGroup: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **int**| The ID of the target user group.  | 
 **name** | **String**| The new name of the group.  | 
 **description** | **String**| The new description of the group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateUserGroupMembers**
> JsonSuccess updateUserGroupMembers(userGroupId, delete, add)

Update user group members

Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 

### Example 
```dart
import 'package:openapi/api.dart';

final api = Openapi().getUsersApi();
final int userGroupId = 1; // int | The ID of the target user group. 
final BuiltList<int> delete = ; // BuiltList<int> | The list of user ids to be removed from the user group. 
final BuiltList<int> add = ; // BuiltList<int> | The list of user ids to be added to the user group. 

try { 
    final response = api.updateUserGroupMembers(userGroupId, delete, add);
    print(response);
} catch on DioError (e) {
    print('Exception when calling UsersApi->updateUserGroupMembers: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **int**| The ID of the target user group.  | 
 **delete** | [**BuiltList&lt;int&gt;**](int.md)| The list of user ids to be removed from the user group.  | [optional] 
 **add** | [**BuiltList&lt;int&gt;**](int.md)| The list of user ids to be added to the user group.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

