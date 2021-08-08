# WebhooksApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zulipOutgoingWebhooks**](WebhooksApi.md#zulipOutgoingWebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks



## zulipOutgoingWebhooks

> InlineResponse200 zulipOutgoingWebhooks()

Outgoing webhooks

Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 

### Example

```java
// Import classes:
//import org.openapitools.client.api.WebhooksApi;

WebhooksApi apiInstance = new WebhooksApi();
try {
    InlineResponse200 result = apiInstance.zulipOutgoingWebhooks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#zulipOutgoingWebhooks");
    e.printStackTrace();
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

