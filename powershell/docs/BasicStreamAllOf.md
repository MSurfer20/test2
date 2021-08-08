# BasicStreamAllOf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StreamId** | [**AnyType**](.md) |  | [optional] 
**Name** | [**AnyType**](.md) |  | [optional] 
**Description** | [**AnyType**](.md) |  | [optional] 
**DateCreated** | [**AnyType**](.md) |  | [optional] 
**InviteOnly** | [**AnyType**](.md) |  | [optional] 
**RenderedDescription** | [**AnyType**](.md) |  | [optional] 
**IsWebPublic** | [**AnyType**](.md) |  | [optional] 
**StreamPostPolicy** | [**AnyType**](.md) |  | [optional] 
**MessageRetentionDays** | [**AnyType**](.md) |  | [optional] 
**HistoryPublicToSubscribers** | [**AnyType**](.md) |  | [optional] 
**FirstMessageId** | [**AnyType**](.md) |  | [optional] 
**IsAnnouncementOnly** | [**AnyType**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BasicStreamAllOf = Initialize-PSOpenAPIToolsBasicStreamAllOf  -StreamId null `
 -Name null `
 -Description null `
 -DateCreated null `
 -InviteOnly null `
 -RenderedDescription null `
 -IsWebPublic null `
 -StreamPostPolicy null `
 -MessageRetentionDays null `
 -HistoryPublicToSubscribers null `
 -FirstMessageId null `
 -IsAnnouncementOnly null
```

- Convert the resource to JSON
```powershell
$BasicStreamAllOf | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

