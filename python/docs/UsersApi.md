# openapi_client.UsersApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_user**](UsersApi.md#create_user) | **POST** /users | Create a user
[**create_user_group**](UsersApi.md#create_user_group) | **POST** /user_groups/create | Create a user group
[**deactivate_own_user**](UsersApi.md#deactivate_own_user) | **DELETE** /users/me | Deactivate own user
[**deactivate_user**](UsersApi.md#deactivate_user) | **DELETE** /users/{user_id} | Deactivate a user
[**get_attachments**](UsersApi.md#get_attachments) | **GET** /attachments | Get attachments
[**get_own_user**](UsersApi.md#get_own_user) | **GET** /users/me | Get own user
[**get_user**](UsersApi.md#get_user) | **GET** /users/{user_id} | Get a user
[**get_user_by_email**](UsersApi.md#get_user_by_email) | **GET** /users/{email} | Get a user by email
[**get_user_groups**](UsersApi.md#get_user_groups) | **GET** /user_groups | Get user groups
[**get_user_presence**](UsersApi.md#get_user_presence) | **GET** /users/{user_id_or_email}/presence | Get user presence
[**get_users**](UsersApi.md#get_users) | **GET** /users | Get all users
[**mute_user**](UsersApi.md#mute_user) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
[**reactivate_user**](UsersApi.md#reactivate_user) | **POST** /users/{user_id}/reactivate | Reactivate a user
[**remove_user_group**](UsersApi.md#remove_user_group) | **DELETE** /user_groups/{user_group_id} | Delete a user group
[**set_typing_status**](UsersApi.md#set_typing_status) | **POST** /typing | Set \&quot;typing\&quot; status
[**unmute_user**](UsersApi.md#unmute_user) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
[**update_settings**](UsersApi.md#update_settings) | **PATCH** /settings | Update settings
[**update_status**](UsersApi.md#update_status) | **POST** /users/me/status | Update your status
[**update_user**](UsersApi.md#update_user) | **PATCH** /users/{user_id} | Update a user
[**update_user_group**](UsersApi.md#update_user_group) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**update_user_group_members**](UsersApi.md#update_user_group_members) | **POST** /user_groups/{user_group_id}/members | Update user group members


# **create_user**
> dict create_user(email, password, full_name)

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    email = "username@example.com" # str | The email address of the new user. 
    password = "abcd1234" # str | The password of the new user. 
    full_name = "New User" # str | The full name of the new user. 

    # example passing only required values which don't have defaults set
    try:
        # Create a user
        api_response = api_instance.create_user(email, password, full_name)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->create_user: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**| The email address of the new user.  |
 **password** | **str**| The password of the new user.  |
 **full_name** | **str**| The full name of the new user.  |

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_user_group**
> dict create_user_group(name, description, members)

Create a user group

Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    name = "marketing" # str | The name of the user group. 
    description = "The marketing team." # str | The description of the user group. 
    members =  # [int] | An array containing the user IDs of the initial members for the new user group. 

    # example passing only required values which don't have defaults set
    try:
        # Create a user group
        api_response = api_instance.create_user_group(name, description, members)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->create_user_group: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the user group.  |
 **description** | **str**| The description of the user group.  |
 **members** | **[int]**| An array containing the user IDs of the initial members for the new user group.  |

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivate_own_user**
> dict deactivate_own_user()

Deactivate own user

Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Deactivate own user
        api_response = api_instance.deactivate_own_user()
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->deactivate_own_user: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivate_user**
> dict deactivate_user(user_id)

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    user_id = 12 # int | The target user's ID. 

    # example passing only required values which don't have defaults set
    try:
        # Deactivate a user
        api_response = api_instance.deactivate_user(user_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->deactivate_user: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| The target user&#39;s ID.  |

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_attachments**
> dict get_attachments()

Get attachments

Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get attachments
        api_response = api_instance.get_attachments()
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->get_attachments: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_own_user**
> dict get_own_user()

Get own user

Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get own user
        api_response = api_instance.get_own_user()
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->get_own_user: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user**
> dict get_user(user_id)

Get a user

Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    user_id = 12 # int | The target user's ID. 
    client_gravatar = True # bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) if omitted the server will use the default value of False
    include_custom_profile_fields = True # bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) if omitted the server will use the default value of False

    # example passing only required values which don't have defaults set
    try:
        # Get a user
        api_response = api_instance.get_user(user_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->get_user: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get a user
        api_response = api_instance.get_user(user_id, client_gravatar=client_gravatar, include_custom_profile_fields=include_custom_profile_fields)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->get_user: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| The target user&#39;s ID.  |
 **client_gravatar** | **bool**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] if omitted the server will use the default value of False
 **include_custom_profile_fields** | **bool**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] if omitted the server will use the default value of False

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_by_email**
> dict get_user_by_email(email)

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    email = "iago@zulip.com" # str | The email address of the user whose details you want to fetch. 
    client_gravatar = True # bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) if omitted the server will use the default value of False
    include_custom_profile_fields = True # bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) if omitted the server will use the default value of False

    # example passing only required values which don't have defaults set
    try:
        # Get a user by email
        api_response = api_instance.get_user_by_email(email)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->get_user_by_email: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get a user by email
        api_response = api_instance.get_user_by_email(email, client_gravatar=client_gravatar, include_custom_profile_fields=include_custom_profile_fields)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->get_user_by_email: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**| The email address of the user whose details you want to fetch.  |
 **client_gravatar** | **bool**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] if omitted the server will use the default value of False
 **include_custom_profile_fields** | **bool**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] if omitted the server will use the default value of False

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_groups**
> dict get_user_groups()

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get user groups
        api_response = api_instance.get_user_groups()
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->get_user_groups: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_presence**
> dict get_user_presence(user_id_or_email)

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    user_id_or_email = "iago@zulip.com" # str | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 

    # example passing only required values which don't have defaults set
    try:
        # Get user presence
        api_response = api_instance.get_user_presence(user_id_or_email)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->get_user_presence: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id_or_email** | **str**| The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  |

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_users**
> dict get_users()

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    client_gravatar = True # bool | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) if omitted the server will use the default value of False
    include_custom_profile_fields = True # bool | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) if omitted the server will use the default value of False

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get all users
        api_response = api_instance.get_users(client_gravatar=client_gravatar, include_custom_profile_fields=include_custom_profile_fields)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->get_users: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_gravatar** | **bool**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] if omitted the server will use the default value of False
 **include_custom_profile_fields** | **bool**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] if omitted the server will use the default value of False

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mute_user**
> dict mute_user(muted_user_id)

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    muted_user_id = 10 # int | The ID of the user to mute/un-mute. 

    # example passing only required values which don't have defaults set
    try:
        # Mute a user
        api_response = api_instance.mute_user(muted_user_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->mute_user: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muted_user_id** | **int**| The ID of the user to mute/un-mute.  |

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reactivate_user**
> dict reactivate_user(user_id)

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    user_id = 12 # int | The target user's ID. 

    # example passing only required values which don't have defaults set
    try:
        # Reactivate a user
        api_response = api_instance.reactivate_user(user_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->reactivate_user: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| The target user&#39;s ID.  |

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_user_group**
> dict remove_user_group(user_group_id)

Delete a user group

Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    user_group_id = 1 # int | The ID of the target user group. 

    # example passing only required values which don't have defaults set
    try:
        # Delete a user group
        api_response = api_instance.remove_user_group(user_group_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->remove_user_group: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_group_id** | **int**| The ID of the target user group.  |

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_typing_status**
> dict set_typing_status(op, to)

Set \"typing\" status

Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    op = "start" # str | Whether the user has started (`start`) or stopped (`stop`) to type. 
    to =  # [int] | For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
    type = "private" # str | Type of the message being composed.  (optional) if omitted the server will use the default value of "private"
    topic = "typing notifications" # str | Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type.  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Set \"typing\" status
        api_response = api_instance.set_typing_status(op, to)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->set_typing_status: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Set \"typing\" status
        api_response = api_instance.set_typing_status(op, to, type=type, topic=topic)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->set_typing_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | **str**| Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type.  |
 **to** | **[int]**| For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  |
 **type** | **str**| Type of the message being composed.  | [optional] if omitted the server will use the default value of "private"
 **topic** | **str**| Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  | [optional]

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unmute_user**
> dict unmute_user(muted_user_id)

Unmute a user

This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    muted_user_id = 10 # int | The ID of the user to mute/un-mute. 

    # example passing only required values which don't have defaults set
    try:
        # Unmute a user
        api_response = api_instance.unmute_user(muted_user_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->unmute_user: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muted_user_id** | **int**| The ID of the user to mute/un-mute.  |

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_settings**
> dict update_settings()

Update settings

This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    full_name = "NewName" # str | A new display name for the user.  (optional)
    email = "newname@example.com" # str | Asks the server to initiate a confirmation sequence to change the user's email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address.  (optional)
    old_password = "old12345" # str | The user's old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the `new_password` parameter.  (optional)
    new_password = "new12345" # str | The user's new Zulip password (or LDAP password, if LDAP authentication is in use).  The `old_password` parameter must be included in the request.  (optional)
    twenty_four_hour_time = True # bool | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
    dense_mode = True # bool | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
    starred_message_counts = True # bool | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
    fluid_layout_width = True # bool | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
    high_contrast_mode = True # bool | This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
    color_scheme =  # int | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
    enable_drafts_synchronization = True # bool | A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87).  (optional)
    translate_emoticons = True # bool | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
    default_language = "en" # str | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  (optional)
    default_view = "all_messages" # str | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
    left_side_userlist = True # bool | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
    emojiset = "google" # str | The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
    demote_inactive_streams =  # int | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
    timezone = "Asia/Kolkata" # str | The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
    enable_stream_desktop_notifications = True # bool | Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    enable_stream_email_notifications = True # bool | Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    enable_stream_push_notifications = True # bool | Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    enable_stream_audible_notifications = True # bool | Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    notification_sound = "ding" # str | Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  (optional)
    enable_desktop_notifications = True # bool | Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    enable_sounds = True # bool | Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    email_notifications_batching_period_seconds = 120 # int | The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82)  (optional)
    enable_offline_email_notifications = True # bool | Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    enable_offline_push_notifications = True # bool | Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    enable_online_push_notifications = True # bool | Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    enable_digest_emails = True # bool | Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    enable_marketing_emails = True # bool | Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    enable_login_emails = True # bool | Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    message_content_in_email_notifications = True # bool | Include the message's content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    pm_content_in_desktop_notifications = True # bool | Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    wildcard_mentions_notify = True # bool | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    desktop_icon_count_display =  # int | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    realm_name_in_notifications = True # bool | Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    presence_enabled = True # bool | Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
    enter_sends = True # bool | Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the `POST /users/me/enter-sends` endpoint, with the same parameter format.  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Update settings
        api_response = api_instance.update_settings(full_name=full_name, email=email, old_password=old_password, new_password=new_password, twenty_four_hour_time=twenty_four_hour_time, dense_mode=dense_mode, starred_message_counts=starred_message_counts, fluid_layout_width=fluid_layout_width, high_contrast_mode=high_contrast_mode, color_scheme=color_scheme, enable_drafts_synchronization=enable_drafts_synchronization, translate_emoticons=translate_emoticons, default_language=default_language, default_view=default_view, left_side_userlist=left_side_userlist, emojiset=emojiset, demote_inactive_streams=demote_inactive_streams, timezone=timezone, enable_stream_desktop_notifications=enable_stream_desktop_notifications, enable_stream_email_notifications=enable_stream_email_notifications, enable_stream_push_notifications=enable_stream_push_notifications, enable_stream_audible_notifications=enable_stream_audible_notifications, notification_sound=notification_sound, enable_desktop_notifications=enable_desktop_notifications, enable_sounds=enable_sounds, email_notifications_batching_period_seconds=email_notifications_batching_period_seconds, enable_offline_email_notifications=enable_offline_email_notifications, enable_offline_push_notifications=enable_offline_push_notifications, enable_online_push_notifications=enable_online_push_notifications, enable_digest_emails=enable_digest_emails, enable_marketing_emails=enable_marketing_emails, enable_login_emails=enable_login_emails, message_content_in_email_notifications=message_content_in_email_notifications, pm_content_in_desktop_notifications=pm_content_in_desktop_notifications, wildcard_mentions_notify=wildcard_mentions_notify, desktop_icon_count_display=desktop_icon_count_display, realm_name_in_notifications=realm_name_in_notifications, presence_enabled=presence_enabled, enter_sends=enter_sends)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->update_settings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **full_name** | **str**| A new display name for the user.  | [optional]
 **email** | **str**| Asks the server to initiate a confirmation sequence to change the user&#39;s email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address.  | [optional]
 **old_password** | **str**| The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the &#x60;new_password&#x60; parameter.  | [optional]
 **new_password** | **str**| The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).  The &#x60;old_password&#x60; parameter must be included in the request.  | [optional]
 **twenty_four_hour_time** | **bool**| Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **dense_mode** | **bool**| This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **starred_message_counts** | **bool**| Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **fluid_layout_width** | **bool**| Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **high_contrast_mode** | **bool**| This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **color_scheme** | **int**| Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **enable_drafts_synchronization** | **bool**| A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87).  | [optional]
 **translate_emoticons** | **bool**| Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **default_language** | **str**| What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  | [optional]
 **default_view** | **str**| The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional]
 **left_side_userlist** | **bool**| Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **emojiset** | **str**| The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional]
 **demote_inactive_streams** | **int**| Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **timezone** | **str**| The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional]
 **enable_stream_desktop_notifications** | **bool**| Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enable_stream_email_notifications** | **bool**| Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enable_stream_push_notifications** | **bool**| Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enable_stream_audible_notifications** | **bool**| Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **notification_sound** | **str**| Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  | [optional]
 **enable_desktop_notifications** | **bool**| Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enable_sounds** | **bool**| Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **email_notifications_batching_period_seconds** | **int**| The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82)  | [optional]
 **enable_offline_email_notifications** | **bool**| Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enable_offline_push_notifications** | **bool**| Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enable_online_push_notifications** | **bool**| Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enable_digest_emails** | **bool**| Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enable_marketing_emails** | **bool**| Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enable_login_emails** | **bool**| Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **message_content_in_email_notifications** | **bool**| Include the message&#39;s content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **pm_content_in_desktop_notifications** | **bool**| Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **wildcard_mentions_notify** | **bool**| Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **desktop_icon_count_display** | **int**| Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **realm_name_in_notifications** | **bool**| Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **presence_enabled** | **bool**| Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enter_sends** | **bool**| Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the &#x60;POST /users/me/enter-sends&#x60; endpoint, with the same parameter format.  | [optional]

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_status**
> dict update_status()

Update your status

Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    status_text = "on vacation" # str | The text content of the status message. Sending the empty string will clear the user's status.  **Note**: The limit on the size of the message is 60 characters.  (optional)
    away = True # bool | Whether the user should be marked as \"away\".  (optional)
    emoji_name = "car" # str | The name for the emoji to associate with this status.  (optional)
    emoji_code = "1f697" # str | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji.  (optional)
    reaction_type = "unicode_emoji" # str | One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Update your status
        api_response = api_instance.update_status(status_text=status_text, away=away, emoji_name=emoji_name, emoji_code=emoji_code, reaction_type=reaction_type)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->update_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status_text** | **str**| The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters.  | [optional]
 **away** | **bool**| Whether the user should be marked as \&quot;away\&quot;.  | [optional]
 **emoji_name** | **str**| The name for the emoji to associate with this status.  | [optional]
 **emoji_code** | **str**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji.  | [optional]
 **reaction_type** | **str**| One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji.  | [optional]

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Success. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_user**
> dict update_user(user_id)

Update a user

Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    user_id = 12 # int | The target user's ID. 
    full_name =  # str | The user's full name.  (optional)
    role = 400 # int | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  (optional)
    profile_data =  # [{str: (bool, date, datetime, dict, float, int, list, str, none_type)}] | A dictionary containing the to be updated custom profile field data for the user.  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Update a user
        api_response = api_instance.update_user(user_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->update_user: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Update a user
        api_response = api_instance.update_user(user_id, full_name=full_name, role=role, profile_data=profile_data)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->update_user: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| The target user&#39;s ID.  |
 **full_name** | **str**| The user&#39;s full name.  | [optional]
 **role** | **int**| New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | [optional]
 **profile_data** | [**[{str: (bool, date, datetime, dict, float, int, list, str, none_type)}]**]({str: (bool, date, datetime, dict, float, int, list, str, none_type)}.md)| A dictionary containing the to be updated custom profile field data for the user.  | [optional]

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_user_group**
> dict update_user_group(user_group_id, name, description)

Update a user group

Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    user_group_id = 1 # int | The ID of the target user group. 
    name = "marketing team" # str | The new name of the group. 
    description = "The marketing team." # str | The new description of the group. 

    # example passing only required values which don't have defaults set
    try:
        # Update a user group
        api_response = api_instance.update_user_group(user_group_id, name, description)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->update_user_group: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_group_id** | **int**| The ID of the target user group.  |
 **name** | **str**| The new name of the group.  |
 **description** | **str**| The new description of the group.  |

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_user_group_members**
> dict update_user_group_members(user_group_id)

Update user group members

Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 

### Example

```python
import time
import openapi_client
from openapi_client.api import users_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    user_group_id = 1 # int | The ID of the target user group. 
    delete =  # [int] | The list of user ids to be removed from the user group.  (optional)
    add =  # [int] | The list of user ids to be added to the user group.  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Update user group members
        api_response = api_instance.update_user_group_members(user_group_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->update_user_group_members: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Update user group members
        api_response = api_instance.update_user_group_members(user_group_id, delete=delete, add=add)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UsersApi->update_user_group_members: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_group_id** | **int**| The ID of the target user group.  |
 **delete** | **[int]**| The list of user ids to be removed from the user group.  | [optional]
 **add** | **[int]**| The list of user ids to be added to the user group.  | [optional]

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

