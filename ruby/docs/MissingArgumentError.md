# OpenapiClient::MissingArgumentError

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **result** | [**AnyType**](.md) |  |  |
| **msg** | [**AnyType**](.md) |  |  |
| **code** | [**AnyType**](.md) |  | [optional] |
| **var_name** | **String** | It contains the information about the missing parameter.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::MissingArgumentError.new(
  result: null,
  msg: null,
  code: null,
  var_name: null
)
```

