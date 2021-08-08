
# Table `EmojiReactionBase_allOf` 
(mapped from: EmojiReactionBaseAllOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**userId** | user_id | int |  | **kotlin.Int** | The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future.  |  [optional]
**user** | user | long |  | [**EmojiReactionBaseAllOfUser**](EmojiReactionBaseAllOfUser.md) |  |  [optional] [foreignkey]




