# CodedErrorBaseAllOf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | [optional] 
**Msg** | [**AnyType**](.md) |  | [optional] 
**Code** | **String** | A string that identifies the error.  | [optional] 

## Examples

- Prepare the resource
```powershell
$CodedErrorBaseAllOf = Initialize-PSOpenAPIToolsCodedErrorBaseAllOf  -Result null `
 -Msg null `
 -Code null
```

- Convert the resource to JSON
```powershell
$CodedErrorBaseAllOf | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

