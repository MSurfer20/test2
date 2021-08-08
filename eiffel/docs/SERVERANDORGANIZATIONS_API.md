# SERVERANDORGANIZATIONS_API

All URIs are relative to *https://example.zulipchat.com/api/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**add_code_playground**](SERVERANDORGANIZATIONS_API.md#add_code_playground) | **Post** /realm/playgrounds | Add a code playground
[**add_linkifier**](SERVERANDORGANIZATIONS_API.md#add_linkifier) | **Post** /realm/filters | Add a linkifier
[**create_custom_profile_field**](SERVERANDORGANIZATIONS_API.md#create_custom_profile_field) | **Post** /realm/profile_fields | Create a custom profile field
[**custom_emoji**](SERVERANDORGANIZATIONS_API.md#custom_emoji) | **Get** /realm/emoji | Get all custom emoji
[**custom_profile_fields**](SERVERANDORGANIZATIONS_API.md#custom_profile_fields) | **Get** /realm/profile_fields | Get all custom profile fields
[**linkifiers**](SERVERANDORGANIZATIONS_API.md#linkifiers) | **Get** /realm/linkifiers | Get linkifiers
[**remove_code_playground**](SERVERANDORGANIZATIONS_API.md#remove_code_playground) | **Delete** /realm/playgrounds/{playground_id} | Remove a code playground
[**remove_linkifier**](SERVERANDORGANIZATIONS_API.md#remove_linkifier) | **Delete** /realm/filters/{filter_id} | Remove a linkifier
[**reorder_custom_profile_fields**](SERVERANDORGANIZATIONS_API.md#reorder_custom_profile_fields) | **Patch** /realm/profile_fields | Reorder custom profile fields
[**server_settings**](SERVERANDORGANIZATIONS_API.md#server_settings) | **Get** /server_settings | Get server settings
[**update_linkifier**](SERVERANDORGANIZATIONS_API.md#update_linkifier) | **Patch** /realm/filters/{filter_id} | Update a linkifier
[**upload_custom_emoji**](SERVERANDORGANIZATIONS_API.md#upload_custom_emoji) | **Post** /realm/emoji/{emoji_name} | Upload custom emoji


# **add_code_playground**
> add_code_playground (name: STRING_32 ; pygments_language: STRING_32 ; url_prefix: STRING_32 ): detachable JSON_SUCCESS_BASE
	

Add a code playground

Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **STRING_32**| The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  | [default to null]
 **pygments_language** | **STRING_32**| The name of the Pygments language lexer for that programming language.  | [default to null]
 **url_prefix** | **STRING_32**| The url prefix for the playground.  | [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add_linkifier**
> add_linkifier (pattern: STRING_32 ; url_format_string: STRING_32 ): detachable JSON_SUCCESS_BASE
	

Add a linkifier

Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pattern** | **STRING_32**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | [default to null]
 **url_format_string** | **STRING_32**| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_custom_profile_field**
> create_custom_profile_field (field_type: INTEGER_32 ; name:  detachable STRING_32 ; hint:  detachable STRING_32 ; field_data:  detachable ANY ): detachable JSON_SUCCESS_BASE
	

Create a custom profile field

[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field_type** | **INTEGER_32**| The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  | [default to null]
 **name** | **STRING_32**| The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile.  | [optional] [default to null]
 **hint** | **STRING_32**| The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  | [optional] [default to null]
 **field_data** | [**ANY**](.md)| Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  | [optional] [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **custom_emoji**
> custom_emoji : detachable JSON_SUCCESS_BASE
	

Get all custom emoji

Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 


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

# **custom_profile_fields**
> custom_profile_fields : detachable JSON_SUCCESS_BASE
	

Get all custom profile fields

Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 


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

# **linkifiers**
> linkifiers : detachable JSON_SUCCESS_BASE
	

Get linkifiers

List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 


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

# **remove_code_playground**
> remove_code_playground (playground_id: INTEGER_32 ): detachable JSON_SUCCESS
	

Remove a code playground

Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playground_id** | **INTEGER_32**| The ID of the playground that you want to remove.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_linkifier**
> remove_linkifier (filter_id: INTEGER_32 ): detachable JSON_SUCCESS
	

Remove a linkifier

Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter_id** | **INTEGER_32**| The ID of the linkifier that you want to remove.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reorder_custom_profile_fields**
> reorder_custom_profile_fields (order: LIST [INTEGER_32] ): detachable JSON_SUCCESS
	

Reorder custom profile fields

Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**LIST [INTEGER_32]**](INTEGER_32.md)| A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **server_settings**
> server_settings : detachable JSON_SUCCESS_BASE
	

Get server settings

Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 


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

# **update_linkifier**
> update_linkifier (filter_id: INTEGER_32 ; pattern: STRING_32 ; url_format_string: STRING_32 ): detachable JSON_SUCCESS
	

Update a linkifier

Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter_id** | **INTEGER_32**| The ID of the linkifier that you want to update.  | [default to null]
 **pattern** | **STRING_32**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | [default to null]
 **url_format_string** | **STRING_32**| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_custom_emoji**
> upload_custom_emoji (emoji_name: STRING_32 ; filename:  detachable FILE ): detachable JSON_SUCCESS
	

Upload custom emoji

This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emoji_name** | **STRING_32**| The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  | [default to null]
 **filename** | **FILE**|  | [optional] [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

