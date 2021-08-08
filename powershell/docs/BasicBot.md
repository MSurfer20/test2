# BasicBot
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

## Examples

- Prepare the resource
```powershell
$BasicBot = Initialize-PSOpenAPIToolsBasicBot  -UserId null `
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
$BasicBot | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

