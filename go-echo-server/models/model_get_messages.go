package models

type GetMessages struct {

	AvatarUrl *interface{} `json:"avatar_url,omitempty"`

	Client *interface{} `json:"client,omitempty"`

	Content *interface{} `json:"content,omitempty"`

	ContentType *interface{} `json:"content_type,omitempty"`

	DisplayRecipient *interface{} `json:"display_recipient,omitempty"`

	Id *interface{} `json:"id,omitempty"`

	IsMeMessage *interface{} `json:"is_me_message,omitempty"`

	Reactions *interface{} `json:"reactions,omitempty"`

	RecipientId *interface{} `json:"recipient_id,omitempty"`

	SenderEmail *interface{} `json:"sender_email,omitempty"`

	SenderFullName *interface{} `json:"sender_full_name,omitempty"`

	SenderId *interface{} `json:"sender_id,omitempty"`

	SenderRealmStr *interface{} `json:"sender_realm_str,omitempty"`

	StreamId *interface{} `json:"stream_id,omitempty"`

	Subject *interface{} `json:"subject,omitempty"`

	TopicLinks *interface{} `json:"topic_links,omitempty"`

	Submessages *interface{} `json:"submessages,omitempty"`

	Timestamp *interface{} `json:"timestamp,omitempty"`

	Type *interface{} `json:"type,omitempty"`

	// The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
	Flags []string `json:"flags,omitempty"`

	// The UNIX timestamp for when the message was last edited, in UTC seconds. 
	LastEditTimestamp int32 `json:"last_edit_timestamp,omitempty"`

	// Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
	MatchContent string `json:"match_content,omitempty"`

	// Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
	MatchSubject string `json:"match_subject,omitempty"`
}
