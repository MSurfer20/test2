# OpenAPI\Server\Api\WebhooksApiInterface

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zulipOutgoingWebhooks**](WebhooksApiInterface.md#zulipOutgoingWebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.webhooks:
        class: Acme\MyBundle\Api\WebhooksApi
        tags:
            - { name: "open_api_server.api", api: "webhooks" }
    # ...
```

## **zulipOutgoingWebhooks**
> OpenAPI\Server\Model\InlineResponse200 zulipOutgoingWebhooks()

Outgoing webhooks

Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/WebhooksApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\WebhooksApiInterface;

class WebhooksApi implements WebhooksApiInterface
{

    // ...

    /**
     * Implementation of WebhooksApiInterface#zulipOutgoingWebhooks
     */
    public function zulipOutgoingWebhooks()
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

