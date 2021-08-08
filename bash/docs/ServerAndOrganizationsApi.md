# ServerAndOrganizationsApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCodePlayground**](ServerAndOrganizationsApi.md#addCodePlayground) | **POST** /realm/playgrounds | Add a code playground
[**addLinkifier**](ServerAndOrganizationsApi.md#addLinkifier) | **POST** /realm/filters | Add a linkifier
[**createCustomProfileField**](ServerAndOrganizationsApi.md#createCustomProfileField) | **POST** /realm/profile_fields | Create a custom profile field
[**getCustomEmoji**](ServerAndOrganizationsApi.md#getCustomEmoji) | **GET** /realm/emoji | Get all custom emoji
[**getCustomProfileFields**](ServerAndOrganizationsApi.md#getCustomProfileFields) | **GET** /realm/profile_fields | Get all custom profile fields
[**getLinkifiers**](ServerAndOrganizationsApi.md#getLinkifiers) | **GET** /realm/linkifiers | Get linkifiers
[**getServerSettings**](ServerAndOrganizationsApi.md#getServerSettings) | **GET** /server_settings | Get server settings
[**removeCodePlayground**](ServerAndOrganizationsApi.md#removeCodePlayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
[**removeLinkifier**](ServerAndOrganizationsApi.md#removeLinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
[**reorderCustomProfileFields**](ServerAndOrganizationsApi.md#reorderCustomProfileFields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
[**updateLinkifier**](ServerAndOrganizationsApi.md#updateLinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
[**uploadCustomEmoji**](ServerAndOrganizationsApi.md#uploadCustomEmoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji



## addCodePlayground

Add a code playground

Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.

'POST {{ api_url }}/v1/realm/playgrounds'

**Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was
fixed in Zulip 4.0 (feature level 57).

### Example

```bash
 addCodePlayground  name=value  pygments_language=value  url_prefix=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** | The user-visible display name of the playground which can be
used to pick the target playground, especially when multiple
playground options exist for that programming language. | [default to null]
 **pygmentsLanguage** | **string** | The name of the Pygments language lexer for that
programming language. | [default to null]
 **urlPrefix** | **string** | The url prefix for the playground. | [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## addLinkifier

Add a linkifier

Configure [linkifiers](/help/add-a-custom-linkifier),
regular expression patterns that are automatically linkified when they
appear in messages and topics.

'POST {{ api_url }}/v1/realm/filters'

### Example

```bash
 addLinkifier  pattern=value  url_format_string=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pattern** | **string** | The [Python regular
expression](https://docs.python.org/3/howto/regex.html) that should
trigger the linkifier. | [default to null]
 **urlFormatString** | **string** | The URL used for the link. If you used named groups for the 'pattern',
you can insert their content here with
'%(name_of_the_capturing_group)s'. | [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createCustomProfileField

Create a custom profile field

[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.

'POST {{ api_url }}/v1/realm/profile_fields'

### Example

```bash
 createCustomProfileField  field_type=value  name=value  hint=value  field_data=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldType** | **integer** | The field type can be any of the supported custom profile field types. See the
[custom profile fields documentation](/help/add-custom-profile-fields)
more details on what each type means.

* **1**: Short text
* **2**: Long text
* **3**: List of options
* **4**: Date picker
* **5**: Link
* **6**: Person picker
* **7**: External account | [default to null]
 **name** | **string** | The name of the custom profile field, which will appear both in
user-facing settings UI for configuring custom profile fields and
in UI displaying a user's profile. | [optional] [default to null]
 **hint** | **string** | The help text to be displayed for the custom profile field in user-facing
settings UI for configuring custom profile fields. | [optional] [default to null]
 **fieldData** | [**map**](.md) | Field types 3 (List of options) and 7 (External account) support storing
additional configuration for the field type in the 'field_data' attribute.

For field type 3 (List of options), this attribute is a JSON dictionary
defining the choices and the order they will be displayed in the
dropdown UI for individual users to select an option.

The interface for field type 7 is not yet stabilized. | [optional] [default to null]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCustomEmoji

Get all custom emoji

Get all the custom emoji in the user's organization.

'GET {{ api_url }}/v1/realm/emoji'

### Example

```bash
 getCustomEmoji
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCustomProfileFields

Get all custom profile fields

Get all the [custom profile fields](/help/add-custom-profile-fields)
configured for the user's organization.

'GET {{ api_url }}/v1/realm/profile_fields'

### Example

```bash
 getCustomProfileFields
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getLinkifiers

Get linkifiers

List all of an organization's configured
[linkifiers](/help/add-a-custom-linkifier), regular
expression patterns that are automatically linkified when they appear
in messages and topics.

'GET {{ api_url }}/v1/realm/linkifiers'

**Changes**: New in Zulip 4.0 (feature level 54). On older versions,
a similar 'GET /realm/filters' endpoint was available with each entry in
a '[pattern, url_format, id]' tuple format.

### Example

```bash
 getLinkifiers
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getServerSettings

Get server settings

Fetch global settings for a Zulip server.

'GET {{ api_url }}/v1/server_settings'

**Note:** this endpoint does not require any authentication at all, and you can use it to check:

* If this is a Zulip server, and if so, what version of Zulip it's running.
* What a Zulip client (e.g. a mobile app or
[zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to
know in order to display a login prompt for the server (e.g. what
authentication methods are available).

### Example

```bash
 getServerSettings
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## removeCodePlayground

Remove a code playground

Remove a [code playground](/help/code-blocks#code-playgrounds) previously
configured for an organization.

'DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}'

**Changes**: New in Zulip 4.0 (feature level 49).

### Example

```bash
 removeCodePlayground playground_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playgroundId** | **integer** | The ID of the playground that you want to remove. | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## removeLinkifier

Remove a linkifier

Remove [linkifiers](/help/add-a-custom-linkifier), regular
expression patterns that are automatically linkified when they appear
in messages and topics.

'DELETE {{ api_url }}/v1/realm/filters/{filter_id}'

### Example

```bash
 removeLinkifier filter_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterId** | **integer** | The ID of the linkifier that you want to remove. | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reorderCustomProfileFields

Reorder custom profile fields

Reorder the custom profile fields in the user's organization.

'PATCH {{ api_url }}/v1/realm/profile_fields'

Custom profile fields are displayed in Zulip UI widgets in order; this
endpoint allows administrative settings UI to change the field ordering.

This endpoint is used to implement the dragging feature described in the
[custom profile fields documentation](/help/add-custom-profile-fields).

### Example

```bash
 reorderCustomProfileFields  Specify as:  order=value1 order=value2 order=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**array[integer]**](integer.md) | A list of the IDs of all the custom profile fields defined in this
organization, in the desired new order. | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateLinkifier

Update a linkifier

Update a [linkifier](/help/add-a-custom-linkifier), regular
expression patterns that are automatically linkified when they appear
in messages and topics.

'PATCH {{ api_url }}/v1/realm/filters/{filter_id}'

**Changes**: New in Zulip 4.0 (feature level 57).

### Example

```bash
 updateLinkifier filter_id=value  pattern=value  url_format_string=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterId** | **integer** | The ID of the linkifier that you want to update. | [default to null]
 **pattern** | **string** | The [Python regular
expression](https://docs.python.org/3/howto/regex.html) that should
trigger the linkifier. | [default to null]
 **urlFormatString** | **string** | The URL used for the link. If you used named groups for the 'pattern',
you can insert their content here with
'%(name_of_the_capturing_group)s'. | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## uploadCustomEmoji

Upload custom emoji

This endpoint is used to upload a custom emoji for use in the user's
organization.  Access to this endpoint depends on the
[organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).

'POST {{ api_url }}/v1/realm/emoji/{emoji_name}'

### Example

```bash
 uploadCustomEmoji emoji_name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emojiName** | **string** | The name that should be associated with the uploaded emoji image/gif.
The emoji name can only contain letters, numbers, dashes, and spaces.
Upper and lower case letters are treated the same, and underscores (_)
are treated the same as spaces (consistent with how the Zulip UI
handles emoji). | [default to null]
 **filename** | **binary** |  | [optional] [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

