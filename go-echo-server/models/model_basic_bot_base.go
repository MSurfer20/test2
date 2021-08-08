package models

type BasicBotBase struct {

	// The user id of the bot. 
	UserId int32 `json:"user_id,omitempty"`

	// The full name of the bot. 
	FullName string `json:"full_name,omitempty"`

	// The API key of the bot which it uses to make API requests. 
	ApiKey string `json:"api_key,omitempty"`

	// The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
	DefaultSendingStream *string `json:"default_sending_stream,omitempty"`

	// The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
	DefaultEventsRegisterStream *string `json:"default_events_register_stream,omitempty"`

	// Whether the bot can send messages to all streams by default. 
	DefaultAllPublicStreams bool `json:"default_all_public_streams,omitempty"`

	// The URL of the bot's avatar. 
	AvatarUrl string `json:"avatar_url,omitempty"`

	// The user id of the bot's owner.  Null if the bot has no owner. 
	OwnerId *int32 `json:"owner_id,omitempty"`

	// The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
	Services []OneOfobjectobject `json:"services,omitempty"`
}
