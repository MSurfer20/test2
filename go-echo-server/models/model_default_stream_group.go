package models

// DefaultStreamGroup - Dictionary containing details of a default stream group. 
type DefaultStreamGroup struct {

	// Name of the default stream group. 
	Name string `json:"name,omitempty"`

	// Description of the default stream group. 
	Description string `json:"description,omitempty"`

	// id of the default stream group. 
	Id int32 `json:"id,omitempty"`

	// Array containing details about the streams in the default stream group. 
	Streams []BasicStream `json:"streams,omitempty"`
}
