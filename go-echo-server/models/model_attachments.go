package models

// Attachments - Dictionary containing details of a file uploaded by a user. 
type Attachments struct {

	// The unique ID for the attachment. 
	Id int32 `json:"id,omitempty"`

	// Name of the uploaded file. 
	Name string `json:"name,omitempty"`

	// A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
	PathId string `json:"path_id,omitempty"`

	// Size of the file in bytes. 
	Size int32 `json:"size,omitempty"`

	// Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
	CreateTime int32 `json:"create_time,omitempty"`

	// Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
	Messages []AttachmentsMessages `json:"messages,omitempty"`
}
