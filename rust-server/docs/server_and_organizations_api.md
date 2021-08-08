# server_and_organizations_api

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**add-code-playground**](server_and_organizations_api.md#add-code-playground) | **POST** /realm/playgrounds | Add a code playground
**add-linkifier**](server_and_organizations_api.md#add-linkifier) | **POST** /realm/filters | Add a linkifier
**create-custom-profile-field**](server_and_organizations_api.md#create-custom-profile-field) | **POST** /realm/profile_fields | Create a custom profile field
**get-custom-emoji**](server_and_organizations_api.md#get-custom-emoji) | **GET** /realm/emoji | Get all custom emoji
**get-custom-profile-fields**](server_and_organizations_api.md#get-custom-profile-fields) | **GET** /realm/profile_fields | Get all custom profile fields
**get-linkifiers**](server_and_organizations_api.md#get-linkifiers) | **GET** /realm/linkifiers | Get linkifiers
**get-server-settings**](server_and_organizations_api.md#get-server-settings) | **GET** /server_settings | Get server settings
**remove-code-playground**](server_and_organizations_api.md#remove-code-playground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
**remove-linkifier**](server_and_organizations_api.md#remove-linkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
**reorder-custom-profile-fields**](server_and_organizations_api.md#reorder-custom-profile-fields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
**update-linkifier**](server_and_organizations_api.md#update-linkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
**upload-custom-emoji**](server_and_organizations_api.md#upload-custom-emoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji


# **add-code-playground**
> JsonSuccessBase add-code-playground(name, pygments_language, url_prefix)
Add a code playground

Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **name** | **String**| The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  | 
  **pygments_language** | **String**| The name of the Pygments language lexer for that programming language.  | 
  **url_prefix** | **String**| The url prefix for the playground.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add-linkifier**
> JsonSuccessBase add-linkifier(pattern, url_format_string)
Add a linkifier

Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **pattern** | **String**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
  **url_format_string** | **String**| The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create-custom-profile-field**
> JsonSuccessBase create-custom-profile-field(field_type, optional)
Create a custom profile field

[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **field_type** | **i32**| The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field_type** | **i32**| The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  | 
 **name** | **String**| The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile.  | 
 **hint** | **String**| The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  | 
 **field_data** | [****](.md)| Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get-custom-emoji**
> JsonSuccessBase get-custom-emoji()
Get all custom emoji

Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get-custom-profile-fields**
> JsonSuccessBase get-custom-profile-fields()
Get all custom profile fields

Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get-linkifiers**
> JsonSuccessBase get-linkifiers()
Get linkifiers

List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get-server-settings**
> JsonSuccessBase get-server-settings()
Get server settings

Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove-code-playground**
> JsonSuccess remove-code-playground(playground_id)
Remove a code playground

Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **playground_id** | **i32**| The ID of the playground that you want to remove.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove-linkifier**
> JsonSuccess remove-linkifier(filter_id)
Remove a linkifier

Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **filter_id** | **i32**| The ID of the linkifier that you want to remove.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reorder-custom-profile-fields**
> JsonSuccess reorder-custom-profile-fields(order)
Reorder custom profile fields

Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **order** | [**i32**](i32.md)| A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update-linkifier**
> JsonSuccess update-linkifier(filter_id, pattern, url_format_string)
Update a linkifier

Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **filter_id** | **i32**| The ID of the linkifier that you want to update.  | 
  **pattern** | **String**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
  **url_format_string** | **String**| The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload-custom-emoji**
> JsonSuccess upload-custom-emoji(emoji_name, optional)
Upload custom emoji

This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **emoji_name** | **String**| The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emoji_name** | **String**| The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  | 
 **filename** | **swagger::ByteArray**|  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

