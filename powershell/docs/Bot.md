# Bot
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserId** | [**AnyType**](.md) |  | [optional] 
**FullName** | [**AnyType**](.md) |  | [optional] 
**ApiKey** | [**AnyType**](.md) |  | [optional] 
**DefaultSendingStream** | [**AnyType**](.md) |  | [optional] 
**DefaultEventsRegisterStream** | [**AnyType**](.md) |  | [optional] 
**DefaultAllPublicStreams** | [**AnyType**](.md) |  | [optional] 
**AvatarUrl** | [**AnyType**](.md) |  | [optional] 
**OwnerId** | [**AnyType**](.md) |  | [optional] 
**Services** | [**AnyType**](.md) |  | [optional] 
**Email** | **String** | The email of the bot.  | [optional] 
**BotType** | **Int32** | An integer describing the type of bot: * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot.  | [optional] 
**IsActive** | **Boolean** | A boolean describing whether the user account has been deactivated.  | [optional] 

## Examples

- Prepare the resource
```powershell
$Bot = Initialize-PSOpenAPIToolsBot  -UserId null `
 -FullName null `
 -ApiKey null `
 -DefaultSendingStream null `
 -DefaultEventsRegisterStream null `
 -DefaultAllPublicStreams null `
 -AvatarUrl null `
 -OwnerId null `
 -Services null `
 -Email null `
 -BotType null `
 -IsActive null
```

- Convert the resource to JSON
```powershell
$Bot | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

