# BasicBotBase
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user\_id** | [**Integer**](integer.md) | The user id of the bot.  | [optional] [default to null]
**full\_name** | [**String**](string.md) | The full name of the bot.  | [optional] [default to null]
**api\_key** | [**String**](string.md) | The API key of the bot which it uses to make API requests.  | [optional] [default to null]
**default\_sending\_stream** | [**String**](string.md) | The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream.  | [optional] [default to null]
**default\_events\_register\_stream** | [**String**](string.md) | The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream.  | [optional] [default to null]
**default\_all\_public\_streams** | [**Boolean**](boolean.md) | Whether the bot can send messages to all streams by default.  | [optional] [default to null]
**avatar\_url** | [**String**](string.md) | The URL of the bot&#39;s avatar.  | [optional] [default to null]
**owner\_id** | [**Integer**](integer.md) | The user id of the bot&#39;s owner.  Null if the bot has no owner.  | [optional] [default to null]
**services** | [**List**](oneOf&lt;object,object&gt;.md) | The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

