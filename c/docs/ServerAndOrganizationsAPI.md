# ServerAndOrganizationsAPI

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ServerAndOrganizationsAPI_addCodePlayground**](ServerAndOrganizationsAPI.md#ServerAndOrganizationsAPI_addCodePlayground) | **POST** /realm/playgrounds | Add a code playground
[**ServerAndOrganizationsAPI_addLinkifier**](ServerAndOrganizationsAPI.md#ServerAndOrganizationsAPI_addLinkifier) | **POST** /realm/filters | Add a linkifier
[**ServerAndOrganizationsAPI_createCustomProfileField**](ServerAndOrganizationsAPI.md#ServerAndOrganizationsAPI_createCustomProfileField) | **POST** /realm/profile_fields | Create a custom profile field
[**ServerAndOrganizationsAPI_getCustomEmoji**](ServerAndOrganizationsAPI.md#ServerAndOrganizationsAPI_getCustomEmoji) | **GET** /realm/emoji | Get all custom emoji
[**ServerAndOrganizationsAPI_getCustomProfileFields**](ServerAndOrganizationsAPI.md#ServerAndOrganizationsAPI_getCustomProfileFields) | **GET** /realm/profile_fields | Get all custom profile fields
[**ServerAndOrganizationsAPI_getLinkifiers**](ServerAndOrganizationsAPI.md#ServerAndOrganizationsAPI_getLinkifiers) | **GET** /realm/linkifiers | Get linkifiers
[**ServerAndOrganizationsAPI_getServerSettings**](ServerAndOrganizationsAPI.md#ServerAndOrganizationsAPI_getServerSettings) | **GET** /server_settings | Get server settings
[**ServerAndOrganizationsAPI_removeCodePlayground**](ServerAndOrganizationsAPI.md#ServerAndOrganizationsAPI_removeCodePlayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
[**ServerAndOrganizationsAPI_removeLinkifier**](ServerAndOrganizationsAPI.md#ServerAndOrganizationsAPI_removeLinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
[**ServerAndOrganizationsAPI_reorderCustomProfileFields**](ServerAndOrganizationsAPI.md#ServerAndOrganizationsAPI_reorderCustomProfileFields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
[**ServerAndOrganizationsAPI_updateLinkifier**](ServerAndOrganizationsAPI.md#ServerAndOrganizationsAPI_updateLinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
[**ServerAndOrganizationsAPI_uploadCustomEmoji**](ServerAndOrganizationsAPI.md#ServerAndOrganizationsAPI_uploadCustomEmoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji


# **ServerAndOrganizationsAPI_addCodePlayground**
```c
// Add a code playground
//
// Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
//
json_success_base_t* ServerAndOrganizationsAPI_addCodePlayground(apiClient_t *apiClient, char * name, char * pygments_language, char * url_prefix);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**name** | **char \*** | The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  | 
**pygments_language** | **char \*** | The name of the Pygments language lexer for that programming language.  | 
**url_prefix** | **char \*** | The url prefix for the playground.  | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ServerAndOrganizationsAPI_addLinkifier**
```c
// Add a linkifier
//
// Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
//
json_success_base_t* ServerAndOrganizationsAPI_addLinkifier(apiClient_t *apiClient, char * pattern, char * url_format_string);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**pattern** | **char \*** | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
**url_format_string** | **char \*** | The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ServerAndOrganizationsAPI_createCustomProfileField**
```c
// Create a custom profile field
//
// [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
//
json_success_base_t* ServerAndOrganizationsAPI_createCustomProfileField(apiClient_t *apiClient, int field_type, char * name, char * hint,  field_data);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**field_type** | **int** | The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  | 
**name** | **char \*** | The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile.  | [optional] 
**hint** | **char \*** | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  | [optional] 
**field_data** |  | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  | [optional] 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ServerAndOrganizationsAPI_getCustomEmoji**
```c
// Get all custom emoji
//
// Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
//
json_success_base_t* ServerAndOrganizationsAPI_getCustomEmoji(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ServerAndOrganizationsAPI_getCustomProfileFields**
```c
// Get all custom profile fields
//
// Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
//
json_success_base_t* ServerAndOrganizationsAPI_getCustomProfileFields(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ServerAndOrganizationsAPI_getLinkifiers**
```c
// Get linkifiers
//
// List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
//
json_success_base_t* ServerAndOrganizationsAPI_getLinkifiers(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ServerAndOrganizationsAPI_getServerSettings**
```c
// Get server settings
//
// Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
//
json_success_base_t* ServerAndOrganizationsAPI_getServerSettings(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ServerAndOrganizationsAPI_removeCodePlayground**
```c
// Remove a code playground
//
// Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
//
json_success_t* ServerAndOrganizationsAPI_removeCodePlayground(apiClient_t *apiClient, int playground_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**playground_id** | **int** | The ID of the playground that you want to remove.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ServerAndOrganizationsAPI_removeLinkifier**
```c
// Remove a linkifier
//
// Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
//
json_success_t* ServerAndOrganizationsAPI_removeLinkifier(apiClient_t *apiClient, int filter_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**filter_id** | **int** | The ID of the linkifier that you want to remove.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ServerAndOrganizationsAPI_reorderCustomProfileFields**
```c
// Reorder custom profile fields
//
// Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
//
json_success_t* ServerAndOrganizationsAPI_reorderCustomProfileFields(apiClient_t *apiClient, list_t * order);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**order** | **[list_t](int.md) \*** | A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ServerAndOrganizationsAPI_updateLinkifier**
```c
// Update a linkifier
//
// Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
//
json_success_t* ServerAndOrganizationsAPI_updateLinkifier(apiClient_t *apiClient, int filter_id, char * pattern, char * url_format_string);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**filter_id** | **int** | The ID of the linkifier that you want to update.  | 
**pattern** | **char \*** | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
**url_format_string** | **char \*** | The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ServerAndOrganizationsAPI_uploadCustomEmoji**
```c
// Upload custom emoji
//
// This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
//
json_success_t* ServerAndOrganizationsAPI_uploadCustomEmoji(apiClient_t *apiClient, char * emoji_name, binary_t* filename);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**emoji_name** | **char \*** | The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  | 
**filename** | **binary_t*** |  | [optional] 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

