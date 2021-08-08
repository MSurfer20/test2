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
	"context"
	"net/http"
	"errors"
)

// WebhooksApiService is a service that implents the logic for the WebhooksApiServicer
// This service should implement the business logic for every endpoint for the WebhooksApi API. 
// Include any external packages or services that will be required by this service.
type WebhooksApiService struct {
}

// NewWebhooksApiService creates a default api service
func NewWebhooksApiService() WebhooksApiServicer {
	return &WebhooksApiService{}
}

// ZulipOutgoingWebhooks - Outgoing webhooks
func (s *WebhooksApiService) ZulipOutgoingWebhooks(ctx context.Context) (ImplResponse, error) {
	// TODO - update ZulipOutgoingWebhooks with the required logic for this service method.
	// Add api_webhooks_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, InlineResponse200{}) or use other options such as http.Ok ...
	//return Response(200, InlineResponse200{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ZulipOutgoingWebhooks method not implemented")
}

