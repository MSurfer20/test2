# openapi.api.WebhooksApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zulipOutgoingWebhooks**](WebhooksApi.md#zulipOutgoingWebhooks) | **Post** /zulip-outgoing-webhook | Outgoing webhooks


# **zulipOutgoingWebhooks**
> InlineResponse200 zulipOutgoingWebhooks()

Outgoing webhooks

Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new WebhooksApi();

try { 
    var result = api_instance.zulipOutgoingWebhooks();
    print(result);
} catch (e) {
    print("Exception when calling WebhooksApi->zulipOutgoingWebhooks: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

