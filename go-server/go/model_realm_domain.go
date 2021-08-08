/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// RealmDomain - Object containing details of the newly added domain. 
type RealmDomain struct {

	// The new allowed domain. 
	Domain string `json:"domain,omitempty"`

	// Whether subdomains are allowed for this domain. 
	AllowSubdomains bool `json:"allow_subdomains,omitempty"`
}
