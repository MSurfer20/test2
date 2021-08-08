
# Org.OpenAPITools.Model.BasicBotBase

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserId** | **int** | The user id of the bot.  | [optional] 
**FullName** | **string** | The full name of the bot.  | [optional] 
**ApiKey** | **string** | The API key of the bot which it uses to make API requests.  | [optional] 
**DefaultSendingStream** | **string** | The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream.  | [optional] 
**DefaultEventsRegisterStream** | **string** | The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream.  | [optional] 
**DefaultAllPublicStreams** | **bool** | Whether the bot can send messages to all streams by default.  | [optional] 
**AvatarUrl** | **string** | The URL of the bot&#39;s avatar.  | [optional] 
**OwnerId** | **int?** | The user id of the bot&#39;s owner.  Null if the bot has no owner.  | [optional] 
**Services** | [**List&lt;OneOfobjectobject&gt;**](OneOfobjectobject.md) | The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to README]](../README.md)

