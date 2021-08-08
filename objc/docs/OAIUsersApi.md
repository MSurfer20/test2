# OAIUsersApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](OAIUsersApi.md#createuser) | **POST** /users | Create a user
[**createUserGroup**](OAIUsersApi.md#createusergroup) | **POST** /user_groups/create | Create a user group
[**deactivateOwnUser**](OAIUsersApi.md#deactivateownuser) | **DELETE** /users/me | Deactivate own user
[**deactivateUser**](OAIUsersApi.md#deactivateuser) | **DELETE** /users/{user_id} | Deactivate a user
[**getAttachments**](OAIUsersApi.md#getattachments) | **GET** /attachments | Get attachments
[**getOwnUser**](OAIUsersApi.md#getownuser) | **GET** /users/me | Get own user
[**getUser**](OAIUsersApi.md#getuser) | **GET** /users/{user_id} | Get a user
[**getUserByEmail**](OAIUsersApi.md#getuserbyemail) | **GET** /users/{email} | Get a user by email
[**getUserGroups**](OAIUsersApi.md#getusergroups) | **GET** /user_groups | Get user groups
[**getUserPresence**](OAIUsersApi.md#getuserpresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
[**getUsers**](OAIUsersApi.md#getusers) | **GET** /users | Get all users
[**muteUser**](OAIUsersApi.md#muteuser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
[**reactivateUser**](OAIUsersApi.md#reactivateuser) | **POST** /users/{user_id}/reactivate | Reactivate a user
[**removeUserGroup**](OAIUsersApi.md#removeusergroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
[**setTypingStatus**](OAIUsersApi.md#settypingstatus) | **POST** /typing | Set \&quot;typing\&quot; status
[**unmuteUser**](OAIUsersApi.md#unmuteuser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
[**updateSettings**](OAIUsersApi.md#updatesettings) | **PATCH** /settings | Update settings
[**updateStatus**](OAIUsersApi.md#updatestatus) | **POST** /users/me/status | Update your status
[**updateUser**](OAIUsersApi.md#updateuser) | **PATCH** /users/{user_id} | Update a user
[**updateUserGroup**](OAIUsersApi.md#updateusergroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**updateUserGroupMembers**](OAIUsersApi.md#updateusergroupmembers) | **POST** /user_groups/{user_group_id}/members | Update user group members


# **createUser**
```objc
-(NSURLSessionTask*) createUserWithEmail: (NSString*) email
    password: (NSString*) password
    fullName: (NSString*) fullName
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 

### Example 
```objc

NSString* email = username@example.com; // The email address of the new user. 
NSString* password = abcd1234; // The password of the new user. 
NSString* fullName = New User; // The full name of the new user. 

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Create a user
[apiInstance createUserWithEmail:email
              password:password
              fullName:fullName
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->createUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **NSString***| The email address of the new user.  | 
 **password** | **NSString***| The password of the new user.  | 
 **fullName** | **NSString***| The full name of the new user.  | 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createUserGroup**
```objc
-(NSURLSessionTask*) createUserGroupWithName: (NSString*) name
    _description: (NSString*) _description
    members: (NSArray<NSNumber*>*) members
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Create a user group

Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 

### Example 
```objc

NSString* name = marketing; // The name of the user group. 
NSString* _description = The marketing team.; // The description of the user group. 
NSArray<NSNumber*>* members = @[@56]; // An array containing the user IDs of the initial members for the new user group. 

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Create a user group
[apiInstance createUserGroupWithName:name
              _description:_description
              members:members
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->createUserGroup: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **NSString***| The name of the user group.  | 
 **_description** | **NSString***| The description of the user group.  | 
 **members** | [**NSArray&lt;NSNumber*&gt;***](NSNumber*.md)| An array containing the user IDs of the initial members for the new user group.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivateOwnUser**
```objc
-(NSURLSessionTask*) deactivateOwnUserWithCompletionHandler: 
        (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Deactivate own user

Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 

### Example 
```objc


OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Deactivate own user
[apiInstance deactivateOwnUserWithCompletionHandler: 
          ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->deactivateOwnUser: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivateUser**
```objc
-(NSURLSessionTask*) deactivateUserWithUserId: (NSNumber*) userId
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 

### Example 
```objc

NSNumber* userId = 12; // The target user's ID. 

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Deactivate a user
[apiInstance deactivateUserWithUserId:userId
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->deactivateUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **NSNumber***| The target user&#39;s ID.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAttachments**
```objc
-(NSURLSessionTask*) getAttachmentsWithCompletionHandler: 
        (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get attachments

Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 

### Example 
```objc


OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Get attachments
[apiInstance getAttachmentsWithCompletionHandler: 
          ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->getAttachments: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getOwnUser**
```objc
-(NSURLSessionTask*) getOwnUserWithCompletionHandler: 
        (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get own user

Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 

### Example 
```objc


OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Get own user
[apiInstance getOwnUserWithCompletionHandler: 
          ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->getOwnUser: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUser**
```objc
-(NSURLSessionTask*) getUserWithUserId: (NSNumber*) userId
    clientGravatar: (NSNumber*) clientGravatar
    includeCustomProfileFields: (NSNumber*) includeCustomProfileFields
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get a user

Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 

### Example 
```objc

NSNumber* userId = 12; // The target user's ID. 
NSNumber* clientGravatar = true; // Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to @(NO))
NSNumber* includeCustomProfileFields = true; // Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) (default to @(NO))

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Get a user
[apiInstance getUserWithUserId:userId
              clientGravatar:clientGravatar
              includeCustomProfileFields:includeCustomProfileFields
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->getUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **NSNumber***| The target user&#39;s ID.  | 
 **clientGravatar** | **NSNumber***| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to @(NO)]
 **includeCustomProfileFields** | **NSNumber***| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to @(NO)]

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUserByEmail**
```objc
-(NSURLSessionTask*) getUserByEmailWithEmail: (NSString*) email
    clientGravatar: (NSNumber*) clientGravatar
    includeCustomProfileFields: (NSNumber*) includeCustomProfileFields
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 

### Example 
```objc

NSString* email = iago@zulip.com; // The email address of the user whose details you want to fetch. 
NSNumber* clientGravatar = true; // Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to @(NO))
NSNumber* includeCustomProfileFields = true; // Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) (default to @(NO))

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Get a user by email
[apiInstance getUserByEmailWithEmail:email
              clientGravatar:clientGravatar
              includeCustomProfileFields:includeCustomProfileFields
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->getUserByEmail: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **NSString***| The email address of the user whose details you want to fetch.  | 
 **clientGravatar** | **NSNumber***| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to @(NO)]
 **includeCustomProfileFields** | **NSNumber***| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to @(NO)]

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUserGroups**
```objc
-(NSURLSessionTask*) getUserGroupsWithCompletionHandler: 
        (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 

### Example 
```objc


OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Get user groups
[apiInstance getUserGroupsWithCompletionHandler: 
          ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->getUserGroups: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUserPresence**
```objc
-(NSURLSessionTask*) getUserPresenceWithUserIdOrEmail: (NSString*) userIdOrEmail
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 

### Example 
```objc

NSString* userIdOrEmail = iago@zulip.com; // The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Get user presence
[apiInstance getUserPresenceWithUserIdOrEmail:userIdOrEmail
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->getUserPresence: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIdOrEmail** | **NSString***| The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  | 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUsers**
```objc
-(NSURLSessionTask*) getUsersWithClientGravatar: (NSNumber*) clientGravatar
    includeCustomProfileFields: (NSNumber*) includeCustomProfileFields
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 

### Example 
```objc

NSNumber* clientGravatar = true; // Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to @(NO))
NSNumber* includeCustomProfileFields = true; // Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional) (default to @(NO))

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Get all users
[apiInstance getUsersWithClientGravatar:clientGravatar
              includeCustomProfileFields:includeCustomProfileFields
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->getUsers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGravatar** | **NSNumber***| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to @(NO)]
 **includeCustomProfileFields** | **NSNumber***| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to @(NO)]

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **muteUser**
```objc
-(NSURLSessionTask*) muteUserWithMutedUserId: (NSNumber*) mutedUserId
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example 
```objc

NSNumber* mutedUserId = 10; // The ID of the user to mute/un-mute. 

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Mute a user
[apiInstance muteUserWithMutedUserId:mutedUserId
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->muteUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutedUserId** | **NSNumber***| The ID of the user to mute/un-mute.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reactivateUser**
```objc
-(NSURLSessionTask*) reactivateUserWithUserId: (NSNumber*) userId
        completionHandler: (void (^)(OAIAnyType* output, NSError* error)) handler;
```

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 

### Example 
```objc

NSNumber* userId = 12; // The target user's ID. 

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Reactivate a user
[apiInstance reactivateUserWithUserId:userId
          completionHandler: ^(OAIAnyType* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->reactivateUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **NSNumber***| The target user&#39;s ID.  | 

### Return type

[**OAIAnyType***](OAIAnyType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **removeUserGroup**
```objc
-(NSURLSessionTask*) removeUserGroupWithUserGroupId: (NSNumber*) userGroupId
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Delete a user group

Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 

### Example 
```objc

NSNumber* userGroupId = 1; // The ID of the target user group. 

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Delete a user group
[apiInstance removeUserGroupWithUserGroupId:userGroupId
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->removeUserGroup: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **NSNumber***| The ID of the target user group.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **setTypingStatus**
```objc
-(NSURLSessionTask*) setTypingStatusWithOp: (NSString*) op
    to: (NSArray<NSNumber*>*) to
    type: (NSString*) type
    topic: (NSString*) topic
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Set \"typing\" status

Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 

### Example 
```objc

NSString* op = start; // Whether the user has started (`start`) or stopped (`stop`) to type. 
NSArray<NSNumber*>* to = @[@56]; // For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
NSString* type = private; // Type of the message being composed.  (optional) (default to @"private")
NSString* topic = typing notifications; // Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type.  (optional)

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Set \"typing\" status
[apiInstance setTypingStatusWithOp:op
              to:to
              type:type
              topic:topic
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->setTypingStatus: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | **NSString***| Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type.  | 
 **to** | [**NSArray&lt;NSNumber*&gt;***](NSNumber*.md)| For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  | 
 **type** | **NSString***| Type of the message being composed.  | [optional] [default to @&quot;private&quot;]
 **topic** | **NSString***| Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  | [optional] 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unmuteUser**
```objc
-(NSURLSessionTask*) unmuteUserWithMutedUserId: (NSNumber*) mutedUserId
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Unmute a user

This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example 
```objc

NSNumber* mutedUserId = 10; // The ID of the user to mute/un-mute. 

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Unmute a user
[apiInstance unmuteUserWithMutedUserId:mutedUserId
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->unmuteUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutedUserId** | **NSNumber***| The ID of the user to mute/un-mute.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateSettings**
```objc
-(NSURLSessionTask*) updateSettingsWithFullName: (NSString*) fullName
    email: (NSString*) email
    oldPassword: (NSString*) oldPassword
    varNewPassword: (NSString*) varNewPassword
    twentyFourHourTime: (NSNumber*) twentyFourHourTime
    denseMode: (NSNumber*) denseMode
    starredMessageCounts: (NSNumber*) starredMessageCounts
    fluidLayoutWidth: (NSNumber*) fluidLayoutWidth
    highContrastMode: (NSNumber*) highContrastMode
    colorScheme: (NSNumber*) colorScheme
    enableDraftsSynchronization: (NSNumber*) enableDraftsSynchronization
    translateEmoticons: (NSNumber*) translateEmoticons
    defaultLanguage: (NSString*) defaultLanguage
    defaultView: (NSString*) defaultView
    leftSideUserlist: (NSNumber*) leftSideUserlist
    emojiset: (NSString*) emojiset
    demoteInactiveStreams: (NSNumber*) demoteInactiveStreams
    timezone: (NSString*) timezone
    enableStreamDesktopNotifications: (NSNumber*) enableStreamDesktopNotifications
    enableStreamEmailNotifications: (NSNumber*) enableStreamEmailNotifications
    enableStreamPushNotifications: (NSNumber*) enableStreamPushNotifications
    enableStreamAudibleNotifications: (NSNumber*) enableStreamAudibleNotifications
    notificationSound: (NSString*) notificationSound
    enableDesktopNotifications: (NSNumber*) enableDesktopNotifications
    enableSounds: (NSNumber*) enableSounds
    emailNotificationsBatchingPeriodSeconds: (NSNumber*) emailNotificationsBatchingPeriodSeconds
    enableOfflineEmailNotifications: (NSNumber*) enableOfflineEmailNotifications
    enableOfflinePushNotifications: (NSNumber*) enableOfflinePushNotifications
    enableOnlinePushNotifications: (NSNumber*) enableOnlinePushNotifications
    enableDigestEmails: (NSNumber*) enableDigestEmails
    enableMarketingEmails: (NSNumber*) enableMarketingEmails
    enableLoginEmails: (NSNumber*) enableLoginEmails
    messageContentInEmailNotifications: (NSNumber*) messageContentInEmailNotifications
    pmContentInDesktopNotifications: (NSNumber*) pmContentInDesktopNotifications
    wildcardMentionsNotify: (NSNumber*) wildcardMentionsNotify
    desktopIconCountDisplay: (NSNumber*) desktopIconCountDisplay
    realmNameInNotifications: (NSNumber*) realmNameInNotifications
    presenceEnabled: (NSNumber*) presenceEnabled
    enterSends: (NSNumber*) enterSends
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Update settings

This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 

### Example 
```objc

NSString* fullName = NewName; // A new display name for the user.  (optional)
NSString* email = newname@example.com; // Asks the server to initiate a confirmation sequence to change the user's email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address.  (optional)
NSString* oldPassword = old12345; // The user's old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the `new_password` parameter.  (optional)
NSString* varNewPassword = new12345; // The user's new Zulip password (or LDAP password, if LDAP authentication is in use).  The `old_password` parameter must be included in the request.  (optional)
NSNumber* twentyFourHourTime = true; // Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
NSNumber* denseMode = true; // This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
NSNumber* starredMessageCounts = true; // Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
NSNumber* fluidLayoutWidth = true; // Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
NSNumber* highContrastMode = true; // This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
NSNumber* colorScheme = @56; // Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
NSNumber* enableDraftsSynchronization = true; // A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87).  (optional)
NSNumber* translateEmoticons = true; // Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
NSString* defaultLanguage = en; // What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  (optional)
NSString* defaultView = all_messages; // The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
NSNumber* leftSideUserlist = true; // Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
NSString* emojiset = google; // The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
NSNumber* demoteInactiveStreams = @56; // Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
NSString* timezone = Asia/Kolkata; // The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
NSNumber* enableStreamDesktopNotifications = true; // Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* enableStreamEmailNotifications = true; // Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* enableStreamPushNotifications = true; // Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* enableStreamAudibleNotifications = true; // Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSString* notificationSound = ding; // Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  (optional)
NSNumber* enableDesktopNotifications = true; // Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* enableSounds = true; // Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* emailNotificationsBatchingPeriodSeconds = 120; // The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82)  (optional)
NSNumber* enableOfflineEmailNotifications = true; // Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* enableOfflinePushNotifications = true; // Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* enableOnlinePushNotifications = true; // Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* enableDigestEmails = true; // Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* enableMarketingEmails = true; // Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* enableLoginEmails = true; // Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* messageContentInEmailNotifications = true; // Include the message's content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* pmContentInDesktopNotifications = true; // Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* wildcardMentionsNotify = true; // Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* desktopIconCountDisplay = @56; // Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* realmNameInNotifications = true; // Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* presenceEnabled = true; // Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
NSNumber* enterSends = true; // Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the `POST /users/me/enter-sends` endpoint, with the same parameter format.  (optional)

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Update settings
[apiInstance updateSettingsWithFullName:fullName
              email:email
              oldPassword:oldPassword
              varNewPassword:varNewPassword
              twentyFourHourTime:twentyFourHourTime
              denseMode:denseMode
              starredMessageCounts:starredMessageCounts
              fluidLayoutWidth:fluidLayoutWidth
              highContrastMode:highContrastMode
              colorScheme:colorScheme
              enableDraftsSynchronization:enableDraftsSynchronization
              translateEmoticons:translateEmoticons
              defaultLanguage:defaultLanguage
              defaultView:defaultView
              leftSideUserlist:leftSideUserlist
              emojiset:emojiset
              demoteInactiveStreams:demoteInactiveStreams
              timezone:timezone
              enableStreamDesktopNotifications:enableStreamDesktopNotifications
              enableStreamEmailNotifications:enableStreamEmailNotifications
              enableStreamPushNotifications:enableStreamPushNotifications
              enableStreamAudibleNotifications:enableStreamAudibleNotifications
              notificationSound:notificationSound
              enableDesktopNotifications:enableDesktopNotifications
              enableSounds:enableSounds
              emailNotificationsBatchingPeriodSeconds:emailNotificationsBatchingPeriodSeconds
              enableOfflineEmailNotifications:enableOfflineEmailNotifications
              enableOfflinePushNotifications:enableOfflinePushNotifications
              enableOnlinePushNotifications:enableOnlinePushNotifications
              enableDigestEmails:enableDigestEmails
              enableMarketingEmails:enableMarketingEmails
              enableLoginEmails:enableLoginEmails
              messageContentInEmailNotifications:messageContentInEmailNotifications
              pmContentInDesktopNotifications:pmContentInDesktopNotifications
              wildcardMentionsNotify:wildcardMentionsNotify
              desktopIconCountDisplay:desktopIconCountDisplay
              realmNameInNotifications:realmNameInNotifications
              presenceEnabled:presenceEnabled
              enterSends:enterSends
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->updateSettings: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullName** | **NSString***| A new display name for the user.  | [optional] 
 **email** | **NSString***| Asks the server to initiate a confirmation sequence to change the user&#39;s email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address.  | [optional] 
 **oldPassword** | **NSString***| The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the &#x60;new_password&#x60; parameter.  | [optional] 
 **varNewPassword** | **NSString***| The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).  The &#x60;old_password&#x60; parameter must be included in the request.  | [optional] 
 **twentyFourHourTime** | **NSNumber***| Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **denseMode** | **NSNumber***| This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **starredMessageCounts** | **NSNumber***| Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **fluidLayoutWidth** | **NSNumber***| Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **highContrastMode** | **NSNumber***| This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **colorScheme** | **NSNumber***| Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **enableDraftsSynchronization** | **NSNumber***| A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87).  | [optional] 
 **translateEmoticons** | **NSNumber***| Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **defaultLanguage** | **NSString***| What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  | [optional] 
 **defaultView** | **NSString***| The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] 
 **leftSideUserlist** | **NSNumber***| Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **emojiset** | **NSString***| The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] 
 **demoteInactiveStreams** | **NSNumber***| Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] 
 **timezone** | **NSString***| The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional] 
 **enableStreamDesktopNotifications** | **NSNumber***| Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enableStreamEmailNotifications** | **NSNumber***| Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enableStreamPushNotifications** | **NSNumber***| Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enableStreamAudibleNotifications** | **NSNumber***| Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **notificationSound** | **NSString***| Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  | [optional] 
 **enableDesktopNotifications** | **NSNumber***| Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enableSounds** | **NSNumber***| Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **emailNotificationsBatchingPeriodSeconds** | **NSNumber***| The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82)  | [optional] 
 **enableOfflineEmailNotifications** | **NSNumber***| Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enableOfflinePushNotifications** | **NSNumber***| Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enableOnlinePushNotifications** | **NSNumber***| Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enableDigestEmails** | **NSNumber***| Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enableMarketingEmails** | **NSNumber***| Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enableLoginEmails** | **NSNumber***| Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **messageContentInEmailNotifications** | **NSNumber***| Include the message&#39;s content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **pmContentInDesktopNotifications** | **NSNumber***| Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **wildcardMentionsNotify** | **NSNumber***| Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **desktopIconCountDisplay** | **NSNumber***| Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **realmNameInNotifications** | **NSNumber***| Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **presenceEnabled** | **NSNumber***| Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] 
 **enterSends** | **NSNumber***| Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the &#x60;POST /users/me/enter-sends&#x60; endpoint, with the same parameter format.  | [optional] 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateStatus**
```objc
-(NSURLSessionTask*) updateStatusWithStatusText: (NSString*) statusText
    away: (NSNumber*) away
    emojiName: (NSString*) emojiName
    emojiCode: (NSString*) emojiCode
    reactionType: (NSString*) reactionType
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Update your status

Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 

### Example 
```objc

NSString* statusText = on vacation; // The text content of the status message. Sending the empty string will clear the user's status.  **Note**: The limit on the size of the message is 60 characters.  (optional)
NSNumber* away = true; // Whether the user should be marked as \"away\".  (optional)
NSString* emojiName = car; // The name for the emoji to associate with this status.  (optional)
NSString* emojiCode = 1f697; // A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji.  (optional)
NSString* reactionType = unicode_emoji; // One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.  (optional)

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Update your status
[apiInstance updateStatusWithStatusText:statusText
              away:away
              emojiName:emojiName
              emojiCode:emojiCode
              reactionType:reactionType
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->updateStatus: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusText** | **NSString***| The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters.  | [optional] 
 **away** | **NSNumber***| Whether the user should be marked as \&quot;away\&quot;.  | [optional] 
 **emojiName** | **NSString***| The name for the emoji to associate with this status.  | [optional] 
 **emojiCode** | **NSString***| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji.  | [optional] 
 **reactionType** | **NSString***| One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji.  | [optional] 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateUser**
```objc
-(NSURLSessionTask*) updateUserWithUserId: (NSNumber*) userId
    fullName: (NSString*) fullName
    role: (NSNumber*) role
    profileData: (NSArray<NSObject*>*) profileData
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Update a user

Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 

### Example 
```objc

NSNumber* userId = 12; // The target user's ID. 
NSString* fullName = @"fullName_example"; // The user's full name.  (optional)
NSNumber* role = 400; // New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  (optional)
NSArray<NSObject*>* profileData = @[[[NSObject alloc] init]]; // A dictionary containing the to be updated custom profile field data for the user.  (optional)

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Update a user
[apiInstance updateUserWithUserId:userId
              fullName:fullName
              role:role
              profileData:profileData
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->updateUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **NSNumber***| The target user&#39;s ID.  | 
 **fullName** | **NSString***| The user&#39;s full name.  | [optional] 
 **role** | **NSNumber***| New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | [optional] 
 **profileData** | [**NSArray&lt;NSObject*&gt;***](NSObject*.md)| A dictionary containing the to be updated custom profile field data for the user.  | [optional] 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateUserGroup**
```objc
-(NSURLSessionTask*) updateUserGroupWithUserGroupId: (NSNumber*) userGroupId
    name: (NSString*) name
    _description: (NSString*) _description
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Update a user group

Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 

### Example 
```objc

NSNumber* userGroupId = 1; // The ID of the target user group. 
NSString* name = marketing team; // The new name of the group. 
NSString* _description = The marketing team.; // The new description of the group. 

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Update a user group
[apiInstance updateUserGroupWithUserGroupId:userGroupId
              name:name
              _description:_description
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->updateUserGroup: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **NSNumber***| The ID of the target user group.  | 
 **name** | **NSString***| The new name of the group.  | 
 **_description** | **NSString***| The new description of the group.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateUserGroupMembers**
```objc
-(NSURLSessionTask*) updateUserGroupMembersWithUserGroupId: (NSNumber*) userGroupId
    delete: (NSArray<NSNumber*>*) delete
    add: (NSArray<NSNumber*>*) add
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Update user group members

Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 

### Example 
```objc

NSNumber* userGroupId = 1; // The ID of the target user group. 
NSArray<NSNumber*>* delete = @[@56]; // The list of user ids to be removed from the user group.  (optional)
NSArray<NSNumber*>* add = @[@56]; // The list of user ids to be added to the user group.  (optional)

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Update user group members
[apiInstance updateUserGroupMembersWithUserGroupId:userGroupId
              delete:delete
              add:add
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->updateUserGroupMembers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **NSNumber***| The ID of the target user group.  | 
 **delete** | [**NSArray&lt;NSNumber*&gt;***](NSNumber*.md)| The list of user ids to be removed from the user group.  | [optional] 
 **add** | [**NSArray&lt;NSNumber*&gt;***](NSNumber*.md)| The list of user ids to be added to the user group.  | [optional] 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

