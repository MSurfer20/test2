package models

// Draft - A dictionary for representing a message draft. 
type Draft struct {

	// The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
	Id int32 `json:"id,omitempty"`

	// The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
	Type string `json:"type"`

	// An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
	To []int32 `json:"to"`

	// For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
	Topic string `json:"topic"`

	// The body of the draft. Should not contain null bytes. 
	Content string `json:"content"`

	// A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
	Timestamp float32 `json:"timestamp,omitempty"`
}
