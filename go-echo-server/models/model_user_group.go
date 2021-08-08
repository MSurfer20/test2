package models

// UserGroup - Object containing the user group's attributes. 
type UserGroup struct {

	// The name of the user group. 
	Name string `json:"name,omitempty"`

	// The description of the user group. 
	Description string `json:"description,omitempty"`

	// Array containing the id of the users who are members of this user group. 
	Members []int32 `json:"members,omitempty"`

	// The ID of the user group. 
	Id int32 `json:"id,omitempty"`
}
