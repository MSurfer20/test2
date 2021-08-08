# WebhooksAPI

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**WebhooksAPI_zulipOutgoingWebhooks**](WebhooksAPI.md#WebhooksAPI_zulipOutgoingWebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


# **WebhooksAPI_zulipOutgoingWebhooks**
```c
// Outgoing webhooks
//
// Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
//
inline_response_200_t* WebhooksAPI_zulipOutgoingWebhooks(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 

### Return type

[inline_response_200_t](inline_response_200.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

