
# RealmEmoji

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The ID for this emoji, same as the object&#39;s key.  |  [optional]
**name** | **kotlin.String** | The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (&#x60;:name  :&#x60;).  |  [optional]
**sourceUrl** | **kotlin.String** | The path relative to the organization&#39;s URL where the emoji&#39;s image can be found.  |  [optional]
**deactivated** | **kotlin.Boolean** | Whether the emoji has been deactivated or not.  |  [optional]
**authorId** | **kotlin.Int** | The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and &#x60;author&#x60; object with an &#x60;id&#x60; field.  |  [optional]



