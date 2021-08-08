# CodedErrorBase
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | 
**Msg** | [**AnyType**](.md) |  | 
**Code** | **String** | A string that identifies the error.  | [optional] 

## Examples

- Prepare the resource
```powershell
$CodedErrorBase = Initialize-PSOpenAPIToolsCodedErrorBase  -Result null `
 -Msg null `
 -Code null
```

- Convert the resource to JSON
```powershell
$CodedErrorBase | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

