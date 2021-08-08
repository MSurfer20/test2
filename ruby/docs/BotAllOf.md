# OpenapiClient::BotAllOf

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_id** | [**AnyType**](.md) |  | [optional] |
| **full_name** | [**AnyType**](.md) |  | [optional] |
| **api_key** | [**AnyType**](.md) |  | [optional] |
| **default_sending_stream** | [**AnyType**](.md) |  | [optional] |
| **default_events_register_stream** | [**AnyType**](.md) |  | [optional] |
| **default_all_public_streams** | [**AnyType**](.md) |  | [optional] |
| **avatar_url** | [**AnyType**](.md) |  | [optional] |
| **owner_id** | [**AnyType**](.md) |  | [optional] |
| **services** | [**AnyType**](.md) |  | [optional] |
| **email** | **String** | The email of the bot.  | [optional] |
| **bot_type** | **Integer** | An integer describing the type of bot: * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot.  | [optional] |
| **is_active** | **Boolean** | A boolean describing whether the user account has been deactivated.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::BotAllOf.new(
  user_id: null,
  full_name: null,
  api_key: null,
  default_sending_stream: null,
  default_events_register_stream: null,
  default_all_public_streams: null,
  avatar_url: null,
  owner_id: null,
  services: null,
  email: null,
  bot_type: null,
  is_active: null
)
```

