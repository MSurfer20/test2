# WWW::OpenAPIClient::AuthenticationApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AuthenticationApi;
```

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dev_fetch_api_key**](AuthenticationApi.md#dev_fetch_api_key) | **POST** /dev_fetch_api_key | Fetch an API key (development only)
[**fetch_api_key**](AuthenticationApi.md#fetch_api_key) | **POST** /fetch_api_key | Fetch an API key (production)


# **dev_fetch_api_key**
> ApiKeyResponse dev_fetch_api_key(username => $username)

Fetch an API key (development only)

For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  `POST {{ api_url }}/v1/dev_fetch_api_key` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AuthenticationApi;
my $api_instance = WWW::OpenAPIClient::AuthenticationApi->new(
);

my $username = iago@zulip.com; # string | The email address for the user that owns the API key. 

eval { 
    my $result = $api_instance->dev_fetch_api_key(username => $username);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AuthenticationApi->dev_fetch_api_key: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| The email address for the user that owns the API key.  | 

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_api_key**
> ApiKeyResponse fetch_api_key(username => $username, password => $password)

Fetch an API key (production)

This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user's Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the `mobile_flow_otp` in a webview, and the credentials are returned to the app (encrypted) via a redirect to a `zulip://` URL.  !!! warn \"\"     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AuthenticationApi;
my $api_instance = WWW::OpenAPIClient::AuthenticationApi->new(
);

my $username = iago@zulip.com; # string | The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the `require_email_format_usernames` parameter documented in [GET /server_settings](/api/get-server-settings) for details. 
my $password = abcd1234; # string | The user's Zulip password (or LDAP password, if LDAP authentication is in use). 

eval { 
    my $result = $api_instance->fetch_api_key(username => $username, password => $password);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AuthenticationApi->fetch_api_key: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the &#x60;require_email_format_usernames&#x60; parameter documented in [GET /server_settings](/api/get-server-settings) for details.  | 
 **password** | **string**| The user&#39;s Zulip password (or LDAP password, if LDAP authentication is in use).  | 

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

