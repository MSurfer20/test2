# OpenapiClient::ApiKeyResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **result** | [**AnyType**](.md) |  |  |
| **msg** | [**AnyType**](.md) |  |  |
| **api_key** | **String** | The API key that can be used to authenticate as the requested user.  |  |
| **email** | **String** | The email address of the user who owns the API key  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ApiKeyResponse.new(
  result: null,
  msg: null,
  api_key: null,
  email: null
)
```

