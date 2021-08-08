# AddSubscriptionsResponseAllOf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | [optional] 
**Msg** | [**AnyType**](.md) |  | [optional] 
**Subscribed** | [**System.Collections.Hashtable**](Array.md) | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  | [optional] 
**AlreadySubscribed** | [**System.Collections.Hashtable**](Array.md) | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  | [optional] 
**Unauthorized** | **String[]** | A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$AddSubscriptionsResponseAllOf = Initialize-PSOpenAPIToolsAddSubscriptionsResponseAllOf  -Result null `
 -Msg null `
 -Subscribed null `
 -AlreadySubscribed null `
 -Unauthorized null
```

- Convert the resource to JSON
```powershell
$AddSubscriptionsResponseAllOf | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

