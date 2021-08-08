package models

type AttachmentsMessages struct {

	// Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
	DateSent int32 `json:"date_sent,omitempty"`

	// The unique message ID.  Messages should always be displayed sorted by ID. 
	Id int32 `json:"id,omitempty"`
}
