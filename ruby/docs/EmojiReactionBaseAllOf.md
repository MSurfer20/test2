# OpenapiClient::EmojiReactionBaseAllOf

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_id** | **Integer** | The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future.  | [optional] |
| **user** | [**EmojiReactionBaseAllOfUser**](EmojiReactionBaseAllOfUser.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::EmojiReactionBaseAllOf.new(
  user_id: null,
  user: null
)
```

