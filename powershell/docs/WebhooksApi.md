# PSOpenAPITools.PSOpenAPITools/Api.WebhooksApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-ZulipOutgoingWebhooks**](WebhooksApi.md#Invoke-ZulipOutgoingWebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


<a name="Invoke-ZulipOutgoingWebhooks"></a>
# **Invoke-ZulipOutgoingWebhooks**
> InlineResponse200 Invoke-ZulipOutgoingWebhooks<br>

Outgoing webhooks

Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 

### Example
```powershell

# Outgoing webhooks
try {
    $Result = Invoke-ZulipOutgoingWebhooks
} catch {
    Write-Host ("Exception occured when calling Invoke-ZulipOutgoingWebhooks: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

