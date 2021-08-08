# JsonError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | 
**Msg** | [**AnyType**](.md) |  | 

## Examples

- Prepare the resource
```powershell
$JsonError = Initialize-PSOpenAPIToolsJsonError  -Result null `
 -Msg null
```

- Convert the resource to JSON
```powershell
$JsonError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

