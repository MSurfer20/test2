/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// A ServerAndOrganizationsApiController binds http requests to an api service and writes the service results to the http response
type ServerAndOrganizationsApiController struct {
	service ServerAndOrganizationsApiServicer
}

// NewServerAndOrganizationsApiController creates a default api controller
func NewServerAndOrganizationsApiController(s ServerAndOrganizationsApiServicer) Router {
	return &ServerAndOrganizationsApiController{service: s}
}

// Routes returns all of the api route for the ServerAndOrganizationsApiController
func (c *ServerAndOrganizationsApiController) Routes() Routes {
	return Routes{ 
		{
			"AddCodePlayground",
			strings.ToUpper("Post"),
			"/api/v1/realm/playgrounds",
			c.AddCodePlayground,
		},
		{
			"AddLinkifier",
			strings.ToUpper("Post"),
			"/api/v1/realm/filters",
			c.AddLinkifier,
		},
		{
			"CreateCustomProfileField",
			strings.ToUpper("Post"),
			"/api/v1/realm/profile_fields",
			c.CreateCustomProfileField,
		},
		{
			"GetCustomEmoji",
			strings.ToUpper("Get"),
			"/api/v1/realm/emoji",
			c.GetCustomEmoji,
		},
		{
			"GetCustomProfileFields",
			strings.ToUpper("Get"),
			"/api/v1/realm/profile_fields",
			c.GetCustomProfileFields,
		},
		{
			"GetLinkifiers",
			strings.ToUpper("Get"),
			"/api/v1/realm/linkifiers",
			c.GetLinkifiers,
		},
		{
			"GetServerSettings",
			strings.ToUpper("Get"),
			"/api/v1/server_settings",
			c.GetServerSettings,
		},
		{
			"RemoveCodePlayground",
			strings.ToUpper("Delete"),
			"/api/v1/realm/playgrounds/{playground_id}",
			c.RemoveCodePlayground,
		},
		{
			"RemoveLinkifier",
			strings.ToUpper("Delete"),
			"/api/v1/realm/filters/{filter_id}",
			c.RemoveLinkifier,
		},
		{
			"ReorderCustomProfileFields",
			strings.ToUpper("Patch"),
			"/api/v1/realm/profile_fields",
			c.ReorderCustomProfileFields,
		},
		{
			"UpdateLinkifier",
			strings.ToUpper("Patch"),
			"/api/v1/realm/filters/{filter_id}",
			c.UpdateLinkifier,
		},
		{
			"UploadCustomEmoji",
			strings.ToUpper("Post"),
			"/api/v1/realm/emoji/{emoji_name}",
			c.UploadCustomEmoji,
		},
	}
}

// AddCodePlayground - Add a code playground
func (c *ServerAndOrganizationsApiController) AddCodePlayground(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	name := query.Get("name")
	pygmentsLanguage := query.Get("pygments_language")
	urlPrefix := query.Get("url_prefix")
	result, err := c.service.AddCodePlayground(r.Context(), name, pygmentsLanguage, urlPrefix)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// AddLinkifier - Add a linkifier
func (c *ServerAndOrganizationsApiController) AddLinkifier(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	pattern := query.Get("pattern")
	urlFormatString := query.Get("url_format_string")
	result, err := c.service.AddLinkifier(r.Context(), pattern, urlFormatString)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// CreateCustomProfileField - Create a custom profile field
func (c *ServerAndOrganizationsApiController) CreateCustomProfileField(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	fieldType, err := parseInt32Parameter(query.Get("field_type"), true)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
	name := query.Get("name")
	hint := query.Get("hint")
	fieldData := query.Get("field_data")
	result, err := c.service.CreateCustomProfileField(r.Context(), fieldType, name, hint, fieldData)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GetCustomEmoji - Get all custom emoji
func (c *ServerAndOrganizationsApiController) GetCustomEmoji(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetCustomEmoji(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GetCustomProfileFields - Get all custom profile fields
func (c *ServerAndOrganizationsApiController) GetCustomProfileFields(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetCustomProfileFields(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GetLinkifiers - Get linkifiers
func (c *ServerAndOrganizationsApiController) GetLinkifiers(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetLinkifiers(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GetServerSettings - Get server settings
func (c *ServerAndOrganizationsApiController) GetServerSettings(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetServerSettings(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// RemoveCodePlayground - Remove a code playground
func (c *ServerAndOrganizationsApiController) RemoveCodePlayground(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	playgroundId, err := parseInt32Parameter(params["playground_id"], true)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}

	result, err := c.service.RemoveCodePlayground(r.Context(), playgroundId)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// RemoveLinkifier - Remove a linkifier
func (c *ServerAndOrganizationsApiController) RemoveLinkifier(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	filterId, err := parseInt32Parameter(params["filter_id"], true)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}

	result, err := c.service.RemoveLinkifier(r.Context(), filterId)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// ReorderCustomProfileFields - Reorder custom profile fields
func (c *ServerAndOrganizationsApiController) ReorderCustomProfileFields(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	order := strings.Split(query.Get("order"), ",")
	result, err := c.service.ReorderCustomProfileFields(r.Context(), order)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// UpdateLinkifier - Update a linkifier
func (c *ServerAndOrganizationsApiController) UpdateLinkifier(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	filterId, err := parseInt32Parameter(params["filter_id"], true)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}

	pattern := query.Get("pattern")
	urlFormatString := query.Get("url_format_string")
	result, err := c.service.UpdateLinkifier(r.Context(), filterId, pattern, urlFormatString)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// UploadCustomEmoji - Upload custom emoji
func (c *ServerAndOrganizationsApiController) UploadCustomEmoji(w http.ResponseWriter, r *http.Request) {
	if err := r.ParseMultipartForm(32 << 20); err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
	params := mux.Vars(r)
	emojiName := params["emoji_name"]
	
	
	filename, err := ReadFormFileToTempFile(r, "filename")
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
			result, err := c.service.UploadCustomEmoji(r.Context(), emojiName, filename)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}
