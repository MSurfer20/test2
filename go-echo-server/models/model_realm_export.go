package models

// RealmExport - Object containing details about a realm export. 
type RealmExport struct {

	// The id of the export. 
	Id int32 `json:"id,omitempty"`

	// The id of the user who did the export. 
	ActingUserId int32 `json:"acting_user_id,omitempty"`

	// The UNIX timestamp of when the export was made. 
	ExportTime float32 `json:"export_time,omitempty"`

	// The timestamp of when the export was deleted. Null if it wasn't. 
	DeletedTimestamp *float32 `json:"deleted_timestamp,omitempty"`

	// The timestamp of when the export failed. Null if it didn't. 
	FailedTimestamp *float32 `json:"failed_timestamp,omitempty"`

	// The URL of the export. `null` if there's no URL. 
	ExportUrl *string `json:"export_url,omitempty"`

	// Whether the export is pending or not. 
	Pending bool `json:"pending,omitempty"`
}
