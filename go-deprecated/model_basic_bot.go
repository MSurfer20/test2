/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// BasicBot struct for BasicBot
type BasicBot struct {
	UserId *interface{} `json:"user_id,omitempty"`
	FullName *interface{} `json:"full_name,omitempty"`
	ApiKey *interface{} `json:"api_key,omitempty"`
	DefaultSendingStream *interface{} `json:"default_sending_stream,omitempty"`
	DefaultEventsRegisterStream *interface{} `json:"default_events_register_stream,omitempty"`
	DefaultAllPublicStreams *interface{} `json:"default_all_public_streams,omitempty"`
	AvatarUrl *interface{} `json:"avatar_url,omitempty"`
	OwnerId *interface{} `json:"owner_id,omitempty"`
	Services *interface{} `json:"services,omitempty"`
}
