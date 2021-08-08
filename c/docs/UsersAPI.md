# UsersAPI

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UsersAPI_createUser**](UsersAPI.md#UsersAPI_createUser) | **POST** /users | Create a user
[**UsersAPI_createUserGroup**](UsersAPI.md#UsersAPI_createUserGroup) | **POST** /user_groups/create | Create a user group
[**UsersAPI_deactivateOwnUser**](UsersAPI.md#UsersAPI_deactivateOwnUser) | **DELETE** /users/me | Deactivate own user
[**UsersAPI_deactivateUser**](UsersAPI.md#UsersAPI_deactivateUser) | **DELETE** /users/{user_id} | Deactivate a user
[**UsersAPI_getAttachments**](UsersAPI.md#UsersAPI_getAttachments) | **GET** /attachments | Get attachments
[**UsersAPI_getOwnUser**](UsersAPI.md#UsersAPI_getOwnUser) | **GET** /users/me | Get own user
[**UsersAPI_getUser**](UsersAPI.md#UsersAPI_getUser) | **GET** /users/{user_id} | Get a user
[**UsersAPI_getUserByEmail**](UsersAPI.md#UsersAPI_getUserByEmail) | **GET** /users/{email} | Get a user by email
[**UsersAPI_getUserGroups**](UsersAPI.md#UsersAPI_getUserGroups) | **GET** /user_groups | Get user groups
[**UsersAPI_getUserPresence**](UsersAPI.md#UsersAPI_getUserPresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
[**UsersAPI_getUsers**](UsersAPI.md#UsersAPI_getUsers) | **GET** /users | Get all users
[**UsersAPI_muteUser**](UsersAPI.md#UsersAPI_muteUser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
[**UsersAPI_reactivateUser**](UsersAPI.md#UsersAPI_reactivateUser) | **POST** /users/{user_id}/reactivate | Reactivate a user
[**UsersAPI_removeUserGroup**](UsersAPI.md#UsersAPI_removeUserGroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
[**UsersAPI_setTypingStatus**](UsersAPI.md#UsersAPI_setTypingStatus) | **POST** /typing | Set \&quot;typing\&quot; status
[**UsersAPI_unmuteUser**](UsersAPI.md#UsersAPI_unmuteUser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
[**UsersAPI_updateDisplaySettings**](UsersAPI.md#UsersAPI_updateDisplaySettings) | **PATCH** /settings/display | Update display settings
[**UsersAPI_updateNotificationSettings**](UsersAPI.md#UsersAPI_updateNotificationSettings) | **PATCH** /settings/notifications | Update notification settings
[**UsersAPI_updateUser**](UsersAPI.md#UsersAPI_updateUser) | **PATCH** /users/{user_id} | Update a user
[**UsersAPI_updateUserGroup**](UsersAPI.md#UsersAPI_updateUserGroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**UsersAPI_updateUserGroupMembers**](UsersAPI.md#UsersAPI_updateUserGroupMembers) | **POST** /user_groups/{user_group_id}/members | Update user group members


# **UsersAPI_createUser**
```c
// Create a user
//
// {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
//
json_success_base_t* UsersAPI_createUser(apiClient_t *apiClient, char * email, char * password, char * full_name);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**email** | **char \*** | The email address of the new user.  | 
**password** | **char \*** | The password of the new user.  | 
**full_name** | **char \*** | The full name of the new user.  | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_createUserGroup**
```c
// Create a user group
//
// Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
//
json_success_t* UsersAPI_createUserGroup(apiClient_t *apiClient, char * name, char * description, list_t * members);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**name** | **char \*** | The name of the user group.  | 
**description** | **char \*** | The description of the user group.  | 
**members** | **[list_t](int.md) \*** | An array containing the user IDs of the initial members for the new user group.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_deactivateOwnUser**
```c
// Deactivate own user
//
// Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
//
json_success_t* UsersAPI_deactivateOwnUser(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_deactivateUser**
```c
// Deactivate a user
//
// [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
//
json_success_t* UsersAPI_deactivateUser(apiClient_t *apiClient, int user_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**user_id** | **int** | The target user&#39;s ID.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_getAttachments**
```c
// Get attachments
//
// Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
//
json_success_base_t* UsersAPI_getAttachments(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_getOwnUser**
```c
// Get own user
//
// Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
//
json_success_base_t* UsersAPI_getOwnUser(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_getUser**
```c
// Get a user
//
// Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
//
json_success_base_t* UsersAPI_getUser(apiClient_t *apiClient, int user_id, int client_gravatar, int include_custom_profile_fields);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**user_id** | **int** | The target user&#39;s ID.  | 
**client_gravatar** | **int** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
**include_custom_profile_fields** | **int** | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_getUserByEmail**
```c
// Get a user by email
//
// Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
//
json_success_base_t* UsersAPI_getUserByEmail(apiClient_t *apiClient, char * email, int client_gravatar, int include_custom_profile_fields);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**email** | **char \*** | The email address of the user whose details you want to fetch.  | 
**client_gravatar** | **int** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
**include_custom_profile_fields** | **int** | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_getUserGroups**
```c
// Get user groups
//
// {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
//
json_success_base_t* UsersAPI_getUserGroups(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_getUserPresence**
```c
// Get user presence
//
// Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
//
json_success_base_t* UsersAPI_getUserPresence(apiClient_t *apiClient, char * user_id_or_email);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**user_id_or_email** | **char \*** | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_getUsers**
```c
// Get all users
//
// Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
//
json_success_base_t* UsersAPI_getUsers(apiClient_t *apiClient, int client_gravatar, int include_custom_profile_fields);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**client_gravatar** | **int** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
**include_custom_profile_fields** | **int** | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_muteUser**
```c
// Mute a user
//
// This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
//
json_success_t* UsersAPI_muteUser(apiClient_t *apiClient, int muted_user_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**muted_user_id** | **int** | The ID of the user to mute/un-mute.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_reactivateUser**
```c
// Reactivate a user
//
// [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
//
any_type_t* UsersAPI_reactivateUser(apiClient_t *apiClient, int user_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**user_id** | **int** | The target user&#39;s ID.  | 

### Return type

[any_type_t](any_type.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_removeUserGroup**
```c
// Delete a user group
//
// Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
//
json_success_t* UsersAPI_removeUserGroup(apiClient_t *apiClient, int user_group_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**user_group_id** | **int** | The ID of the target user group.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_setTypingStatus**
```c
// Set \"typing\" status
//
// Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
//
json_success_t* UsersAPI_setTypingStatus(apiClient_t *apiClient, zulip_rest_api_setTypingStatus_op_e op, list_t * to, zulip_rest_api_setTypingStatus_type_e type, char * topic);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**op** | **zulip_rest_api_setTypingStatus_op_e** | Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type.  | 
**to** | **[list_t](int.md) \*** | For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  | 
**type** | **zulip_rest_api_setTypingStatus_type_e** | Type of the message being composed.  | [optional] [default to &#39;private&#39;]
**topic** | **char \*** | Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  | [optional] 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_unmuteUser**
```c
// Unmute a user
//
// This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
//
json_success_t* UsersAPI_unmuteUser(apiClient_t *apiClient, int muted_user_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**muted_user_id** | **int** | The ID of the user to mute/un-mute.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_updateDisplaySettings**
```c
// Update display settings
//
// This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display` 
//
json_success_base_t* UsersAPI_updateDisplaySettings(apiClient_t *apiClient, int twenty_four_hour_time, int dense_mode, int starred_message_counts, int fluid_layout_width, int high_contrast_mode, int color_scheme, int translate_emoticons, char * default_language, char * default_view, int left_side_userlist, char * emojiset, int demote_inactive_streams, char * timezone);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**twenty_four_hour_time** | **int** | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  | [optional] 
**dense_mode** | **int** | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  | [optional] 
**starred_message_counts** | **int** | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  | [optional] 
**fluid_layout_width** | **int** | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  | [optional] 
**high_contrast_mode** | **int** | This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  | [optional] 
**color_scheme** | **int** | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  | [optional] 
**translate_emoticons** | **int** | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  | [optional] 
**default_language** | **char \*** | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | [optional] 
**default_view** | **char \*** | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 
**left_side_userlist** | **int** | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  | [optional] 
**emojiset** | **char \*** | The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 
**demote_inactive_streams** | **int** | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  | [optional] 
**timezone** | **char \*** | The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_updateNotificationSettings**
```c
// Update notification settings
//
// This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications` 
//
json_success_base_t* UsersAPI_updateNotificationSettings(apiClient_t *apiClient, int enable_stream_desktop_notifications, int enable_stream_email_notifications, int enable_stream_push_notifications, int enable_stream_audible_notifications, char * notification_sound, int enable_desktop_notifications, int enable_sounds, int enable_offline_email_notifications, int enable_offline_push_notifications, int enable_online_push_notifications, int enable_digest_emails, int enable_marketing_emails, int enable_login_emails, int message_content_in_email_notifications, int pm_content_in_desktop_notifications, int wildcard_mentions_notify, int desktop_icon_count_display, int realm_name_in_notifications, int presence_enabled);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**enable_stream_desktop_notifications** | **int** | Enable visual desktop notifications for stream messages.  | [optional] 
**enable_stream_email_notifications** | **int** | Enable email notifications for stream messages.  | [optional] 
**enable_stream_push_notifications** | **int** | Enable mobile notifications for stream messages.  | [optional] 
**enable_stream_audible_notifications** | **int** | Enable audible desktop notifications for stream messages.  | [optional] 
**notification_sound** | **char \*** | Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | [optional] 
**enable_desktop_notifications** | **int** | Enable visual desktop notifications for private messages and @-mentions.  | [optional] 
**enable_sounds** | **int** | Enable audible desktop notifications for private messages and @-mentions.  | [optional] 
**enable_offline_email_notifications** | **int** | Enable email notifications for private messages and @-mentions received when the user is offline.  | [optional] 
**enable_offline_push_notifications** | **int** | Enable mobile notification for private messages and @-mentions received when the user is offline.  | [optional] 
**enable_online_push_notifications** | **int** | Enable mobile notification for private messages and @-mentions received when the user is online.  | [optional] 
**enable_digest_emails** | **int** | Enable digest emails when the user is away.  | [optional] 
**enable_marketing_emails** | **int** | Enable marketing emails. Has no function outside Zulip Cloud.  | [optional] 
**enable_login_emails** | **int** | Enable email notifications for new logins to account.  | [optional] 
**message_content_in_email_notifications** | **int** | Include the message&#39;s content in email notifications for new messages.  | [optional] 
**pm_content_in_desktop_notifications** | **int** | Include content of private messages in desktop notifications.  | [optional] 
**wildcard_mentions_notify** | **int** | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  | [optional] 
**desktop_icon_count_display** | **int** | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  | [optional] 
**realm_name_in_notifications** | **int** | Include organization name in subject of message notification emails.  | [optional] 
**presence_enabled** | **int** | Display the presence status to other users when online.  | [optional] 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_updateUser**
```c
// Update a user
//
// Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
//
json_success_t* UsersAPI_updateUser(apiClient_t *apiClient, int user_id, char * full_name, int role, list_t * profile_data);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**user_id** | **int** | The target user&#39;s ID.  | 
**full_name** | **char \*** | The user&#39;s full name.  | [optional] 
**role** | **int** | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | [optional] 
**profile_data** | **[list_t](object.md) \*** | A dictionary containing the to be updated custom profile field data for the user.  | [optional] 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_updateUserGroup**
```c
// Update a user group
//
// Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
//
json_success_t* UsersAPI_updateUserGroup(apiClient_t *apiClient, int user_group_id, char * name, char * description);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**user_group_id** | **int** | The ID of the target user group.  | 
**name** | **char \*** | The new name of the group.  | 
**description** | **char \*** | The new description of the group.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_updateUserGroupMembers**
```c
// Update user group members
//
// Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
//
json_success_t* UsersAPI_updateUserGroupMembers(apiClient_t *apiClient, int user_group_id, list_t * _delete, list_t * add);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**user_group_id** | **int** | The ID of the target user group.  | 
**_delete** | **[list_t](int.md) \*** | The list of user ids to be removed from the user group.  | [optional] 
**add** | **[list_t](int.md) \*** | The list of user ids to be added to the user group.  | [optional] 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

