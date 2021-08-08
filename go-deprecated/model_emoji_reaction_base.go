/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// EmojiReactionBase struct for EmojiReactionBase
type EmojiReactionBase struct {
	// A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
	EmojiCode string `json:"emoji_code,omitempty"`
	// Name of the emoji. 
	EmojiName string `json:"emoji_name,omitempty"`
	// One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
	ReactionType string `json:"reaction_type,omitempty"`
	// The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
	UserId int32 `json:"user_id,omitempty"`
	User EmojiReactionBaseAllOfUser `json:"user,omitempty"`
}
