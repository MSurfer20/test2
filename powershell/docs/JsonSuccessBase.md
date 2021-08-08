# JsonSuccessBase
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | **String** |  | 
**Msg** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$JsonSuccessBase = Initialize-PSOpenAPIToolsJsonSuccessBase  -Result null `
 -Msg null
```

- Convert the resource to JSON
```powershell
$JsonSuccessBase | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

