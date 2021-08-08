# InvalidMessageErrorAllOf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | [optional] 
**Msg** | [**AnyType**](.md) |  | [optional] 
**RawContent** | **String** | The raw content of the message.  | [optional] 

## Examples

- Prepare the resource
```powershell
$InvalidMessageErrorAllOf = Initialize-PSOpenAPIToolsInvalidMessageErrorAllOf  -Result null `
 -Msg null `
 -RawContent null
```

- Convert the resource to JSON
```powershell
$InvalidMessageErrorAllOf | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

