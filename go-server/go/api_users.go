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

// A UsersApiController binds http requests to an api service and writes the service results to the http response
type UsersApiController struct {
	service UsersApiServicer
}

// NewUsersApiController creates a default api controller
func NewUsersApiController(s UsersApiServicer) Router {
	return &UsersApiController{service: s}
}

// Routes returns all of the api route for the UsersApiController
func (c *UsersApiController) Routes() Routes {
	return Routes{ 
		{
			"CreateUser",
			strings.ToUpper("Post"),
			"/api/v1/users",
			c.CreateUser,
		},
		{
			"CreateUserGroup",
			strings.ToUpper("Post"),
			"/api/v1/user_groups/create",
			c.CreateUserGroup,
		},
		{
			"DeactivateOwnUser",
			strings.ToUpper("Delete"),
			"/api/v1/users/me",
			c.DeactivateOwnUser,
		},
		{
			"DeactivateUser",
			strings.ToUpper("Delete"),
			"/api/v1/users/{user_id}",
			c.DeactivateUser,
		},
		{
			"GetAttachments",
			strings.ToUpper("Get"),
			"/api/v1/attachments",
			c.GetAttachments,
		},
		{
			"GetOwnUser",
			strings.ToUpper("Get"),
			"/api/v1/users/me",
			c.GetOwnUser,
		},
		{
			"GetUser",
			strings.ToUpper("Get"),
			"/api/v1/users/{user_id}",
			c.GetUser,
		},
		{
			"GetUserByEmail",
			strings.ToUpper("Get"),
			"/api/v1/users/{email}",
			c.GetUserByEmail,
		},
		{
			"GetUserGroups",
			strings.ToUpper("Get"),
			"/api/v1/user_groups",
			c.GetUserGroups,
		},
		{
			"GetUserPresence",
			strings.ToUpper("Get"),
			"/api/v1/users/{user_id_or_email}/presence",
			c.GetUserPresence,
		},
		{
			"GetUsers",
			strings.ToUpper("Get"),
			"/api/v1/users",
			c.GetUsers,
		},
		{
			"MuteUser",
			strings.ToUpper("Post"),
			"/api/v1/users/me/muted_users/{muted_user_id}",
			c.MuteUser,
		},
		{
			"ReactivateUser",
			strings.ToUpper("Post"),
			"/api/v1/users/{user_id}/reactivate",
			c.ReactivateUser,
		},
		{
			"RemoveUserGroup",
			strings.ToUpper("Delete"),
			"/api/v1/user_groups/{user_group_id}",
			c.RemoveUserGroup,
		},
		{
			"SetTypingStatus",
			strings.ToUpper("Post"),
			"/api/v1/typing",
			c.SetTypingStatus,
		},
		{
			"UnmuteUser",
			strings.ToUpper("Delete"),
			"/api/v1/users/me/muted_users/{muted_user_id}",
			c.UnmuteUser,
		},
		{
			"UpdateSettings",
			strings.ToUpper("Patch"),
			"/api/v1/settings",
			c.UpdateSettings,
		},
		{
			"UpdateStatus",
			strings.ToUpper("Post"),
			"/api/v1/users/me/status",
			c.UpdateStatus,
		},
		{
			"UpdateUser",
			strings.ToUpper("Patch"),
			"/api/v1/users/{user_id}",
			c.UpdateUser,
		},
		{
			"UpdateUserGroup",
			strings.ToUpper("Patch"),
			"/api/v1/user_groups/{user_group_id}",
			c.UpdateUserGroup,
		},
		{
			"UpdateUserGroupMembers",
			strings.ToUpper("Post"),
			"/api/v1/user_groups/{user_group_id}/members",
			c.UpdateUserGroupMembers,
		},
	}
}

