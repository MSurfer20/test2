/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// InvalidMessageErrorAllOf struct for InvalidMessageErrorAllOf
type InvalidMessageErrorAllOf struct {
	Result *interface{} `json:"result,omitempty"`
	Msg *interface{} `json:"msg,omitempty"`
	// The raw content of the message. 
	RawContent string `json:"raw_content,omitempty"`
}
