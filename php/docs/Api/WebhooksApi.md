# OpenAPI\Client\WebhooksApi

All URIs are relative to https://example.zulipchat.com/api/v1.

Method | HTTP request | Description
------------- | ------------- | -------------
[**zulipOutgoingWebhooks()**](WebhooksApi.md#zulipOutgoingWebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


## `zulipOutgoingWebhooks()`

```php
zulipOutgoingWebhooks(): \OpenAPI\Client\Model\InlineResponse200
```

Outgoing webhooks

Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\WebhooksApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->zulipOutgoingWebhooks();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WebhooksApi->zulipOutgoingWebhooks: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
