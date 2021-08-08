# BasicBotBase
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserId** | **Int32** | The user id of the bot.  | [optional] 
**FullName** | **String** | The full name of the bot.  | [optional] 
**ApiKey** | **String** | The API key of the bot which it uses to make API requests.  | [optional] 
**DefaultSendingStream** | **String** | The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream.  | [optional] 
**DefaultEventsRegisterStream** | **String** | The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream.  | [optional] 
**DefaultAllPublicStreams** | **Boolean** | Whether the bot can send messages to all streams by default.  | [optional] 
**AvatarUrl** | **String** | The URL of the bot&#39;s avatar.  | [optional] 
**OwnerId** | **Int32** | The user id of the bot&#39;s owner.  Null if the bot has no owner.  | [optional] 
**Services** | [**OneOfobjectobject[]**](OneOfobjectobject.md) | The &quot;&quot;Services&quot;&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  | [optional] 

## Examples

- Prepare the resource
```powershell
$BasicBotBase = Initialize-PSOpenAPIToolsBasicBotBase  -UserId null `
 -FullName null `
 -ApiKey null `
 -DefaultSendingStream null `
 -DefaultEventsRegisterStream null `
 -DefaultAllPublicStreams null `
 -AvatarUrl null `
 -OwnerId null `
 -Services null
```

- Convert the resource to JSON
```powershell
$BasicBotBase | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

