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

// StreamsApiService is a service that implents the logic for the StreamsApiServicer
// This service should implement the business logic for every endpoint for the StreamsApi API. 
// Include any external packages or services that will be required by this service.
type StreamsApiService struct {
}

// NewStreamsApiService creates a default api service
func NewStreamsApiService() StreamsApiServicer {
	return &StreamsApiService{}
}

// ArchiveStream - Archive a stream
func (s *StreamsApiService) ArchiveStream(ctx context.Context, streamId int32) (ImplResponse, error) {
	// TODO - update ArchiveStream with the required logic for this service method.
	// Add api_streams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, JsonError{}) or use other options such as http.Ok ...
	//return Response(400, JsonError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ArchiveStream method not implemented")
}

// CreateBigBlueButtonVideoCall - Create BigBlueButton video call
func (s *StreamsApiService) CreateBigBlueButtonVideoCall(ctx context.Context) (ImplResponse, error) {
	// TODO - update CreateBigBlueButtonVideoCall with the required logic for this service method.
	// Add api_streams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateBigBlueButtonVideoCall method not implemented")
}

// GetStreamId - Get stream ID
func (s *StreamsApiService) GetStreamId(ctx context.Context, stream string) (ImplResponse, error) {
	// TODO - update GetStreamId with the required logic for this service method.
	// Add api_streams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	//TODO: Uncomment the next line to return response Response(400, CodedError{}) or use other options such as http.Ok ...
	//return Response(400, CodedError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetStreamId method not implemented")
}

// GetStreamTopics - Get topics in a stream
func (s *StreamsApiService) GetStreamTopics(ctx context.Context, streamId int32) (ImplResponse, error) {
	// TODO - update GetStreamTopics with the required logic for this service method.
	// Add api_streams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	//TODO: Uncomment the next line to return response Response(400, JsonError{}) or use other options such as http.Ok ...
	//return Response(400, JsonError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetStreamTopics method not implemented")
}

// GetStreams - Get all streams
func (s *StreamsApiService) GetStreams(ctx context.Context, includePublic bool, includeWebPublic bool, includeSubscribed bool, includeAllActive bool, includeDefault bool, includeOwnerSubscribed bool) (ImplResponse, error) {
	// TODO - update GetStreams with the required logic for this service method.
	// Add api_streams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	//TODO: Uncomment the next line to return response Response(400, CodedError{}) or use other options such as http.Ok ...
	//return Response(400, CodedError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetStreams method not implemented")
}

// GetSubscriptionStatus - Get subscription status
func (s *StreamsApiService) GetSubscriptionStatus(ctx context.Context, userId int32, streamId int32) (ImplResponse, error) {
	// TODO - update GetSubscriptionStatus with the required logic for this service method.
	// Add api_streams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetSubscriptionStatus method not implemented")
}

// GetSubscriptions - Get subscribed streams
func (s *StreamsApiService) GetSubscriptions(ctx context.Context, includeSubscribers bool) (ImplResponse, error) {
	// TODO - update GetSubscriptions with the required logic for this service method.
	// Add api_streams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetSubscriptions method not implemented")
}

// MuteTopic - Topic muting
func (s *StreamsApiService) MuteTopic(ctx context.Context, topic string, op string, stream string, streamId int32) (ImplResponse, error) {
	// TODO - update MuteTopic with the required logic for this service method.
	// Add api_streams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, OneOfobjectobject{}) or use other options such as http.Ok ...
	//return Response(400, OneOfobjectobject{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MuteTopic method not implemented")
}

// Subscribe - Subscribe to a stream
func (s *StreamsApiService) Subscribe(ctx context.Context, subscriptions []map[string]interface{}, principals []OneOfstringinteger, authorizationErrorsFatal bool, announce bool, inviteOnly bool, historyPublicToSubscribers bool, streamPostPolicy int32, messageRetentionDays OneOfstringinteger) (ImplResponse, error) {
	// TODO - update Subscribe with the required logic for this service method.
	// Add api_streams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, OneOfobjectobject{}) or use other options such as http.Ok ...
	//return Response(200, OneOfobjectobject{}), nil

	//TODO: Uncomment the next line to return response Response(400, OneOfobjectobject{}) or use other options such as http.Ok ...
	//return Response(400, OneOfobjectobject{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("Subscribe method not implemented")
}

// Unsubscribe - Unsubscribe from a stream
func (s *StreamsApiService) Unsubscribe(ctx context.Context, subscriptions []string, principals []OneOfstringinteger) (ImplResponse, error) {
	// TODO - update Unsubscribe with the required logic for this service method.
	// Add api_streams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	//TODO: Uncomment the next line to return response Response(400, NonExistingStreamError{}) or use other options such as http.Ok ...
	//return Response(400, NonExistingStreamError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("Unsubscribe method not implemented")
}

// UpdateStream - Update a stream
func (s *StreamsApiService) UpdateStream(ctx context.Context, streamId int32, description string, newName string, isPrivate bool, isAnnouncementOnly bool, streamPostPolicy int32, historyPublicToSubscribers bool, messageRetentionDays OneOfstringinteger) (ImplResponse, error) {
	// TODO - update UpdateStream with the required logic for this service method.
	// Add api_streams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, JsonError{}) or use other options such as http.Ok ...
	//return Response(400, JsonError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateStream method not implemented")
}

// UpdateSubscriptionSettings - Update subscription settings
func (s *StreamsApiService) UpdateSubscriptionSettings(ctx context.Context, subscriptionData []map[string]interface{}) (ImplResponse, error) {
	// TODO - update UpdateSubscriptionSettings with the required logic for this service method.
	// Add api_streams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateSubscriptionSettings method not implemented")
}

// UpdateSubscriptions - Update subscriptions
func (s *StreamsApiService) UpdateSubscriptions(ctx context.Context, delete []string, add []map[string]interface{}) (ImplResponse, error) {
	// TODO - update UpdateSubscriptions with the required logic for this service method.
	// Add api_streams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateSubscriptions method not implemented")
}

