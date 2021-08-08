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
	"os"
)

// MessagesApiService is a service that implents the logic for the MessagesApiServicer
// This service should implement the business logic for every endpoint for the MessagesApi API. 
// Include any external packages or services that will be required by this service.
type MessagesApiService struct {
}

// NewMessagesApiService creates a default api service
func NewMessagesApiService() MessagesApiServicer {
	return &MessagesApiService{}
}

// AddReaction - Add an emoji reaction
func (s *MessagesApiService) AddReaction(ctx context.Context, messageId int32, emojiName string, emojiCode string, reactionType string) (ImplResponse, error) {
	// TODO - update AddReaction with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, CodedError{}) or use other options such as http.Ok ...
	//return Response(400, CodedError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AddReaction method not implemented")
}

// CheckMessagesMatchNarrow - Check if messages match a narrow
func (s *MessagesApiService) CheckMessagesMatchNarrow(ctx context.Context, msgIds []int32, narrow []map[string]interface{}) (ImplResponse, error) {
	// TODO - update CheckMessagesMatchNarrow with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, interface{}{}) or use other options such as http.Ok ...
	//return Response(200, interface{}{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CheckMessagesMatchNarrow method not implemented")
}

// DeleteMessage - Delete a message
func (s *MessagesApiService) DeleteMessage(ctx context.Context, messageId int32) (ImplResponse, error) {
	// TODO - update DeleteMessage with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, OneOfobjectobject{}) or use other options such as http.Ok ...
	//return Response(400, OneOfobjectobject{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteMessage method not implemented")
}

// GetFileTemporaryUrl - Get public temporary URL
func (s *MessagesApiService) GetFileTemporaryUrl(ctx context.Context, realmIdStr int32, filename string) (ImplResponse, error) {
	// TODO - update GetFileTemporaryUrl with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetFileTemporaryUrl method not implemented")
}

// GetMessageHistory - Get a message&#39;s edit history
func (s *MessagesApiService) GetMessageHistory(ctx context.Context, messageId int32) (ImplResponse, error) {
	// TODO - update GetMessageHistory with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	//TODO: Uncomment the next line to return response Response(400, InvalidMessageError{}) or use other options such as http.Ok ...
	//return Response(400, InvalidMessageError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetMessageHistory method not implemented")
}

// GetMessages - Get messages
func (s *MessagesApiService) GetMessages(ctx context.Context, numBefore int32, numAfter int32, anchor OneOfstringinteger, narrow []map[string]interface{}, clientGravatar bool, applyMarkdown bool, useFirstUnreadAnchor bool) (ImplResponse, error) {
	// TODO - update GetMessages with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetMessages method not implemented")
}

// GetRawMessage - Get a message&#39;s raw Markdown
func (s *MessagesApiService) GetRawMessage(ctx context.Context, messageId int32) (ImplResponse, error) {
	// TODO - update GetRawMessage with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	//TODO: Uncomment the next line to return response Response(400, InvalidMessageError{}) or use other options such as http.Ok ...
	//return Response(400, InvalidMessageError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetRawMessage method not implemented")
}

// MarkAllAsRead - Mark all messages as read
func (s *MessagesApiService) MarkAllAsRead(ctx context.Context) (ImplResponse, error) {
	// TODO - update MarkAllAsRead with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MarkAllAsRead method not implemented")
}

// MarkStreamAsRead - Mark messages in a stream as read
func (s *MessagesApiService) MarkStreamAsRead(ctx context.Context, streamId int32) (ImplResponse, error) {
	// TODO - update MarkStreamAsRead with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MarkStreamAsRead method not implemented")
}

// MarkTopicAsRead - Mark messages in a topic as read
func (s *MessagesApiService) MarkTopicAsRead(ctx context.Context, streamId int32, topicName string) (ImplResponse, error) {
	// TODO - update MarkTopicAsRead with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MarkTopicAsRead method not implemented")
}

// RemoveReaction - Remove an emoji reaction
func (s *MessagesApiService) RemoveReaction(ctx context.Context, messageId int32, emojiName string, emojiCode string, reactionType string) (ImplResponse, error) {
	// TODO - update RemoveReaction with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, CodedError{}) or use other options such as http.Ok ...
	//return Response(400, CodedError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RemoveReaction method not implemented")
}

// RenderMessage - Render message
func (s *MessagesApiService) RenderMessage(ctx context.Context, content string) (ImplResponse, error) {
	// TODO - update RenderMessage with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RenderMessage method not implemented")
}

// SendMessage - Send a message
func (s *MessagesApiService) SendMessage(ctx context.Context, type_ string, to []int32, content string, topic string, queueId string, localId string) (ImplResponse, error) {
	// TODO - update SendMessage with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	//TODO: Uncomment the next line to return response Response(400, OneOfobjectobject{}) or use other options such as http.Ok ...
	//return Response(400, OneOfobjectobject{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SendMessage method not implemented")
}

// UpdateMessage - Edit a message
func (s *MessagesApiService) UpdateMessage(ctx context.Context, messageId int32, topic string, propagateMode string, sendNotificationToOldThread bool, sendNotificationToNewThread bool, content string, streamId int32) (ImplResponse, error) {
	// TODO - update UpdateMessage with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, CodedError{}) or use other options such as http.Ok ...
	//return Response(400, CodedError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateMessage method not implemented")
}

// UpdateMessageFlags - Update personal message flags
func (s *MessagesApiService) UpdateMessageFlags(ctx context.Context, messages []int32, op string, flag string) (ImplResponse, error) {
	// TODO - update UpdateMessageFlags with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateMessageFlags method not implemented")
}

// UploadFile - Upload a file
func (s *MessagesApiService) UploadFile(ctx context.Context, filename *os.File) (ImplResponse, error) {
	// TODO - update UploadFile with the required logic for this service method.
	// Add api_messages_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UploadFile method not implemented")
}

