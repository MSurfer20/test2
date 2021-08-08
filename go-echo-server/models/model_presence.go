package models

// Presence - `{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. 
type Presence struct {

	// The client's platform name. 
	Client string `json:"client,omitempty"`

	// The status of the user on this client. It is either `idle` or `active`. 
	Status string `json:"status,omitempty"`

	// The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
	Timestamp int32 `json:"timestamp,omitempty"`

	// Whether the client is capable of showing mobile/push notifications to the user. 
	Pushable bool `json:"pushable,omitempty"`
}
