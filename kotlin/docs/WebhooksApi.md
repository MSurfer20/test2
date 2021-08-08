# WebhooksApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zulipOutgoingWebhooks**](WebhooksApi.md#zulipOutgoingWebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


<a name="zulipOutgoingWebhooks"></a>
# **zulipOutgoingWebhooks**
> InlineResponse200 zulipOutgoingWebhooks()

Outgoing webhooks

Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
try {
    val result : InlineResponse200 = apiInstance.zulipOutgoingWebhooks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#zulipOutgoingWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#zulipOutgoingWebhooks")
    e.printStackTrace()
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

