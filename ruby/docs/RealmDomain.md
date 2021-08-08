# OpenapiClient::RealmDomain

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **domain** | **String** | The new allowed domain.  | [optional] |
| **allow_subdomains** | **Boolean** | Whether subdomains are allowed for this domain.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::RealmDomain.new(
  domain: null,
  allow_subdomains: null
)
```

