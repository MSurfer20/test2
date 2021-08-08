# InvalidMessageError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | 
**Msg** | [**AnyType**](.md) |  | 
**RawContent** | **String** | The raw content of the message.  | [optional] 

## Examples

- Prepare the resource
```powershell
$InvalidMessageError = Initialize-PSOpenAPIToolsInvalidMessageError  -Result null `
 -Msg null `
 -RawContent null
```

- Convert the resource to JSON
```powershell
$InvalidMessageError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

