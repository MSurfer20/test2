# users_api

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateUser**](users_api.md#CreateUser) | **POST** /users | Create a user
[**CreateUserGroup**](users_api.md#CreateUserGroup) | **POST** /user_groups/create | Create a user group
[**DeactivateOwnUser**](users_api.md#DeactivateOwnUser) | **DELETE** /users/me | Deactivate own user
[**DeactivateUser**](users_api.md#DeactivateUser) | **DELETE** /users/{user_id} | Deactivate a user
[**GetAttachments**](users_api.md#GetAttachments) | **GET** /attachments | Get attachments
[**GetOwnUser**](users_api.md#GetOwnUser) | **GET** /users/me | Get own user
[**GetUser**](users_api.md#GetUser) | **GET** /users/{user_id} | Get a user
[**GetUserByEmail**](users_api.md#GetUserByEmail) | **GET** /users/{email} | Get a user by email
[**GetUserGroups**](users_api.md#GetUserGroups) | **GET** /user_groups | Get user groups
[**GetUserPresence**](users_api.md#GetUserPresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
[**GetUsers**](users_api.md#GetUsers) | **GET** /users | Get all users
[**MuteUser**](users_api.md#MuteUser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
[**ReactivateUser**](users_api.md#ReactivateUser) | **POST** /users/{user_id}/reactivate | Reactivate a user
[**RemoveUserGroup**](users_api.md#RemoveUserGroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
[**SetTypingStatus**](users_api.md#SetTypingStatus) | **POST** /typing | Set \&quot;typing\&quot; status
[**UnmuteUser**](users_api.md#UnmuteUser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
[**UpdateDisplaySettings**](users_api.md#UpdateDisplaySettings) | **PATCH** /settings/display | Update display settings
[**UpdateNotificationSettings**](users_api.md#UpdateNotificationSettings) | **PATCH** /settings/notifications | Update notification settings
[**UpdateUser**](users_api.md#UpdateUser) | **PATCH** /users/{user_id} | Update a user
[**UpdateUserGroup**](users_api.md#UpdateUserGroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**UpdateUserGroupMembers**](users_api.md#UpdateUserGroupMembers) | **POST** /user_groups/{user_group_id}/members | Update user group members


<a name="CreateUser"></a>
# **CreateUser**
> JsonSuccessBase CreateUser(email, password, fullName)

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 
<a name="CreateUserGroup"></a>
# **CreateUserGroup**
> JsonSuccess CreateUserGroup(name, description, members)

Create a user group

Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 
<a name="DeactivateOwnUser"></a>
# **DeactivateOwnUser**
> JsonSuccess DeactivateOwnUser()

Deactivate own user

Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
<a name="DeactivateUser"></a>
# **DeactivateUser**
> JsonSuccess DeactivateUser(userId)

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 
<a name="GetAttachments"></a>
# **GetAttachments**
> JsonSuccessBase GetAttachments()

Get attachments

Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 
<a name="GetOwnUser"></a>
# **GetOwnUser**
> JsonSuccessBase GetOwnUser()

Get own user

Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; 
<a name="GetUser"></a>
# **GetUser**
> JsonSuccessBase GetUser(userId, clientGravatar, includeCustomProfileFields)

Get a user

Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
<a name="GetUserByEmail"></a>
# **GetUserByEmail**
> JsonSuccessBase GetUserByEmail(email, clientGravatar, includeCustomProfileFields)

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
<a name="GetUserGroups"></a>
# **GetUserGroups**
> JsonSuccessBase GetUserGroups()

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 
<a name="GetUserPresence"></a>
# **GetUserPresence**
> JsonSuccessBase GetUserPresence(userIdOrEmail)

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
<a name="GetUsers"></a>
# **GetUsers**
> JsonSuccessBase GetUsers(clientGravatar, includeCustomProfileFields)

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 
<a name="MuteUser"></a>
# **MuteUser**
> JsonSuccess MuteUser(mutedUserId)

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
<a name="ReactivateUser"></a>
# **ReactivateUser**
> AnyType ReactivateUser(userId)

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 
<a name="RemoveUserGroup"></a>
# **RemoveUserGroup**
> JsonSuccess RemoveUserGroup(userGroupId)

Delete a user group

Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
<a name="SetTypingStatus"></a>
# **SetTypingStatus**
> JsonSuccess SetTypingStatus(op, to, Type_, topic)

Set \&quot;typing\&quot; status

Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. 
<a name="UnmuteUser"></a>
# **UnmuteUser**
> JsonSuccess UnmuteUser(mutedUserId)

Unmute a user

This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 
<a name="UpdateDisplaySettings"></a>
# **UpdateDisplaySettings**
> JsonSuccessBase UpdateDisplaySettings(twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone)

Update display settings

This endpoint is used to edit the current user&#39;s user interface settings.  &#x60;PATCH {{ api_url }}/v1/settings/display&#x60; 
<a name="UpdateNotificationSettings"></a>
# **UpdateNotificationSettings**
> JsonSuccessBase UpdateNotificationSettings(enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled)

Update notification settings

This endpoint is used to edit the user&#39;s global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  &#x60;PATCH {{ api_url }}/v1/settings/notifications&#x60; 
<a name="UpdateUser"></a>
# **UpdateUser**
> JsonSuccess UpdateUser(userId, fullName, role, profileData)

Update a user

Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
<a name="UpdateUserGroup"></a>
# **UpdateUserGroup**
> JsonSuccess UpdateUserGroup(userGroupId, name, description)

Update a user group

Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 
<a name="UpdateUserGroupMembers"></a>
# **UpdateUserGroupMembers**
> JsonSuccess UpdateUserGroupMembers(userGroupId, delete, add)

Update user group members

Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 
