# PSOpenAPITools.PSOpenAPITools/Api.UsersApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**New-User**](UsersApi.md#New-User) | **POST** /users | Create a user
[**New-UserGroup**](UsersApi.md#New-UserGroup) | **POST** /user_groups/create | Create a user group
[**Invoke-DeactivateOwnUser**](UsersApi.md#Invoke-DeactivateOwnUser) | **DELETE** /users/me | Deactivate own user
[**Invoke-DeactivateUser**](UsersApi.md#Invoke-DeactivateUser) | **DELETE** /users/{user_id} | Deactivate a user
[**Get-Attachments**](UsersApi.md#Get-Attachments) | **GET** /attachments | Get attachments
[**Get-OwnUser**](UsersApi.md#Get-OwnUser) | **GET** /users/me | Get own user
[**Get-User**](UsersApi.md#Get-User) | **GET** /users/{user_id} | Get a user
[**Get-UserByEmail**](UsersApi.md#Get-UserByEmail) | **GET** /users/{email} | Get a user by email
[**Get-UserGroups**](UsersApi.md#Get-UserGroups) | **GET** /user_groups | Get user groups
[**Get-UserPresence**](UsersApi.md#Get-UserPresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
[**Get-Users**](UsersApi.md#Get-Users) | **GET** /users | Get all users
[**Invoke-MuteUser**](UsersApi.md#Invoke-MuteUser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
[**Invoke-ReactivateUser**](UsersApi.md#Invoke-ReactivateUser) | **POST** /users/{user_id}/reactivate | Reactivate a user
[**Remove-UserGroup**](UsersApi.md#Remove-UserGroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
[**Set-TypingStatus**](UsersApi.md#Set-TypingStatus) | **POST** /typing | Set &quot;&quot;typing&quot;&quot; status
[**Invoke-UnmuteUser**](UsersApi.md#Invoke-UnmuteUser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
[**Update-Settings**](UsersApi.md#Update-Settings) | **PATCH** /settings | Update settings
[**Update-Status**](UsersApi.md#Update-Status) | **POST** /users/me/status | Update your status
[**Update-User**](UsersApi.md#Update-User) | **PATCH** /users/{user_id} | Update a user
[**Update-UserGroup**](UsersApi.md#Update-UserGroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**Update-UserGroupMembers**](UsersApi.md#Update-UserGroupMembers) | **POST** /user_groups/{user_group_id}/members | Update user group members


<a name="New-User"></a>
# **New-User**
> JsonSuccessBase New-User<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Email] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Password] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FullName] <String><br>

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 

### Example
```powershell
$Email = "username@example.com" # String | The email address of the new user. 
$Password = "abcd1234" # String | The password of the new user. 
$FullName = "New User" # String | The full name of the new user. 

# Create a user
try {
    $Result = New-User -Email $Email -Password $Password -FullName $FullName
} catch {
    Write-Host ("Exception occured when calling New-User: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Email** | **String**| The email address of the new user.  | 
 **Password** | **String**| The password of the new user.  | 
 **FullName** | **String**| The full name of the new user.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="New-UserGroup"></a>
# **New-UserGroup**
> JsonSuccess New-UserGroup<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Description] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Members] <System.Nullable[Int32][]><br>

Create a user group

Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 

### Example
```powershell
$Name = "marketing" # String | The name of the user group. 
$Description = "The marketing team." # String | The description of the user group. 
$Members = 0 # Int32[] | An array containing the user IDs of the initial members for the new user group. 

# Create a user group
try {
    $Result = New-UserGroup -Name $Name -Description $Description -Members $Members
} catch {
    Write-Host ("Exception occured when calling New-UserGroup: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Name** | **String**| The name of the user group.  | 
 **Description** | **String**| The description of the user group.  | 
 **Members** | [**Int32[]**](Int32.md)| An array containing the user IDs of the initial members for the new user group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-DeactivateOwnUser"></a>
# **Invoke-DeactivateOwnUser**
> JsonSuccess Invoke-DeactivateOwnUser<br>

Deactivate own user

Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 

### Example
```powershell

# Deactivate own user
try {
    $Result = Invoke-DeactivateOwnUser
} catch {
    Write-Host ("Exception occured when calling Invoke-DeactivateOwnUser: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-DeactivateUser"></a>
# **Invoke-DeactivateUser**
> JsonSuccess Invoke-DeactivateUser<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserId] <Int32><br>

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 

### Example
```powershell
$UserId = 12 # Int32 | The target user's ID. 

# Deactivate a user
try {
    $Result = Invoke-DeactivateUser -UserId $UserId
} catch {
    Write-Host ("Exception occured when calling Invoke-DeactivateUser: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UserId** | **Int32**| The target user&#39;s ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-Attachments"></a>
# **Get-Attachments**
> JsonSuccessBase Get-Attachments<br>

Get attachments

Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 

### Example
```powershell

# Get attachments
try {
    $Result = Get-Attachments
} catch {
    Write-Host ("Exception occured when calling Get-Attachments: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-OwnUser"></a>
# **Get-OwnUser**
> JsonSuccessBase Get-OwnUser<br>

Get own user

Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 

### Example
```powershell

# Get own user
try {
    $Result = Get-OwnUser
} catch {
    Write-Host ("Exception occured when calling Get-OwnUser: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-User"></a>
# **Get-User**
> JsonSuccessBase Get-User<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserId] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClientGravatar] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeCustomProfileFields] <System.Nullable[Boolean]><br>

Get a user

Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 

### Example
```powershell
$UserId = 12 # Int32 | The target user's ID. 
$ClientGravatar = $true # Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to $false)
$IncludeCustomProfileFields = $true # Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) (default to $false)

# Get a user
try {
    $Result = Get-User -UserId $UserId -ClientGravatar $ClientGravatar -IncludeCustomProfileFields $IncludeCustomProfileFields
} catch {
    Write-Host ("Exception occured when calling Get-User: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UserId** | **Int32**| The target user&#39;s ID.  | 
 **ClientGravatar** | **Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to $false]
 **IncludeCustomProfileFields** | **Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to $false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-UserByEmail"></a>
# **Get-UserByEmail**
> JsonSuccessBase Get-UserByEmail<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Email] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClientGravatar] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeCustomProfileFields] <System.Nullable[Boolean]><br>

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 

### Example
```powershell
$Email = "iago@zulip.com" # String | The email address of the user whose details you want to fetch. 
$ClientGravatar = $true # Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to $false)
$IncludeCustomProfileFields = $true # Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) (default to $false)

# Get a user by email
try {
    $Result = Get-UserByEmail -Email $Email -ClientGravatar $ClientGravatar -IncludeCustomProfileFields $IncludeCustomProfileFields
} catch {
    Write-Host ("Exception occured when calling Get-UserByEmail: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Email** | **String**| The email address of the user whose details you want to fetch.  | 
 **ClientGravatar** | **Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to $false]
 **IncludeCustomProfileFields** | **Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to $false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-UserGroups"></a>
# **Get-UserGroups**
> JsonSuccessBase Get-UserGroups<br>

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 

### Example
```powershell

# Get user groups
try {
    $Result = Get-UserGroups
} catch {
    Write-Host ("Exception occured when calling Get-UserGroups: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-UserPresence"></a>
# **Get-UserPresence**
> JsonSuccessBase Get-UserPresence<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserIdOrEmail] <String><br>

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 

### Example
```powershell
$UserIdOrEmail = "iago@zulip.com" # String | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 

# Get user presence
try {
    $Result = Get-UserPresence -UserIdOrEmail $UserIdOrEmail
} catch {
    Write-Host ("Exception occured when calling Get-UserPresence: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UserIdOrEmail** | **String**| The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-Users"></a>
# **Get-Users**
> JsonSuccessBase Get-Users<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClientGravatar] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeCustomProfileFields] <System.Nullable[Boolean]><br>

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 

### Example
```powershell
$ClientGravatar = $true # Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to $false)
$IncludeCustomProfileFields = $true # Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) (default to $false)

# Get all users
try {
    $Result = Get-Users -ClientGravatar $ClientGravatar -IncludeCustomProfileFields $IncludeCustomProfileFields
} catch {
    Write-Host ("Exception occured when calling Get-Users: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ClientGravatar** | **Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to $false]
 **IncludeCustomProfileFields** | **Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to $false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-MuteUser"></a>
# **Invoke-MuteUser**
> JsonSuccess Invoke-MuteUser<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MutedUserId] <Int32><br>

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as ""Muted user"", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing ""All users that exist   on this stream or realm"", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example
```powershell
$MutedUserId = 10 # Int32 | The ID of the user to mute/un-mute. 

# Mute a user
try {
    $Result = Invoke-MuteUser -MutedUserId $MutedUserId
} catch {
    Write-Host ("Exception occured when calling Invoke-MuteUser: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **MutedUserId** | **Int32**| The ID of the user to mute/un-mute.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-ReactivateUser"></a>
# **Invoke-ReactivateUser**
> AnyType Invoke-ReactivateUser<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserId] <Int32><br>

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 

### Example
```powershell
$UserId = 12 # Int32 | The target user's ID. 

# Reactivate a user
try {
    $Result = Invoke-ReactivateUser -UserId $UserId
} catch {
    Write-Host ("Exception occured when calling Invoke-ReactivateUser: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UserId** | **Int32**| The target user&#39;s ID.  | 

### Return type

[**AnyType**](AnyType.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Remove-UserGroup"></a>
# **Remove-UserGroup**
> JsonSuccess Remove-UserGroup<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserGroupId] <Int32><br>

Delete a user group

Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 

### Example
```powershell
$UserGroupId = 1 # Int32 | The ID of the target user group. 

# Delete a user group
try {
    $Result = Remove-UserGroup -UserGroupId $UserGroupId
} catch {
    Write-Host ("Exception occured when calling Remove-UserGroup: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UserGroupId** | **Int32**| The ID of the target user group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Set-TypingStatus"></a>
# **Set-TypingStatus**
> JsonSuccess Set-TypingStatus<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Op] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-To] <System.Nullable[Int32][]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Type] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Topic] <String><br>

Set ""typing"" status

Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=""start""` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=""stop""` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a ""start"" operation for that   compose action). * Start displaying ""Sender is typing"" for a given conversation when the client   receives an `op=""start""` event from the [events API](/api/get-events). * Continue displaying ""Sender is typing"" until they receive an `op=""stop""` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=""start""` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 

### Example
```powershell
$Op = "start" # String | Whether the user has started (`start`) or stopped (`stop`) to type. 
$To = 0 # Int32[] | For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
$Type = "private" # String | Type of the message being composed.  (optional) (default to "private")
$Topic = "typing notifications" # String | Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type.  (optional)

# Set ""typing"" status
try {
    $Result = Set-TypingStatus -Op $Op -To $To -Type $Type -Topic $Topic
} catch {
    Write-Host ("Exception occured when calling Set-TypingStatus: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Op** | **String**| Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type.  | 
 **To** | [**Int32[]**](Int32.md)| For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  | 
 **Type** | **String**| Type of the message being composed.  | [optional] [default to &quot;private&quot;]
 **Topic** | **String**| Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-UnmuteUser"></a>
# **Invoke-UnmuteUser**
> JsonSuccess Invoke-UnmuteUser<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MutedUserId] <Int32><br>

Unmute a user

This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example
```powershell
$MutedUserId = 10 # Int32 | The ID of the user to mute/un-mute. 

# Unmute a user
try {
    $Result = Invoke-UnmuteUser -MutedUserId $MutedUserId
} catch {
    Write-Host ("Exception occured when calling Invoke-UnmuteUser: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **MutedUserId** | **Int32**| The ID of the user to mute/un-mute.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Update-Settings"></a>
# **Update-Settings**
> JsonSuccessBase Update-Settings<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FullName] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Email] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OldPassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-NewPassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TwentyFourHourTime] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DenseMode] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StarredMessageCounts] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FluidLayoutWidth] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-HighContrastMode] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ColorScheme] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableDraftsSynchronization] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TranslateEmoticons] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DefaultLanguage] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DefaultView] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LeftSideUserlist] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Emojiset] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DemoteInactiveStreams] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Timezone] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableStreamDesktopNotifications] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableStreamEmailNotifications] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableStreamPushNotifications] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableStreamAudibleNotifications] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-NotificationSound] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableDesktopNotifications] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableSounds] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EmailNotificationsBatchingPeriodSeconds] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableOfflineEmailNotifications] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableOfflinePushNotifications] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableOnlinePushNotifications] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableDigestEmails] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableMarketingEmails] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableLoginEmails] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MessageContentInEmailNotifications] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PmContentInDesktopNotifications] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-WildcardMentionsNotify] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DesktopIconCountDisplay] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RealmNameInNotifications] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PresenceEnabled] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnterSends] <System.Nullable[Boolean]><br>

Update settings

This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 

### Example
```powershell
$FullName = "NewName" # String | A new display name for the user.  (optional)
$Email = "newname@example.com" # String | Asks the server to initiate a confirmation sequence to change the user's email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address.  (optional)
$OldPassword = "old12345" # String | The user's old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the `new_password` parameter.  (optional)
$NewPassword = "new12345" # String | The user's new Zulip password (or LDAP password, if LDAP authentication is in use).  The `old_password` parameter must be included in the request.  (optional)
$TwentyFourHourTime = $true # Boolean | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
$DenseMode = $true # Boolean | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
$StarredMessageCounts = $true # Boolean | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
$FluidLayoutWidth = $true # Boolean | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
$HighContrastMode = $true # Boolean | This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
$ColorScheme = "1" # Int32 | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
$EnableDraftsSynchronization = $true # Boolean | A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87).  (optional)
$TranslateEmoticons = $true # Boolean | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
$DefaultLanguage = "en" # String | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `""en""` for English or `""de""` for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  (optional)
$DefaultView = "all_messages" # String | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * ""recent_topics"" - Recent topics view * ""all_messages"" - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
$LeftSideUserlist = $true # Boolean | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
$Emojiset = "google" # String | The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * ""google"" - Google modern * ""google-blob"" - Google classic * ""twitter"" - Twitter * ""text"" - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
$DemoteInactiveStreams = "1" # Int32 | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
$Timezone = "Asia/Kolkata" # String | The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
$EnableStreamDesktopNotifications = $true # Boolean | Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$EnableStreamEmailNotifications = $true # Boolean | Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$EnableStreamPushNotifications = $true # Boolean | Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$EnableStreamAudibleNotifications = $true # Boolean | Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$NotificationSound = "ding" # String | Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  (optional)
$EnableDesktopNotifications = $true # Boolean | Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$EnableSounds = $true # Boolean | Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$EmailNotificationsBatchingPeriodSeconds = 120 # Int32 | The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82)  (optional)
$EnableOfflineEmailNotifications = $true # Boolean | Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$EnableOfflinePushNotifications = $true # Boolean | Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$EnableOnlinePushNotifications = $true # Boolean | Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$EnableDigestEmails = $true # Boolean | Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$EnableMarketingEmails = $true # Boolean | Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$EnableLoginEmails = $true # Boolean | Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$MessageContentInEmailNotifications = $true # Boolean | Include the message's content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$PmContentInDesktopNotifications = $true # Boolean | Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$WildcardMentionsNotify = $true # Boolean | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$DesktopIconCountDisplay = "1" # Int32 | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$RealmNameInNotifications = $true # Boolean | Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$PresenceEnabled = $true # Boolean | Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
$EnterSends = $true # Boolean | Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the `POST /users/me/enter-sends` endpoint, with the same parameter format.  (optional)

# Update settings
try {
    $Result = Update-Settings -FullName $FullName -Email $Email -OldPassword $OldPassword -NewPassword $NewPassword -TwentyFourHourTime $TwentyFourHourTime -DenseMode $DenseMode -StarredMessageCounts $StarredMessageCounts -FluidLayoutWidth $FluidLayoutWidth -HighContrastMode $HighContrastMode -ColorScheme $ColorScheme -EnableDraftsSynchronization $EnableDraftsSynchronization -TranslateEmoticons $TranslateEmoticons -DefaultLanguage $DefaultLanguage -DefaultView $DefaultView -LeftSideUserlist $LeftSideUserlist -Emojiset $Emojiset -DemoteInactiveStreams $DemoteInactiveStreams -Timezone $Timezone -EnableStreamDesktopNotifications $EnableStreamDesktopNotifications -EnableStreamEmailNotifications $EnableStreamEmailNotifications -EnableStreamPushNotifications $EnableStreamPushNotifications -EnableStreamAudibleNotifications $EnableStreamAudibleNotifications -NotificationSound $NotificationSound -EnableDesktopNotifications $EnableDesktopNotifications -EnableSounds $EnableSounds -EmailNotificationsBatchingPeriodSeconds $EmailNotificationsBatchingPeriodSeconds -EnableOfflineEmailNotifications $EnableOfflineEmailNotifications -EnableOfflinePushNotifications $EnableOfflinePushNotifications -EnableOnlinePushNotifications $EnableOnlinePushNotifications -EnableDigestEmails $EnableDigestEmails -EnableMarketingEmails $EnableMarketingEmails -EnableLoginEmails $EnableLoginEmails -MessageContentInEmailNotifications $MessageContentInEmailNotifications -PmContentInDesktopNotifications $PmContentInDesktopNotifications -WildcardMentionsNotify $WildcardMentionsNotify -DesktopIconCountDisplay $DesktopIconCountDisplay -RealmNameInNotifications $RealmNameInNotifications -PresenceEnabled $PresenceEnabled -EnterSends $EnterSends
} catch {
    Write-Host ("Exception occured when calling Update-Settings: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FullName** | **String**| A new display name for the user.  | [optional] 
 **Email** | **String**| Asks the server to initiate a confirmation sequence to change the user&#39;s email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address.  | [optional] 
 **OldPassword** | **String**| The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the &#x60;new_password&#x60; parameter.  | [optional] 
 **NewPassword** | **String**| The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).  The &#x60;old_password&#x60; parameter must be included in the request.  | [optional] 
 **TwentyFourHourTime** | **Boolean**| Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **DenseMode** | **Boolean**| This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **StarredMessageCounts** | **Boolean**| Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **FluidLayoutWidth** | **Boolean**| Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **HighContrastMode** | **Boolean**| This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **ColorScheme** | **Int32**| Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **EnableDraftsSynchronization** | **Boolean**| A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87).  | [optional] 
 **TranslateEmoticons** | **Boolean**| Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **DefaultLanguage** | **String**| What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;&quot;&quot;en&quot;&quot;&#x60; for English or &#x60;&quot;&quot;de&quot;&quot;&#x60; for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  | [optional] 
 **DefaultView** | **String**| The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * &quot;&quot;recent_topics&quot;&quot; - Recent topics view * &quot;&quot;all_messages&quot;&quot; - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] 
 **LeftSideUserlist** | **Boolean**| Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **Emojiset** | **String**| The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * &quot;&quot;google&quot;&quot; - Google modern * &quot;&quot;google-blob&quot;&quot; - Google classic * &quot;&quot;twitter&quot;&quot; - Twitter * &quot;&quot;text&quot;&quot; - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] 
 **DemoteInactiveStreams** | **Int32**| Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **Timezone** | **String**| The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] 
 **EnableStreamDesktopNotifications** | **Boolean**| Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **EnableStreamEmailNotifications** | **Boolean**| Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **EnableStreamPushNotifications** | **Boolean**| Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **EnableStreamAudibleNotifications** | **Boolean**| Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **NotificationSound** | **String**| Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  | [optional] 
 **EnableDesktopNotifications** | **Boolean**| Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **EnableSounds** | **Boolean**| Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **EmailNotificationsBatchingPeriodSeconds** | **Int32**| The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82)  | [optional] 
 **EnableOfflineEmailNotifications** | **Boolean**| Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **EnableOfflinePushNotifications** | **Boolean**| Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **EnableOnlinePushNotifications** | **Boolean**| Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **EnableDigestEmails** | **Boolean**| Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **EnableMarketingEmails** | **Boolean**| Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **EnableLoginEmails** | **Boolean**| Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **MessageContentInEmailNotifications** | **Boolean**| Include the message&#39;s content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **PmContentInDesktopNotifications** | **Boolean**| Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **WildcardMentionsNotify** | **Boolean**| Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **DesktopIconCountDisplay** | **Int32**| Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **RealmNameInNotifications** | **Boolean**| Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **PresenceEnabled** | **Boolean**| Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **EnterSends** | **Boolean**| Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the &#x60;POST /users/me/enter-sends&#x60; endpoint, with the same parameter format.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Update-Status"></a>
# **Update-Status**
> JsonSuccess Update-Status<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StatusText] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Away] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EmojiName] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EmojiCode] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ReactionType] <String><br>

Update your status

Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 

### Example
```powershell
$StatusText = "on vacation" # String | The text content of the status message. Sending the empty string will clear the user's status.  **Note**: The limit on the size of the message is 60 characters.  (optional)
$Away = $true # Boolean | Whether the user should be marked as ""away"".  (optional)
$EmojiName = "car" # String | The name for the emoji to associate with this status.  (optional)
$EmojiCode = "1f697" # String | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji.  (optional)
$ReactionType = "unicode_emoji" # String | One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.  (optional)

# Update your status
try {
    $Result = Update-Status -StatusText $StatusText -Away $Away -EmojiName $EmojiName -EmojiCode $EmojiCode -ReactionType $ReactionType
} catch {
    Write-Host ("Exception occured when calling Update-Status: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StatusText** | **String**| The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters.  | [optional] 
 **Away** | **Boolean**| Whether the user should be marked as &quot;&quot;away&quot;&quot;.  | [optional] 
 **EmojiName** | **String**| The name for the emoji to associate with this status.  | [optional] 
 **EmojiCode** | **String**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji.  | [optional] 
 **ReactionType** | **String**| One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Update-User"></a>
# **Update-User**
> JsonSuccess Update-User<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserId] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FullName] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Role] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProfileData] <PSCustomObject[]><br>

Update a user

Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 

### Example
```powershell
$UserId = 12 # Int32 | The target user's ID. 
$FullName = "MyFullName" # String | The user's full name.  (optional)
$Role = 400 # Int32 | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  (optional)
$ProfileData =  # SystemCollectionsHashtable[] | A dictionary containing the to be updated custom profile field data for the user.  (optional)

# Update a user
try {
    $Result = Update-User -UserId $UserId -FullName $FullName -Role $Role -ProfileData $ProfileData
} catch {
    Write-Host ("Exception occured when calling Update-User: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UserId** | **Int32**| The target user&#39;s ID.  | 
 **FullName** | **String**| The user&#39;s full name.  | [optional] 
 **Role** | **Int32**| New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | [optional] 
 **ProfileData** | [**SystemCollectionsHashtable[]**](SystemCollectionsHashtable.md)| A dictionary containing the to be updated custom profile field data for the user.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Update-UserGroup"></a>
# **Update-UserGroup**
> JsonSuccess Update-UserGroup<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserGroupId] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Description] <String><br>

Update a user group

Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 

### Example
```powershell
$UserGroupId = 1 # Int32 | The ID of the target user group. 
$Name = "marketing team" # String | The new name of the group. 
$Description = "The marketing team." # String | The new description of the group. 

# Update a user group
try {
    $Result = Update-UserGroup -UserGroupId $UserGroupId -Name $Name -Description $Description
} catch {
    Write-Host ("Exception occured when calling Update-UserGroup: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UserGroupId** | **Int32**| The ID of the target user group.  | 
 **Name** | **String**| The new name of the group.  | 
 **Description** | **String**| The new description of the group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Update-UserGroupMembers"></a>
# **Update-UserGroupMembers**
> JsonSuccess Update-UserGroupMembers<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserGroupId] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Delete] <System.Nullable[Int32][]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Add] <System.Nullable[Int32][]><br>

Update user group members

Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 

### Example
```powershell
$UserGroupId = 1 # Int32 | The ID of the target user group. 
$Delete = 0 # Int32[] | The list of user ids to be removed from the user group.  (optional)
$Add = 0 # Int32[] | The list of user ids to be added to the user group.  (optional)

# Update user group members
try {
    $Result = Update-UserGroupMembers -UserGroupId $UserGroupId -Delete $Delete -Add $Add
} catch {
    Write-Host ("Exception occured when calling Update-UserGroupMembers: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UserGroupId** | **Int32**| The ID of the target user group.  | 
 **Delete** | [**Int32[]**](Int32.md)| The list of user ids to be removed from the user group.  | [optional] 
 **Add** | [**Int32[]**](Int32.md)| The list of user ids to be added to the user group.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

