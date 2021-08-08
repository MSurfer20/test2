# OpenapiClient::NonExistingStreamError

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **result** | [**AnyType**](.md) |  |  |
| **msg** | [**AnyType**](.md) |  |  |
| **code** | [**AnyType**](.md) |  | [optional] |
| **stream** | **String** | The name of the stream that could not be found.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::NonExistingStreamError.new(
  result: null,
  msg: null,
  code: null,
  stream: null
)
```

