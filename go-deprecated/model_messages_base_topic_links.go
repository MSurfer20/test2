/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// MessagesBaseTopicLinks struct for MessagesBaseTopicLinks
type MessagesBaseTopicLinks struct {
	// The original link text present in the topic. 
	Text string `json:"text,omitempty"`
	// The expanded target url which the link points to. 
	Url string `json:"url,omitempty"`
}
