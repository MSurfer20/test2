# MessagesBaseTopicLinks
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Text** | **String** | The original link text present in the topic.  | [optional] 
**Url** | **String** | The expanded target url which the link points to.  | [optional] 

## Examples

- Prepare the resource
```powershell
$MessagesBaseTopicLinks = Initialize-PSOpenAPIToolsMessagesBaseTopicLinks  -Text null `
 -Url null
```

- Convert the resource to JSON
```powershell
$MessagesBaseTopicLinks | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

