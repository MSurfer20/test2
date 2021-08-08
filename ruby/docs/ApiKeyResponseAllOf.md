# OpenapiClient::ApiKeyResponseAllOf

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **result** | [**AnyType**](.md) |  | [optional] |
| **msg** | [**AnyType**](.md) |  | [optional] |
| **api_key** | **String** | The API key that can be used to authenticate as the requested user.  |  |
| **email** | **String** | The email address of the user who owns the API key  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ApiKeyResponseAllOf.new(
  result: null,
  msg: null,
  api_key: null,
  email: null
)
```

