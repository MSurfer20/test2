# OpenapiClient::BasicBotBase

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_id** | **Integer** | The user id of the bot.  | [optional] |
| **full_name** | **String** | The full name of the bot.  | [optional] |
| **api_key** | **String** | The API key of the bot which it uses to make API requests.  | [optional] |
| **default_sending_stream** | **String** | The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream.  | [optional] |
| **default_events_register_stream** | **String** | The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream.  | [optional] |
| **default_all_public_streams** | **Boolean** | Whether the bot can send messages to all streams by default.  | [optional] |
| **avatar_url** | **String** | The URL of the bot&#39;s avatar.  | [optional] |
| **owner_id** | **Integer** | The user id of the bot&#39;s owner.  Null if the bot has no owner.  | [optional] |
| **services** | [**Array&lt;OneOfobjectobject&gt;**](OneOfobjectobject.md) | The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::BasicBotBase.new(
  user_id: null,
  full_name: null,
  api_key: null,
  default_sending_stream: null,
  default_events_register_stream: null,
  default_all_public_streams: null,
  avatar_url: null,
  owner_id: null,
  services: null
)
```

