# WWW::OpenAPIClient::Object::EmojiReactionBase

## Load the model package
```perl
use WWW::OpenAPIClient::Object::EmojiReactionBase;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emoji_code** | **string** | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint.  | [optional] 
**emoji_name** | **string** | Name of the emoji.  | [optional] 
**reaction_type** | **string** | One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji.  | [optional] 
**user_id** | **int** | The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future.  | [optional] 
**user** | [**EmojiReactionBaseUser**](EmojiReactionBaseUser.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

