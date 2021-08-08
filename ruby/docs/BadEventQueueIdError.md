# OpenapiClient::BadEventQueueIdError

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **result** | [**AnyType**](.md) |  |  |
| **msg** | [**AnyType**](.md) |  |  |
| **code** | [**AnyType**](.md) |  | [optional] |
| **queue_id** | **String** | The string that identifies the invalid event queue.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::BadEventQueueIdError.new(
  result: null,
  msg: null,
  code: null,
  queue_id: null
)
```

