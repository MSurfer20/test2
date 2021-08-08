# BasicBotBase


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_id** | **int** | The user id of the bot.  | [optional] 
**full_name** | **str** | The full name of the bot.  | [optional] 
**api_key** | **str** | The API key of the bot which it uses to make API requests.  | [optional] 
**default_sending_stream** | **str, none_type** | The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream.  | [optional] 
**default_events_register_stream** | **str, none_type** | The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream.  | [optional] 
**default_all_public_streams** | **bool** | Whether the bot can send messages to all streams by default.  | [optional] 
**avatar_url** | **str** | The URL of the bot&#39;s avatar.  | [optional] 
**owner_id** | **int, none_type** | The user id of the bot&#39;s owner.  Null if the bot has no owner.  | [optional] 
**services** | **[dict]** | The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


