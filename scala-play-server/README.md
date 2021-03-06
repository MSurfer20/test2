# Zulip REST API

Powerful open source group chat 


## API

### Authentication

|Name|Role|
|----|----|
|`api.AuthenticationController`|Play Framework API controller|
|`api.AuthenticationApi`|Representing trait|
|`api.AuthenticationApiImpl`|Default implementation|

* `POST /api/v1/dev_fetch_api_key?username=[value]` - Fetch an API key (development only)
* `POST /api/v1/fetch_api_key?username=[value]&password=[value]` - Fetch an API key (production)

### Drafts

|Name|Role|
|----|----|
|`api.DraftsController`|Play Framework API controller|
|`api.DraftsApi`|Representing trait|
|`api.DraftsApiImpl`|Default implementation|

* `POST /api/v1/drafts?drafts=[value]` - Create drafts
* `DELETE /api/v1/drafts/:draftId` - Delete a draft
* `PATCH /api/v1/drafts/:draftId?draft=[value]` - Edit a draft
* `GET /api/v1/drafts` - Get drafts

### Messages

|Name|Role|
|----|----|
|`api.MessagesController`|Play Framework API controller|
|`api.MessagesApi`|Representing trait|
|`api.MessagesApiImpl`|Default implementation|

* `POST /api/v1/messages/:messageId/reactions?emojiName=[value]&emojiCode=[value]&reactionType=[value]` - Add an emoji reaction
* `GET /api/v1/messages/matches_narrow?msgIds=[value]&narrow=[value]` - Check if messages match a narrow
* `DELETE /api/v1/messages/:messageId` - Delete a message
* `GET /api/v1/user_uploads/:realmIdStr/:filename` - Get public temporary URL
* `GET /api/v1/messages/:messageId/history` - Get a message&#39;s edit history
* `GET /api/v1/messages?anchor=[value]&numBefore=[value]&numAfter=[value]&narrow=[value]&clientGravatar=[value]&applyMarkdown=[value]&useFirstUnreadAnchor=[value]` - Get messages
* `GET /api/v1/messages/:messageId` - Get a message&#39;s raw Markdown
* `POST /api/v1/mark_all_as_read` - Mark all messages as read
* `POST /api/v1/mark_stream_as_read?streamId=[value]` - Mark messages in a stream as read
* `POST /api/v1/mark_topic_as_read?streamId=[value]&topicName=[value]` - Mark messages in a topic as read
* `DELETE /api/v1/messages/:messageId/reactions?emojiName=[value]&emojiCode=[value]&reactionType=[value]` - Remove an emoji reaction
* `POST /api/v1/messages/render?content=[value]` - Render message
* `POST /api/v1/messages?`type`=[value]&to=[value]&content=[value]&topic=[value]&queueId=[value]&localId=[value]` - Send a message
* `PATCH /api/v1/messages/:messageId?topic=[value]&propagateMode=[value]&sendNotificationToOldThread=[value]&sendNotificationToNewThread=[value]&content=[value]&streamId=[value]` - Edit a message
* `POST /api/v1/messages/flags?messages=[value]&op=[value]&flag=[value]` - Update personal message flags
* `POST /api/v1/user_uploads` - Upload a file

### RealTimeEvents

|Name|Role|
|----|----|
|`api.RealTimeEventsController`|Play Framework API controller|
|`api.RealTimeEventsApi`|Representing trait|
|`api.RealTimeEventsApiImpl`|Default implementation|

* `DELETE /api/v1/events?queueId=[value]` - Delete an event queue
* `GET /api/v1/events?queueId=[value]&lastEventId=[value]&dontBlock=[value]` - Get events from an event queue
* `POST /api/v1/real-time?eventTypes=[value]&narrow=[value]&allPublicStreams=[value]` - 
* `POST /api/v1/register?applyMarkdown=[value]&clientGravatar=[value]&slimPresence=[value]&eventTypes=[value]&allPublicStreams=[value]&includeSubscribers=[value]&clientCapabilities=[value]&fetchEventTypes=[value]&narrow=[value]` - Register an event queue
* `POST /api/v1/rest-error-handling` - Error handling

### ServerAndOrganizations

|Name|Role|
|----|----|
|`api.ServerAndOrganizationsController`|Play Framework API controller|
|`api.ServerAndOrganizationsApi`|Representing trait|
|`api.ServerAndOrganizationsApiImpl`|Default implementation|

* `POST /api/v1/realm/playgrounds?name=[value]&pygmentsLanguage=[value]&urlPrefix=[value]` - Add a code playground
* `POST /api/v1/realm/filters?pattern=[value]&urlFormatString=[value]` - Add a linkifier
* `POST /api/v1/realm/profile_fields?name=[value]&hint=[value]&fieldType=[value]&fieldData=[value]` - Create a custom profile field
* `GET /api/v1/realm/emoji` - Get all custom emoji
* `GET /api/v1/realm/profile_fields` - Get all custom profile fields
* `GET /api/v1/realm/linkifiers` - Get linkifiers
* `GET /api/v1/server_settings` - Get server settings
* `DELETE /api/v1/realm/playgrounds/:playgroundId` - Remove a code playground
* `DELETE /api/v1/realm/filters/:filterId` - Remove a linkifier
* `PATCH /api/v1/realm/profile_fields?order=[value]` - Reorder custom profile fields
* `PATCH /api/v1/realm/filters/:filterId?pattern=[value]&urlFormatString=[value]` - Update a linkifier
* `POST /api/v1/realm/emoji/:emojiName` - Upload custom emoji

### Streams

|Name|Role|
|----|----|
|`api.StreamsController`|Play Framework API controller|
|`api.StreamsApi`|Representing trait|
|`api.StreamsApiImpl`|Default implementation|

