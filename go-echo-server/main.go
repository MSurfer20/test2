package main

import (
	"github.com/GIT_USER_ID/GIT_REPO_ID/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

    //todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())
	

    // DevFetchApiKey - Fetch an API key (development only)
	e.POST("/api/v1/dev_fetch_api_key", c.DevFetchApiKey)

    // FetchApiKey - Fetch an API key (production)
	e.POST("/api/v1/fetch_api_key", c.FetchApiKey)

    // AddReaction - Add an emoji reaction
	e.POST("/api/v1/messages/:message_id/reactions", c.AddReaction)

    // CheckMessagesMatchNarrow - Check if messages match a narrow
	e.GET("/api/v1/messages/matches_narrow", c.CheckMessagesMatchNarrow)

    // DeleteMessage - Delete a message
	e.DELETE("/api/v1/messages/:message_id", c.DeleteMessage)

    // GetFileTemporaryUrl - Get public temporary URL
	e.GET("/api/v1/user_uploads/:realm_id_str/:filename", c.GetFileTemporaryUrl)

    // GetMessageHistory - Get a message's edit history
	e.GET("/api/v1/messages/:message_id/history", c.GetMessageHistory)

    // GetMessages - Get messages
	e.GET("/api/v1/messages", c.GetMessages)

    // GetRawMessage - Get a message's raw Markdown
	e.GET("/api/v1/messages/:message_id", c.GetRawMessage)

    // MarkAllAsRead - Mark all messages as read
	e.POST("/api/v1/mark_all_as_read", c.MarkAllAsRead)

    // MarkStreamAsRead - Mark messages in a stream as read
	e.POST("/api/v1/mark_stream_as_read", c.MarkStreamAsRead)

    // MarkTopicAsRead - Mark messages in a topic as read
	e.POST("/api/v1/mark_topic_as_read", c.MarkTopicAsRead)

    // RemoveReaction - Remove an emoji reaction
	e.DELETE("/api/v1/messages/:message_id/reactions", c.RemoveReaction)

    // RenderMessage - Render message
	e.POST("/api/v1/messages/render", c.RenderMessage)

    // SendMessage - Send a message
	e.POST("/api/v1/messages", c.SendMessage)

    // UpdateMessage - Edit a message
	e.PATCH("/api/v1/messages/:message_id", c.UpdateMessage)

    // UpdateMessageFlags - Update personal message flags
	e.POST("/api/v1/messages/flags", c.UpdateMessageFlags)

    // UploadFile - Upload a file
	e.POST("/api/v1/user_uploads", c.UploadFile)

    // DeleteQueue - Delete an event queue
	e.DELETE("/api/v1/events", c.DeleteQueue)

    // GetEvents - Get events from an event queue
	e.GET("/api/v1/events", c.GetEvents)

    // RealTimePost - 
	e.POST("/api/v1/real-time", c.RealTimePost)

    // RegisterQueue - Register an event queue
	e.POST("/api/v1/register", c.RegisterQueue)

    // RestErrorHandling - Error handling
	e.POST("/api/v1/rest-error-handling", c.RestErrorHandling)

    // AddCodePlayground - Add a code playground
	e.POST("/api/v1/realm/playgrounds", c.AddCodePlayground)

    // AddLinkifier - Add a linkifier
	e.POST("/api/v1/realm/filters", c.AddLinkifier)

    // CreateCustomProfileField - Create a custom profile field
	e.POST("/api/v1/realm/profile_fields", c.CreateCustomProfileField)

    // GetCustomEmoji - Get all custom emoji
	e.GET("/api/v1/realm/emoji", c.GetCustomEmoji)

    // GetCustomProfileFields - Get all custom profile fields
	e.GET("/api/v1/realm/profile_fields", c.GetCustomProfileFields)

    // GetLinkifiers - Get linkifiers
	e.GET("/api/v1/realm/linkifiers", c.GetLinkifiers)

    // GetServerSettings - Get server settings
	e.GET("/api/v1/server_settings", c.GetServerSettings)

    // RemoveCodePlayground - Remove a code playground
	e.DELETE("/api/v1/realm/playgrounds/:playground_id", c.RemoveCodePlayground)

    // RemoveLinkifier - Remove a linkifier
	e.DELETE("/api/v1/realm/filters/:filter_id", c.RemoveLinkifier)

    // ReorderCustomProfileFields - Reorder custom profile fields
	e.PATCH("/api/v1/realm/profile_fields", c.ReorderCustomProfileFields)

    // UpdateLinkifier - Update a linkifier
	e.PATCH("/api/v1/realm/filters/:filter_id", c.UpdateLinkifier)

    // UploadCustomEmoji - Upload custom emoji
	e.POST("/api/v1/realm/emoji/:emoji_name", c.UploadCustomEmoji)

    // ArchiveStream - Archive a stream
	e.DELETE("/api/v1/streams/:stream_id", c.ArchiveStream)

    // CreateBigBlueButtonVideoCall - Create BigBlueButton video call
	e.GET("/api/v1/calls/bigbluebutton/create", c.CreateBigBlueButtonVideoCall)

    // GetStreamId - Get stream ID
	e.GET("/api/v1/get_stream_id", c.GetStreamId)

    // GetStreamTopics - Get topics in a stream
	e.GET("/api/v1/users/me/:stream_id/topics", c.GetStreamTopics)

    // GetStreams - Get all streams
	e.GET("/api/v1/streams", c.GetStreams)

    // GetSubscriptionStatus - Get subscription status
	e.GET("/api/v1/users/:user_id/subscriptions/:stream_id", c.GetSubscriptionStatus)

    // GetSubscriptions - Get subscribed streams
	e.GET("/api/v1/users/me/subscriptions", c.GetSubscriptions)

    // MuteTopic - Topic muting
	e.PATCH("/api/v1/users/me/subscriptions/muted_topics", c.MuteTopic)

    // Subscribe - Subscribe to a stream
	e.POST("/api/v1/users/me/subscriptions", c.Subscribe)

    // Unsubscribe - Unsubscribe from a stream
	e.DELETE("/api/v1/users/me/subscriptions", c.Unsubscribe)

    // UpdateStream - Update a stream
	e.PATCH("/api/v1/streams/:stream_id", c.UpdateStream)

    // UpdateSubscriptionSettings - Update subscription settings
	e.POST("/api/v1/users/me/subscriptions/properties", c.UpdateSubscriptionSettings)

    // UpdateSubscriptions - Update subscriptions
	e.PATCH("/api/v1/users/me/subscriptions", c.UpdateSubscriptions)

    // CreateUser - Create a user
	e.POST("/api/v1/users", c.CreateUser)

    // CreateUserGroup - Create a user group
	e.POST("/api/v1/user_groups/create", c.CreateUserGroup)

    // DeactivateOwnUser - Deactivate own user
	e.DELETE("/api/v1/users/me", c.DeactivateOwnUser)

    // DeactivateUser - Deactivate a user
	e.DELETE("/api/v1/users/:user_id", c.DeactivateUser)

    // GetAttachments - Get attachments
	e.GET("/api/v1/attachments", c.GetAttachments)

    // GetOwnUser - Get own user
	e.GET("/api/v1/users/me", c.GetOwnUser)

    // GetUser - Get a user
	e.GET("/api/v1/users/:user_id", c.GetUser)

    // GetUserByEmail - Get a user by email
	e.GET("/api/v1/users/:email", c.GetUserByEmail)

    // GetUserGroups - Get user groups
	e.GET("/api/v1/user_groups", c.GetUserGroups)

    // GetUserPresence - Get user presence
	e.GET("/api/v1/users/:user_id_or_email/presence", c.GetUserPresence)

    // GetUsers - Get all users
	e.GET("/api/v1/users", c.GetUsers)

    // MuteUser - Mute a user
	e.POST("/api/v1/users/me/muted_users/:muted_user_id", c.MuteUser)

    // ReactivateUser - Reactivate a user
	e.POST("/api/v1/users/:user_id/reactivate", c.ReactivateUser)

    // RemoveUserGroup - Delete a user group
	e.DELETE("/api/v1/user_groups/:user_group_id", c.RemoveUserGroup)

    // SetTypingStatus - Set \"typing\" status
	e.POST("/api/v1/typing", c.SetTypingStatus)

    // UnmuteUser - Unmute a user
	e.DELETE("/api/v1/users/me/muted_users/:muted_user_id", c.UnmuteUser)

    // UpdateDisplaySettings - Update display settings
	e.PATCH("/api/v1/settings/display", c.UpdateDisplaySettings)

    // UpdateNotificationSettings - Update notification settings
	e.PATCH("/api/v1/settings/notifications", c.UpdateNotificationSettings)

    // UpdateUser - Update a user
	e.PATCH("/api/v1/users/:user_id", c.UpdateUser)

    // UpdateUserGroup - Update a user group
	e.PATCH("/api/v1/user_groups/:user_group_id", c.UpdateUserGroup)

    // UpdateUserGroupMembers - Update user group members
	e.POST("/api/v1/user_groups/:user_group_id/members", c.UpdateUserGroupMembers)

    // ZulipOutgoingWebhooks - Outgoing webhooks
	e.POST("/api/v1/zulip-outgoing-webhook", c.ZulipOutgoingWebhooks)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}