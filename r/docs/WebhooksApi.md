# WebhooksApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ZulipOutgoingWebhooks**](WebhooksApi.md#ZulipOutgoingWebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


# **ZulipOutgoingWebhooks**
> InlineResponse200 ZulipOutgoingWebhooks()

Outgoing webhooks

Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 

### Example
```R
library(openapi)


#Outgoing webhooks
api.instance <- WebhooksApi$new()
result <- api.instance$ZulipOutgoingWebhooks()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success  |  -  |

