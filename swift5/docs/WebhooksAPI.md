# WebhooksAPI

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zulipOutgoingWebhooks**](WebhooksAPI.md#zulipoutgoingwebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


# **zulipOutgoingWebhooks**
```swift
    open class func zulipOutgoingWebhooks(completion: @escaping (_ data: InlineResponse200?, _ error: Error?) -> Void)
```

Outgoing webhooks

Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Outgoing webhooks
WebhooksAPI.zulipOutgoingWebhooks() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
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

