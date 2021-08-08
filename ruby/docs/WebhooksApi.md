# OpenapiClient::WebhooksApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**zulip_outgoing_webhooks**](WebhooksApi.md#zulip_outgoing_webhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks |


## zulip_outgoing_webhooks

> <InlineResponse200> zulip_outgoing_webhooks

Outgoing webhooks

Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::WebhooksApi.new

begin
  # Outgoing webhooks
  result = api_instance.zulip_outgoing_webhooks
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling WebhooksApi->zulip_outgoing_webhooks: #{e}"
end
```

#### Using the zulip_outgoing_webhooks_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<InlineResponse200>, Integer, Hash)> zulip_outgoing_webhooks_with_http_info

```ruby
begin
  # Outgoing webhooks
  data, status_code, headers = api_instance.zulip_outgoing_webhooks_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <InlineResponse200>
rescue OpenapiClient::ApiError => e
  puts "Error when calling WebhooksApi->zulip_outgoing_webhooks_with_http_info: #{e}"
end
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

