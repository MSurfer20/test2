# USERS_API

All URIs are relative to *https://example.zulipchat.com/api/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**attachments**](USERS_API.md#attachments) | **Get** /attachments | Get attachments
[**create_user**](USERS_API.md#create_user) | **Post** /users | Create a user
[**create_user_group**](USERS_API.md#create_user_group) | **Post** /user_groups/create | Create a user group
[**deactivate_own_user**](USERS_API.md#deactivate_own_user) | **Delete** /users/me | Deactivate own user
[**deactivate_user**](USERS_API.md#deactivate_user) | **Delete** /users/{user_id} | Deactivate a user
[**mute_user**](USERS_API.md#mute_user) | **Post** /users/me/muted_users/{muted_user_id} | Mute a user
[**own_user**](USERS_API.md#own_user) | **Get** /users/me | Get own user
[**reactivate_user**](USERS_API.md#reactivate_user) | **Post** /users/{user_id}/reactivate | Reactivate a user
[**remove_user_group**](USERS_API.md#remove_user_group) | **Delete** /user_groups/{user_group_id} | Delete a user group
[**set_typing_status**](USERS_API.md#set_typing_status) | **Post** /typing | Set \&quot;typing\&quot; status
[**unmute_user**](USERS_API.md#unmute_user) | **Delete** /users/me/muted_users/{muted_user_id} | Unmute a user
[**update_settings**](USERS_API.md#update_settings) | **Patch** /settings | Update settings
[**update_status**](USERS_API.md#update_status) | **Post** /users/me/status | Update your status
[**update_user**](USERS_API.md#update_user) | **Patch** /users/{user_id} | Update a user
[**update_user_group**](USERS_API.md#update_user_group) | **Patch** /user_groups/{user_group_id} | Update a user group
[**update_user_group_members**](USERS_API.md#update_user_group_members) | **Post** /user_groups/{user_group_id}/members | Update user group members
[**user**](USERS_API.md#user) | **Get** /users/{user_id} | Get a user
[**user_by_email**](USERS_API.md#user_by_email) | **Get** /users/{email} | Get a user by email
[**user_groups**](USERS_API.md#user_groups) | **Get** /user_groups | Get user groups
[**user_presence**](USERS_API.md#user_presence) | **Get** /users/{user_id_or_email}/presence | Get user presence
[**users**](USERS_API.md#users) | **Get** /users | Get all users


# **attachments**
> attachments : detachable JSON_SUCCESS_BASE
	

Get attachments

Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 


### Parameters
This endpoint does not need any parameter.

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_user**
> create_user (email: STRING_32 ; password: STRING_32 ; full_name: STRING_32 ): detachable JSON_SUCCESS_BASE
	

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **STRING_32**| The email address of the new user.  | [default to null]
 **password** | **STRING_32**| The password of the new user.  | [default to null]
 **full_name** | **STRING_32**| The full name of the new user.  | [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_user_group**
> create_user_group (name: STRING_32 ; description: STRING_32 ; members: LIST [INTEGER_32] ): detachable JSON_SUCCESS
	

Create a user group

Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **STRING_32**| The name of the user group.  | [default to null]
 **description** | **STRING_32**| The description of the user group.  | [default to null]
 **members** | [**LIST [INTEGER_32]**](INTEGER_32.md)| An array containing the user IDs of the initial members for the new user group.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivate_own_user**
> deactivate_own_user : detachable JSON_SUCCESS
	

Deactivate own user

Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 


### Parameters
This endpoint does not need any parameter.

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivate_user**
> deactivate_user (user_id: INTEGER_32 ): detachable JSON_SUCCESS
	

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **INTEGER_32**| The target user&#39;s ID.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mute_user**
> mute_user (muted_user_id: INTEGER_32 ): detachable JSON_SUCCESS
	

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muted_user_id** | **INTEGER_32**| The ID of the user to mute/un-mute.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **own_user**
> own_user : detachable JSON_SUCCESS_BASE
	

Get own user

Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 


### Parameters
This endpoint does not need any parameter.

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reactivate_user**
> reactivate_user (user_id: INTEGER_32 ): detachable ANY
	

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **INTEGER_32**| The target user&#39;s ID.  | [default to null]

### Return type

[**ANY**](ANY.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_user_group**
> remove_user_group (user_group_id: INTEGER_32 ): detachable JSON_SUCCESS
	

Delete a user group

Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_group_id** | **INTEGER_32**| The ID of the target user group.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_typing_status**
> set_typing_status (op: STRING_32 ; to: LIST [INTEGER_32] ; type:  detachable STRING_32 ; topic:  detachable STRING_32 ): detachable JSON_SUCCESS
	

Set \"typing\" status

Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | **STRING_32**| Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type.  | [default to null]
 **to** | [**LIST [INTEGER_32]**](INTEGER_32.md)| For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  | [default to null]
 **type** | **STRING_32**| Type of the message being composed.  | [optional] [default to private]
 **topic** | **STRING_32**| Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  | [optional] [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unmute_user**
> unmute_user (muted_user_id: INTEGER_32 ): detachable JSON_SUCCESS
	

Unmute a user

This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muted_user_id** | **INTEGER_32**| The ID of the user to mute/un-mute.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_settings**
> update_settings (full_name:  detachable STRING_32 ; email:  detachable STRING_32 ; old_password:  detachable STRING_32 ; new_password:  detachable STRING_32 ; twenty_four_hour_time:  detachable BOOLEAN ; dense_mode:  detachable BOOLEAN ; starred_message_counts:  detachable BOOLEAN ; fluid_layout_width:  detachable BOOLEAN ; high_contrast_mode:  detachable BOOLEAN ; color_scheme:  detachable INTEGER_32 ; enable_drafts_synchronization:  detachable BOOLEAN ; translate_emoticons:  detachable BOOLEAN ; default_language:  detachable STRING_32 ; default_view:  detachable STRING_32 ; left_side_userlist:  detachable BOOLEAN ; emojiset:  detachable STRING_32 ; demote_inactive_streams:  detachable INTEGER_32 ; timezone:  detachable STRING_32 ; enable_stream_desktop_notifications:  detachable BOOLEAN ; enable_stream_email_notifications:  detachable BOOLEAN ; enable_stream_push_notifications:  detachable BOOLEAN ; enable_stream_audible_notifications:  detachable BOOLEAN ; notification_sound:  detachable STRING_32 ; enable_desktop_notifications:  detachable BOOLEAN ; enable_sounds:  detachable BOOLEAN ; email_notifications_batching_period_seconds:  detachable INTEGER_32 ; enable_offline_email_notifications:  detachable BOOLEAN ; enable_offline_push_notifications:  detachable BOOLEAN ; enable_online_push_notifications:  detachable BOOLEAN ; enable_digest_emails:  detachable BOOLEAN ; enable_marketing_emails:  detachable BOOLEAN ; enable_login_emails:  detachable BOOLEAN ; message_content_in_email_notifications:  detachable BOOLEAN ; pm_content_in_desktop_notifications:  detachable BOOLEAN ; wildcard_mentions_notify:  detachable BOOLEAN ; desktop_icon_count_display:  detachable INTEGER_32 ; realm_name_in_notifications:  detachable BOOLEAN ; presence_enabled:  detachable BOOLEAN ; enter_sends:  detachable BOOLEAN ): detachable JSON_SUCCESS_BASE
	

Update settings

This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **full_name** | **STRING_32**| A new display name for the user.  | [optional] [default to null]
 **email** | **STRING_32**| Asks the server to initiate a confirmation sequence to change the user&#39;s email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address.  | [optional] [default to null]
 **old_password** | **STRING_32**| The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the &#x60;new_password&#x60; parameter.  | [optional] [default to null]
 **new_password** | **STRING_32**| The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).  The &#x60;old_password&#x60; parameter must be included in the request.  | [optional] [default to null]
 **twenty_four_hour_time** | **BOOLEAN**| Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] [default to null]
 **dense_mode** | **BOOLEAN**| This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] [default to null]
 **starred_message_counts** | **BOOLEAN**| Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] [default to null]
 **fluid_layout_width** | **BOOLEAN**| Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] [default to null]
 **high_contrast_mode** | **BOOLEAN**| This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] [default to null]
 **color_scheme** | **INTEGER_32**| Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] [default to null]
 **enable_drafts_synchronization** | **BOOLEAN**| A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87).  | [optional] [default to null]
 **translate_emoticons** | **BOOLEAN**| Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] [default to null]
 **default_language** | **STRING_32**| What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  | [optional] [default to null]
 **default_view** | **STRING_32**| The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] [default to null]
 **left_side_userlist** | **BOOLEAN**| Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] [default to null]
 **emojiset** | **STRING_32**| The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] [default to null]
 **demote_inactive_streams** | **INTEGER_32**| Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] [default to null]
 **timezone** | **STRING_32**| The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] [default to null]
 **enable_stream_desktop_notifications** | **BOOLEAN**| Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **enable_stream_email_notifications** | **BOOLEAN**| Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **enable_stream_push_notifications** | **BOOLEAN**| Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **enable_stream_audible_notifications** | **BOOLEAN**| Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **notification_sound** | **STRING_32**| Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  | [optional] [default to null]
 **enable_desktop_notifications** | **BOOLEAN**| Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **enable_sounds** | **BOOLEAN**| Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **email_notifications_batching_period_seconds** | **INTEGER_32**| The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82)  | [optional] [default to null]
 **enable_offline_email_notifications** | **BOOLEAN**| Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **enable_offline_push_notifications** | **BOOLEAN**| Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **enable_online_push_notifications** | **BOOLEAN**| Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **enable_digest_emails** | **BOOLEAN**| Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **enable_marketing_emails** | **BOOLEAN**| Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **enable_login_emails** | **BOOLEAN**| Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **message_content_in_email_notifications** | **BOOLEAN**| Include the message&#39;s content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **pm_content_in_desktop_notifications** | **BOOLEAN**| Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **wildcard_mentions_notify** | **BOOLEAN**| Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **desktop_icon_count_display** | **INTEGER_32**| Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **realm_name_in_notifications** | **BOOLEAN**| Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **presence_enabled** | **BOOLEAN**| Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [default to null]
 **enter_sends** | **BOOLEAN**| Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the &#x60;POST /users/me/enter-sends&#x60; endpoint, with the same parameter format.  | [optional] [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_status**
> update_status (status_text:  detachable STRING_32 ; away:  detachable BOOLEAN ; emoji_name:  detachable STRING_32 ; emoji_code:  detachable STRING_32 ; reaction_type:  detachable STRING_32 ): detachable JSON_SUCCESS
	

Update your status

Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status_text** | **STRING_32**| The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters.  | [optional] [default to null]
 **away** | **BOOLEAN**| Whether the user should be marked as \&quot;away\&quot;.  | [optional] [default to null]
 **emoji_name** | **STRING_32**| The name for the emoji to associate with this status.  | [optional] [default to null]
 **emoji_code** | **STRING_32**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji.  | [optional] [default to null]
 **reaction_type** | **STRING_32**| One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji.  | [optional] [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_user**
> update_user (user_id: INTEGER_32 ; full_name:  detachable STRING_32 ; role:  detachable INTEGER_32 ; profile_data:  detachable LIST [ANY] ): detachable JSON_SUCCESS
	

Update a user

Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **INTEGER_32**| The target user&#39;s ID.  | [default to null]
 **full_name** | **STRING_32**| The user&#39;s full name.  | [optional] [default to null]
 **role** | **INTEGER_32**| New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | [optional] [default to null]
 **profile_data** | [**LIST [ANY]**](ANY.md)| A dictionary containing the to be updated custom profile field data for the user.  | [optional] [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_user_group**
> update_user_group (user_group_id: INTEGER_32 ; name: STRING_32 ; description: STRING_32 ): detachable JSON_SUCCESS
	

Update a user group

Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_group_id** | **INTEGER_32**| The ID of the target user group.  | [default to null]
 **name** | **STRING_32**| The new name of the group.  | [default to null]
 **description** | **STRING_32**| The new description of the group.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_user_group_members**
> update_user_group_members (user_group_id: INTEGER_32 ; delete:  detachable LIST [INTEGER_32] ; add:  detachable LIST [INTEGER_32] ): detachable JSON_SUCCESS
	

Update user group members

Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_group_id** | **INTEGER_32**| The ID of the target user group.  | [default to null]
 **delete** | [**LIST [INTEGER_32]**](INTEGER_32.md)| The list of user ids to be removed from the user group.  | [optional] [default to null]
 **add** | [**LIST [INTEGER_32]**](INTEGER_32.md)| The list of user ids to be added to the user group.  | [optional] [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user**
> user (user_id: INTEGER_32 ; client_gravatar:  detachable BOOLEAN ; include_custom_profile_fields:  detachable BOOLEAN ): detachable JSON_SUCCESS_BASE
	

Get a user

Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **INTEGER_32**| The target user&#39;s ID.  | [default to null]
 **client_gravatar** | **BOOLEAN**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **include_custom_profile_fields** | **BOOLEAN**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_by_email**
> user_by_email (email: STRING_32 ; client_gravatar:  detachable BOOLEAN ; include_custom_profile_fields:  detachable BOOLEAN ): detachable JSON_SUCCESS_BASE
	

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **STRING_32**| The email address of the user whose details you want to fetch.  | [default to null]
 **client_gravatar** | **BOOLEAN**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **include_custom_profile_fields** | **BOOLEAN**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_groups**
> user_groups : detachable JSON_SUCCESS_BASE
	

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 


### Parameters
This endpoint does not need any parameter.

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_presence**
> user_presence (user_id_or_email: STRING_32 ): detachable JSON_SUCCESS_BASE
	

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id_or_email** | **STRING_32**| The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  | [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users**
> users (client_gravatar:  detachable BOOLEAN ; include_custom_profile_fields:  detachable BOOLEAN ): detachable JSON_SUCCESS_BASE
	

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_gravatar** | **BOOLEAN**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **include_custom_profile_fields** | **BOOLEAN**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

