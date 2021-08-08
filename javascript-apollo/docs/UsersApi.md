# ZulipRestApi.UsersApi

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



## createUser

> JsonSuccessBase createUser(email, password, fullName)

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let email = username@example.com; // String | The email address of the new user. 
let password = abcd1234; // String | The password of the new user. 
let fullName = New User; // String | The full name of the new user. 
apiInstance.createUser(email, password, fullName, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## createUserGroup

> JsonSuccess createUserGroup(name, description, members)

Create a user group

Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let name = marketing; // String | The name of the user group. 
let description = The marketing team.; // String | The description of the user group. 
let members = [null]; // [Number] | An array containing the user IDs of the initial members for the new user group. 
apiInstance.createUserGroup(name, description, members, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the user group.  | 
 **description** | **String**| The description of the user group.  | 
 **members** | [**[Number]**](Number.md)| An array containing the user IDs of the initial members for the new user group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deactivateOwnUser

> JsonSuccess deactivateOwnUser()

Deactivate own user

Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
apiInstance.deactivateOwnUser((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## deactivateUser

> JsonSuccess deactivateUser(userId)

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let userId = 12; // Number | The target user's ID. 
apiInstance.deactivateUser(userId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Number**| The target user&#39;s ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAttachments

> JsonSuccessBase getAttachments()

Get attachments

Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
apiInstance.getAttachments((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## getOwnUser

> JsonSuccessBase getOwnUser()

Get own user

Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
apiInstance.getOwnUser((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## getUser

> JsonSuccessBase getUser(userId, opts)

Get a user

Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let userId = 12; // Number | The target user's ID. 
let opts = {
  'clientGravatar': true, // Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  'includeCustomProfileFields': true // Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
};
apiInstance.getUser(userId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Number**| The target user&#39;s ID.  | 
 **clientGravatar** | **Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getUserByEmail

> JsonSuccessBase getUserByEmail(email, opts)

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let email = iago@zulip.com; // String | The email address of the user whose details you want to fetch. 
let opts = {
  'clientGravatar': true, // Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  'includeCustomProfileFields': true // Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
};
apiInstance.getUserByEmail(email, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| The email address of the user whose details you want to fetch.  | 
 **clientGravatar** | **Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getUserGroups

> JsonSuccessBase getUserGroups()

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
apiInstance.getUserGroups((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## getUserPresence

> JsonSuccessBase getUserPresence(userIdOrEmail)

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let userIdOrEmail = iago@zulip.com; // String | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 
apiInstance.getUserPresence(userIdOrEmail, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## getUsers

> JsonSuccessBase getUsers(opts)

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let opts = {
  'clientGravatar': true, // Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  'includeCustomProfileFields': true // Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
};
apiInstance.getUsers(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGravatar** | **Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## muteUser

> JsonSuccess muteUser(mutedUserId)

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let mutedUserId = 10; // Number | The ID of the user to mute/un-mute. 
apiInstance.muteUser(mutedUserId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutedUserId** | **Number**| The ID of the user to mute/un-mute.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## reactivateUser

> AnyType reactivateUser(userId)

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let userId = 12; // Number | The target user's ID. 
apiInstance.reactivateUser(userId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Number**| The target user&#39;s ID.  | 

### Return type

[**AnyType**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## removeUserGroup

> JsonSuccess removeUserGroup(userGroupId)

Delete a user group

Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let userGroupId = 1; // Number | The ID of the target user group. 
apiInstance.removeUserGroup(userGroupId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **Number**| The ID of the target user group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## setTypingStatus

> JsonSuccess setTypingStatus(op, to, opts)

Set \&quot;typing\&quot; status

Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let op = start; // String | Whether the user has started (`start`) or stopped (`stop`) to type. 
let to = [null]; // [Number] | For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
let opts = {
  'type': private, // String | Type of the message being composed. 
  'topic': typing notifications // String | Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. 
};
apiInstance.setTypingStatus(op, to, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | **String**| Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type.  | 
 **to** | [**[Number]**](Number.md)| For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  | 
 **type** | **String**| Type of the message being composed.  | [optional] [default to &#39;private&#39;]
 **topic** | **String**| Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## unmuteUser

> JsonSuccess unmuteUser(mutedUserId)

Unmute a user

This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let mutedUserId = 10; // Number | The ID of the user to mute/un-mute. 
apiInstance.unmuteUser(mutedUserId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutedUserId** | **Number**| The ID of the user to mute/un-mute.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateDisplaySettings

> JsonSuccessBase updateDisplaySettings(opts)

Update display settings

This endpoint is used to edit the current user&#39;s user interface settings.  &#x60;PATCH {{ api_url }}/v1/settings/display&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let opts = {
  'twentyFourHourTime': true, // Boolean | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format). 
  'denseMode': true, // Boolean | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip. 
  'starredMessageCounts': true, // Boolean | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages). 
  'fluidLayoutWidth': true, // Boolean | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens. 
  'highContrastMode': true, // Boolean | This setting is reserved for use to control variations in Zulip's design to help visually impaired users. 
  'colorScheme': 56, // Number | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query. 
  'translateEmoticons': true, // Boolean | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends. 
  'defaultLanguage': en, // String | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
  'defaultView': all_messages, // String | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
  'leftSideUserlist': true, // Boolean | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked. 
  'emojiset': google, // String | The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
  'demoteInactiveStreams': 56, // Number | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never 
  'timezone': Asia/Kolkata // String | The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
};
apiInstance.updateDisplaySettings(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **twentyFourHourTime** | **Boolean**| Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  | [optional] 
 **denseMode** | **Boolean**| This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  | [optional] 
 **starredMessageCounts** | **Boolean**| Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  | [optional] 
 **fluidLayoutWidth** | **Boolean**| Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  | [optional] 
 **highContrastMode** | **Boolean**| This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  | [optional] 
 **colorScheme** | **Number**| Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  | [optional] 
 **translateEmoticons** | **Boolean**| Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  | [optional] 
 **defaultLanguage** | **String**| What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | [optional] 
 **defaultView** | **String**| The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **leftSideUserlist** | **Boolean**| Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  | [optional] 
 **emojiset** | **String**| The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **demoteInactiveStreams** | **Number**| Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  | [optional] 
 **timezone** | **String**| The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateNotificationSettings

> JsonSuccessBase updateNotificationSettings(opts)

Update notification settings

This endpoint is used to edit the user&#39;s global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  &#x60;PATCH {{ api_url }}/v1/settings/notifications&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let opts = {
  'enableStreamDesktopNotifications': true, // Boolean | Enable visual desktop notifications for stream messages. 
  'enableStreamEmailNotifications': true, // Boolean | Enable email notifications for stream messages. 
  'enableStreamPushNotifications': true, // Boolean | Enable mobile notifications for stream messages. 
  'enableStreamAudibleNotifications': true, // Boolean | Enable audible desktop notifications for stream messages. 
  'notificationSound': ding, // String | Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
  'enableDesktopNotifications': true, // Boolean | Enable visual desktop notifications for private messages and @-mentions. 
  'enableSounds': true, // Boolean | Enable audible desktop notifications for private messages and @-mentions. 
  'enableOfflineEmailNotifications': true, // Boolean | Enable email notifications for private messages and @-mentions received when the user is offline. 
  'enableOfflinePushNotifications': true, // Boolean | Enable mobile notification for private messages and @-mentions received when the user is offline. 
  'enableOnlinePushNotifications': true, // Boolean | Enable mobile notification for private messages and @-mentions received when the user is online. 
  'enableDigestEmails': true, // Boolean | Enable digest emails when the user is away. 
  'enableMarketingEmails': true, // Boolean | Enable marketing emails. Has no function outside Zulip Cloud. 
  'enableLoginEmails': true, // Boolean | Enable email notifications for new logins to account. 
  'messageContentInEmailNotifications': true, // Boolean | Include the message's content in email notifications for new messages. 
  'pmContentInDesktopNotifications': true, // Boolean | Include content of private messages in desktop notifications. 
  'wildcardMentionsNotify': true, // Boolean | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention. 
  'desktopIconCountDisplay': 56, // Number | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None 
  'realmNameInNotifications': true, // Boolean | Include organization name in subject of message notification emails. 
  'presenceEnabled': true // Boolean | Display the presence status to other users when online. 
};
apiInstance.updateNotificationSettings(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enableStreamDesktopNotifications** | **Boolean**| Enable visual desktop notifications for stream messages.  | [optional] 
 **enableStreamEmailNotifications** | **Boolean**| Enable email notifications for stream messages.  | [optional] 
 **enableStreamPushNotifications** | **Boolean**| Enable mobile notifications for stream messages.  | [optional] 
 **enableStreamAudibleNotifications** | **Boolean**| Enable audible desktop notifications for stream messages.  | [optional] 
 **notificationSound** | **String**| Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | [optional] 
 **enableDesktopNotifications** | **Boolean**| Enable visual desktop notifications for private messages and @-mentions.  | [optional] 
 **enableSounds** | **Boolean**| Enable audible desktop notifications for private messages and @-mentions.  | [optional] 
 **enableOfflineEmailNotifications** | **Boolean**| Enable email notifications for private messages and @-mentions received when the user is offline.  | [optional] 
 **enableOfflinePushNotifications** | **Boolean**| Enable mobile notification for private messages and @-mentions received when the user is offline.  | [optional] 
 **enableOnlinePushNotifications** | **Boolean**| Enable mobile notification for private messages and @-mentions received when the user is online.  | [optional] 
 **enableDigestEmails** | **Boolean**| Enable digest emails when the user is away.  | [optional] 
 **enableMarketingEmails** | **Boolean**| Enable marketing emails. Has no function outside Zulip Cloud.  | [optional] 
 **enableLoginEmails** | **Boolean**| Enable email notifications for new logins to account.  | [optional] 
 **messageContentInEmailNotifications** | **Boolean**| Include the message&#39;s content in email notifications for new messages.  | [optional] 
 **pmContentInDesktopNotifications** | **Boolean**| Include content of private messages in desktop notifications.  | [optional] 
 **wildcardMentionsNotify** | **Boolean**| Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  | [optional] 
 **desktopIconCountDisplay** | **Number**| Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  | [optional] 
 **realmNameInNotifications** | **Boolean**| Include organization name in subject of message notification emails.  | [optional] 
 **presenceEnabled** | **Boolean**| Display the presence status to other users when online.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateUser

> JsonSuccess updateUser(userId, opts)

Update a user

Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let userId = 12; // Number | The target user's ID. 
let opts = {
  'fullName': "fullName_example", // String | The user's full name. 
  'role': 400, // Number | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
  'profileData': [null] // [Object] | A dictionary containing the to be updated custom profile field data for the user. 
};
apiInstance.updateUser(userId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Number**| The target user&#39;s ID.  | 
 **fullName** | **String**| The user&#39;s full name.  | [optional] 
 **role** | **Number**| New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | [optional] 
 **profileData** | [**[Object]**](Object.md)| A dictionary containing the to be updated custom profile field data for the user.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateUserGroup

> JsonSuccess updateUserGroup(userGroupId, name, description)

Update a user group

Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let userGroupId = 1; // Number | The ID of the target user group. 
let name = marketing team; // String | The new name of the group. 
let description = The marketing team.; // String | The new description of the group. 
apiInstance.updateUserGroup(userGroupId, name, description, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **Number**| The ID of the target user group.  | 
 **name** | **String**| The new name of the group.  | 
 **description** | **String**| The new description of the group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateUserGroupMembers

> JsonSuccess updateUserGroupMembers(userGroupId, opts)

Update user group members

Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.UsersApi();
let userGroupId = 1; // Number | The ID of the target user group. 
let opts = {
  '_delete': [null], // [Number] | The list of user ids to be removed from the user group. 
  'add': [null] // [Number] | The list of user ids to be added to the user group. 
};
apiInstance.updateUserGroupMembers(userGroupId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **Number**| The ID of the target user group.  | 
 **_delete** | [**[Number]**](Number.md)| The list of user ids to be removed from the user group.  | [optional] 
 **add** | [**[Number]**](Number.md)| The list of user ids to be added to the user group.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

