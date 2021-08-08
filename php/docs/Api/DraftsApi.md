# OpenAPI\Client\DraftsApi

All URIs are relative to https://example.zulipchat.com/api/v1.

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrafts()**](DraftsApi.md#createDrafts) | **POST** /drafts | Create drafts
[**deleteDraft()**](DraftsApi.md#deleteDraft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**editDraft()**](DraftsApi.md#editDraft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**getDrafts()**](DraftsApi.md#getDrafts) | **GET** /drafts | Get drafts


## `createDrafts()`

```php
createDrafts($drafts): JsonSuccess
```

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DraftsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$drafts = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\Draft()); // \OpenAPI\Client\Model\Draft[] | A JSON-encoded list of containing new draft objects.

try {
    $result = $apiInstance->createDrafts($drafts);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DraftsApi->createDrafts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**\OpenAPI\Client\Model\Draft[]**](../Model/\OpenAPI\Client\Model\Draft.md)| A JSON-encoded list of containing new draft objects. | [optional]

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

## `deleteDraft()`

```php
deleteDraft($draft_id): JsonSuccess
```

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DraftsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$draft_id = 1; // int | The ID of the draft you want to delete.

try {
    $result = $apiInstance->deleteDraft($draft_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DraftsApi->deleteDraft: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draft_id** | **int**| The ID of the draft you want to delete. |

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

## `editDraft()`

```php
editDraft($draft_id, $draft): JsonSuccess
```

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DraftsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$draft_id = 2; // int | The ID of the draft to be edited.
$draft = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\Draft(); // \OpenAPI\Client\Model\Draft | A JSON-encoded object containing a replacement draft object for this ID.

try {
    $result = $apiInstance->editDraft($draft_id, $draft);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DraftsApi->editDraft: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draft_id** | **int**| The ID of the draft to be edited. |
 **draft** | [**\OpenAPI\Client\Model\Draft**](../Model/.md)| A JSON-encoded object containing a replacement draft object for this ID. |

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

## `getDrafts()`

```php
getDrafts(): JsonSuccess
```

Get drafts

Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DraftsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getDrafts();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DraftsApi->getDrafts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

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
