# EMOJI_REACTION_BASE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emoji_code** | [**STRING_32**](STRING_32.md) | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint.  | [optional] [default to null]
**emoji_name** | [**STRING_32**](STRING_32.md) | Name of the emoji.  | [optional] [default to null]
**reaction_type** | [**STRING_32**](STRING_32.md) | One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji.  | [optional] [default to null]
**user_id** | **INTEGER_32** | The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future.  | [optional] [default to null]
**user** | [**EMOJI_REACTION_BASE_USER**](EmojiReactionBase_user.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


