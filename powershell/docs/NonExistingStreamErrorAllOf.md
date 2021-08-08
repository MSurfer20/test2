# NonExistingStreamErrorAllOf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | [optional] 
**Msg** | [**AnyType**](.md) |  | [optional] 
**Code** | [**AnyType**](.md) |  | [optional] 
**Stream** | **String** | The name of the stream that could not be found.  | [optional] 

## Examples

- Prepare the resource
```powershell
$NonExistingStreamErrorAllOf = Initialize-PSOpenAPIToolsNonExistingStreamErrorAllOf  -Result null `
 -Msg null `
 -Code null `
 -Stream null
```

- Convert the resource to JSON
```powershell
$NonExistingStreamErrorAllOf | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

