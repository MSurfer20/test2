# EmojiReactionBaseAllOf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserId** | **Int32** | The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future.  | [optional] 
**User** | [**EmojiReactionBaseAllOfUser**](EmojiReactionBaseAllOfUser.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$EmojiReactionBaseAllOf = Initialize-PSOpenAPIToolsEmojiReactionBaseAllOf  -UserId null `
 -User null
```

- Convert the resource to JSON
```powershell
$EmojiReactionBaseAllOf | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

