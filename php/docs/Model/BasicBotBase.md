# # BasicBotBase

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_id** | **int** | The user id of the bot. | [optional]
**full_name** | **string** | The full name of the bot. | [optional]
**api_key** | **string** | The API key of the bot which it uses to make API requests. | [optional]
**default_sending_stream** | **string** | The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream. | [optional]
**default_events_register_stream** | **string** | The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream. | [optional]
**default_all_public_streams** | **bool** | Whether the bot can send messages to all streams by default. | [optional]
**avatar_url** | **string** | The URL of the bot&#39;s avatar. | [optional]
**owner_id** | **int** | The user id of the bot&#39;s owner.  Null if the bot has no owner. | [optional]
**services** | [**OneOfObjectObject[]**](OneOfObjectObject.md) | The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
