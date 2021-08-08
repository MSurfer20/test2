# BasicBotBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_id** | **isize** | The user id of the bot.  | [optional] [default to None]
**full_name** | **String** | The full name of the bot.  | [optional] [default to None]
**api_key** | **String** | The API key of the bot which it uses to make API requests.  | [optional] [default to None]
**default_sending_stream** | **String** | The default sending stream of the bot. Null if the bot doesn't have a default sending stream.  | [optional] [default to None]
**default_events_register_stream** | **String** | The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream.  | [optional] [default to None]
**default_all_public_streams** | **bool** | Whether the bot can send messages to all streams by default.  | [optional] [default to None]
**avatar_url** | **String** | The URL of the bot's avatar.  | [optional] [default to None]
**owner_id** | **isize** | The user id of the bot's owner.  Null if the bot has no owner.  | [optional] [default to None]
**services** | [**Vec<swagger::OneOf2<serde_json::Value,serde_json::Value>>**](swagger::OneOf2<serde_json::Value,serde_json::Value>.md) | The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


