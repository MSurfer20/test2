/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// EmojiReactionBaseAllOfUser Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
type EmojiReactionBaseAllOfUser struct {
	// ID of the user. 
	Id int32 `json:"id,omitempty"`
	// Email of the user. 
	Email string `json:"email,omitempty"`
	// Full name of the user. 
	FullName string `json:"full_name,omitempty"`
	// Whether the user is a mirror dummy. 
	IsMirrorDummy bool `json:"is_mirror_dummy,omitempty"`
}
