# RateLimitedError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | 
**Msg** | [**AnyType**](.md) |  | 
**Code** | [**AnyType**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$RateLimitedError = Initialize-PSOpenAPIToolsRateLimitedError  -Result null `
 -Msg null `
 -Code null
```

- Convert the resource to JSON
```powershell
$RateLimitedError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

