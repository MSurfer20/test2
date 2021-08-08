package models

// RealmEmoji - `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
type RealmEmoji struct {

	// The ID for this emoji, same as the object's key. 
	Id string `json:"id,omitempty"`

	// The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
	Name string `json:"name,omitempty"`

	// The path relative to the organization's URL where the emoji's image can be found. 
	SourceUrl string `json:"source_url,omitempty"`

	// Whether the emoji has been deactivated or not. 
	Deactivated bool `json:"deactivated,omitempty"`

	// The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
	AuthorId *int32 `json:"author_id,omitempty"`
}
