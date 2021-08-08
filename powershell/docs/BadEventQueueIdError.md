# BadEventQueueIdError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | 
**Msg** | [**AnyType**](.md) |  | 
**Code** | [**AnyType**](.md) |  | [optional] 
**QueueId** | **String** | The string that identifies the invalid event queue.  | [optional] 

## Examples

- Prepare the resource
```powershell
$BadEventQueueIdError = Initialize-PSOpenAPIToolsBadEventQueueIdError  -Result null `
 -Msg null `
 -Code null `
 -QueueId null
```

- Convert the resource to JSON
```powershell
$BadEventQueueIdError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

