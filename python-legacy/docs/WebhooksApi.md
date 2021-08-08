# openapi_client.WebhooksApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zulip_outgoing_webhooks**](WebhooksApi.md#zulip_outgoing_webhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


# **zulip_outgoing_webhooks**
> InlineResponse200 zulip_outgoing_webhooks()

Outgoing webhooks

Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.WebhooksApi(api_client)
    
    try:
        # Outgoing webhooks
        api_response = api_instance.zulip_outgoing_webhooks()
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling WebhooksApi->zulip_outgoing_webhooks: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

