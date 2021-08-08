# EmojiReactionBaseUser
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | ID of the user.  | [optional] 
**Email** | **String** | Email of the user.  | [optional] 
**FullName** | **String** | Full name of the user.  | [optional] 
**IsMirrorDummy** | **Boolean** | Whether the user is a mirror dummy.  | [optional] 

## Examples

- Prepare the resource
```powershell
$EmojiReactionBaseUser = Initialize-PSOpenAPIToolsEmojiReactionBaseUser  -Id null `
 -Email null `
 -FullName null `
 -IsMirrorDummy null
```

- Convert the resource to JSON
```powershell
$EmojiReactionBaseUser | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

