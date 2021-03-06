/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type EmojiReaction struct {

	EmojiCode *interface{} `json:"emoji_code,omitempty"`

	EmojiName *interface{} `json:"emoji_name,omitempty"`

	ReactionType *interface{} `json:"reaction_type,omitempty"`

	UserId *interface{} `json:"user_id,omitempty"`

	User *interface{} `json:"user,omitempty"`
}
