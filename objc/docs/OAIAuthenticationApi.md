# OAIAuthenticationApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**devFetchApiKey**](OAIAuthenticationApi.md#devfetchapikey) | **POST** /dev_fetch_api_key | Fetch an API key (development only)
[**fetchApiKey**](OAIAuthenticationApi.md#fetchapikey) | **POST** /fetch_api_key | Fetch an API key (production)


# **devFetchApiKey**
```objc
-(NSURLSessionTask*) devFetchApiKeyWithUsername: (NSString*) username
        completionHandler: (void (^)(OAIApiKeyResponse* output, NSError* error)) handler;
```

Fetch an API key (development only)

For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  `POST {{ api_url }}/v1/dev_fetch_api_key` 

### Example 
```objc

NSString* username = iago@zulip.com; // The email address for the user that owns the API key. 

OAIAuthenticationApi*apiInstance = [[OAIAuthenticationApi alloc] init];

// Fetch an API key (development only)
[apiInstance devFetchApiKeyWithUsername:username
          completionHandler: ^(OAIApiKeyResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAuthenticationApi->devFetchApiKey: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **NSString***| The email address for the user that owns the API key.  | 

### Return type

[**OAIApiKeyResponse***](OAIApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetchApiKey**
```objc
-(NSURLSessionTask*) fetchApiKeyWithUsername: (NSString*) username
    password: (NSString*) password
        completionHandler: (void (^)(OAIApiKeyResponse* output, NSError* error)) handler;
```

Fetch an API key (production)

This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user's Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the `mobile_flow_otp` in a webview, and the credentials are returned to the app (encrypted) via a redirect to a `zulip://` URL.  !!! warn \"\"     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). 

### Example 
```objc

NSString* username = iago@zulip.com; // The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the `require_email_format_usernames` parameter documented in [GET /server_settings](/api/get-server-settings) for details. 
NSString* password = abcd1234; // The user's Zulip password (or LDAP password, if LDAP authentication is in use). 

OAIAuthenticationApi*apiInstance = [[OAIAuthenticationApi alloc] init];

// Fetch an API key (production)
[apiInstance fetchApiKeyWithUsername:username
              password:password
          completionHandler: ^(OAIApiKeyResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAuthenticationApi->fetchApiKey: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **NSString***| The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the &#x60;require_email_format_usernames&#x60; parameter documented in [GET /server_settings](/api/get-server-settings) for details.  | 
 **password** | **NSString***| The user&#39;s Zulip password (or LDAP password, if LDAP authentication is in use).  | 

### Return type

[**OAIApiKeyResponse***](OAIApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

