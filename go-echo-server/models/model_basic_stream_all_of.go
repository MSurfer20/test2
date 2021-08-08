package models

type BasicStreamAllOf struct {

	StreamId *interface{} `json:"stream_id,omitempty"`

	Name *interface{} `json:"name,omitempty"`

	Description *interface{} `json:"description,omitempty"`

	DateCreated *interface{} `json:"date_created,omitempty"`

	InviteOnly *interface{} `json:"invite_only,omitempty"`

	RenderedDescription *interface{} `json:"rendered_description,omitempty"`

	IsWebPublic *interface{} `json:"is_web_public,omitempty"`

	StreamPostPolicy *interface{} `json:"stream_post_policy,omitempty"`

	MessageRetentionDays *interface{} `json:"message_retention_days,omitempty"`

	HistoryPublicToSubscribers *interface{} `json:"history_public_to_subscribers,omitempty"`

	FirstMessageId *interface{} `json:"first_message_id,omitempty"`

	IsAnnouncementOnly *interface{} `json:"is_announcement_only,omitempty"`
}
