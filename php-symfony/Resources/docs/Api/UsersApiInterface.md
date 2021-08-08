# OpenAPI\Server\Api\UsersApiInterface

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UsersApiInterface.md#createUser) | **POST** /users | Create a user
[**createUserGroup**](UsersApiInterface.md#createUserGroup) | **POST** /user_groups/create | Create a user group
[**deactivateOwnUser**](UsersApiInterface.md#deactivateOwnUser) | **DELETE** /users/me | Deactivate own user
[**deactivateUser**](UsersApiInterface.md#deactivateUser) | **DELETE** /users/{user_id} | Deactivate a user
[**getAttachments**](UsersApiInterface.md#getAttachments) | **GET** /attachments | Get attachments
[**getOwnUser**](UsersApiInterface.md#getOwnUser) | **GET** /users/me | Get own user
[**getUser**](UsersApiInterface.md#getUser) | **GET** /users/{user_id} | Get a user
[**getUserByEmail**](UsersApiInterface.md#getUserByEmail) | **GET** /users/{email} | Get a user by email
[**getUserGroups**](UsersApiInterface.md#getUserGroups) | **GET** /user_groups | Get user groups
[**getUserPresence**](UsersApiInterface.md#getUserPresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
[**getUsers**](UsersApiInterface.md#getUsers) | **GET** /users | Get all users
[**muteUser**](UsersApiInterface.md#muteUser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
[**reactivateUser**](UsersApiInterface.md#reactivateUser) | **POST** /users/{user_id}/reactivate | Reactivate a user
[**removeUserGroup**](UsersApiInterface.md#removeUserGroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
[**setTypingStatus**](UsersApiInterface.md#setTypingStatus) | **POST** /typing | Set \&quot;typing\&quot; status
[**unmuteUser**](UsersApiInterface.md#unmuteUser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
[**updateSettings**](UsersApiInterface.md#updateSettings) | **PATCH** /settings | Update settings
[**updateStatus**](UsersApiInterface.md#updateStatus) | **POST** /users/me/status | Update your status
[**updateUser**](UsersApiInterface.md#updateUser) | **PATCH** /users/{user_id} | Update a user
[**updateUserGroup**](UsersApiInterface.md#updateUserGroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**updateUserGroupMembers**](UsersApiInterface.md#updateUserGroupMembers) | **POST** /user_groups/{user_group_id}/members | Update user group members


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.users:
        class: Acme\MyBundle\Api\UsersApi
        tags:
            - { name: "open_api_server.api", api: "users" }
    # ...
```

## **createUser**
> JsonSuccessBase createUser($email, $password, $fullName)

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#createUser
     */
    public function createUser($email, $password, $fullName)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| The email address of the new user. |
 **password** | **string**| The password of the new user. |
 **fullName** | **string**| The full name of the new user. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createUserGroup**
> JsonSuccess createUserGroup($name, $description, $members)

Create a user group

Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#createUserGroup
     */
    public function createUserGroup($name, $description, array $members)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| The name of the user group. |
 **description** | **string**| The description of the user group. |
 **members** | [**int**](../Model/int.md)| An array containing the user IDs of the initial members for the new user group. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deactivateOwnUser**
> JsonSuccess deactivateOwnUser()

Deactivate own user

Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#deactivateOwnUser
     */
    public function deactivateOwnUser()
    {
        // Implement the operation ...
    }

    // ...
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deactivateUser**
> JsonSuccess deactivateUser($userId)

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#deactivateUser
     */
    public function deactivateUser($userId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **int**| The target user&#39;s ID. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAttachments**
> JsonSuccessBase getAttachments()

Get attachments

Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#getAttachments
     */
    public function getAttachments()
    {
        // Implement the operation ...
    }

    // ...
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getOwnUser**
> JsonSuccessBase getOwnUser()

Get own user

Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#getOwnUser
     */
    public function getOwnUser()
    {
        // Implement the operation ...
    }

    // ...
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getUser**
> JsonSuccessBase getUser($userId, $clientGravatar, $includeCustomProfileFields)

Get a user

Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).*

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#getUser
     */
    public function getUser($userId, $clientGravatar = 'false', $includeCustomProfileFields = 'false')
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **int**| The target user&#39;s ID. |
 **clientGravatar** | **bool**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. | [optional] [default to false]
 **includeCustomProfileFields** | **bool**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getUserByEmail**
> JsonSuccessBase getUserByEmail($email, $clientGravatar, $includeCustomProfileFields)

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).*

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#getUserByEmail
     */
    public function getUserByEmail($email, $clientGravatar = 'false', $includeCustomProfileFields = 'false')
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| The email address of the user whose details you want to fetch. |
 **clientGravatar** | **bool**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. | [optional] [default to false]
 **includeCustomProfileFields** | **bool**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getUserGroups**
> JsonSuccessBase getUserGroups()

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#getUserGroups
     */
    public function getUserGroups()
    {
        // Implement the operation ...
    }

    // ...
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getUserPresence**
> JsonSuccessBase getUserPresence($userIdOrEmail)

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#getUserPresence
     */
    public function getUserPresence($userIdOrEmail)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIdOrEmail** | **string**| The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getUsers**
> JsonSuccessBase getUsers($clientGravatar, $includeCustomProfileFields)

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#getUsers
     */
    public function getUsers($clientGravatar = 'false', $includeCustomProfileFields = 'false')
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGravatar** | **bool**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. | [optional] [default to false]
 **includeCustomProfileFields** | **bool**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **muteUser**
> JsonSuccess muteUser($mutedUserId)

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#muteUser
     */
    public function muteUser($mutedUserId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutedUserId** | **int**| The ID of the user to mute/un-mute. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **reactivateUser**
> AnyType reactivateUser($userId)

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#reactivateUser
     */
    public function reactivateUser($userId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **int**| The target user&#39;s ID. |

### Return type

[**AnyType**](../Model/AnyType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **removeUserGroup**
> JsonSuccess removeUserGroup($userGroupId)

Delete a user group

Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#removeUserGroup
     */
    public function removeUserGroup($userGroupId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **int**| The ID of the target user group. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **setTypingStatus**
> JsonSuccess setTypingStatus($op, $to, $type, $topic)

Set \"typing\" status

Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#setTypingStatus
     */
    public function setTypingStatus($op, array $to, $type = ''private'', $topic = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | **string**| Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type. |
 **to** | [**int**](../Model/int.md)| For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). |
 **type** | **string**| Type of the message being composed. | [optional] [default to &#39;private&#39;]
 **topic** | **string**| Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type. | [optional]

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **unmuteUser**
> JsonSuccess unmuteUser($mutedUserId)

Unmute a user

This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#unmuteUser
     */
    public function unmuteUser($mutedUserId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutedUserId** | **int**| The ID of the user to mute/un-mute. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateSettings**
> JsonSuccessBase updateSettings($fullName, $email, $oldPassword, $newPassword, $twentyFourHourTime, $denseMode, $starredMessageCounts, $fluidLayoutWidth, $highContrastMode, $colorScheme, $enableDraftsSynchronization, $translateEmoticons, $defaultLanguage, $defaultView, $leftSideUserlist, $emojiset, $demoteInactiveStreams, $timezone, $enableStreamDesktopNotifications, $enableStreamEmailNotifications, $enableStreamPushNotifications, $enableStreamAudibleNotifications, $notificationSound, $enableDesktopNotifications, $enableSounds, $emailNotificationsBatchingPeriodSeconds, $enableOfflineEmailNotifications, $enableOfflinePushNotifications, $enableOnlinePushNotifications, $enableDigestEmails, $enableMarketingEmails, $enableLoginEmails, $messageContentInEmailNotifications, $pmContentInDesktopNotifications, $wildcardMentionsNotify, $desktopIconCountDisplay, $realmNameInNotifications, $presenceEnabled, $enterSends)

Update settings

This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#updateSettings
     */
    public function updateSettings($fullName = null, $email = null, $oldPassword = null, $newPassword = null, $twentyFourHourTime = null, $denseMode = null, $starredMessageCounts = null, $fluidLayoutWidth = null, $highContrastMode = null, $colorScheme = null, $enableDraftsSynchronization = null, $translateEmoticons = null, $defaultLanguage = null, $defaultView = null, $leftSideUserlist = null, $emojiset = null, $demoteInactiveStreams = null, $timezone = null, $enableStreamDesktopNotifications = null, $enableStreamEmailNotifications = null, $enableStreamPushNotifications = null, $enableStreamAudibleNotifications = null, $notificationSound = null, $enableDesktopNotifications = null, $enableSounds = null, $emailNotificationsBatchingPeriodSeconds = null, $enableOfflineEmailNotifications = null, $enableOfflinePushNotifications = null, $enableOnlinePushNotifications = null, $enableDigestEmails = null, $enableMarketingEmails = null, $enableLoginEmails = null, $messageContentInEmailNotifications = null, $pmContentInDesktopNotifications = null, $wildcardMentionsNotify = null, $desktopIconCountDisplay = null, $realmNameInNotifications = null, $presenceEnabled = null, $enterSends = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullName** | **string**| A new display name for the user. | [optional]
 **email** | **string**| Asks the server to initiate a confirmation sequence to change the user&#39;s email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. | [optional]
 **oldPassword** | **string**| The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the &#x60;new_password&#x60; parameter. | [optional]
 **newPassword** | **string**| The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).  The &#x60;old_password&#x60; parameter must be included in the request. | [optional]
 **twentyFourHourTime** | **bool**| Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. | [optional]
 **denseMode** | **bool**| This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. | [optional]
 **starredMessageCounts** | **bool**| Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. | [optional]
 **fluidLayoutWidth** | **bool**| Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. | [optional]
 **highContrastMode** | **bool**| This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. | [optional]
 **colorScheme** | **int**| Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. | [optional]
 **enableDraftsSynchronization** | **bool**| A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). | [optional]
 **translateEmoticons** | **bool**| Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. | [optional]
 **defaultLanguage** | **string**| What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). | [optional]
 **defaultView** | **string**| The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). | [optional]
 **leftSideUserlist** | **bool**| Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. | [optional]
 **emojiset** | **string**| The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). | [optional]
 **demoteInactiveStreams** | **int**| Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint. | [optional]
 **timezone** | **string**| The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). | [optional]
 **enableStreamDesktopNotifications** | **bool**| Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **enableStreamEmailNotifications** | **bool**| Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **enableStreamPushNotifications** | **bool**| Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **enableStreamAudibleNotifications** | **bool**| Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **notificationSound** | **string**| Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). | [optional]
 **enableDesktopNotifications** | **bool**| Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **enableSounds** | **bool**| Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **emailNotificationsBatchingPeriodSeconds** | **int**| The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) | [optional]
 **enableOfflineEmailNotifications** | **bool**| Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **enableOfflinePushNotifications** | **bool**| Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **enableOnlinePushNotifications** | **bool**| Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **enableDigestEmails** | **bool**| Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **enableMarketingEmails** | **bool**| Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **enableLoginEmails** | **bool**| Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **messageContentInEmailNotifications** | **bool**| Include the message&#39;s content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **pmContentInDesktopNotifications** | **bool**| Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **wildcardMentionsNotify** | **bool**| Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **desktopIconCountDisplay** | **int**| Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **realmNameInNotifications** | **bool**| Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **presenceEnabled** | **bool**| Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint. | [optional]
 **enterSends** | **bool**| Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the &#x60;POST /users/me/enter-sends&#x60; endpoint, with the same parameter format. | [optional]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateStatus**
> JsonSuccess updateStatus($statusText, $away, $emojiName, $emojiCode, $reactionType)

Update your status

Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#updateStatus
     */
    public function updateStatus($statusText = null, $away = null, $emojiName = null, $emojiCode = null, $reactionType = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusText** | **string**| The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters. | [optional]
 **away** | **bool**| Whether the user should be marked as \&quot;away\&quot;. | [optional]
 **emojiName** | **string**| The name for the emoji to associate with this status. | [optional]
 **emojiCode** | **string**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. | [optional]
 **reactionType** | **string**| One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. | [optional]

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateUser**
> JsonSuccess updateUser($userId, $fullName, $role, $profileData)

Update a user

Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#updateUser
     */
    public function updateUser($userId, $fullName = null, $role = null, array $profileData = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **int**| The target user&#39;s ID. |
 **fullName** | **string**| The user&#39;s full name. | [optional]
 **role** | **int**| New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). | [optional]
 **profileData** | [**array**](../Model/array.md)| A dictionary containing the to be updated custom profile field data for the user. | [optional]

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateUserGroup**
> JsonSuccess updateUserGroup($userGroupId, $name, $description)

Update a user group

Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#updateUserGroup
     */
    public function updateUserGroup($userGroupId, $name, $description)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **int**| The ID of the target user group. |
 **name** | **string**| The new name of the group. |
 **description** | **string**| The new description of the group. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateUserGroupMembers**
> JsonSuccess updateUserGroupMembers($userGroupId, $delete, $add)

Update user group members

Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#updateUserGroupMembers
     */
    public function updateUserGroupMembers($userGroupId, array $delete = null, array $add = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **int**| The ID of the target user group. |
 **delete** | [**int**](../Model/int.md)| The list of user ids to be removed from the user group. | [optional]
 **add** | [**int**](../Model/int.md)| The list of user ids to be added to the user group. | [optional]

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

