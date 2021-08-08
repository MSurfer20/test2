# UsersApi

All URIs are relative to */api/v1*

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
[**updateSettings**](UsersApi.md#updateSettings) | **PATCH** /settings | Update settings
[**updateStatus**](UsersApi.md#updateStatus) | **POST** /users/me/status | Update your status
[**updateUser**](UsersApi.md#updateUser) | **PATCH** /users/{user_id} | Update a user
[**updateUserGroup**](UsersApi.md#updateUserGroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**updateUserGroupMembers**](UsersApi.md#updateUserGroupMembers) | **POST** /user_groups/{user_group_id}/members | Update user group members



## createUser

Create a user

{!can-create-users-only.md!}

Create a new user account via the API.

'POST {{ api_url }}/v1/users'

### Example

```bash
 createUser  email=value  password=value  full_name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string** | The email address of the new user. | [default to null]
 **password** | **string** | The password of the new user. | [default to null]
 **fullName** | **string** | The full name of the new user. | [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createUserGroup

Create a user group

Create a new [user group](/help/user-groups).

'POST {{ api_url }}/v1/user_groups/create'

### Example

```bash
 createUserGroup  name=value  description=value  Specify as:  members=value1 members=value2 members=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** | The name of the user group. | [default to null]
 **description** | **string** | The description of the user group. | [default to null]
 **members** | [**array[integer]**](integer.md) | An array containing the user IDs of the initial members for the
new user group. | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deactivateOwnUser

Deactivate own user

Deactivates the user's account.  See also the administrative endpoint for
[deactivating another user](/api/deactivate-user).

'DELETE {{ api_url }}/v1/users/me'

This endpoint is primarily useful to Zulip clients providing a user settings UI.

### Example

```bash
 deactivateOwnUser
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deactivateUser

Deactivate a user

[Deactivates a
user](https://zulip.com/help/deactivate-or-reactivate-a-user)
given their user ID.

'DELETE {{ api_url }}/v1/users/{user_id}'

### Example

```bash
 deactivateUser user_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **integer** | The target user's ID. | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getAttachments

Get attachments

Fetch metadata on files uploaded by the requesting user.

'GET {{ api_url }}/v1/attachments'

### Example

```bash
 getAttachments
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOwnUser

Get own user

Get basic data about the user/bot that requests this endpoint.

'GET {{ api_url }}/v1/users/me'

### Example

```bash
 getOwnUser
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getUser

Get a user

Fetch details for a single user in the organization.

'GET {{ api_url }}/v1/users/{user_id}'

You can also fetch details on [all users in the organization](/api/get-users)
or [by email](/api/get-user-by-email).

*This endpoint is new in Zulip Server 3.0 (feature level 1).*

### Example

```bash
 getUser user_id=value  client_gravatar=value  include_custom_profile_fields=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **integer** | The target user's ID. | [default to null]
 **clientGravatar** | **boolean** | Whether the client supports computing gravatars URLs.  If
enabled, 'avatar_url' will be included in the response only
if there is a Zulip avatar, and will be 'null' for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The 'client_gravatar' field is set to 'true' if
clients can compute their own gravatars. | [optional] [default to false]
 **includeCustomProfileFields** | **boolean** | Whether the client wants [custom profile field](/help/add-custom-profile-fields)
data to be included in the response.

**Changes**: New in Zulip 2.1.0.  Previous versions do no offer these
data via the API. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getUserByEmail

Get a user by email

Fetch details for a single user in the organization given a Zulip display
email address.

'GET {{ api_url }}/v1/users/{email}'

Note that this endpoint uses Zulip display emails addresses
for organizations that have configured limited [email address
visibility](/help/restrict-visibility-of-email-addresses).

You can also fetch details on [all users in the organization](/api/get-users) or
[by user ID](/api/get-user).  Fetching by user ID is generally recommended
when possible, as users can
[change their email address](/help/change-your-email-address).

*This endpoint is new in Zulip Server 4.0 (feature level 39).*

### Example

```bash
 getUserByEmail email=value  client_gravatar=value  include_custom_profile_fields=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string** | The email address of the user whose details you want to fetch. | [default to null]
 **clientGravatar** | **boolean** | Whether the client supports computing gravatars URLs.  If
enabled, 'avatar_url' will be included in the response only
if there is a Zulip avatar, and will be 'null' for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The 'client_gravatar' field is set to 'true' if
clients can compute their own gravatars. | [optional] [default to false]
 **includeCustomProfileFields** | **boolean** | Whether the client wants [custom profile field](/help/add-custom-profile-fields)
data to be included in the response.

**Changes**: New in Zulip 2.1.0.  Previous versions do no offer these
data via the API. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getUserGroups

Get user groups

{!api-members-only.md!}

Fetches all of the user groups in the organization.

'GET {{ api_url }}/v1/user_groups'

### Example

```bash
 getUserGroups
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getUserPresence

Get user presence

Get the presence status for a specific user.

This endpoint is most useful for embedding data about a user's
presence status in other sites (E.g. an employee directory).  Full
Zulip clients like mobile/desktop apps will want to use the main
presence endpoint, which returns data for all active users in the
organization, instead.

'GET {{ api_url }}/v1/users/{user_id_or_email}/presence'

See
[Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html)
for details on the data model for presence in Zulip.

### Example

```bash
 getUserPresence user_id_or_email=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIdOrEmail** | **string** | The user_id or Zulip display email address of the user whose presence you want to fetch.

**Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported
identifying the user by Zulip display email. | [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getUsers

Get all users

Retrieve details on all users in the organization.  Optionally
includes values of [custom profile field](/help/add-custom-profile-fields).

'GET {{ api_url }}/v1/users'

You can also [fetch details on a single user](/api/get-user).

### Example

```bash
 getUsers  client_gravatar=value  include_custom_profile_fields=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGravatar** | **boolean** | Whether the client supports computing gravatars URLs.  If
enabled, 'avatar_url' will be included in the response only
if there is a Zulip avatar, and will be 'null' for users who
are using gravatar as their avatar.  This option
significantly reduces the compressed size of user data,
since gravatar URLs are long, random strings and thus do not
compress well. The 'client_gravatar' field is set to 'true' if
clients can compute their own gravatars. | [optional] [default to false]
 **includeCustomProfileFields** | **boolean** | Whether the client wants [custom profile field](/help/add-custom-profile-fields)
data to be included in the response.

**Changes**: New in Zulip 2.1.0.  Previous versions do no offer these
data via the API. | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## muteUser

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users
you've muted will be automatically marked as read and hidden.

'POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}'

Muted users should be implemented by clients as follows:

* The server will immediately mark all messages sent by the muted
  user as read.  This will automatically clear any existing mobile
  push notifications related to the muted user.
* The server will mark any new messages sent by the muted user as read
  for your account, which prevents all email and mobile push notifications.
* Clients should exclude muted users from presence lists or other UI
  for viewing or composing 1:1 private messages. 1:1 private messages sent by
  muted users should be hidden everywhere in the Zulip UI.
* Stream messages and group private messages sent by the muted
  user should avoid displaying the content and name/avatar,
  but should display that N messages by a muted user were
  hidden (so that it is possible to interpret the messages by
  other users who are talking with the muted user).
* Group private message conversations including the muted user
  should display muted users as \"Muted user\", rather than
  showing their name, in lists of such conversations, along with using
  a blank grey avatar where avatars are displayed.
* Administrative/settings UI elements for showing \"All users that exist
  on this stream or realm\", e.g. for organization
  administration or showing stream subscribers, should display
  the user's name as normal.

**Changes**: New in Zulip 4.0 (feature level 48).

### Example

```bash
 muteUser muted_user_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutedUserId** | **integer** | The ID of the user to mute/un-mute. | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reactivateUser

Reactivate a user

[Reactivates a
user](https://zulip.com/help/deactivate-or-reactivate-a-user)
given their user ID.

'POST {{ api_url }}/v1/users/{user_id}/reactivate'

### Example

```bash
 reactivateUser user_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **integer** | The target user's ID. | [default to null]

### Return type

[**AnyType**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## removeUserGroup

Delete a user group

Delete a [user group](/help/user-groups).

'DELETE {{ api_url }}/v1/user_groups/{user_group_id}'

### Example

```bash
 removeUserGroup user_group_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **integer** | The ID of the target user group. | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## setTypingStatus

Set \"typing\" status

Notify other users whether the current user is typing a message.

'POST {{ api_url }}/v1/typing'

Clients implementing Zulip's typing notifications protocol should work as follows:

* Send a request to this endpoint with 'op=\"start\"' when a user starts typing a message,
  and also every 'TYPING_STARTED_WAIT_PERIOD=10' seconds that the user continues to
  actively type or otherwise interact with the compose UI (E.g. interacting with the
  compose box emoji picker).
* Send a request to this endpoint with 'op=\"stop\"' when a user pauses using the
  compose UI for at least 'TYPING_STOPPED_WAIT_PERIOD=5' seconds or cancels
  the compose action (if it had previously sent a \"start\" operation for that
  compose action).
* Start displaying \"Sender is typing\" for a given conversation when the client
  receives an 'op=\"start\"' event from the [events API](/api/get-events).
* Continue displaying \"Sender is typing\" until they receive an 'op=\"stop\"' event
  from the [events API](/api/get-events) or 'TYPING_STARTED_EXPIRY_PERIOD=15'
  seconds have passed without a new 'op=\"start\"' event for that conversation.
* Clients that support displaying stream typing notifications (new in Zulip 4.0)
  should indicate they support processing stream typing events via the
  'stream_typing_notifications' in the 'client_capabilities' parameter to '/register'.

This protocol is designed to allow the server-side typing notifications implementation
to be stateless while being resilient; network failures cannot result in a user being
incorrectly displayed as perpetually typing.

See
[the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html)
for additional design details on Zulip's typing notifications protocol.

### Example

```bash
 setTypingStatus  op=value  Specify as:  to=value1 to=value2 to=...  type=value  topic=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | **string** | Whether the user has started ('start') or stopped ('stop') to type. | [default to null]
 **to** | [**array[integer]**](integer.md) | For 'private' type it is the user_ids of the recipients of the message being typed.
Send a JSON-encoded list of user_ids. (Use a list even if there is only one
recipient.)

For 'stream' type it is a single element list containing ID of stream in
which the message is being typed.

**Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded
list of email addresses.  Support for the email address-based format was
removed in Zulip 3.0 (feature level 11). | [default to null]
 **type** | **string** | Type of the message being composed. | [optional] [default to private]
 **topic** | **string** | Topic to which message is being typed. Required for the 'stream' type.
Ignored in case of 'private' type. | [optional] [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## unmuteUser

Unmute a user

This endpoint unmutes a user.

'DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}'

**Changes**: New in Zulip 4.0 (feature level 48).

### Example

```bash
 unmuteUser muted_user_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutedUserId** | **integer** | The ID of the user to mute/un-mute. | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateSettings

Update settings

This endpoint is used to edit the current user's settings.

'PATCH {{ api_url }}/v1/settings'

**Changes**: Prior to Zulip 5.0 (feature level 80), this
endpoint only supported the 'full_name', 'email',
'old_password', and 'new_password' parameters. Notification
settings were managed by 'PATCH /settings/notifications', and
all other settings by 'PATCH /settings/display'. The feature level
80 migration to merge these endpoints did not change how request
parameters are encoded. Note, however, that it did change the
handling of any invalid parameters present in a request to change
notification or display settings, since the merged endpoint uses
the new response format that was introduced for '/settings' in
Zulip 5.0 (feature level 78).

The '/settings/display' and '/settings/notifications'
endpoints are now deprecated aliases for this endpoint for
backwards-compatibility, and will be removed once clients have
migrated to use this endpoint.

### Example

```bash
 updateSettings  full_name=value  email=value  old_password=value  new_password=value  twenty_four_hour_time=value  dense_mode=value  starred_message_counts=value  fluid_layout_width=value  high_contrast_mode=value  color_scheme=value  enable_drafts_synchronization=value  translate_emoticons=value  default_language=value  default_view=value  left_side_userlist=value  emojiset=value  demote_inactive_streams=value  timezone=value  enable_stream_desktop_notifications=value  enable_stream_email_notifications=value  enable_stream_push_notifications=value  enable_stream_audible_notifications=value  notification_sound=value  enable_desktop_notifications=value  enable_sounds=value  email_notifications_batching_period_seconds=value  enable_offline_email_notifications=value  enable_offline_push_notifications=value  enable_online_push_notifications=value  enable_digest_emails=value  enable_marketing_emails=value  enable_login_emails=value  message_content_in_email_notifications=value  pm_content_in_desktop_notifications=value  wildcard_mentions_notify=value  desktop_icon_count_display=value  realm_name_in_notifications=value  presence_enabled=value  enter_sends=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullName** | **string** | A new display name for the user. | [optional] [default to null]
 **email** | **string** | Asks the server to initiate a confirmation sequence to change the user's email
address to the indicated value. The user will need to demonstrate control of the
new email address by clicking a confirmation link sent to that address. | [optional] [default to null]
 **oldPassword** | **string** | The user's old Zulip password (or LDAP password, if LDAP authentication is in use).

Required only when sending the 'new_password' parameter. | [optional] [default to null]
 **newPassword** | **string** | The user's new Zulip password (or LDAP password, if LDAP authentication is in use).

The 'old_password' parameter must be included in the request. | [optional] [default to null]
 **twentyFourHourTime** | **boolean** | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/display' endpoint. | [optional] [default to null]
 **denseMode** | **boolean** | This setting has no effect at present.  It is reserved for use in controlling
the default font size in Zulip.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/display' endpoint. | [optional] [default to null]
 **starredMessageCounts** | **boolean** | Whether clients should display the [number of starred
messages](/help/star-a-message#display-the-number-of-starred-messages).

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/display' endpoint. | [optional] [default to null]
 **fluidLayoutWidth** | **boolean** | Whether to use the [maximum available screen width](/help/enable-full-width-display)
for the web app's center panel (message feed, recent topics) on wide screens.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/display' endpoint. | [optional] [default to null]
 **highContrastMode** | **boolean** | This setting is reserved for use to control variations in Zulip's design
to help visually impaired users.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/display' endpoint. | [optional] [default to null]
 **colorScheme** | **integer** | Controls which [color theme](/help/night-mode) to use.

* 1 - Automatic
* 2 - Night mode
* 3 - Day mode

Automatic detection is implementing using the standard 'prefers-color-scheme'
media query.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/display' endpoint. | [optional] [default to null]
 **enableDraftsSynchronization** | **boolean** | A boolean parameter to control whether synchronizing drafts is enabled for
the user. When synchronization is disabled, all drafts stored in the server
will be automatically deleted from the server.

This does not do anything (like sending events) to delete local copies of
drafts stored in clients.

**Changes**: New in Zulip 5.0 (feature level 87). | [optional] [default to null]
 **translateEmoticons** | **boolean** | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations)
in messages the user sends.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/display' endpoint. | [optional] [default to null]
 **defaultLanguage** | **string** | What [default language](/help/change-your-language) to use for the account.

This controls both the Zulip UI as well as email notifications sent to the user.

The value needs to be a standard language code that the Zulip server has
translation data for; for example, '\"en\"' for English or '\"de\"' for German.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/display' endpoint.

Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). | [optional] [default to null]
 **defaultView** | **string** | The [default view](/help/change-default-view) used when opening a new
Zulip web app window or hitting the 'Esc' keyboard shortcut repeatedly.

* \"recent_topics\" - Recent topics view
* \"all_messages\" - All messages view

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/display' endpoint.

Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). | [optional] [default to null]
 **leftSideUserlist** | **boolean** | Whether the users list on left sidebar in narrow windows.

This feature is not heavily used and is likely to be reworked.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/display' endpoint. | [optional] [default to null]
 **emojiset** | **string** | The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons),
used to display emoji to the user everything they appear in the UI.

* \"google\" - Google modern
* \"google-blob\" - Google classic
* \"twitter\" - Twitter
* \"text\" - Plain text

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/display' endpoint.

Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). | [optional] [default to null]
 **demoteInactiveStreams** | **integer** | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.

* 1 - Automatic
* 2 - Always
* 3 - Never

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/display' endpoint. | [optional] [default to null]
 **timezone** | **string** | The user's [configured timezone](/help/change-your-timezone).

Timezone values supported by the server are served at
[/static/generated/timezones.json](/static/generated/timezones.json).

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/display' endpoint.

Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). | [optional] [default to null]
 **enableStreamDesktopNotifications** | **boolean** | Enable visual desktop notifications for stream messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **enableStreamEmailNotifications** | **boolean** | Enable email notifications for stream messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **enableStreamPushNotifications** | **boolean** | Enable mobile notifications for stream messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **enableStreamAudibleNotifications** | **boolean** | Enable audible desktop notifications for stream messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **notificationSound** | **string** | Notification sound name.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint.

Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). | [optional] [default to null]
 **enableDesktopNotifications** | **boolean** | Enable visual desktop notifications for private messages and @-mentions.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **enableSounds** | **boolean** | Enable audible desktop notifications for private messages and
@-mentions.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **emailNotificationsBatchingPeriodSeconds** | **integer** | The duration (in seconds) for which the server should wait to batch
email notifications before sending them.

**Changes**: New in Zulip 5.0 (feature level 82) | [optional] [default to null]
 **enableOfflineEmailNotifications** | **boolean** | Enable email notifications for private messages and @-mentions received
when the user is offline.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **enableOfflinePushNotifications** | **boolean** | Enable mobile notification for private messages and @-mentions received
when the user is offline.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **enableOnlinePushNotifications** | **boolean** | Enable mobile notification for private messages and @-mentions received
when the user is online.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **enableDigestEmails** | **boolean** | Enable digest emails when the user is away.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **enableMarketingEmails** | **boolean** | Enable marketing emails. Has no function outside Zulip Cloud.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **enableLoginEmails** | **boolean** | Enable email notifications for new logins to account.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **messageContentInEmailNotifications** | **boolean** | Include the message's content in email notifications for new messages.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **pmContentInDesktopNotifications** | **boolean** | Include content of private messages in desktop notifications.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **wildcardMentionsNotify** | **boolean** | Whether wildcard mentions (E.g. @**all**) should send notifications
like a personal mention.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **desktopIconCountDisplay** | **integer** | Unread count summary (appears in desktop sidebar and browser tab)

* 1 - All unreads
* 2 - Private messages and mentions
* 3 - None

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **realmNameInNotifications** | **boolean** | Include organization name in subject of message notification emails.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **presenceEnabled** | **boolean** | Display the presence status to other users when online.

**Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by
the 'PATCH /settings/notifications' endpoint. | [optional] [default to null]
 **enterSends** | **boolean** | Whether pressing Enter in the compose box sends a message
(or saves a message edit).

**Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by
the 'POST /users/me/enter-sends' endpoint, with the same parameter format. | [optional] [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateStatus

Update your status

Change your [status](/help/status-and-availability).

'POST {{ api_url }}/v1/users/me/status'

A request to this endpoint will only change the parameters passed.
For example, passing just 'status_text' requests a change in the status
text, but will leave the status emoji unchanged.

Clients that wish to set the user's status to a specific value should
pass all supported parameters.

### Example

```bash
 updateStatus  status_text=value  away=value  emoji_name=value  emoji_code=value  reaction_type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusText** | **string** | The text content of the status message. Sending the empty string
will clear the user's status.

**Note**: The limit on the size of the message is 60 characters. | [optional] [default to null]
 **away** | **boolean** | Whether the user should be marked as \"away\". | [optional] [default to null]
 **emojiName** | **string** | The name for the emoji to associate with this status. | [optional] [default to null]
 **emojiCode** | **string** | A unique identifier, defining the specific emoji codepoint requested,
within the namespace of the 'reaction_type'.

For example, for 'unicode_emoji', this will be an encoding of the
Unicode codepoint; for 'realm_emoji', it'll be the ID of the realm emoji. | [optional] [default to null]
 **reactionType** | **string** | One of the following values:

* 'unicode_emoji': Unicode emoji ('emoji_code' will be its Unicode
  codepoint).
* 'realm_emoji': [Custom emoji](/help/add-custom-emoji).
  ('emoji_code' will be its ID).
* 'zulip_extra_emoji': Special emoji included with Zulip.  Exists to
  namespace the 'zulip' emoji. | [optional] [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateUser

Update a user

Administrative endpoint to update the details of another user in the organization.

'PATCH {{ api_url }}/v1/users/{user_id}'

Supports everything an administrator can do to edit details of another
user's account, including editing full name,
[role](/help/roles-and-permissions), and [custom profile
fields](/help/add-custom-profile-fields).

### Example

```bash
 updateUser user_id=value  full_name=value  role=value  Specify as:  profile_data=value1 profile_data=value2 profile_data=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **integer** | The target user's ID. | [default to null]
 **fullName** | **string** | The user's full name. | [optional] [default to null]
 **role** | **integer** | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:

* Organization owner: 100
* Organization administrator: 200
* Organization moderator: 300
* Member: 400
* Guest: 600

Only organization owners can add or remove the owner role.

The owner role cannot be removed from the only organization owner.

**Changes**: New in Zulip 3.0 (feature level 8), replacing the previous
pair of 'is_admin' and 'is_guest' boolean parameters. Organization moderator
role added in Zulip 4.0 (feature level 60). | [optional] [default to null]
 **profileData** | [**array[map]**](map.md) | A dictionary containing the to be updated custom profile field data for the user. | [optional] [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateUserGroup

Update a user group

Update the name or description of a [user group](/help/user-groups).

'PATCH {{ api_url }}/v1/user_groups/{user_group_id}'

### Example

```bash
 updateUserGroup user_group_id=value  name=value  description=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **integer** | The ID of the target user group. | [default to null]
 **name** | **string** | The new name of the group. | [default to null]
 **description** | **string** | The new description of the group. | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateUserGroupMembers

Update user group members

Update the members of a [user group](/help/user-groups).

'POST {{ api_url }}/v1/user_groups/{user_group_id}/members'

### Example

```bash
 updateUserGroupMembers user_group_id=value  Specify as:  delete=value1 delete=value2 delete=...  Specify as:  add=value1 add=value2 add=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **integer** | The ID of the target user group. | [default to null]
 **delete** | [**array[integer]**](integer.md) | The list of user ids to be removed from the user group. | [optional] [default to null]
 **add** | [**array[integer]**](integer.md) | The list of user ids to be added to the user group. | [optional] [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

