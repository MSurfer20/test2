# CodedErrorAllOf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | [optional] 
**Msg** | [**AnyType**](.md) |  | [optional] 
**Code** | [**AnyType**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CodedErrorAllOf = Initialize-PSOpenAPIToolsCodedErrorAllOf  -Result null `
 -Msg null `
 -Code null
```

- Convert the resource to JSON
```powershell
$CodedErrorAllOf | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