* `DELETE /api/v1/streams/:streamId` - Archive a stream
* `GET /api/v1/calls/bigbluebutton/create` - Create BigBlueButton video call
* `POST /api/v1/streams/:streamId/delete_topic?topicName=[value]` - Delete a topic
* `GET /api/v1/get_stream_id?stream=[value]` - Get stream ID
* `GET /api/v1/users/me/:streamId/topics` - Get topics in a stream
* `GET /api/v1/streams?includePublic=[value]&includeWebPublic=[value]&includeSubscribed=[value]&includeAllActive=[value]&includeDefault=[value]&includeOwnerSubscribed=[value]` - Get all streams
* `GET /api/v1/streams/:streamId/members` - Get the subscribers of a stream
* `GET /api/v1/users/:userId/subscriptions/:streamId` - Get subscription status
* `GET /api/v1/users/me/subscriptions?includeSubscribers=[value]` - Get subscribed streams
* `PATCH /api/v1/users/me/subscriptions/muted_topics?stream=[value]&streamId=[value]&topic=[value]&op=[value]` - Topic muting
* `POST /api/v1/users/me/subscriptions?subscriptions=[value]&principals=[value]&authorizationErrorsFatal=[value]&announce=[value]&inviteOnly=[value]&historyPublicToSubscribers=[value]&streamPostPolicy=[value]&messageRetentionDays=[value]` - Subscribe to a stream
* `DELETE /api/v1/users/me/subscriptions?subscriptions=[value]&principals=[value]` - Unsubscribe from a stream
* `PATCH /api/v1/streams/:streamId?description=[value]&newName=[value]&isPrivate=[value]&isAnnouncementOnly=[value]&streamPostPolicy=[value]&historyPublicToSubscribers=[value]&messageRetentionDays=[value]` - Update a stream
* `POST /api/v1/users/me/subscriptions/properties?subscriptionData=[value]` - Update subscription settings
* `PATCH /api/v1/users/me/subscriptions?delete=[value]&add=[value]` - Update subscriptions

### Users

|Name|Role|
|----|----|
|`api.UsersController`|Play Framework API controller|
|`api.UsersApi`|Representing trait|
|`api.UsersApiImpl`|Default implementation|

* `POST /api/v1/users?email=[value]&password=[value]&fullName=[value]` - Create a user
* `POST /api/v1/user_groups/create?name=[value]&description=[value]&members=[value]` - Create a user group
* `DELETE /api/v1/users/me` - Deactivate own user
* `DELETE /api/v1/users/:userId` - Deactivate a user
* `GET /api/v1/attachments` - Get attachments
* `GET /api/v1/users/me` - Get own user
* `GET /api/v1/users/:userId?clientGravatar=[value]&includeCustomProfileFields=[value]` - Get a user
* `GET /api/v1/users/:email?clientGravatar=[value]&includeCustomProfileFields=[value]` - Get a user by email
* `GET /api/v1/user_groups` - Get user groups
* `GET /api/v1/users/:userIdOrEmail/presence` - Get user presence
* `GET /api/v1/users?clientGravatar=[value]&includeCustomProfileFields=[value]` - Get all users
* `POST /api/v1/users/me/muted_users/:mutedUserId` - Mute a user
* `POST /api/v1/users/:userId/reactivate` - Reactivate a user
* `DELETE /api/v1/user_groups/:userGroupId` - Delete a user group
* `POST /api/v1/typing?`type`=[value]&op=[value]&to=[value]&topic=[value]` - Set \&quot;typing\&quot; status
* `DELETE /api/v1/users/me/muted_users/:mutedUserId` - Unmute a user
* `PATCH /api/v1/settings?fullName=[value]&email=[value]&oldPassword=[value]&newPassword=[value]&twentyFourHourTime=[value]&denseMode=[value]&starredMessageCounts=[value]&fluidLayoutWidth=[value]&highContrastMode=[value]&colorScheme=[value]&enableDraftsSynchronization=[value]&translateEmoticons=[value]&defaultLanguage=[value]&defaultView=[value]&leftSideUserlist=[value]&emojiset=[value]&demoteInactiveStreams=[value]&timezone=[value]&enableStreamDesktopNotifications=[value]&enableStreamEmailNotifications=[value]&enableStreamPushNotifications=[value]&enableStreamAudibleNotifications=[value]&notificationSound=[value]&enableDesktopNotifications=[value]&enableSounds=[value]&emailNotificationsBatchingPeriodSeconds=[value]&enableOfflineEmailNotifications=[value]&enableOfflinePushNotifications=[value]&enableOnlinePushNotifications=[value]&enableDigestEmails=[value]&enableMarketingEmails=[value]&enableLoginEmails=[value]&messageContentInEmailNotifications=[value]&pmContentInDesktopNotifications=[value]&wildcardMentionsNotify=[value]&desktopIconCountDisplay=[value]&realmNameInNotifications=[value]&presenceEnabled=[value]&enterSends=[value]` - Update settings
* `POST /api/v1/users/me/status?statusText=[value]&away=[value]&emojiName=[value]&emojiCode=[value]&reactionType=[value]` - Update your status
* `PATCH /api/v1/users/:userId?fullName=[value]&role=[value]&profileData=[value]` - Update a user
* `PATCH /api/v1/user_groups/:userGroupId?name=[value]&description=[value]` - Update a user group
* `POST /api/v1/user_groups/:userGroupId/members?delete=[value]&add=[value]` - Update user group members

### Webhooks

|Name|Role|
|----|----|
|`api.WebhooksController`|Play Framework API controller|
|`api.WebhooksApi`|Representing trait|
|`api.WebhooksApiImpl`|Default implementation|

* `POST /api/v1/zulip-outgoing-webhook` - Outgoing webhooks

