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

// A RealTimeEventsApiController binds http requests to an api service and writes the service results to the http response
type RealTimeEventsApiController struct {
	service RealTimeEventsApiServicer
}

// NewRealTimeEventsApiController creates a default api controller
func NewRealTimeEventsApiController(s RealTimeEventsApiServicer) Router {
	return &RealTimeEventsApiController{service: s}
}

// Routes returns all of the api route for the RealTimeEventsApiController
func (c *RealTimeEventsApiController) Routes() Routes {
	return Routes{ 
		{
			"DeleteQueue",
			strings.ToUpper("Delete"),
			"/api/v1/events",
			c.DeleteQueue,
		},
		{
			"GetEvents",
			strings.ToUpper("Get"),
			"/api/v1/events",
			c.GetEvents,
		},
		{
			"RealTimePost",
			strings.ToUpper("Post"),
			"/api/v1/real-time",
			c.RealTimePost,
		},
		{
			"RegisterQueue",
			strings.ToUpper("Post"),
			"/api/v1/register",
			c.RegisterQueue,
		},
		{
			"RestErrorHandling",
			strings.ToUpper("Post"),
			"/api/v1/rest-error-handling",
			c.RestErrorHandling,
		},
	}
}

// DeleteQueue - Delete an event queue
func (c *RealTimeEventsApiController) DeleteQueue(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	queueId := query.Get("queue_id")
	result, err := c.service.DeleteQueue(r.Context(), queueId)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GetEvents - Get events from an event queue
func (c *RealTimeEventsApiController) GetEvents(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	queueId := query.Get("queue_id")
	lastEventId, err := parseInt32Parameter(query.Get("last_event_id"), false)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
	dontBlock, err := parseBoolParameter(query.Get("dont_block"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	result, err := c.service.GetEvents(r.Context(), queueId, lastEventId, dontBlock)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// RealTimePost - 
func (c *RealTimeEventsApiController) RealTimePost(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	eventTypes := strings.Split(query.Get("event_types"), ",")
	narrow := strings.Split(query.Get("narrow"), ",")
	allPublicStreams, err := parseBoolParameter(query.Get("all_public_streams"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	result, err := c.service.RealTimePost(r.Context(), eventTypes, narrow, allPublicStreams)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// RegisterQueue - Register an event queue
func (c *RealTimeEventsApiController) RegisterQueue(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	applyMarkdown, err := parseBoolParameter(query.Get("apply_markdown"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	clientGravatar, err := parseBoolParameter(query.Get("client_gravatar"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	slimPresence, err := parseBoolParameter(query.Get("slim_presence"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	eventTypes := strings.Split(query.Get("event_types"), ",")
	allPublicStreams, err := parseBoolParameter(query.Get("all_public_streams"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	includeSubscribers, err := parseBoolParameter(query.Get("include_subscribers"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	clientCapabilities := query.Get("client_capabilities")
	fetchEventTypes := strings.Split(query.Get("fetch_event_types"), ",")
	narrow := strings.Split(query.Get("narrow"), ",")
	result, err := c.service.RegisterQueue(r.Context(), applyMarkdown, clientGravatar, slimPresence, eventTypes, allPublicStreams, includeSubscribers, clientCapabilities, fetchEventTypes, narrow)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// RestErrorHandling - Error handling
func (c *RealTimeEventsApiController) RestErrorHandling(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.RestErrorHandling(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}
