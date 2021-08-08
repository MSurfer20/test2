# REALM_EMOJI

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | The ID for this emoji, same as the object&#39;s key.  | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;).  | [optional] [default to null]
**source_url** | [**STRING_32**](STRING_32.md) | The path relative to the organization&#39;s URL where the emoji&#39;s image can be found.  | [optional] [default to null]
**deactivated** | **BOOLEAN** | Whether the emoji has been deactivated or not.  | [optional] [default to null]
**author_id** | **INTEGER_32** | The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


