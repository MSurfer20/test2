# OpenAPI\Client\ServerAndOrganizationsApi

All URIs are relative to https://example.zulipchat.com/api/v1.

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCodePlayground()**](ServerAndOrganizationsApi.md#addCodePlayground) | **POST** /realm/playgrounds | Add a code playground
[**addLinkifier()**](ServerAndOrganizationsApi.md#addLinkifier) | **POST** /realm/filters | Add a linkifier
[**createCustomProfileField()**](ServerAndOrganizationsApi.md#createCustomProfileField) | **POST** /realm/profile_fields | Create a custom profile field
[**getCustomEmoji()**](ServerAndOrganizationsApi.md#getCustomEmoji) | **GET** /realm/emoji | Get all custom emoji
[**getCustomProfileFields()**](ServerAndOrganizationsApi.md#getCustomProfileFields) | **GET** /realm/profile_fields | Get all custom profile fields
[**getLinkifiers()**](ServerAndOrganizationsApi.md#getLinkifiers) | **GET** /realm/linkifiers | Get linkifiers
[**getServerSettings()**](ServerAndOrganizationsApi.md#getServerSettings) | **GET** /server_settings | Get server settings
[**removeCodePlayground()**](ServerAndOrganizationsApi.md#removeCodePlayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
[**removeLinkifier()**](ServerAndOrganizationsApi.md#removeLinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
[**reorderCustomProfileFields()**](ServerAndOrganizationsApi.md#reorderCustomProfileFields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
[**updateLinkifier()**](ServerAndOrganizationsApi.md#updateLinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
[**uploadCustomEmoji()**](ServerAndOrganizationsApi.md#uploadCustomEmoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji


## `addCodePlayground()`

```php
addCodePlayground($name, $pygments_language, $url_prefix): JsonSuccessBase
```

Add a code playground

Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ServerAndOrganizationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$name = Python playground; // string | The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.
$pygments_language = Python; // string | The name of the Pygments language lexer for that programming language.
$url_prefix = https://python.example.com; // string | The url prefix for the playground.

try {
    $result = $apiInstance->addCodePlayground($name, $pygments_language, $url_prefix);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServerAndOrganizationsApi->addCodePlayground: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. |
 **pygments_language** | **string**| The name of the Pygments language lexer for that programming language. |
 **url_prefix** | **string**| The url prefix for the playground. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `addLinkifier()`

```php
addLinkifier($pattern, $url_format_string): JsonSuccessBase
```

Add a linkifier

Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ServerAndOrganizationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$pattern = #(?P<id>[0-9]+); // string | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.
$url_format_string = https://github.com/zulip/zulip/issues/%(id)s; // string | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.

try {
    $result = $apiInstance->addLinkifier($pattern, $url_format_string);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServerAndOrganizationsApi->addLinkifier: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pattern** | **string**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. |
 **url_format_string** | **string**| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createCustomProfileField()`

```php
createCustomProfileField($field_type, $name, $hint, $field_data): JsonSuccessBase
```

Create a custom profile field

[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ServerAndOrganizationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$field_type = 3; // int | The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account
$name = Favorite programming language; // string | The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile.
$hint = Your favorite programming language.; // string | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.
$field_data = new \stdClass; // object | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.

try {
    $result = $apiInstance->createCustomProfileField($field_type, $name, $hint, $field_data);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServerAndOrganizationsApi->createCustomProfileField: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field_type** | **int**| The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account |
 **name** | **string**| The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile. | [optional]
 **hint** | **string**| The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. | [optional]
 **field_data** | [**object**](../Model/.md)| Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. | [optional]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getCustomEmoji()`

```php
getCustomEmoji(): JsonSuccessBase
```

Get all custom emoji

Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ServerAndOrganizationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getCustomEmoji();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServerAndOrganizationsApi->getCustomEmoji: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getCustomProfileFields()`

```php
getCustomProfileFields(): JsonSuccessBase
```

Get all custom profile fields

Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ServerAndOrganizationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getCustomProfileFields();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServerAndOrganizationsApi->getCustomProfileFields: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getLinkifiers()`

```php
getLinkifiers(): JsonSuccessBase
```

Get linkifiers

List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ServerAndOrganizationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getLinkifiers();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServerAndOrganizationsApi->getLinkifiers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getServerSettings()`

```php
getServerSettings(): JsonSuccessBase
```

Get server settings

Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ServerAndOrganizationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getServerSettings();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServerAndOrganizationsApi->getServerSettings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `removeCodePlayground()`

```php
removeCodePlayground($playground_id): JsonSuccess
```

Remove a code playground

Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ServerAndOrganizationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$playground_id = 1; // int | The ID of the playground that you want to remove.

try {
    $result = $apiInstance->removeCodePlayground($playground_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServerAndOrganizationsApi->removeCodePlayground: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playground_id** | **int**| The ID of the playground that you want to remove. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `removeLinkifier()`

```php
removeLinkifier($filter_id): JsonSuccess
```

Remove a linkifier

Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ServerAndOrganizationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$filter_id = 42; // int | The ID of the linkifier that you want to remove.

try {
    $result = $apiInstance->removeLinkifier($filter_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServerAndOrganizationsApi->removeLinkifier: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter_id** | **int**| The ID of the linkifier that you want to remove. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `reorderCustomProfileFields()`

```php
reorderCustomProfileFields($order): JsonSuccess
```

Reorder custom profile fields

Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ServerAndOrganizationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$order = array(56); // int[] | A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.

try {
    $result = $apiInstance->reorderCustomProfileFields($order);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServerAndOrganizationsApi->reorderCustomProfileFields: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**int[]**](../Model/int.md)| A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateLinkifier()`

```php
updateLinkifier($filter_id, $pattern, $url_format_string): JsonSuccess
```

Update a linkifier

Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ServerAndOrganizationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$filter_id = 2; // int | The ID of the linkifier that you want to update.
$pattern = #(?P<id>[0-9]+); // string | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.
$url_format_string = https://github.com/zulip/zulip/issues/%(id)s; // string | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.

try {
    $result = $apiInstance->updateLinkifier($filter_id, $pattern, $url_format_string);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServerAndOrganizationsApi->updateLinkifier: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter_id** | **int**| The ID of the linkifier that you want to update. |
 **pattern** | **string**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. |
 **url_format_string** | **string**| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `uploadCustomEmoji()`

```php
uploadCustomEmoji($emoji_name, $filename): JsonSuccess
```

Upload custom emoji

This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\ServerAndOrganizationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$emoji_name = smile; // string | The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).
$filename = "/path/to/file.txt"; // \SplFileObject

try {
    $result = $apiInstance->uploadCustomEmoji($emoji_name, $filename);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServerAndOrganizationsApi->uploadCustomEmoji: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emoji_name** | **string**| The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). |
 **filename** | **\SplFileObject****\SplFileObject**|  | [optional]

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
