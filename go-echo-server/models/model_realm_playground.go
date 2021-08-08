package models

// RealmPlayground - Object containing details about a realm playground. 
type RealmPlayground struct {

	// The unique ID for the realm playground. 
	Id int32 `json:"id,omitempty"`

	// The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
	Name string `json:"name,omitempty"`

	// The name of the Pygments language lexer for that programming language. 
	PygmentsLanguage string `json:"pygments_language,omitempty"`

	// The url prefix for the playground. 
	UrlPrefix string `json:"url_prefix,omitempty"`
}
