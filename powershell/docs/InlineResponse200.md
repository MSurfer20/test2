# InlineResponse200
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BotEmail** | **String** | Email of the bot user.  | [optional] 
**BotFullName** | **String** | The full name of the bot user.  | [optional] 
**VarData** | **String** | The message content, in raw Markdown format (not rendered to HTML).  | [optional] 
**Trigger** | **String** | What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;.  | [optional] 
**Token** | **String** | A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot.  | [optional] 
**Message** | [**MessagesBase**](MessagesBase.md) | A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages).  | [optional] 

## Examples

- Prepare the resource
```powershell
$InlineResponse200 = Initialize-PSOpenAPIToolsInlineResponse200  -BotEmail null `
 -BotFullName null `
 -VarData null `
 -Trigger null `
 -Token null `
 -Message null
```

- Convert the resource to JSON
```powershell
$InlineResponse200 | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

