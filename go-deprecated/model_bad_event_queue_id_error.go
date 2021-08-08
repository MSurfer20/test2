/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// BadEventQueueIdError struct for BadEventQueueIdError
type BadEventQueueIdError struct {
	Result *interface{} `json:"result"`
	Msg *interface{} `json:"msg"`
	Code *interface{} `json:"code,omitempty"`
	// The string that identifies the invalid event queue. 
	QueueId string `json:"queue_id,omitempty"`
}
