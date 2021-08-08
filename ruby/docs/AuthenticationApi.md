# OpenapiClient::AuthenticationApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**dev_fetch_api_key**](AuthenticationApi.md#dev_fetch_api_key) | **POST** /dev_fetch_api_key | Fetch an API key (development only) |
| [**fetch_api_key**](AuthenticationApi.md#fetch_api_key) | **POST** /fetch_api_key | Fetch an API key (production) |


## dev_fetch_api_key

> <ApiKeyResponse> dev_fetch_api_key(username)

Fetch an API key (development only)

For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  `POST {{ api_url }}/v1/dev_fetch_api_key` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::AuthenticationApi.new
username = 'iago@zulip.com' # String | The email address for the user that owns the API key. 

begin
  # Fetch an API key (development only)
  result = api_instance.dev_fetch_api_key(username)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling AuthenticationApi->dev_fetch_api_key: #{e}"
end
```

#### Using the dev_fetch_api_key_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ApiKeyResponse>, Integer, Hash)> dev_fetch_api_key_with_http_info(username)

```ruby
begin
  # Fetch an API key (development only)
  data, status_code, headers = api_instance.dev_fetch_api_key_with_http_info(username)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ApiKeyResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling AuthenticationApi->dev_fetch_api_key_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **username** | **String** | The email address for the user that owns the API key.  |  |

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## fetch_api_key

> <ApiKeyResponse> fetch_api_key(username, password)

Fetch an API key (production)

This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user's Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the `mobile_flow_otp` in a webview, and the credentials are returned to the app (encrypted) via a redirect to a `zulip://` URL.  !!! warn \"\"     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::AuthenticationApi.new
username = 'iago@zulip.com' # String | The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the `require_email_format_usernames` parameter documented in [GET /server_settings](/api/get-server-settings) for details. 
password = 'abcd1234' # String | The user's Zulip password (or LDAP password, if LDAP authentication is in use). 

begin
  # Fetch an API key (production)
  result = api_instance.fetch_api_key(username, password)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling AuthenticationApi->fetch_api_key: #{e}"
end
```

#### Using the fetch_api_key_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ApiKeyResponse>, Integer, Hash)> fetch_api_key_with_http_info(username, password)

```ruby
begin
  # Fetch an API key (production)
  data, status_code, headers = api_instance.fetch_api_key_with_http_info(username, password)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ApiKeyResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling AuthenticationApi->fetch_api_key_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **username** | **String** | The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the &#x60;require_email_format_usernames&#x60; parameter documented in [GET /server_settings](/api/get-server-settings) for details.  |  |
| **password** | **String** | The user&#39;s Zulip password (or LDAP password, if LDAP authentication is in use).  |  |

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

