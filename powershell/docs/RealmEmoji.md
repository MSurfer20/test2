# RealmEmoji
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The ID for this emoji, same as the object&#39;s key.  | [optional] 
**Name** | **String** | The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;).  | [optional] 
**SourceUrl** | **String** | The path relative to the organization&#39;s URL where the emoji&#39;s image can be found.  | [optional] 
**Deactivated** | **Boolean** | Whether the emoji has been deactivated or not.  | [optional] 
**AuthorId** | **Int32** | The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field.  | [optional] 

## Examples

- Prepare the resource
```powershell
$RealmEmoji = Initialize-PSOpenAPIToolsRealmEmoji  -Id null `
 -Name null `
 -SourceUrl null `
 -Deactivated null `
 -AuthorId null
```

- Convert the resource to JSON
```powershell
$RealmEmoji | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

