# OAIWebhooksApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zulipOutgoingWebhooks**](OAIWebhooksApi.md#zulipoutgoingwebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


# **zulipOutgoingWebhooks**
```objc
-(NSURLSessionTask*) zulipOutgoingWebhooksWithCompletionHandler: 
        (void (^)(OAIInlineResponse200* output, NSError* error)) handler;
```

Outgoing webhooks

Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 

### Example 
```objc


OAIWebhooksApi*apiInstance = [[OAIWebhooksApi alloc] init];

// Outgoing webhooks
[apiInstance zulipOutgoingWebhooksWithCompletionHandler: 
          ^(OAIInlineResponse200* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIWebhooksApi->zulipOutgoingWebhooks: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIInlineResponse200***](OAIInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

