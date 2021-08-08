# realm_emoji_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | The ID for this emoji, same as the object&#39;s key.  | [optional] 
**name** | **char \*** | The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;).  | [optional] 
**source_url** | **char \*** | The path relative to the organization&#39;s URL where the emoji&#39;s image can be found.  | [optional] 
**deactivated** | **int** | Whether the emoji has been deactivated or not.  | [optional] 
**author_id** | **int** | The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


