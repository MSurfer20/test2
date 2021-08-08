package models

type EmojiReactionBaseAllOf struct {

	// The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
	UserId int32 `json:"user_id,omitempty"`

	User EmojiReactionBaseAllOfUser `json:"user,omitempty"`
}
