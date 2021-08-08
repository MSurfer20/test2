package models

// MessagesBase - Object containing details of the message. 
type MessagesBase struct {

	// The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
	AvatarUrl *string `json:"avatar_url,omitempty"`

	// A Zulip \"client\" string, describing what Zulip client sent the message. 
	Client string `json:"client,omitempty"`

	// The content/body of the message. 
	Content string `json:"content,omitempty"`

	// The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
	ContentType string `json:"content_type,omitempty"`

	// Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
	DisplayRecipient OneOfstringarray `json:"display_recipient,omitempty"`

	// The unique message ID.  Messages should always be displayed sorted by ID. 
	Id int32 `json:"id,omitempty"`

	// Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
	IsMeMessage bool `json:"is_me_message,omitempty"`

	// Data on any reactions to the message. 
	Reactions []EmojiReaction `json:"reactions,omitempty"`

	// A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
	RecipientId int32 `json:"recipient_id,omitempty"`

	// The Zulip display email address of the message's sender. 
	SenderEmail string `json:"sender_email,omitempty"`

	// The full name of the message's sender. 
	SenderFullName string `json:"sender_full_name,omitempty"`

	// The user ID of the message's sender. 
	SenderId int32 `json:"sender_id,omitempty"`

	// A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
	SenderRealmStr string `json:"sender_realm_str,omitempty"`

	// Only present for stream messages; the ID of the stream. 
	StreamId int32 `json:"stream_id,omitempty"`

	// The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
	Subject string `json:"subject,omitempty"`

	// Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
	TopicLinks []MessagesBaseTopicLinks `json:"topic_links,omitempty"`

	// Data used for certain experimental Zulip integrations. 
	Submessages []string `json:"submessages,omitempty"`

	// The UNIX timestamp for when the message was sent, in UTC seconds. 
	Timestamp int32 `json:"timestamp,omitempty"`

	// The type of the message: `stream` or `private`. 
	Type string `json:"type,omitempty"`
}
