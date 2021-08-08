# DefaultStreamGroup
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Name of the default stream group.  | [optional] 
**Description** | **String** | Description of the default stream group.  | [optional] 
**Id** | **Int32** | id of the default stream group.  | [optional] 
**Streams** | [**BasicStream[]**](BasicStream.md) | Array containing details about the streams in the default stream group.  | [optional] 

## Examples

- Prepare the resource
```powershell
$DefaultStreamGroup = Initialize-PSOpenAPIToolsDefaultStreamGroup  -Name null `
 -Description null `
 -Id null `
 -Streams null
```

- Convert the resource to JSON
```powershell
$DefaultStreamGroup | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

