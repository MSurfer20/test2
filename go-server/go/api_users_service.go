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

// UsersApiService is a service that implents the logic for the UsersApiServicer
// This service should implement the business logic for every endpoint for the UsersApi API. 
// Include any external packages or services that will be required by this service.
type UsersApiService struct {
}

// NewUsersApiService creates a default api service
func NewUsersApiService() UsersApiServicer {
	return &UsersApiService{}
}

// CreateUser - Create a user
func (s *UsersApiService) CreateUser(ctx context.Context, email string, password string, fullName string) (ImplResponse, error) {
	// TODO - update CreateUser with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	//TODO: Uncomment the next line to return response Response(400, JsonError{}) or use other options such as http.Ok ...
	//return Response(400, JsonError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateUser method not implemented")
}

// CreateUserGroup - Create a user group
func (s *UsersApiService) CreateUserGroup(ctx context.Context, name string, description string, members []int32) (ImplResponse, error) {
	// TODO - update CreateUserGroup with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, JsonError{}) or use other options such as http.Ok ...
	//return Response(400, JsonError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateUserGroup method not implemented")
}

// DeactivateOwnUser - Deactivate own user
func (s *UsersApiService) DeactivateOwnUser(ctx context.Context) (ImplResponse, error) {
	// TODO - update DeactivateOwnUser with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, JsonError{}) or use other options such as http.Ok ...
	//return Response(400, JsonError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeactivateOwnUser method not implemented")
}

// DeactivateUser - Deactivate a user
func (s *UsersApiService) DeactivateUser(ctx context.Context, userId int32) (ImplResponse, error) {
	// TODO - update DeactivateUser with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, JsonError{}) or use other options such as http.Ok ...
	//return Response(400, JsonError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeactivateUser method not implemented")
}

// GetAttachments - Get attachments
func (s *UsersApiService) GetAttachments(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetAttachments with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAttachments method not implemented")
}

// GetOwnUser - Get own user
func (s *UsersApiService) GetOwnUser(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetOwnUser with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetOwnUser method not implemented")
}

// GetUser - Get a user
func (s *UsersApiService) GetUser(ctx context.Context, userId int32, clientGravatar bool, includeCustomProfileFields bool) (ImplResponse, error) {
	// TODO - update GetUser with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetUser method not implemented")
}

// GetUserByEmail - Get a user by email
func (s *UsersApiService) GetUserByEmail(ctx context.Context, email string, clientGravatar bool, includeCustomProfileFields bool) (ImplResponse, error) {
	// TODO - update GetUserByEmail with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetUserByEmail method not implemented")
}

// GetUserGroups - Get user groups
func (s *UsersApiService) GetUserGroups(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetUserGroups with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetUserGroups method not implemented")
}

// GetUserPresence - Get user presence
func (s *UsersApiService) GetUserPresence(ctx context.Context, userIdOrEmail string) (ImplResponse, error) {
	// TODO - update GetUserPresence with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetUserPresence method not implemented")
}

// GetUsers - Get all users
func (s *UsersApiService) GetUsers(ctx context.Context, clientGravatar bool, includeCustomProfileFields bool) (ImplResponse, error) {
	// TODO - update GetUsers with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetUsers method not implemented")
}

// MuteUser - Mute a user
func (s *UsersApiService) MuteUser(ctx context.Context, mutedUserId int32) (ImplResponse, error) {
	// TODO - update MuteUser with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, OneOfobjectobjectobject{}) or use other options such as http.Ok ...
	//return Response(400, OneOfobjectobjectobject{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MuteUser method not implemented")
}

// ReactivateUser - Reactivate a user
func (s *UsersApiService) ReactivateUser(ctx context.Context, userId int32) (ImplResponse, error) {
	// TODO - update ReactivateUser with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, interface{}{}) or use other options such as http.Ok ...
	//return Response(200, interface{}{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ReactivateUser method not implemented")
}

