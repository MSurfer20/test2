/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// UserNotAuthorizedError struct for UserNotAuthorizedError
type UserNotAuthorizedError struct {
	Result *interface{} `json:"result"`
	Msg *interface{} `json:"msg"`
	Code *interface{} `json:"code,omitempty"`
}