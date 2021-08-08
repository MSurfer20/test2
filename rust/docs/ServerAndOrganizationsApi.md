# \ServerAndOrganizationsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_code_playground**](ServerAndOrganizationsApi.md#add_code_playground) | **POST** /realm/playgrounds | Add a code playground
[**add_linkifier**](ServerAndOrganizationsApi.md#add_linkifier) | **POST** /realm/filters | Add a linkifier
[**create_custom_profile_field**](ServerAndOrganizationsApi.md#create_custom_profile_field) | **POST** /realm/profile_fields | Create a custom profile field
[**get_custom_emoji**](ServerAndOrganizationsApi.md#get_custom_emoji) | **GET** /realm/emoji | Get all custom emoji
[**get_custom_profile_fields**](ServerAndOrganizationsApi.md#get_custom_profile_fields) | **GET** /realm/profile_fields | Get all custom profile fields
[**get_linkifiers**](ServerAndOrganizationsApi.md#get_linkifiers) | **GET** /realm/linkifiers | Get linkifiers
[**get_server_settings**](ServerAndOrganizationsApi.md#get_server_settings) | **GET** /server_settings | Get server settings
[**remove_code_playground**](ServerAndOrganizationsApi.md#remove_code_playground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
[**remove_linkifier**](ServerAndOrganizationsApi.md#remove_linkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
[**reorder_custom_profile_fields**](ServerAndOrganizationsApi.md#reorder_custom_profile_fields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
[**update_linkifier**](ServerAndOrganizationsApi.md#update_linkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
[**upload_custom_emoji**](ServerAndOrganizationsApi.md#upload_custom_emoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji



## add_code_playground

> crate::models::JsonSuccessBase add_code_playground(name, pygments_language, url_prefix)
Add a code playground

Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**name** | **String** | The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  | [required] |
**pygments_language** | **String** | The name of the Pygments language lexer for that programming language.  | [required] |
**url_prefix** | **String** | The url prefix for the playground.  | [required] |

### Return type

[**crate::models::JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## add_linkifier

> crate::models::JsonSuccessBase add_linkifier(pattern, url_format_string)
Add a linkifier

Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**pattern** | **String** | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | [required] |
**url_format_string** | **String** | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.  | [required] |

### Return type

[**crate::models::JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_custom_profile_field

> crate::models::JsonSuccessBase create_custom_profile_field(field_type, name, hint, field_data)
Create a custom profile field

[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**field_type** | **i32** | The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  | [required] |
**name** | Option<**String**> | The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile.  |  |
**hint** | Option<**String**> | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  |  |
**field_data** | Option<[**serde_json::Value**](.md)> | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  |  |

### Return type

[**crate::models::JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_custom_emoji

> crate::models::JsonSuccessBase get_custom_emoji()
Get all custom emoji

Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 

### Parameters

This endpoint does not need any parameter.

### Return type

[**crate::models::JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_custom_profile_fields

> crate::models::JsonSuccessBase get_custom_profile_fields()
Get all custom profile fields

Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 

### Parameters

This endpoint does not need any parameter.

### Return type

[**crate::models::JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_linkifiers

> crate::models::JsonSuccessBase get_linkifiers()
Get linkifiers

List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 

### Parameters

This endpoint does not need any parameter.

### Return type

[**crate::models::JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_server_settings

> crate::models::JsonSuccessBase get_server_settings()
Get server settings

Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 

### Parameters

This endpoint does not need any parameter.

### Return type

[**crate::models::JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## remove_code_playground

> crate::models::JsonSuccess remove_code_playground(playground_id)
Remove a code playground

Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**playground_id** | **i32** | The ID of the playground that you want to remove.  | [required] |

### Return type

[**crate::models::JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## remove_linkifier

> crate::models::JsonSuccess remove_linkifier(filter_id)
Remove a linkifier

Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**filter_id** | **i32** | The ID of the linkifier that you want to remove.  | [required] |

### Return type

[**crate::models::JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reorder_custom_profile_fields

> crate::models::JsonSuccess reorder_custom_profile_fields(order)
Reorder custom profile fields

Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**order** | [**Vec<i32>**](i32.md) | A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  | [required] |

### Return type

[**crate::models::JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_linkifier

> crate::models::JsonSuccess update_linkifier(filter_id, pattern, url_format_string)
Update a linkifier

Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**filter_id** | **i32** | The ID of the linkifier that you want to update.  | [required] |
**pattern** | **String** | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | [required] |
**url_format_string** | **String** | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.  | [required] |

### Return type

[**crate::models::JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## upload_custom_emoji

> crate::models::JsonSuccess upload_custom_emoji(emoji_name, filename)
Upload custom emoji

This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**emoji_name** | **String** | The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  | [required] |
**filename** | Option<**std::path::PathBuf**> |  |  |

### Return type

[**crate::models::JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

