# OpenapiClient::DefaultStreamGroup

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | Name of the default stream group.  | [optional] |
| **description** | **String** | Description of the default stream group.  | [optional] |
| **id** | **Integer** | id of the default stream group.  | [optional] |
| **streams** | [**Array&lt;BasicStream&gt;**](BasicStream.md) | Array containing details about the streams in the default stream group.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::DefaultStreamGroup.new(
  name: null,
  description: null,
  id: null,
  streams: null
)
```