// RemoveUserGroup - Delete a user group
func (s *UsersApiService) RemoveUserGroup(ctx context.Context, userGroupId int32) (ImplResponse, error) {
	// TODO - update RemoveUserGroup with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, JsonError{}) or use other options such as http.Ok ...
	//return Response(400, JsonError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RemoveUserGroup method not implemented")
}

// SetTypingStatus - Set \&quot;typing\&quot; status
func (s *UsersApiService) SetTypingStatus(ctx context.Context, op string, to []int32, type_ string, topic string) (ImplResponse, error) {
	// TODO - update SetTypingStatus with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, JsonError{}) or use other options such as http.Ok ...
	//return Response(400, JsonError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SetTypingStatus method not implemented")
}

// UnmuteUser - Unmute a user
func (s *UsersApiService) UnmuteUser(ctx context.Context, mutedUserId int32) (ImplResponse, error) {
	// TODO - update UnmuteUser with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, OneOfobjectobject{}) or use other options such as http.Ok ...
	//return Response(400, OneOfobjectobject{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UnmuteUser method not implemented")
}

// UpdateSettings - Update settings
func (s *UsersApiService) UpdateSettings(ctx context.Context, fullName string, email string, oldPassword string, newPassword string, twentyFourHourTime bool, denseMode bool, starredMessageCounts bool, fluidLayoutWidth bool, highContrastMode bool, colorScheme int32, enableDraftsSynchronization bool, translateEmoticons bool, defaultLanguage string, defaultView string, leftSideUserlist bool, emojiset string, demoteInactiveStreams int32, timezone string, enableStreamDesktopNotifications bool, enableStreamEmailNotifications bool, enableStreamPushNotifications bool, enableStreamAudibleNotifications bool, notificationSound string, enableDesktopNotifications bool, enableSounds bool, emailNotificationsBatchingPeriodSeconds int32, enableOfflineEmailNotifications bool, enableOfflinePushNotifications bool, enableOnlinePushNotifications bool, enableDigestEmails bool, enableMarketingEmails bool, enableLoginEmails bool, messageContentInEmailNotifications bool, pmContentInDesktopNotifications bool, wildcardMentionsNotify bool, desktopIconCountDisplay int32, realmNameInNotifications bool, presenceEnabled bool, enterSends bool) (ImplResponse, error) {
	// TODO - update UpdateSettings with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccessBase{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccessBase{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateSettings method not implemented")
}

// UpdateStatus - Update your status
func (s *UsersApiService) UpdateStatus(ctx context.Context, statusText string, away bool, emojiName string, emojiCode string, reactionType string) (ImplResponse, error) {
	// TODO - update UpdateStatus with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, OneOfobjectobjectobjectobjectobjectobject{}) or use other options such as http.Ok ...
	//return Response(400, OneOfobjectobjectobjectobjectobjectobject{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateStatus method not implemented")
}

// UpdateUser - Update a user
func (s *UsersApiService) UpdateUser(ctx context.Context, userId int32, fullName string, role int32, profileData []map[string]interface{}) (ImplResponse, error) {
	// TODO - update UpdateUser with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, CodedError{}) or use other options such as http.Ok ...
	//return Response(400, CodedError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateUser method not implemented")
}

// UpdateUserGroup - Update a user group
func (s *UsersApiService) UpdateUserGroup(ctx context.Context, userGroupId int32, name string, description string) (ImplResponse, error) {
	// TODO - update UpdateUserGroup with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	//TODO: Uncomment the next line to return response Response(400, JsonError{}) or use other options such as http.Ok ...
	//return Response(400, JsonError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateUserGroup method not implemented")
}

// UpdateUserGroupMembers - Update user group members
func (s *UsersApiService) UpdateUserGroupMembers(ctx context.Context, userGroupId int32, delete []int32, add []int32) (ImplResponse, error) {
	// TODO - update UpdateUserGroupMembers with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(200, JsonSuccess{}) or use other options such as http.Ok ...
	//return Response(200, JsonSuccess{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateUserGroupMembers method not implemented")
}

