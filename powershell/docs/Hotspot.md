# Hotspot
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Delay** | **Decimal** | The delay after which the user should be shown the hotspot.  | [optional] 
**Name** | **String** | The name of the hotspot.  | [optional] 
**Title** | **String** | The title of the hotspot, as will be displayed to the user.  | [optional] 
**Description** | **String** | The description of the hotspot, as will be displayed to the user.  | [optional] 

## Examples

- Prepare the resource
```powershell
$Hotspot = Initialize-PSOpenAPIToolsHotspot  -Delay null `
 -Name null `
 -Title null `
 -Description null
```

- Convert the resource to JSON
```powershell
$Hotspot | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

