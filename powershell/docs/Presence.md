# Presence
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Client** | **String** | The client&#39;s platform name.  | [optional] 
**Status** | **String** | The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;.  | [optional] 
**Timestamp** | **Int32** | The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second.  | [optional] 
**Pushable** | **Boolean** | Whether the client is capable of showing mobile/push notifications to the user.  | [optional] 

## Examples

- Prepare the resource
```powershell
$Presence = Initialize-PSOpenAPIToolsPresence  -Client null `
 -Status null `
 -Timestamp null `
 -Pushable null
```

- Convert the resource to JSON
```powershell
$Presence | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

