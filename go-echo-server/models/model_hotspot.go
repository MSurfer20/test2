package models

// Hotspot - Dictionary containing details of a single hotspot. 
type Hotspot struct {

	// The delay after which the user should be shown the hotspot. 
	Delay float32 `json:"delay,omitempty"`

	// The name of the hotspot. 
	Name string `json:"name,omitempty"`

	// The title of the hotspot, as will be displayed to the user. 
	Title string `json:"title,omitempty"`

	// The description of the hotspot, as will be displayed to the user. 
	Description string `json:"description,omitempty"`
}
