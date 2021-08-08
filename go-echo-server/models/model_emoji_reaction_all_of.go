package models

type EmojiReactionAllOf struct {

	EmojiCode *interface{} `json:"emoji_code,omitempty"`

	EmojiName *interface{} `json:"emoji_name,omitempty"`

	ReactionType *interface{} `json:"reaction_type,omitempty"`

	UserId *interface{} `json:"user_id,omitempty"`

	User *interface{} `json:"user,omitempty"`
}
