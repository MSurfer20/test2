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
[**updateSettings**](UsersApi.md#updateSettings) | **PATCH** /settings | Update settings
[**updateStatus**](UsersApi.md#updateStatus) | **POST** /users/me/status | Update your status
[**updateUser**](UsersApi.md#updateUser) | **PATCH** /users/{user_id} | Update a user
[**updateUserGroup**](UsersApi.md#updateUserGroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**updateUserGroupMembers**](UsersApi.md#updateUserGroupMembers) | **POST** /user_groups/{user_group_id}/members | Update user group members


<a name="createUser"></a>
# **createUser**
> JsonSuccessBase createUser(email, password, fullName)

Create a user

{!can-create-users-only.md!}  Create a new user account via the API.  &#x60;POST {{ api_url }}/v1/users&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String email = "username@example.com"; // String | The email address of the new user. 
    String password = "abcd1234"; // String | The password of the new user. 
    String fullName = "New User"; // String | The full name of the new user. 
    try {
      JsonSuccessBase result = apiInstance.createUser(email, password, fullName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| The email address of the new user.  |
 **password** | **String**| The password of the new user.  |
 **fullName** | **String**| The full name of the new user.  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

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

<a name="createUserGroup"></a>
# **createUserGroup**
> JsonSuccess createUserGroup(name, description, members)

Create a user group

Create a new [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/create&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String name = "marketing"; // String | The name of the user group. 
    String description = "The marketing team."; // String | The description of the user group. 
    List<Integer> members = Arrays.asList(); // List<Integer> | An array containing the user IDs of the initial members for the new user group. 
    try {
      JsonSuccess result = apiInstance.createUserGroup(name, description, members);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createUserGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the user group.  |
 **description** | **String**| The description of the user group.  |
 **members** | [**List&lt;Integer&gt;**](Integer.md)| An array containing the user IDs of the initial members for the new user group.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

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

<a name="deactivateOwnUser"></a>
# **deactivateOwnUser**
> JsonSuccess deactivateOwnUser()

Deactivate own user

Deactivates the user&#39;s account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  &#x60;DELETE {{ api_url }}/v1/users/me&#x60;  This endpoint is primarily useful to Zulip clients providing a user settings UI. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    try {
      JsonSuccess result = apiInstance.deactivateOwnUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deactivateOwnUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |

<a name="deactivateUser"></a>
# **deactivateUser**
> JsonSuccess deactivateUser(userId)

Deactivate a user

[Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;DELETE {{ api_url }}/v1/users/{user_id}&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer userId = 12; // Integer | The target user's ID. 
    try {
      JsonSuccess result = apiInstance.deactivateUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deactivateUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The target user&#39;s ID.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

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

<a name="getAttachments"></a>
# **getAttachments**
> JsonSuccessBase getAttachments()

Get attachments

Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    try {
      JsonSuccessBase result = apiInstance.getAttachments();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getAttachments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

<a name="getOwnUser"></a>
# **getOwnUser**
> JsonSuccessBase getOwnUser()

Get own user

Get basic data about the user/bot that requests this endpoint.  &#x60;GET {{ api_url }}/v1/users/me&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    try {
      JsonSuccessBase result = apiInstance.getOwnUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getOwnUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getUser"></a>
# **getUser**
> JsonSuccessBase getUser(userId, clientGravatar, includeCustomProfileFields)

Get a user

Fetch details for a single user in the organization.  &#x60;GET {{ api_url }}/v1/users/{user_id}&#x60;  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer userId = 12; // Integer | The target user's ID. 
    Boolean clientGravatar = false; // Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
    Boolean includeCustomProfileFields = false; // Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
    try {
      JsonSuccessBase result = apiInstance.getUser(userId, clientGravatar, includeCustomProfileFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The target user&#39;s ID.  |
 **clientGravatar** | **Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

<a name="getUserByEmail"></a>
# **getUserByEmail**
> JsonSuccessBase getUserByEmail(email, clientGravatar, includeCustomProfileFields)

Get a user by email

Fetch details for a single user in the organization given a Zulip display email address.  &#x60;GET {{ api_url }}/v1/users/{email}&#x60;  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String email = "iago@zulip.com"; // String | The email address of the user whose details you want to fetch. 
    Boolean clientGravatar = false; // Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
    Boolean includeCustomProfileFields = false; // Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
    try {
      JsonSuccessBase result = apiInstance.getUserByEmail(email, clientGravatar, includeCustomProfileFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserByEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| The email address of the user whose details you want to fetch.  |
 **clientGravatar** | **Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

<a name="getUserGroups"></a>
# **getUserGroups**
> JsonSuccessBase getUserGroups()

Get user groups

{!api-members-only.md!}  Fetches all of the user groups in the organization.  &#x60;GET {{ api_url }}/v1/user_groups&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    try {
      JsonSuccessBase result = apiInstance.getUserGroups();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

<a name="getUserPresence"></a>
# **getUserPresence**
> JsonSuccessBase getUserPresence(userIdOrEmail)

Get user presence

Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user&#39;s presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  &#x60;GET {{ api_url }}/v1/users/{user_id_or_email}/presence&#x60;  See [Zulip&#39;s developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String userIdOrEmail = "iago@zulip.com"; // String | The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email. 
    try {
      JsonSuccessBase result = apiInstance.getUserPresence(userIdOrEmail);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserPresence");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIdOrEmail** | **String**| The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

<a name="getUsers"></a>
# **getUsers**
> JsonSuccessBase getUsers(clientGravatar, includeCustomProfileFields)

Get all users

Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  &#x60;GET {{ api_url }}/v1/users&#x60;  You can also [fetch details on a single user](/api/get-user). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Boolean clientGravatar = false; // Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
    Boolean includeCustomProfileFields = false; // Boolean | Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API. 
    try {
      JsonSuccessBase result = apiInstance.getUsers(clientGravatar, includeCustomProfileFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGravatar** | **Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to false]
 **includeCustomProfileFields** | **Boolean**| Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

<a name="muteUser"></a>
# **muteUser**
> JsonSuccess muteUser(mutedUserId)

Mute a user

This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you&#39;ve muted will be automatically marked as read and hidden.  &#x60;POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \&quot;Muted user\&quot;, rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \&quot;All users that exist   on this stream or realm\&quot;, e.g. for organization   administration or showing stream subscribers, should display   the user&#39;s name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer mutedUserId = 10; // Integer | The ID of the user to mute/un-mute. 
    try {
      JsonSuccess result = apiInstance.muteUser(mutedUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#muteUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutedUserId** | **Integer**| The ID of the user to mute/un-mute.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

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

<a name="reactivateUser"></a>
# **reactivateUser**
> Object reactivateUser(userId)

Reactivate a user

[Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  &#x60;POST {{ api_url }}/v1/users/{user_id}/reactivate&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer userId = 12; // Integer | The target user's ID. 
    try {
      Object result = apiInstance.reactivateUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#reactivateUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The target user&#39;s ID.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="removeUserGroup"></a>
# **removeUserGroup**
> JsonSuccess removeUserGroup(userGroupId)

Delete a user group

Delete a [user group](/help/user-groups).  &#x60;DELETE {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer userGroupId = 1; // Integer | The ID of the target user group. 
    try {
      JsonSuccess result = apiInstance.removeUserGroup(userGroupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#removeUserGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **Integer**| The ID of the target user group.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

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

<a name="setTypingStatus"></a>
# **setTypingStatus**
> JsonSuccess setTypingStatus(op, to, type, topic)

Set \&quot;typing\&quot; status

Notify other users whether the current user is typing a message.  &#x60;POST {{ api_url }}/v1/typing&#x60;  Clients implementing Zulip&#39;s typing notifications protocol should work as follows:  * Send a request to this endpoint with &#x60;op&#x3D;\&quot;start\&quot;&#x60; when a user starts typing a message,   and also every &#x60;TYPING_STARTED_WAIT_PERIOD&#x3D;10&#x60; seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with &#x60;op&#x3D;\&quot;stop\&quot;&#x60; when a user pauses using the   compose UI for at least &#x60;TYPING_STOPPED_WAIT_PERIOD&#x3D;5&#x60; seconds or cancels   the compose action (if it had previously sent a \&quot;start\&quot; operation for that   compose action). * Start displaying \&quot;Sender is typing\&quot; for a given conversation when the client   receives an &#x60;op&#x3D;\&quot;start\&quot;&#x60; event from the [events API](/api/get-events). * Continue displaying \&quot;Sender is typing\&quot; until they receive an &#x60;op&#x3D;\&quot;stop\&quot;&#x60; event   from the [events API](/api/get-events) or &#x60;TYPING_STARTED_EXPIRY_PERIOD&#x3D;15&#x60;   seconds have passed without a new &#x60;op&#x3D;\&quot;start\&quot;&#x60; event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   &#x60;stream_typing_notifications&#x60; in the &#x60;client_capabilities&#x60; parameter to &#x60;/register&#x60;.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip&#39;s typing notifications protocol. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String op = "start"; // String | Whether the user has started (`start`) or stopped (`stop`) to type. 
    List<Integer> to = Arrays.asList(); // List<Integer> | For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). 
    String type = "private"; // String | Type of the message being composed. 
    String topic = "typing notifications"; // String | Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. 
    try {
      JsonSuccess result = apiInstance.setTypingStatus(op, to, type, topic);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#setTypingStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **op** | **String**| Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type.  | [enum: start, stop]
 **to** | [**List&lt;Integer&gt;**](Integer.md)| For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  |
 **type** | **String**| Type of the message being composed.  | [optional] [default to private] [enum: private, stream]
 **topic** | **String**| Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type.  | [optional]

### Return type

[**JsonSuccess**](JsonSuccess.md)

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

<a name="unmuteUser"></a>
# **unmuteUser**
> JsonSuccess unmuteUser(mutedUserId)

Unmute a user

This endpoint unmutes a user.  &#x60;DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 48). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer mutedUserId = 10; // Integer | The ID of the user to mute/un-mute. 
    try {
      JsonSuccess result = apiInstance.unmuteUser(mutedUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#unmuteUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mutedUserId** | **Integer**| The ID of the user to mute/un-mute.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

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

<a name="updateSettings"></a>
# **updateSettings**
> JsonSuccessBase updateSettings(fullName, email, oldPassword, newPassword, twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, enableDraftsSynchronization, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone, enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, emailNotificationsBatchingPeriodSeconds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled, enterSends)

Update settings

This endpoint is used to edit the current user&#39;s settings.  &#x60;PATCH {{ api_url }}/v1/settings&#x60;  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the &#x60;full_name&#x60;, &#x60;email&#x60;, &#x60;old_password&#x60;, and &#x60;new_password&#x60; parameters. Notification settings were managed by &#x60;PATCH /settings/notifications&#x60;, and all other settings by &#x60;PATCH /settings/display&#x60;. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for &#x60;/settings&#x60; in Zulip 5.0 (feature level 78).  The &#x60;/settings/display&#x60; and &#x60;/settings/notifications&#x60; endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String fullName = "NewName"; // String | A new display name for the user. 
    String email = "newname@example.com"; // String | Asks the server to initiate a confirmation sequence to change the user's email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address. 
    String oldPassword = "old12345"; // String | The user's old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the `new_password` parameter. 
    String newPassword = "new12345"; // String | The user's new Zulip password (or LDAP password, if LDAP authentication is in use).  The `old_password` parameter must be included in the request. 
    Boolean twentyFourHourTime = true; // Boolean | Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
    Boolean denseMode = true; // Boolean | This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
    Boolean starredMessageCounts = true; // Boolean | Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
    Boolean fluidLayoutWidth = true; // Boolean | Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
    Boolean highContrastMode = true; // Boolean | This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
    Integer colorScheme = 56; // Integer | Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
    Boolean enableDraftsSynchronization = true; // Boolean | A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87). 
    Boolean translateEmoticons = true; // Boolean | Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
    String defaultLanguage = "en"; // String | What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
    String defaultView = "all_messages"; // String | The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
    Boolean leftSideUserlist = true; // Boolean | Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
    String emojiset = "google"; // String | The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
    Integer demoteInactiveStreams = 56; // Integer | Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint. 
    String timezone = "Asia/Kolkata"; // String | The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64). 
    Boolean enableStreamDesktopNotifications = true; // Boolean | Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean enableStreamEmailNotifications = true; // Boolean | Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean enableStreamPushNotifications = true; // Boolean | Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean enableStreamAudibleNotifications = true; // Boolean | Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    String notificationSound = "ding"; // String | Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63). 
    Boolean enableDesktopNotifications = true; // Boolean | Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean enableSounds = true; // Boolean | Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Integer emailNotificationsBatchingPeriodSeconds = 120; // Integer | The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82) 
    Boolean enableOfflineEmailNotifications = true; // Boolean | Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean enableOfflinePushNotifications = true; // Boolean | Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean enableOnlinePushNotifications = true; // Boolean | Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean enableDigestEmails = true; // Boolean | Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean enableMarketingEmails = true; // Boolean | Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean enableLoginEmails = true; // Boolean | Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean messageContentInEmailNotifications = true; // Boolean | Include the message's content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean pmContentInDesktopNotifications = true; // Boolean | Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean wildcardMentionsNotify = true; // Boolean | Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Integer desktopIconCountDisplay = 56; // Integer | Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean realmNameInNotifications = true; // Boolean | Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean presenceEnabled = true; // Boolean | Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint. 
    Boolean enterSends = true; // Boolean | Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the `POST /users/me/enter-sends` endpoint, with the same parameter format. 
    try {
      JsonSuccessBase result = apiInstance.updateSettings(fullName, email, oldPassword, newPassword, twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, enableDraftsSynchronization, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone, enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, emailNotificationsBatchingPeriodSeconds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled, enterSends);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullName** | **String**| A new display name for the user.  | [optional]
 **email** | **String**| Asks the server to initiate a confirmation sequence to change the user&#39;s email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address.  | [optional]
 **oldPassword** | **String**| The user&#39;s old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the &#x60;new_password&#x60; parameter.  | [optional]
 **newPassword** | **String**| The user&#39;s new Zulip password (or LDAP password, if LDAP authentication is in use).  The &#x60;old_password&#x60; parameter must be included in the request.  | [optional]
 **twentyFourHourTime** | **Boolean**| Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **denseMode** | **Boolean**| This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **starredMessageCounts** | **Boolean**| Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **fluidLayoutWidth** | **Boolean**| Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app&#39;s center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **highContrastMode** | **Boolean**| This setting is reserved for use to control variations in Zulip&#39;s design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **colorScheme** | **Integer**| Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard &#x60;prefers-color-scheme&#x60; media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] [enum: 1, 2, 3]
 **enableDraftsSynchronization** | **Boolean**| A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87).  | [optional]
 **translateEmoticons** | **Boolean**| Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **defaultLanguage** | **String**| What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, &#x60;\&quot;en\&quot;&#x60; for English or &#x60;\&quot;de\&quot;&#x60; for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  | [optional]
 **defaultView** | **String**| The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the &#x60;Esc&#x60; keyboard shortcut repeatedly.  * \&quot;recent_topics\&quot; - Recent topics view * \&quot;all_messages\&quot; - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional]
 **leftSideUserlist** | **Boolean**| Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional]
 **emojiset** | **String**| The user&#39;s configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \&quot;google\&quot; - Google modern * \&quot;google-blob\&quot; - Google classic * \&quot;twitter\&quot; - Twitter * \&quot;text\&quot; - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional]
 **demoteInactiveStreams** | **Integer**| Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  | [optional] [enum: 1, 2, 3]
 **timezone** | **String**| The user&#39;s [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/display&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  | [optional]
 **enableStreamDesktopNotifications** | **Boolean**| Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enableStreamEmailNotifications** | **Boolean**| Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enableStreamPushNotifications** | **Boolean**| Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enableStreamAudibleNotifications** | **Boolean**| Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **notificationSound** | **String**| Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  | [optional]
 **enableDesktopNotifications** | **Boolean**| Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enableSounds** | **Boolean**| Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **emailNotificationsBatchingPeriodSeconds** | **Integer**| The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82)  | [optional]
 **enableOfflineEmailNotifications** | **Boolean**| Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enableOfflinePushNotifications** | **Boolean**| Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enableOnlinePushNotifications** | **Boolean**| Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enableDigestEmails** | **Boolean**| Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enableMarketingEmails** | **Boolean**| Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enableLoginEmails** | **Boolean**| Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **messageContentInEmailNotifications** | **Boolean**| Include the message&#39;s content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **pmContentInDesktopNotifications** | **Boolean**| Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **wildcardMentionsNotify** | **Boolean**| Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **desktopIconCountDisplay** | **Integer**| Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional] [enum: 1, 2, 3]
 **realmNameInNotifications** | **Boolean**| Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **presenceEnabled** | **Boolean**| Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the &#x60;PATCH /settings/notifications&#x60; endpoint.  | [optional]
 **enterSends** | **Boolean**| Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the &#x60;POST /users/me/enter-sends&#x60; endpoint, with the same parameter format.  | [optional]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="updateStatus"></a>
# **updateStatus**
> JsonSuccess updateStatus(statusText, away, emojiName, emojiCode, reactionType)

Update your status

Change your [status](/help/status-and-availability).  &#x60;POST {{ api_url }}/v1/users/me/status&#x60;  A request to this endpoint will only change the parameters passed. For example, passing just &#x60;status_text&#x60; requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user&#39;s status to a specific value should pass all supported parameters. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String statusText = "on vacation"; // String | The text content of the status message. Sending the empty string will clear the user's status.  **Note**: The limit on the size of the message is 60 characters. 
    Boolean away = true; // Boolean | Whether the user should be marked as \"away\". 
    String emojiName = "car"; // String | The name for the emoji to associate with this status. 
    String emojiCode = "1f697"; // String | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
    String reactionType = "unicode_emoji"; // String | One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
    try {
      JsonSuccess result = apiInstance.updateStatus(statusText, away, emojiName, emojiCode, reactionType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusText** | **String**| The text content of the status message. Sending the empty string will clear the user&#39;s status.  **Note**: The limit on the size of the message is 60 characters.  | [optional]
 **away** | **Boolean**| Whether the user should be marked as \&quot;away\&quot;.  | [optional]
 **emojiName** | **String**| The name for the emoji to associate with this status.  | [optional]
 **emojiCode** | **String**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji.  | [optional]
 **reactionType** | **String**| One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji.  | [optional]

### Return type

[**JsonSuccess**](JsonSuccess.md)

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

<a name="updateUser"></a>
# **updateUser**
> JsonSuccess updateUser(userId, fullName, role, profileData)

Update a user

Administrative endpoint to update the details of another user in the organization.  &#x60;PATCH {{ api_url }}/v1/users/{user_id}&#x60;  Supports everything an administrator can do to edit details of another user&#39;s account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer userId = 12; // Integer | The target user's ID. 
    String fullName = "fullName_example"; // String | The user's full name. 
    Integer role = 400; // Integer | New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60). 
    List<Object> profileData = null; // List<Object> | A dictionary containing the to be updated custom profile field data for the user. 
    try {
      JsonSuccess result = apiInstance.updateUser(userId, fullName, role, profileData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The target user&#39;s ID.  |
 **fullName** | **String**| The user&#39;s full name.  | [optional]
 **role** | **Integer**| New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of &#x60;is_admin&#x60; and &#x60;is_guest&#x60; boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  | [optional]
 **profileData** | [**List&lt;Object&gt;**](Object.md)| A dictionary containing the to be updated custom profile field data for the user.  | [optional]

### Return type

[**JsonSuccess**](JsonSuccess.md)

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

<a name="updateUserGroup"></a>
# **updateUserGroup**
> JsonSuccess updateUserGroup(userGroupId, name, description)

Update a user group

Update the name or description of a [user group](/help/user-groups).  &#x60;PATCH {{ api_url }}/v1/user_groups/{user_group_id}&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer userGroupId = 1; // Integer | The ID of the target user group. 
    String name = "marketing team"; // String | The new name of the group. 
    String description = "The marketing team."; // String | The new description of the group. 
    try {
      JsonSuccess result = apiInstance.updateUserGroup(userGroupId, name, description);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUserGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **Integer**| The ID of the target user group.  |
 **name** | **String**| The new name of the group.  |
 **description** | **String**| The new description of the group.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

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

<a name="updateUserGroupMembers"></a>
# **updateUserGroupMembers**
> JsonSuccess updateUserGroupMembers(userGroupId, delete, add)

Update user group members

Update the members of a [user group](/help/user-groups).  &#x60;POST {{ api_url }}/v1/user_groups/{user_group_id}/members&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer userGroupId = 1; // Integer | The ID of the target user group. 
    List<Integer> delete = Arrays.asList(); // List<Integer> | The list of user ids to be removed from the user group. 
    List<Integer> add = Arrays.asList(); // List<Integer> | The list of user ids to be added to the user group. 
    try {
      JsonSuccess result = apiInstance.updateUserGroupMembers(userGroupId, delete, add);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUserGroupMembers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **Integer**| The ID of the target user group.  |
 **delete** | [**List&lt;Integer&gt;**](Integer.md)| The list of user ids to be removed from the user group.  | [optional]
 **add** | [**List&lt;Integer&gt;**](Integer.md)| The list of user ids to be added to the user group.  | [optional]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

