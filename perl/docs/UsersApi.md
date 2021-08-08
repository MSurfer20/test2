# WWW::OpenAPIClient::UsersApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::UsersApi;
```

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
[**update_display_settings**](UsersApi.md#update_display_settings) | **PATCH** /settings/display | Update display settings
[**update_notification_settings**](UsersApi.md#update_notification_settings) | **PATCH** /settings/notifications | Update notification settings
[**update_user**](UsersApi.md#update_user) | **PATCH** /users/{user_id} | Update a user
[**update_user_group**](UsersApi.md#update_user_group) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**update_user_group_members**](UsersApi.md#update_user_group_members) | **POST** /user_groups/{user_group_id}/members | Update user group members


# **create_user**
> JsonSuccessBase create_user(email => $email, password => $password, full_name => $full_name)

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $email = username@example.com; # string | The email address of the new user. 
my $password = abcd1234; # string | The password of the new user. 
my $full_name = New User; # string | The full name of the new user. 

eval { 
    my $result = $api_instance->create_user(email => $email, password => $password, full_name => $full_name);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->create_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| The email address of the new user.  | 
 **password** | **string**| The password of the new user.  | 
 **full_name** | **string**| The full name of the new user.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_user_group**
> JsonSuccess create_user_group(name => $name, description => $description, members => $members)

Create a user group

Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $name = marketing; # string | The name of the user group. 
my $description = The marketing team.; # string | The description of the user group. 
my $members = [(null)]; # ARRAY[int] | An array containing the user IDs of the initial members for the new user group. 

eval { 
    my $result = $api_instance->create_user_group(name => $name, description => $description, members => $members);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->create_user_group: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| The name of the user group.  | 
 **description** | **string**| The description of the user group.  | 
 **members** | [**ARRAY[int]**](int.md)| An array containing the user IDs of the initial members for the new user group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivate_own_user**
> JsonSuccess deactivate_own_user()

Deactivate own user

Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);


eval { 
    my $result = $api_instance->deactivate_own_user();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->deactivate_own_user: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivate_user**
> JsonSuccess deactivate_user(user_id => $user_id)

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $user_id = 12; # int | The target user's ID. 

eval { 
    my $result = $api_instance->deactivate_user(user_id => $user_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->deactivate_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| The target user&#39;s ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_attachments**
> JsonSuccessBase get_attachments()

Get attachments

Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);


eval { 
    my $result = $api_instance->get_attachments();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->get_attachments: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_own_user**
> JsonSuccessBase get_own_user()

Get own user

Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);


eval { 
    my $result = $api_instance->get_own_user();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->get_own_user: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user**
> JsonSuccessBase get_user(user_id => $user_id, client_gravatar => $client_gravatar, include_custom_profile_fields => $include_custom_profile_fields)

Get a user

Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $user_id = 12; # int | The target user's ID. 
my $client_gravatar = true; # boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
my $include_custom_profile_fields = true; # boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 

eval { 
    my $result = $api_instance->get_user(user_id => $user_id, client_gravatar => $client_gravatar, include_custom_profile_fields => $include_custom_profile_fields);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->get_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| The target user&#39;s ID.  | 
 **client_gravatar** | **boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **include_custom_profile_fields** | **boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_by_email**
> JsonSuccessBase get_user_by_email(email => $email, client_gravatar => $client_gravatar, include_custom_profile_fields => $include_custom_profile_fields)

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $email = iago@zulip.com; # string | The email address of the user whose details you want to fetch. 
my $client_gravatar = true; # boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
my $include_custom_profile_fields = true; # boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 

eval { 
    my $result = $api_instance->get_user_by_email(email => $email, client_gravatar => $client_gravatar, include_custom_profile_fields => $include_custom_profile_fields);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->get_user_by_email: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **string**| The email address of the user whose details you want to fetch.  | 
 **client_gravatar** | **boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **include_custom_profile_fields** | **boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_groups**
> JsonSuccessBase get_user_groups()

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);


eval { 
    my $result = $api_instance->get_user_groups();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->get_user_groups: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_presence**
> JsonSuccessBase get_user_presence(user_id_or_email => $user_id_or_email)

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $user_id_or_email = iago@zulip.com; # string | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 

eval { 
    my $result = $api_instance->get_user_presence(user_id_or_email => $user_id_or_email);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->get_user_presence: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id_or_email** | **string**| The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_users**
> JsonSuccessBase get_users(client_gravatar => $client_gravatar, include_custom_profile_fields => $include_custom_profile_fields)

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $client_gravatar = true; # boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
my $include_custom_profile_fields = true; # boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 

eval { 
    my $result = $api_instance->get_users(client_gravatar => $client_gravatar, include_custom_profile_fields => $include_custom_profile_fields);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->get_users: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_gravatar** | **boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **include_custom_profile_fields** | **boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mute_user**
> JsonSuccess mute_user(muted_user_id => $muted_user_id)

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $muted_user_id = 10; # int | The ID of the user to mute/un-mute. 

eval { 
    my $result = $api_instance->mute_user(muted_user_id => $muted_user_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->mute_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muted_user_id** | **int**| The ID of the user to mute/un-mute.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reactivate_user**
> AnyType reactivate_user(user_id => $user_id)

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $user_id = 12; # int | The target user's ID. 

eval { 
    my $result = $api_instance->reactivate_user(user_id => $user_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->reactivate_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| The target user&#39;s ID.  | 

### Return type

[**AnyType**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_user_group**
> JsonSuccess remove_user_group(user_group_id => $user_group_id)

Delete a user group

Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $user_group_id = 1; # int | The ID of the target user group. 

eval { 
    my $result = $api_instance->remove_user_group(user_group_id => $user_group_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->remove_user_group: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_group_id** | **int**| The ID of the target user group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_typing_status**
> JsonSuccess set_typing_status(op => $op, to => $to, type => $type, topic => $topic)

Set \"typing\" status

Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $op = start; # string | Whether the user has started (`start`) or stopped (`stop`) to type. 
my $to = [(null)]; # ARRAY[int] | For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
my $type = private; # string | Type of the message being composed. 
my $topic = typing notifications; # string | Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. 

eval { 
    my $result = $api_instance->set_typing_status(op => $op, to => $to, type => $type, topic => $topic);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->set_typing_status: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | **string**| Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type.  | 
 **to** | [**ARRAY[int]**](int.md)| For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  | 
 **type** | **string**| Type of the message being composed.  | [optional] [default to &#39;private&#39;]
 **topic** | **string**| Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unmute_user**
> JsonSuccess unmute_user(muted_user_id => $muted_user_id)

Unmute a user

This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $muted_user_id = 10; # int | The ID of the user to mute/un-mute. 

eval { 
    my $result = $api_instance->unmute_user(muted_user_id => $muted_user_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->unmute_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **muted_user_id** | **int**| The ID of the user to mute/un-mute.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_display_settings**
> JsonSuccessBase update_display_settings(twenty_four_hour_time => $twenty_four_hour_time, dense_mode => $dense_mode, starred_message_counts => $starred_message_counts, fluid_layout_width => $fluid_layout_width, high_contrast_mode => $high_contrast_mode, color_scheme => $color_scheme, translate_emoticons => $translate_emoticons, default_language => $default_language, default_view => $default_view, left_side_userlist => $left_side_userlist, emojiset => $emojiset, demote_inactive_streams => $demote_inactive_streams, timezone => $timezone)

Update display settings

This endpoint is used to edit the current user's user interface settings.  `PATCH {{ api_url }}/v1/settings/display` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $twenty_four_hour_time = true; # boolean | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format). 
my $dense_mode = true; # boolean | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip. 
my $starred_message_counts = true; # boolean | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages). 
my $fluid_layout_width = true; # boolean | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens. 
my $high_contrast_mode = true; # boolean | This setting is reserved for use to control variations in Zulip's design to help visually impaired users. 
my $color_scheme = 56; # int | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query. 
my $translate_emoticons = true; # boolean | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends. 
my $default_language = en; # string | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
my $default_view = all_messages; # string | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
my $left_side_userlist = true; # boolean | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked. 
my $emojiset = google; # string | The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 
my $demote_inactive_streams = 56; # int | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never 
my $timezone = Asia/Kolkata; # string | The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64). 

eval { 
    my $result = $api_instance->update_display_settings(twenty_four_hour_time => $twenty_four_hour_time, dense_mode => $dense_mode, starred_message_counts => $starred_message_counts, fluid_layout_width => $fluid_layout_width, high_contrast_mode => $high_contrast_mode, color_scheme => $color_scheme, translate_emoticons => $translate_emoticons, default_language => $default_language, default_view => $default_view, left_side_userlist => $left_side_userlist, emojiset => $emojiset, demote_inactive_streams => $demote_inactive_streams, timezone => $timezone);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->update_display_settings: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **twenty_four_hour_time** | **boolean**| Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  | [optional] 
 **dense_mode** | **boolean**| This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  | [optional] 
 **starred_message_counts** | **boolean**| Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  | [optional] 
 **fluid_layout_width** | **boolean**| Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  | [optional] 
 **high_contrast_mode** | **boolean**| This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  | [optional] 
 **color_scheme** | **int**| Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  | [optional] 
 **translate_emoticons** | **boolean**| Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  | [optional] 
 **default_language** | **string**| What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | [optional] 
 **default_view** | **string**| The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **left_side_userlist** | **boolean**| Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  | [optional] 
 **emojiset** | **string**| The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **demote_inactive_streams** | **int**| Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  | [optional] 
 **timezone** | **string**| The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 64).  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_notification_settings**
> JsonSuccessBase update_notification_settings(enable_stream_desktop_notifications => $enable_stream_desktop_notifications, enable_stream_email_notifications => $enable_stream_email_notifications, enable_stream_push_notifications => $enable_stream_push_notifications, enable_stream_audible_notifications => $enable_stream_audible_notifications, notification_sound => $notification_sound, enable_desktop_notifications => $enable_desktop_notifications, enable_sounds => $enable_sounds, enable_offline_email_notifications => $enable_offline_email_notifications, enable_offline_push_notifications => $enable_offline_push_notifications, enable_online_push_notifications => $enable_online_push_notifications, enable_digest_emails => $enable_digest_emails, enable_marketing_emails => $enable_marketing_emails, enable_login_emails => $enable_login_emails, message_content_in_email_notifications => $message_content_in_email_notifications, pm_content_in_desktop_notifications => $pm_content_in_desktop_notifications, wildcard_mentions_notify => $wildcard_mentions_notify, desktop_icon_count_display => $desktop_icon_count_display, realm_name_in_notifications => $realm_name_in_notifications, presence_enabled => $presence_enabled)

Update notification settings

This endpoint is used to edit the user's global notification settings. See [this endpoint](/api/update-subscription-settings) for per-stream notification settings.  `PATCH {{ api_url }}/v1/settings/notifications` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $enable_stream_desktop_notifications = true; # boolean | Enable visual desktop notifications for stream messages. 
my $enable_stream_email_notifications = true; # boolean | Enable email notifications for stream messages. 
my $enable_stream_push_notifications = true; # boolean | Enable mobile notifications for stream messages. 
my $enable_stream_audible_notifications = true; # boolean | Enable audible desktop notifications for stream messages. 
my $notification_sound = ding; # string | Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63). 
my $enable_desktop_notifications = true; # boolean | Enable visual desktop notifications for private messages and @-mentions. 
my $enable_sounds = true; # boolean | Enable audible desktop notifications for private messages and @-mentions. 
my $enable_offline_email_notifications = true; # boolean | Enable email notifications for private messages and @-mentions received when the user is offline. 
my $enable_offline_push_notifications = true; # boolean | Enable mobile notification for private messages and @-mentions received when the user is offline. 
my $enable_online_push_notifications = true; # boolean | Enable mobile notification for private messages and @-mentions received when the user is online. 
my $enable_digest_emails = true; # boolean | Enable digest emails when the user is away. 
my $enable_marketing_emails = true; # boolean | Enable marketing emails. Has no function outside Zulip Cloud. 
my $enable_login_emails = true; # boolean | Enable email notifications for new logins to account. 
my $message_content_in_email_notifications = true; # boolean | Include the message's content in email notifications for new messages. 
my $pm_content_in_desktop_notifications = true; # boolean | Include content of private messages in desktop notifications. 
my $wildcard_mentions_notify = true; # boolean | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention. 
my $desktop_icon_count_display = 56; # int | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None 
my $realm_name_in_notifications = true; # boolean | Include organization name in subject of message notification emails. 
my $presence_enabled = true; # boolean | Display the presence status to other users when online. 

eval { 
    my $result = $api_instance->update_notification_settings(enable_stream_desktop_notifications => $enable_stream_desktop_notifications, enable_stream_email_notifications => $enable_stream_email_notifications, enable_stream_push_notifications => $enable_stream_push_notifications, enable_stream_audible_notifications => $enable_stream_audible_notifications, notification_sound => $notification_sound, enable_desktop_notifications => $enable_desktop_notifications, enable_sounds => $enable_sounds, enable_offline_email_notifications => $enable_offline_email_notifications, enable_offline_push_notifications => $enable_offline_push_notifications, enable_online_push_notifications => $enable_online_push_notifications, enable_digest_emails => $enable_digest_emails, enable_marketing_emails => $enable_marketing_emails, enable_login_emails => $enable_login_emails, message_content_in_email_notifications => $message_content_in_email_notifications, pm_content_in_desktop_notifications => $pm_content_in_desktop_notifications, wildcard_mentions_notify => $wildcard_mentions_notify, desktop_icon_count_display => $desktop_icon_count_display, realm_name_in_notifications => $realm_name_in_notifications, presence_enabled => $presence_enabled);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->update_notification_settings: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enable_stream_desktop_notifications** | **boolean**| Enable visual desktop notifications for stream messages.  | [optional] 
 **enable_stream_email_notifications** | **boolean**| Enable email notifications for stream messages.  | [optional] 
 **enable_stream_push_notifications** | **boolean**| Enable mobile notifications for stream messages.  | [optional] 
 **enable_stream_audible_notifications** | **boolean**| Enable audible desktop notifications for stream messages.  | [optional] 
 **notification_sound** | **string**| Notification sound name.  **Changes**: Removed unnecessary JSON-encoding of parameter in Zulip 4.0 (feature level 63).  | [optional] 
 **enable_desktop_notifications** | **boolean**| Enable visual desktop notifications for private messages and @-mentions.  | [optional] 
 **enable_sounds** | **boolean**| Enable audible desktop notifications for private messages and @-mentions.  | [optional] 
 **enable_offline_email_notifications** | **boolean**| Enable email notifications for private messages and @-mentions received when the user is offline.  | [optional] 
 **enable_offline_push_notifications** | **boolean**| Enable mobile notification for private messages and @-mentions received when the user is offline.  | [optional] 
 **enable_online_push_notifications** | **boolean**| Enable mobile notification for private messages and @-mentions received when the user is online.  | [optional] 
 **enable_digest_emails** | **boolean**| Enable digest emails when the user is away.  | [optional] 
 **enable_marketing_emails** | **boolean**| Enable marketing emails. Has no function outside Zulip Cloud.  | [optional] 
 **enable_login_emails** | **boolean**| Enable email notifications for new logins to account.  | [optional] 
 **message_content_in_email_notifications** | **boolean**| Include the message&#39;s content in email notifications for new messages.  | [optional] 
 **pm_content_in_desktop_notifications** | **boolean**| Include content of private messages in desktop notifications.  | [optional] 
 **wildcard_mentions_notify** | **boolean**| Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  | [optional] 
 **desktop_icon_count_display** | **int**| Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  | [optional] 
 **realm_name_in_notifications** | **boolean**| Include organization name in subject of message notification emails.  | [optional] 
 **presence_enabled** | **boolean**| Display the presence status to other users when online.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_user**
> JsonSuccess update_user(user_id => $user_id, full_name => $full_name, role => $role, profile_data => $profile_data)

Update a user

Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $user_id = 12; # int | The target user's ID. 
my $full_name = "full_name_example"; # string | The user's full name. 
my $role = 400; # int | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
my $profile_data = [(null)]; # ARRAY[object] | A dictionary containing the to be updated custom profile field data for the user. 

eval { 
    my $result = $api_instance->update_user(user_id => $user_id, full_name => $full_name, role => $role, profile_data => $profile_data);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->update_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| The target user&#39;s ID.  | 
 **full_name** | **string**| The user&#39;s full name.  | [optional] 
 **role** | **int**| New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | [optional] 
 **profile_data** | [**ARRAY[object]**](object.md)| A dictionary containing the to be updated custom profile field data for the user.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_user_group**
> JsonSuccess update_user_group(user_group_id => $user_group_id, name => $name, description => $description)

Update a user group

Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $user_group_id = 1; # int | The ID of the target user group. 
my $name = marketing team; # string | The new name of the group. 
my $description = The marketing team.; # string | The new description of the group. 

eval { 
    my $result = $api_instance->update_user_group(user_group_id => $user_group_id, name => $name, description => $description);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->update_user_group: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_group_id** | **int**| The ID of the target user group.  | 
 **name** | **string**| The new name of the group.  | 
 **description** | **string**| The new description of the group.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_user_group_members**
> JsonSuccess update_user_group_members(user_group_id => $user_group_id, delete => $delete, add => $add)

Update user group members

Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(
);

my $user_group_id = 1; # int | The ID of the target user group. 
my $delete = [(null)]; # ARRAY[int] | The list of user ids to be removed from the user group. 
my $add = [(null)]; # ARRAY[int] | The list of user ids to be added to the user group. 

eval { 
    my $result = $api_instance->update_user_group_members(user_group_id => $user_group_id, delete => $delete, add => $add);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->update_user_group_members: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_group_id** | **int**| The ID of the target user group.  | 
 **delete** | [**ARRAY[int]**](int.md)| The list of user ids to be removed from the user group.  | [optional] 
 **add** | [**ARRAY[int]**](int.md)| The list of user ids to be added to the user group.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

