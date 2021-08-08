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
> JsonSuccessBase createUser(email, password, full\_name)

Create a user

    {!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| The email address of the new user.  | [default to null]
 **password** | **String**| The password of the new user.  | [default to null]
 **full\_name** | **String**| The full name of the new user.  | [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the user group.  | [default to null]
 **description** | **String**| The description of the user group.  | [default to null]
 **members** | [**List**](../Models/Integer.md)| An array containing the user IDs of the initial members for the new user group.  | [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

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

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deactivateUser"></a>
# **deactivateUser**
> JsonSuccess deactivateUser(user\_id)

Deactivate a user

    [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user\_id** | **Integer**| The target user&#39;s ID.  | [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

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

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

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

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> JsonSuccessBase getUser(user\_id, client\_gravatar, include\_custom\_profile\_fields)

Get a user

    Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user\_id** | **Integer**| The target user&#39;s ID.  | [default to null]
 **client\_gravatar** | **Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **include\_custom\_profile\_fields** | **Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getUserByEmail"></a>
# **getUserByEmail**
> JsonSuccessBase getUserByEmail(email, client\_gravatar, include\_custom\_profile\_fields)

Get a user by email

    Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| The email address of the user whose details you want to fetch.  | [default to null]
 **client\_gravatar** | **Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **include\_custom\_profile\_fields** | **Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

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

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getUserPresence"></a>
# **getUserPresence**
> JsonSuccessBase getUserPresence(user\_id\_or\_email)

Get user presence

    Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user\_id\_or\_email** | **String**| The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  | [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> JsonSuccessBase getUsers(client\_gravatar, include\_custom\_profile\_fields)

Get all users

    Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client\_gravatar** | **Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **include\_custom\_profile\_fields** | **Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="muteUser"></a>
# **muteUser**
> JsonSuccess muteUser(muted\_user\_id)

Mute a user

    This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muted\_user\_id** | **Integer**| The ID of the user to mute/un-mute.  | [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="reactivateUser"></a>
# **reactivateUser**
> oas_any_type_not_mapped reactivateUser(user\_id)

Reactivate a user

    [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user\_id** | **Integer**| The target user&#39;s ID.  | [default to null]

### Return type

[**oas_any_type_not_mapped**](../Models/AnyType.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="removeUserGroup"></a>
# **removeUserGroup**
> JsonSuccess removeUserGroup(user\_group\_id)

Delete a user group

    Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user\_group\_id** | **Integer**| The ID of the target user group.  | [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | **String**| Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type.  | [default to null] [enum: start, stop]
 **to** | [**List**](../Models/Integer.md)| For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  | [default to null]
 **type** | **String**| Type of the message being composed.  | [optional] [default to private] [enum: private, stream]
 **topic** | **String**| Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  | [optional] [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="unmuteUser"></a>
# **unmuteUser**
> JsonSuccess unmuteUser(muted\_user\_id)

Unmute a user

    This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muted\_user\_id** | **Integer**| The ID of the user to mute/un-mute.  | [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateDisplaySettings"></a>
# **updateDisplaySettings**
> JsonSuccessBase updateDisplaySettings(twenty\_four\_hour\_time, dense\_mode, starred\_message\_counts, fluid\_layout\_width, high\_contrast\_mode, color\_scheme, translate\_emoticons, default\_language, default\_view, left\_side\_userlist, emojiset, demote\_inactive\_streams, timezone)

Update display settings

    This endpoint is used to edit the current user&#39;s user interface settings.  &#x60;PATCH {{ api_url }}/v1/settings/display&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **twenty\_four\_hour\_time** | **Boolean**| Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  | [optional] [default to null]
 **dense\_mode** | **Boolean**| This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  | [optional] [default to null]
 **starred\_message\_counts** | **Boolean**| Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  | [optional] [default to null]
 **fluid\_layout\_width** | **Boolean**| Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  | [optional] [default to null]
 **high\_contrast\_mode** | **Boolean**| This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  | [optional] [default to null]
 **color\_scheme** | **Integer**| Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  | [optional] [default to null] [enum: 1, 2, 3]
 **translate\_emoticons** | **Boolean**| Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  | [optional] [default to null]
 **default\_language** | **String**| What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | [optional] [default to null]
 **default\_view** | **String**| The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] [default to null]
 **left\_side\_userlist** | **Boolean**| Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  | [optional] [default to null]
 **emojiset** | **String**| The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] [default to null]
 **demote\_inactive\_streams** | **Integer**| Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  | [optional] [default to null] [enum: 1, 2, 3]
 **timezone** | **String**| The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateNotificationSettings"></a>
# **updateNotificationSettings**
> JsonSuccessBase updateNotificationSettings(enable\_stream\_desktop\_notifications, enable\_stream\_email\_notifications, enable\_stream\_push\_notifications, enable\_stream\_audible\_notifications, notification\_sound, enable\_desktop\_notifications, enable\_sounds, enable\_offline\_email\_notifications, enable\_offline\_push\_notifications, enable\_online\_push\_notifications, enable\_digest\_emails, enable\_marketing\_emails, enable\_login\_emails, message\_content\_in\_email\_notifications, pm\_content\_in\_desktop\_notifications, wildcard\_mentions\_notify, desktop\_icon\_count\_display, realm\_name\_in\_notifications, presence\_enabled)

Update notification settings

    This endpoint is used to edit the user&#39;s global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  &#x60;PATCH {{ api_url }}/v1/settings/notifications&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enable\_stream\_desktop\_notifications** | **Boolean**| Enable visual desktop notifications for stream messages.  | [optional] [default to null]
 **enable\_stream\_email\_notifications** | **Boolean**| Enable email notifications for stream messages.  | [optional] [default to null]
 **enable\_stream\_push\_notifications** | **Boolean**| Enable mobile notifications for stream messages.  | [optional] [default to null]
 **enable\_stream\_audible\_notifications** | **Boolean**| Enable audible desktop notifications for stream messages.  | [optional] [default to null]
 **notification\_sound** | **String**| Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | [optional] [default to null]
 **enable\_desktop\_notifications** | **Boolean**| Enable visual desktop notifications for private messages and @-mentions.  | [optional] [default to null]
 **enable\_sounds** | **Boolean**| Enable audible desktop notifications for private messages and @-mentions.  | [optional] [default to null]
 **enable\_offline\_email\_notifications** | **Boolean**| Enable email notifications for private messages and @-mentions received when the user is offline.  | [optional] [default to null]
 **enable\_offline\_push\_notifications** | **Boolean**| Enable mobile notification for private messages and @-mentions received when the user is offline.  | [optional] [default to null]
 **enable\_online\_push\_notifications** | **Boolean**| Enable mobile notification for private messages and @-mentions received when the user is online.  | [optional] [default to null]
 **enable\_digest\_emails** | **Boolean**| Enable digest emails when the user is away.  | [optional] [default to null]
 **enable\_marketing\_emails** | **Boolean**| Enable marketing emails. Has no function outside Zulip Cloud.  | [optional] [default to null]
 **enable\_login\_emails** | **Boolean**| Enable email notifications for new logins to account.  | [optional] [default to null]
 **message\_content\_in\_email\_notifications** | **Boolean**| Include the message&#39;s content in email notifications for new messages.  | [optional] [default to null]
 **pm\_content\_in\_desktop\_notifications** | **Boolean**| Include content of private messages in desktop notifications.  | [optional] [default to null]
 **wildcard\_mentions\_notify** | **Boolean**| Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  | [optional] [default to null]
 **desktop\_icon\_count\_display** | **Integer**| Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  | [optional] [default to null] [enum: 1, 2, 3]
 **realm\_name\_in\_notifications** | **Boolean**| Include organization name in subject of message notification emails.  | [optional] [default to null]
 **presence\_enabled** | **Boolean**| Display the presence status to other users when online.  | [optional] [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> JsonSuccess updateUser(user\_id, full\_name, role, profile\_data)

Update a user

    Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user\_id** | **Integer**| The target user&#39;s ID.  | [default to null]
 **full\_name** | **String**| The user&#39;s full name.  | [optional] [default to null]
 **role** | **Integer**| New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | [optional] [default to null]
 **profile\_data** | [**List**](../Models/Object.md)| A dictionary containing the to be updated custom profile field data for the user.  | [optional] [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateUserGroup"></a>
# **updateUserGroup**
> JsonSuccess updateUserGroup(user\_group\_id, name, description)

Update a user group

    Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user\_group\_id** | **Integer**| The ID of the target user group.  | [default to null]
 **name** | **String**| The new name of the group.  | [default to null]
 **description** | **String**| The new description of the group.  | [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateUserGroupMembers"></a>
# **updateUserGroupMembers**
> JsonSuccess updateUserGroupMembers(user\_group\_id, delete, add)

Update user group members

    Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user\_group\_id** | **Integer**| The ID of the target user group.  | [default to null]
 **delete** | [**List**](../Models/Integer.md)| The list of user ids to be removed from the user group.  | [optional] [default to null]
 **add** | [**List**](../Models/Integer.md)| The list of user ids to be added to the user group.  | [optional] [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

