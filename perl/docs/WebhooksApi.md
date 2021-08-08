# WWW::OpenAPIClient::WebhooksApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::WebhooksApi;
```

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zulip_outgoing_webhooks**](WebhooksApi.md#zulip_outgoing_webhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


# **zulip_outgoing_webhooks**
> InlineResponse200 zulip_outgoing_webhooks()

Outgoing webhooks

Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::WebhooksApi;
my $api_instance = WWW::OpenAPIClient::WebhooksApi->new(
);


eval { 
    my $result = $api_instance->zulip_outgoing_webhooks();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling WebhooksApi->zulip_outgoing_webhooks: $@\n";
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

