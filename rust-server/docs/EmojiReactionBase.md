# EmojiReactionBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emoji_code** | **String** | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint.  | [optional] [default to None]
**emoji_name** | **String** | Name of the emoji.  | [optional] [default to None]
**reaction_type** | **String** | One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.  | [optional] [default to None]
**user_id** | **isize** | The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.  | [optional] [default to None]
**user** | [***models::EmojiReactionBaseUser**](EmojiReactionBase_user.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

