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
	"net/http"

	"github.com/gin-gonic/gin"
)

// Route is the information for every URI.
type Route struct {
	// Name is the name of this Route.
	Name        string
	// Method is the string for the HTTP method. ex) GET, POST etc..
	Method      string
	// Pattern is the pattern of the URI.
	Pattern     string
	// HandlerFunc is the handler function of this route.
	HandlerFunc gin.HandlerFunc
}

// Routes is the list of the generated Route.
type Routes []Route

// NewRouter returns a new router.
func NewRouter() *gin.Engine {
	router := gin.Default()
	for _, route := range routes {
		switch route.Method {
		case http.MethodGet:
			router.GET(route.Pattern, route.HandlerFunc)
		case http.MethodPost:
			router.POST(route.Pattern, route.HandlerFunc)
		case http.MethodPut:
			router.PUT(route.Pattern, route.HandlerFunc)
		case http.MethodPatch:
			router.PATCH(route.Pattern, route.HandlerFunc)
		case http.MethodDelete:
			router.DELETE(route.Pattern, route.HandlerFunc)
		}
	}

	return router
}

// Index is the index handler.
func Index(c *gin.Context) {
	c.String(http.StatusOK, "Hello World!")
}

var routes = Routes{
	{
		"Index",
		http.MethodGet,
		"/api/v1/",
		Index,
	},

	{
		"DevFetchApiKey",
		http.MethodPost,
		"/api/v1/dev_fetch_api_key",
		DevFetchApiKey,
	},

	{
		"FetchApiKey",
		http.MethodPost,
		"/api/v1/fetch_api_key",
		FetchApiKey,
	},

	{
		"CreateDrafts",
		http.MethodPost,
		"/api/v1/drafts",
		CreateDrafts,
	},

	{
		"DeleteDraft",
		http.MethodDelete,
		"/api/v1/drafts/:draft_id",
		DeleteDraft,
	},

	{
		"EditDraft",
		http.MethodPatch,
		"/api/v1/drafts/:draft_id",
		EditDraft,
	},

	{
		"GetDrafts",
		http.MethodGet,
		"/api/v1/drafts",
		GetDrafts,
	},

	{
		"AddReaction",
		http.MethodPost,
		"/api/v1/messages/:message_id/reactions",
		AddReaction,
	},

	{
		"CheckMessagesMatchNarrow",
		http.MethodGet,
		"/api/v1/messages/matches_narrow",
		CheckMessagesMatchNarrow,
	},

	{
		"DeleteMessage",
		http.MethodDelete,
		"/api/v1/messages/:message_id",
		DeleteMessage,
	},

	{
		"GetFileTemporaryUrl",
		http.MethodGet,
		"/api/v1/user_uploads/:realm_id_str/:filename",
		GetFileTemporaryUrl,
	},

	{
		"GetMessageHistory",
		http.MethodGet,
		"/api/v1/messages/:message_id/history",
		GetMessageHistory,
	},

	{
		"GetMessages",
		http.MethodGet,
		"/api/v1/messages",
		GetMessages,
	},

	{
		"GetRawMessage",
		http.MethodGet,
		"/api/v1/messages/:message_id",
		GetRawMessage,
	},

	{
		"MarkAllAsRead",
		http.MethodPost,
		"/api/v1/mark_all_as_read",
		MarkAllAsRead,
	},

	{
		"MarkStreamAsRead",
		http.MethodPost,
		"/api/v1/mark_stream_as_read",
		MarkStreamAsRead,
	},

	{
		"MarkTopicAsRead",
		http.MethodPost,
		"/api/v1/mark_topic_as_read",
		MarkTopicAsRead,
	},

	{
		"RemoveReaction",
		http.MethodDelete,
		"/api/v1/messages/:message_id/reactions",
		RemoveReaction,
	},

	{
		"RenderMessage",
		http.MethodPost,
		"/api/v1/messages/render",
		RenderMessage,
	},

	{
		"SendMessage",
		http.MethodPost,
		"/api/v1/messages",
		SendMessage,
	},

	{
		"UpdateMessage",
		http.MethodPatch,
		"/api/v1/messages/:message_id",
		UpdateMessage,
	},

	{
		"UpdateMessageFlags",
		http.MethodPost,
		"/api/v1/messages/flags",
		UpdateMessageFlags,
	},

	{
		"UploadFile",
		http.MethodPost,
		"/api/v1/user_uploads",
		UploadFile,
	},

	{
		"DeleteQueue",
		http.MethodDelete,
		"/api/v1/events",
		DeleteQueue,
	},

	{
		"GetEvents",
		http.MethodGet,
		"/api/v1/events",
		GetEvents,
	},

	{
		"RealTimePost",
		http.MethodPost,
		"/api/v1/real-time",
		RealTimePost,
	},

	{
		"RegisterQueue",
		http.MethodPost,
		"/api/v1/register",
		RegisterQueue,
	},

	{
		"RestErrorHandling",
		http.MethodPost,
		"/api/v1/rest-error-handling",
		RestErrorHandling,
	},

	{
		"AddCodePlayground",
		http.MethodPost,
		"/api/v1/realm/playgrounds",
		AddCodePlayground,
	},

	{
		"AddLinkifier",
		http.MethodPost,
		"/api/v1/realm/filters",
		AddLinkifier,
	},

	{
		"CreateCustomProfileField",
		http.MethodPost,
		"/api/v1/realm/profile_fields",
		CreateCustomProfileField,
	},

	{
		"GetCustomEmoji",
		http.MethodGet,
		"/api/v1/realm/emoji",
		GetCustomEmoji,
	},

	{
		"GetCustomProfileFields",
		http.MethodGet,
		"/api/v1/realm/profile_fields",
		GetCustomProfileFields,
	},

	{
		"GetLinkifiers",
		http.MethodGet,
		"/api/v1/realm/linkifiers",
		GetLinkifiers,
	},

	{
		"GetServerSettings",
		http.MethodGet,
		"/api/v1/server_settings",
		GetServerSettings,
	},

	{
		"RemoveCodePlayground",
		http.MethodDelete,
		"/api/v1/realm/playgrounds/:playground_id",
		RemoveCodePlayground,
	},

	{
		"RemoveLinkifier",
		http.MethodDelete,
		"/api/v1/realm/filters/:filter_id",
		RemoveLinkifier,
	},

	{
		"ReorderCustomProfileFields",
		http.MethodPatch,
		"/api/v1/realm/profile_fields",
		ReorderCustomProfileFields,
	},

	{
		"UpdateLinkifier",
		http.MethodPatch,
		"/api/v1/realm/filters/:filter_id",
		UpdateLinkifier,
	},

	{
		"UploadCustomEmoji",
		http.MethodPost,
		"/api/v1/realm/emoji/:emoji_name",
		UploadCustomEmoji,
	},

	{
		"ArchiveStream",
		http.MethodDelete,
		"/api/v1/streams/:stream_id",
		ArchiveStream,
	},

	{
		"CreateBigBlueButtonVideoCall",
		http.MethodGet,
		"/api/v1/calls/bigbluebutton/create",
		CreateBigBlueButtonVideoCall,
	},

	{
		"DeleteTopic",
		http.MethodPost,
		"/api/v1/streams/:stream_id/delete_topic",
		DeleteTopic,
	},

	{
		"GetStreamId",
		http.MethodGet,
		"/api/v1/get_stream_id",
		GetStreamId,
	},

	{
		"GetStreamTopics",
		http.MethodGet,
		"/api/v1/users/me/:stream_id/topics",
		GetStreamTopics,
	},

	{
		"GetStreams",
		http.MethodGet,
		"/api/v1/streams",
		GetStreams,
	},

	{
		"GetSubscribers",
		http.MethodGet,
		"/api/v1/streams/:stream_id/members",
		GetSubscribers,
	},

	{
		"GetSubscriptionStatus",
		http.MethodGet,
		"/api/v1/users/:user_id/subscriptions/:stream_id",
		GetSubscriptionStatus,
	},

	{
		"GetSubscriptions",
		http.MethodGet,
		"/api/v1/users/me/subscriptions",
		GetSubscriptions,
	},

	{
		"MuteTopic",
		http.MethodPatch,
		"/api/v1/users/me/subscriptions/muted_topics",
		MuteTopic,
	},

	{
		"Subscribe",
		http.MethodPost,
		"/api/v1/users/me/subscriptions",
		Subscribe,
	},

	{
		"Unsubscribe",
		http.MethodDelete,
		"/api/v1/users/me/subscriptions",
		Unsubscribe,
	},

	{
		"UpdateStream",
		http.MethodPatch,
		"/api/v1/streams/:stream_id",
		UpdateStream,
	},

	{
		"UpdateSubscriptionSettings",
		http.MethodPost,
		"/api/v1/users/me/subscriptions/properties",
		UpdateSubscriptionSettings,
	},

	{
		"UpdateSubscriptions",
		http.MethodPatch,
		"/api/v1/users/me/subscriptions",
		UpdateSubscriptions,
	},

	{
		"CreateUser",
		http.MethodPost,
		"/api/v1/users",
		CreateUser,
	},

	{
		"CreateUserGroup",
		http.MethodPost,
		"/api/v1/user_groups/create",
		CreateUserGroup,
	},

	{
		"DeactivateOwnUser",
		http.MethodDelete,
		"/api/v1/users/me",
		DeactivateOwnUser,
	},

	{
		"DeactivateUser",
		http.MethodDelete,
		"/api/v1/users/:user_id",
		DeactivateUser,
	},

	{
		"GetAttachments",
		http.MethodGet,
		"/api/v1/attachments",
		GetAttachments,
	},

	{
		"GetOwnUser",
		http.MethodGet,
		"/api/v1/users/me",
		GetOwnUser,
	},

	{
		"GetUser",
		http.MethodGet,
		"/api/v1/users/:user_id",
		GetUser,
	},

	{
		"GetUserByEmail",
		http.MethodGet,
		"/api/v1/users/:email",
		GetUserByEmail,
	},

	{
		"GetUserGroups",
		http.MethodGet,
		"/api/v1/user_groups",
		GetUserGroups,
	},

	{
		"GetUserPresence",
		http.MethodGet,
		"/api/v1/users/:user_id_or_email/presence",
		GetUserPresence,
	},

	{
		"GetUsers",
		http.MethodGet,
		"/api/v1/users",
		GetUsers,
	},

	{
		"MuteUser",
		http.MethodPost,
		"/api/v1/users/me/muted_users/:muted_user_id",
		MuteUser,
	},

	{
		"ReactivateUser",
		http.MethodPost,
		"/api/v1/users/:user_id/reactivate",
		ReactivateUser,
	},

	{
		"RemoveUserGroup",
		http.MethodDelete,
		"/api/v1/user_groups/:user_group_id",
		RemoveUserGroup,
	},

	{
		"SetTypingStatus",
		http.MethodPost,
		"/api/v1/typing",
		SetTypingStatus,
	},

	{
		"UnmuteUser",
		http.MethodDelete,
		"/api/v1/users/me/muted_users/:muted_user_id",
		UnmuteUser,
	},

	{
		"UpdateSettings",
		http.MethodPatch,
		"/api/v1/settings",
		UpdateSettings,
	},

	{
		"UpdateStatus",
		http.MethodPost,
		"/api/v1/users/me/status",
		UpdateStatus,
	},

	{
		"UpdateUser",
		http.MethodPatch,
		"/api/v1/users/:user_id",
		UpdateUser,
	},

	{
		"UpdateUserGroup",
		http.MethodPatch,
		"/api/v1/user_groups/:user_group_id",
		UpdateUserGroup,
	},

	{
		"UpdateUserGroupMembers",
		http.MethodPost,
		"/api/v1/user_groups/:user_group_id/members",
		UpdateUserGroupMembers,
	},

	{
		"ZulipOutgoingWebhooks",
		http.MethodPost,
		"/api/v1/zulip-outgoing-webhook",
		ZulipOutgoingWebhooks,
	},
}
