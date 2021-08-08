# EmojiReaction
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EmojiCode** | [**AnyType**](.md) |  | [optional] 
**EmojiName** | [**AnyType**](.md) |  | [optional] 
**ReactionType** | [**AnyType**](.md) |  | [optional] 
**UserId** | [**AnyType**](.md) |  | [optional] 
**User** | [**AnyType**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$EmojiReaction = Initialize-PSOpenAPIToolsEmojiReaction  -EmojiCode null `
 -EmojiName null `
 -ReactionType null `
 -UserId null `
 -User null
```

- Convert the resource to JSON
```powershell
$EmojiReaction | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

