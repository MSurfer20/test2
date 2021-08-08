# OpenapiClient::UsersApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_user**](UsersApi.md#create_user) | **POST** /users | Create a user |
| [**create_user_group**](UsersApi.md#create_user_group) | **POST** /user_groups/create | Create a user group |
| [**deactivate_own_user**](UsersApi.md#deactivate_own_user) | **DELETE** /users/me | Deactivate own user |
| [**deactivate_user**](UsersApi.md#deactivate_user) | **DELETE** /users/{user_id} | Deactivate a user |
| [**get_attachments**](UsersApi.md#get_attachments) | **GET** /attachments | Get attachments |
| [**get_own_user**](UsersApi.md#get_own_user) | **GET** /users/me | Get own user |
| [**get_user**](UsersApi.md#get_user) | **GET** /users/{user_id} | Get a user |
| [**get_user_by_email**](UsersApi.md#get_user_by_email) | **GET** /users/{email} | Get a user by email |
| [**get_user_groups**](UsersApi.md#get_user_groups) | **GET** /user_groups | Get user groups |
| [**get_user_presence**](UsersApi.md#get_user_presence) | **GET** /users/{user_id_or_email}/presence | Get user presence |
| [**get_users**](UsersApi.md#get_users) | **GET** /users | Get all users |
| [**mute_user**](UsersApi.md#mute_user) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user |
| [**reactivate_user**](UsersApi.md#reactivate_user) | **POST** /users/{user_id}/reactivate | Reactivate a user |
| [**remove_user_group**](UsersApi.md#remove_user_group) | **DELETE** /user_groups/{user_group_id} | Delete a user group |
| [**set_typing_status**](UsersApi.md#set_typing_status) | **POST** /typing | Set \&quot;typing\&quot; status |
| [**unmute_user**](UsersApi.md#unmute_user) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user |
| [**update_settings**](UsersApi.md#update_settings) | **PATCH** /settings | Update settings |
| [**update_status**](UsersApi.md#update_status) | **POST** /users/me/status | Update your status |
| [**update_user**](UsersApi.md#update_user) | **PATCH** /users/{user_id} | Update a user |
| [**update_user_group**](UsersApi.md#update_user_group) | **PATCH** /user_groups/{user_group_id} | Update a user group |
| [**update_user_group_members**](UsersApi.md#update_user_group_members) | **POST** /user_groups/{user_group_id}/members | Update user group members |


## create_user

> <JsonSuccessBase> create_user(email, password, full_name)

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
email = 'username@example.com' # String | The email address of the new user. 
password = 'abcd1234' # String | The password of the new user. 
full_name = 'New User' # String | The full name of the new user. 

begin
  # Create a user
  result = api_instance.create_user(email, password, full_name)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->create_user: #{e}"
end
```

#### Using the create_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> create_user_with_http_info(email, password, full_name)

```ruby
begin
  # Create a user
  data, status_code, headers = api_instance.create_user_with_http_info(email, password, full_name)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->create_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **email** | **String** | The email address of the new user.  |  |
| **password** | **String** | The password of the new user.  |  |
| **full_name** | **String** | The full name of the new user.  |  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## create_user_group

> <JsonSuccess> create_user_group(name, description, members)

Create a user group

Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
name = 'marketing' # String | The name of the user group. 
description = 'The marketing team.' # String | The description of the user group. 
members = [37] # Array<Integer> | An array containing the user IDs of the initial members for the new user group. 

begin
  # Create a user group
  result = api_instance.create_user_group(name, description, members)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->create_user_group: #{e}"
end
```

#### Using the create_user_group_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> create_user_group_with_http_info(name, description, members)

```ruby
begin
  # Create a user group
  data, status_code, headers = api_instance.create_user_group_with_http_info(name, description, members)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->create_user_group_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The name of the user group.  |  |
| **description** | **String** | The description of the user group.  |  |
| **members** | [**Array&lt;Integer&gt;**](Integer.md) | An array containing the user IDs of the initial members for the new user group.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deactivate_own_user

> <JsonSuccess> deactivate_own_user

Deactivate own user

Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new

begin
  # Deactivate own user
  result = api_instance.deactivate_own_user
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->deactivate_own_user: #{e}"
end
```

#### Using the deactivate_own_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> deactivate_own_user_with_http_info

```ruby
begin
  # Deactivate own user
  data, status_code, headers = api_instance.deactivate_own_user_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->deactivate_own_user_with_http_info: #{e}"
end
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


## deactivate_user

> <JsonSuccess> deactivate_user(user_id)

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
user_id = 12 # Integer | The target user's ID. 

begin
  # Deactivate a user
  result = api_instance.deactivate_user(user_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->deactivate_user: #{e}"
end
```

#### Using the deactivate_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> deactivate_user_with_http_info(user_id)

```ruby
begin
  # Deactivate a user
  data, status_code, headers = api_instance.deactivate_user_with_http_info(user_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->deactivate_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_id** | **Integer** | The target user&#39;s ID.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_attachments

> <JsonSuccessBase> get_attachments

Get attachments

Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new

begin
  # Get attachments
  result = api_instance.get_attachments
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_attachments: #{e}"
end
```

#### Using the get_attachments_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_attachments_with_http_info

```ruby
begin
  # Get attachments
  data, status_code, headers = api_instance.get_attachments_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_attachments_with_http_info: #{e}"
end
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


## get_own_user

> <JsonSuccessBase> get_own_user

Get own user

Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new

begin
  # Get own user
  result = api_instance.get_own_user
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_own_user: #{e}"
end
```

#### Using the get_own_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_own_user_with_http_info

```ruby
begin
  # Get own user
  data, status_code, headers = api_instance.get_own_user_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_own_user_with_http_info: #{e}"
end
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


## get_user

> <JsonSuccessBase> get_user(user_id, opts)

Get a user

Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
user_id = 12 # Integer | The target user's ID. 
opts = {
  client_gravatar: true, # Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  include_custom_profile_fields: true # Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
}

begin
  # Get a user
  result = api_instance.get_user(user_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_user: #{e}"
end
```

#### Using the get_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_user_with_http_info(user_id, opts)

```ruby
begin
  # Get a user
  data, status_code, headers = api_instance.get_user_with_http_info(user_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_id** | **Integer** | The target user&#39;s ID.  |  |
| **client_gravatar** | **Boolean** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional][default to false] |
| **include_custom_profile_fields** | **Boolean** | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional][default to false] |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_user_by_email

> <JsonSuccessBase> get_user_by_email(email, opts)

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
email = 'iago@zulip.com' # String | The email address of the user whose details you want to fetch. 
opts = {
  client_gravatar: true, # Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  include_custom_profile_fields: true # Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
}

begin
  # Get a user by email
  result = api_instance.get_user_by_email(email, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_user_by_email: #{e}"
end
```

#### Using the get_user_by_email_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_user_by_email_with_http_info(email, opts)

```ruby
begin
  # Get a user by email
  data, status_code, headers = api_instance.get_user_by_email_with_http_info(email, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_user_by_email_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **email** | **String** | The email address of the user whose details you want to fetch.  |  |
| **client_gravatar** | **Boolean** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional][default to false] |
| **include_custom_profile_fields** | **Boolean** | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional][default to false] |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_user_groups

> <JsonSuccessBase> get_user_groups

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new

begin
  # Get user groups
  result = api_instance.get_user_groups
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_user_groups: #{e}"
end
```

#### Using the get_user_groups_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_user_groups_with_http_info

```ruby
begin
  # Get user groups
  data, status_code, headers = api_instance.get_user_groups_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_user_groups_with_http_info: #{e}"
end
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


## get_user_presence

> <JsonSuccessBase> get_user_presence(user_id_or_email)

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
user_id_or_email = 'iago@zulip.com' # String | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 

begin
  # Get user presence
  result = api_instance.get_user_presence(user_id_or_email)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_user_presence: #{e}"
end
```

#### Using the get_user_presence_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_user_presence_with_http_info(user_id_or_email)

```ruby
begin
  # Get user presence
  data, status_code, headers = api_instance.get_user_presence_with_http_info(user_id_or_email)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_user_presence_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_id_or_email** | **String** | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  |  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_users

> <JsonSuccessBase> get_users(opts)

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
opts = {
  client_gravatar: true, # Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
  include_custom_profile_fields: true # Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
}

begin
  # Get all users
  result = api_instance.get_users(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_users: #{e}"
end
```

#### Using the get_users_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_users_with_http_info(opts)

```ruby
begin
  # Get all users
  data, status_code, headers = api_instance.get_users_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_users_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **client_gravatar** | **Boolean** | Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional][default to false] |
| **include_custom_profile_fields** | **Boolean** | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional][default to false] |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## mute_user

> <JsonSuccess> mute_user(muted_user_id)

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
muted_user_id = 10 # Integer | The ID of the user to mute/un-mute. 

begin
  # Mute a user
  result = api_instance.mute_user(muted_user_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->mute_user: #{e}"
end
```

#### Using the mute_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> mute_user_with_http_info(muted_user_id)

```ruby
begin
  # Mute a user
  data, status_code, headers = api_instance.mute_user_with_http_info(muted_user_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->mute_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **muted_user_id** | **Integer** | The ID of the user to mute/un-mute.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## reactivate_user

> <AnyType> reactivate_user(user_id)

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
user_id = 12 # Integer | The target user's ID. 

begin
  # Reactivate a user
  result = api_instance.reactivate_user(user_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->reactivate_user: #{e}"
end
```

#### Using the reactivate_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AnyType>, Integer, Hash)> reactivate_user_with_http_info(user_id)

```ruby
begin
  # Reactivate a user
  data, status_code, headers = api_instance.reactivate_user_with_http_info(user_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AnyType>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->reactivate_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_id** | **Integer** | The target user&#39;s ID.  |  |

### Return type

[**AnyType**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## remove_user_group

> <JsonSuccess> remove_user_group(user_group_id)

Delete a user group

Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
user_group_id = 1 # Integer | The ID of the target user group. 

begin
  # Delete a user group
  result = api_instance.remove_user_group(user_group_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->remove_user_group: #{e}"
end
```

#### Using the remove_user_group_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> remove_user_group_with_http_info(user_group_id)

```ruby
begin
  # Delete a user group
  data, status_code, headers = api_instance.remove_user_group_with_http_info(user_group_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->remove_user_group_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_group_id** | **Integer** | The ID of the target user group.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## set_typing_status

> <JsonSuccess> set_typing_status(op, to, opts)

Set \"typing\" status

Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
op = 'start' # String | Whether the user has started (`start`) or stopped (`stop`) to type. 
to = [37] # Array<Integer> | For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
opts = {
  type: 'private', # String | Type of the message being composed. 
  topic: 'typing notifications' # String | Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. 
}

begin
  # Set \"typing\" status
  result = api_instance.set_typing_status(op, to, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->set_typing_status: #{e}"
end
```

#### Using the set_typing_status_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> set_typing_status_with_http_info(op, to, opts)

```ruby
begin
  # Set \"typing\" status
  data, status_code, headers = api_instance.set_typing_status_with_http_info(op, to, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->set_typing_status_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **op** | **String** | Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type.  |  |
| **to** | [**Array&lt;Integer&gt;**](Integer.md) | For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  |  |
| **type** | **String** | Type of the message being composed.  | [optional][default to &#39;private&#39;] |
| **topic** | **String** | Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  | [optional] |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## unmute_user

> <JsonSuccess> unmute_user(muted_user_id)

Unmute a user

This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
muted_user_id = 10 # Integer | The ID of the user to mute/un-mute. 

begin
  # Unmute a user
  result = api_instance.unmute_user(muted_user_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->unmute_user: #{e}"
end
```

#### Using the unmute_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> unmute_user_with_http_info(muted_user_id)

```ruby
begin
  # Unmute a user
  data, status_code, headers = api_instance.unmute_user_with_http_info(muted_user_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->unmute_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **muted_user_id** | **Integer** | The ID of the user to mute/un-mute.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_settings

> <JsonSuccessBase> update_settings(opts)

Update settings

This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
opts = {
  full_name: 'NewName', # String | A new display name for the user. 
  email: 'newname@example.com', # String | Asks the server to initiate a confirmation sequence to change the user's email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. 
  old_password: 'old12345', # String | The user's old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the `new_password` parameter. 
  new_password: 'new12345', # String | The user's new Zulip password (or LDAP password, if LDAP authentication is in use).  The `old_password` parameter must be included in the request. 
  twenty_four_hour_time: true, # Boolean | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  dense_mode: true, # Boolean | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  starred_message_counts: true, # Boolean | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  fluid_layout_width: true, # Boolean | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  high_contrast_mode: true, # Boolean | This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  color_scheme: 1, # Integer | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  enable_drafts_synchronization: true, # Boolean | A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). 
  translate_emoticons: true, # Boolean | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  default_language: 'en', # String | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
  default_view: 'all_messages', # String | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
  left_side_userlist: true, # Boolean | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  emojiset: 'google', # String | The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
  demote_inactive_streams: 1, # Integer | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
  timezone: 'Asia/Kolkata', # String | The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
  enable_stream_desktop_notifications: true, # Boolean | Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  enable_stream_email_notifications: true, # Boolean | Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  enable_stream_push_notifications: true, # Boolean | Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  enable_stream_audible_notifications: true, # Boolean | Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  notification_sound: 'ding', # String | Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
  enable_desktop_notifications: true, # Boolean | Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  enable_sounds: true, # Boolean | Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  email_notifications_batching_period_seconds: 120, # Integer | The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) 
  enable_offline_email_notifications: true, # Boolean | Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  enable_offline_push_notifications: true, # Boolean | Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  enable_online_push_notifications: true, # Boolean | Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  enable_digest_emails: true, # Boolean | Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  enable_marketing_emails: true, # Boolean | Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  enable_login_emails: true, # Boolean | Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  message_content_in_email_notifications: true, # Boolean | Include the message's content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  pm_content_in_desktop_notifications: true, # Boolean | Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  wildcard_mentions_notify: true, # Boolean | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  desktop_icon_count_display: 1, # Integer | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  realm_name_in_notifications: true, # Boolean | Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  presence_enabled: true, # Boolean | Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
  enter_sends: true # Boolean | Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the `POST /users/me/enter-sends` endpoint, with the same parameter format. 
}

begin
  # Update settings
  result = api_instance.update_settings(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->update_settings: #{e}"
end
```

#### Using the update_settings_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> update_settings_with_http_info(opts)

```ruby
begin
  # Update settings
  data, status_code, headers = api_instance.update_settings_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->update_settings_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **full_name** | **String** | A new display name for the user.  | [optional] |
| **email** | **String** | Asks the server to initiate a confirmation sequence to change the user&#39;s email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address.  | [optional] |
| **old_password** | **String** | The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the &#x60;new_password&#x60; parameter.  | [optional] |
| **new_password** | **String** | The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).  The &#x60;old_password&#x60; parameter must be included in the request.  | [optional] |
| **twenty_four_hour_time** | **Boolean** | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] |
| **dense_mode** | **Boolean** | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] |
| **starred_message_counts** | **Boolean** | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] |
| **fluid_layout_width** | **Boolean** | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] |
| **high_contrast_mode** | **Boolean** | This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] |
| **color_scheme** | **Integer** | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] |
| **enable_drafts_synchronization** | **Boolean** | A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87).  | [optional] |
| **translate_emoticons** | **Boolean** | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] |
| **default_language** | **String** | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  | [optional] |
| **default_view** | **String** | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] |
| **left_side_userlist** | **Boolean** | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] |
| **emojiset** | **String** | The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] |
| **demote_inactive_streams** | **Integer** | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] |
| **timezone** | **String** | The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] |
| **enable_stream_desktop_notifications** | **Boolean** | Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **enable_stream_email_notifications** | **Boolean** | Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **enable_stream_push_notifications** | **Boolean** | Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **enable_stream_audible_notifications** | **Boolean** | Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **notification_sound** | **String** | Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  | [optional] |
| **enable_desktop_notifications** | **Boolean** | Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **enable_sounds** | **Boolean** | Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **email_notifications_batching_period_seconds** | **Integer** | The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82)  | [optional] |
| **enable_offline_email_notifications** | **Boolean** | Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **enable_offline_push_notifications** | **Boolean** | Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **enable_online_push_notifications** | **Boolean** | Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **enable_digest_emails** | **Boolean** | Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **enable_marketing_emails** | **Boolean** | Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **enable_login_emails** | **Boolean** | Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **message_content_in_email_notifications** | **Boolean** | Include the message&#39;s content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **pm_content_in_desktop_notifications** | **Boolean** | Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **wildcard_mentions_notify** | **Boolean** | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **desktop_icon_count_display** | **Integer** | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **realm_name_in_notifications** | **Boolean** | Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **presence_enabled** | **Boolean** | Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] |
| **enter_sends** | **Boolean** | Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the &#x60;POST /users/me/enter-sends&#x60; endpoint, with the same parameter format.  | [optional] |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_status

> <JsonSuccess> update_status(opts)

Update your status

Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
opts = {
  status_text: 'on vacation', # String | The text content of the status message. Sending the empty string will clear the user's status.  **Note**: The limit on the size of the message is 60 characters. 
  away: true, # Boolean | Whether the user should be marked as \"away\". 
  emoji_name: 'car', # String | The name for the emoji to associate with this status. 
  emoji_code: '1f697', # String | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
  reaction_type: 'unicode_emoji' # String | One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
}

begin
  # Update your status
  result = api_instance.update_status(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->update_status: #{e}"
end
```

#### Using the update_status_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> update_status_with_http_info(opts)

```ruby
begin
  # Update your status
  data, status_code, headers = api_instance.update_status_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->update_status_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status_text** | **String** | The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters.  | [optional] |
| **away** | **Boolean** | Whether the user should be marked as \&quot;away\&quot;.  | [optional] |
| **emoji_name** | **String** | The name for the emoji to associate with this status.  | [optional] |
| **emoji_code** | **String** | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji.  | [optional] |
| **reaction_type** | **String** | One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji.  | [optional] |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_user

> <JsonSuccess> update_user(user_id, opts)

Update a user

Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
user_id = 12 # Integer | The target user's ID. 
opts = {
  full_name: 'full_name_example', # String | The user's full name. 
  role: 400, # Integer | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
  profile_data: [3.56] # Array<Object> | A dictionary containing the to be updated custom profile field data for the user. 
}

begin
  # Update a user
  result = api_instance.update_user(user_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->update_user: #{e}"
end
```

#### Using the update_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> update_user_with_http_info(user_id, opts)

```ruby
begin
  # Update a user
  data, status_code, headers = api_instance.update_user_with_http_info(user_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->update_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_id** | **Integer** | The target user&#39;s ID.  |  |
| **full_name** | **String** | The user&#39;s full name.  | [optional] |
| **role** | **Integer** | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | [optional] |
| **profile_data** | [**Array&lt;Object&gt;**](Object.md) | A dictionary containing the to be updated custom profile field data for the user.  | [optional] |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_user_group

> <JsonSuccess> update_user_group(user_group_id, name, description)

Update a user group

Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
user_group_id = 1 # Integer | The ID of the target user group. 
name = 'marketing team' # String | The new name of the group. 
description = 'The marketing team.' # String | The new description of the group. 

begin
  # Update a user group
  result = api_instance.update_user_group(user_group_id, name, description)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->update_user_group: #{e}"
end
```

#### Using the update_user_group_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> update_user_group_with_http_info(user_group_id, name, description)

```ruby
begin
  # Update a user group
  data, status_code, headers = api_instance.update_user_group_with_http_info(user_group_id, name, description)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->update_user_group_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_group_id** | **Integer** | The ID of the target user group.  |  |
| **name** | **String** | The new name of the group.  |  |
| **description** | **String** | The new description of the group.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_user_group_members

> <JsonSuccess> update_user_group_members(user_group_id, opts)

Update user group members

Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
user_group_id = 1 # Integer | The ID of the target user group. 
opts = {
  delete: [37], # Array<Integer> | The list of user ids to be removed from the user group. 
  add: [37] # Array<Integer> | The list of user ids to be added to the user group. 
}

begin
  # Update user group members
  result = api_instance.update_user_group_members(user_group_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->update_user_group_members: #{e}"
end
```

#### Using the update_user_group_members_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> update_user_group_members_with_http_info(user_group_id, opts)

```ruby
begin
  # Update user group members
  data, status_code, headers = api_instance.update_user_group_members_with_http_info(user_group_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->update_user_group_members_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_group_id** | **Integer** | The ID of the target user group.  |  |
| **delete** | [**Array&lt;Integer&gt;**](Integer.md) | The list of user ids to be removed from the user group.  | [optional] |
| **add** | [**Array&lt;Integer&gt;**](Integer.md) | The list of user ids to be added to the user group.  | [optional] |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