// CreateUser - Create a user
func (c *UsersApiController) CreateUser(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	email := query.Get("email")
	password := query.Get("password")
	fullName := query.Get("full_name")
	result, err := c.service.CreateUser(r.Context(), email, password, fullName)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// CreateUserGroup - Create a user group
func (c *UsersApiController) CreateUserGroup(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	name := query.Get("name")
	description := query.Get("description")
	members := strings.Split(query.Get("members"), ",")
	result, err := c.service.CreateUserGroup(r.Context(), name, description, members)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// DeactivateOwnUser - Deactivate own user
func (c *UsersApiController) DeactivateOwnUser(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.DeactivateOwnUser(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// DeactivateUser - Deactivate a user
func (c *UsersApiController) DeactivateUser(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	userId, err := parseInt32Parameter(params["user_id"], true)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}

	result, err := c.service.DeactivateUser(r.Context(), userId)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GetAttachments - Get attachments
func (c *UsersApiController) GetAttachments(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetAttachments(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GetOwnUser - Get own user
func (c *UsersApiController) GetOwnUser(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetOwnUser(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GetUser - Get a user
func (c *UsersApiController) GetUser(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	userId, err := parseInt32Parameter(params["user_id"], true)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}

	clientGravatar, err := parseBoolParameter(query.Get("client_gravatar"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	includeCustomProfileFields, err := parseBoolParameter(query.Get("include_custom_profile_fields"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	result, err := c.service.GetUser(r.Context(), userId, clientGravatar, includeCustomProfileFields)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GetUserByEmail - Get a user by email
func (c *UsersApiController) GetUserByEmail(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	email := params["email"]
	
	clientGravatar, err := parseBoolParameter(query.Get("client_gravatar"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	includeCustomProfileFields, err := parseBoolParameter(query.Get("include_custom_profile_fields"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	result, err := c.service.GetUserByEmail(r.Context(), email, clientGravatar, includeCustomProfileFields)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GetUserGroups - Get user groups
func (c *UsersApiController) GetUserGroups(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetUserGroups(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GetUserPresence - Get user presence
func (c *UsersApiController) GetUserPresence(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	userIdOrEmail := params["user_id_or_email"]
	
	result, err := c.service.GetUserPresence(r.Context(), userIdOrEmail)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GetUsers - Get all users
func (c *UsersApiController) GetUsers(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	clientGravatar, err := parseBoolParameter(query.Get("client_gravatar"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	includeCustomProfileFields, err := parseBoolParameter(query.Get("include_custom_profile_fields"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	result, err := c.service.GetUsers(r.Context(), clientGravatar, includeCustomProfileFields)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// MuteUser - Mute a user
func (c *UsersApiController) MuteUser(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	mutedUserId, err := parseInt32Parameter(params["muted_user_id"], true)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}

	result, err := c.service.MuteUser(r.Context(), mutedUserId)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// ReactivateUser - Reactivate a user
func (c *UsersApiController) ReactivateUser(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	userId, err := parseInt32Parameter(params["user_id"], true)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}

	result, err := c.service.ReactivateUser(r.Context(), userId)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// RemoveUserGroup - Delete a user group
func (c *UsersApiController) RemoveUserGroup(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	userGroupId, err := parseInt32Parameter(params["user_group_id"], true)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}

	result, err := c.service.RemoveUserGroup(r.Context(), userGroupId)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// SetTypingStatus - Set \"typing\" status
func (c *UsersApiController) SetTypingStatus(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	op := query.Get("op")
	to := strings.Split(query.Get("to"), ",")
	type_ := query.Get("type")
	topic := query.Get("topic")
	result, err := c.service.SetTypingStatus(r.Context(), op, to, type_, topic)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// UnmuteUser - Unmute a user
func (c *UsersApiController) UnmuteUser(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	mutedUserId, err := parseInt32Parameter(params["muted_user_id"], true)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}

	result, err := c.service.UnmuteUser(r.Context(), mutedUserId)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// UpdateSettings - Update settings
func (c *UsersApiController) UpdateSettings(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	fullName := query.Get("full_name")
	email := query.Get("email")
	oldPassword := query.Get("old_password")
	newPassword := query.Get("new_password")
	twentyFourHourTime, err := parseBoolParameter(query.Get("twenty_four_hour_time"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	denseMode, err := parseBoolParameter(query.Get("dense_mode"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	starredMessageCounts, err := parseBoolParameter(query.Get("starred_message_counts"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	fluidLayoutWidth, err := parseBoolParameter(query.Get("fluid_layout_width"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	highContrastMode, err := parseBoolParameter(query.Get("high_contrast_mode"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	colorScheme, err := parseInt32Parameter(query.Get("color_scheme"), false)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
	enableDraftsSynchronization, err := parseBoolParameter(query.Get("enable_drafts_synchronization"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	translateEmoticons, err := parseBoolParameter(query.Get("translate_emoticons"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	defaultLanguage := query.Get("default_language")
	defaultView := query.Get("default_view")
	leftSideUserlist, err := parseBoolParameter(query.Get("left_side_userlist"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	emojiset := query.Get("emojiset")
	demoteInactiveStreams, err := parseInt32Parameter(query.Get("demote_inactive_streams"), false)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
	timezone := query.Get("timezone")
	enableStreamDesktopNotifications, err := parseBoolParameter(query.Get("enable_stream_desktop_notifications"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	enableStreamEmailNotifications, err := parseBoolParameter(query.Get("enable_stream_email_notifications"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	enableStreamPushNotifications, err := parseBoolParameter(query.Get("enable_stream_push_notifications"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	enableStreamAudibleNotifications, err := parseBoolParameter(query.Get("enable_stream_audible_notifications"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	notificationSound := query.Get("notification_sound")
	enableDesktopNotifications, err := parseBoolParameter(query.Get("enable_desktop_notifications"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	enableSounds, err := parseBoolParameter(query.Get("enable_sounds"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	emailNotificationsBatchingPeriodSeconds, err := parseInt32Parameter(query.Get("email_notifications_batching_period_seconds"), false)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
	enableOfflineEmailNotifications, err := parseBoolParameter(query.Get("enable_offline_email_notifications"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	enableOfflinePushNotifications, err := parseBoolParameter(query.Get("enable_offline_push_notifications"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	enableOnlinePushNotifications, err := parseBoolParameter(query.Get("enable_online_push_notifications"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	enableDigestEmails, err := parseBoolParameter(query.Get("enable_digest_emails"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	enableMarketingEmails, err := parseBoolParameter(query.Get("enable_marketing_emails"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	enableLoginEmails, err := parseBoolParameter(query.Get("enable_login_emails"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	messageContentInEmailNotifications, err := parseBoolParameter(query.Get("message_content_in_email_notifications"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	pmContentInDesktopNotifications, err := parseBoolParameter(query.Get("pm_content_in_desktop_notifications"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	wildcardMentionsNotify, err := parseBoolParameter(query.Get("wildcard_mentions_notify"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	desktopIconCountDisplay, err := parseInt32Parameter(query.Get("desktop_icon_count_display"), false)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
	realmNameInNotifications, err := parseBoolParameter(query.Get("realm_name_in_notifications"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	presenceEnabled, err := parseBoolParameter(query.Get("presence_enabled"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	enterSends, err := parseBoolParameter(query.Get("enter_sends"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	result, err := c.service.UpdateSettings(r.Context(), fullName, email, oldPassword, newPassword, twentyFourHourTime, denseMode, starredMessageCounts, fluidLayoutWidth, highContrastMode, colorScheme, enableDraftsSynchronization, translateEmoticons, defaultLanguage, defaultView, leftSideUserlist, emojiset, demoteInactiveStreams, timezone, enableStreamDesktopNotifications, enableStreamEmailNotifications, enableStreamPushNotifications, enableStreamAudibleNotifications, notificationSound, enableDesktopNotifications, enableSounds, emailNotificationsBatchingPeriodSeconds, enableOfflineEmailNotifications, enableOfflinePushNotifications, enableOnlinePushNotifications, enableDigestEmails, enableMarketingEmails, enableLoginEmails, messageContentInEmailNotifications, pmContentInDesktopNotifications, wildcardMentionsNotify, desktopIconCountDisplay, realmNameInNotifications, presenceEnabled, enterSends)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// UpdateStatus - Update your status
func (c *UsersApiController) UpdateStatus(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	statusText := query.Get("status_text")
	away, err := parseBoolParameter(query.Get("away"))
	if err != nil {
		w.WriteHeader(500)
		return
	}
	emojiName := query.Get("emoji_name")
	emojiCode := query.Get("emoji_code")
	reactionType := query.Get("reaction_type")
	result, err := c.service.UpdateStatus(r.Context(), statusText, away, emojiName, emojiCode, reactionType)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// UpdateUser - Update a user
func (c *UsersApiController) UpdateUser(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	userId, err := parseInt32Parameter(params["user_id"], true)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}

	fullName := query.Get("full_name")
	role, err := parseInt32Parameter(query.Get("role"), false)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}
	profileData := strings.Split(query.Get("profile_data"), ",")
	result, err := c.service.UpdateUser(r.Context(), userId, fullName, role, profileData)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// UpdateUserGroup - Update a user group
func (c *UsersApiController) UpdateUserGroup(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	userGroupId, err := parseInt32Parameter(params["user_group_id"], true)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}

	name := query.Get("name")
	description := query.Get("description")
	result, err := c.service.UpdateUserGroup(r.Context(), userGroupId, name, description)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// UpdateUserGroupMembers - Update user group members
func (c *UsersApiController) UpdateUserGroupMembers(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	userGroupId, err := parseInt32Parameter(params["user_group_id"], true)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		return
	}

	delete := strings.Split(query.Get("delete"), ",")
	add := strings.Split(query.Get("add"), ",")
	result, err := c.service.UpdateUserGroupMembers(r.Context(), userGroupId, delete, add)
	// If an error occurred, encode the error with the status code
	if err != nil {
		EncodeJSONResponse(err.Error(), &result.Code, w)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}
