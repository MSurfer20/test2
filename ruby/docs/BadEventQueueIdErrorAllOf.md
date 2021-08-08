# OpenapiClient::BadEventQueueIdErrorAllOf

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **result** | [**AnyType**](.md) |  | [optional] |
| **msg** | [**AnyType**](.md) |  | [optional] |
| **code** | [**AnyType**](.md) |  | [optional] |
| **queue_id** | **String** | The string that identifies the invalid event queue.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::BadEventQueueIdErrorAllOf.new(
  result: null,
  msg: null,
  code: null,
  queue_id: null
)
```

