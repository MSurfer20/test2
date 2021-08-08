# OpenAPI\Client\UsersApi

All URIs are relative to https://example.zulipchat.com/api/v1.

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser()**](UsersApi.md#createUser) | **POST** /users | Create a user
[**createUserGroup()**](UsersApi.md#createUserGroup) | **POST** /user_groups/create | Create a user group
[**deactivateOwnUser()**](UsersApi.md#deactivateOwnUser) | **DELETE** /users/me | Deactivate own user
[**deactivateUser()**](UsersApi.md#deactivateUser) | **DELETE** /users/{user_id} | Deactivate a user
[**getAttachments()**](UsersApi.md#getAttachments) | **GET** /attachments | Get attachments
[**getOwnUser()**](UsersApi.md#getOwnUser) | **GET** /users/me | Get own user
[**getUser()**](UsersApi.md#getUser) | **GET** /users/{user_id} | Get a user
[**getUserByEmail()**](UsersApi.md#getUserByEmail) | **GET** /users/{email} | Get a user by email
[**getUserGroups()**](UsersApi.md#getUserGroups) | **GET** /user_groups | Get user groups
[**getUserPresence()**](UsersApi.md#getUserPresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
[**getUsers()**](UsersApi.md#getUsers) | **GET** /users | Get all users
[**muteUser()**](UsersApi.md#muteUser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
[**reactivateUser()**](UsersApi.md#reactivateUser) | **POST** /users/{user_id}/reactivate | Reactivate a user
[**removeUserGroup()**](UsersApi.md#removeUserGroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
[**setTypingStatus()**](UsersApi.md#setTypingStatus) | **POST** /typing | Set \&quot;typing\&quot; status
[**unmuteUser()**](UsersApi.md#unmuteUser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
[**updateDisplaySettings()**](UsersApi.md#updateDisplaySettings) | **PATCH** /settings/display | Update display settings
[**updateNotificationSettings()**](UsersApi.md#updateNotificationSettings) | **PATCH** /settings/notifications | Update notification settings
[**updateUser()**](UsersApi.md#updateUser) | **PATCH** /users/{user_id} | Update a user
[**updateUserGroup()**](UsersApi.md#updateUserGroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**updateUserGroupMembers()**](UsersApi.md#updateUserGroupMembers) | **POST** /user_groups/{user_group_id}/members | Update user group members


## `createUser()`

```php
createUser($email, $password, $full_name): JsonSuccessBase
```

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$email = username@example.com; // string | The email address of the new user.
$password = abcd1234; // string | The password of the new user.
$full_name = New User; // string | The full name of the new user.

try {
    $result = $apiInstance->createUser($email, $password, $full_name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->createUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| The email address of the new user. |
 **password** | **string**| The password of the new user. |
 **full_name** | **string**| The full name of the new user. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createUserGroup()`

```php
createUserGroup($name, $description, $members): JsonSuccess
```

Create a user group

Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$name = marketing; // string | The name of the user group.
$description = The marketing team.; // string | The description of the user group.
$members = array(56); // int[] | An array containing the user IDs of the initial members for the new user group.

try {
    $result = $apiInstance->createUserGroup($name, $description, $members);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->createUserGroup: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| The name of the user group. |
 **description** | **string**| The description of the user group. |
 **members** | [**int[]**](../Model/int.md)| An array containing the user IDs of the initial members for the new user group. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deactivateOwnUser()`

```php
deactivateOwnUser(): JsonSuccess
```

Deactivate own user

Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->deactivateOwnUser();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->deactivateOwnUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deactivateUser()`

```php
deactivateUser($user_id): JsonSuccess
```

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$user_id = 12; // int | The target user's ID.

try {
    $result = $apiInstance->deactivateUser($user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->deactivateUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| The target user&#39;s ID. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getAttachments()`

```php
getAttachments(): JsonSuccessBase
```

Get attachments

Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getAttachments();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->getAttachments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getOwnUser()`

```php
getOwnUser(): JsonSuccessBase
```

Get own user

Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getOwnUser();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->getOwnUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getUser()`

```php
getUser($user_id, $client_gravatar, $include_custom_profile_fields): JsonSuccessBase
```

Get a user

Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).*

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$user_id = 12; // int | The target user's ID.
$client_gravatar = true; // bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.
$include_custom_profile_fields = true; // bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.

try {
    $result = $apiInstance->getUser($user_id, $client_gravatar, $include_custom_profile_fields);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->getUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| The target user&#39;s ID. |
 **client_gravatar** | **bool**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. | [optional] [default to false]
 **include_custom_profile_fields** | **bool**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getUserByEmail()`

```php
getUserByEmail($email, $client_gravatar, $include_custom_profile_fields): JsonSuccessBase
```

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).*

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$email = iago@zulip.com; // string | The email address of the user whose details you want to fetch.
$client_gravatar = true; // bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.
$include_custom_profile_fields = true; // bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.

try {
    $result = $apiInstance->getUserByEmail($email, $client_gravatar, $include_custom_profile_fields);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->getUserByEmail: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| The email address of the user whose details you want to fetch. |
 **client_gravatar** | **bool**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. | [optional] [default to false]
 **include_custom_profile_fields** | **bool**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getUserGroups()`

```php
getUserGroups(): JsonSuccessBase
```

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getUserGroups();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->getUserGroups: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getUserPresence()`

```php
getUserPresence($user_id_or_email): JsonSuccessBase
```

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$user_id_or_email = iago@zulip.com; // string | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.

try {
    $result = $apiInstance->getUserPresence($user_id_or_email);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->getUserPresence: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id_or_email** | **string**| The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getUsers()`

```php
getUsers($client_gravatar, $include_custom_profile_fields): JsonSuccessBase
```

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$client_gravatar = true; // bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.
$include_custom_profile_fields = true; // bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.

try {
    $result = $apiInstance->getUsers($client_gravatar, $include_custom_profile_fields);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->getUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_gravatar** | **bool**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. | [optional] [default to false]
 **include_custom_profile_fields** | **bool**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `muteUser()`

```php
muteUser($muted_user_id): JsonSuccess
```

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$muted_user_id = 10; // int | The ID of the user to mute/un-mute.

try {
    $result = $apiInstance->muteUser($muted_user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->muteUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muted_user_id** | **int**| The ID of the user to mute/un-mute. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `reactivateUser()`

```php
reactivateUser($user_id): mixed
```

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$user_id = 12; // int | The target user's ID.

try {
    $result = $apiInstance->reactivateUser($user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->reactivateUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| The target user&#39;s ID. |

### Return type

**mixed**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `removeUserGroup()`

```php
removeUserGroup($user_group_id): JsonSuccess
```

Delete a user group

Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$user_group_id = 1; // int | The ID of the target user group.

try {
    $result = $apiInstance->removeUserGroup($user_group_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->removeUserGroup: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_group_id** | **int**| The ID of the target user group. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `setTypingStatus()`

```php
setTypingStatus($op, $to, $type, $topic): JsonSuccess
```

Set \"typing\" status

Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$op = start; // string | Whether the user has started (`start`) or stopped (`stop`) to type.
$to = array(56); // int[] | For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).
$type = private; // string | Type of the message being composed.
$topic = typing notifications; // string | Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type.

try {
    $result = $apiInstance->setTypingStatus($op, $to, $type, $topic);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->setTypingStatus: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | **string**| Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type. |
 **to** | [**int[]**](../Model/int.md)| For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). |
 **type** | **string**| Type of the message being composed. | [optional] [default to &#39;private&#39;]
 **topic** | **string**| Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type. | [optional]

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `unmuteUser()`

```php
unmuteUser($muted_user_id): JsonSuccess
```

Unmute a user

This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$muted_user_id = 10; // int | The ID of the user to mute/un-mute.

try {
    $result = $apiInstance->unmuteUser($muted_user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->unmuteUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muted_user_id** | **int**| The ID of the user to mute/un-mute. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateDisplaySettings()`

```php
updateDisplaySettings($twenty_four_hour_time, $dense_mode, $starred_message_counts, $fluid_layout_width, $high_contrast_mode, $color_scheme, $translate_emoticons, $default_language, $default_view, $left_side_userlist, $emojiset, $demote_inactive_streams, $timezone): JsonSuccessBase
```

Update display settings

This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$twenty_four_hour_time = true; // bool | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).
$dense_mode = true; // bool | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.
$starred_message_counts = true; // bool | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).
$fluid_layout_width = true; // bool | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.
$high_contrast_mode = true; // bool | This setting is reserved for use to control variations in Zulip's design to help visually impaired users.
$color_scheme = 56; // int | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.
$translate_emoticons = true; // bool | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.
$default_language = en; // string | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).
$default_view = all_messages; // string | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).
$left_side_userlist = true; // bool | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.
$emojiset = google; // string | The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).
$demote_inactive_streams = 56; // int | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never
$timezone = Asia/Kolkata; // string | The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).

try {
    $result = $apiInstance->updateDisplaySettings($twenty_four_hour_time, $dense_mode, $starred_message_counts, $fluid_layout_width, $high_contrast_mode, $color_scheme, $translate_emoticons, $default_language, $default_view, $left_side_userlist, $emojiset, $demote_inactive_streams, $timezone);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->updateDisplaySettings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **twenty_four_hour_time** | **bool**| Whether time should be [displayed in 24-hour notation](/help/change-the-time-format). | [optional]
 **dense_mode** | **bool**| This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip. | [optional]
 **starred_message_counts** | **bool**| Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages). | [optional]
 **fluid_layout_width** | **bool**| Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens. | [optional]
 **high_contrast_mode** | **bool**| This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users. | [optional]
 **color_scheme** | **int**| Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query. | [optional]
 **translate_emoticons** | **bool**| Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends. | [optional]
 **default_language** | **string**| What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). | [optional]
 **default_view** | **string**| The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). | [optional]
 **left_side_userlist** | **bool**| Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked. | [optional]
 **emojiset** | **string**| The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). | [optional]
 **demote_inactive_streams** | **int**| Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never | [optional]
 **timezone** | **string**| The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). | [optional]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateNotificationSettings()`

```php
updateNotificationSettings($enable_stream_desktop_notifications, $enable_stream_email_notifications, $enable_stream_push_notifications, $enable_stream_audible_notifications, $notification_sound, $enable_desktop_notifications, $enable_sounds, $enable_offline_email_notifications, $enable_offline_push_notifications, $enable_online_push_notifications, $enable_digest_emails, $enable_marketing_emails, $enable_login_emails, $message_content_in_email_notifications, $pm_content_in_desktop_notifications, $wildcard_mentions_notify, $desktop_icon_count_display, $realm_name_in_notifications, $presence_enabled): JsonSuccessBase
```

Update notification settings

This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$enable_stream_desktop_notifications = true; // bool | Enable visual desktop notifications for stream messages.
$enable_stream_email_notifications = true; // bool | Enable email notifications for stream messages.
$enable_stream_push_notifications = true; // bool | Enable mobile notifications for stream messages.
$enable_stream_audible_notifications = true; // bool | Enable audible desktop notifications for stream messages.
$notification_sound = ding; // string | Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).
$enable_desktop_notifications = true; // bool | Enable visual desktop notifications for private messages and @-mentions.
$enable_sounds = true; // bool | Enable audible desktop notifications for private messages and @-mentions.
$enable_offline_email_notifications = true; // bool | Enable email notifications for private messages and @-mentions received when the user is offline.
$enable_offline_push_notifications = true; // bool | Enable mobile notification for private messages and @-mentions received when the user is offline.
$enable_online_push_notifications = true; // bool | Enable mobile notification for private messages and @-mentions received when the user is online.
$enable_digest_emails = true; // bool | Enable digest emails when the user is away.
$enable_marketing_emails = true; // bool | Enable marketing emails. Has no function outside Zulip Cloud.
$enable_login_emails = true; // bool | Enable email notifications for new logins to account.
$message_content_in_email_notifications = true; // bool | Include the message's content in email notifications for new messages.
$pm_content_in_desktop_notifications = true; // bool | Include content of private messages in desktop notifications.
$wildcard_mentions_notify = true; // bool | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.
$desktop_icon_count_display = 56; // int | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None
$realm_name_in_notifications = true; // bool | Include organization name in subject of message notification emails.
$presence_enabled = true; // bool | Display the presence status to other users when online.

try {
    $result = $apiInstance->updateNotificationSettings($enable_stream_desktop_notifications, $enable_stream_email_notifications, $enable_stream_push_notifications, $enable_stream_audible_notifications, $notification_sound, $enable_desktop_notifications, $enable_sounds, $enable_offline_email_notifications, $enable_offline_push_notifications, $enable_online_push_notifications, $enable_digest_emails, $enable_marketing_emails, $enable_login_emails, $message_content_in_email_notifications, $pm_content_in_desktop_notifications, $wildcard_mentions_notify, $desktop_icon_count_display, $realm_name_in_notifications, $presence_enabled);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->updateNotificationSettings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enable_stream_desktop_notifications** | **bool**| Enable visual desktop notifications for stream messages. | [optional]
 **enable_stream_email_notifications** | **bool**| Enable email notifications for stream messages. | [optional]
 **enable_stream_push_notifications** | **bool**| Enable mobile notifications for stream messages. | [optional]
 **enable_stream_audible_notifications** | **bool**| Enable audible desktop notifications for stream messages. | [optional]
 **notification_sound** | **string**| Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). | [optional]
 **enable_desktop_notifications** | **bool**| Enable visual desktop notifications for private messages and @-mentions. | [optional]
 **enable_sounds** | **bool**| Enable audible desktop notifications for private messages and @-mentions. | [optional]
 **enable_offline_email_notifications** | **bool**| Enable email notifications for private messages and @-mentions received when the user is offline. | [optional]
 **enable_offline_push_notifications** | **bool**| Enable mobile notification for private messages and @-mentions received when the user is offline. | [optional]
 **enable_online_push_notifications** | **bool**| Enable mobile notification for private messages and @-mentions received when the user is online. | [optional]
 **enable_digest_emails** | **bool**| Enable digest emails when the user is away. | [optional]
 **enable_marketing_emails** | **bool**| Enable marketing emails. Has no function outside Zulip Cloud. | [optional]
 **enable_login_emails** | **bool**| Enable email notifications for new logins to account. | [optional]
 **message_content_in_email_notifications** | **bool**| Include the message&#39;s content in email notifications for new messages. | [optional]
 **pm_content_in_desktop_notifications** | **bool**| Include content of private messages in desktop notifications. | [optional]
 **wildcard_mentions_notify** | **bool**| Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention. | [optional]
 **desktop_icon_count_display** | **int**| Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None | [optional]
 **realm_name_in_notifications** | **bool**| Include organization name in subject of message notification emails. | [optional]
 **presence_enabled** | **bool**| Display the presence status to other users when online. | [optional]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateUser()`

```php
updateUser($user_id, $full_name, $role, $profile_data): JsonSuccess
```

Update a user

Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$user_id = 12; // int | The target user's ID.
$full_name = 'full_name_example'; // string | The user's full name.
$role = 400; // int | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).
$profile_data = array(new \stdClass); // object[] | A dictionary containing the to be updated custom profile field data for the user.

try {
    $result = $apiInstance->updateUser($user_id, $full_name, $role, $profile_data);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->updateUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| The target user&#39;s ID. |
 **full_name** | **string**| The user&#39;s full name. | [optional]
 **role** | **int**| New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). | [optional]
 **profile_data** | [**object[]**](../Model/object.md)| A dictionary containing the to be updated custom profile field data for the user. | [optional]

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateUserGroup()`

```php
updateUserGroup($user_group_id, $name, $description): JsonSuccess
```

Update a user group

Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$user_group_id = 1; // int | The ID of the target user group.
$name = marketing team; // string | The new name of the group.
$description = The marketing team.; // string | The new description of the group.

try {
    $result = $apiInstance->updateUserGroup($user_group_id, $name, $description);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->updateUserGroup: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_group_id** | **int**| The ID of the target user group. |
 **name** | **string**| The new name of the group. |
 **description** | **string**| The new description of the group. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateUserGroupMembers()`

```php
updateUserGroupMembers($user_group_id, $delete, $add): JsonSuccess
```

Update user group members

Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$user_group_id = 1; // int | The ID of the target user group.
$delete = array(56); // int[] | The list of user ids to be removed from the user group.
$add = array(56); // int[] | The list of user ids to be added to the user group.

try {
    $result = $apiInstance->updateUserGroupMembers($user_group_id, $delete, $add);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->updateUserGroupMembers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_group_id** | **int**| The ID of the target user group. |
 **delete** | [**int[]**](../Model/int.md)| The list of user ids to be removed from the user group. | [optional]
 **add** | [**int[]**](../Model/int.md)| The list of user ids to be added to the user group. | [optional]

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
