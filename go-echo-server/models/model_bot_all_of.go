package models

// BotAllOf - Object containing details of a bot. 
type BotAllOf struct {

	UserId *interface{} `json:"user_id,omitempty"`

	FullName *interface{} `json:"full_name,omitempty"`

	ApiKey *interface{} `json:"api_key,omitempty"`

	DefaultSendingStream *interface{} `json:"default_sending_stream,omitempty"`

	DefaultEventsRegisterStream *interface{} `json:"default_events_register_stream,omitempty"`

	DefaultAllPublicStreams *interface{} `json:"default_all_public_streams,omitempty"`

	AvatarUrl *interface{} `json:"avatar_url,omitempty"`

	OwnerId *interface{} `json:"owner_id,omitempty"`

	Services *interface{} `json:"services,omitempty"`

	// The email of the bot. 
	Email string `json:"email,omitempty"`

	// An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
	BotType *int32 `json:"bot_type,omitempty"`

	// A boolean describing whether the user account has been deactivated. 
	IsActive bool `json:"is_active,omitempty"`
}
